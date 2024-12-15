package b.b.h.m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import b.b.h.m.l;

/* loaded from: classes.dex */
public class f0 extends l implements SubMenu {
    public o A;
    public l z;

    public f0(Context context, l lVar, o oVar) {
        super(context);
        this.z = lVar;
        this.A = oVar;
    }

    @Override // b.b.h.m.l
    public boolean d(o oVar) {
        return this.z.d(oVar);
    }

    @Override // b.b.h.m.l
    public boolean e(l lVar, MenuItem menuItem) {
        return super.e(lVar, menuItem) || this.z.e(lVar, menuItem);
    }

    @Override // b.b.h.m.l
    public boolean f(o oVar) {
        return this.z.f(oVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.A;
    }

    @Override // b.b.h.m.l
    public String j() {
        o oVar = this.A;
        int i = oVar != null ? oVar.f614a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // b.b.h.m.l
    public l k() {
        return this.z.k();
    }

    @Override // b.b.h.m.l
    public boolean m() {
        return this.z.m();
    }

    @Override // b.b.h.m.l
    public boolean n() {
        return this.z.n();
    }

    @Override // b.b.h.m.l
    public boolean o() {
        return this.z.o();
    }

    @Override // b.b.h.m.l, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        y(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        y(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        y(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // b.b.h.m.l, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // b.b.h.m.l
    public void x(l.a aVar) {
        this.z.x(aVar);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        y(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        y(0, charSequence, 0, null, null);
        return this;
    }
}
