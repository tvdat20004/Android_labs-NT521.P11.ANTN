package b.b.h.m;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public class d implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f574b;

    public d(h hVar) {
        this.f574b = hVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f574b.z;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f574b.z = view.getViewTreeObserver();
            }
            h hVar = this.f574b;
            hVar.z.removeGlobalOnLayoutListener(hVar.k);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
