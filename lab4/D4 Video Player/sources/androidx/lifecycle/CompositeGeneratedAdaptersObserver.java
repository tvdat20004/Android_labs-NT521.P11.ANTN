package androidx.lifecycle;

import b.n.d;
import b.n.e;
import b.n.f;
import b.n.h;
import b.n.l;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements f {

    /* renamed from: a, reason: collision with root package name */
    public final d[] f228a;

    public CompositeGeneratedAdaptersObserver(d[] dVarArr) {
        this.f228a = dVarArr;
    }

    @Override // b.n.f
    public void d(h hVar, e.a aVar) {
        l lVar = new l();
        for (d dVar : this.f228a) {
            dVar.a(hVar, aVar, false, lVar);
        }
        for (d dVar2 : this.f228a) {
            dVar2.a(hVar, aVar, true, lVar);
        }
    }
}
