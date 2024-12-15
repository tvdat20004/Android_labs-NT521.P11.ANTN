package b.h.j;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class f0 extends e0 {

    /* renamed from: d, reason: collision with root package name */
    public b.h.d.b f1270d;

    public f0(j0 j0Var, WindowInsets windowInsets) {
        super(j0Var, windowInsets);
        this.f1270d = null;
    }

    @Override // b.h.j.i0
    public j0 b() {
        return j0.h(this.f1268b.consumeStableInsets());
    }

    @Override // b.h.j.i0
    public j0 c() {
        return j0.h(this.f1268b.consumeSystemWindowInsets());
    }

    @Override // b.h.j.i0
    public final b.h.d.b f() {
        if (this.f1270d == null) {
            this.f1270d = b.h.d.b.a(this.f1268b.getStableInsetLeft(), this.f1268b.getStableInsetTop(), this.f1268b.getStableInsetRight(), this.f1268b.getStableInsetBottom());
        }
        return this.f1270d;
    }

    @Override // b.h.j.i0
    public boolean i() {
        return this.f1268b.isConsumed();
    }
}
