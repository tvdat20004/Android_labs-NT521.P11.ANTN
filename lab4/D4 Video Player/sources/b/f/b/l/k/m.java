package b.f.b.l.k;

import b.f.b.l.c;
import b.f.b.l.d;
import java.util.List;

/* loaded from: classes.dex */
public class m extends s {
    public static int[] k = new int[2];

    public m(b.f.b.l.d dVar) {
        super(dVar);
        this.h.f1012e = g.LEFT;
        this.i.f1012e = g.RIGHT;
        this.f1034f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0264, code lost:
    
        if (r7 != 1) goto L135;
     */
    @Override // b.f.b.l.k.s, b.f.b.l.k.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(b.f.b.l.k.e r18) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.b.l.k.m.a(b.f.b.l.k.e):void");
    }

    @Override // b.f.b.l.k.s
    public void d() {
        b.f.b.l.d dVar;
        b.f.b.l.d dVar2;
        h hVar;
        b.f.b.l.c cVar;
        List<e> list;
        e eVar;
        h hVar2;
        h hVar3;
        h hVar4;
        int i;
        b.f.b.l.d dVar3;
        d.a aVar = d.a.MATCH_CONSTRAINT;
        d.a aVar2 = d.a.MATCH_PARENT;
        d.a aVar3 = d.a.FIXED;
        b.f.b.l.d dVar4 = this.f1030b;
        if (dVar4.f976a) {
            this.f1033e.c(dVar4.q());
        }
        if (!this.f1033e.j) {
            d.a l = this.f1030b.l();
            this.f1032d = l;
            if (l != aVar) {
                if (l == aVar2 && (((dVar3 = this.f1030b.P) != null && dVar3.l() == aVar3) || dVar3.l() == aVar2)) {
                    int q = (dVar3.q() - this.f1030b.D.d()) - this.f1030b.F.d();
                    b(this.h, dVar3.f979d.h, this.f1030b.D.d());
                    b(this.i, dVar3.f979d.i, -this.f1030b.F.d());
                    this.f1033e.c(q);
                    return;
                }
                if (this.f1032d == aVar3) {
                    this.f1033e.c(this.f1030b.q());
                }
            }
        } else if (this.f1032d == aVar2 && (((dVar = this.f1030b.P) != null && dVar.l() == aVar3) || dVar.l() == aVar2)) {
            b(this.h, dVar.f979d.h, this.f1030b.D.d());
            b(this.i, dVar.f979d.i, -this.f1030b.F.d());
            return;
        }
        i iVar = this.f1033e;
        if (iVar.j) {
            b.f.b.l.d dVar5 = this.f1030b;
            if (dVar5.f976a) {
                b.f.b.l.c[] cVarArr = dVar5.L;
                if (cVarArr[0].f970f != null && cVarArr[1].f970f != null) {
                    if (dVar5.v()) {
                        this.h.f1013f = this.f1030b.L[0].d();
                        hVar = this.i;
                        cVar = this.f1030b.L[1];
                        hVar.f1013f = -cVar.d();
                        return;
                    }
                    h h = h(this.f1030b.L[0]);
                    if (h != null) {
                        h hVar5 = this.h;
                        int d2 = this.f1030b.L[0].d();
                        hVar5.l.add(h);
                        hVar5.f1013f = d2;
                        h.k.add(hVar5);
                    }
                    h h2 = h(this.f1030b.L[1]);
                    if (h2 != null) {
                        h hVar6 = this.i;
                        int i2 = -this.f1030b.L[1].d();
                        hVar6.l.add(h2);
                        hVar6.f1013f = i2;
                        h2.k.add(hVar6);
                    }
                    this.h.f1009b = true;
                    this.i.f1009b = true;
                    return;
                }
                if (cVarArr[0].f970f != null) {
                    h h3 = h(cVarArr[0]);
                    if (h3 == null) {
                        return;
                    }
                    h hVar7 = this.h;
                    int d3 = this.f1030b.L[0].d();
                    hVar7.l.add(h3);
                    hVar7.f1013f = d3;
                    h3.k.add(hVar7);
                } else {
                    if (cVarArr[1].f970f != null) {
                        h h4 = h(cVarArr[1]);
                        if (h4 != null) {
                            h hVar8 = this.i;
                            int i3 = -this.f1030b.L[1].d();
                            hVar8.l.add(h4);
                            hVar8.f1013f = i3;
                            h4.k.add(hVar8);
                            hVar3 = this.h;
                            hVar4 = this.i;
                            i = -this.f1033e.g;
                            b(hVar3, hVar4, i);
                            return;
                        }
                        return;
                    }
                    if ((dVar5 instanceof b.f.b.l.g) || dVar5.P == null || dVar5.h(c.a.CENTER).f970f != null) {
                        return;
                    }
                    b.f.b.l.d dVar6 = this.f1030b;
                    b(this.h, dVar6.P.f979d.h, dVar6.r());
                }
                hVar3 = this.i;
                hVar4 = this.h;
                i = this.f1033e.g;
                b(hVar3, hVar4, i);
                return;
            }
        }
        if (this.f1032d == aVar) {
            b.f.b.l.d dVar7 = this.f1030b;
            int i4 = dVar7.m;
            if (i4 == 2) {
                b.f.b.l.d dVar8 = dVar7.P;
                if (dVar8 != null) {
                    i iVar2 = dVar8.f980e.f1033e;
                    iVar.l.add(iVar2);
                    iVar2.k.add(this.f1033e);
                    i iVar3 = this.f1033e;
                    iVar3.f1009b = true;
                    iVar3.k.add(this.h);
                    list = this.f1033e.k;
                    eVar = this.i;
                    list.add(eVar);
                }
            } else if (i4 == 3) {
                if (dVar7.n == 3) {
                    this.h.f1008a = this;
                    this.i.f1008a = this;
                    o oVar = dVar7.f980e;
                    oVar.h.f1008a = this;
                    oVar.i.f1008a = this;
                    iVar.f1008a = this;
                    if (dVar7.w()) {
                        this.f1033e.l.add(this.f1030b.f980e.f1033e);
                        this.f1030b.f980e.f1033e.k.add(this.f1033e);
                        o oVar2 = this.f1030b.f980e;
                        oVar2.f1033e.f1008a = this;
                        this.f1033e.l.add(oVar2.h);
                        this.f1033e.l.add(this.f1030b.f980e.i);
                        this.f1030b.f980e.h.k.add(this.f1033e);
                        list = this.f1030b.f980e.i.k;
                        eVar = this.f1033e;
                        list.add(eVar);
                    } else if (this.f1030b.v()) {
                        this.f1030b.f980e.f1033e.l.add(this.f1033e);
                        list = this.f1033e.k;
                        eVar = this.f1030b.f980e.f1033e;
                        list.add(eVar);
                    } else {
                        hVar2 = this.f1030b.f980e.f1033e;
                    }
                } else {
                    i iVar4 = dVar7.f980e.f1033e;
                    iVar.l.add(iVar4);
                    iVar4.k.add(this.f1033e);
                    this.f1030b.f980e.h.k.add(this.f1033e);
                    this.f1030b.f980e.i.k.add(this.f1033e);
                    i iVar5 = this.f1033e;
                    iVar5.f1009b = true;
                    iVar5.k.add(this.h);
                    this.f1033e.k.add(this.i);
                    this.h.l.add(this.f1033e);
                    hVar2 = this.i;
                }
                list = hVar2.l;
                eVar = this.f1033e;
                list.add(eVar);
            }
            hVar.f1013f = -cVar.d();
            return;
        }
        b.f.b.l.d dVar9 = this.f1030b;
        b.f.b.l.c[] cVarArr2 = dVar9.L;
        if (cVarArr2[0].f970f != null && cVarArr2[1].f970f != null) {
            if (dVar9.v()) {
                this.h.f1013f = this.f1030b.L[0].d();
                hVar = this.i;
                cVar = this.f1030b.L[1];
                hVar.f1013f = -cVar.d();
                return;
            }
            h h5 = h(this.f1030b.L[0]);
            h h6 = h(this.f1030b.L[1]);
            h5.k.add(this);
            if (h5.j) {
                a(this);
            }
            h6.k.add(this);
            if (h6.j) {
                a(this);
            }
            this.j = r.CENTER;
            return;
        }
        if (cVarArr2[0].f970f != null) {
            h h7 = h(cVarArr2[0]);
            if (h7 == null) {
                return;
            }
            h hVar9 = this.h;
            int d4 = this.f1030b.L[0].d();
            hVar9.l.add(h7);
            hVar9.f1013f = d4;
            h7.k.add(hVar9);
        } else {
            if (cVarArr2[1].f970f != null) {
                h h8 = h(cVarArr2[1]);
                if (h8 != null) {
                    h hVar10 = this.i;
                    int i5 = -this.f1030b.L[1].d();
                    hVar10.l.add(h8);
                    hVar10.f1013f = i5;
                    h8.k.add(hVar10);
                    c(this.h, this.i, -1, this.f1033e);
                    return;
                }
                return;
            }
            if ((dVar9 instanceof b.f.b.l.g) || (dVar2 = dVar9.P) == null) {
                return;
            } else {
                b(this.h, dVar2.f979d.h, dVar9.r());
            }
        }
        c(this.i, this.h, 1, this.f1033e);
    }

    @Override // b.f.b.l.k.s
    public void e() {
        h hVar = this.h;
        if (hVar.j) {
            this.f1030b.U = hVar.g;
        }
    }

    @Override // b.f.b.l.k.s
    public void f() {
        this.f1031c = null;
        this.h.b();
        this.i.b();
        this.f1033e.b();
        this.g = false;
    }

    @Override // b.f.b.l.k.s
    public boolean k() {
        return this.f1032d != d.a.MATCH_CONSTRAINT || this.f1030b.m == 0;
    }

    public final void m(int[] iArr, int i, int i2, int i3, int i4, float f2, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f2) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f2) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f2) + 0.5f);
        int i9 = (int) ((i6 / f2) + 0.5f);
        if (i8 <= i6 && i7 <= i7) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else {
            if (i6 > i6 || i9 > i7) {
                return;
            }
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public void n() {
        this.g = false;
        this.h.b();
        this.h.j = false;
        this.i.b();
        this.i.j = false;
        this.f1033e.j = false;
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("HorizontalRun ");
        j.append(this.f1030b.d0);
        return j.toString();
    }
}
