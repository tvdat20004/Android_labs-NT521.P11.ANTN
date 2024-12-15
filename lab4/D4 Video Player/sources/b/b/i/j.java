package b.b.i;

import b.b.h.m.y;

/* loaded from: classes.dex */
public class j implements y.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f706b;

    public j(m mVar) {
        this.f706b = mVar;
    }

    @Override // b.b.h.m.y.a
    public void a(b.b.h.m.l lVar, boolean z) {
        if (lVar instanceof b.b.h.m.f0) {
            lVar.k().c(false);
        }
        y.a aVar = this.f706b.f736f;
        if (aVar != null) {
            aVar.a(lVar, z);
        }
    }

    @Override // b.b.h.m.y.a
    public boolean b(b.b.h.m.l lVar) {
        m mVar = this.f706b;
        if (lVar == mVar.f734d) {
            return false;
        }
        mVar.A = ((b.b.h.m.f0) lVar).A.f614a;
        y.a aVar = mVar.f736f;
        if (aVar != null) {
            return aVar.b(lVar);
        }
        return false;
    }
}
