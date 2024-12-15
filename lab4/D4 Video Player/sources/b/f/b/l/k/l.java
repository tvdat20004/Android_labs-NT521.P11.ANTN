package b.f.b.l.k;

import java.util.Iterator;

/* loaded from: classes.dex */
public class l extends s {
    public l(b.f.b.l.d dVar) {
        super(dVar);
    }

    @Override // b.f.b.l.k.s, b.f.b.l.k.e
    public void a(e eVar) {
        b.f.b.l.a aVar = (b.f.b.l.a) this.f1030b;
        int i = aVar.n0;
        int i2 = 0;
        Iterator<h> it = this.h.l.iterator();
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = it.next().g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.h.c(i3 + aVar.p0);
        } else {
            this.h.c(i2 + aVar.p0);
        }
    }

    @Override // b.f.b.l.k.s
    public void d() {
        s sVar;
        b.f.b.l.d dVar = this.f1030b;
        if (dVar instanceof b.f.b.l.a) {
            h hVar = this.h;
            hVar.f1009b = true;
            b.f.b.l.a aVar = (b.f.b.l.a) dVar;
            int i = aVar.n0;
            boolean z = aVar.o0;
            int i2 = 0;
            if (i == 0) {
                hVar.f1012e = g.LEFT;
                while (i2 < aVar.m0) {
                    b.f.b.l.d dVar2 = aVar.l0[i2];
                    if (z || dVar2.c0 != 8) {
                        h hVar2 = dVar2.f979d.h;
                        hVar2.k.add(this.h);
                        this.h.l.add(hVar2);
                    }
                    i2++;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        hVar.f1012e = g.TOP;
                        while (i2 < aVar.m0) {
                            b.f.b.l.d dVar3 = aVar.l0[i2];
                            if (z || dVar3.c0 != 8) {
                                h hVar3 = dVar3.f980e.h;
                                hVar3.k.add(this.h);
                                this.h.l.add(hVar3);
                            }
                            i2++;
                        }
                    } else {
                        if (i != 3) {
                            return;
                        }
                        hVar.f1012e = g.BOTTOM;
                        while (i2 < aVar.m0) {
                            b.f.b.l.d dVar4 = aVar.l0[i2];
                            if (z || dVar4.c0 != 8) {
                                h hVar4 = dVar4.f980e.i;
                                hVar4.k.add(this.h);
                                this.h.l.add(hVar4);
                            }
                            i2++;
                        }
                    }
                    m(this.f1030b.f980e.h);
                    sVar = this.f1030b.f980e;
                    m(sVar.i);
                }
                hVar.f1012e = g.RIGHT;
                while (i2 < aVar.m0) {
                    b.f.b.l.d dVar5 = aVar.l0[i2];
                    if (z || dVar5.c0 != 8) {
                        h hVar5 = dVar5.f979d.i;
                        hVar5.k.add(this.h);
                        this.h.l.add(hVar5);
                    }
                    i2++;
                }
            }
            m(this.f1030b.f979d.h);
            sVar = this.f1030b.f979d;
            m(sVar.i);
        }
    }

    @Override // b.f.b.l.k.s
    public void e() {
        b.f.b.l.d dVar = this.f1030b;
        if (dVar instanceof b.f.b.l.a) {
            int i = ((b.f.b.l.a) dVar).n0;
            if (i == 0 || i == 1) {
                dVar.U = this.h.g;
            } else {
                dVar.V = this.h.g;
            }
        }
    }

    @Override // b.f.b.l.k.s
    public void f() {
        this.f1031c = null;
        this.h.b();
    }

    @Override // b.f.b.l.k.s
    public boolean k() {
        return false;
    }

    public final void m(h hVar) {
        this.h.k.add(hVar);
        hVar.l.add(this.h);
    }
}
