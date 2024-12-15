package c.c.a.a.q1.g0;

/* loaded from: classes.dex */
public final class a implements c.c.a.a.q1.m {

    /* renamed from: d, reason: collision with root package name */
    public static final int f2440d = c.c.a.a.z1.l0.l("ID3");

    /* renamed from: a, reason: collision with root package name */
    public final b f2441a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.z1.z f2442b = new c.c.a.a.z1.z(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f2443c;

    @Override // c.c.a.a.q1.m
    public void a() {
    }

    @Override // c.c.a.a.q1.m
    public int d(c.c.a.a.q1.j jVar, c.c.a.a.q1.s sVar) {
        int e2 = jVar.e(this.f2442b.f3800a, 0, 2786);
        if (e2 == -1) {
            return -1;
        }
        this.f2442b.A(0);
        this.f2442b.z(e2);
        if (!this.f2443c) {
            this.f2441a.l = 0L;
            this.f2443c = true;
        }
        this.f2441a.c(this.f2442b);
        return 0;
    }

    @Override // c.c.a.a.q1.m
    public void e(c.c.a.a.q1.n nVar) {
        this.f2441a.f(nVar, new p0(Integer.MIN_VALUE, 0, 1));
        nVar.c();
        nVar.a(new c.c.a.a.q1.u(-9223372036854775807L, 0L));
    }

    @Override // c.c.a.a.q1.m
    public void h(long j, long j2) {
        this.f2443c = false;
        this.f2441a.a();
    }

    @Override // c.c.a.a.q1.m
    public boolean i(c.c.a.a.q1.j jVar) {
        int a2;
        c.c.a.a.z1.z zVar = new c.c.a.a.z1.z(10);
        int i = 0;
        while (true) {
            jVar.d(zVar.f3800a, 0, 10, false);
            zVar.A(0);
            if (zVar.r() != f2440d) {
                break;
            }
            zVar.B(3);
            int o = zVar.o();
            i += o + 10;
            jVar.a(o, false);
        }
        jVar.f2652f = 0;
        jVar.a(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            jVar.d(zVar.f3800a, 0, 6, false);
            zVar.A(0);
            if (zVar.u() != 2935) {
                jVar.f2652f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                jVar.a(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = zVar.f3800a;
                if (bArr.length < 6) {
                    a2 = -1;
                } else {
                    a2 = ((bArr[5] & 255) >> 3) == 16 ? ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2 : c.c.a.a.m1.g.a((bArr[4] & 192) >> 6, bArr[4] & 63);
                }
                if (a2 == -1) {
                    return false;
                }
                jVar.a(a2 - 6, false);
            }
        }
    }
}
