package b.b.i;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import b.b.h.m.y;
import b.b.h.m.z;
import java.util.ArrayList;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class m implements b.b.h.m.y {
    public int A;

    /* renamed from: b, reason: collision with root package name */
    public Context f732b;

    /* renamed from: c, reason: collision with root package name */
    public Context f733c;

    /* renamed from: d, reason: collision with root package name */
    public b.b.h.m.l f734d;

    /* renamed from: e, reason: collision with root package name */
    public LayoutInflater f735e;

    /* renamed from: f, reason: collision with root package name */
    public y.a f736f;
    public b.b.h.m.z i;
    public int j;
    public h k;
    public Drawable l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public int t;
    public i v;
    public d w;
    public f x;
    public e y;
    public int g = R.layout.abc_action_menu_layout;
    public int h = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray u = new SparseBooleanArray();
    public final j z = new j(this);

    public m(Context context) {
        this.f732b = context;
        this.f735e = LayoutInflater.from(context);
    }

    @Override // b.b.h.m.y
    public void a(b.b.h.m.l lVar, boolean z) {
        b();
        y.a aVar = this.f736f;
        if (aVar != null) {
            aVar.a(lVar, z);
        }
    }

    public boolean b() {
        return k() | o();
    }

    @Override // b.b.h.m.y
    public int c() {
        return this.j;
    }

    @Override // b.b.h.m.y
    public boolean d() {
        int i;
        ArrayList<b.b.h.m.o> arrayList;
        int i2;
        boolean z;
        b.b.h.m.l lVar = this.f734d;
        if (lVar != null) {
            arrayList = lVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.r;
        int i4 = this.q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.i;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            b.b.h.m.o oVar = arrayList.get(i5);
            int i8 = oVar.y;
            if ((i8 & 2) == 2) {
                i7++;
            } else if ((i8 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.s && oVar.C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.n && (z2 || i6 + i7 > i3)) {
            i3--;
        }
        int i9 = i3 - i7;
        SparseBooleanArray sparseBooleanArray = this.u;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            b.b.h.m.o oVar2 = arrayList.get(i10);
            int i12 = oVar2.y;
            if ((i12 & 2) == i2 ? z : false) {
                View f2 = f(oVar2, null, viewGroup);
                f2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = f2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                int i13 = oVar2.f615b;
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                oVar2.l(z);
            } else if ((i12 & 1) == z ? z : false) {
                int i14 = oVar2.f615b;
                boolean z3 = sparseBooleanArray.get(i14);
                boolean z4 = ((i9 > 0 || z3) && i4 > 0) ? z : false;
                if (z4) {
                    View f3 = f(oVar2, null, viewGroup);
                    f3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = f3.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z4 &= i4 + i11 > 0;
                }
                if (z4 && i14 != 0) {
                    sparseBooleanArray.put(i14, true);
                } else if (z3) {
                    sparseBooleanArray.put(i14, false);
                    for (int i15 = 0; i15 < i10; i15++) {
                        b.b.h.m.o oVar3 = arrayList.get(i15);
                        if (oVar3.f615b == i14) {
                            if (oVar3.g()) {
                                i9++;
                            }
                            oVar3.l(false);
                        }
                    }
                }
                if (z4) {
                    i9--;
                }
                oVar2.l(z4);
            } else {
                oVar2.l(false);
                i10++;
                i2 = 2;
                z = true;
            }
            i10++;
            i2 = 2;
            z = true;
        }
        return z;
    }

    @Override // b.b.h.m.y
    public Parcelable e() {
        l lVar = new l();
        lVar.f720b = this.A;
        return lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [b.b.h.m.z$a] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public View f(b.b.h.m.o oVar, View view, ViewGroup viewGroup) {
        View actionView = oVar.getActionView();
        if (actionView == null || oVar.f()) {
            ActionMenuItemView actionMenuItemView = view instanceof z.a ? (z.a) view : (z.a) this.f735e.inflate(this.h, viewGroup, false);
            actionMenuItemView.d(oVar, 0);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.i);
            if (this.y == null) {
                this.y = new e(this);
            }
            actionMenuItemView2.setPopupCallback(this.y);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(oVar.C ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // b.b.h.m.y
    public void g(Context context, b.b.h.m.l lVar) {
        this.f733c = context;
        LayoutInflater.from(context);
        this.f734d = lVar;
        Resources resources = context.getResources();
        if (!this.o) {
            this.n = true;
        }
        int i = 2;
        this.p = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.r = i;
        int i4 = this.p;
        if (this.n) {
            if (this.k == null) {
                h hVar = new h(this, this.f732b);
                this.k = hVar;
                if (this.m) {
                    hVar.setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.k.getMeasuredWidth();
        } else {
            this.k = null;
        }
        this.q = i4;
        this.t = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // b.b.h.m.y
    public void h(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof l) && (i = ((l) parcelable).f720b) > 0 && (findItem = this.f734d.findItem(i)) != null) {
            m((b.b.h.m.f0) findItem.getSubMenu());
        }
    }

    @Override // b.b.h.m.y
    public /* bridge */ /* synthetic */ boolean i(b.b.h.m.l lVar, b.b.h.m.o oVar) {
        return false;
    }

    @Override // b.b.h.m.y
    public /* bridge */ /* synthetic */ boolean j(b.b.h.m.l lVar, b.b.h.m.o oVar) {
        return false;
    }

    public boolean k() {
        Object obj;
        f fVar = this.x;
        if (fVar != null && (obj = this.i) != null) {
            ((View) obj).removeCallbacks(fVar);
            this.x = null;
            return true;
        }
        i iVar = this.v;
        if (iVar == null) {
            return false;
        }
        if (iVar.b()) {
            iVar.j.dismiss();
        }
        return true;
    }

    @Override // b.b.h.m.y
    public void l(y.a aVar) {
        this.f736f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.b.h.m.y
    public boolean m(b.b.h.m.f0 f0Var) {
        boolean z = false;
        if (!f0Var.hasVisibleItems()) {
            return false;
        }
        b.b.h.m.f0 f0Var2 = f0Var;
        while (true) {
            b.b.h.m.l lVar = f0Var2.z;
            if (lVar == this.f734d) {
                break;
            }
            f0Var2 = (b.b.h.m.f0) lVar;
        }
        b.b.h.m.o oVar = f0Var2.A;
        ViewGroup viewGroup = (ViewGroup) this.i;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof z.a) && ((z.a) childAt).getItemData() == oVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        this.A = f0Var.A.f614a;
        int size = f0Var.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = f0Var.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        d dVar = new d(this, this.f733c, f0Var, view);
        this.w = dVar;
        dVar.h = z;
        b.b.h.m.v vVar = dVar.j;
        if (vVar != null) {
            vVar.s(z);
        }
        if (!this.w.f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        y.a aVar = this.f736f;
        if (aVar != null) {
            aVar.b(f0Var);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.b.h.m.y
    public void n(boolean z) {
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.i;
        ArrayList<b.b.h.m.o> arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            b.b.h.m.l lVar = this.f734d;
            if (lVar != null) {
                lVar.i();
                ArrayList<b.b.h.m.o> l = this.f734d.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    b.b.h.m.o oVar = l.get(i2);
                    if (oVar.g()) {
                        View childAt = viewGroup.getChildAt(i);
                        b.b.h.m.o itemData = childAt instanceof z.a ? ((z.a) childAt).getItemData() : null;
                        View f2 = f(oVar, childAt, viewGroup);
                        if (oVar != itemData) {
                            f2.setPressed(false);
                            f2.jumpDrawablesToCurrentState();
                        }
                        if (f2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) f2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(f2);
                            }
                            ((ViewGroup) this.i).addView(f2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.k) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
        ((View) this.i).requestLayout();
        b.b.h.m.l lVar2 = this.f734d;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList<b.b.h.m.o> arrayList2 = lVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                b.b.h.m.p pVar = arrayList2.get(i3).A;
            }
        }
        b.b.h.m.l lVar3 = this.f734d;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.j;
        }
        if (this.n && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        h hVar = this.k;
        if (z3) {
            if (hVar == null) {
                this.k = new h(this, this.f732b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.k.getParent();
            if (viewGroup3 != this.i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                h hVar2 = this.k;
                ActionMenuView.c generateDefaultLayoutParams = actionMenuView.generateDefaultLayoutParams();
                generateDefaultLayoutParams.f80c = true;
                actionMenuView.addView(hVar2, generateDefaultLayoutParams);
            }
        } else if (hVar != null) {
            Object parent = hVar.getParent();
            Object obj = this.i;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.k);
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.n);
    }

    public boolean o() {
        d dVar = this.w;
        if (dVar == null) {
            return false;
        }
        if (!dVar.b()) {
            return true;
        }
        dVar.j.dismiss();
        return true;
    }

    public boolean p() {
        i iVar = this.v;
        return iVar != null && iVar.b();
    }

    public boolean q() {
        b.b.h.m.l lVar;
        if (!this.n || p() || (lVar = this.f734d) == null || this.i == null || this.x != null) {
            return false;
        }
        lVar.i();
        if (lVar.j.isEmpty()) {
            return false;
        }
        f fVar = new f(this, new i(this, this.f733c, this.f734d, this.k, true));
        this.x = fVar;
        ((View) this.i).post(fVar);
        return true;
    }
}
