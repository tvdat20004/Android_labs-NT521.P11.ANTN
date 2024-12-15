package c.c.a.b.p;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public class k extends c.c.a.b.r.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f3970a;

    public k(m mVar) {
        this.f3970a = mVar;
    }

    @Override // c.c.a.b.r.e
    public void a(int i) {
        m mVar = this.f3970a;
        mVar.f3974d = true;
        l lVar = mVar.f3975e.get();
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // c.c.a.b.r.e
    public void b(Typeface typeface, boolean z) {
        if (z) {
            return;
        }
        m mVar = this.f3970a;
        mVar.f3974d = true;
        l lVar = mVar.f3975e.get();
        if (lVar != null) {
            lVar.a();
        }
    }
}
