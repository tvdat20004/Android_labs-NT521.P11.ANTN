package c.c.a.a.q1.h0;

import c.c.a.a.q1.t;
import c.c.a.a.q1.v;
import c.c.a.a.q1.w;
import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class b implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f2633a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2634b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2635c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2636d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2637e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2638f;
    public int g = -1;
    public long h = -1;

    public b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f2633a = i;
        this.f2634b = i2;
        this.f2635c = i3;
        this.f2636d = i4;
        this.f2637e = i5;
        this.f2638f = i6;
    }

    public long b(long j) {
        return (Math.max(0L, j - this.g) * 1000000) / this.f2635c;
    }

    @Override // c.c.a.a.q1.v
    public boolean c() {
        return true;
    }

    @Override // c.c.a.a.q1.v
    public t g(long j) {
        long j2 = this.h - this.g;
        int i = this.f2636d;
        long g = l0.g((((this.f2635c * j) / 1000000) / i) * i, 0L, j2 - i);
        long j3 = this.g + g;
        long b2 = b(j3);
        w wVar = new w(b2, j3);
        if (b2 < j) {
            int i2 = this.f2636d;
            if (g != j2 - i2) {
                long j4 = j3 + i2;
                return new t(wVar, new w(b(j4), j4));
            }
        }
        return new t(wVar);
    }

    @Override // c.c.a.a.q1.v
    public long j() {
        return (((this.h - this.g) / this.f2636d) * 1000000) / this.f2634b;
    }
}
