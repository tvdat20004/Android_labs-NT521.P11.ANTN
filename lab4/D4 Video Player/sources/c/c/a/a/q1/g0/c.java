package c.c.a.a.q1.g0;

/* loaded from: classes.dex */
public final class c implements c.c.a.a.q1.m {

    /* renamed from: d, reason: collision with root package name */
    public static final int f2462d = c.c.a.a.z1.l0.l("ID3");

    /* renamed from: a, reason: collision with root package name */
    public final d f2463a = new d(null);

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.z1.z f2464b = new c.c.a.a.z1.z(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f2465c;

    @Override // c.c.a.a.q1.m
    public void a() {
    }

    @Override // c.c.a.a.q1.m
    public int d(c.c.a.a.q1.j jVar, c.c.a.a.q1.s sVar) {
        int e2 = jVar.e(this.f2464b.f3800a, 0, 16384);
        if (e2 == -1) {
            return -1;
        }
        this.f2464b.A(0);
        this.f2464b.z(e2);
        if (!this.f2465c) {
            this.f2463a.m = 0L;
            this.f2465c = true;
        }
        this.f2463a.c(this.f2464b);
        return 0;
    }

    @Override // c.c.a.a.q1.m
    public void e(c.c.a.a.q1.n nVar) {
        this.f2463a.f(nVar, new p0(Integer.MIN_VALUE, 0, 1));
        nVar.c();
        nVar.a(new c.c.a.a.q1.u(-9223372036854775807L, 0L));
    }

    @Override // c.c.a.a.q1.m
    public void h(long j, long j2) {
        this.f2465c = false;
        this.f2463a.a();
    }

    @Override // c.c.a.a.q1.m
    public boolean i(c.c.a.a.q1.j jVar) {
        int i;
        c.c.a.a.z1.z zVar = new c.c.a.a.z1.z(10);
        int i2 = 0;
        while (true) {
            jVar.d(zVar.f3800a, 0, 10, false);
            zVar.A(0);
            if (zVar.r() != f2462d) {
                break;
            }
            zVar.B(3);
            int o = zVar.o();
            i2 += o + 10;
            jVar.a(o, false);
        }
        jVar.f2652f = 0;
        jVar.a(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            jVar.d(zVar.f3800a, 0, 7, false);
            zVar.A(0);
            int u = zVar.u();
            if (u == 44096 || u == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = zVar.f3800a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (u == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    return false;
                }
                jVar.a(i - 7, false);
            } else {
                jVar.f2652f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                jVar.a(i4, false);
                i3 = 0;
            }
        }
    }
}
