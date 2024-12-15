package c.c.a.a.u1;

import android.net.Uri;
import c.c.a.a.y1.n;
import c.c.a.a.y1.x0;

/* loaded from: classes.dex */
public final class f0 extends l {
    public final Uri g;
    public final n.a h;
    public final c.c.a.a.q1.o i;
    public final c.c.a.a.y1.z j;
    public final int l;
    public boolean o;
    public x0 p;
    public final String k = null;
    public long n = -9223372036854775807L;
    public final Object m = null;

    public f0(Uri uri, n.a aVar, c.c.a.a.q1.o oVar, c.c.a.a.y1.z zVar, String str, int i, Object obj) {
        this.g = uri;
        this.h = aVar;
        this.i = oVar;
        this.j = zVar;
        this.l = i;
    }

    @Override // c.c.a.a.u1.l
    public v b(w wVar, c.c.a.a.y1.r rVar, long j) {
        c.c.a.a.y1.n a2 = this.h.a();
        x0 x0Var = this.p;
        if (x0Var != null) {
            a2.b(x0Var);
        }
        return new b0(this.g, a2, this.i.a(), this.j, a(wVar), this, rVar, this.k, this.l);
    }

    @Override // c.c.a.a.u1.l
    public void c() {
    }

    @Override // c.c.a.a.u1.l
    public void d(x0 x0Var) {
        this.p = x0Var;
        j(this.n, this.o);
    }

    @Override // c.c.a.a.u1.l
    public void f(v vVar) {
        b0 b0Var = (b0) vVar;
        if (b0Var.v) {
            for (k0 k0Var : b0Var.s) {
                k0Var.j();
            }
        }
        b0Var.j.f(b0Var);
        b0Var.o.removeCallbacksAndMessages(null);
        b0Var.p = null;
        b0Var.K = true;
        b0Var.f2833e.l();
    }

    @Override // c.c.a.a.u1.l
    public void g() {
    }

    public final void j(long j, boolean z) {
        this.n = j;
        this.o = z;
        long j2 = this.n;
        e(new o0(j2, j2, 0L, 0L, this.o, false, this.m), null);
    }

    public void k(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.n;
        }
        if (this.n == j && this.o == z) {
            return;
        }
        j(j, z);
    }
}
