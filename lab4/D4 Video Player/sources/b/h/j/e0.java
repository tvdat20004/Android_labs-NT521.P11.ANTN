package b.h.j;

import android.os.Build;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class e0 extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsets f1268b;

    /* renamed from: c, reason: collision with root package name */
    public b.h.d.b f1269c;

    public e0(j0 j0Var, WindowInsets windowInsets) {
        super(j0Var);
        this.f1269c = null;
        this.f1268b = windowInsets;
    }

    @Override // b.h.j.i0
    public final b.h.d.b g() {
        if (this.f1269c == null) {
            this.f1269c = b.h.d.b.a(this.f1268b.getSystemWindowInsetLeft(), this.f1268b.getSystemWindowInsetTop(), this.f1268b.getSystemWindowInsetRight(), this.f1268b.getSystemWindowInsetBottom());
        }
        return this.f1269c;
    }

    @Override // b.h.j.i0
    public j0 h(int i, int i2, int i3, int i4) {
        j0 h = j0.h(this.f1268b);
        d0 c0Var = Build.VERSION.SDK_INT >= 29 ? new c0(h) : new b0(h);
        c0Var.c(j0.f(g(), i, i2, i3, i4));
        c0Var.b(j0.f(f(), i, i2, i3, i4));
        return c0Var.a();
    }

    @Override // b.h.j.i0
    public boolean j() {
        return this.f1268b.isRound();
    }
}
