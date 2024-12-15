package b.b.h.m;

import android.content.Context;
import android.view.MenuItem;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f570a;

    /* renamed from: b, reason: collision with root package name */
    public b.e.i<b.h.e.a.b, MenuItem> f571b;

    public b(Context context) {
        this.f570a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b.h.e.a.b)) {
            return menuItem;
        }
        b.h.e.a.b bVar = (b.h.e.a.b) menuItem;
        if (this.f571b == null) {
            this.f571b = new b.e.i<>();
        }
        MenuItem orDefault = this.f571b.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        u uVar = new u(this.f570a, bVar);
        this.f571b.put(bVar, uVar);
        return uVar;
    }
}
