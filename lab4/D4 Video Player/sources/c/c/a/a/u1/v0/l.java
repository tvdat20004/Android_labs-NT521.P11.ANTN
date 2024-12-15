package c.c.a.a.u1.v0;

import c.c.a.a.l0;
import c.c.a.a.q1.s;
import c.c.a.a.y1.q;
import c.c.a.a.y1.v0;
import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends d {
    public static final s l = new s();
    public final f i;
    public long j;
    public volatile boolean k;

    public l(c.c.a.a.y1.n nVar, q qVar, l0 l0Var, int i, Object obj, f fVar) {
        super(nVar, qVar, 2, l0Var, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.i = fVar;
    }

    @Override // c.c.a.a.y1.l0
    public void a() {
        q c2 = this.f2942a.c(this.j);
        try {
            v0 v0Var = this.h;
            c.c.a.a.q1.j jVar = new c.c.a.a.q1.j(v0Var, c2.f3654d, v0Var.a(c2));
            if (this.j == 0) {
                this.i.b(null, -9223372036854775807L, -9223372036854775807L);
            }
            try {
                c.c.a.a.q1.m mVar = this.i.f2954b;
                int i = 0;
                while (i == 0 && !this.k) {
                    i = mVar.d(jVar, l);
                }
                c.c.a.a.x1.p.g(i != 1);
                if (r0 != null) {
                    try {
                        this.h.close();
                    } catch (IOException unused) {
                    }
                }
            } finally {
                this.j = jVar.f2650d - this.f2942a.f3654d;
            }
        } finally {
            v0 v0Var2 = this.h;
            int i2 = c.c.a.a.z1.l0.f3761a;
            if (v0Var2 != null) {
                try {
                    v0Var2.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    @Override // c.c.a.a.y1.l0
    public void b() {
        this.k = true;
    }
}
