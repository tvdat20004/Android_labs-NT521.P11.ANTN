package c.c.a.a;

import java.util.Objects;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f2020a;

    /* renamed from: b, reason: collision with root package name */
    public int f2021b;

    /* renamed from: c, reason: collision with root package name */
    public long f2022c;

    /* renamed from: d, reason: collision with root package name */
    public long f2023d;

    /* renamed from: e, reason: collision with root package name */
    public c.c.a.a.u1.u0.b f2024e = c.c.a.a.u1.u0.b.f2934e;

    public long a(int i, int i2) {
        c.c.a.a.u1.u0.a aVar = this.f2024e.f2937c[i];
        if (aVar.f2930a != -1) {
            return aVar.f2933d[i2];
        }
        return -9223372036854775807L;
    }

    public int b(long j) {
        c.c.a.a.u1.u0.b bVar = this.f2024e;
        long j2 = this.f2022c;
        Objects.requireNonNull(bVar);
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = 0;
        while (true) {
            long[] jArr = bVar.f2936b;
            if (i >= jArr.length || jArr[i] == Long.MIN_VALUE || (j < jArr[i] && bVar.f2937c[i].b())) {
                break;
            }
            i++;
        }
        if (i < bVar.f2936b.length) {
            return i;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10 >= r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r10 < r7) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(long r10) {
        /*
            r9 = this;
            c.c.a.a.u1.u0.b r0 = r9.f2024e
            long[] r1 = r0.f2936b
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
        L7:
            if (r1 < 0) goto L33
            r3 = -9223372036854775808
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            r6 = 0
            if (r5 != 0) goto L11
            goto L2e
        L11:
            long[] r5 = r0.f2936b
            r7 = r5[r1]
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto L29
            long r3 = r0.f2938d
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 == 0) goto L2d
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 >= 0) goto L2e
            goto L2d
        L29:
            int r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r3 >= 0) goto L2e
        L2d:
            r6 = r2
        L2e:
            if (r6 == 0) goto L33
            int r1 = r1 + (-1)
            goto L7
        L33:
            if (r1 < 0) goto L40
            c.c.a.a.u1.u0.a[] r10 = r0.f2937c
            r10 = r10[r1]
            boolean r10 = r10.b()
            if (r10 == 0) goto L40
            goto L41
        L40:
            r1 = -1
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.i1.c(long):int");
    }

    public long d(int i) {
        return this.f2024e.f2936b[i];
    }

    public int e(int i) {
        return this.f2024e.f2937c[i].a(-1);
    }

    public boolean f(int i, int i2) {
        c.c.a.a.u1.u0.a aVar = this.f2024e.f2937c[i];
        return (aVar.f2930a == -1 || aVar.f2932c[i2] == 0) ? false : true;
    }
}
