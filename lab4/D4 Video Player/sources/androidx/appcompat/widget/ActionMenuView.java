package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import b.b.h.m.l;
import b.b.h.m.o;
import b.b.h.m.y;
import b.b.h.m.z;
import b.b.i.h;
import b.b.i.l1;
import b.b.i.m;
import b.b.i.v2;

/* loaded from: classes.dex */
public class ActionMenuView extends l1 implements l.b, z {
    public int A;
    public e B;
    public l q;
    public Context r;
    public int s;
    public boolean t;
    public m u;
    public y.a v;
    public l.a w;
    public boolean x;
    public int y;
    public int z;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements y.a {
        @Override // b.b.h.m.y.a
        public void a(l lVar, boolean z) {
        }

        @Override // b.b.h.m.y.a
        public boolean b(l lVar) {
            return false;
        }
    }

    public static class c extends l1.a {

        /* renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f80c;

        /* renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f81d;

        /* renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f82e;

        /* renamed from: f, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f83f;

        @ViewDebug.ExportedProperty
        public boolean g;
        public boolean h;

        public c(int i, int i2) {
            super(i, i2);
            this.f80c = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f80c = cVar.f80c;
        }
    }

    public class d implements l.a {
        public d() {
        }

        @Override // b.b.h.m.l.a
        public boolean a(l lVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.B;
            if (eVar == null) {
                return false;
            }
            Toolbar.f fVar = Toolbar.this.H;
            return fVar != null ? fVar.onMenuItemClick(menuItem) : false;
        }

        @Override // b.b.h.m.l.a
        public void b(l lVar) {
            l.a aVar = ActionMenuView.this.w;
            if (aVar != null) {
                aVar.b(lVar);
            }
        }
    }

    public interface e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.z = (int) (56.0f * f2);
        this.A = (int) (f2 * 4.0f);
        this.r = context;
        this.s = 0;
    }

    public static int t(View view, int i, int i2, int i3, int i4) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.e();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (!cVar.f80c && z2) {
            z = true;
        }
        cVar.f83f = z;
        cVar.f81d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    @Override // b.b.h.m.l.b
    public boolean a(o oVar) {
        return this.q.s(oVar, null, 0);
    }

    @Override // b.b.h.m.z
    public void b(l lVar) {
        this.q = lVar;
    }

    @Override // b.b.i.l1, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // b.b.i.l1, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.q == null) {
            Context context = getContext();
            l lVar = new l(context);
            this.q = lVar;
            lVar.f608e = new d();
            m mVar = new m(context);
            this.u = mVar;
            mVar.n = true;
            mVar.o = true;
            y.a aVar = this.v;
            if (aVar == null) {
                aVar = new b();
            }
            mVar.f736f = aVar;
            this.q.b(mVar, this.r);
            m mVar2 = this.u;
            mVar2.i = this;
            this.q = mVar2.f734d;
        }
        return this.q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        m mVar = this.u;
        h hVar = mVar.k;
        if (hVar != null) {
            return hVar.getDrawable();
        }
        if (mVar.m) {
            return mVar.l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // b.b.i.l1
    /* renamed from: i */
    public l1.a generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m mVar = this.u;
        if (mVar != null) {
            mVar.n(false);
            if (this.u.p()) {
                this.u.k();
                this.u.q();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m mVar = this.u;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // b.b.i.l1, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.x) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean b2 = v2.b(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f80c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (s(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b2) {
                        i5 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    s(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (b2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f80c) {
                    int i16 = width2 - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f80c) {
                int i19 = paddingLeft + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    @Override // b.b.i.l1, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        ?? r3;
        l lVar;
        boolean z3 = this.x;
        boolean z4 = View.MeasureSpec.getMode(i) == 1073741824;
        this.x = z4;
        if (z3 != z4) {
            this.y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.x && (lVar = this.q) != null && size != this.y) {
            this.y = size;
            lVar.q(true);
        }
        int childCount = getChildCount();
        if (!this.x || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                c cVar = (c) getChildAt(i7).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.z;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z5 = false;
        long j = 0;
        while (i17 < childCount2) {
            View childAt = getChildAt(i17);
            int i18 = size3;
            int i19 = i8;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i20 = i13 + 1;
                if (z6) {
                    int i21 = this.A;
                    i6 = i20;
                    r3 = 0;
                    childAt.setPadding(i21, 0, i21, 0);
                } else {
                    i6 = i20;
                    r3 = 0;
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.h = r3;
                cVar2.f82e = r3;
                cVar2.f81d = r3;
                cVar2.f83f = r3;
                ((ViewGroup.MarginLayoutParams) cVar2).leftMargin = r3;
                ((ViewGroup.MarginLayoutParams) cVar2).rightMargin = r3;
                cVar2.g = z6 && ((ActionMenuItemView) childAt).e();
                int t = t(childAt, i12, cVar2.f80c ? 1 : i10, childMeasureSpec, paddingBottom);
                i15 = Math.max(i15, t);
                if (cVar2.f83f) {
                    i16++;
                }
                if (cVar2.f80c) {
                    z5 = true;
                }
                i10 -= t;
                i14 = Math.max(i14, childAt.getMeasuredHeight());
                if (t == 1) {
                    j |= 1 << i17;
                }
                i13 = i6;
            }
            i17++;
            size3 = i18;
            i8 = i19;
        }
        int i22 = i8;
        int i23 = size3;
        boolean z7 = z5 && i13 == 2;
        boolean z8 = false;
        while (i16 > 0 && i10 > 0) {
            int i24 = Integer.MAX_VALUE;
            int i25 = 0;
            int i26 = 0;
            long j2 = 0;
            while (i25 < childCount2) {
                int i27 = i14;
                c cVar3 = (c) getChildAt(i25).getLayoutParams();
                boolean z9 = z8;
                if (cVar3.f83f) {
                    int i28 = cVar3.f81d;
                    if (i28 < i24) {
                        j2 = 1 << i25;
                        i24 = i28;
                        i26 = 1;
                    } else if (i28 == i24) {
                        i26++;
                        j2 |= 1 << i25;
                    }
                }
                i25++;
                z8 = z9;
                i14 = i27;
            }
            i3 = i14;
            z = z8;
            j |= j2;
            if (i26 > i10) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                c cVar4 = (c) childAt2.getLayoutParams();
                int i31 = i16;
                long j3 = 1 << i30;
                if ((j2 & j3) == 0) {
                    if (cVar4.f81d == i29) {
                        j |= j3;
                    }
                    z2 = z7;
                } else {
                    if (z7 && cVar4.g && i10 == 1) {
                        int i32 = this.A;
                        z2 = z7;
                        childAt2.setPadding(i32 + i12, 0, i32, 0);
                    } else {
                        z2 = z7;
                    }
                    cVar4.f81d++;
                    cVar4.h = true;
                    i10--;
                }
                i30++;
                i16 = i31;
                z7 = z2;
            }
            i14 = i3;
            z8 = true;
        }
        i3 = i14;
        z = z8;
        boolean z10 = !z5 && i13 == 1;
        if (i10 > 0 && j != 0 && (i10 < i13 - 1 || z10 || i15 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).g) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j & (1 << i33)) != 0 && !((c) getChildAt(i33).getLayoutParams()).g) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) ((i10 * i12) / bitCount) : 0;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    c cVar5 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar5.f82e = i34;
                        cVar5.h = true;
                        if (i35 == 0 && !cVar5.g) {
                            ((ViewGroup.MarginLayoutParams) cVar5).leftMargin = (-i34) / 2;
                        }
                        z = true;
                    } else if (cVar5.f80c) {
                        cVar5.f82e = i34;
                        cVar5.h = true;
                        ((ViewGroup.MarginLayoutParams) cVar5).rightMargin = (-i34) / 2;
                        z = true;
                    } else {
                        if (i35 != 0) {
                            ((ViewGroup.MarginLayoutParams) cVar5).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((ViewGroup.MarginLayoutParams) cVar5).rightMargin = i34 / 2;
                        }
                    }
                }
            }
        }
        if (z) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                c cVar6 = (c) childAt4.getLayoutParams();
                if (cVar6.h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.f81d * i12) + cVar6.f82e, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i5 = i22;
            i4 = i3;
        } else {
            i4 = i23;
            i5 = i22;
        }
        setMeasuredDimension(i5, i4);
    }

    @Override // b.b.i.l1
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.f728b = 16;
        return cVar;
    }

    @Override // b.b.i.l1
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.f728b <= 0) {
            cVar.f728b = 16;
        }
        return cVar;
    }

    public boolean s(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z = false | ((a) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? z : z | ((a) childAt2).b();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.u.s = z;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        m mVar = this.u;
        h hVar = mVar.k;
        if (hVar != null) {
            hVar.setImageDrawable(drawable);
        } else {
            mVar.m = true;
            mVar.l = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.t = z;
    }

    public void setPopupTheme(int i) {
        if (this.s != i) {
            this.s = i;
            if (i == 0) {
                this.r = getContext();
            } else {
                this.r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(m mVar) {
        this.u = mVar;
        mVar.i = this;
        this.q = mVar.f734d;
    }
}
