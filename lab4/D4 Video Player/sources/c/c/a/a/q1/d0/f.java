package c.c.a.a.q1.d0;

import c.c.a.a.z1.z;

/* loaded from: classes.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final z f2303a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2304b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2305c;

    /* renamed from: d, reason: collision with root package name */
    public int f2306d;

    /* renamed from: e, reason: collision with root package name */
    public int f2307e;

    public f(b bVar) {
        z zVar = bVar.g1;
        this.f2303a = zVar;
        zVar.A(12);
        this.f2305c = zVar.s() & 255;
        this.f2304b = zVar.s();
    }

    @Override // c.c.a.a.q1.d0.d
    public int a() {
        return this.f2304b;
    }

    @Override // c.c.a.a.q1.d0.d
    public int b() {
        int i = this.f2305c;
        if (i == 8) {
            return this.f2303a.p();
        }
        if (i == 16) {
            return this.f2303a.u();
        }
        int i2 = this.f2306d;
        this.f2306d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f2307e & 15;
        }
        int p = this.f2303a.p();
        this.f2307e = p;
        return (p & 240) >> 4;
    }

    @Override // c.c.a.a.q1.d0.d
    public boolean c() {
        return false;
    }
}
