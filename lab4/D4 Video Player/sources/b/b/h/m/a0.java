package b.b.h.m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
public class a0 extends b implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final b.h.e.a.a f569c;

    public a0(Context context, b.h.e.a.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f569c = aVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return c(((l) this.f569c).add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return c(((l) this.f569c).add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return c(((l) this.f569c).add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return c(((l) this.f569c).add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((l) this.f569c).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = c(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return ((l) this.f569c).addSubMenu(i);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return ((l) this.f569c).addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f569c.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return ((l) this.f569c).addSubMenu(charSequence);
    }

    @Override // android.view.Menu
    public void clear() {
        b.e.i<b.h.e.a.b, MenuItem> iVar = this.f571b;
        if (iVar != null) {
            iVar.clear();
        }
        ((l) this.f569c).clear();
    }

    @Override // android.view.Menu
    public void close() {
        ((l) this.f569c).close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return c(((l) this.f569c).findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return c(((l) this.f569c).f609f.get(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((l) this.f569c).hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((l) this.f569c).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return ((l) this.f569c).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((l) this.f569c).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        if (this.f571b != null) {
            int i2 = 0;
            while (true) {
                b.e.i<b.h.e.a.b, MenuItem> iVar = this.f571b;
                if (i2 >= iVar.f915d) {
                    break;
                }
                if (iVar.h(i2).getGroupId() == i) {
                    this.f571b.i(i2);
                    i2--;
                }
                i2++;
            }
        }
        ((l) this.f569c).removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        if (this.f571b != null) {
            int i2 = 0;
            while (true) {
                b.e.i<b.h.e.a.b, MenuItem> iVar = this.f571b;
                if (i2 >= iVar.f915d) {
                    break;
                }
                if (iVar.h(i2).getItemId() == i) {
                    this.f571b.i(i2);
                    break;
                }
                i2++;
            }
        }
        ((l) this.f569c).removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((l) this.f569c).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        ((l) this.f569c).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        ((l) this.f569c).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f569c.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return ((l) this.f569c).size();
    }
}
