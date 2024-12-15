package b.r.b;

import android.view.View;

/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f1699a;

    /* renamed from: b, reason: collision with root package name */
    public t0 f1700b = new t0();

    public v0(u0 u0Var) {
        this.f1699a = u0Var;
    }

    public View a(int i, int i2, int i3, int i4) {
        int c2 = this.f1699a.c();
        int b2 = this.f1699a.b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f1699a.a(i);
            int e2 = this.f1699a.e(a2);
            int d2 = this.f1699a.d(a2);
            t0 t0Var = this.f1700b;
            t0Var.f1681b = c2;
            t0Var.f1682c = b2;
            t0Var.f1683d = e2;
            t0Var.f1684e = d2;
            if (i3 != 0) {
                t0Var.f1680a = 0;
                t0Var.f1680a = i3 | 0;
                if (t0Var.a()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                t0 t0Var2 = this.f1700b;
                t0Var2.f1680a = 0;
                t0Var2.f1680a = i4 | 0;
                if (t0Var2.a()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean b(View view, int i) {
        t0 t0Var = this.f1700b;
        int c2 = this.f1699a.c();
        int b2 = this.f1699a.b();
        int e2 = this.f1699a.e(view);
        int d2 = this.f1699a.d(view);
        t0Var.f1681b = c2;
        t0Var.f1682c = b2;
        t0Var.f1683d = e2;
        t0Var.f1684e = d2;
        if (i == 0) {
            return false;
        }
        t0 t0Var2 = this.f1700b;
        t0Var2.f1680a = 0;
        t0Var2.f1680a = 0 | i;
        return t0Var2.a();
    }
}
