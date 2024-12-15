package b.b.h.m;

import android.view.MenuItem;

/* loaded from: classes.dex */
public class s implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f626b;

    public s(u uVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f626b = uVar;
        this.f625a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f625a.onMenuItemActionCollapse(this.f626b.c(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f625a.onMenuItemActionExpand(this.f626b.c(menuItem));
    }
}
