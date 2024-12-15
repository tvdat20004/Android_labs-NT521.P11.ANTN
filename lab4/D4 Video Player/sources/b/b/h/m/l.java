package b.b.h.m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class l implements b.h.e.a.a {
    public static final int[] y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f604a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f605b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f606c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f607d;

    /* renamed from: e, reason: collision with root package name */
    public a f608e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList<o> f609f;
    public ArrayList<o> g;
    public boolean h;
    public ArrayList<o> i;
    public ArrayList<o> j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public o v;
    public boolean x;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public ArrayList<o> t = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<y>> u = new CopyOnWriteArrayList<>();
    public boolean w = false;

    public interface a {
        boolean a(l lVar, MenuItem menuItem);

        void b(l lVar);
    }

    public interface b {
        boolean a(o oVar);
    }

    public l(Context context) {
        boolean z;
        boolean z2 = false;
        this.f604a = context;
        Resources resources = context.getResources();
        this.f605b = resources;
        this.f609f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.h = true;
        this.i = new ArrayList<>();
        this.j = new ArrayList<>();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = b.h.j.v.f1314a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z2 = true;
            }
        }
        this.f607d = z2;
    }

    public void A() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    public MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = y;
            if (i5 < iArr.length) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                o oVar = new o(this, i, i2, i3, i6, charSequence, this.l);
                ArrayList<o> arrayList = this.f609f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i4 = 0;
                        break;
                    }
                    if (arrayList.get(size).f617d <= i6) {
                        i4 = size + 1;
                        break;
                    }
                }
                arrayList.add(i4, oVar);
                q(true);
                return oVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(0, 0, 0, this.f605b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f605b.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f604a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = a(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f605b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f605b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        o oVar = (o) a(i, i2, i3, charSequence);
        f0 f0Var = new f0(this.f604a, this, oVar);
        oVar.o = f0Var;
        f0Var.setHeaderTitle(oVar.f618e);
        return f0Var;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(y yVar, Context context) {
        this.u.add(new WeakReference<>(yVar));
        yVar.g(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        Iterator<WeakReference<y>> it = this.u.iterator();
        while (it.hasNext()) {
            WeakReference<y> next = it.next();
            y yVar = next.get();
            if (yVar == null) {
                this.u.remove(next);
            } else {
                yVar.a(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public void clear() {
        o oVar = this.v;
        if (oVar != null) {
            d(oVar);
        }
        this.f609f.clear();
        q(true);
    }

    public void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        q(false);
    }

    @Override // android.view.Menu
    public void close() {
        c(true);
    }

    public boolean d(o oVar) {
        boolean z = false;
        if (!this.u.isEmpty() && this.v == oVar) {
            A();
            Iterator<WeakReference<y>> it = this.u.iterator();
            while (it.hasNext()) {
                WeakReference<y> next = it.next();
                y yVar = next.get();
                if (yVar == null) {
                    this.u.remove(next);
                } else {
                    z = yVar.i(this, oVar);
                    if (z) {
                        break;
                    }
                }
            }
            z();
            if (z) {
                this.v = null;
            }
        }
        return z;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        a aVar = this.f608e;
        return aVar != null && aVar.a(lVar, menuItem);
    }

    public boolean f(o oVar) {
        boolean z = false;
        if (this.u.isEmpty()) {
            return false;
        }
        A();
        Iterator<WeakReference<y>> it = this.u.iterator();
        while (it.hasNext()) {
            WeakReference<y> next = it.next();
            y yVar = next.get();
            if (yVar == null) {
                this.u.remove(next);
            } else {
                z = yVar.j(this, oVar);
                if (z) {
                    break;
                }
            }
        }
        z();
        if (z) {
            this.v = oVar;
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = this.f609f.get(i2);
            if (oVar.f614a == i) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (findItem = oVar.o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public o g(int i, KeyEvent keyEvent) {
        ArrayList<o> arrayList = this.t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n = n();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = arrayList.get(i2);
            char c2 = n ? oVar.j : oVar.h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n && c2 == '\b' && i == 67))) {
                return oVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f609f.get(i);
    }

    public void h(List<o> list, int i, KeyEvent keyEvent) {
        boolean n = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f609f.size();
            for (int i2 = 0; i2 < size; i2++) {
                o oVar = this.f609f.get(i2);
                if (oVar.hasSubMenu()) {
                    oVar.o.h(list, i, keyEvent);
                }
                char c2 = n ? oVar.j : oVar.h;
                if (((modifiers & 69647) == ((n ? oVar.k : oVar.i) & 69647)) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (n && c2 == '\b' && i == 67)) && oVar.isEnabled()) {
                        list.add(oVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f609f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        ArrayList<o> l = l();
        if (this.k) {
            Iterator<WeakReference<y>> it = this.u.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<y> next = it.next();
                y yVar = next.get();
                if (yVar == null) {
                    this.u.remove(next);
                } else {
                    z |= yVar.d();
                }
            }
            if (z) {
                this.i.clear();
                this.j.clear();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    o oVar = l.get(i);
                    (oVar.g() ? this.i : this.j).add(oVar);
                }
            } else {
                this.i.clear();
                this.j.clear();
                this.j.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public l k() {
        return this;
    }

    public ArrayList<o> l() {
        if (!this.h) {
            return this.g;
        }
        this.g.clear();
        int size = this.f609f.size();
        for (int i = 0; i < size; i++) {
            o oVar = this.f609f.get(i);
            if (oVar.isVisible()) {
                this.g.add(oVar);
            }
        }
        this.h = false;
        this.k = true;
        return this.g;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.f606c;
    }

    public boolean o() {
        return this.f607d;
    }

    public void p() {
        this.k = true;
        q(true);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return r(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        o g = g(i, keyEvent);
        boolean s = g != null ? s(g, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return s;
    }

    public void q(boolean z) {
        if (this.p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        if (this.u.isEmpty()) {
            return;
        }
        A();
        Iterator<WeakReference<y>> it = this.u.iterator();
        while (it.hasNext()) {
            WeakReference<y> next = it.next();
            y yVar = next.get();
            if (yVar == null) {
                this.u.remove(next);
            } else {
                yVar.n(z);
            }
        }
        z();
    }

    public boolean r(MenuItem menuItem, int i) {
        return s(menuItem, null, i);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f609f.get(i2).f615b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f609f.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || this.f609f.get(i2).f615b != i) {
                    break;
                }
                t(i2, false);
                i3 = i4;
            }
            q(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f609f.get(i2).f614a == i) {
                break;
            } else {
                i2++;
            }
        }
        t(i2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r1 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d3, code lost:
    
        c(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if ((r9 & 1) == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d1, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean s(android.view.MenuItem r7, b.b.h.m.y r8, int r9) {
        /*
            r6 = this;
            b.b.h.m.o r7 = (b.b.h.m.o) r7
            r0 = 0
            if (r7 == 0) goto Ld7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld7
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L42
        L19:
            b.b.h.m.l r1 = r7.n
            boolean r1 = r1.e(r1, r7)
            if (r1 == 0) goto L22
            goto L42
        L22:
            android.content.Intent r1 = r7.g
            if (r1 == 0) goto L36
            b.b.h.m.l r3 = r7.n     // Catch: android.content.ActivityNotFoundException -> L2e
            android.content.Context r3 = r3.f604a     // Catch: android.content.ActivityNotFoundException -> L2e
            r3.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L2e
            goto L42
        L2e:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L36:
            b.b.h.m.p r1 = r7.A
            if (r1 == 0) goto L44
            android.view.ActionProvider r1 = r1.f621b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L44
        L42:
            r1 = r2
            goto L45
        L44:
            r1 = r0
        L45:
            b.b.h.m.p r3 = r7.A
            if (r3 == 0) goto L53
            android.view.ActionProvider r4 = r3.f621b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L53
            r4 = r2
            goto L54
        L53:
            r4 = r0
        L54:
            boolean r5 = r7.f()
            if (r5 == 0) goto L63
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld6
            goto Ld3
        L63:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L71
            if (r4 == 0) goto L6c
            goto L71
        L6c:
            r7 = r9 & 1
            if (r7 != 0) goto Ld6
            goto Ld3
        L71:
            r9 = r9 & 4
            if (r9 != 0) goto L78
            r6.c(r0)
        L78:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L8c
            b.b.h.m.f0 r9 = new b.b.h.m.f0
            android.content.Context r5 = r6.f604a
            r9.<init>(r5, r6, r7)
            r7.o = r9
            java.lang.CharSequence r5 = r7.f618e
            r9.setHeaderTitle(r5)
        L8c:
            b.b.h.m.f0 r7 = r7.o
            if (r4 == 0) goto L9a
            android.view.ActionProvider r9 = r3.f621b
            b.b.h.m.u r3 = r3.f622c
            java.util.Objects.requireNonNull(r3)
            r9.onPrepareSubMenu(r7)
        L9a:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<b.b.h.m.y>> r9 = r6.u
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto La3
            goto Ld0
        La3:
            if (r8 == 0) goto La9
            boolean r0 = r8.m(r7)
        La9:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<b.b.h.m.y>> r8 = r6.u
            java.util.Iterator r8 = r8.iterator()
        Laf:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Ld0
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            b.b.h.m.y r3 = (b.b.h.m.y) r3
            if (r3 != 0) goto Lc9
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<b.b.h.m.y>> r3 = r6.u
            r3.remove(r9)
            goto Laf
        Lc9:
            if (r0 != 0) goto Laf
            boolean r0 = r3.m(r7)
            goto Laf
        Ld0:
            r1 = r1 | r0
            if (r1 != 0) goto Ld6
        Ld3:
            r6.c(r2)
        Ld6:
            return r1
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.h.m.l.s(android.view.MenuItem, b.b.h.m.y, int):boolean");
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f609f.size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = this.f609f.get(i2);
            if (oVar.f615b == i) {
                oVar.k(z2);
                oVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f609f.size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = this.f609f.get(i2);
            if (oVar.f615b == i) {
                oVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f609f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = this.f609f.get(i2);
            if (oVar.f615b == i && oVar.m(z)) {
                z2 = true;
            }
        }
        if (z2) {
            q(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f606c = z;
        q(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f609f.size();
    }

    public final void t(int i, boolean z) {
        if (i < 0 || i >= this.f609f.size()) {
            return;
        }
        this.f609f.remove(i);
        if (z) {
            q(true);
        }
    }

    public void u(y yVar) {
        Iterator<WeakReference<y>> it = this.u.iterator();
        while (it.hasNext()) {
            WeakReference<y> next = it.next();
            y yVar2 = next.get();
            if (yVar2 == null || yVar2 == yVar) {
                this.u.remove(next);
            }
        }
    }

    public void v(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((f0) item.getSubMenu()).v(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void w(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((f0) item.getSubMenu()).w(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public void x(a aVar) {
        this.f608e = aVar;
    }

    public final void y(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f605b;
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = resources.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                Context context = this.f604a;
                Object obj = b.h.b.b.f1117a;
                this.n = context.getDrawable(i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        q(false);
    }

    public void z() {
        this.p = false;
        if (this.q) {
            this.q = false;
            q(this.r);
        }
    }
}
