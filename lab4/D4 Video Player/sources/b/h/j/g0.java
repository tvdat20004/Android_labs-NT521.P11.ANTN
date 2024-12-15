package b.h.j;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class g0 extends f0 {
    public g0(j0 j0Var, WindowInsets windowInsets) {
        super(j0Var, windowInsets);
    }

    @Override // b.h.j.i0
    public j0 a() {
        return j0.h(this.f1268b.consumeDisplayCutout());
    }

    @Override // b.h.j.i0
    public c d() {
        DisplayCutout displayCutout = this.f1268b.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new c(displayCutout);
    }

    @Override // b.h.j.i0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            return Objects.equals(this.f1268b, ((g0) obj).f1268b);
        }
        return false;
    }

    @Override // b.h.j.i0
    public int hashCode() {
        return this.f1268b.hashCode();
    }
}
