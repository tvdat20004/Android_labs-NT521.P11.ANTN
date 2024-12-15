package c.c.a.a.q1.g0;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final List<n0> f2512a;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.q1.y[] f2513b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2514c;

    /* renamed from: d, reason: collision with root package name */
    public int f2515d;

    /* renamed from: e, reason: collision with root package name */
    public int f2516e;

    /* renamed from: f, reason: collision with root package name */
    public long f2517f;

    public i(List<n0> list) {
        this.f2512a = list;
        this.f2513b = new c.c.a.a.q1.y[list.size()];
    }

    @Override // c.c.a.a.q1.g0.j
    public void a() {
        this.f2514c = false;
    }

    public final boolean b(c.c.a.a.z1.z zVar, int i) {
        if (zVar.a() == 0) {
            return false;
        }
        if (zVar.p() != i) {
            this.f2514c = false;
        }
        this.f2515d--;
        return this.f2514c;
    }

    @Override // c.c.a.a.q1.g0.j
    public void c(c.c.a.a.z1.z zVar) {
        if (this.f2514c) {
            if (this.f2515d != 2 || b(zVar, 32)) {
                if (this.f2515d != 1 || b(zVar, 0)) {
                    int i = zVar.f3801b;
                    int a2 = zVar.a();
                    for (c.c.a.a.q1.y yVar : this.f2513b) {
                        zVar.A(i);
                        yVar.a(zVar, a2);
                    }
                    this.f2516e += a2;
                }
            }
        }
    }

    @Override // c.c.a.a.q1.g0.j
    public void d() {
        if (this.f2514c) {
            for (c.c.a.a.q1.y yVar : this.f2513b) {
                yVar.d(this.f2517f, 1, this.f2516e, 0, null);
            }
            this.f2514c = false;
        }
    }

    @Override // c.c.a.a.q1.g0.j
    public void e(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f2514c = true;
        this.f2517f = j;
        this.f2516e = 0;
        this.f2515d = 2;
    }

    @Override // c.c.a.a.q1.g0.j
    public void f(c.c.a.a.q1.n nVar, p0 p0Var) {
        for (int i = 0; i < this.f2513b.length; i++) {
            n0 n0Var = this.f2512a.get(i);
            p0Var.a();
            c.c.a.a.q1.y j = nVar.j(p0Var.c(), 3);
            j.b(c.c.a.a.l0.t(p0Var.b(), "application/dvbsubs", null, -1, 0, Collections.singletonList(n0Var.f2555b), n0Var.f2554a, null));
            this.f2513b[i] = j;
        }
    }
}
