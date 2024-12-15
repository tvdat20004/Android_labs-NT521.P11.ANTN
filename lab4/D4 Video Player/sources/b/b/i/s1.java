package b.b.i;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class s1 implements b.b.h.m.b0 {
    public static Method B;
    public static Method C;
    public static Method D;
    public PopupWindow A;

    /* renamed from: b, reason: collision with root package name */
    public Context f788b;

    /* renamed from: c, reason: collision with root package name */
    public ListAdapter f789c;

    /* renamed from: d, reason: collision with root package name */
    public g1 f790d;
    public int g;
    public int h;
    public boolean j;
    public boolean k;
    public boolean l;
    public DataSetObserver p;
    public View q;
    public AdapterView.OnItemClickListener r;
    public final Handler w;
    public Rect y;
    public boolean z;

    /* renamed from: e, reason: collision with root package name */
    public int f791e = -2;

    /* renamed from: f, reason: collision with root package name */
    public int f792f = -2;
    public int i = 1002;
    public int m = 0;
    public int n = Integer.MAX_VALUE;
    public int o = 0;
    public final r1 s = new r1(this);
    public final q1 t = new q1(this);
    public final p1 u = new p1(this);
    public final n1 v = new n1(this);
    public final Rect x = new Rect();

    static {
        Class cls = Boolean.TYPE;
        int i = Build.VERSION.SDK_INT;
        if (i <= 28) {
            try {
                B = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                D = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (i <= 23) {
            try {
                C = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public s1(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f788b = context;
        this.w = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.b.o, i, i2);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.j = true;
        }
        obtainStyledAttributes.recycle();
        a0 a0Var = new a0(context, attributeSet, i, i2);
        this.A = a0Var;
        a0Var.setInputMethodMode(1);
    }

    public void a(int i) {
        this.g = i;
    }

    @Override // b.b.h.m.b0
    public boolean b() {
        return this.A.isShowing();
    }

    public int c() {
        return this.g;
    }

    @Override // b.b.h.m.b0
    public void dismiss() {
        this.A.dismiss();
        this.A.setContentView(null);
        this.f790d = null;
        this.w.removeCallbacks(this.s);
    }

    @Override // b.b.h.m.b0
    public void f() {
        int i;
        int maxAvailableHeight;
        int i2;
        int paddingBottom;
        g1 g1Var;
        int i3 = Build.VERSION.SDK_INT;
        if (this.f790d == null) {
            g1 q = q(this.f788b, !this.z);
            this.f790d = q;
            q.setAdapter(this.f789c);
            this.f790d.setOnItemClickListener(this.r);
            this.f790d.setFocusable(true);
            this.f790d.setFocusableInTouchMode(true);
            this.f790d.setOnItemSelectedListener(new m1(this));
            this.f790d.setOnScrollListener(this.u);
            this.A.setContentView(this.f790d);
        }
        Drawable background = this.A.getBackground();
        if (background != null) {
            background.getPadding(this.x);
            Rect rect = this.x;
            int i4 = rect.top;
            i = rect.bottom + i4;
            if (!this.j) {
                this.h = -i4;
            }
        } else {
            this.x.setEmpty();
            i = 0;
        }
        boolean z = this.A.getInputMethodMode() == 2;
        View view = this.q;
        int i5 = this.h;
        if (i3 <= 23) {
            Method method = C;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(this.A, view, Integer.valueOf(i5), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            maxAvailableHeight = this.A.getMaxAvailableHeight(view, i5);
        } else {
            maxAvailableHeight = this.A.getMaxAvailableHeight(view, i5, z);
        }
        if (this.f791e == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i6 = this.f792f;
            if (i6 != -2) {
                i2 = 1073741824;
                if (i6 == -1) {
                    int i7 = this.f788b.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.x;
                    i6 = i7 - (rect2.left + rect2.right);
                }
            } else {
                int i8 = this.f788b.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.x;
                i6 = i8 - (rect3.left + rect3.right);
                i2 = Integer.MIN_VALUE;
            }
            int a2 = this.f790d.a(View.MeasureSpec.makeMeasureSpec(i6, i2), maxAvailableHeight - 0, -1);
            paddingBottom = a2 + (a2 > 0 ? this.f790d.getPaddingBottom() + this.f790d.getPaddingTop() + i + 0 : 0);
        }
        boolean z2 = this.A.getInputMethodMode() == 2;
        this.A.setWindowLayoutType(this.i);
        if (this.A.isShowing()) {
            View view2 = this.q;
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            if (view2.isAttachedToWindow()) {
                int i9 = this.f792f;
                if (i9 == -1) {
                    i9 = -1;
                } else if (i9 == -2) {
                    i9 = this.q.getWidth();
                }
                int i10 = this.f791e;
                if (i10 == -1) {
                    if (!z2) {
                        paddingBottom = -1;
                    }
                    if (z2) {
                        this.A.setWidth(this.f792f == -1 ? -1 : 0);
                        this.A.setHeight(0);
                    } else {
                        this.A.setWidth(this.f792f == -1 ? -1 : 0);
                        this.A.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    paddingBottom = i10;
                }
                this.A.setOutsideTouchable(true);
                this.A.update(this.q, this.g, this.h, i9 < 0 ? -1 : i9, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i11 = this.f792f;
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = this.q.getWidth();
        }
        int i12 = this.f791e;
        if (i12 == -1) {
            paddingBottom = -1;
        } else if (i12 != -2) {
            paddingBottom = i12;
        }
        this.A.setWidth(i11);
        this.A.setHeight(paddingBottom);
        if (i3 <= 28) {
            Method method2 = B;
            if (method2 != null) {
                try {
                    method2.invoke(this.A, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.A.setIsClippedToScreen(true);
        }
        this.A.setOutsideTouchable(true);
        this.A.setTouchInterceptor(this.t);
        if (this.l) {
            this.A.setOverlapAnchor(this.k);
        }
        if (i3 <= 28) {
            Method method3 = D;
            if (method3 != null) {
                try {
                    method3.invoke(this.A, this.y);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.A.setEpicenterBounds(this.y);
        }
        this.A.showAsDropDown(this.q, this.g, this.h, this.m);
        this.f790d.setSelection(-1);
        if ((!this.z || this.f790d.isInTouchMode()) && (g1Var = this.f790d) != null) {
            g1Var.setListSelectionHidden(true);
            g1Var.requestLayout();
        }
        if (this.z) {
            return;
        }
        this.w.post(this.v);
    }

    public int g() {
        if (this.j) {
            return this.h;
        }
        return 0;
    }

    public Drawable i() {
        return this.A.getBackground();
    }

    @Override // b.b.h.m.b0
    public ListView k() {
        return this.f790d;
    }

    public void m(Drawable drawable) {
        this.A.setBackgroundDrawable(drawable);
    }

    public void n(int i) {
        this.h = i;
        this.j = true;
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.p;
        if (dataSetObserver == null) {
            this.p = new o1(this);
        } else {
            ListAdapter listAdapter2 = this.f789c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f789c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.p);
        }
        g1 g1Var = this.f790d;
        if (g1Var != null) {
            g1Var.setAdapter(this.f789c);
        }
    }

    public g1 q(Context context, boolean z) {
        return new g1(context, z);
    }

    public void r(int i) {
        Drawable background = this.A.getBackground();
        if (background == null) {
            this.f792f = i;
            return;
        }
        background.getPadding(this.x);
        Rect rect = this.x;
        this.f792f = rect.left + rect.right + i;
    }

    public void s(boolean z) {
        this.z = z;
        this.A.setFocusable(z);
    }
}
