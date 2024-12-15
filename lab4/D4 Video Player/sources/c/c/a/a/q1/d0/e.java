package c.c.a.a.q1.d0;

import c.c.a.a.z1.z;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f2300a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2301b;

    /* renamed from: c, reason: collision with root package name */
    public final z f2302c;

    public e(b bVar) {
        z zVar = bVar.g1;
        this.f2302c = zVar;
        zVar.A(12);
        this.f2300a = zVar.s();
        this.f2301b = zVar.s();
    }

    @Override // c.c.a.a.q1.d0.d
    public int a() {
        return this.f2301b;
    }

    @Override // c.c.a.a.q1.d0.d
    public int b() {
        int i = this.f2300a;
        return i == 0 ? this.f2302c.s() : i;
    }

    @Override // c.c.a.a.q1.d0.d
    public boolean c() {
        return this.f2300a != 0;
    }
}
