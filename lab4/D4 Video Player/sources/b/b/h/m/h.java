package b.b.h.m;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import b.b.h.m.y;
import b.b.i.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public final class h extends v implements y, View.OnKeyListener, PopupWindow.OnDismissListener {
    public PopupWindow.OnDismissListener A;
    public boolean B;

    /* renamed from: c, reason: collision with root package name */
    public final Context f588c;

    /* renamed from: d, reason: collision with root package name */
    public final int f589d;

    /* renamed from: e, reason: collision with root package name */
    public final int f590e;

    /* renamed from: f, reason: collision with root package name */
    public final int f591f;
    public final boolean g;
    public final Handler h;
    public View p;
    public View q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public boolean x;
    public y.a y;
    public ViewTreeObserver z;
    public final List<l> i = new ArrayList();
    public final List<g> j = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener k = new c(this);
    public final View.OnAttachStateChangeListener l = new d(this);
    public final t1 m = new f(this);
    public int n = 0;
    public int o = 0;
    public boolean w = false;

    public h(Context context, View view, int i, int i2, boolean z) {
        this.f588c = context;
        this.p = view;
        this.f590e = i;
        this.f591f = i2;
        this.g = z;
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        this.r = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f589d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    @Override // b.b.h.m.y
    public void a(l lVar, boolean z) {
        int i;
        int size = this.j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (lVar == this.j.get(i2).f586b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < this.j.size()) {
            this.j.get(i3).f586b.c(false);
        }
        g remove = this.j.remove(i2);
        remove.f586b.u(this);
        if (this.B) {
            remove.f585a.A.setExitTransition(null);
            remove.f585a.A.setAnimationStyle(0);
        }
        remove.f585a.dismiss();
        int size2 = this.j.size();
        if (size2 > 0) {
            i = this.j.get(size2 - 1).f587c;
        } else {
            View view = this.p;
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            i = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        this.r = i;
        if (size2 != 0) {
            if (z) {
                this.j.get(0).f586b.c(false);
                return;
            }
            return;
        }
        dismiss();
        y.a aVar = this.y;
        if (aVar != null) {
            aVar.a(lVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.z.removeGlobalOnLayoutListener(this.k);
            }
            this.z = null;
        }
        this.q.removeOnAttachStateChangeListener(this.l);
        this.A.onDismiss();
    }

    @Override // b.b.h.m.b0
    public boolean b() {
        return this.j.size() > 0 && this.j.get(0).f585a.b();
    }

    @Override // b.b.h.m.y
    public boolean d() {
        return false;
    }

    @Override // b.b.h.m.b0
    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            g[] gVarArr = (g[]) this.j.toArray(new g[size]);
            for (int i = size - 1; i >= 0; i--) {
                g gVar = gVarArr[i];
                if (gVar.f585a.b()) {
                    gVar.f585a.dismiss();
                }
            }
        }
    }

    @Override // b.b.h.m.y
    public Parcelable e() {
        return null;
    }

    @Override // b.b.h.m.b0
    public void f() {
        if (b()) {
            return;
        }
        Iterator<l> it = this.i.iterator();
        while (it.hasNext()) {
            z(it.next());
        }
        this.i.clear();
        View view = this.p;
        this.q = view;
        if (view != null) {
            boolean z = this.z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.k);
            }
            this.q.addOnAttachStateChangeListener(this.l);
        }
    }

    @Override // b.b.h.m.y
    public void h(Parcelable parcelable) {
    }

    @Override // b.b.h.m.b0
    public ListView k() {
        if (this.j.isEmpty()) {
            return null;
        }
        return this.j.get(r0.size() - 1).f585a.f790d;
    }

    @Override // b.b.h.m.y
    public void l(y.a aVar) {
        this.y = aVar;
    }

    @Override // b.b.h.m.y
    public boolean m(f0 f0Var) {
        for (g gVar : this.j) {
            if (f0Var == gVar.f586b) {
                gVar.f585a.f790d.requestFocus();
                return true;
            }
        }
        if (!f0Var.hasVisibleItems()) {
            return false;
        }
        f0Var.b(this, this.f588c);
        if (b()) {
            z(f0Var);
        } else {
            this.i.add(f0Var);
        }
        y.a aVar = this.y;
        if (aVar != null) {
            aVar.b(f0Var);
        }
        return true;
    }

    @Override // b.b.h.m.y
    public void n(boolean z) {
        Iterator<g> it = this.j.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = it.next().f585a.f790d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((k) adapter).notifyDataSetChanged();
        }
    }

    @Override // b.b.h.m.v
    public void o(l lVar) {
        lVar.b(this, this.f588c);
        if (b()) {
            z(lVar);
        } else {
            this.i.add(lVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        g gVar;
        int size = this.j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                gVar = null;
                break;
            }
            gVar = this.j.get(i);
            if (!gVar.f585a.b()) {
                break;
            } else {
                i++;
            }
        }
        if (gVar != null) {
            gVar.f586b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // b.b.h.m.v
    public boolean p() {
        return false;
    }

    @Override // b.b.h.m.v
    public void r(View view) {
        if (this.p != view) {
            this.p = view;
            int i = this.n;
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            this.o = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // b.b.h.m.v
    public void s(boolean z) {
        this.w = z;
    }

    @Override // b.b.h.m.v
    public void t(int i) {
        if (this.n != i) {
            this.n = i;
            View view = this.p;
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            this.o = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // b.b.h.m.v
    public void u(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // b.b.h.m.v
    public void v(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // b.b.h.m.v
    public void w(boolean z) {
        this.x = z;
    }

    @Override // b.b.h.m.v
    public void x(int i) {
        this.t = true;
        this.v = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(b.b.h.m.l r18) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.h.m.h.z(b.b.h.m.l):void");
    }
}
