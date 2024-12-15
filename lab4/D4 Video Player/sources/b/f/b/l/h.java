package b.f.b.l;

import b.f.b.l.k.q;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class h extends d implements g {
    public d[] l0 = new d[4];
    public int m0 = 0;

    public void O(ArrayList<q> arrayList, int i, q qVar) {
        for (int i2 = 0; i2 < this.m0; i2++) {
            qVar.a(this.l0[i2]);
        }
        for (int i3 = 0; i3 < this.m0; i3++) {
            b.d.a.b(this.l0[i3], i, arrayList, qVar);
        }
    }
}
