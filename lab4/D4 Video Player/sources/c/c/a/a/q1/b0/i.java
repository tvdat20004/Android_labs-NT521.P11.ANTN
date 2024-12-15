package c.c.a.a.q1.b0;

import c.c.a.a.z1.z;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final z f2263a = new z(8);

    /* renamed from: b, reason: collision with root package name */
    public int f2264b;

    public final long a(c.c.a.a.q1.j jVar) {
        int i = 0;
        jVar.d(this.f2263a.f3800a, 0, 1, false);
        int i2 = this.f2263a.f3800a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        jVar.d(this.f2263a.f3800a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (this.f2263a.f3800a[i] & 255) + (i5 << 8);
        }
        this.f2264b = i4 + 1 + this.f2264b;
        return i5;
    }
}
