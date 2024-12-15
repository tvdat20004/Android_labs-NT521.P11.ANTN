package b.b.h.m;

import android.view.MenuItem;

/* loaded from: classes.dex */
public class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItem f577c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f579e;

    public e(f fVar, g gVar, MenuItem menuItem, l lVar) {
        this.f579e = fVar;
        this.f576b = gVar;
        this.f577c = menuItem;
        this.f578d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        g gVar = this.f576b;
        if (gVar != null) {
            this.f579e.f584b.B = true;
            gVar.f586b.c(false);
            this.f579e.f584b.B = false;
        }
        if (this.f577c.isEnabled() && this.f577c.hasSubMenu()) {
            this.f578d.r(this.f577c, 4);
        }
    }
}
