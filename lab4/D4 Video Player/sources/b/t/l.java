package b.t;

import android.view.View;

/* loaded from: classes.dex */
public class l extends c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f1753a;

    public l(n nVar, View view) {
        this.f1753a = view;
    }

    @Override // b.t.a0
    public void e(b0 b0Var) {
        View view = this.f1753a;
        w0 w0Var = q0.f1772a;
        w0Var.e(view, 1.0f);
        w0Var.a(this.f1753a);
        b0Var.v(this);
    }
}
