package b.f.b.l;

import b.f.b.k;
import b.f.b.l.c;
import b.f.b.l.d;

/* loaded from: classes.dex */
public class a extends h {
    public int n0 = 0;
    public boolean o0 = true;
    public int p0 = 0;
    public boolean q0 = false;

    public boolean P() {
        int i;
        c h;
        c h2;
        c h3;
        int i2;
        int i3;
        c.a aVar = c.a.BOTTOM;
        c.a aVar2 = c.a.TOP;
        c.a aVar3 = c.a.RIGHT;
        c.a aVar4 = c.a.LEFT;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.m0;
            if (i4 >= i) {
                break;
            }
            d dVar = this.l0[i4];
            if ((this.o0 || dVar.d()) && ((((i2 = this.n0) == 0 || i2 == 1) && !dVar.y()) || (((i3 = this.n0) == 2 || i3 == 3) && !dVar.z()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.m0; i6++) {
            d dVar2 = this.l0[i6];
            if (this.o0 || dVar2.d()) {
                if (!z2) {
                    int i7 = this.n0;
                    if (i7 == 0) {
                        h3 = dVar2.h(aVar4);
                    } else if (i7 == 1) {
                        h3 = dVar2.h(aVar3);
                    } else if (i7 == 2) {
                        h3 = dVar2.h(aVar2);
                    } else {
                        if (i7 == 3) {
                            h3 = dVar2.h(aVar);
                        }
                        z2 = true;
                    }
                    i5 = h3.c();
                    z2 = true;
                }
                int i8 = this.n0;
                if (i8 == 0) {
                    h2 = dVar2.h(aVar4);
                } else {
                    if (i8 == 1) {
                        h = dVar2.h(aVar3);
                    } else if (i8 == 2) {
                        h2 = dVar2.h(aVar2);
                    } else if (i8 == 3) {
                        h = dVar2.h(aVar);
                    }
                    i5 = Math.max(i5, h.c());
                }
                i5 = Math.min(i5, h2.c());
            }
        }
        int i9 = i5 + this.p0;
        int i10 = this.n0;
        if (i10 == 0 || i10 == 1) {
            E(i9, i9);
        } else {
            F(i9, i9);
        }
        this.q0 = true;
        return true;
    }

    public int Q() {
        int i = this.n0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // b.f.b.l.d
    public void c(b.f.b.e eVar, boolean z) {
        c[] cVarArr;
        boolean z2;
        k kVar;
        c cVar;
        int i;
        int i2;
        int i3;
        k kVar2;
        int i4;
        d.a aVar = d.a.MATCH_CONSTRAINT;
        c[] cVarArr2 = this.L;
        cVarArr2[0] = this.D;
        cVarArr2[2] = this.E;
        cVarArr2[1] = this.F;
        cVarArr2[3] = this.G;
        int i5 = 0;
        while (true) {
            cVarArr = this.L;
            if (i5 >= cVarArr.length) {
                break;
            }
            cVarArr[i5].i = eVar.l(cVarArr[i5]);
            i5++;
        }
        int i6 = this.n0;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        c cVar2 = cVarArr[i6];
        if (!this.q0) {
            P();
        }
        if (this.q0) {
            this.q0 = false;
            int i7 = this.n0;
            if (i7 == 0 || i7 == 1) {
                eVar.e(this.D.i, this.U);
                kVar2 = this.F.i;
                i4 = this.U;
            } else {
                if (i7 != 2 && i7 != 3) {
                    return;
                }
                eVar.e(this.E.i, this.V);
                kVar2 = this.G.i;
                i4 = this.V;
            }
            eVar.e(kVar2, i4);
            return;
        }
        for (int i8 = 0; i8 < this.m0; i8++) {
            d dVar = this.l0[i8];
            if ((this.o0 || dVar.d()) && ((((i2 = this.n0) == 0 || i2 == 1) && dVar.l() == aVar && dVar.D.f970f != null && dVar.F.f970f != null) || (((i3 = this.n0) == 2 || i3 == 3) && dVar.p() == aVar && dVar.E.f970f != null && dVar.G.f970f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.D.e() || this.F.e();
        boolean z4 = this.E.e() || this.G.e();
        int i9 = !z2 && (((i = this.n0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4)))) ? 5 : 4;
        for (int i10 = 0; i10 < this.m0; i10++) {
            d dVar2 = this.l0[i10];
            if (this.o0 || dVar2.d()) {
                k l = eVar.l(dVar2.L[this.n0]);
                c[] cVarArr3 = dVar2.L;
                int i11 = this.n0;
                cVarArr3[i11].i = l;
                int i12 = (cVarArr3[i11].f970f == null || cVarArr3[i11].f970f.f968d != this) ? 0 : cVarArr3[i11].g + 0;
                if (i11 == 0 || i11 == 2) {
                    k kVar3 = cVar2.i;
                    int i13 = this.p0 - i12;
                    b.f.b.c m = eVar.m();
                    k n = eVar.n();
                    n.f956d = 0;
                    m.f(kVar3, l, n, i13);
                    eVar.c(m);
                } else {
                    k kVar4 = cVar2.i;
                    int i14 = this.p0 + i12;
                    b.f.b.c m2 = eVar.m();
                    k n2 = eVar.n();
                    n2.f956d = 0;
                    m2.e(kVar4, l, n2, i14);
                    eVar.c(m2);
                }
                eVar.d(cVar2.i, l, this.p0 + i12, i9);
            }
        }
        int i15 = this.n0;
        if (i15 == 0) {
            eVar.d(this.F.i, this.D.i, 0, 8);
            eVar.d(this.D.i, this.P.F.i, 0, 4);
            kVar = this.D.i;
            cVar = this.P.D;
        } else if (i15 == 1) {
            eVar.d(this.D.i, this.F.i, 0, 8);
            eVar.d(this.D.i, this.P.D.i, 0, 4);
            kVar = this.D.i;
            cVar = this.P.F;
        } else if (i15 == 2) {
            eVar.d(this.G.i, this.E.i, 0, 8);
            eVar.d(this.E.i, this.P.G.i, 0, 4);
            kVar = this.E.i;
            cVar = this.P.E;
        } else {
            if (i15 != 3) {
                return;
            }
            eVar.d(this.E.i, this.G.i, 0, 8);
            eVar.d(this.E.i, this.P.E.i, 0, 4);
            kVar = this.E.i;
            cVar = this.P.G;
        }
        eVar.d(kVar, cVar.i, 0, 0);
    }

    @Override // b.f.b.l.d
    public boolean d() {
        return true;
    }

    @Override // b.f.b.l.d
    public String toString() {
        StringBuilder j = c.a.a.a.a.j("[Barrier] ");
        j.append(this.d0);
        j.append(" {");
        String sb = j.toString();
        for (int i = 0; i < this.m0; i++) {
            d dVar = this.l0[i];
            if (i > 0) {
                sb = c.a.a.a.a.g(sb, ", ");
            }
            StringBuilder j2 = c.a.a.a.a.j(sb);
            j2.append(dVar.d0);
            sb = j2.toString();
        }
        return c.a.a.a.a.g(sb, "}");
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
