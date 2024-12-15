package b.f.b.l.k;

import b.f.b.l.d;

/* loaded from: classes.dex */
public class o extends s {
    public h k;
    public i l;

    public o(b.f.b.l.d dVar) {
        super(dVar);
        h hVar = new h(this);
        this.k = hVar;
        this.l = null;
        this.h.f1012e = g.TOP;
        this.i.f1012e = g.BOTTOM;
        hVar.f1012e = g.BASELINE;
        this.f1034f = 1;
    }

    @Override // b.f.b.l.k.s, b.f.b.l.k.e
    public void a(e eVar) {
        float f2;
        float f3;
        float f4;
        int i;
        d.a aVar = d.a.MATCH_CONSTRAINT;
        int ordinal = this.j.ordinal();
        if (ordinal != 1 && ordinal != 2 && ordinal == 3) {
            b.f.b.l.d dVar = this.f1030b;
            l(dVar.E, dVar.G, 1);
            return;
        }
        i iVar = this.f1033e;
        if (iVar.f1010c && !iVar.j && this.f1032d == aVar) {
            b.f.b.l.d dVar2 = this.f1030b;
            int i2 = dVar2.n;
            if (i2 == 2) {
                b.f.b.l.d dVar3 = dVar2.P;
                if (dVar3 != null) {
                    i iVar2 = dVar3.f980e.f1033e;
                    if (iVar2.j) {
                        f2 = dVar2.u;
                        f3 = iVar2.g;
                        f4 = f3 * f2;
                    }
                }
            } else if (i2 == 3) {
                i iVar3 = dVar2.f979d.f1033e;
                if (iVar3.j) {
                    int i3 = dVar2.T;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = iVar3.g;
                            f2 = dVar2.S;
                            f4 = f3 * f2;
                        } else if (i3 != 1) {
                            i = 0;
                            iVar.c(i);
                        }
                    }
                    f4 = iVar3.g / dVar2.S;
                }
            }
            i = (int) (f4 + 0.5f);
            iVar.c(i);
        }
        h hVar = this.h;
        if (hVar.f1010c) {
            h hVar2 = this.i;
            if (hVar2.f1010c) {
                if (hVar.j && hVar2.j && this.f1033e.j) {
                    return;
                }
                if (!this.f1033e.j && this.f1032d == aVar) {
                    b.f.b.l.d dVar4 = this.f1030b;
                    if (dVar4.m == 0 && !dVar4.w()) {
                        h hVar3 = this.h.l.get(0);
                        h hVar4 = this.i.l.get(0);
                        int i4 = hVar3.g;
                        h hVar5 = this.h;
                        int i5 = i4 + hVar5.f1013f;
                        int i6 = hVar4.g + this.i.f1013f;
                        hVar5.c(i5);
                        this.i.c(i6);
                        this.f1033e.c(i6 - i5);
                        return;
                    }
                }
                if (!this.f1033e.j && this.f1032d == aVar && this.f1029a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    h hVar6 = this.h.l.get(0);
                    int i7 = (this.i.l.get(0).g + this.i.f1013f) - (hVar6.g + this.h.f1013f);
                    i iVar4 = this.f1033e;
                    int i8 = iVar4.m;
                    if (i7 < i8) {
                        iVar4.c(i7);
                    } else {
                        iVar4.c(i8);
                    }
                }
                if (this.f1033e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    h hVar7 = this.h.l.get(0);
                    h hVar8 = this.i.l.get(0);
                    int i9 = hVar7.g;
                    h hVar9 = this.h;
                    int i10 = hVar9.f1013f + i9;
                    int i11 = hVar8.g;
                    int i12 = this.i.f1013f + i11;
                    float f5 = this.f1030b.a0;
                    if (hVar7 == hVar8) {
                        f5 = 0.5f;
                    } else {
                        i9 = i10;
                        i11 = i12;
                    }
                    hVar9.c((int) ((((i11 - i9) - this.f1033e.g) * f5) + i9 + 0.5f));
                    this.i.c(this.h.g + this.f1033e.g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x031c, code lost:
    
        if (r10.f1030b.z != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x031e, code lost:
    
        r0 = r10.k;
        r1 = r10.h;
        r2 = r10.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0378, code lost:
    
        if (r0.f1032d == r2) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0421, code lost:
    
        r0.f1033e.k.add(r10.f1033e);
        r10.f1033e.l.add(r10.f1030b.f979d.f1033e);
        r10.f1033e.f1008a = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03b1, code lost:
    
        if (r10.f1030b.z != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x041f, code lost:
    
        if (r0.f1032d == r2) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    @Override // b.f.b.l.k.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.b.l.k.o.d():void");
    }

    @Override // b.f.b.l.k.s
    public void e() {
        h hVar = this.h;
        if (hVar.j) {
            this.f1030b.V = hVar.g;
        }
    }

    @Override // b.f.b.l.k.s
    public void f() {
        this.f1031c = null;
        this.h.b();
        this.i.b();
        this.k.b();
        this.f1033e.b();
        this.g = false;
    }

    @Override // b.f.b.l.k.s
    public boolean k() {
        return this.f1032d != d.a.MATCH_CONSTRAINT || this.f1030b.n == 0;
    }

    public void m() {
        this.g = false;
        this.h.b();
        this.h.j = false;
        this.i.b();
        this.i.j = false;
        this.k.b();
        this.k.j = false;
        this.f1033e.j = false;
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("VerticalRun ");
        j.append(this.f1030b.d0);
        return j.toString();
    }
}
