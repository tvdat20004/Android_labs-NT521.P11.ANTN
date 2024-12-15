package b.u.a.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* loaded from: classes.dex */
public class r extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f1848a;

    public r(Drawable.ConstantState constantState) {
        this.f1848a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        return this.f1848a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f1848a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        s sVar = new s();
        sVar.f1823b = (VectorDrawable) this.f1848a.newDrawable();
        return sVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        s sVar = new s();
        sVar.f1823b = (VectorDrawable) this.f1848a.newDrawable(resources);
        return sVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        s sVar = new s();
        sVar.f1823b = (VectorDrawable) this.f1848a.newDrawable(resources, theme);
        return sVar;
    }
}
