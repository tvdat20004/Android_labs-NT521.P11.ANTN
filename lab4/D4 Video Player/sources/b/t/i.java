package b.t;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public class i extends c0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1741a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1742b;

    public i(k kVar, ViewGroup viewGroup) {
        this.f1742b = viewGroup;
    }

    @Override // b.t.c0, b.t.a0
    public void a(b0 b0Var) {
        n0.a(this.f1742b, false);
    }

    @Override // b.t.c0, b.t.a0
    public void b(b0 b0Var) {
        n0.a(this.f1742b, true);
    }

    @Override // b.t.c0, b.t.a0
    public void d(b0 b0Var) {
        n0.a(this.f1742b, false);
        this.f1741a = true;
    }

    @Override // b.t.a0
    public void e(b0 b0Var) {
        if (!this.f1741a) {
            n0.a(this.f1742b, false);
        }
        b0Var.v(this);
    }
}
