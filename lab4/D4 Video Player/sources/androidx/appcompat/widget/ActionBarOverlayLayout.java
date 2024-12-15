package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.d;
import b.b.c.r0;
import b.b.h.m.l;
import b.b.h.m.o;
import b.b.h.m.y;
import b.b.i.b1;
import b.b.i.c1;
import b.b.i.m;
import b.b.i.p2;
import b.h.j.b0;
import b.h.j.c0;
import b.h.j.d0;
import b.h.j.h;
import b.h.j.i;
import b.h.j.j;
import b.h.j.j0;
import b.h.j.u;
import java.util.Objects;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements b1, h, i {
    public static final int[] G = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final AnimatorListenerAdapter C;
    public final Runnable D;
    public final Runnable E;
    public final j F;

    /* renamed from: b, reason: collision with root package name */
    public int f72b;

    /* renamed from: c, reason: collision with root package name */
    public int f73c;

    /* renamed from: d, reason: collision with root package name */
    public ContentFrameLayout f74d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarContainer f75e;

    /* renamed from: f, reason: collision with root package name */
    public c1 f76f;
    public Drawable g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public final Rect o;
    public final Rect p;
    public final Rect q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public j0 v;
    public j0 w;
    public j0 x;
    public j0 y;
    public d z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.l = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.i();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f75e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.i();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f75e.animate().translationY(-ActionBarOverlayLayout.this.f75e.getHeight()).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i, int i2) {
            super(i, i2);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f73c = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        j0 j0Var = j0.f1280b;
        this.v = j0Var;
        this.w = j0Var;
        this.x = j0Var;
        this.y = j0Var;
        this.C = new a();
        this.D = new b();
        this.E = new c();
        k(context);
        this.F = new j();
    }

    @Override // b.h.j.h
    public void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // b.h.j.h
    public void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // b.h.j.h
    public void c(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // b.h.j.i
    public void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.g == null || this.h) {
            return;
        }
        if (this.f75e.getVisibility() == 0) {
            i = (int) (this.f75e.getTranslationY() + this.f75e.getBottom() + 0.5f);
        } else {
            i = 0;
        }
        this.g.setBounds(0, i, getWidth(), this.g.getIntrinsicHeight() + i);
        this.g.draw(canvas);
    }

    @Override // b.h.j.h
    public void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // b.h.j.h
    public boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.g(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f75e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.F.a();
    }

    public CharSequence getTitle() {
        n();
        return ((p2) this.f76f).f760a.getTitle();
    }

    public boolean h() {
        ActionMenuView actionMenuView;
        n();
        Toolbar toolbar = ((p2) this.f76f).f760a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f123b) != null && actionMenuView.t;
    }

    public void i() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean j() {
        n();
        ActionMenuView actionMenuView = ((p2) this.f76f).f760a.f123b;
        if (actionMenuView != null) {
            m mVar = actionMenuView.u;
            if (mVar != null && mVar.k()) {
                return true;
            }
        }
        return false;
    }

    public final void k(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(G);
        this.f72b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.h = context.getApplicationInfo().targetSdkVersion < 19;
        this.A = new OverScroller(context);
    }

    public void l(int i) {
        n();
        if (i == 2) {
            Objects.requireNonNull((p2) this.f76f);
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            Objects.requireNonNull((p2) this.f76f);
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public boolean m() {
        n();
        return ((p2) this.f76f).f760a.o();
    }

    public void n() {
        c1 wrapper;
        if (this.f74d == null) {
            this.f74d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f75e = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof c1) {
                wrapper = (c1) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    StringBuilder j = c.a.a.a.a.j("Can't make a decor toolbar out of ");
                    j.append(findViewById.getClass().getSimpleName());
                    throw new IllegalStateException(j.toString());
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f76f = wrapper;
        }
    }

    public void o(Menu menu, y.a aVar) {
        o oVar;
        n();
        p2 p2Var = (p2) this.f76f;
        if (p2Var.n == null) {
            m mVar = new m(p2Var.f760a.getContext());
            p2Var.n = mVar;
            mVar.j = R.id.action_menu_presenter;
        }
        m mVar2 = p2Var.n;
        mVar2.f736f = aVar;
        Toolbar toolbar = p2Var.f760a;
        l lVar = (l) menu;
        if (lVar == null && toolbar.f123b == null) {
            return;
        }
        toolbar.f();
        l lVar2 = toolbar.f123b.q;
        if (lVar2 == lVar) {
            return;
        }
        if (lVar2 != null) {
            lVar2.u(toolbar.K);
            lVar2.u(toolbar.L);
        }
        if (toolbar.L == null) {
            toolbar.L = toolbar.new d();
        }
        mVar2.s = true;
        if (lVar != null) {
            lVar.b(mVar2, toolbar.k);
            lVar.b(toolbar.L, toolbar.k);
        } else {
            mVar2.g(toolbar.k, null);
            Toolbar.d dVar = toolbar.L;
            l lVar3 = dVar.f131b;
            if (lVar3 != null && (oVar = dVar.f132c) != null) {
                lVar3.d(oVar);
            }
            dVar.f131b = null;
            mVar2.n(true);
            toolbar.L.n(true);
        }
        toolbar.f123b.setPopupTheme(toolbar.l);
        toolbar.f123b.setPresenter(mVar2);
        toolbar.K = mVar2;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        n();
        Objects.requireNonNull(windowInsets);
        j0 j0Var = new j0(windowInsets);
        boolean g = g(this.f75e, new Rect(j0Var.b(), j0Var.d(), j0Var.c(), j0Var.a()), true, true, false, true);
        Rect rect = this.o;
        WeakHashMap<View, b.h.j.y> weakHashMap = u.f1311a;
        WindowInsets g2 = j0Var.g();
        if (g2 != null) {
            j0.h(computeSystemWindowInsets(g2, rect));
        } else {
            rect.setEmpty();
        }
        Rect rect2 = this.o;
        j0 h = j0Var.f1281a.h(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.v = h;
        boolean z = true;
        if (!this.w.equals(h)) {
            this.w = this.v;
            g = true;
        }
        if (this.p.equals(this.o)) {
            z = g;
        } else {
            this.p.set(this.o);
        }
        if (z) {
            requestLayout();
        }
        return j0Var.f1281a.a().f1281a.c().f1281a.b().g();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k(getContext());
        WeakHashMap<View, b.h.j.y> weakHashMap = u.f1311a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        j0 a2;
        n();
        measureChildWithMargins(this.f75e, i, 0, i2, 0);
        e eVar = (e) this.f75e.getLayoutParams();
        int max = Math.max(0, this.f75e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f75e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f75e.getMeasuredState());
        WeakHashMap<View, b.h.j.y> weakHashMap = u.f1311a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f72b;
            if (this.j && this.f75e.getTabContainer() != null) {
                measuredHeight += this.f72b;
            }
        } else {
            measuredHeight = this.f75e.getVisibility() != 8 ? this.f75e.getMeasuredHeight() : 0;
        }
        this.q.set(this.o);
        j0 j0Var = this.v;
        this.x = j0Var;
        if (this.i || z) {
            b.h.d.b a3 = b.h.d.b.a(j0Var.b(), this.x.d() + measuredHeight, this.x.c(), this.x.a() + 0);
            j0 j0Var2 = this.x;
            d0 c0Var = Build.VERSION.SDK_INT >= 29 ? new c0(j0Var2) : new b0(j0Var2);
            c0Var.c(a3);
            a2 = c0Var.a();
        } else {
            Rect rect = this.q;
            rect.top += measuredHeight;
            rect.bottom += 0;
            a2 = j0Var.f1281a.h(0, measuredHeight, 0, 0);
        }
        this.x = a2;
        g(this.f74d, this.q, true, true, true, true);
        if (!this.y.equals(this.x)) {
            j0 j0Var3 = this.x;
            this.y = j0Var3;
            ContentFrameLayout contentFrameLayout = this.f74d;
            WindowInsets g = j0Var3.g();
            if (g != null && !contentFrameLayout.dispatchApplyWindowInsets(g).equals(g)) {
                new j0(g);
            }
        }
        measureChildWithMargins(this.f74d, i, 0, i2, 0);
        e eVar2 = (e) this.f74d.getLayoutParams();
        int max3 = Math.max(max, this.f74d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f74d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f74d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.k || !z) {
            return false;
        }
        this.A.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.A.getFinalY() > this.f75e.getHeight()) {
            i();
            this.E.run();
        } else {
            i();
            this.D.run();
        }
        this.l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.m + i2;
        this.m = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        r0 r0Var;
        b.b.h.l lVar;
        this.F.f1278a = i;
        this.m = getActionBarHideOffset();
        i();
        d dVar = this.z;
        if (dVar == null || (lVar = (r0Var = (r0) dVar).t) == null) {
            return;
        }
        lVar.a();
        r0Var.t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f75e.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.k && !this.l) {
            if (this.m <= this.f75e.getHeight()) {
                i();
                postDelayed(this.D, 600L);
            } else {
                i();
                postDelayed(this.E, 600L);
            }
        }
        d dVar = this.z;
        if (dVar != null) {
            Objects.requireNonNull((r0) dVar);
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        n();
        int i2 = this.n ^ i;
        this.n = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        d dVar = this.z;
        if (dVar != null) {
            ((r0) dVar).p = !z2;
            if (z || !z2) {
                r0 r0Var = (r0) dVar;
                if (r0Var.q) {
                    r0Var.q = false;
                    r0Var.h(true);
                }
            } else {
                r0 r0Var2 = (r0) dVar;
                if (!r0Var2.q) {
                    r0Var2.q = true;
                    r0Var2.h(true);
                }
            }
        }
        if ((i2 & 256) == 0 || this.z == null) {
            return;
        }
        WeakHashMap<View, b.h.j.y> weakHashMap = u.f1311a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f73c = i;
        d dVar = this.z;
        if (dVar != null) {
            ((r0) dVar).o = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        i();
        this.f75e.setTranslationY(-Math.max(0, Math.min(i, this.f75e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.z = dVar;
        if (getWindowToken() != null) {
            ((r0) this.z).o = this.f73c;
            int i = this.n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, b.h.j.y> weakHashMap = u.f1311a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.k) {
            this.k = z;
            if (z) {
                return;
            }
            i();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        n();
        p2 p2Var = (p2) this.f76f;
        p2Var.f764e = i != 0 ? b.b.d.a.a.a(p2Var.a(), i) : null;
        p2Var.f();
    }

    public void setLogo(int i) {
        n();
        p2 p2Var = (p2) this.f76f;
        p2Var.f765f = i != 0 ? b.b.d.a.a.a(p2Var.a(), i) : null;
        p2Var.f();
    }

    public void setOverlayMode(boolean z) {
        this.i = z;
        this.h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // b.b.i.b1
    public void setWindowCallback(Window.Callback callback) {
        n();
        ((p2) this.f76f).l = callback;
    }

    @Override // b.b.i.b1
    public void setWindowTitle(CharSequence charSequence) {
        n();
        p2 p2Var = (p2) this.f76f;
        if (p2Var.h) {
            return;
        }
        p2Var.i = charSequence;
        if ((p2Var.f761b & 8) != 0) {
            p2Var.f760a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void setIcon(Drawable drawable) {
        n();
        p2 p2Var = (p2) this.f76f;
        p2Var.f764e = drawable;
        p2Var.f();
    }
}
