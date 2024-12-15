package b.b.i;

import android.view.View;
import b.b.h.m.l;

/* loaded from: classes.dex */
public class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public i f676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f677c;

    public f(m mVar, i iVar) {
        this.f677c = mVar;
        this.f676b = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        l.a aVar;
        b.b.h.m.l lVar = this.f677c.f734d;
        if (lVar != null && (aVar = lVar.f608e) != null) {
            aVar.b(lVar);
        }
        View view = (View) this.f677c.i;
        if (view != null && view.getWindowToken() != null && this.f676b.f()) {
            this.f677c.v = this.f676b;
        }
        this.f677c.x = null;
    }
}
