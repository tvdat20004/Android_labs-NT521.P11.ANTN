package c.c.a.a.u1.x0;

import c.c.a.a.m0;
import c.c.a.a.u1.k0;
import c.c.a.a.u1.l0;
import c.c.a.a.u1.s0;

/* loaded from: classes.dex */
public final class r implements l0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f3177b;

    /* renamed from: c, reason: collision with root package name */
    public final t f3178c;

    /* renamed from: d, reason: collision with root package name */
    public int f3179d = -1;

    public r(t tVar, int i) {
        this.f3178c = tVar;
        this.f3177b = i;
    }

    @Override // c.c.a.a.u1.l0
    public void a() {
        if (this.f3179d != -2) {
            this.f3178c.B();
        } else {
            s0 s0Var = this.f3178c.F;
            throw new y(s0Var.f2923c[this.f3177b].f2919c[0].j);
        }
    }

    public void b() {
        c.c.a.a.x1.p.c(this.f3179d == -1);
        t tVar = this.f3178c;
        int i = this.f3177b;
        int i2 = tVar.H[i];
        if (i2 == -1) {
            if (tVar.G.i(tVar.F.f2923c[i]) != -1) {
                i2 = -3;
            }
            i2 = -2;
        } else {
            boolean[] zArr = tVar.K;
            if (!zArr[i2]) {
                zArr[i2] = true;
            }
            i2 = -2;
        }
        this.f3179d = i2;
    }

    @Override // c.c.a.a.u1.l0
    public boolean c() {
        if (this.f3179d != -3) {
            if (!d()) {
                return false;
            }
            t tVar = this.f3178c;
            if (!(tVar.Q || (!tVar.z() && tVar.r[this.f3179d].o()))) {
                return false;
            }
        }
        return true;
    }

    public final boolean d() {
        int i = this.f3179d;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // c.c.a.a.u1.l0
    public int j(m0 m0Var, c.c.a.a.o1.g gVar, boolean z) {
        c.c.a.a.p1.e eVar;
        if (this.f3179d == -3) {
            gVar.e(4);
            return -4;
        }
        if (!d()) {
            return -3;
        }
        t tVar = this.f3178c;
        int i = this.f3179d;
        if (tVar.z()) {
            return -3;
        }
        int i2 = 0;
        if (!tVar.k.isEmpty()) {
            int i3 = 0;
            while (true) {
                boolean z2 = true;
                if (i3 >= tVar.k.size() - 1) {
                    break;
                }
                int i4 = tVar.k.get(i3).j;
                int length = tVar.r.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        if (tVar.K[i5] && tVar.r[i5].p() == i4) {
                            z2 = false;
                            break;
                        }
                        i5++;
                    } else {
                        break;
                    }
                }
                if (!z2) {
                    break;
                }
                i3++;
            }
            c.c.a.a.z1.l0.A(tVar.k, 0, i3);
            p pVar = tVar.k.get(0);
            c.c.a.a.l0 l0Var = pVar.f2944c;
            if (!l0Var.equals(tVar.D)) {
                tVar.i.b(tVar.f3180b, l0Var, pVar.f2945d, pVar.f2946e, pVar.f2947f);
            }
            tVar.D = l0Var;
        }
        int s = tVar.r[i].s(m0Var, gVar, z, tVar.Q, tVar.M);
        if (s == -5) {
            c.c.a.a.l0 l0Var2 = m0Var.f2058a;
            if (i == tVar.y) {
                int p = tVar.r[i].p();
                while (i2 < tVar.k.size() && tVar.k.get(i2).j != p) {
                    i2++;
                }
                l0Var2 = l0Var2.l(i2 < tVar.k.size() ? tVar.k.get(i2).f2944c : tVar.C);
            }
            c.c.a.a.p1.e eVar2 = l0Var2.m;
            if (eVar2 != null && (eVar = tVar.q.get(eVar2.f2204d)) != null) {
                l0Var2 = l0Var2.i(eVar);
            }
            m0Var.f2058a = l0Var2;
        }
        return s;
    }

    @Override // c.c.a.a.u1.l0
    public int r(long j) {
        int e2;
        if (!d()) {
            return 0;
        }
        t tVar = this.f3178c;
        int i = this.f3179d;
        if (tVar.z()) {
            return 0;
        }
        k0 k0Var = tVar.r[i];
        if (!tVar.Q || j <= k0Var.l()) {
            e2 = k0Var.e(j, true, true);
            if (e2 == -1) {
                return 0;
            }
        } else {
            e2 = k0Var.f();
        }
        return e2;
    }
}
