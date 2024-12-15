package b.h.j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final View f1299b;

    /* renamed from: c, reason: collision with root package name */
    public ViewTreeObserver f1300c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f1301d;

    public l(View view, Runnable runnable) {
        this.f1299b = view;
        this.f1300c = view.getViewTreeObserver();
        this.f1301d = runnable;
    }

    public static l a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        l lVar = new l(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(lVar);
        view.addOnAttachStateChangeListener(lVar);
        return lVar;
    }

    public void b() {
        (this.f1300c.isAlive() ? this.f1300c : this.f1299b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f1299b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f1301d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f1300c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
