package c.c.a.a.q1.g0;

/* loaded from: classes.dex */
public final class y implements c.c.a.a.q1.f {

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.z1.k0 f2620a;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.z1.z f2621b = new c.c.a.a.z1.z();

    public y(c.c.a.a.z1.k0 k0Var, x xVar) {
        this.f2620a = k0Var;
    }

    @Override // c.c.a.a.q1.f
    public c.c.a.a.q1.e a(c.c.a.a.q1.j jVar, long j, c.c.a.a.q1.c cVar) {
        int f2;
        long j2;
        long j3 = jVar.f2650d;
        int min = (int) Math.min(20000L, jVar.f2649c - j3);
        this.f2621b.w(min);
        jVar.d(this.f2621b.f3800a, 0, min, false);
        c.c.a.a.z1.z zVar = this.f2621b;
        int i = -1;
        int i2 = -1;
        long j4 = -9223372036854775807L;
        while (zVar.a() >= 4) {
            if (z.f(zVar.f3800a, zVar.f3801b) != 442) {
                zVar.B(1);
            } else {
                zVar.B(4);
                long c2 = a0.c(zVar);
                if (c2 != -9223372036854775807L) {
                    long b2 = this.f2620a.b(c2);
                    if (b2 > j) {
                        if (j4 == -9223372036854775807L) {
                            return new c.c.a.a.q1.e(-1, b2, j3);
                        }
                        j2 = i2;
                    } else if (100000 + b2 > j) {
                        j2 = zVar.f3801b;
                    } else {
                        i2 = zVar.f3801b;
                        j4 = b2;
                    }
                    return c.c.a.a.q1.e.a(j3 + j2);
                }
                int i3 = zVar.f3802c;
                if (zVar.a() >= 10) {
                    zVar.B(9);
                    int p = zVar.p() & 7;
                    if (zVar.a() >= p) {
                        zVar.B(p);
                        if (zVar.a() >= 4) {
                            if (z.f(zVar.f3800a, zVar.f3801b) == 443) {
                                zVar.B(4);
                                int u = zVar.u();
                                if (zVar.a() >= u) {
                                    zVar.B(u);
                                }
                            }
                            while (zVar.a() >= 4 && (f2 = z.f(zVar.f3800a, zVar.f3801b)) != 442 && f2 != 441 && (f2 >>> 8) == 1) {
                                zVar.B(4);
                                if (zVar.a() >= 2) {
                                    zVar.A(Math.min(zVar.f3802c, zVar.f3801b + zVar.u()));
                                }
                            }
                            i = zVar.f3801b;
                        }
                    }
                }
                zVar.A(i3);
                i = zVar.f3801b;
            }
        }
        return j4 != -9223372036854775807L ? new c.c.a.a.q1.e(-2, j4, j3 + i) : c.c.a.a.q1.e.f2377d;
    }

    @Override // c.c.a.a.q1.f
    public void b() {
        this.f2621b.x(c.c.a.a.z1.l0.f3766f);
    }
}
