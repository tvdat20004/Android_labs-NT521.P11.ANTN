package b.b.e.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class c extends m {
    public b.e.f<Long> K;
    public b.e.j<Integer> L;

    public c(c cVar, h hVar, Resources resources) {
        super(cVar, hVar, resources);
        b.e.j<Integer> jVar;
        if (cVar != null) {
            this.K = cVar.K;
            jVar = cVar.L;
        } else {
            this.K = new b.e.f<>();
            jVar = new b.e.j<>(10);
        }
        this.L = jVar;
    }

    public static long h(int i, int i2) {
        return i2 | (i << 32);
    }

    @Override // b.b.e.a.k
    public void e() {
        this.K = this.K.clone();
        this.L = this.L.clone();
    }

    public int i(int i) {
        if (i < 0) {
            return 0;
        }
        return this.L.e(i, 0).intValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new h(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new h(this, resources);
    }
}
