package c.c.a.a.q1.g0;

/* loaded from: classes.dex */
public class k0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.z1.y f2529a = new c.c.a.a.z1.y(new byte[4]);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f2530b;

    public k0(m0 m0Var) {
        this.f2530b = m0Var;
    }

    @Override // c.c.a.a.q1.g0.d0
    public void b(c.c.a.a.z1.k0 k0Var, c.c.a.a.q1.n nVar, p0 p0Var) {
    }

    @Override // c.c.a.a.q1.g0.d0
    public void c(c.c.a.a.z1.z zVar) {
        if (zVar.p() != 0) {
            return;
        }
        zVar.B(7);
        int a2 = zVar.a() / 4;
        for (int i = 0; i < a2; i++) {
            zVar.b(this.f2529a, 4);
            int f2 = this.f2529a.f(16);
            this.f2529a.l(3);
            if (f2 == 0) {
                this.f2529a.l(13);
            } else {
                int f3 = this.f2529a.f(13);
                m0 m0Var = this.f2530b;
                m0Var.f2547f.put(f3, new e0(new l0(m0Var, f3)));
                this.f2530b.l++;
            }
        }
        m0 m0Var2 = this.f2530b;
        if (m0Var2.f2542a != 2) {
            m0Var2.f2547f.remove(0);
        }
    }
}
