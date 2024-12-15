package b.b.h.m;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public class c0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f573b;

    public c0(e0 e0Var) {
        this.f573b = e0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.f573b.b()) {
            e0 e0Var = this.f573b;
            if (e0Var.j.z) {
                return;
            }
            View view = e0Var.o;
            if (view == null || !view.isShown()) {
                this.f573b.dismiss();
            } else {
                this.f573b.j.f();
            }
        }
    }
}
