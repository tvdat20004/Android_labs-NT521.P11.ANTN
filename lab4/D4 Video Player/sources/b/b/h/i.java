package b.b.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import b.b.h.m.o;
import b.b.h.m.p;
import b.b.h.m.u;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public class i {
    public p A;
    public CharSequence B;
    public CharSequence C;
    public final /* synthetic */ j F;

    /* renamed from: a, reason: collision with root package name */
    public Menu f542a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public String z;
    public ColorStateList D = null;
    public PorterDuff.Mode E = null;

    /* renamed from: b, reason: collision with root package name */
    public int f543b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f544c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f545d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f546e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f547f = true;
    public boolean g = true;

    public i(j jVar, Menu menu) {
        this.F = jVar;
        this.f542a = menu;
    }

    public SubMenu a() {
        this.h = true;
        SubMenu addSubMenu = this.f542a.addSubMenu(this.f543b, this.i, this.j, this.k);
        c(addSubMenu.getItem());
        return addSubMenu;
    }

    public final <T> T b(String str, Class<?>[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.F.f552c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return (T) constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void c(MenuItem menuItem) {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i2 = this.v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        if (this.z != null) {
            if (this.F.f552c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            j jVar = this.F;
            if (jVar.f553d == null) {
                jVar.f553d = jVar.a(jVar.f552c);
            }
            menuItem.setOnMenuItemClickListener(new h(jVar.f553d, this.z));
        }
        if (this.r >= 2) {
            if (menuItem instanceof o) {
                ((o) menuItem).k(true);
            } else if (menuItem instanceof u) {
                u uVar = (u) menuItem;
                try {
                    if (uVar.f630d == null) {
                        uVar.f630d = uVar.f629c.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    uVar.f630d.invoke(uVar.f629c, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str = this.x;
        if (str != null) {
            menuItem.setActionView((View) b(str, j.f548e, this.F.f550a));
            z = true;
        }
        int i3 = this.w;
        if (i3 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        p pVar = this.A;
        if (pVar != null) {
            if (menuItem instanceof b.h.e.a.b) {
                ((b.h.e.a.b) menuItem).a(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.B;
        boolean z2 = menuItem instanceof b.h.e.a.b;
        if (z2) {
            ((b.h.e.a.b) menuItem).setContentDescription(charSequence);
        } else if (i >= 26) {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.C;
        if (z2) {
            ((b.h.e.a.b) menuItem).setTooltipText(charSequence2);
        } else if (i >= 26) {
            menuItem.setTooltipText(charSequence2);
        }
        char c2 = this.n;
        int i4 = this.o;
        if (z2) {
            ((b.h.e.a.b) menuItem).setAlphabeticShortcut(c2, i4);
        } else if (i >= 26) {
            menuItem.setAlphabeticShortcut(c2, i4);
        }
        char c3 = this.p;
        int i5 = this.q;
        if (z2) {
            ((b.h.e.a.b) menuItem).setNumericShortcut(c3, i5);
        } else if (i >= 26) {
            menuItem.setNumericShortcut(c3, i5);
        }
        PorterDuff.Mode mode = this.E;
        if (mode != null) {
            if (z2) {
                ((b.h.e.a.b) menuItem).setIconTintMode(mode);
            } else if (i >= 26) {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.D;
        if (colorStateList != null) {
            if (z2) {
                ((b.h.e.a.b) menuItem).setIconTintList(colorStateList);
            } else if (i >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
