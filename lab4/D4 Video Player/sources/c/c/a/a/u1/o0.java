package c.c.a.a.u1;

import c.c.a.a.i1;
import c.c.a.a.k1;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o0 extends k1 {
    public static final Object k = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f2912b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2913c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2914d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2915e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2916f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final Object j;

    public o0(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, Object obj) {
        this.f2912b = j;
        this.f2913c = j2;
        this.f2914d = j3;
        this.f2915e = j4;
        this.f2916f = j5;
        this.g = j6;
        this.h = z;
        this.i = z2;
        this.j = obj;
    }

    public o0(long j, long j2, long j3, long j4, boolean z, boolean z2, Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj);
    }

    @Override // c.c.a.a.k1
    public int b(Object obj) {
        return k.equals(obj) ? 0 : -1;
    }

    @Override // c.c.a.a.k1
    public i1 g(int i, i1 i1Var, boolean z) {
        c.c.a.a.x1.p.f(i, 0, 1);
        Object obj = z ? k : null;
        long j = this.f2914d;
        long j2 = -this.f2916f;
        Objects.requireNonNull(i1Var);
        c.c.a.a.u1.u0.b bVar = c.c.a.a.u1.u0.b.f2934e;
        i1Var.f2020a = obj;
        i1Var.f2021b = 0;
        i1Var.f2022c = j;
        i1Var.f2023d = j2;
        i1Var.f2024e = bVar;
        return i1Var;
    }

    @Override // c.c.a.a.k1
    public int i() {
        return 1;
    }

    @Override // c.c.a.a.k1
    public Object l(int i) {
        c.c.a.a.x1.p.f(i, 0, 1);
        return k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r1 > r5) goto L15;
     */
    @Override // c.c.a.a.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c.c.a.a.j1 n(int r9, c.c.a.a.j1 r10, boolean r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            c.c.a.a.x1.p.f(r9, r0, r1)
            if (r11 == 0) goto La
            java.lang.Object r9 = r8.j
            goto Lb
        La:
            r9 = 0
        Lb:
            long r1 = r8.g
            boolean r11 = r8.i
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r11 == 0) goto L29
            r5 = 0
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 == 0) goto L29
            long r5 = r8.f2915e
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L23
            goto L28
        L23:
            long r1 = r1 + r12
            int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r12 <= 0) goto L29
        L28:
            r1 = r3
        L29:
            boolean r12 = r8.h
            long r3 = r8.f2915e
            long r5 = r8.f2916f
            r10.f2028a = r9
            r10.f2029b = r12
            r10.f2030c = r11
            r10.f2033f = r1
            r10.g = r3
            r10.f2031d = r0
            r10.f2032e = r0
            r10.h = r5
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.o0.n(int, c.c.a.a.j1, boolean, long):c.c.a.a.j1");
    }

    @Override // c.c.a.a.k1
    public int o() {
        return 1;
    }
}
