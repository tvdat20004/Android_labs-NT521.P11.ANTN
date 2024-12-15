package b.h.j;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class h0 extends g0 {

    /* renamed from: e, reason: collision with root package name */
    public b.h.d.b f1276e;

    public h0(j0 j0Var, WindowInsets windowInsets) {
        super(j0Var, windowInsets);
        this.f1276e = null;
    }

    @Override // b.h.j.i0
    public b.h.d.b e() {
        if (this.f1276e == null) {
            Insets mandatorySystemGestureInsets = this.f1268b.getMandatorySystemGestureInsets();
            this.f1276e = b.h.d.b.a(mandatorySystemGestureInsets.left, mandatorySystemGestureInsets.top, mandatorySystemGestureInsets.right, mandatorySystemGestureInsets.bottom);
        }
        return this.f1276e;
    }

    @Override // b.h.j.e0, b.h.j.i0
    public j0 h(int i, int i2, int i3, int i4) {
        return j0.h(this.f1268b.inset(i, i2, i3, i4));
    }
}
