package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import b.h.j.i;
import b.h.j.j;
import b.h.j.j0;
import b.h.j.k;
import b.h.j.u;
import b.h.j.y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements b.h.j.h, i {
    public static final String v;
    public static final Class<?>[] w;
    public static final ThreadLocal<Map<String, Constructor<b>>> x;
    public static final Comparator<View> y;
    public static final b.h.i.c<Rect> z;

    /* renamed from: b, reason: collision with root package name */
    public final List<View> f166b;

    /* renamed from: c, reason: collision with root package name */
    public final b.g.b.b<View> f167c;

    /* renamed from: d, reason: collision with root package name */
    public final List<View> f168d;

    /* renamed from: e, reason: collision with root package name */
    public final List<View> f169e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f170f;
    public final int[] g;
    public final int[] h;
    public boolean i;
    public boolean j;
    public int[] k;
    public View l;
    public View m;
    public f n;
    public boolean o;
    public j0 p;
    public boolean q;
    public Drawable r;
    public ViewGroup.OnHierarchyChangeListener s;
    public k t;
    public final j u;

    public class a implements k {
        public a() {
        }

        @Override // b.h.j.k
        public j0 a(View view, j0 j0Var) {
            b bVar;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.p, j0Var)) {
                coordinatorLayout.p = j0Var;
                boolean z = j0Var.d() > 0;
                coordinatorLayout.q = z;
                coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                if (!j0Var.f1281a.i()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, y> weakHashMap = u.f1311a;
                        if (childAt.getFitsSystemWindows() && (bVar = ((e) childAt.getLayoutParams()).f173a) != null) {
                            j0Var = bVar.e(j0Var);
                            if (j0Var.f1281a.i()) {
                                break;
                            }
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return j0Var;
        }
    }

    public static abstract class b<V extends View> {
        public b() {
        }

        public b(Context context, AttributeSet attributeSet) {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int b() {
            return -16777216;
        }

        public float c() {
            return 0.0f;
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public j0 e(j0 j0Var) {
            return j0Var;
        }

        public void f(e eVar) {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void h(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void i() {
        }

        public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public abstract boolean k(CoordinatorLayout coordinatorLayout, V v, int i);

        public boolean l(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean m() {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
            return false;
        }

        @Deprecated
        public void o() {
        }

        public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                o();
            }
        }

        @Deprecated
        public void q() {
        }

        public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            if (i5 == 0) {
                q();
            }
        }

        @Deprecated
        public void s() {
        }

        public boolean t(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void u(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable v(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean w() {
            return false;
        }

        public boolean x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return w();
            }
            return false;
        }

        @Deprecated
        public void y() {
        }

        public void z(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                y();
            }
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface c {
        Class<? extends b> value();
    }

    public class d implements ViewGroup.OnHierarchyChangeListener {
        public d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.p(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public b f173a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f174b;

        /* renamed from: c, reason: collision with root package name */
        public int f175c;

        /* renamed from: d, reason: collision with root package name */
        public int f176d;

        /* renamed from: e, reason: collision with root package name */
        public int f177e;

        /* renamed from: f, reason: collision with root package name */
        public int f178f;
        public int g;
        public int h;
        public int i;
        public int j;
        public View k;
        public View l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public final Rect q;

        public e(int i, int i2) {
            super(i, i2);
            this.f174b = false;
            this.f175c = 0;
            this.f176d = 0;
            this.f177e = -1;
            this.f178f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            b newInstance;
            this.f174b = false;
            this.f175c = 0;
            this.f176d = 0;
            this.f177e = -1;
            this.f178f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.g.a.f1105b);
            this.f175c = obtainStyledAttributes.getInteger(0, 0);
            this.f178f = obtainStyledAttributes.getResourceId(1, -1);
            this.f176d = obtainStyledAttributes.getInteger(2, 0);
            this.f177e = obtainStyledAttributes.getInteger(6, -1);
            this.g = obtainStyledAttributes.getInt(5, 0);
            this.h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f174b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.v;
                if (TextUtils.isEmpty(string)) {
                    newInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.v;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<b>>> threadLocal = CoordinatorLayout.x;
                        Map<String, Constructor<b>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<b> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.w);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        newInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e2) {
                        throw new RuntimeException(c.a.a.a.a.g("Could not inflate Behavior subclass ", string), e2);
                    }
                }
                this.f173a = newInstance;
            }
            obtainStyledAttributes.recycle();
            b bVar = this.f173a;
            if (bVar != null) {
                bVar.f(this);
            }
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f174b = false;
            this.f175c = 0;
            this.f176d = 0;
            this.f177e = -1;
            this.f178f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f174b = false;
            this.f175c = 0;
            this.f176d = 0;
            this.f177e = -1;
            this.f178f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f174b = false;
            this.f175c = 0;
            this.f176d = 0;
            this.f177e = -1;
            this.f178f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public boolean a(int i) {
            if (i == 0) {
                return this.n;
            }
            if (i != 1) {
                return false;
            }
            return this.o;
        }

        public void b(int i, boolean z) {
            if (i == 0) {
                this.n = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.o = z;
            }
        }
    }

    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.p(0);
            return true;
        }
    }

    public static class g extends b.j.a.c {
        public static final Parcelable.Creator<g> CREATOR = new b.g.b.a();

        /* renamed from: d, reason: collision with root package name */
        public SparseArray<Parcelable> f180d;

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f180d = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f180d.append(iArr[i], readParcelableArray[i]);
            }
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // b.j.a.c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1349b, i);
            SparseArray<Parcelable> sparseArray = this.f180d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f180d.keyAt(i2);
                parcelableArr[i2] = this.f180d.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    public static class h implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            WeakHashMap<View, y> weakHashMap = u.f1311a;
            float z = view.getZ();
            float z2 = view2.getZ();
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        v = r0 != null ? r0.getName() : null;
        y = new h();
        w = new Class[]{Context.class, AttributeSet.class};
        x = new ThreadLocal<>();
        z = new b.h.i.d(12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = b.g.a.f1104a;
        this.f166b = new ArrayList();
        this.f167c = new b.g.b.b<>();
        this.f168d = new ArrayList();
        this.f169e = new ArrayList();
        this.g = new int[2];
        this.h = new int[2];
        this.u = new j();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.k = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.k.length;
            for (int i = 0; i < length; i++) {
                this.k[i] = (int) (r0[i] * f2);
            }
        }
        this.r = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new d());
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect a2 = z.a();
        return a2 == null ? new Rect() : a2;
    }

    @Override // b.h.j.h
    public void a(View view, View view2, int i, int i2) {
        b bVar;
        j jVar = this.u;
        if (i2 == 1) {
            jVar.f1279b = i;
        } else {
            jVar.f1278a = i;
        }
        this.m = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            e eVar = (e) getChildAt(i3).getLayoutParams();
            if (eVar.a(i2) && (bVar = eVar.f173a) != null && i2 == 0) {
                bVar.s();
            }
        }
    }

    @Override // b.h.j.h
    public void b(View view, int i) {
        j jVar = this.u;
        if (i == 1) {
            jVar.f1279b = 0;
        } else {
            jVar.f1278a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i)) {
                b bVar = eVar.f173a;
                if (bVar != null) {
                    bVar.z(this, childAt, view, i);
                }
                eVar.b(i, false);
                eVar.p = false;
            }
        }
        this.m = null;
    }

    @Override // b.h.j.h
    public void c(View view, int i, int i2, int[] iArr, int i3) {
        b bVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i3) && (bVar = eVar.f173a) != null) {
                    int[] iArr2 = this.g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.p(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.g;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.g;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // b.h.j.i
    public void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        b bVar;
        boolean z2;
        int min;
        int childCount = getChildCount();
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i5) && (bVar = eVar.f173a) != null) {
                    int[] iArr2 = this.g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.r(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.g;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    if (i4 > 0) {
                        z2 = true;
                        min = Math.max(i7, this.g[1]);
                    } else {
                        z2 = true;
                        min = Math.min(i7, this.g[1]);
                    }
                    i7 = min;
                    z3 = z2;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z3) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        e eVar = (e) view.getLayoutParams();
        b bVar = eVar.f173a;
        if (bVar != null) {
            float c2 = bVar.c();
            if (c2 > 0.0f) {
                if (this.f170f == null) {
                    this.f170f = new Paint();
                }
                this.f170f.setColor(eVar.f173a.b());
                Paint paint = this.f170f;
                int round = Math.round(c2 * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = 255;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f170f);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.r;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // b.h.j.h
    public void e(View view, int i, int i2, int i3, int i4, int i5) {
        d(view, i, i2, i3, i4, 0, this.h);
    }

    @Override // b.h.j.h
    public boolean f(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b bVar = eVar.f173a;
                if (bVar != null) {
                    boolean x2 = bVar.x(this, childAt, view, view2, i, i2);
                    z2 |= x2;
                    eVar.b(i2, x2);
                } else {
                    eVar.b(i2, false);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f166b);
    }

    public final j0 getLastWindowInsets() {
        return this.p;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.u.a();
    }

    public Drawable getStatusBarBackground() {
        return this.r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(e eVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public void i(View view, boolean z2, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> j(View view) {
        b.g.b.b<View> bVar = this.f167c;
        int i = bVar.f1107b.f915d;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList<View> k = bVar.f1107b.k(i2);
            if (k != null && k.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(bVar.f1107b.h(i2));
            }
        }
        this.f169e.clear();
        if (arrayList != null) {
            this.f169e.addAll(arrayList);
        }
        return this.f169e;
    }

    public void k(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = b.g.b.c.f1110a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = b.g.b.c.f1110a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        b.g.b.c.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = b.g.b.c.f1111b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final void l(int i, Rect rect, Rect rect2, e eVar, int i2, int i3) {
        int i4 = eVar.f175c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = eVar.f176d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public final int m(int i) {
        StringBuilder sb;
        int[] iArr = this.k;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else {
            if (i >= 0 && i < iArr.length) {
                return iArr[i];
            }
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public e n(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f174b) {
            c cVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                cVar = (c) cls.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    b newInstance = cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    b bVar = eVar.f173a;
                    if (bVar != newInstance) {
                        if (bVar != null) {
                            bVar.i();
                        }
                        eVar.f173a = newInstance;
                        eVar.f174b = true;
                        if (newInstance != null) {
                            newInstance.f(eVar);
                        }
                    }
                } catch (Exception e2) {
                    StringBuilder j = c.a.a.a.a.j("Default behavior class ");
                    j.append(cVar.value().getName());
                    j.append(" could not be instantiated. Did you forget a default constructor?");
                    Log.e("CoordinatorLayout", j.toString(), e2);
                }
            }
            eVar.f174b = true;
        }
        return eVar;
    }

    public boolean o(View view, int i, int i2) {
        Rect g2 = g();
        k(view, g2);
        try {
            return g2.contains(i, i2);
        } finally {
            g2.setEmpty();
            z.b(g2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.o) {
            if (this.n == null) {
                this.n = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.n);
        }
        if (this.p == null) {
            WeakHashMap<View, y> weakHashMap = u.f1311a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.o && this.n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.n);
        }
        View view = this.m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.j = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.q || this.r == null) {
            return;
        }
        j0 j0Var = this.p;
        int d2 = j0Var != null ? j0Var.d() : 0;
        if (d2 > 0) {
            this.r.setBounds(0, 0, getWidth(), d2);
            this.r.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        b bVar;
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        int layoutDirection = getLayoutDirection();
        int size = this.f166b.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f166b.get(i5);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).f173a) == null || !bVar.k(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0180, code lost:
    
        if (r0.l(r30, r20, r8, r21, r23, 0) == false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0183  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        b bVar;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f173a) != null) {
                    z3 |= bVar.m();
                }
            }
        }
        if (z3) {
            p(1);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        b bVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f173a) != null) {
                    z2 |= bVar.n(this, childAt, view, f2, f3);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        c(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        d(view, i, i2, i3, i4, 0, this.h);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f1349b);
        SparseArray<Parcelable> sparseArray = gVar.f180d;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVar = n(childAt).f173a;
            if (id != -1 && bVar != null && (parcelable2 = sparseArray.get(id)) != null) {
                bVar.u(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable v2;
        g gVar = new g(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVar = ((e) childAt.getLayoutParams()).f173a;
            if (id != -1 && bVar != null && (v2 = bVar.v(this, childAt)) != null) {
                sparseArray.append(id, v2);
            }
        }
        gVar.f180d = sparseArray;
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.l
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r6 = r6.f173a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.l
            boolean r6 = r6.A(r0, r7, r1)
            goto L2a
        L29:
            r6 = r5
        L2a:
            android.view.View r7 = r0.l
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.t(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i) {
        int i2;
        Rect rect;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Rect rect2;
        int i12;
        e eVar;
        b bVar;
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        int layoutDirection = getLayoutDirection();
        int size = this.f166b.size();
        Rect g2 = g();
        Rect g3 = g();
        Rect g4 = g();
        int i13 = 0;
        while (i13 < size) {
            View view = this.f166b.get(i13);
            e eVar2 = (e) view.getLayoutParams();
            if (i == 0 && view.getVisibility() == 8) {
                i3 = size;
                rect = g4;
                i2 = i13;
            } else {
                int i14 = 0;
                while (i14 < i13) {
                    if (eVar2.l == this.f166b.get(i14)) {
                        e eVar3 = (e) view.getLayoutParams();
                        if (eVar3.k != null) {
                            Rect g5 = g();
                            Rect g6 = g();
                            Rect g7 = g();
                            k(eVar3.k, g5);
                            i(view, false, g6);
                            int measuredWidth = view.getMeasuredWidth();
                            i11 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            i12 = i13;
                            i10 = i14;
                            rect2 = g4;
                            eVar = eVar2;
                            l(layoutDirection, g5, g7, eVar3, measuredWidth, measuredHeight);
                            boolean z5 = (g7.left == g6.left && g7.top == g6.top) ? false : true;
                            h(eVar3, g7, measuredWidth, measuredHeight);
                            int i15 = g7.left - g6.left;
                            int i16 = g7.top - g6.top;
                            if (i15 != 0) {
                                WeakHashMap<View, y> weakHashMap2 = u.f1311a;
                                view.offsetLeftAndRight(i15);
                            }
                            if (i16 != 0) {
                                WeakHashMap<View, y> weakHashMap3 = u.f1311a;
                                view.offsetTopAndBottom(i16);
                            }
                            if (z5 && (bVar = eVar3.f173a) != null) {
                                bVar.g(this, view, eVar3.k);
                            }
                            g5.setEmpty();
                            b.h.i.c<Rect> cVar = z;
                            cVar.b(g5);
                            g6.setEmpty();
                            cVar.b(g6);
                            g7.setEmpty();
                            cVar.b(g7);
                            i14 = i10 + 1;
                            eVar2 = eVar;
                            size = i11;
                            i13 = i12;
                            g4 = rect2;
                        }
                    }
                    i10 = i14;
                    i11 = size;
                    rect2 = g4;
                    i12 = i13;
                    eVar = eVar2;
                    i14 = i10 + 1;
                    eVar2 = eVar;
                    size = i11;
                    i13 = i12;
                    g4 = rect2;
                }
                int i17 = size;
                Rect rect3 = g4;
                i2 = i13;
                e eVar4 = eVar2;
                i(view, true, g3);
                if (eVar4.g != 0 && !g3.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(eVar4.g, layoutDirection);
                    int i18 = absoluteGravity & 112;
                    if (i18 == 48) {
                        g2.top = Math.max(g2.top, g3.bottom);
                    } else if (i18 == 80) {
                        g2.bottom = Math.max(g2.bottom, getHeight() - g3.top);
                    }
                    int i19 = absoluteGravity & 7;
                    if (i19 == 3) {
                        g2.left = Math.max(g2.left, g3.right);
                    } else if (i19 == 5) {
                        g2.right = Math.max(g2.right, getWidth() - g3.left);
                    }
                }
                if (eVar4.h != 0 && view.getVisibility() == 0) {
                    WeakHashMap<View, y> weakHashMap4 = u.f1311a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        e eVar5 = (e) view.getLayoutParams();
                        b bVar2 = eVar5.f173a;
                        Rect g8 = g();
                        Rect g9 = g();
                        g9.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (bVar2 == null || !bVar2.a(this, view, g8)) {
                            g8.set(g9);
                        } else if (!g9.contains(g8)) {
                            StringBuilder j = c.a.a.a.a.j("Rect should be within the child's bounds. Rect:");
                            j.append(g8.toShortString());
                            j.append(" | Bounds:");
                            j.append(g9.toShortString());
                            throw new IllegalArgumentException(j.toString());
                        }
                        g9.setEmpty();
                        b.h.i.c<Rect> cVar2 = z;
                        cVar2.b(g9);
                        if (!g8.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar5.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (g8.top - ((ViewGroup.MarginLayoutParams) eVar5).topMargin) - eVar5.j) >= (i9 = g2.top)) {
                                z3 = false;
                            } else {
                                v(view, i9 - i8);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g8.bottom) - ((ViewGroup.MarginLayoutParams) eVar5).bottomMargin) + eVar5.j) < (i7 = g2.bottom)) {
                                v(view, height - i7);
                                z3 = true;
                            }
                            if (!z3) {
                                v(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (g8.left - ((ViewGroup.MarginLayoutParams) eVar5).leftMargin) - eVar5.i) >= (i6 = g2.left)) {
                                z4 = false;
                            } else {
                                u(view, i6 - i5);
                                z4 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g8.right) - ((ViewGroup.MarginLayoutParams) eVar5).rightMargin) + eVar5.i) < (i4 = g2.right)) {
                                u(view, width - i4);
                                z4 = true;
                            }
                            if (!z4) {
                                u(view, 0);
                            }
                        }
                        g8.setEmpty();
                        cVar2.b(g8);
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((e) view.getLayoutParams()).q);
                    if (rect.equals(g3)) {
                        i3 = i17;
                    } else {
                        ((e) view.getLayoutParams()).q.set(g3);
                    }
                } else {
                    rect = rect3;
                }
                i3 = i17;
                for (int i20 = i2 + 1; i20 < i3; i20++) {
                    View view2 = this.f166b.get(i20);
                    e eVar6 = (e) view2.getLayoutParams();
                    b bVar3 = eVar6.f173a;
                    if (bVar3 != null && bVar3.d(this, view2, view)) {
                        if (i == 0 && eVar6.p) {
                            eVar6.p = false;
                        } else {
                            if (i != 2) {
                                z2 = bVar3.g(this, view2, view);
                            } else {
                                bVar3.h(this, view2, view);
                                z2 = true;
                            }
                            if (i == 1) {
                                eVar6.p = z2;
                            }
                        }
                    }
                }
            }
            i13 = i2 + 1;
            size = i3;
            g4 = rect;
        }
        Rect rect4 = g4;
        g2.setEmpty();
        b.h.i.c<Rect> cVar3 = z;
        cVar3.b(g2);
        g3.setEmpty();
        cVar3.b(g3);
        rect4.setEmpty();
        cVar3.b(rect4);
    }

    public void q(View view, int i) {
        Rect g2;
        Rect g3;
        b.h.i.c<Rect> cVar;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.k;
        int i2 = 0;
        if (view2 == null && eVar.f178f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            g2 = g();
            g3 = g();
            try {
                k(view2, g2);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, g2, g3, eVar2, measuredWidth, measuredHeight);
                h(eVar2, g3, measuredWidth, measuredHeight);
                view.layout(g3.left, g3.top, g3.right, g3.bottom);
                return;
            } finally {
                g2.setEmpty();
                cVar = z;
                cVar.b(g2);
                g3.setEmpty();
                cVar.b(g3);
            }
        }
        int i3 = eVar.f177e;
        if (i3 < 0) {
            e eVar3 = (e) view.getLayoutParams();
            g2 = g();
            g2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.p != null) {
                WeakHashMap<View, y> weakHashMap = u.f1311a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    g2.left = this.p.b() + g2.left;
                    g2.top = this.p.d() + g2.top;
                    g2.right -= this.p.c();
                    g2.bottom -= this.p.a();
                }
            }
            g3 = g();
            int i4 = eVar3.f175c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), g2, g3, i);
            view.layout(g3.left, g3.top, g3.right, g3.bottom);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        int i5 = eVar4.f175c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int m = m(i3) - measuredWidth2;
        if (i6 == 1) {
            m += measuredWidth2 / 2;
        } else if (i6 == 5) {
            m += measuredWidth2;
        }
        if (i7 == 16) {
            i2 = 0 + (measuredHeight2 / 2);
        } else if (i7 == 80) {
            i2 = measuredHeight2 + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f168d;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = y;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z3 = false;
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            e eVar = (e) view.getLayoutParams();
            b bVar = eVar.f173a;
            if (!(z3 || z4) || actionMasked == 0) {
                if (!z3 && bVar != null) {
                    if (i == 0) {
                        z3 = bVar.j(this, view, motionEvent);
                    } else if (i == 1) {
                        z3 = bVar.A(this, view, motionEvent);
                    }
                    if (z3) {
                        this.l = view;
                    }
                }
                b bVar2 = eVar.f173a;
                if (bVar2 == null) {
                    eVar.m = false;
                }
                boolean z5 = eVar.m;
                if (z5) {
                    z2 = true;
                } else {
                    z2 = (bVar2 != null && bVar2.c() > 0.0f) | z5;
                    eVar.m = z2;
                }
                boolean z6 = z2 && !z5;
                if (z2 && !z6) {
                    break;
                }
                z4 = z6;
            } else if (bVar != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    bVar.j(this, view, motionEvent2);
                } else if (i == 1) {
                    bVar.A(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        b bVar = ((e) view.getLayoutParams()).f173a;
        if (bVar == null || !bVar.t(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.i) {
            return;
        }
        t(false);
        this.i = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0074, code lost:
    
        if (r5 != false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0163 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.r = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.r.setState(getDrawableState());
                }
                Drawable drawable3 = this.r;
                WeakHashMap<View, y> weakHashMap = u.f1311a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.r.setVisible(getVisibility() == 0, false);
                this.r.setCallback(this);
            }
            WeakHashMap<View, y> weakHashMap2 = u.f1311a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            Context context = getContext();
            Object obj = b.h.b.b.f1117a;
            drawable = context.getDrawable(i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.r;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.r.setVisible(z2, false);
    }

    public final void t(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            b bVar = ((e) childAt.getLayoutParams()).f173a;
            if (bVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    bVar.j(this, childAt, obtain);
                } else {
                    bVar.A(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((e) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.l = null;
        this.i = false;
    }

    public final void u(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i2 = eVar.i;
        if (i2 != i) {
            WeakHashMap<View, y> weakHashMap = u.f1311a;
            view.offsetLeftAndRight(i - i2);
            eVar.i = i;
        }
    }

    public final void v(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i2 = eVar.j;
        if (i2 != i) {
            WeakHashMap<View, y> weakHashMap = u.f1311a;
            view.offsetTopAndBottom(i - i2);
            eVar.j = i;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r;
    }

    public final void w() {
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        if (!getFitsSystemWindows()) {
            u.j(this, null);
            return;
        }
        if (this.t == null) {
            this.t = new a();
        }
        u.j(this, this.t);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }
}
