package b.u.a.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class d extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f1816a;

    public d(Drawable.ConstantState constantState) {
        this.f1816a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        return this.f1816a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f1816a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        e eVar = new e(null, null, null);
        Drawable newDrawable = this.f1816a.newDrawable();
        eVar.f1823b = newDrawable;
        newDrawable.setCallback(eVar.f1820f);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        e eVar = new e(null, null, null);
        Drawable newDrawable = this.f1816a.newDrawable(resources);
        eVar.f1823b = newDrawable;
        newDrawable.setCallback(eVar.f1820f);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        e eVar = new e(null, null, null);
        Drawable newDrawable = this.f1816a.newDrawable(resources, theme);
        eVar.f1823b = newDrawable;
        newDrawable.setCallback(eVar.f1820f);
        return eVar;
    }
}
