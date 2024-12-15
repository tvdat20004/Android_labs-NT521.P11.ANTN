package b.f.b.l;

import b.f.b.k;
import b.f.b.l.c;
import b.f.b.l.d;

/* loaded from: classes.dex */
public class f extends d {
    public float l0 = -1.0f;
    public int m0 = -1;
    public int n0 = -1;
    public c o0 = this.E;
    public int p0 = 0;
    public boolean q0;

    public f() {
        this.M.clear();
        this.M.add(this.o0);
        int length = this.L.length;
        for (int i = 0; i < length; i++) {
            this.L[i] = this.o0;
        }
    }

    @Override // b.f.b.l.d
    public void N(b.f.b.e eVar, boolean z) {
        if (this.P == null) {
            return;
        }
        int o = eVar.o(this.o0);
        if (this.p0 == 1) {
            this.U = o;
            this.V = 0;
            G(this.P.k());
            L(0);
            return;
        }
        this.U = 0;
        this.V = o;
        L(this.P.q());
        G(0);
    }

    public void O(int i) {
        c cVar = this.o0;
        cVar.f966b = i;
        cVar.f967c = true;
        this.q0 = true;
    }

    public void P(int i) {
        if (this.p0 == i) {
            return;
        }
        this.p0 = i;
        this.M.clear();
        this.o0 = this.p0 == 1 ? this.D : this.E;
        this.M.add(this.o0);
        int length = this.L.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.L[i2] = this.o0;
        }
    }

    @Override // b.f.b.l.d
    public void c(b.f.b.e eVar, boolean z) {
        k l;
        k l2;
        k l3;
        d.a aVar = d.a.WRAP_CONTENT;
        e eVar2 = (e) this.P;
        if (eVar2 == null) {
            return;
        }
        Object h = eVar2.h(c.a.LEFT);
        Object h2 = eVar2.h(c.a.RIGHT);
        d dVar = this.P;
        boolean z2 = dVar != null && dVar.O[0] == aVar;
        if (this.p0 == 0) {
            h = eVar2.h(c.a.TOP);
            h2 = eVar2.h(c.a.BOTTOM);
            d dVar2 = this.P;
            z2 = dVar2 != null && dVar2.O[1] == aVar;
        }
        if (this.q0) {
            c cVar = this.o0;
            if (cVar.f967c) {
                k l4 = eVar.l(cVar);
                eVar.e(l4, this.o0.c());
                if (this.m0 != -1) {
                    if (z2) {
                        l3 = eVar.l(h2);
                        eVar.f(l3, l4, 0, 5);
                    }
                    this.q0 = false;
                    return;
                }
                if (this.n0 != -1 && z2) {
                    l3 = eVar.l(h2);
                    eVar.f(l4, eVar.l(h), 0, 5);
                    eVar.f(l3, l4, 0, 5);
                }
                this.q0 = false;
                return;
            }
        }
        if (this.m0 != -1) {
            l = eVar.l(this.o0);
            eVar.d(l, eVar.l(h), this.m0, 8);
            if (!z2) {
                return;
            } else {
                l2 = eVar.l(h2);
            }
        } else {
            if (this.n0 == -1) {
                if (this.l0 != -1.0f) {
                    k l5 = eVar.l(this.o0);
                    k l6 = eVar.l(h2);
                    float f2 = this.l0;
                    b.f.b.c m = eVar.m();
                    m.f931d.c(l5, -1.0f);
                    m.f931d.c(l6, f2);
                    eVar.c(m);
                    return;
                }
                return;
            }
            l = eVar.l(this.o0);
            l2 = eVar.l(h2);
            eVar.d(l, l2, -this.n0, 8);
            if (!z2) {
                return;
            } else {
                eVar.f(l, eVar.l(h), 0, 5);
            }
        }
        eVar.f(l2, l, 0, 5);
    }

    @Override // b.f.b.l.d
    public boolean d() {
        return true;
    }

    @Override // b.f.b.l.d
    public c h(c.a aVar) {
        switch (aVar) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
            case RIGHT:
                if (this.p0 == 1) {
                    return this.o0;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.p0 == 0) {
                    return this.o0;
                }
                break;
        }
        throw new AssertionError(aVar.name());
    }

    @Override // b.f.b.l.d
    public boolean y() {
        return this.q0;
    }

    @Override // b.f.b.l.d
    public boolean z() {
        return this.q0;
    }
}
