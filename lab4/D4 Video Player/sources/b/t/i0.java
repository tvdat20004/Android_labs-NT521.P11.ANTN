package b.t;

/* loaded from: classes.dex */
public class i0 extends c0 {

    /* renamed from: a, reason: collision with root package name */
    public j0 f1743a;

    public i0(j0 j0Var) {
        this.f1743a = j0Var;
    }

    @Override // b.t.c0, b.t.a0
    public void c(b0 b0Var) {
        j0 j0Var = this.f1743a;
        if (j0Var.B) {
            return;
        }
        j0Var.F();
        this.f1743a.B = true;
    }

    @Override // b.t.a0
    public void e(b0 b0Var) {
        j0 j0Var = this.f1743a;
        int i = j0Var.A - 1;
        j0Var.A = i;
        if (i == 0) {
            j0Var.B = false;
            j0Var.m();
        }
        b0Var.v(this);
    }
}
