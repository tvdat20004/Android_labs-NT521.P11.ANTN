package c.c.a.a;

/* loaded from: classes.dex */
public abstract class r implements b1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f2682b;

    /* renamed from: c, reason: collision with root package name */
    public c1 f2683c;

    /* renamed from: d, reason: collision with root package name */
    public int f2684d;

    /* renamed from: e, reason: collision with root package name */
    public int f2685e;

    /* renamed from: f, reason: collision with root package name */
    public c.c.a.a.u1.l0 f2686f;
    public l0[] g;
    public long h;
    public long i = Long.MIN_VALUE;
    public boolean j;

    public r(int i) {
        this.f2682b = i;
    }

    public static boolean u(c.c.a.a.p1.e eVar) {
        return eVar == null;
    }

    @Override // c.c.a.a.b1
    public c.c.a.a.z1.s e() {
        return null;
    }

    @Override // c.c.a.a.b1
    public void g(int i, Object obj) {
    }

    @Override // c.c.a.a.b1
    public /* synthetic */ void h(float f2) {
        a1.a(this, f2);
    }

    public final boolean j() {
        return this.i == Long.MIN_VALUE;
    }

    public abstract void k();

    public void l(boolean z) {
    }

    public abstract void m(long j, boolean z);

    public void n() {
    }

    public void o() {
    }

    public void p() {
    }

    public abstract void q(l0[] l0VarArr, long j);

    public final int r(m0 m0Var, c.c.a.a.o1.g gVar, boolean z) {
        int j = this.f2686f.j(m0Var, gVar, z);
        if (j == -4) {
            if (gVar.h()) {
                this.i = Long.MIN_VALUE;
                return this.j ? -4 : -3;
            }
            long j2 = gVar.f2181e + this.h;
            gVar.f2181e = j2;
            this.i = Math.max(this.i, j2);
        } else if (j == -5) {
            l0 l0Var = m0Var.f2058a;
            long j3 = l0Var.n;
            if (j3 != Long.MAX_VALUE) {
                m0Var.f2058a = l0Var.n(j3 + this.h);
            }
        }
        return j;
    }

    public final void s() {
        c.c.a.a.x1.p.g(this.f2685e == 0);
        n();
    }

    public abstract int t(l0 l0Var);

    public int v() {
        return 0;
    }
}
