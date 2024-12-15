package b.b.h.m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import b.b.h.m.y;
import b.b.i.g1;
import b.b.i.v1;
import java.util.Objects;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public final class e0 extends v implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, y, View.OnKeyListener {

    /* renamed from: c, reason: collision with root package name */
    public final Context f580c;

    /* renamed from: d, reason: collision with root package name */
    public final l f581d;

    /* renamed from: e, reason: collision with root package name */
    public final k f582e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f583f;
    public final int g;
    public final int h;
    public final int i;
    public final v1 j;
    public PopupWindow.OnDismissListener m;
    public View n;
    public View o;
    public y.a p;
    public ViewTreeObserver q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean v;
    public final ViewTreeObserver.OnGlobalLayoutListener k = new c0(this);
    public final View.OnAttachStateChangeListener l = new d0(this);
    public int u = 0;

    public e0(Context context, l lVar, View view, int i, int i2, boolean z) {
        this.f580c = context;
        this.f581d = lVar;
        this.f583f = z;
        this.f582e = new k(lVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.h = i;
        this.i = i2;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.j = new v1(context, null, i, i2);
        lVar.b(this, context);
    }

    @Override // b.b.h.m.y
    public void a(l lVar, boolean z) {
        if (lVar != this.f581d) {
            return;
        }
        dismiss();
        y.a aVar = this.p;
        if (aVar != null) {
            aVar.a(lVar, z);
        }
    }

    @Override // b.b.h.m.b0
    public boolean b() {
        return !this.r && this.j.b();
    }

    @Override // b.b.h.m.y
    public boolean d() {
        return false;
    }

    @Override // b.b.h.m.b0
    public void dismiss() {
        if (b()) {
            this.j.dismiss();
        }
    }

    @Override // b.b.h.m.y
    public Parcelable e() {
        return null;
    }

    @Override // b.b.h.m.b0
    public void f() {
        View view;
        boolean z = true;
        if (!b()) {
            if (this.r || (view = this.n) == null) {
                z = false;
            } else {
                this.o = view;
                this.j.A.setOnDismissListener(this);
                v1 v1Var = this.j;
                v1Var.r = this;
                v1Var.s(true);
                View view2 = this.o;
                boolean z2 = this.q == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.q = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.k);
                }
                view2.addOnAttachStateChangeListener(this.l);
                v1 v1Var2 = this.j;
                v1Var2.q = view2;
                v1Var2.m = this.u;
                if (!this.s) {
                    this.t = v.q(this.f582e, null, this.f580c, this.g);
                    this.s = true;
                }
                this.j.r(this.t);
                this.j.A.setInputMethodMode(2);
                v1 v1Var3 = this.j;
                Rect rect = this.f631b;
                Objects.requireNonNull(v1Var3);
                v1Var3.y = rect != null ? new Rect(rect) : null;
                this.j.f();
                g1 g1Var = this.j.f790d;
                g1Var.setOnKeyListener(this);
                if (this.v && this.f581d.m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f580c).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) g1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    if (textView != null) {
                        textView.setText(this.f581d.m);
                    }
                    frameLayout.setEnabled(false);
                    g1Var.addHeaderView(frameLayout, null, false);
                }
                this.j.o(this.f582e);
                this.j.f();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // b.b.h.m.y
    public void h(Parcelable parcelable) {
    }

    @Override // b.b.h.m.b0
    public ListView k() {
        return this.j.f790d;
    }

    @Override // b.b.h.m.y
    public void l(y.a aVar) {
        this.p = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    @Override // b.b.h.m.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m(b.b.h.m.f0 r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L78
            b.b.h.m.x r0 = new b.b.h.m.x
            android.content.Context r3 = r9.f580c
            android.view.View r5 = r9.o
            boolean r6 = r9.f583f
            int r7 = r9.h
            int r8 = r9.i
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            b.b.h.m.y$a r2 = r9.p
            r0.d(r2)
            boolean r2 = b.b.h.m.v.y(r10)
            r0.h = r2
            b.b.h.m.v r3 = r0.j
            if (r3 == 0) goto L2a
            r3.s(r2)
        L2a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.m
            r0.k = r2
            r2 = 0
            r9.m = r2
            b.b.h.m.l r2 = r9.f581d
            r2.c(r1)
            b.b.i.v1 r2 = r9.j
            int r3 = r2.g
            boolean r4 = r2.j
            if (r4 != 0) goto L40
            r2 = r1
            goto L42
        L40:
            int r2 = r2.h
        L42:
            int r4 = r9.u
            android.view.View r5 = r9.n
            java.util.WeakHashMap<android.view.View, b.h.j.y> r6 = b.h.j.u.f1311a
            int r5 = r5.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5c
            android.view.View r4 = r9.n
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5c:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L64
            goto L6d
        L64:
            android.view.View r4 = r0.f638f
            if (r4 != 0) goto L6a
            r0 = r1
            goto L6e
        L6a:
            r0.e(r3, r2, r5, r5)
        L6d:
            r0 = r5
        L6e:
            if (r0 == 0) goto L78
            b.b.h.m.y$a r0 = r9.p
            if (r0 == 0) goto L77
            r0.b(r10)
        L77:
            return r5
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.h.m.e0.m(b.b.h.m.f0):boolean");
    }

    @Override // b.b.h.m.y
    public void n(boolean z) {
        this.s = false;
        k kVar = this.f582e;
        if (kVar != null) {
            kVar.notifyDataSetChanged();
        }
    }

    @Override // b.b.h.m.v
    public void o(l lVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.r = true;
        this.f581d.c(true);
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
    public void r(View view) {
        this.n = view;
    }

    @Override // b.b.h.m.v
    public void s(boolean z) {
        this.f582e.f601d = z;
    }

    @Override // b.b.h.m.v
    public void t(int i) {
        this.u = i;
    }

    @Override // b.b.h.m.v
    public void u(int i) {
        this.j.g = i;
    }

    @Override // b.b.h.m.v
    public void v(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // b.b.h.m.v
    public void w(boolean z) {
        this.v = z;
    }

    @Override // b.b.h.m.v
    public void x(int i) {
        v1 v1Var = this.j;
        v1Var.h = i;
        v1Var.j = true;
    }
}
