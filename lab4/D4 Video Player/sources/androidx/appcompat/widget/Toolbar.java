package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import b.b.c.a;
import b.b.h.j;
import b.b.h.m.f0;
import b.b.h.m.l;
import b.b.h.m.o;
import b.b.h.m.y;
import b.b.i.c1;
import b.b.i.c2;
import b.b.i.l2;
import b.b.i.m;
import b.b.i.m2;
import b.b.i.p2;
import b.b.i.v0;
import b.b.i.w;
import b.h.j.u;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public final ArrayList<View> E;
    public final ArrayList<View> F;
    public final int[] G;
    public f H;
    public final ActionMenuView.e I;
    public p2 J;
    public m K;
    public d L;
    public boolean M;
    public final Runnable N;

    /* renamed from: b, reason: collision with root package name */
    public ActionMenuView f123b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f124c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f125d;

    /* renamed from: e, reason: collision with root package name */
    public ImageButton f126e;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f127f;
    public Drawable g;
    public CharSequence h;
    public ImageButton i;
    public View j;
    public Context k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public c2 u;
    public int v;
    public int w;
    public int x;
    public CharSequence y;
    public CharSequence z;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.u();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = Toolbar.this.L;
            o oVar = dVar == null ? null : dVar.f132c;
            if (oVar != null) {
                oVar.collapseActionView();
            }
        }
    }

    public class d implements y {

        /* renamed from: b, reason: collision with root package name */
        public l f131b;

        /* renamed from: c, reason: collision with root package name */
        public o f132c;

        public d() {
        }

        @Override // b.b.h.m.y
        public void a(l lVar, boolean z) {
        }

        @Override // b.b.h.m.y
        public int c() {
            return 0;
        }

        @Override // b.b.h.m.y
        public boolean d() {
            return false;
        }

        @Override // b.b.h.m.y
        public Parcelable e() {
            return null;
        }

        @Override // b.b.h.m.y
        public void g(Context context, l lVar) {
            o oVar;
            l lVar2 = this.f131b;
            if (lVar2 != null && (oVar = this.f132c) != null) {
                lVar2.d(oVar);
            }
            this.f131b = lVar;
        }

        @Override // b.b.h.m.y
        public void h(Parcelable parcelable) {
        }

        @Override // b.b.h.m.y
        public boolean i(l lVar, o oVar) {
            KeyEvent.Callback callback = Toolbar.this.j;
            if (callback instanceof b.b.h.c) {
                ((b.b.h.c) callback).e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.j = null;
            int size = toolbar3.F.size();
            while (true) {
                size--;
                if (size < 0) {
                    toolbar3.F.clear();
                    this.f132c = null;
                    Toolbar.this.requestLayout();
                    oVar.C = false;
                    oVar.n.q(false);
                    return true;
                }
                toolbar3.addView(toolbar3.F.get(size));
            }
        }

        @Override // b.b.h.m.y
        public boolean j(l lVar, o oVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.i);
            }
            Toolbar.this.j = oVar.getActionView();
            this.f132c = oVar;
            ViewParent parent2 = Toolbar.this.j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.j);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f410a = 8388611 | (toolbar4.o & 112);
                generateDefaultLayoutParams.f134b = 2;
                toolbar4.j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.j);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((e) childAt.getLayoutParams()).f134b != 2 && childAt != toolbar6.f123b) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.F.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            oVar.C = true;
            oVar.n.q(false);
            KeyEvent.Callback callback = Toolbar.this.j;
            if (callback instanceof b.b.h.c) {
                ((b.b.h.c) callback).c();
            }
            return true;
        }

        @Override // b.b.h.m.y
        public boolean m(f0 f0Var) {
            return false;
        }

        @Override // b.b.h.m.y
        public void n(boolean z) {
            if (this.f132c != null) {
                l lVar = this.f131b;
                boolean z2 = false;
                if (lVar != null) {
                    int size = lVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (this.f131b.getItem(i) == this.f132c) {
                            z2 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (z2) {
                    return;
                }
                i(this.f131b, this.f132c);
            }
        }
    }

    public static class e extends a.C0000a {

        /* renamed from: b, reason: collision with root package name */
        public int f134b;

        public e(int i, int i2) {
            super(i, i2);
            this.f134b = 0;
            this.f410a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f134b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f134b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f134b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(e eVar) {
            super((a.C0000a) eVar);
            this.f134b = 0;
            this.f134b = eVar.f134b;
        }

        public e(a.C0000a c0000a) {
            super(c0000a);
            this.f134b = 0;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends b.j.a.c {
        public static final Parcelable.Creator<g> CREATOR = new m2();

        /* renamed from: d, reason: collision with root package name */
        public int f135d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f136e;

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f135d = parcel.readInt();
            this.f136e = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // b.j.a.c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1349b, i);
            parcel.writeInt(this.f135d);
            parcel.writeInt(this.f136e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.N = new b();
        Context context2 = getContext();
        int[] iArr = b.b.b.y;
        l2 r = l2.r(context2, attributeSet, iArr, i, 0);
        u.h(this, context, iArr, attributeSet, r.f730b, i, 0);
        this.m = r.m(28, 0);
        this.n = r.m(19, 0);
        this.x = r.k(0, this.x);
        this.o = r.k(2, 48);
        int e2 = r.e(22, 0);
        e2 = r.p(27) ? r.e(27, e2) : e2;
        this.t = e2;
        this.s = e2;
        this.r = e2;
        this.q = e2;
        int e3 = r.e(25, -1);
        if (e3 >= 0) {
            this.q = e3;
        }
        int e4 = r.e(24, -1);
        if (e4 >= 0) {
            this.r = e4;
        }
        int e5 = r.e(26, -1);
        if (e5 >= 0) {
            this.s = e5;
        }
        int e6 = r.e(23, -1);
        if (e6 >= 0) {
            this.t = e6;
        }
        this.p = r.f(13, -1);
        int e7 = r.e(9, Integer.MIN_VALUE);
        int e8 = r.e(5, Integer.MIN_VALUE);
        int f2 = r.f(7, 0);
        int f3 = r.f(8, 0);
        d();
        c2 c2Var = this.u;
        c2Var.h = false;
        if (f2 != Integer.MIN_VALUE) {
            c2Var.f665e = f2;
            c2Var.f661a = f2;
        }
        if (f3 != Integer.MIN_VALUE) {
            c2Var.f666f = f3;
            c2Var.f662b = f3;
        }
        if (e7 != Integer.MIN_VALUE || e8 != Integer.MIN_VALUE) {
            c2Var.a(e7, e8);
        }
        this.v = r.e(10, Integer.MIN_VALUE);
        this.w = r.e(6, Integer.MIN_VALUE);
        this.g = r.g(4);
        this.h = r.o(3);
        CharSequence o = r.o(21);
        if (!TextUtils.isEmpty(o)) {
            setTitle(o);
        }
        CharSequence o2 = r.o(18);
        if (!TextUtils.isEmpty(o2)) {
            setSubtitle(o2);
        }
        this.k = getContext();
        setPopupTheme(r.m(17, 0));
        Drawable g2 = r.g(16);
        if (g2 != null) {
            setNavigationIcon(g2);
        }
        CharSequence o3 = r.o(15);
        if (!TextUtils.isEmpty(o3)) {
            setNavigationContentDescription(o3);
        }
        Drawable g3 = r.g(11);
        if (g3 != null) {
            setLogo(g3);
        }
        CharSequence o4 = r.o(12);
        if (!TextUtils.isEmpty(o4)) {
            setLogoDescription(o4);
        }
        if (r.p(29)) {
            setTitleTextColor(r.c(29));
        }
        if (r.p(20)) {
            setSubtitleTextColor(r.c(20));
        }
        if (r.p(14)) {
            getMenuInflater().inflate(r.m(14, 0), getMenu());
        }
        r.f730b.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new j(getContext());
    }

    public final void a(List<View> list, int i) {
        WeakHashMap<View, b.h.j.y> weakHashMap = u.f1311a;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f134b == 0 && t(childAt) && j(eVar.f410a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f134b == 0 && t(childAt2) && j(eVar2.f410a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f134b = 1;
        if (!z || this.j == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.F.add(view);
        }
    }

    public void c() {
        if (this.i == null) {
            w wVar = new w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.i = wVar;
            wVar.setImageDrawable(this.g);
            this.i.setContentDescription(this.h);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f410a = 8388611 | (this.o & 112);
            generateDefaultLayoutParams.f134b = 2;
            this.i.setLayoutParams(generateDefaultLayoutParams);
            this.i.setOnClickListener(new c());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        if (this.u == null) {
            this.u = new c2();
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f123b;
        if (actionMenuView.q == null) {
            l lVar = (l) actionMenuView.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f123b.setExpandedActionViewsExclusive(true);
            lVar.b(this.L, this.k);
        }
    }

    public final void f() {
        if (this.f123b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f123b = actionMenuView;
            actionMenuView.setPopupTheme(this.l);
            this.f123b.setOnMenuItemClickListener(this.I);
            ActionMenuView actionMenuView2 = this.f123b;
            actionMenuView2.v = null;
            actionMenuView2.w = null;
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f410a = 8388613 | (this.o & 112);
            this.f123b.setLayoutParams(generateDefaultLayoutParams);
            b(this.f123b, false);
        }
    }

    public final void g() {
        if (this.f126e == null) {
            this.f126e = new w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f410a = 8388611 | (this.o & 112);
            this.f126e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        c2 c2Var = this.u;
        if (c2Var != null) {
            return c2Var.g ? c2Var.f661a : c2Var.f662b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        c2 c2Var = this.u;
        if (c2Var != null) {
            return c2Var.f661a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        c2 c2Var = this.u;
        if (c2Var != null) {
            return c2Var.f662b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        c2 c2Var = this.u;
        if (c2Var != null) {
            return c2Var.g ? c2Var.f662b : c2Var.f661a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        l lVar;
        ActionMenuView actionMenuView = this.f123b;
        return actionMenuView != null && (lVar = actionMenuView.q) != null && lVar.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, b.h.j.y> weakHashMap = u.f1311a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, b.h.j.y> weakHashMap = u.f1311a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f127f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f127f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f123b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f126e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f126e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public m getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f123b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.k;
    }

    public int getPopupTheme() {
        return this.l;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    public final TextView getSubtitleTextView() {
        return this.f125d;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    public final TextView getTitleTextView() {
        return this.f124c;
    }

    public c1 getWrapper() {
        if (this.J == null) {
            this.J = new p2(this, true);
        }
        return this.J;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0000a ? new e((a.C0000a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final int j(int i) {
        WeakHashMap<View, b.h.j.y> weakHashMap = u.f1311a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    public final int k(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = eVar.f410a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.x & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public final int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public final int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public boolean o() {
        ActionMenuView actionMenuView = this.f123b;
        if (actionMenuView != null) {
            m mVar = actionMenuView.u;
            if (mVar != null && mVar.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.N);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0297 A[LOOP:0: B:45:0x0295->B:46:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02b9 A[LOOP:1: B:49:0x02b7->B:50:0x02b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02de A[LOOP:2: B:53:0x02dc->B:54:0x02de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0333 A[LOOP:3: B:62:0x0331->B:63:0x0333, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0297  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f1349b);
        ActionMenuView actionMenuView = this.f123b;
        l lVar = actionMenuView != null ? actionMenuView.q : null;
        int i = gVar.f135d;
        if (i != 0 && this.L != null && lVar != null && (findItem = lVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (gVar.f136e) {
            removeCallbacks(this.N);
            post(this.N);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.d()
            b.b.i.c2 r0 = r2.u
            r1 = 1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            boolean r3 = r0.g
            if (r1 != r3) goto L12
            goto L40
        L12:
            r0.g = r1
            boolean r3 = r0.h
            if (r3 == 0) goto L38
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L2a
            int r1 = r0.f664d
            if (r1 == r3) goto L21
            goto L23
        L21:
            int r1 = r0.f665e
        L23:
            r0.f661a = r1
            int r1 = r0.f663c
            if (r1 == r3) goto L3c
            goto L3e
        L2a:
            int r1 = r0.f663c
            if (r1 == r3) goto L2f
            goto L31
        L2f:
            int r1 = r0.f665e
        L31:
            r0.f661a = r1
            int r1 = r0.f664d
            if (r1 == r3) goto L3c
            goto L3e
        L38:
            int r3 = r0.f665e
            r0.f661a = r3
        L3c:
            int r1 = r0.f666f
        L3e:
            r0.f662b = r1
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        o oVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.L;
        if (dVar != null && (oVar = dVar.f132c) != null) {
            gVar.f135d = oVar.f614a;
        }
        gVar.f136e = o();
        return gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public final int p(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int k = k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k, max + measuredWidth, view.getMeasuredHeight() + k);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + max;
    }

    public final int q(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int k = k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k, max, view.getMeasuredHeight() + k);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    public final int r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(b.b.d.a.a.a(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.i.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.i;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.g);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.M = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.w) {
            this.w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(b.b.d.a.a.a(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f127f == null) {
                this.f127f = new b.b.i.y(getContext(), null, 0);
            }
            if (!n(this.f127f)) {
                b(this.f127f, true);
            }
        } else {
            ImageView imageView = this.f127f;
            if (imageView != null && n(imageView)) {
                removeView(this.f127f);
                this.F.remove(this.f127f);
            }
        }
        ImageView imageView2 = this.f127f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f127f == null) {
            this.f127f = new b.b.i.y(getContext(), null, 0);
        }
        ImageView imageView = this.f127f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f126e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(b.b.d.a.a.a(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f126e)) {
                b(this.f126e, true);
            }
        } else {
            ImageButton imageButton = this.f126e;
            if (imageButton != null && n(imageButton)) {
                removeView(this.f126e);
                this.F.remove(this.f126e);
            }
        }
        ImageButton imageButton2 = this.f126e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f126e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f123b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.l != i) {
            this.l = i;
            if (i == 0) {
                this.k = getContext();
            } else {
                this.k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f125d;
            if (textView != null && n(textView)) {
                removeView(this.f125d);
                this.F.remove(this.f125d);
            }
        } else {
            if (this.f125d == null) {
                Context context = getContext();
                v0 v0Var = new v0(context);
                this.f125d = v0Var;
                v0Var.setSingleLine();
                this.f125d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.n;
                if (i != 0) {
                    this.f125d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f125d.setTextColor(colorStateList);
                }
            }
            if (!n(this.f125d)) {
                b(this.f125d, true);
            }
        }
        TextView textView2 = this.f125d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.f125d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f124c;
            if (textView != null && n(textView)) {
                removeView(this.f124c);
                this.F.remove(this.f124c);
            }
        } else {
            if (this.f124c == null) {
                Context context = getContext();
                v0 v0Var = new v0(context);
                this.f124c = v0Var;
                v0Var.setSingleLine();
                this.f124c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.f124c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f124c.setTextColor(colorStateList);
                }
            }
            if (!n(this.f124c)) {
                b(this.f124c, true);
            }
        }
        TextView textView2 = this.f124c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f124c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean u() {
        ActionMenuView actionMenuView = this.f123b;
        if (actionMenuView != null) {
            m mVar = actionMenuView.u;
            if (mVar != null && mVar.q()) {
                return true;
            }
        }
        return false;
    }
}
