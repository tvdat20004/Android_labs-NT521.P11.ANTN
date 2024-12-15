package c.c.a.a.u1.v0;

import c.c.a.a.l0;
import c.c.a.a.q1.x;
import c.c.a.a.q1.y;
import c.c.a.a.z1.z;

/* loaded from: classes.dex */
public final class e implements y {

    /* renamed from: a, reason: collision with root package name */
    public final int f2948a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2949b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f2950c;

    /* renamed from: d, reason: collision with root package name */
    public final c.c.a.a.q1.l f2951d = new c.c.a.a.q1.l();

    /* renamed from: e, reason: collision with root package name */
    public l0 f2952e;

    /* renamed from: f, reason: collision with root package name */
    public y f2953f;
    public long g;

    public e(int i, int i2, l0 l0Var) {
        this.f2948a = i;
        this.f2949b = i2;
        this.f2950c = l0Var;
    }

    @Override // c.c.a.a.q1.y
    public void a(z zVar, int i) {
        this.f2953f.a(zVar, i);
    }

    @Override // c.c.a.a.q1.y
    public void b(l0 l0Var) {
        l0 l0Var2 = this.f2950c;
        if (l0Var2 != null) {
            l0Var = l0Var.l(l0Var2);
        }
        this.f2952e = l0Var;
        this.f2953f.b(l0Var);
    }

    @Override // c.c.a.a.q1.y
    public int c(c.c.a.a.q1.j jVar, int i, boolean z) {
        return this.f2953f.c(jVar, i, z);
    }

    @Override // c.c.a.a.q1.y
    public void d(long j, int i, int i2, int i3, x xVar) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.f2953f = this.f2951d;
        }
        this.f2953f.d(j, i, i2, i3, xVar);
    }

    public void e(c cVar, long j) {
        if (cVar == null) {
            this.f2953f = this.f2951d;
            return;
        }
        this.g = j;
        y b2 = cVar.b(this.f2949b);
        this.f2953f = b2;
        l0 l0Var = this.f2952e;
        if (l0Var != null) {
            b2.b(l0Var);
        }
    }
}
