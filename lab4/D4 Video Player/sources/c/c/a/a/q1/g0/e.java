package c.c.a.a.q1.g0;

import java.util.Objects;

/* loaded from: classes.dex */
public final class e implements c.c.a.a.q1.m {
    public static final int k = c.c.a.a.z1.l0.l("ID3");

    /* renamed from: a, reason: collision with root package name */
    public final f f2478a;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.z1.z f2479b;

    /* renamed from: c, reason: collision with root package name */
    public final c.c.a.a.z1.z f2480c;

    /* renamed from: d, reason: collision with root package name */
    public final c.c.a.a.z1.y f2481d;

    /* renamed from: e, reason: collision with root package name */
    public c.c.a.a.q1.n f2482e;

    /* renamed from: f, reason: collision with root package name */
    public long f2483f;
    public long g;
    public int h;
    public boolean i;
    public boolean j;

    public e() {
        this(0L, 0);
    }

    @Override // c.c.a.a.q1.m
    public void a() {
    }

    public final int b(c.c.a.a.q1.j jVar) {
        int i = 0;
        while (true) {
            jVar.d(this.f2480c.f3800a, 0, 10, false);
            this.f2480c.A(0);
            if (this.f2480c.r() != k) {
                break;
            }
            this.f2480c.B(3);
            int o = this.f2480c.o();
            i += o + 10;
            jVar.a(o, false);
        }
        jVar.f2652f = 0;
        jVar.a(i, false);
        if (this.g == -1) {
            this.g = i;
        }
        return i;
    }

    @Override // c.c.a.a.q1.m
    public int d(c.c.a.a.q1.j jVar, c.c.a.a.q1.s sVar) {
        long j = jVar.f2649c;
        int e2 = jVar.e(this.f2479b.f3800a, 0, 2048);
        boolean z = e2 == -1;
        if (!this.j) {
            c.c.a.a.q1.n nVar = this.f2482e;
            Objects.requireNonNull(nVar);
            nVar.a(new c.c.a.a.q1.u(-9223372036854775807L, 0L));
            this.j = true;
        }
        if (z) {
            return -1;
        }
        this.f2479b.A(0);
        this.f2479b.z(e2);
        if (!this.i) {
            this.f2478a.s = this.f2483f;
            this.i = true;
        }
        this.f2478a.c(this.f2479b);
        return 0;
    }

    @Override // c.c.a.a.q1.m
    public void e(c.c.a.a.q1.n nVar) {
        this.f2482e = nVar;
        this.f2478a.f(nVar, new p0(Integer.MIN_VALUE, 0, 1));
        nVar.c();
    }

    @Override // c.c.a.a.q1.m
    public void h(long j, long j2) {
        this.i = false;
        this.f2478a.a();
        this.f2483f = 0 + j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0021, code lost:
    
        r9.f2652f = 0;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if ((r3 - r0) < 8192) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
    
        return false;
     */
    @Override // c.c.a.a.q1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i(c.c.a.a.q1.j r9) {
        /*
            r8 = this;
            int r0 = r8.b(r9)
            r1 = 0
            r3 = r0
        L6:
            r2 = r1
            r4 = r2
        L8:
            c.c.a.a.z1.z r5 = r8.f2480c
            byte[] r5 = r5.f3800a
            r6 = 2
            r9.d(r5, r1, r6, r1)
            c.c.a.a.z1.z r5 = r8.f2480c
            r5.A(r1)
            c.c.a.a.z1.z r5 = r8.f2480c
            int r5 = r5.u()
            boolean r5 = c.c.a.a.q1.g0.f.g(r5)
            if (r5 != 0) goto L30
            r9.f2652f = r1
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.148E-41)
            if (r2 < r4) goto L2c
            return r1
        L2c:
            r9.a(r3, r1)
            goto L6
        L30:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L3a
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L3a
            return r5
        L3a:
            c.c.a.a.z1.z r5 = r8.f2480c
            byte[] r5 = r5.f3800a
            r9.d(r5, r1, r6, r1)
            c.c.a.a.z1.y r5 = r8.f2481d
            r6 = 14
            r5.j(r6)
            c.c.a.a.z1.y r5 = r8.f2481d
            r6 = 13
            int r5 = r5.f(r6)
            r6 = 6
            if (r5 > r6) goto L54
            return r1
        L54:
            int r6 = r5 + (-6)
            r9.a(r6, r1)
            int r4 = r4 + r5
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.g0.e.i(c.c.a.a.q1.j):boolean");
    }

    public e(long j, int i) {
        this.f2483f = j;
        this.f2478a = new f(true, null);
        this.f2479b = new c.c.a.a.z1.z(2048);
        this.h = -1;
        this.g = -1L;
        c.c.a.a.z1.z zVar = new c.c.a.a.z1.z(10);
        this.f2480c = zVar;
        this.f2481d = new c.c.a.a.z1.y(zVar.f3800a);
    }
}
