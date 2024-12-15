package b.f.b.l.k;

/* loaded from: classes.dex */
public class k extends s {
    public k(b.f.b.l.d dVar) {
        super(dVar);
        dVar.f979d.f();
        dVar.f980e.f();
        this.f1034f = ((b.f.b.l.f) dVar).p0;
    }

    @Override // b.f.b.l.k.s, b.f.b.l.k.e
    public void a(e eVar) {
        h hVar = this.h;
        if (hVar.f1010c && !hVar.j) {
            this.h.c((int) ((hVar.l.get(0).g * ((b.f.b.l.f) this.f1030b).l0) + 0.5f));
        }
    }

    @Override // b.f.b.l.k.s
    public void d() {
        s sVar;
        b.f.b.l.d dVar = this.f1030b;
        b.f.b.l.f fVar = (b.f.b.l.f) dVar;
        int i = fVar.m0;
        int i2 = fVar.n0;
        if (fVar.p0 == 1) {
            h hVar = this.h;
            if (i != -1) {
                hVar.l.add(dVar.P.f979d.h);
                this.f1030b.P.f979d.h.k.add(this.h);
                this.h.f1013f = i;
            } else if (i2 != -1) {
                hVar.l.add(dVar.P.f979d.i);
                this.f1030b.P.f979d.i.k.add(this.h);
                this.h.f1013f = -i2;
            } else {
                hVar.f1009b = true;
                hVar.l.add(dVar.P.f979d.i);
                this.f1030b.P.f979d.i.k.add(this.h);
            }
            m(this.f1030b.f979d.h);
            sVar = this.f1030b.f979d;
        } else {
            h hVar2 = this.h;
            if (i != -1) {
                hVar2.l.add(dVar.P.f980e.h);
                this.f1030b.P.f980e.h.k.add(this.h);
                this.h.f1013f = i;
            } else if (i2 != -1) {
                hVar2.l.add(dVar.P.f980e.i);
                this.f1030b.P.f980e.i.k.add(this.h);
                this.h.f1013f = -i2;
            } else {
                hVar2.f1009b = true;
                hVar2.l.add(dVar.P.f980e.i);
                this.f1030b.P.f980e.i.k.add(this.h);
            }
            m(this.f1030b.f980e.h);
            sVar = this.f1030b.f980e;
        }
        m(sVar.i);
    }

    @Override // b.f.b.l.k.s
    public void e() {
        b.f.b.l.d dVar = this.f1030b;
        if (((b.f.b.l.f) dVar).p0 == 1) {
            dVar.U = this.h.g;
        } else {
            dVar.V = this.h.g;
        }
    }

    @Override // b.f.b.l.k.s
    public void f() {
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
