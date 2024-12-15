package c.c.a.a.u1;

import c.c.a.a.d1;

/* loaded from: classes.dex */
public final class o implements v, u {

    /* renamed from: b, reason: collision with root package name */
    public final v f2907b;

    /* renamed from: c, reason: collision with root package name */
    public u f2908c;

    /* renamed from: d, reason: collision with root package name */
    public n[] f2909d = new n[0];

    /* renamed from: e, reason: collision with root package name */
    public long f2910e;

    /* renamed from: f, reason: collision with root package name */
    public long f2911f;

    public o(v vVar, boolean z, long j, long j2) {
        this.f2907b = vVar;
        this.f2910e = z ? j : -9223372036854775807L;
        this.f2911f = j2;
    }

    @Override // c.c.a.a.u1.u
    public void a(v vVar) {
        this.f2908c.a(this);
    }

    @Override // c.c.a.a.u1.v
    public long b(long j, d1 d1Var) {
        if (j == 0) {
            return 0L;
        }
        long g = c.c.a.a.z1.l0.g(d1Var.f1991a, 0L, j - 0);
        long j2 = d1Var.f1992b;
        long j3 = this.f2911f;
        long g2 = c.c.a.a.z1.l0.g(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (g != d1Var.f1991a || g2 != d1Var.f1992b) {
            d1Var = new d1(g, g2);
        }
        return this.f2907b.b(j, d1Var);
    }

    @Override // c.c.a.a.u1.m0
    public void c(v vVar) {
        this.f2908c.c(this);
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public long d() {
        long d2 = this.f2907b.d();
        if (d2 != Long.MIN_VALUE) {
            long j = this.f2911f;
            if (j == Long.MIN_VALUE || d2 < j) {
                return d2;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public long e() {
        long e2 = this.f2907b.e();
        if (e2 != Long.MIN_VALUE) {
            long j = this.f2911f;
            if (j == Long.MIN_VALUE || e2 < j) {
                return e2;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public boolean f(long j) {
        return this.f2907b.f(j);
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public void g(long j) {
        this.f2907b.g(j);
    }

    @Override // c.c.a.a.u1.v
    public s0 h() {
        return this.f2907b.h();
    }

    public boolean i() {
        return this.f2910e != -9223372036854775807L;
    }

    @Override // c.c.a.a.u1.v
    public void m() {
        this.f2907b.m();
    }

    @Override // c.c.a.a.u1.v
    public void n(long j, boolean z) {
        this.f2907b.n(j, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r2 > r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    @Override // c.c.a.a.u1.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long o(c.c.a.a.w1.r[] r13, boolean[] r14, c.c.a.a.u1.l0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            c.c.a.a.u1.n[] r2 = new c.c.a.a.u1.n[r2]
            r0.f2909d = r2
            int r2 = r1.length
            c.c.a.a.u1.l0[] r9 = new c.c.a.a.u1.l0[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L25
            c.c.a.a.u1.n[] r3 = r0.f2909d
            r4 = r1[r2]
            c.c.a.a.u1.n r4 = (c.c.a.a.u1.n) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L20
            r3 = r3[r2]
            c.c.a.a.u1.l0 r11 = r3.f2904b
        L20:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L25:
            c.c.a.a.u1.v r2 = r0.f2907b
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.o(r3, r4, r5, r6, r7)
            boolean r4 = r12.i()
            r5 = 0
            if (r4 == 0) goto L3c
            int r4 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
        L3c:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f2910e = r7
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L5a
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 < 0) goto L58
            long r4 = r0.f2911f
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L5a
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L58
            goto L5a
        L58:
            r4 = r10
            goto L5b
        L5a:
            r4 = 1
        L5b:
            c.c.a.a.x1.p.g(r4)
        L5e:
            int r4 = r1.length
            if (r10 >= r4) goto L8c
            r4 = r9[r10]
            if (r4 != 0) goto L6a
            c.c.a.a.u1.n[] r4 = r0.f2909d
            r4[r10] = r11
            goto L83
        L6a:
            r4 = r1[r10]
            if (r4 == 0) goto L78
            c.c.a.a.u1.n[] r4 = r0.f2909d
            r4 = r4[r10]
            c.c.a.a.u1.l0 r4 = r4.f2904b
            r5 = r9[r10]
            if (r4 == r5) goto L83
        L78:
            c.c.a.a.u1.n[] r4 = r0.f2909d
            c.c.a.a.u1.n r5 = new c.c.a.a.u1.n
            r6 = r9[r10]
            r5.<init>(r12, r6)
            r4[r10] = r5
        L83:
            c.c.a.a.u1.n[] r4 = r0.f2909d
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L5e
        L8c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.o.o(c.c.a.a.w1.r[], boolean[], c.c.a.a.u1.l0[], boolean[], long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // c.c.a.a.u1.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long q(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f2910e = r0
            c.c.a.a.u1.n[] r0 = r5.f2909d
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f2905c = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            c.c.a.a.u1.v r0 = r5.f2907b
            long r0 = r0.q(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            r6 = 0
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f2911f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            c.c.a.a.x1.p.g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.o.q(long):long");
    }

    @Override // c.c.a.a.u1.v
    public long s() {
        if (i()) {
            long j = this.f2910e;
            this.f2910e = -9223372036854775807L;
            long s = s();
            return s != -9223372036854775807L ? s : j;
        }
        long s2 = this.f2907b.s();
        if (s2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        c.c.a.a.x1.p.g(s2 >= 0);
        long j2 = this.f2911f;
        if (j2 != Long.MIN_VALUE && s2 > j2) {
            z = false;
        }
        c.c.a.a.x1.p.g(z);
        return s2;
    }

    @Override // c.c.a.a.u1.v
    public void t(u uVar, long j) {
        this.f2908c = uVar;
        this.f2907b.t(this, j);
    }
}
