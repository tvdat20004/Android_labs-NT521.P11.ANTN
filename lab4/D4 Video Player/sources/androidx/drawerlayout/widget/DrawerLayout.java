package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import b.h.j.k0.b;
import b.h.j.u;
import b.h.j.y;
import b.j.b.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.ui.playback.PlaybackActivity;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] D = {R.attr.colorPrimaryDark};
    public static final int[] E = {R.attr.layout_gravity};
    public final ArrayList<View> A;
    public Rect B;
    public Matrix C;

    /* renamed from: b, reason: collision with root package name */
    public final b f204b;

    /* renamed from: c, reason: collision with root package name */
    public float f205c;

    /* renamed from: d, reason: collision with root package name */
    public int f206d;

    /* renamed from: e, reason: collision with root package name */
    public int f207e;

    /* renamed from: f, reason: collision with root package name */
    public float f208f;
    public Paint g;
    public final h h;
    public final h i;
    public final g j;
    public final g k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public c t;
    public List<c> u;
    public float v;
    public float w;
    public Drawable x;
    public Object y;
    public boolean z;

    public class a extends b.h.j.b {

        /* renamed from: d, reason: collision with root package name */
        public final Rect f209d = new Rect();

        public a() {
        }

        @Override // b.h.j.b
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return this.f1254a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            View f2 = DrawerLayout.this.f();
            if (f2 == null) {
                return true;
            }
            int h = DrawerLayout.this.h(f2);
            DrawerLayout drawerLayout = DrawerLayout.this;
            Objects.requireNonNull(drawerLayout);
            WeakHashMap<View, y> weakHashMap = u.f1311a;
            Gravity.getAbsoluteGravity(h, drawerLayout.getLayoutDirection());
            return true;
        }

        @Override // b.h.j.b
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            this.f1254a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // b.h.j.b
        public void d(View view, b.h.j.k0.b bVar) {
            int[] iArr = DrawerLayout.D;
            this.f1254a.onInitializeAccessibilityNodeInfo(view, bVar.f1286a);
            bVar.f1286a.setClassName(DrawerLayout.class.getName());
            bVar.f1286a.setFocusable(false);
            bVar.f1286a.setFocused(false);
            bVar.l(b.a.f1289e);
            bVar.l(b.a.f1290f);
        }

        @Override // b.h.j.b
        public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            int[] iArr = DrawerLayout.D;
            return this.f1254a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    public static final class b extends b.h.j.b {
        @Override // b.h.j.b
        public void d(View view, b.h.j.k0.b bVar) {
            this.f1254a.onInitializeAccessibilityNodeInfo(view, bVar.f1286a);
            if (DrawerLayout.j(view)) {
                return;
            }
            bVar.q(null);
        }
    }

    public interface c {
    }

    public static class d extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f211a;

        /* renamed from: b, reason: collision with root package name */
        public float f212b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f213c;

        /* renamed from: d, reason: collision with root package name */
        public int f214d;

        public d(int i, int i2) {
            super(i, i2);
            this.f211a = 0;
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f211a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.E);
            this.f211a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f211a = 0;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f211a = 0;
        }

        public d(d dVar) {
            super((ViewGroup.MarginLayoutParams) dVar);
            this.f211a = 0;
            this.f211a = dVar.f211a;
        }
    }

    public static class e extends b.j.a.c {
        public static final Parcelable.Creator<e> CREATOR = new b.k.a.b();

        /* renamed from: d, reason: collision with root package name */
        public int f215d;

        /* renamed from: e, reason: collision with root package name */
        public int f216e;

        /* renamed from: f, reason: collision with root package name */
        public int f217f;
        public int g;
        public int h;

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f215d = 0;
            this.f215d = parcel.readInt();
            this.f216e = parcel.readInt();
            this.f217f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
        }

        public e(Parcelable parcelable) {
            super(parcelable);
            this.f215d = 0;
        }

        @Override // b.j.a.c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1349b, i);
            parcel.writeInt(this.f215d);
            parcel.writeInt(this.f216e);
            parcel.writeInt(this.f217f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
        }
    }

    public static abstract class f implements c {
    }

    public class g extends h.a {

        /* renamed from: a, reason: collision with root package name */
        public final int f218a;

        /* renamed from: b, reason: collision with root package name */
        public h f219b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f220c = new b.k.a.c(this);

        public g(int i) {
            this.f218a = i;
        }

        @Override // b.j.b.h.a
        public int a(View view, int i, int i2) {
            int width;
            int width2;
            if (DrawerLayout.this.a(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        @Override // b.j.b.h.a
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // b.j.b.h.a
        public int c(View view) {
            if (DrawerLayout.this.l(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // b.j.b.h.a
        public void e(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i3 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i3 = 5;
            }
            View d2 = drawerLayout.d(i3);
            if (d2 == null || DrawerLayout.this.g(d2) != 0) {
                return;
            }
            this.f219b.b(d2, i2);
        }

        @Override // b.j.b.h.a
        public boolean f(int i) {
            return false;
        }

        @Override // b.j.b.h.a
        public void g(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f220c, 160L);
        }

        @Override // b.j.b.h.a
        public void h(View view, int i) {
            ((d) view.getLayoutParams()).f213c = false;
            m();
        }

        @Override // b.j.b.h.a
        public void i(int i) {
            DrawerLayout.this.r(i, this.f219b.s);
        }

        @Override // b.j.b.h.a
        public void j(View view, int i, int i2, int i3, int i4) {
            float width = (DrawerLayout.this.a(view, 3) ? i + r3 : DrawerLayout.this.getWidth() - i) / view.getWidth();
            DrawerLayout.this.p(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // b.j.b.h.a
        public void k(View view, float f2, float f3) {
            int i;
            Objects.requireNonNull(DrawerLayout.this);
            float f4 = ((d) view.getLayoutParams()).f212b;
            int width = view.getWidth();
            if (DrawerLayout.this.a(view, 3)) {
                i = (f2 > 0.0f || (f2 == 0.0f && f4 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f2 < 0.0f || (f2 == 0.0f && f4 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f219b.v(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // b.j.b.h.a
        public boolean l(View view, int i) {
            return DrawerLayout.this.l(view) && DrawerLayout.this.a(view, this.f218a) && DrawerLayout.this.g(view) == 0;
        }

        public final void m() {
            View d2 = DrawerLayout.this.d(this.f218a == 3 ? 5 : 3);
            if (d2 != null) {
                DrawerLayout.this.b(d2);
            }
        }

        public void n() {
            DrawerLayout.this.removeCallbacks(this.f220c);
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f204b = new b();
        this.f207e = -1728053248;
        this.g = new Paint();
        this.n = true;
        this.o = 3;
        this.p = 3;
        this.q = 3;
        this.r = 3;
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.f206d = (int) ((64.0f * f2) + 0.5f);
        float f3 = 400.0f * f2;
        g gVar = new g(3);
        this.j = gVar;
        g gVar2 = new g(5);
        this.k = gVar2;
        h j = h.j(this, 1.0f, gVar);
        this.h = j;
        j.p = 1;
        j.n = f3;
        gVar.f219b = j;
        h j2 = h.j(this, 1.0f, gVar2);
        this.i = j2;
        j2.p = 2;
        j2.n = f3;
        gVar2.f219b = j2;
        setFocusableInTouchMode(true);
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        setImportantForAccessibility(1);
        u.i(this, new a());
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new b.k.a.a(this));
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(D);
            try {
                this.x = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f205c = f2 * 10.0f;
        this.A = new ArrayList<>();
    }

    public static String i(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean j(View view) {
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public boolean a(View view, int i) {
        return (h(view) & i) == i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!l(childAt)) {
                this.A.add(childAt);
            } else {
                if (!l(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if ((((d) childAt.getLayoutParams()).f214d & 1) == 1) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
        }
        if (!z) {
            int size = this.A.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.A.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.A.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        int i2 = (e() != null || l(view)) ? 4 : 1;
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        view.setImportantForAccessibility(i2);
    }

    public void b(View view) {
        h hVar;
        int width;
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.n) {
            dVar.f212b = 0.0f;
            dVar.f214d = 0;
        } else {
            dVar.f214d |= 4;
            if (a(view, 3)) {
                hVar = this.h;
                width = -view.getWidth();
            } else {
                hVar = this.i;
                width = getWidth();
            }
            hVar.x(view, width, view.getTop());
        }
        invalidate();
    }

    public void c(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            d dVar = (d) childAt.getLayoutParams();
            if (l(childAt) && (!z || dVar.f213c)) {
                z2 |= a(childAt, 3) ? this.h.x(childAt, -childAt.getWidth(), childAt.getTop()) : this.i.x(childAt, getWidth(), childAt.getTop());
                dVar.f213c = false;
            }
        }
        this.j.n();
        this.k.n();
        if (z2) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f2 = Math.max(f2, ((d) getChildAt(i).getLayoutParams()).f212b);
        }
        this.f208f = f2;
        boolean i2 = this.h.i(true);
        boolean i3 = this.i.i(true);
        if (i2 || i3) {
            WeakHashMap<View, y> weakHashMap = u.f1311a;
            postInvalidateOnAnimation();
        }
    }

    public View d(int i) {
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((h(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f208f <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.B == null) {
                this.B = new Rect();
            }
            childAt.getHitRect(this.B);
            if (this.B.contains((int) x, (int) y) && !k(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.C == null) {
                            this.C = new Matrix();
                        }
                        matrix.invert(this.C);
                        obtain.transform(this.C);
                    }
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean k = k(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (k) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && l(childAt) && childAt.getHeight() >= height) {
                        if (a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i2) {
                                i2 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f2 = this.f208f;
        if (f2 > 0.0f && k) {
            this.g.setColor((((int) ((((-16777216) & r15) >>> 24) * f2)) << 24) | (this.f207e & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.g);
        }
        return drawChild;
    }

    public View e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((d) childAt.getLayoutParams()).f214d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public View f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (l(childAt)) {
                if (!l(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((d) childAt.getLayoutParams()).f212b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public int g(View view) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i = ((d) view.getLayoutParams()).f211a;
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i2 = this.o;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.q : this.r;
            if (i3 != 3) {
                return i3;
            }
        } else if (i == 5) {
            int i4 = this.p;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.r : this.q;
            if (i5 != 3) {
                return i5;
            }
        } else if (i == 8388611) {
            int i6 = this.q;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.o : this.p;
            if (i7 != 3) {
                return i7;
            }
        } else if (i == 8388613) {
            int i8 = this.r;
            if (i8 != 3) {
                return i8;
            }
            int i9 = layoutDirection == 0 ? this.p : this.o;
            if (i9 != 3) {
                return i9;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d ? new d((d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    public float getDrawerElevation() {
        return this.f205c;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.x;
    }

    public int h(View view) {
        int i = ((d) view.getLayoutParams()).f211a;
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    public boolean k(View view) {
        return ((d) view.getLayoutParams()).f211a == 0;
    }

    public boolean l(View view) {
        int i = ((d) view.getLayoutParams()).f211a;
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public void m(View view, float f2) {
        float f3 = ((d) view.getLayoutParams()).f212b;
        float width = view.getWidth();
        int i = ((int) (width * f2)) - ((int) (f3 * width));
        if (!a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        p(view, f2);
    }

    public void n(View view, boolean z) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.n) {
            dVar.f212b = 1.0f;
            dVar.f214d = 1;
            q(view, true);
        } else if (z) {
            dVar.f214d |= 2;
            if (a(view, 3)) {
                this.h.x(view, 0, view.getTop());
            } else {
                this.i.x(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            m(view, 1.0f);
            int i = dVar.f211a;
            r(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void o(int i, int i2) {
        View d2;
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.o = i;
        } else if (i2 == 5) {
            this.p = i;
        } else if (i2 == 8388611) {
            this.q = i;
        } else if (i2 == 8388613) {
            this.r = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.h : this.i).a();
        }
        if (i != 1) {
            if (i == 2 && (d2 = d(absoluteGravity)) != null) {
                n(d2, true);
                return;
            }
            return;
        }
        View d3 = d(absoluteGravity);
        if (d3 != null) {
            b(d3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.z || this.x == null) {
            return;
        }
        Object obj = this.y;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.x.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.x.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0 != 3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051 A[LOOP:1: B:28:0x0024->B:35:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004f A[SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            b.j.b.h r1 = r8.h
            boolean r1 = r1.w(r9)
            b.j.b.h r2 = r8.i
            boolean r2 = r2.w(r9)
            r1 = r1 | r2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L69
            if (r0 == r3) goto L62
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L62
            goto L67
        L1e:
            b.j.b.h r9 = r8.h
            float[] r0 = r9.f1362d
            int r0 = r0.length
            r4 = r2
        L24:
            if (r4 >= r0) goto L54
            boolean r5 = r9.n(r4)
            if (r5 != 0) goto L2d
            goto L4c
        L2d:
            float[] r5 = r9.f1364f
            r5 = r5[r4]
            float[] r6 = r9.f1362d
            r6 = r6[r4]
            float r5 = r5 - r6
            float[] r6 = r9.g
            r6 = r6[r4]
            float[] r7 = r9.f1363e
            r7 = r7[r4]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r9.f1360b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L4c
            r5 = r3
            goto L4d
        L4c:
            r5 = r2
        L4d:
            if (r5 == 0) goto L51
            r9 = r3
            goto L55
        L51:
            int r4 = r4 + 1
            goto L24
        L54:
            r9 = r2
        L55:
            if (r9 == 0) goto L67
            androidx.drawerlayout.widget.DrawerLayout$g r9 = r8.j
            r9.n()
            androidx.drawerlayout.widget.DrawerLayout$g r9 = r8.k
            r9.n()
            goto L67
        L62:
            r8.c(r3)
            r8.s = r2
        L67:
            r9 = r2
            goto L91
        L69:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.v = r0
            r8.w = r9
            float r4 = r8.f208f
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L8e
            b.j.b.h r4 = r8.h
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r4.l(r0, r9)
            if (r9 == 0) goto L8e
            boolean r9 = r8.k(r9)
            if (r9 == 0) goto L8e
            r9 = r3
            goto L8f
        L8e:
            r9 = r2
        L8f:
            r8.s = r2
        L91:
            if (r1 != 0) goto Lb6
            if (r9 != 0) goto Lb6
            int r9 = r8.getChildCount()
            r0 = r2
        L9a:
            if (r0 >= r9) goto Laf
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$d r1 = (androidx.drawerlayout.widget.DrawerLayout.d) r1
            boolean r1 = r1.f213c
            if (r1 == 0) goto Lac
            r9 = r3
            goto Lb0
        Lac:
            int r0 = r0 + 1
            goto L9a
        Laf:
            r9 = r2
        Lb0:
            if (r9 != 0) goto Lb6
            boolean r9 = r8.s
            if (r9 == 0) goto Lb7
        Lb6:
            r2 = r3
        Lb7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (f() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View f2 = f();
        if (f2 != null && g(f2) == 0) {
            c(false);
        }
        return f2 != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f2;
        int i5;
        int measuredHeight;
        int i6;
        int i7;
        boolean z2 = true;
        this.m = true;
        int i8 = i3 - i;
        int childCount = getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (k(childAt)) {
                    int i10 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    childAt.layout(i10, ((ViewGroup.MarginLayoutParams) dVar).topMargin, childAt.getMeasuredWidth() + i10, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f3 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (dVar.f212b * f3));
                        f2 = (measuredWidth + i5) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i8 - r11) / f4;
                        i5 = i8 - ((int) (dVar.f212b * f4));
                    }
                    boolean z3 = f2 != dVar.f212b ? z2 : false;
                    int i11 = dVar.f211a & 112;
                    if (i11 != 16) {
                        if (i11 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                            i6 = measuredWidth + i5;
                            i7 = measuredHeight2 + measuredHeight;
                        } else {
                            int i12 = i4 - i2;
                            measuredHeight = (i12 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin) - childAt.getMeasuredHeight();
                            i6 = measuredWidth + i5;
                            i7 = i12 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                        }
                        childAt.layout(i5, measuredHeight, i6, i7);
                    } else {
                        int i13 = i4 - i2;
                        int i14 = (i13 - measuredHeight2) / 2;
                        int i15 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        if (i14 < i15) {
                            i14 = i15;
                        } else {
                            int i16 = i14 + measuredHeight2;
                            int i17 = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                            if (i16 > i13 - i17) {
                                i14 = (i13 - i17) - measuredHeight2;
                            }
                        }
                        childAt.layout(i5, i14, measuredWidth + i5, measuredHeight2 + i14);
                    }
                    if (z3) {
                        p(childAt, f2);
                    }
                    int i18 = dVar.f212b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
            i9++;
            z2 = true;
        }
        this.m = false;
        this.n = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    @Override // android.view.View
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View d2;
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.f1349b);
        int i = eVar.f215d;
        if (i != 0 && (d2 = d(i)) != null) {
            n(d2, true);
        }
        int i2 = eVar.f216e;
        if (i2 != 3) {
            o(i2, 3);
        }
        int i3 = eVar.f217f;
        if (i3 != 3) {
            o(i3, 5);
        }
        int i4 = eVar.g;
        if (i4 != 3) {
            o(i4, 8388611);
        }
        int i5 = eVar.h;
        if (i5 != 3) {
            o(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            d dVar = (d) getChildAt(i).getLayoutParams();
            int i2 = dVar.f214d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                eVar.f215d = dVar.f211a;
                break;
            }
        }
        eVar.f216e = this.o;
        eVar.f217f = this.p;
        eVar.g = this.q;
        eVar.h = this.r;
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (g(r7) != 2) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            b.j.b.h r0 = r6.h
            r0.p(r7)
            b.j.b.h r0 = r6.i
            r0.p(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5b
            if (r0 == r2) goto L1e
            r7 = 3
            if (r0 == r7) goto L1a
            goto L69
        L1a:
            r6.c(r2)
            goto L67
        L1e:
            float r0 = r7.getX()
            float r7 = r7.getY()
            b.j.b.h r3 = r6.h
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.l(r4, r5)
            if (r3 == 0) goto L56
            boolean r3 = r6.k(r3)
            if (r3 == 0) goto L56
            float r3 = r6.v
            float r0 = r0 - r3
            float r3 = r6.w
            float r7 = r7 - r3
            b.j.b.h r3 = r6.h
            int r3 = r3.f1360b
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r7 = r7 + r0
            int r3 = r3 * r3
            float r0 = (float) r3
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L56
            android.view.View r7 = r6.e()
            if (r7 == 0) goto L56
            int r7 = r6.g(r7)
            r0 = 2
            if (r7 != r0) goto L57
        L56:
            r1 = r2
        L57:
            r6.c(r1)
            goto L69
        L5b:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.v = r0
            r6.w = r7
        L67:
            r6.s = r1
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(View view, float f2) {
        d dVar = (d) view.getLayoutParams();
        if (f2 == dVar.f212b) {
            return;
        }
        dVar.f212b = f2;
        List<c> list = this.u;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                Objects.requireNonNull((f) this.u.get(size));
            }
        }
    }

    public final void q(View view, boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((z || l(childAt)) && !(z && childAt == view)) {
                i = 4;
                WeakHashMap<View, y> weakHashMap = u.f1311a;
            } else {
                WeakHashMap<View, y> weakHashMap2 = u.f1311a;
                i = 1;
            }
            childAt.setImportantForAccessibility(i);
        }
    }

    public void r(int i, View view) {
        View rootView;
        int i2 = this.h.f1359a;
        int i3 = this.i.f1359a;
        int i4 = 2;
        if (i2 == 1 || i3 == 1) {
            i4 = 1;
        } else if (i2 != 2 && i3 != 2) {
            i4 = 0;
        }
        if (view != null && i == 0) {
            float f2 = ((d) view.getLayoutParams()).f212b;
            if (f2 == 0.0f) {
                d dVar = (d) view.getLayoutParams();
                if ((dVar.f214d & 1) == 1) {
                    dVar.f214d = 0;
                    List<c> list = this.u;
                    if (list != null) {
                        for (int size = list.size() - 1; size >= 0; size--) {
                            PlaybackActivity playbackActivity = PlaybackActivity.this;
                            int i5 = PlaybackActivity.M;
                            Objects.requireNonNull(playbackActivity);
                        }
                    }
                    q(view, false);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f2 == 1.0f) {
                d dVar2 = (d) view.getLayoutParams();
                if ((dVar2.f214d & 1) == 0) {
                    dVar2.f214d = 1;
                    List<c> list2 = this.u;
                    if (list2 != null) {
                        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                            PlaybackActivity playbackActivity2 = PlaybackActivity.this;
                            int i6 = PlaybackActivity.M;
                            Objects.requireNonNull(playbackActivity2);
                        }
                    }
                    q(view, true);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i4 != this.l) {
            this.l = i4;
            List<c> list3 = this.u;
            if (list3 != null) {
                for (int size3 = list3.size() - 1; size3 >= 0; size3--) {
                    Objects.requireNonNull((f) this.u.get(size3));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.m) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f2) {
        this.f205c = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (l(childAt)) {
                float f3 = this.f205c;
                WeakHashMap<View, y> weakHashMap = u.f1311a;
                childAt.setElevation(f3);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(c cVar) {
        List<c> list;
        c cVar2 = this.t;
        if (cVar2 != null && (list = this.u) != null) {
            list.remove(cVar2);
        }
        if (cVar != null) {
            if (this.u == null) {
                this.u = new ArrayList();
            }
            this.u.add(cVar);
        }
        this.t = cVar;
    }

    public void setDrawerLockMode(int i) {
        o(i, 3);
        o(i, 5);
    }

    public void setScrimColor(int i) {
        this.f207e = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            Context context = getContext();
            Object obj = b.h.b.b.f1117a;
            drawable = context.getDrawable(i);
        } else {
            drawable = null;
        }
        this.x = drawable;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.x = new ColorDrawable(i);
        invalidate();
    }
}
