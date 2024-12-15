package c.c.a.a.q1.g0;

/* loaded from: classes.dex */
public final class h0 implements c.c.a.a.q1.f {

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.z1.k0 f2509a;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.z1.z f2510b = new c.c.a.a.z1.z();

    /* renamed from: c, reason: collision with root package name */
    public final int f2511c;

    public h0(int i, c.c.a.a.z1.k0 k0Var) {
        this.f2511c = i;
        this.f2509a = k0Var;
    }

    @Override // c.c.a.a.q1.f
    public c.c.a.a.q1.e a(c.c.a.a.q1.j jVar, long j, c.c.a.a.q1.c cVar) {
        long j2;
        long j3 = jVar.f2650d;
        int min = (int) Math.min(112800L, jVar.f2649c - j3);
        this.f2510b.w(min);
        jVar.d(this.f2510b.f3800a, 0, min, false);
        c.c.a.a.z1.z zVar = this.f2510b;
        int i = zVar.f3802c;
        long j4 = -1;
        long j5 = -1;
        long j6 = -9223372036854775807L;
        while (zVar.a() >= 188) {
            byte[] bArr = zVar.f3800a;
            int i2 = zVar.f3801b;
            while (i2 < i && bArr[i2] != 71) {
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long o = b.q.u.o(zVar, i2, this.f2511c);
            if (o != -9223372036854775807L) {
                long b2 = this.f2509a.b(o);
                if (b2 > j) {
                    if (j6 == -9223372036854775807L) {
                        return new c.c.a.a.q1.e(-1, b2, j3);
                    }
                    j2 = j3 + j5;
                } else if (100000 + b2 > j) {
                    j2 = j3 + i2;
                } else {
                    j5 = i2;
                    j6 = b2;
                }
                return c.c.a.a.q1.e.a(j2);
            }
            zVar.A(i3);
            j4 = i3;
        }
        return j6 != -9223372036854775807L ? new c.c.a.a.q1.e(-2, j6, j3 + j4) : c.c.a.a.q1.e.f2377d;
    }

    @Override // c.c.a.a.q1.f
    public void b() {
        this.f2510b.x(c.c.a.a.z1.l0.f3766f);
    }
}
