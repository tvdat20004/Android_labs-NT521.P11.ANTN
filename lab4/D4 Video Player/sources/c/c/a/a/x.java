package c.c.a.a;

/* loaded from: classes.dex */
public final class x implements c.c.a.a.z1.s {

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.z1.g0 f3454b;

    /* renamed from: c, reason: collision with root package name */
    public final w f3455c;

    /* renamed from: d, reason: collision with root package name */
    public b1 f3456d;

    /* renamed from: e, reason: collision with root package name */
    public c.c.a.a.z1.s f3457e;

    public x(w wVar, c.c.a.a.z1.g gVar) {
        this.f3455c = wVar;
        this.f3454b = new c.c.a.a.z1.g0(gVar);
    }

    @Override // c.c.a.a.z1.s
    public u0 a() {
        c.c.a.a.z1.s sVar = this.f3457e;
        return sVar != null ? sVar.a() : this.f3454b.f3744f;
    }

    @Override // c.c.a.a.z1.s
    public u0 b(u0 u0Var) {
        c.c.a.a.z1.s sVar = this.f3457e;
        if (sVar != null) {
            u0Var = sVar.b(u0Var);
        }
        this.f3454b.b(u0Var);
        ((i0) this.f3455c).h.b(17, u0Var).sendToTarget();
        return u0Var;
    }

    public final void c() {
        this.f3454b.c(this.f3457e.i());
        u0 a2 = this.f3457e.a();
        if (a2.equals(this.f3454b.f3744f)) {
            return;
        }
        c.c.a.a.z1.g0 g0Var = this.f3454b;
        if (g0Var.f3741c) {
            g0Var.c(g0Var.i());
        }
        g0Var.f3744f = a2;
        ((i0) this.f3455c).h.b(17, a2).sendToTarget();
    }

    public final boolean d() {
        b1 b1Var = this.f3456d;
        return (b1Var == null || b1Var.d() || (!this.f3456d.c() && ((r) this.f3456d).j())) ? false : true;
    }

    @Override // c.c.a.a.z1.s
    public long i() {
        return d() ? this.f3457e.i() : this.f3454b.i();
    }
}
