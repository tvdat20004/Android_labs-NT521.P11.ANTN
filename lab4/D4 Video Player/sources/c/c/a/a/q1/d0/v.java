package c.c.a.a.q1.d0;

import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final s f2371a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2372b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f2373c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f2374d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2375e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f2376f;
    public final int[] g;
    public final long h;

    public v(s sVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        c.c.a.a.x1.p.c(iArr.length == jArr2.length);
        c.c.a.a.x1.p.c(jArr.length == jArr2.length);
        c.c.a.a.x1.p.c(iArr2.length == jArr2.length);
        this.f2371a = sVar;
        this.f2373c = jArr;
        this.f2374d = iArr;
        this.f2375e = i;
        this.f2376f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.f2372b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j) {
        for (int c2 = l0.c(this.f2376f, j, true, false); c2 >= 0; c2--) {
            if ((this.g[c2] & 1) != 0) {
                return c2;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int b2 = l0.b(this.f2376f, j, true, false); b2 < this.f2376f.length; b2++) {
            if ((this.g[b2] & 1) != 0) {
                return b2;
            }
        }
        return -1;
    }
}
