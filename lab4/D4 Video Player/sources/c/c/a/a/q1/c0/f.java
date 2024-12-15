package c.c.a.a.q1.c0;

import c.c.a.a.q1.t;
import c.c.a.a.q1.w;
import c.c.a.a.z1.l0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    public final long f2282a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2283b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2284c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2285d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2286e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f2287f;

    public f(long j, int i, long j2, long j3, long[] jArr) {
        this.f2282a = j;
        this.f2283b = i;
        this.f2284c = j2;
        this.f2287f = jArr;
        this.f2285d = j3;
        this.f2286e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // c.c.a.a.q1.c0.c
    public long b(long j) {
        long j2 = j - this.f2282a;
        if (!c() || j2 <= this.f2283b) {
            return 0L;
        }
        long[] jArr = this.f2287f;
        Objects.requireNonNull(jArr);
        double d2 = (j2 * 256.0d) / this.f2285d;
        int c2 = l0.c(jArr, (long) d2, true, true);
        long j3 = this.f2284c;
        long j4 = (c2 * j3) / 100;
        long j5 = jArr[c2];
        int i = c2 + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (c2 == 99 ? 256L : jArr[i]) ? 0.0d : (d2 - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // c.c.a.a.q1.v
    public boolean c() {
        return this.f2287f != null;
    }

    @Override // c.c.a.a.q1.c0.c
    public long f() {
        return this.f2286e;
    }

    @Override // c.c.a.a.q1.v
    public t g(long j) {
        if (!c()) {
            return new t(new w(0L, this.f2282a + this.f2283b));
        }
        long g = l0.g(j, 0L, this.f2284c);
        double d2 = (g * 100.0d) / this.f2284c;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = this.f2287f;
                Objects.requireNonNull(jArr);
                double d4 = jArr[i];
                d3 = d4 + (((i == 99 ? 256.0d : jArr[i + 1]) - d4) * (d2 - i));
            }
        }
        return new t(new w(g, this.f2282a + l0.g(Math.round((d3 / 256.0d) * this.f2285d), this.f2283b, this.f2285d - 1)));
    }

    @Override // c.c.a.a.q1.v
    public long j() {
        return this.f2284c;
    }
}
