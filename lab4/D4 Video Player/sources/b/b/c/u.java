package b.b.c;

import android.view.Window;
import b.b.h.m.y;

/* loaded from: classes.dex */
public final class u implements y.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f487b;

    public u(f0 f0Var) {
        this.f487b = f0Var;
    }

    @Override // b.b.h.m.y.a
    public void a(b.b.h.m.l lVar, boolean z) {
        this.f487b.s(lVar);
    }

    @Override // b.b.h.m.y.a
    public boolean b(b.b.h.m.l lVar) {
        Window.Callback D = this.f487b.D();
        if (D == null) {
            return true;
        }
        D.onMenuOpened(108, lVar);
        return true;
    }
}
