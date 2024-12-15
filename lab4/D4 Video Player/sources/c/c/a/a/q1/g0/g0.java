package c.c.a.a.q1.g0;

/* loaded from: classes.dex */
public final class g0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public c.c.a.a.z1.k0 f2500a;

    /* renamed from: b, reason: collision with root package name */
    public c.c.a.a.q1.y f2501b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2502c;

    @Override // c.c.a.a.q1.g0.d0
    public void b(c.c.a.a.z1.k0 k0Var, c.c.a.a.q1.n nVar, p0 p0Var) {
        this.f2500a = k0Var;
        p0Var.a();
        c.c.a.a.q1.y j = nVar.j(p0Var.c(), 4);
        this.f2501b = j;
        j.b(c.c.a.a.l0.v(p0Var.b(), "application/x-scte35", null, -1, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r4 != Long.MAX_VALUE) goto L15;
     */
    @Override // c.c.a.a.q1.g0.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(c.c.a.a.z1.z r11) {
        /*
            r10 = this;
            boolean r0 = r10.f2502c
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L29
            c.c.a.a.z1.k0 r0 = r10.f2500a
            long r3 = r0.c()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L14
            return
        L14:
            c.c.a.a.q1.y r0 = r10.f2501b
            r3 = 0
            c.c.a.a.z1.k0 r4 = r10.f2500a
            long r4 = r4.c()
            java.lang.String r6 = "application/x-scte35"
            c.c.a.a.l0 r3 = c.c.a.a.l0.u(r3, r6, r4)
            r0.b(r3)
            r0 = 1
            r10.f2502c = r0
        L29:
            int r7 = r11.a()
            c.c.a.a.q1.y r0 = r10.f2501b
            r0.a(r11, r7)
            c.c.a.a.q1.y r3 = r10.f2501b
            c.c.a.a.z1.k0 r11 = r10.f2500a
            long r4 = r11.f3760c
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L43
            long r0 = r11.f3760c
            long r4 = r11.f3759b
            long r1 = r4 + r0
            goto L4f
        L43:
            long r4 = r11.f3758a
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 == 0) goto L4f
            goto L50
        L4f:
            r4 = r1
        L50:
            r6 = 1
            r8 = 0
            r9 = 0
            r3.d(r4, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.g0.g0.c(c.c.a.a.z1.z):void");
    }
}
