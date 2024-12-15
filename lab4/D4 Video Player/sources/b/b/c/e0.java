package b.b.c;

import android.view.Window;
import b.b.h.m.y;

/* loaded from: classes.dex */
public final class e0 implements y.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f426b;

    public e0(f0 f0Var) {
        this.f426b = f0Var;
    }

    @Override // b.b.h.m.y.a
    public void a(b.b.h.m.l lVar, boolean z) {
        b.b.h.m.l k = lVar.k();
        boolean z2 = k != lVar;
        f0 f0Var = this.f426b;
        if (z2) {
            lVar = k;
        }
        d0 A = f0Var.A(lVar);
        if (A != null) {
            if (!z2) {
                this.f426b.t(A, z);
            } else {
                this.f426b.r(A.f418a, A, k);
                this.f426b.t(A, true);
            }
        }
    }

    @Override // b.b.h.m.y.a
    public boolean b(b.b.h.m.l lVar) {
        Window.Callback D;
        if (lVar != lVar.k()) {
            return true;
        }
        f0 f0Var = this.f426b;
        if (!f0Var.z || (D = f0Var.D()) == null || this.f426b.L) {
            return true;
        }
        D.onMenuOpened(108, lVar);
        return true;
    }
}
