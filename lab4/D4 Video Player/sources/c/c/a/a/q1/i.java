package c.c.a.a.q1;

import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public abstract class i implements v {

    /* renamed from: a, reason: collision with root package name */
    public final long f2641a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2642b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2643c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2644d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2645e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2646f;

    public i(long j, long j2, int i, int i2) {
        long d2;
        this.f2641a = j;
        this.f2642b = j2;
        this.f2643c = i2 == -1 ? 1 : i2;
        this.f2645e = i;
        if (j == -1) {
            this.f2644d = -1L;
            d2 = -9223372036854775807L;
        } else {
            this.f2644d = j - j2;
            d2 = d(j, j2, i);
        }
        this.f2646f = d2;
    }

    public static long d(long j, long j2, int i) {
        return ((Math.max(0L, j - j2) * 8) * 1000000) / i;
    }

    public long a(long j) {
        return d(j, this.f2642b, this.f2645e);
    }

    @Override // c.c.a.a.q1.v
    public boolean c() {
        return this.f2644d != -1;
    }

    @Override // c.c.a.a.q1.v
    public t g(long j) {
        long j2 = this.f2644d;
        if (j2 == -1) {
            return new t(new w(0L, this.f2642b));
        }
        long j3 = this.f2643c;
        long g = this.f2642b + l0.g((((this.f2645e * j) / 8000000) / j3) * j3, 0L, j2 - j3);
        long a2 = a(g);
        w wVar = new w(a2, g);
        if (a2 < j) {
            int i = this.f2643c;
            if (i + g < this.f2641a) {
                long j4 = g + i;
                return new t(wVar, new w(a(j4), j4));
            }
        }
        return new t(wVar);
    }

    @Override // c.c.a.a.q1.v
    public long j() {
        return this.f2646f;
    }
}
