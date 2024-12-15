package c.c.a.a.q1.c0;

import c.c.a.a.q1.t;
import c.c.a.a.q1.w;
import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f2278a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f2279b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2280c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2281d;

    public e(long[] jArr, long[] jArr2, long j, long j2) {
        this.f2278a = jArr;
        this.f2279b = jArr2;
        this.f2280c = j;
        this.f2281d = j2;
    }

    @Override // c.c.a.a.q1.c0.c
    public long b(long j) {
        return this.f2278a[l0.c(this.f2279b, j, true, true)];
    }

    @Override // c.c.a.a.q1.v
    public boolean c() {
        return true;
    }

    @Override // c.c.a.a.q1.c0.c
    public long f() {
        return this.f2281d;
    }

    @Override // c.c.a.a.q1.v
    public t g(long j) {
        int c2 = l0.c(this.f2278a, j, true, true);
        long[] jArr = this.f2278a;
        long j2 = jArr[c2];
        long[] jArr2 = this.f2279b;
        w wVar = new w(j2, jArr2[c2]);
        if (j2 >= j || c2 == jArr.length - 1) {
            return new t(wVar);
        }
        int i = c2 + 1;
        return new t(wVar, new w(jArr[i], jArr2[i]));
    }

    @Override // c.c.a.a.q1.v
    public long j() {
        return this.f2280c;
    }
}
