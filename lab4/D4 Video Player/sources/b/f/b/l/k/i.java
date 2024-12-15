package b.f.b.l.k;

/* loaded from: classes.dex */
public class i extends h {
    public int m;

    public i(s sVar) {
        super(sVar);
        this.f1012e = sVar instanceof m ? g.HORIZONTAL_DIMENSION : g.VERTICAL_DIMENSION;
    }

    @Override // b.f.b.l.k.h
    public void c(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (e eVar : this.k) {
            eVar.a(eVar);
        }
    }
}
