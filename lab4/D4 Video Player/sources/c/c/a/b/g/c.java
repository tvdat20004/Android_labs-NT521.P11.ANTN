package c.c.a.b.g;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import b.b.h.m.l;
import b.b.h.m.o;

/* loaded from: classes.dex */
public final class c extends l {
    public c(Context context) {
        super(context);
    }

    @Override // b.b.h.m.l
    public MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 > 5) {
            throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
        }
        A();
        MenuItem a2 = super.a(i, i2, i3, charSequence);
        ((o) a2).k(true);
        z();
        return a2;
    }

    @Override // b.b.h.m.l, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
