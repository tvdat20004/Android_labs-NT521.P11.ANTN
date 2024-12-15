package b.b.h.m;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public class d0 implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f575b;

    public d0(e0 e0Var) {
        this.f575b = e0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f575b.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f575b.q = view.getViewTreeObserver();
            }
            e0 e0Var = this.f575b;
            e0Var.q.removeGlobalOnLayoutListener(e0Var.k);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
