package b.b.e.a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public abstract class n extends l {
    public m o;
    public boolean p;

    public n(m mVar) {
    }

    @Override // b.b.e.a.l, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // b.b.e.a.l, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.p) {
            super.mutate();
            if (this == this) {
                this.o.e();
                this.p = true;
            }
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public abstract boolean onStateChange(int[] iArr);
}
