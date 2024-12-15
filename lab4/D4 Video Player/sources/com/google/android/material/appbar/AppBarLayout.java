package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.h.j.f;
import b.h.j.k0.b;
import b.h.j.u;
import b.h.j.y;
import b.j.a.c;
import c.c.a.b.d.b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class AppBarLayout extends LinearLayout {

    public static class BaseBehavior<T extends AppBarLayout> extends b<T> {
        public int i;
        public int j;
        public boolean k;
        public float l;
        public WeakReference<View> m;

        public static class a extends c {
            public static final Parcelable.Creator<a> CREATOR = new c.c.a.b.d.a();

            /* renamed from: d, reason: collision with root package name */
            public int f4171d;

            /* renamed from: e, reason: collision with root package name */
            public float f4172e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f4173f;

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f4171d = parcel.readInt();
                this.f4172e = parcel.readFloat();
                this.f4173f = parcel.readByte() != 0;
            }

            @Override // b.j.a.c, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.f1349b, i);
                parcel.writeInt(this.f4171d);
                parcel.writeFloat(this.f4172e);
                parcel.writeByte(this.f4173f ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.j = -1;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.j = -1;
        }

        public final View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof f) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public int E() {
            return B() + 0;
        }

        public void F(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            if (i == 0) {
                throw null;
            }
            if (i >= 0) {
                throw null;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int[] iArr) {
            if (i < 0) {
                throw null;
            }
            if (i == 0) {
                I(coordinatorLayout, appBarLayout);
            }
        }

        public boolean H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2) {
            if ((i & 2) != 0) {
                throw null;
            }
            this.m = null;
            this.i = i2;
            return false;
        }

        public final void I(CoordinatorLayout coordinatorLayout, T t) {
            u.f(b.a.h.a(), coordinatorLayout);
            u.e(coordinatorLayout, 0);
            u.f(b.a.i.a(), coordinatorLayout);
            u.e(coordinatorLayout, 0);
            if (D(coordinatorLayout) != null) {
                throw null;
            }
        }

        @Override // c.c.a.b.d.d, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.k(coordinatorLayout, (AppBarLayout) view, i);
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            F(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            G(coordinatorLayout, (AppBarLayout) view, i4, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public void u(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            if (!(parcelable instanceof a)) {
                this.j = -1;
                return;
            }
            a aVar = (a) parcelable;
            this.j = aVar.f4171d;
            this.l = aVar.f4172e;
            this.k = aVar.f4173f;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public Parcelable v(CoordinatorLayout coordinatorLayout, View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            B();
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return H(coordinatorLayout, (AppBarLayout) view, view2, i, i2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public void z(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            if (this.i == 0 || i == 1) {
                E();
                throw null;
            }
            this.m = new WeakReference<>(view2);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends c.c.a.b.d.c {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.c.a.b.b.r);
            this.f3828e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Incorrect return type in method signature: (Ljava/util/List<Landroid/view/View;>;)Lcom/google/android/material/appbar/AppBarLayout; */
        public void E(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.b bVar = ((CoordinatorLayout.e) view2.getLayoutParams()).f173a;
            if (bVar instanceof BaseBehavior) {
                int bottom = view2.getBottom() - view.getTop();
                Objects.requireNonNull((BaseBehavior) bVar);
                int D = ((bottom + 0) + 0) - D(view2);
                WeakHashMap<View, y> weakHashMap = u.f1311a;
                view.offsetTopAndBottom(D);
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public void h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean t(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            E(coordinatorLayout.j(view));
            return false;
        }
    }
}
