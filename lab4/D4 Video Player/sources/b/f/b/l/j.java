package b.f.b.l;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class j extends d {
    public ArrayList<d> l0 = new ArrayList<>();

    @Override // b.f.b.l.d
    public void A() {
        this.l0.clear();
        super.A();
    }

    @Override // b.f.b.l.d
    public void C(b.f.b.d dVar) {
        super.C(dVar);
        int size = this.l0.size();
        for (int i = 0; i < size; i++) {
            this.l0.get(i).C(dVar);
        }
    }

    public abstract void O();
}
