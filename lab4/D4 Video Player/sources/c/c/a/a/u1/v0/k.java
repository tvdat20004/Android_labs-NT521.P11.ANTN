package c.c.a.a.u1.v0;

import c.c.a.a.l0;
import c.c.a.a.q1.s;
import c.c.a.a.y1.q;
import c.c.a.a.y1.v0;
import java.io.IOException;

/* loaded from: classes.dex */
public class k extends a {
    public static final s t = new s();
    public final int n;
    public final long o;
    public final f p;
    public long q;
    public volatile boolean r;
    public boolean s;

    public k(c.c.a.a.y1.n nVar, q qVar, l0 l0Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, f fVar) {
        super(nVar, qVar, l0Var, i, obj, j, j2, j3, j4, j5);
        this.n = i2;
        this.o = j6;
        this.p = fVar;
    }

    @Override // c.c.a.a.y1.l0
    public final void a() {
        q c2 = this.f2942a.c(this.q);
        try {
            v0 v0Var = this.h;
            c.c.a.a.q1.j jVar = new c.c.a.a.q1.j(v0Var, c2.f3654d, v0Var.a(c2));
            if (this.q == 0) {
                c cVar = this.l;
                cVar.a(this.o);
                f fVar = this.p;
                long j = this.j;
                long j2 = -9223372036854775807L;
                long j3 = j == -9223372036854775807L ? -9223372036854775807L : j - this.o;
                long j4 = this.k;
                if (j4 != -9223372036854775807L) {
                    j2 = j4 - this.o;
                }
                fVar.b(cVar, j3, j2);
            }
            try {
                c.c.a.a.q1.m mVar = this.p.f2954b;
                int i = 0;
                while (i == 0 && !this.r) {
                    i = mVar.d(jVar, t);
                }
                c.c.a.a.x1.p.g(i != 1);
                if (r1 != null) {
                    try {
                        this.h.f3689a.close();
                    } catch (IOException unused) {
                    }
                }
                this.s = true;
            } finally {
                this.q = jVar.f2650d - this.f2942a.f3654d;
            }
        } finally {
            v0 v0Var2 = this.h;
            int i2 = c.c.a.a.z1.l0.f3761a;
            if (v0Var2 != null) {
                try {
                    v0Var2.f3689a.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    @Override // c.c.a.a.y1.l0
    public final void b() {
        this.r = true;
    }

    @Override // c.c.a.a.u1.v0.m
    public long c() {
        return this.i + this.n;
    }

    @Override // c.c.a.a.u1.v0.m
    public boolean d() {
        return this.s;
    }
}
