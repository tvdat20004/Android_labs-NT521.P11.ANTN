package b.b.h.m;

import android.view.MenuItem;

/* loaded from: classes.dex */
public class t implements MenuItem.OnMenuItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f628c;

    public t(u uVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f628c = uVar;
        this.f627b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        return this.f627b.onMenuItemClick(this.f628c.c(menuItem));
    }
}
