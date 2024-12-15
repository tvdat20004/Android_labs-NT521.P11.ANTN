package c.c.a.a.u1.w0;

import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.q1.h f3003a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3004b;

    public p(c.c.a.a.q1.h hVar, long j) {
        this.f3003a = hVar;
        this.f3004b = j;
    }

    @Override // c.c.a.a.u1.w0.o
    public long a(long j, long j2) {
        c.c.a.a.q1.h hVar = this.f3003a;
        return l0.c(hVar.f2626e, j + this.f3004b, true, true);
    }

    @Override // c.c.a.a.u1.w0.o
    public long b(long j) {
        return this.f3003a.f2626e[(int) j] - this.f3004b;
    }

    @Override // c.c.a.a.u1.w0.o
    public boolean c() {
        return true;
    }

    @Override // c.c.a.a.u1.w0.o
    public long d(long j, long j2) {
        return this.f3003a.f2625d[(int) j];
    }

    @Override // c.c.a.a.u1.w0.o
    public long e() {
        return 0L;
    }

    @Override // c.c.a.a.u1.w0.o
    public int f(long j) {
        return this.f3003a.f2622a;
    }

    @Override // c.c.a.a.u1.w0.o
    public c.c.a.a.u1.w0.x.i g(long j) {
        return new c.c.a.a.u1.w0.x.i(null, this.f3003a.f2624c[(int) j], r0.f2623b[r8]);
    }
}
