package c.c.a.a.u1.v0;

import c.c.a.a.l0;
import c.c.a.a.q1.y;
import c.c.a.a.y1.q;
import c.c.a.a.y1.v0;
import java.io.IOException;

/* loaded from: classes.dex */
public final class p extends a {
    public final int n;
    public final l0 o;
    public long p;
    public boolean q;

    public p(c.c.a.a.y1.n nVar, q qVar, l0 l0Var, int i, Object obj, long j, long j2, long j3, int i2, l0 l0Var2) {
        super(nVar, qVar, l0Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.n = i2;
        this.o = l0Var2;
    }

    @Override // c.c.a.a.y1.l0
    public void a() {
        try {
            long a2 = this.h.a(this.f2942a.c(this.p));
            if (a2 != -1) {
                a2 += this.p;
            }
            c.c.a.a.q1.j jVar = new c.c.a.a.q1.j(this.h, this.p, a2);
            c cVar = this.l;
            cVar.a(0L);
            y b2 = cVar.b(this.n);
            b2.b(this.o);
            for (int i = 0; i != -1; i = b2.c(jVar, Integer.MAX_VALUE, true)) {
                this.p += i;
            }
            b2.d(this.f2947f, 1, (int) this.p, 0, null);
            if (r0 != null) {
                try {
                    this.h.f3689a.close();
                } catch (IOException unused) {
                }
            }
            this.q = true;
        } finally {
            v0 v0Var = this.h;
            int i2 = c.c.a.a.z1.l0.f3761a;
            if (v0Var != null) {
                try {
                    v0Var.f3689a.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    @Override // c.c.a.a.y1.l0
    public void b() {
    }

    @Override // c.c.a.a.u1.v0.m
    public boolean d() {
        return this.q;
    }
}
