package c.c.a.a;

/* loaded from: classes.dex */
public abstract class q implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f2206a = new j1();

    public final long A() {
        k1 o = o();
        if (o.p()) {
            return -9223372036854775807L;
        }
        return o.m(v(), this.f2206a).a();
    }

    public final int B() {
        k1 o = o();
        if (o.p()) {
            return -1;
        }
        int v = v();
        int m = m();
        if (m == 1) {
            m = 0;
        }
        return o.e(v, m, r());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
    
        if (r1 == r0.a()) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int C() {
        /*
            r4 = this;
            c.c.a.a.k1 r0 = r4.o()
            boolean r1 = r0.p()
            if (r1 == 0) goto Lb
            goto L39
        Lb:
            int r1 = r4.v()
            int r2 = r4.m()
            r3 = 1
            if (r2 != r3) goto L17
            r2 = 0
        L17:
            r4.r()
            if (r2 == 0) goto L33
            if (r2 == r3) goto L3d
            r3 = 2
            if (r2 != r3) goto L2d
            int r2 = r0.a()
            if (r1 != r2) goto L3b
            int r0 = r0.c()
            r1 = r0
            goto L3d
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L33:
            int r0 = r0.a()
            if (r1 != r0) goto L3b
        L39:
            r1 = -1
            goto L3d
        L3b:
            int r1 = r1 + (-1)
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q.C():int");
    }

    public final boolean D() {
        k1 o = o();
        return !o.p() && o.m(v(), this.f2206a).f2029b;
    }
}
