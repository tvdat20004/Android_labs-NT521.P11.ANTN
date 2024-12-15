package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.h.j.k0.b;
import b.h.j.k0.g;
import b.h.j.u;
import b.h.j.y;
import b.j.b.h;
import c.c.a.b.u.i;
import c.c.a.b.u.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.b<V> {
    public boolean A;
    public int B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public WeakReference<V> G;
    public WeakReference<View> H;
    public final ArrayList<d> I;
    public VelocityTracker J;
    public int K;
    public int L;
    public boolean M;
    public Map<View, Integer> N;
    public final h.a O;

    /* renamed from: a, reason: collision with root package name */
    public int f4200a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4201b;

    /* renamed from: c, reason: collision with root package name */
    public float f4202c;

    /* renamed from: d, reason: collision with root package name */
    public int f4203d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4204e;

    /* renamed from: f, reason: collision with root package name */
    public int f4205f;
    public int g;
    public boolean h;
    public i i;
    public int j;
    public boolean k;
    public m l;
    public boolean m;
    public BottomSheetBehavior<V>.f n;
    public ValueAnimator o;
    public int p;
    public int q;
    public int r;
    public float s;
    public int t;
    public float u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public h z;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f4206b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f4207c;

        public a(View view, int i) {
            this.f4206b = view;
            this.f4207c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.L(this.f4206b, this.f4207c);
        }
    }

    public class b extends h.a {
        public b() {
        }

        @Override // b.j.b.h.a
        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // b.j.b.h.a
        public int b(View view, int i, int i2) {
            int H = BottomSheetBehavior.this.H();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return b.h.b.h.g(i, H, bottomSheetBehavior.v ? bottomSheetBehavior.F : bottomSheetBehavior.t);
        }

        @Override // b.j.b.h.a
        public int d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.v ? bottomSheetBehavior.F : bottomSheetBehavior.t;
        }

        @Override // b.j.b.h.a
        public void i(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.x) {
                    bottomSheetBehavior.K(1);
                }
            }
        }

        @Override // b.j.b.h.a
        public void j(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.F(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
        
            if (java.lang.Math.abs(r8.getTop() - r7.f4209a.p) < java.lang.Math.abs(r8.getTop() - r7.f4209a.r)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        
            r9 = r7.f4209a.p;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
        
            if (java.lang.Math.abs(r9 - r7.f4209a.r) < java.lang.Math.abs(r9 - r7.f4209a.t)) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        
            if (r9 < java.lang.Math.abs(r9 - r10.t)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
        
            if (java.lang.Math.abs(r9 - r0) < java.lang.Math.abs(r9 - r7.f4209a.t)) goto L42;
         */
        @Override // b.j.b.h.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void k(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 267
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.k(android.view.View, float, float):void");
        }

        @Override // b.j.b.h.a
        public boolean l(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.y;
            if (i2 == 1 || bottomSheetBehavior.M) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.K == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.H;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.G;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public class c implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4210a;

        public c(int i) {
            this.f4210a = i;
        }

        @Override // b.h.j.k0.g
        public boolean a(View view, b.h.j.k0.f fVar) {
            BottomSheetBehavior.this.J(this.f4210a);
            return true;
        }
    }

    public static abstract class d {
    }

    public static class e extends b.j.a.c {
        public static final Parcelable.Creator<e> CREATOR = new c.c.a.b.h.c();

        /* renamed from: d, reason: collision with root package name */
        public final int f4212d;

        /* renamed from: e, reason: collision with root package name */
        public int f4213e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f4214f;
        public boolean g;
        public boolean h;

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4212d = parcel.readInt();
            this.f4213e = parcel.readInt();
            this.f4214f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
            this.h = parcel.readInt() == 1;
        }

        public e(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f4212d = bottomSheetBehavior.y;
            this.f4213e = bottomSheetBehavior.f4203d;
            this.f4214f = bottomSheetBehavior.f4201b;
            this.g = bottomSheetBehavior.v;
            this.h = bottomSheetBehavior.w;
        }

        @Override // b.j.a.c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1349b, i);
            parcel.writeInt(this.f4212d);
            parcel.writeInt(this.f4213e);
            parcel.writeInt(this.f4214f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
        }
    }

    public class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final View f4215b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4216c;

        /* renamed from: d, reason: collision with root package name */
        public int f4217d;

        public f(View view, int i) {
            this.f4215b = view;
            this.f4217d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = BottomSheetBehavior.this.z;
            if (hVar == null || !hVar.i(true)) {
                BottomSheetBehavior.this.K(this.f4217d);
            } else {
                View view = this.f4215b;
                WeakHashMap<View, y> weakHashMap = u.f1311a;
                view.postOnAnimation(this);
            }
            this.f4216c = false;
        }
    }

    public BottomSheetBehavior() {
        this.f4200a = 0;
        this.f4201b = true;
        this.n = null;
        this.s = 0.5f;
        this.u = -1.0f;
        this.x = true;
        this.y = 4;
        this.I = new ArrayList<>();
        this.O = new b();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelOffset;
        int i;
        this.f4200a = 0;
        this.f4201b = true;
        this.n = null;
        this.s = 0.5f;
        this.u = -1.0f;
        this.x = true;
        this.y = 4;
        this.I = new ArrayList<>();
        this.O = new b();
        this.g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.c.a.b.b.f3804b);
        this.h = obtainStyledAttributes.hasValue(11);
        boolean hasValue = obtainStyledAttributes.hasValue(1);
        if (hasValue) {
            E(context, attributeSet, hasValue, c.c.a.b.a.e(context, obtainStyledAttributes, 1));
        } else {
            E(context, attributeSet, hasValue, null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.o = ofFloat;
        ofFloat.setDuration(500L);
        this.o.addUpdateListener(new c.c.a.b.h.a(this));
        this.u = obtainStyledAttributes.getDimension(0, -1.0f);
        TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        if (peekValue == null || (i = peekValue.data) != -1) {
            I(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        } else {
            I(i);
        }
        boolean z = obtainStyledAttributes.getBoolean(6, false);
        if (this.v != z) {
            this.v = z;
            if (!z && this.y == 5) {
                J(4);
            }
            P();
        }
        this.k = obtainStyledAttributes.getBoolean(10, false);
        boolean z2 = obtainStyledAttributes.getBoolean(4, true);
        if (this.f4201b != z2) {
            this.f4201b = z2;
            if (this.G != null) {
                C();
            }
            K((this.f4201b && this.y == 6) ? 3 : this.y);
            P();
        }
        this.w = obtainStyledAttributes.getBoolean(9, false);
        this.x = obtainStyledAttributes.getBoolean(2, true);
        this.f4200a = obtainStyledAttributes.getInt(8, 0);
        float f2 = obtainStyledAttributes.getFloat(5, 0.5f);
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.s = f2;
        if (this.G != null) {
            this.r = (int) ((1.0f - f2) * this.F);
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(3);
        if (peekValue2 == null || peekValue2.type != 16) {
            dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            dimensionPixelOffset = peekValue2.data;
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.p = dimensionPixelOffset;
        obtainStyledAttributes.recycle();
        this.f4202c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.y == 1 && actionMasked == 0) {
            return true;
        }
        h hVar = this.z;
        if (hVar != null) {
            hVar.p(motionEvent);
        }
        if (actionMasked == 0) {
            this.K = -1;
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.J = null;
            }
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        if (this.z != null && actionMasked == 2 && !this.A) {
            float abs = Math.abs(this.L - motionEvent.getY());
            h hVar2 = this.z;
            if (abs > hVar2.f1360b) {
                hVar2.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.A;
    }

    public final void B(V v, b.a aVar, int i) {
        u.g(v, aVar, null, new c(i));
    }

    public final void C() {
        int D = D();
        if (this.f4201b) {
            this.t = Math.max(this.F - D, this.q);
        } else {
            this.t = this.F - D;
        }
    }

    public final int D() {
        int i;
        return this.f4204e ? Math.min(Math.max(this.f4205f, this.F - ((this.E * 9) / 16)), this.D) : (this.k || (i = this.j) <= 0) ? this.f4203d : Math.max(this.f4203d, i + this.g);
    }

    public final void E(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.h) {
            this.l = m.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
            i iVar = new i(this.l);
            this.i = iVar;
            iVar.f4024b.f4019b = new c.c.a.b.n.a(context);
            iVar.w();
            if (z && colorStateList != null) {
                this.i.p(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.i.setTint(typedValue.data);
        }
    }

    public void F(int i) {
        if (this.G.get() == null || this.I.isEmpty()) {
            return;
        }
        if (i <= this.t) {
            H();
        }
        if (this.I.size() <= 0) {
            return;
        }
        this.I.get(0);
        throw null;
    }

    public View G(View view) {
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View G = G(viewGroup.getChildAt(i));
            if (G != null) {
                return G;
            }
        }
        return null;
    }

    public int H() {
        return this.f4201b ? this.q : this.p;
    }

    public void I(int i) {
        boolean z = true;
        if (i == -1) {
            if (!this.f4204e) {
                this.f4204e = true;
            }
            z = false;
        } else {
            if (this.f4204e || this.f4203d != i) {
                this.f4204e = false;
                this.f4203d = Math.max(0, i);
            }
            z = false;
        }
        if (z) {
            S(false);
        }
    }

    public void J(int i) {
        if (i == this.y) {
            return;
        }
        if (this.G != null) {
            M(i);
            return;
        }
        if (i == 4 || i == 3 || i == 6 || (this.v && i == 5)) {
            this.y = i;
        }
    }

    public void K(int i) {
        if (this.y == i) {
            return;
        }
        this.y = i;
        WeakReference<V> weakReference = this.G;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        if (i == 3) {
            R(true);
        } else if (i == 6 || i == 5 || i == 4) {
            R(false);
        }
        Q(i);
        if (this.I.size() <= 0) {
            P();
        } else {
            this.I.get(0);
            throw null;
        }
    }

    public void L(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.t;
        } else if (i == 6) {
            int i4 = this.r;
            if (!this.f4201b || i4 > (i3 = this.q)) {
                i2 = i4;
            } else {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = H();
        } else {
            if (!this.v || i != 5) {
                throw new IllegalArgumentException(c.a.a.a.a.b("Illegal state argument: ", i));
            }
            i2 = this.F;
        }
        O(view, i, i2, false);
    }

    public final void M(int i) {
        V v = this.G.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, y> weakHashMap = u.f1311a;
            if (v.isAttachedToWindow()) {
                v.post(new a(v, i));
                return;
            }
        }
        L(v, i);
    }

    public boolean N(View view, float f2) {
        if (this.w) {
            return true;
        }
        if (view.getTop() < this.t) {
            return false;
        }
        return Math.abs(((f2 * 0.1f) + ((float) view.getTop())) - ((float) this.t)) / ((float) D()) > 0.5f;
    }

    public void O(View view, int i, int i2, boolean z) {
        h hVar = this.z;
        if (!(hVar != null && (!z ? !hVar.x(view, view.getLeft(), i2) : !hVar.v(view.getLeft(), i2)))) {
            K(i);
            return;
        }
        K(2);
        Q(i);
        if (this.n == null) {
            this.n = new f(view, i);
        }
        BottomSheetBehavior<V>.f fVar = this.n;
        boolean z2 = fVar.f4216c;
        fVar.f4217d = i;
        if (z2) {
            return;
        }
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        view.postOnAnimation(fVar);
        this.n.f4216c = true;
    }

    public final void P() {
        V v;
        int i;
        b.a aVar;
        WeakReference<V> weakReference = this.G;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        u.f(524288, v);
        u.e(v, 0);
        u.f(262144, v);
        u.e(v, 0);
        u.f(1048576, v);
        u.e(v, 0);
        if (this.v && this.y != 5) {
            B(v, b.a.l, 5);
        }
        int i2 = this.y;
        if (i2 == 3) {
            i = this.f4201b ? 4 : 6;
            aVar = b.a.k;
        } else {
            if (i2 != 4) {
                if (i2 != 6) {
                    return;
                }
                B(v, b.a.k, 4);
                B(v, b.a.j, 3);
                return;
            }
            i = this.f4201b ? 3 : 6;
            aVar = b.a.j;
        }
        B(v, aVar, i);
    }

    public final void Q(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.m != z) {
            this.m = z;
            if (this.i == null || (valueAnimator = this.o) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.o.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.o.setFloatValues(1.0f - f2, f2);
            this.o.start();
        }
    }

    public final void R(boolean z) {
        WeakReference<V> weakReference = this.G;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.N != null) {
                    return;
                } else {
                    this.N = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.G.get() && z) {
                    this.N.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.N = null;
        }
    }

    public final void S(boolean z) {
        V v;
        if (this.G != null) {
            C();
            if (this.y != 4 || (v = this.G.get()) == null) {
                return;
            }
            if (z) {
                M(this.y);
            } else {
                v.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void f(CoordinatorLayout.e eVar) {
        this.G = null;
        this.z = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void i() {
        this.G = null;
        this.z = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        h hVar;
        if (!v.isShown() || !this.x) {
            this.A = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.K = -1;
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.J = null;
            }
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.L = (int) motionEvent.getY();
            if (this.y != 2) {
                WeakReference<View> weakReference = this.H;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.o(view, x, this.L)) {
                    this.K = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.M = true;
                }
            }
            this.A = this.K == -1 && !coordinatorLayout.o(v, x, this.L);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.M = false;
            this.K = -1;
            if (this.A) {
                this.A = false;
                return false;
            }
        }
        if (!this.A && (hVar = this.z) != null && hVar.w(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.H;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.A || this.y == 1 || coordinatorLayout.o(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.z == null || Math.abs(((float) this.L) - motionEvent.getY()) <= ((float) this.z.f1360b)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        i iVar;
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.G == null) {
            this.f4205f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.k && !this.f4204e) {
                c.c.a.b.a.b(v, new c.c.a.b.h.b(this));
            }
            this.G = new WeakReference<>(v);
            if (this.h && (iVar = this.i) != null) {
                v.setBackground(iVar);
            }
            i iVar2 = this.i;
            if (iVar2 != null) {
                float f2 = this.u;
                if (f2 == -1.0f) {
                    f2 = v.getElevation();
                }
                iVar2.o(f2);
                boolean z = this.y == 3;
                this.m = z;
                this.i.q(z ? 0.0f : 1.0f);
            }
            P();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.z == null) {
            this.z = new h(coordinatorLayout.getContext(), coordinatorLayout, this.O);
        }
        int top = v.getTop();
        coordinatorLayout.q(v, i);
        this.E = coordinatorLayout.getWidth();
        this.F = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.D = height;
        this.q = Math.max(0, this.F - height);
        this.r = (int) ((1.0f - this.s) * this.F);
        C();
        int i3 = this.y;
        if (i3 == 3) {
            i2 = H();
        } else if (i3 == 6) {
            i2 = this.r;
        } else if (this.v && i3 == 5) {
            i2 = this.F;
        } else {
            if (i3 != 4) {
                if (i3 == 1 || i3 == 2) {
                    v.offsetTopAndBottom(top - v.getTop());
                }
                this.H = new WeakReference<>(G(v));
                return true;
            }
            i2 = this.t;
        }
        v.offsetTopAndBottom(i2);
        this.H = new WeakReference<>(G(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean n(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.H;
        return (weakReference == null || view != weakReference.get() || this.y == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.H;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i2;
        if (i2 > 0) {
            if (i5 < H()) {
                iArr[1] = top - H();
                int i6 = -iArr[1];
                WeakHashMap<View, y> weakHashMap = u.f1311a;
                v.offsetTopAndBottom(i6);
                i4 = 3;
                K(i4);
            } else {
                if (!this.x) {
                    return;
                }
                iArr[1] = i2;
                int i7 = -i2;
                WeakHashMap<View, y> weakHashMap2 = u.f1311a;
                v.offsetTopAndBottom(i7);
                K(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i8 = this.t;
            if (i5 > i8 && !this.v) {
                iArr[1] = top - i8;
                int i9 = -iArr[1];
                WeakHashMap<View, y> weakHashMap3 = u.f1311a;
                v.offsetTopAndBottom(i9);
                i4 = 4;
                K(i4);
            } else {
                if (!this.x) {
                    return;
                }
                iArr[1] = i2;
                int i72 = -i2;
                WeakHashMap<View, y> weakHashMap22 = u.f1311a;
                v.offsetTopAndBottom(i72);
                K(1);
            }
        }
        F(v.getTop());
        this.B = i2;
        this.C = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void u(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        e eVar = (e) parcelable;
        int i = this.f4200a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f4203d = eVar.f4213e;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f4201b = eVar.f4214f;
            }
            if (i == -1 || (i & 4) == 4) {
                this.v = eVar.g;
            }
            if (i == -1 || (i & 8) == 8) {
                this.w = eVar.h;
            }
        }
        int i2 = eVar.f4212d;
        if (i2 == 1 || i2 == 2) {
            this.y = 4;
        } else {
            this.y = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Parcelable v(CoordinatorLayout coordinatorLayout, V v) {
        return new e((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.B = 0;
        this.C = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4 > r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        r4 = r3.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        if (java.lang.Math.abs(r4 - r3.q) < java.lang.Math.abs(r4 - r3.t)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
    
        if (r4 < java.lang.Math.abs(r4 - r3.t)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0095, code lost:
    
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.t)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b0, code lost:
    
        if (java.lang.Math.abs(r4 - r3.r) < java.lang.Math.abs(r4 - r3.t)) goto L50;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.H()
            r0 = 3
            if (r4 != r7) goto Lf
            r3.K(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.H
            if (r4 == 0) goto Lc0
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto Lc0
            boolean r4 = r3.C
            if (r4 != 0) goto L1f
            goto Lc0
        L1f:
            int r4 = r3.B
            r6 = 4
            r7 = 6
            if (r4 <= 0) goto L34
            boolean r4 = r3.f4201b
            if (r4 == 0) goto L2a
            goto L74
        L2a:
            int r4 = r5.getTop()
            int r6 = r3.r
            if (r4 <= r6) goto L85
            goto Lb4
        L34:
            boolean r4 = r3.v
            if (r4 == 0) goto L57
            android.view.VelocityTracker r4 = r3.J
            if (r4 != 0) goto L3e
            r4 = 0
            goto L4d
        L3e:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f4202c
            r4.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r4 = r3.J
            int r1 = r3.K
            float r4 = r4.getYVelocity(r1)
        L4d:
            boolean r4 = r3.N(r5, r4)
            if (r4 == 0) goto L57
            int r4 = r3.F
            r0 = 5
            goto Lba
        L57:
            int r4 = r3.B
            if (r4 != 0) goto L98
            int r4 = r5.getTop()
            boolean r1 = r3.f4201b
            if (r1 == 0) goto L77
            int r7 = r3.q
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            int r1 = r3.t
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r7 >= r4) goto Lb7
        L74:
            int r4 = r3.q
            goto Lba
        L77:
            int r1 = r3.r
            if (r4 >= r1) goto L88
            int r6 = r3.t
            int r6 = r4 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r4 >= r6) goto Lb2
        L85:
            int r4 = r3.p
            goto Lba
        L88:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.t
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto Lb7
            goto Lb2
        L98:
            boolean r4 = r3.f4201b
            if (r4 == 0) goto L9d
            goto Lb7
        L9d:
            int r4 = r5.getTop()
            int r0 = r3.r
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.t
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto Lb7
        Lb2:
            int r6 = r3.r
        Lb4:
            r4 = r6
            r0 = r7
            goto Lba
        Lb7:
            int r4 = r3.t
            r0 = r6
        Lba:
            r6 = 0
            r3.O(r5, r0, r4, r6)
            r3.C = r6
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.z(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }
}
