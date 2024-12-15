package b.b.e.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public abstract class k extends Drawable.ConstantState {
    public int A;
    public int B;
    public boolean C;
    public ColorFilter D;
    public boolean E;
    public ColorStateList F;
    public PorterDuff.Mode G;
    public boolean H;
    public boolean I;

    /* renamed from: a, reason: collision with root package name */
    public final l f508a;

    /* renamed from: b, reason: collision with root package name */
    public Resources f509b;

    /* renamed from: c, reason: collision with root package name */
    public int f510c;

    /* renamed from: d, reason: collision with root package name */
    public int f511d;

    /* renamed from: e, reason: collision with root package name */
    public int f512e;

    /* renamed from: f, reason: collision with root package name */
    public SparseArray<Drawable.ConstantState> f513f;
    public Drawable[] g;
    public int h;
    public boolean i;
    public boolean j;
    public Rect k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public k(k kVar, l lVar, Resources resources) {
        this.f510c = 160;
        this.i = false;
        this.l = false;
        this.x = true;
        this.A = 0;
        this.B = 0;
        this.f508a = lVar;
        this.f509b = resources != null ? resources : kVar != null ? kVar.f509b : null;
        int i = kVar != null ? kVar.f510c : 0;
        int i2 = l.n;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        int i3 = i != 0 ? i : 160;
        this.f510c = i3;
        if (kVar == null) {
            this.g = new Drawable[10];
            this.h = 0;
            return;
        }
        this.f511d = kVar.f511d;
        this.f512e = kVar.f512e;
        this.v = true;
        this.w = true;
        this.i = kVar.i;
        this.l = kVar.l;
        this.x = kVar.x;
        this.y = kVar.y;
        this.z = kVar.z;
        this.A = kVar.A;
        this.B = kVar.B;
        this.C = kVar.C;
        this.D = kVar.D;
        this.E = kVar.E;
        this.F = kVar.F;
        this.G = kVar.G;
        this.H = kVar.H;
        this.I = kVar.I;
        if (kVar.f510c == i3) {
            if (kVar.j) {
                this.k = new Rect(kVar.k);
                this.j = true;
            }
            if (kVar.m) {
                this.n = kVar.n;
                this.o = kVar.o;
                this.p = kVar.p;
                this.q = kVar.q;
                this.m = true;
            }
        }
        if (kVar.r) {
            this.s = kVar.s;
            this.r = true;
        }
        if (kVar.t) {
            this.u = kVar.u;
            this.t = true;
        }
        Drawable[] drawableArr = kVar.g;
        this.g = new Drawable[drawableArr.length];
        this.h = kVar.h;
        SparseArray<Drawable.ConstantState> sparseArray = kVar.f513f;
        this.f513f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.h);
        int i4 = this.h;
        for (int i5 = 0; i5 < i4; i5++) {
            if (drawableArr[i5] != null) {
                Drawable.ConstantState constantState = drawableArr[i5].getConstantState();
                if (constantState != null) {
                    this.f513f.put(i5, constantState);
                } else {
                    this.g[i5] = drawableArr[i5];
                }
            }
        }
    }

    public final int a(Drawable drawable) {
        int i = this.h;
        if (i >= this.g.length) {
            int i2 = i + 10;
            m mVar = (m) this;
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(mVar.g, 0, drawableArr, 0, i);
            mVar.g = drawableArr;
            int[][] iArr = new int[i2][];
            System.arraycopy(mVar.J, 0, iArr, 0, i);
            mVar.J = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f508a);
        this.g[i] = drawable;
        this.h++;
        this.f512e = drawable.getChangingConfigurations() | this.f512e;
        this.r = false;
        this.t = false;
        this.k = null;
        this.j = false;
        this.m = false;
        this.v = false;
        return i;
    }

    public void b() {
        this.m = true;
        c();
        int i = this.h;
        Drawable[] drawableArr = this.g;
        this.o = -1;
        this.n = -1;
        this.q = 0;
        this.p = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.n) {
                this.n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.o) {
                this.o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.p) {
                this.p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.q) {
                this.q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray<Drawable.ConstantState> sparseArray = this.f513f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.f513f.keyAt(i);
                Drawable.ConstantState valueAt = this.f513f.valueAt(i);
                Drawable[] drawableArr = this.g;
                Drawable newDrawable = valueAt.newDrawable(this.f509b);
                newDrawable.setLayoutDirection(this.z);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f508a);
                drawableArr[keyAt] = mutate;
            }
            this.f513f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        int i = this.h;
        Drawable[] drawableArr = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable == null) {
                Drawable.ConstantState constantState = this.f513f.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i) {
        int indexOfKey;
        Drawable drawable = this.g[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray<Drawable.ConstantState> sparseArray = this.f513f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable newDrawable = this.f513f.valueAt(indexOfKey).newDrawable(this.f509b);
        newDrawable.setLayoutDirection(this.z);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f508a);
        this.g[i] = mutate;
        this.f513f.removeAt(indexOfKey);
        if (this.f513f.size() == 0) {
            this.f513f = null;
        }
        return mutate;
    }

    public abstract void e();

    public final void f(Resources resources) {
        if (resources != null) {
            this.f509b = resources;
            int i = l.n;
            int i2 = resources.getDisplayMetrics().densityDpi;
            if (i2 == 0) {
                i2 = 160;
            }
            int i3 = this.f510c;
            this.f510c = i2;
            if (i3 != i2) {
                this.m = false;
                this.j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f511d | this.f512e;
    }
}
