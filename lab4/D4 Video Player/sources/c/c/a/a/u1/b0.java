package c.c.a.a.u1;

import android.net.Uri;
import android.os.Handler;
import c.c.a.a.d1;
import c.c.a.a.y1.v0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b0 implements v, c.c.a.a.q1.n, c.c.a.a.y1.i0<a>, c.c.a.a.y1.m0, j0 {
    public static final c.c.a.a.l0 L = c.c.a.a.l0.u("icy", "application/x-icy", Long.MAX_VALUE);
    public boolean A;
    public boolean B;
    public int C;
    public long F;
    public boolean H;
    public int I;
    public boolean J;
    public boolean K;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f2830b;

    /* renamed from: c, reason: collision with root package name */
    public final c.c.a.a.y1.n f2831c;

    /* renamed from: d, reason: collision with root package name */
    public final c.c.a.a.y1.z f2832d;

    /* renamed from: e, reason: collision with root package name */
    public final y f2833e;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f2834f;
    public final c.c.a.a.y1.r g;
    public final String h;
    public final long i;
    public final c0 k;
    public u p;
    public c.c.a.a.q1.v q;
    public c.c.a.a.s1.l.c r;
    public boolean u;
    public boolean v;
    public d0 w;
    public boolean x;
    public boolean z;
    public final c.c.a.a.y1.p0 j = new c.c.a.a.y1.p0("Loader:ProgressiveMediaPeriod");
    public final c.c.a.a.z1.j l = new c.c.a.a.z1.j();
    public final Runnable m = new Runnable() { // from class: c.c.a.a.u1.j
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v6 */
        @Override // java.lang.Runnable
        public final void run() {
            boolean[] zArr;
            c.c.a.a.l0 l0Var;
            c.c.a.a.s1.c i;
            int i2;
            b0 b0Var = b0.this;
            c.c.a.a.q1.v vVar = b0Var.q;
            if (b0Var.K || b0Var.v || !b0Var.u || vVar == null) {
                return;
            }
            ?? r5 = 0;
            for (k0 k0Var : b0Var.s) {
                if (k0Var.n() == null) {
                    return;
                }
            }
            c.c.a.a.z1.j jVar = b0Var.l;
            synchronized (jVar) {
                jVar.f3753a = false;
            }
            int length = b0Var.s.length;
            q0[] q0VarArr = new q0[length];
            boolean[] zArr2 = new boolean[length];
            b0Var.D = vVar.j();
            int i3 = 0;
            while (i3 < length) {
                c.c.a.a.l0 n = b0Var.s[i3].n();
                String str = n.j;
                boolean h = c.c.a.a.z1.u.h(str);
                boolean z = (h || c.c.a.a.z1.u.j(str)) ? true : r5;
                zArr2[i3] = z;
                b0Var.x = z | b0Var.x;
                c.c.a.a.s1.l.c cVar = b0Var.r;
                if (cVar != null) {
                    if (h || b0Var.t[i3].f2863b) {
                        c.c.a.a.s1.c cVar2 = n.h;
                        if (cVar2 == null) {
                            c.c.a.a.s1.b[] bVarArr = new c.c.a.a.s1.b[1];
                            bVarArr[r5] = cVar;
                            i = new c.c.a.a.s1.c(bVarArr);
                        } else {
                            c.c.a.a.s1.b[] bVarArr2 = new c.c.a.a.s1.b[1];
                            bVarArr2[r5] = cVar;
                            i = cVar2.i(bVarArr2);
                        }
                        n = n.m(i);
                    }
                    if (h && n.f2041f == -1 && (i2 = cVar.f2734b) != -1) {
                        zArr = zArr2;
                        l0Var = new c.c.a.a.l0(n.f2037b, n.f2038c, n.f2039d, n.f2040e, i2, n.g, n.h, n.i, n.j, n.k, n.l, n.m, n.n, n.o, n.p, n.q, n.r, n.s, n.u, n.t, n.v, n.w, n.x, n.y, n.z, n.A, n.B, n.C);
                        q0VarArr[i3] = new q0(l0Var);
                        i3++;
                        r5 = 0;
                        zArr2 = zArr;
                    }
                }
                zArr = zArr2;
                l0Var = n;
                q0VarArr[i3] = new q0(l0Var);
                i3++;
                r5 = 0;
                zArr2 = zArr;
            }
            boolean[] zArr3 = zArr2;
            b0Var.y = (b0Var.E == -1 && vVar.j() == -9223372036854775807L) ? 7 : 1;
            b0Var.w = new d0(vVar, new s0(q0VarArr), zArr3);
            b0Var.v = true;
            b0Var.f2834f.k(b0Var.D, vVar.c());
            u uVar = b0Var.p;
            Objects.requireNonNull(uVar);
            uVar.a(b0Var);
        }
    };
    public final Runnable n = new Runnable() { // from class: c.c.a.a.u1.k
        @Override // java.lang.Runnable
        public final void run() {
            b0 b0Var = b0.this;
            if (b0Var.K) {
                return;
            }
            u uVar = b0Var.p;
            Objects.requireNonNull(uVar);
            uVar.c(b0Var);
        }
    };
    public final Handler o = new Handler();
    public e0[] t = new e0[0];
    public k0[] s = new k0[0];
    public long G = -9223372036854775807L;
    public long E = -1;
    public long D = -9223372036854775807L;
    public int y = 1;

    public final class a implements c.c.a.a.y1.l0, s {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f2835a;

        /* renamed from: b, reason: collision with root package name */
        public final v0 f2836b;

        /* renamed from: c, reason: collision with root package name */
        public final c0 f2837c;

        /* renamed from: d, reason: collision with root package name */
        public final c.c.a.a.q1.n f2838d;

        /* renamed from: e, reason: collision with root package name */
        public final c.c.a.a.z1.j f2839e;
        public volatile boolean g;
        public long i;
        public c.c.a.a.y1.q j;
        public c.c.a.a.q1.y l;
        public boolean m;

        /* renamed from: f, reason: collision with root package name */
        public final c.c.a.a.q1.s f2840f = new c.c.a.a.q1.s();
        public boolean h = true;
        public long k = -1;

        public a(Uri uri, c.c.a.a.y1.n nVar, c0 c0Var, c.c.a.a.q1.n nVar2, c.c.a.a.z1.j jVar) {
            this.f2835a = uri;
            this.f2836b = new v0(nVar);
            this.f2837c = c0Var;
            this.f2838d = nVar2;
            this.f2839e = jVar;
            this.j = new c.c.a.a.y1.q(uri, 0L, -1L, b0.this.h, 22);
        }

        @Override // c.c.a.a.y1.l0
        public void a() {
            c.c.a.a.y1.n nVar;
            int i;
            int i2 = 0;
            while (i2 == 0 && !this.g) {
                c.c.a.a.q1.j jVar = null;
                try {
                    long j = this.f2840f.f2664a;
                    c.c.a.a.y1.q qVar = new c.c.a.a.y1.q(this.f2835a, j, -1L, b0.this.h, 22);
                    this.j = qVar;
                    long a2 = this.f2836b.a(qVar);
                    this.k = a2;
                    if (a2 != -1) {
                        this.k = a2 + j;
                    }
                    Uri c2 = this.f2836b.c();
                    Objects.requireNonNull(c2);
                    b0.this.r = c.c.a.a.s1.l.c.i(this.f2836b.d());
                    c.c.a.a.y1.n nVar2 = this.f2836b;
                    c.c.a.a.s1.l.c cVar = b0.this.r;
                    if (cVar == null || (i = cVar.g) == -1) {
                        nVar = nVar2;
                    } else {
                        c.c.a.a.y1.n tVar = new t(nVar2, i, this);
                        c.c.a.a.q1.y z = b0.this.z(new e0(0, true));
                        this.l = z;
                        z.b(b0.L);
                        nVar = tVar;
                    }
                    c.c.a.a.q1.j jVar2 = new c.c.a.a.q1.j(nVar, j, this.k);
                    try {
                        c.c.a.a.q1.m a3 = this.f2837c.a(jVar2, this.f2838d, c2);
                        if (this.h) {
                            a3.h(j, this.i);
                            this.h = false;
                        }
                        while (i2 == 0 && !this.g) {
                            c.c.a.a.z1.j jVar3 = this.f2839e;
                            synchronized (jVar3) {
                                while (!jVar3.f3753a) {
                                    jVar3.wait();
                                }
                            }
                            i2 = a3.d(jVar2, this.f2840f);
                            long j2 = jVar2.f2650d;
                            if (j2 > b0.this.i + j) {
                                c.c.a.a.z1.j jVar4 = this.f2839e;
                                synchronized (jVar4) {
                                    jVar4.f3753a = false;
                                }
                                b0 b0Var = b0.this;
                                b0Var.o.post(b0Var.n);
                                j = j2;
                            }
                        }
                        if (i2 == 1) {
                            i2 = 0;
                        } else {
                            this.f2840f.f2664a = jVar2.f2650d;
                        }
                        v0 v0Var = this.f2836b;
                        if (v0Var != null) {
                            try {
                                v0Var.f3689a.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        jVar = jVar2;
                        if (i2 != 1 && jVar != null) {
                            this.f2840f.f2664a = jVar.f2650d;
                        }
                        v0 v0Var2 = this.f2836b;
                        int i3 = c.c.a.a.z1.l0.f3761a;
                        if (v0Var2 != null) {
                            try {
                                v0Var2.f3689a.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        @Override // c.c.a.a.y1.l0
        public void b() {
            this.g = true;
        }
    }

    public final class b implements l0 {

        /* renamed from: b, reason: collision with root package name */
        public final int f2841b;

        public b(int i) {
            this.f2841b = i;
        }

        @Override // c.c.a.a.u1.l0
        public void a() {
            b0 b0Var = b0.this;
            b0Var.j.e(b0Var.f2832d.b(b0Var.y));
        }

        @Override // c.c.a.a.u1.l0
        public boolean c() {
            b0 b0Var = b0.this;
            return !b0Var.B() && (b0Var.J || b0Var.s[this.f2841b].o());
        }

        @Override // c.c.a.a.u1.l0
        public int j(c.c.a.a.m0 m0Var, c.c.a.a.o1.g gVar, boolean z) {
            b0 b0Var = b0.this;
            int i = this.f2841b;
            if (b0Var.B()) {
                return -3;
            }
            b0Var.x(i);
            int s = b0Var.s[i].s(m0Var, gVar, z, b0Var.J, b0Var.F);
            if (s == -3) {
                b0Var.y(i);
            }
            return s;
        }

        @Override // c.c.a.a.u1.l0
        public int r(long j) {
            b0 b0Var = b0.this;
            int i = this.f2841b;
            int i2 = 0;
            if (!b0Var.B()) {
                b0Var.x(i);
                k0 k0Var = b0Var.s[i];
                if (!b0Var.J || j <= k0Var.l()) {
                    int e2 = k0Var.e(j, true, true);
                    if (e2 != -1) {
                        i2 = e2;
                    }
                } else {
                    i2 = k0Var.f();
                }
                if (i2 == 0) {
                    b0Var.y(i);
                }
            }
            return i2;
        }
    }

    public b0(Uri uri, c.c.a.a.y1.n nVar, c.c.a.a.q1.m[] mVarArr, c.c.a.a.y1.z zVar, y yVar, f0 f0Var, c.c.a.a.y1.r rVar, String str, int i) {
        this.f2830b = uri;
        this.f2831c = nVar;
        this.f2832d = zVar;
        this.f2833e = yVar;
        this.f2834f = f0Var;
        this.g = rVar;
        this.h = str;
        this.i = i;
        this.k = new c0(mVarArr);
        yVar.k();
    }

    public final void A() {
        a aVar = new a(this.f2830b, this.f2831c, this.k, this, this.l);
        if (this.v) {
            d0 d0Var = this.w;
            Objects.requireNonNull(d0Var);
            c.c.a.a.q1.v vVar = d0Var.f2853a;
            c.c.a.a.x1.p.g(w());
            long j = this.D;
            if (j != -9223372036854775807L && this.G > j) {
                this.J = true;
                this.G = -9223372036854775807L;
                return;
            }
            long j2 = vVar.g(this.G).f2665a.f2671b;
            long j3 = this.G;
            aVar.f2840f.f2664a = j2;
            aVar.i = j3;
            aVar.h = true;
            aVar.m = false;
            this.G = -9223372036854775807L;
        }
        this.I = u();
        this.f2833e.i(aVar.j, 1, -1, null, 0, null, aVar.i, this.D, this.j.g(aVar, this, this.f2832d.b(this.y)));
    }

    public final boolean B() {
        return this.A || w();
    }

    @Override // c.c.a.a.q1.n
    public void a(c.c.a.a.q1.v vVar) {
        if (this.r != null) {
            vVar = new c.c.a.a.q1.u(-9223372036854775807L, 0L);
        }
        this.q = vVar;
        this.o.post(this.m);
    }

    @Override // c.c.a.a.u1.v
    public long b(long j, d1 d1Var) {
        d0 d0Var = this.w;
        Objects.requireNonNull(d0Var);
        c.c.a.a.q1.v vVar = d0Var.f2853a;
        if (!vVar.c()) {
            return 0L;
        }
        c.c.a.a.q1.t g = vVar.g(j);
        return c.c.a.a.z1.l0.B(j, d1Var, g.f2665a.f2670a, g.f2666b.f2670a);
    }

    @Override // c.c.a.a.q1.n
    public void c() {
        this.u = true;
        this.o.post(this.m);
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public long d() {
        long j;
        boolean z;
        d0 d0Var = this.w;
        Objects.requireNonNull(d0Var);
        boolean[] zArr = d0Var.f2855c;
        if (this.J) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.G;
        }
        if (this.x) {
            int length = this.s.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i]) {
                    h0 h0Var = this.s[i].f2895c;
                    synchronized (h0Var) {
                        z = h0Var.o;
                    }
                    if (!z) {
                        j = Math.min(j, this.s[i].l());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = v();
        }
        return j == Long.MIN_VALUE ? this.F : j;
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public long e() {
        if (this.C == 0) {
            return Long.MIN_VALUE;
        }
        return d();
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public boolean f(long j) {
        if (this.J || this.H) {
            return false;
        }
        if (this.v && this.C == 0) {
            return false;
        }
        boolean a2 = this.l.a();
        if (this.j.d()) {
            return a2;
        }
        A();
        return true;
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public void g(long j) {
    }

    @Override // c.c.a.a.u1.v
    public s0 h() {
        d0 d0Var = this.w;
        Objects.requireNonNull(d0Var);
        return d0Var.f2854b;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    @Override // c.c.a.a.y1.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c.c.a.a.y1.j0 i(c.c.a.a.u1.b0.a r28, long r29, long r31, java.io.IOException r33, int r34) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            c.c.a.a.u1.b0$a r1 = (c.c.a.a.u1.b0.a) r1
            long r2 = r0.E
            r4 = -1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L12
            long r2 = r1.k
            r0.E = r2
        L12:
            c.c.a.a.y1.z r2 = r0.f2832d
            r3 = r33
            r6 = r34
            long r6 = r2.c(r3, r6)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r14 = 1
            if (r2 != 0) goto L29
            c.c.a.a.y1.j0 r2 = c.c.a.a.y1.p0.f3647e
            goto L84
        L29:
            int r2 = r27.u()
            int r10 = r0.I
            r11 = 0
            if (r2 <= r10) goto L34
            r10 = r14
            goto L35
        L34:
            r10 = r11
        L35:
            long r12 = r0.E
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 != 0) goto L78
            c.c.a.a.q1.v r4 = r0.q
            if (r4 == 0) goto L48
            long r4 = r4.j()
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto L48
            goto L78
        L48:
            boolean r2 = r0.v
            if (r2 == 0) goto L55
            boolean r2 = r27.B()
            if (r2 != 0) goto L55
            r0.H = r14
            goto L7b
        L55:
            boolean r2 = r0.v
            r0.A = r2
            r4 = 0
            r0.F = r4
            r0.I = r11
            c.c.a.a.u1.k0[] r2 = r0.s
            int r8 = r2.length
            r9 = r11
        L63:
            if (r9 >= r8) goto L6d
            r12 = r2[r9]
            r12.u(r11)
            int r9 = r9 + 1
            goto L63
        L6d:
            c.c.a.a.q1.s r2 = r1.f2840f
            r2.f2664a = r4
            r1.i = r4
            r1.h = r14
            r1.m = r11
            goto L7a
        L78:
            r0.I = r2
        L7a:
            r11 = r14
        L7b:
            if (r11 == 0) goto L82
            c.c.a.a.y1.j0 r2 = c.c.a.a.y1.p0.c(r10, r6)
            goto L84
        L82:
            c.c.a.a.y1.j0 r2 = c.c.a.a.y1.p0.f3646d
        L84:
            c.c.a.a.u1.y r6 = r0.f2833e
            c.c.a.a.y1.q r7 = r1.j
            c.c.a.a.y1.v0 r4 = r1.f2836b
            android.net.Uri r8 = r4.f3691c
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r9 = r4.f3692d
            r10 = 1
            r11 = -1
            r12 = 0
            r13 = 0
            long r10 = r1.i
            r15 = r10
            long r10 = r0.D
            r17 = r10
            long r4 = r4.f3690b
            r23 = r4
            boolean r1 = r2.a()
            r26 = r1 ^ 1
            r14 = 0
            r19 = r29
            r21 = r31
            r25 = r33
            r10 = 1
            r11 = -1
            r6.g(r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r21, r23, r25, r26)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.b0.i(c.c.a.a.y1.l0, long, long, java.io.IOException, int):c.c.a.a.y1.j0");
    }

    @Override // c.c.a.a.q1.n
    public c.c.a.a.q1.y j(int i, int i2) {
        return z(new e0(i, false));
    }

    @Override // c.c.a.a.y1.m0
    public void k() {
        for (k0 k0Var : this.s) {
            k0Var.u(false);
        }
        c0 c0Var = this.k;
        c.c.a.a.q1.m mVar = c0Var.f2849b;
        if (mVar != null) {
            mVar.a();
            c0Var.f2849b = null;
        }
    }

    @Override // c.c.a.a.y1.i0
    public void l(a aVar, long j, long j2) {
        c.c.a.a.q1.v vVar;
        a aVar2 = aVar;
        if (this.D == -9223372036854775807L && (vVar = this.q) != null) {
            boolean c2 = vVar.c();
            long v = v();
            long j3 = v == Long.MIN_VALUE ? 0L : v + 10000;
            this.D = j3;
            this.f2834f.k(j3, c2);
        }
        y yVar = this.f2833e;
        c.c.a.a.y1.q qVar = aVar2.j;
        v0 v0Var = aVar2.f2836b;
        yVar.e(qVar, v0Var.f3691c, v0Var.f3692d, 1, -1, null, 0, null, aVar2.i, this.D, j, j2, v0Var.f3690b);
        if (this.E == -1) {
            this.E = aVar2.k;
        }
        this.J = true;
        u uVar = this.p;
        Objects.requireNonNull(uVar);
        uVar.c(this);
    }

    @Override // c.c.a.a.u1.v
    public void m() {
        this.j.e(this.f2832d.b(this.y));
        if (this.J && !this.v) {
            throw new c.c.a.a.s0("Loading finished before preparation is complete.");
        }
    }

    @Override // c.c.a.a.u1.v
    public void n(long j, boolean z) {
        if (w()) {
            return;
        }
        d0 d0Var = this.w;
        Objects.requireNonNull(d0Var);
        boolean[] zArr = d0Var.f2856d;
        int length = this.s.length;
        for (int i = 0; i < length; i++) {
            this.s[i].i(j, z, zArr[i]);
        }
    }

    @Override // c.c.a.a.u1.v
    public long o(c.c.a.a.w1.r[] rVarArr, boolean[] zArr, l0[] l0VarArr, boolean[] zArr2, long j) {
        d0 d0Var = this.w;
        Objects.requireNonNull(d0Var);
        s0 s0Var = d0Var.f2854b;
        boolean[] zArr3 = d0Var.f2856d;
        int i = this.C;
        int i2 = 0;
        for (int i3 = 0; i3 < rVarArr.length; i3++) {
            if (l0VarArr[i3] != null && (rVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((b) l0VarArr[i3]).f2841b;
                c.c.a.a.x1.p.g(zArr3[i4]);
                this.C--;
                zArr3[i4] = false;
                l0VarArr[i3] = null;
            }
        }
        boolean z = !this.z ? j == 0 : i != 0;
        for (int i5 = 0; i5 < rVarArr.length; i5++) {
            if (l0VarArr[i5] == null && rVarArr[i5] != null) {
                c.c.a.a.w1.r rVar = rVarArr[i5];
                c.c.a.a.x1.p.g(((c.c.a.a.w1.g) rVar).f3409c.length == 1);
                c.c.a.a.w1.g gVar = (c.c.a.a.w1.g) rVar;
                c.c.a.a.x1.p.g(gVar.f3409c[0] == 0);
                int i6 = s0Var.i(gVar.f3407a);
                c.c.a.a.x1.p.g(!zArr3[i6]);
                this.C++;
                zArr3[i6] = true;
                l0VarArr[i5] = new b(i6);
                zArr2[i5] = true;
                if (!z) {
                    k0 k0Var = this.s[i6];
                    k0Var.v();
                    z = k0Var.e(j, true, true) == -1 && k0Var.m() != 0;
                }
            }
        }
        if (this.C == 0) {
            this.H = false;
            this.A = false;
            if (this.j.d()) {
                k0[] k0VarArr = this.s;
                int length = k0VarArr.length;
                while (i2 < length) {
                    k0VarArr[i2].j();
                    i2++;
                }
                this.j.b();
            } else {
                for (k0 k0Var2 : this.s) {
                    k0Var2.u(false);
                }
            }
        } else if (z) {
            j = q(j);
            while (i2 < l0VarArr.length) {
                if (l0VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.z = true;
        return j;
    }

    @Override // c.c.a.a.y1.i0
    public void p(a aVar, long j, long j2, boolean z) {
        a aVar2 = aVar;
        y yVar = this.f2833e;
        c.c.a.a.y1.q qVar = aVar2.j;
        v0 v0Var = aVar2.f2836b;
        yVar.c(qVar, v0Var.f3691c, v0Var.f3692d, 1, -1, null, 0, null, aVar2.i, this.D, j, j2, v0Var.f3690b);
        if (z) {
            return;
        }
        if (this.E == -1) {
            this.E = aVar2.k;
        }
        for (k0 k0Var : this.s) {
            k0Var.u(false);
        }
        if (this.C > 0) {
            u uVar = this.p;
            Objects.requireNonNull(uVar);
            uVar.c(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r4 = false;
     */
    @Override // c.c.a.a.u1.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long q(long r8) {
        /*
            r7 = this;
            c.c.a.a.u1.d0 r0 = r7.w
            java.util.Objects.requireNonNull(r0)
            c.c.a.a.q1.v r1 = r0.f2853a
            boolean[] r0 = r0.f2855c
            boolean r1 = r1.c()
            if (r1 == 0) goto L10
            goto L12
        L10:
            r8 = 0
        L12:
            r1 = 0
            r7.A = r1
            r7.F = r8
            boolean r2 = r7.w()
            if (r2 == 0) goto L20
            r7.G = r8
            return r8
        L20:
            int r2 = r7.y
            r3 = 7
            if (r2 == r3) goto L4e
            c.c.a.a.u1.k0[] r2 = r7.s
            int r2 = r2.length
            r3 = r1
        L29:
            r4 = 1
            if (r3 >= r2) goto L4b
            c.c.a.a.u1.k0[] r5 = r7.s
            r5 = r5[r3]
            r5.v()
            int r5 = r5.e(r8, r4, r1)
            r6 = -1
            if (r5 == r6) goto L3b
            goto L3c
        L3b:
            r4 = r1
        L3c:
            if (r4 != 0) goto L48
            boolean r4 = r0[r3]
            if (r4 != 0) goto L46
            boolean r4 = r7.x
            if (r4 != 0) goto L48
        L46:
            r4 = r1
            goto L4b
        L48:
            int r3 = r3 + 1
            goto L29
        L4b:
            if (r4 == 0) goto L4e
            return r8
        L4e:
            r7.H = r1
            r7.G = r8
            r7.J = r1
            c.c.a.a.y1.p0 r0 = r7.j
            boolean r0 = r0.d()
            if (r0 == 0) goto L62
            c.c.a.a.y1.p0 r0 = r7.j
            r0.b()
            goto L70
        L62:
            c.c.a.a.u1.k0[] r0 = r7.s
            int r2 = r0.length
            r3 = r1
        L66:
            if (r3 >= r2) goto L70
            r4 = r0[r3]
            r4.u(r1)
            int r3 = r3 + 1
            goto L66
        L70:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.b0.q(long):long");
    }

    @Override // c.c.a.a.u1.j0
    public void r(c.c.a.a.l0 l0Var) {
        this.o.post(this.m);
    }

    @Override // c.c.a.a.u1.v
    public long s() {
        if (!this.B) {
            this.f2833e.n();
            this.B = true;
        }
        if (!this.A) {
            return -9223372036854775807L;
        }
        if (!this.J && u() <= this.I) {
            return -9223372036854775807L;
        }
        this.A = false;
        return this.F;
    }

    @Override // c.c.a.a.u1.v
    public void t(u uVar, long j) {
        this.p = uVar;
        this.l.a();
        A();
    }

    public final int u() {
        int i = 0;
        for (k0 k0Var : this.s) {
            h0 h0Var = k0Var.f2895c;
            i += h0Var.j + h0Var.i;
        }
        return i;
    }

    public final long v() {
        long j = Long.MIN_VALUE;
        for (k0 k0Var : this.s) {
            j = Math.max(j, k0Var.l());
        }
        return j;
    }

    public final boolean w() {
        return this.G != -9223372036854775807L;
    }

    public final void x(int i) {
        d0 d0Var = this.w;
        Objects.requireNonNull(d0Var);
        boolean[] zArr = d0Var.f2857e;
        if (zArr[i]) {
            return;
        }
        c.c.a.a.l0 l0Var = d0Var.f2854b.f2923c[i].f2919c[0];
        this.f2833e.b(c.c.a.a.z1.u.f(l0Var.j), l0Var, 0, null, this.F);
        zArr[i] = true;
    }

    public final void y(int i) {
        d0 d0Var = this.w;
        Objects.requireNonNull(d0Var);
        boolean[] zArr = d0Var.f2855c;
        if (this.H && zArr[i] && !this.s[i].o()) {
            this.G = 0L;
            this.H = false;
            this.A = true;
            this.F = 0L;
            this.I = 0;
            for (k0 k0Var : this.s) {
                k0Var.u(false);
            }
            u uVar = this.p;
            Objects.requireNonNull(uVar);
            uVar.c(this);
        }
    }

    public final c.c.a.a.q1.y z(e0 e0Var) {
        int length = this.s.length;
        for (int i = 0; i < length; i++) {
            if (e0Var.equals(this.t[i])) {
                return this.s[i];
            }
        }
        k0 k0Var = new k0(this.g);
        k0Var.o = this;
        int i2 = length + 1;
        e0[] e0VarArr = (e0[]) Arrays.copyOf(this.t, i2);
        e0VarArr[length] = e0Var;
        int i3 = c.c.a.a.z1.l0.f3761a;
        this.t = e0VarArr;
        k0[] k0VarArr = (k0[]) Arrays.copyOf(this.s, i2);
        k0VarArr[length] = k0Var;
        this.s = k0VarArr;
        return k0Var;
    }
}
