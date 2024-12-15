package b.h.j;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f1271a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f1272b;

    /* renamed from: c, reason: collision with root package name */
    public final View f1273c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1274d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f1275e;

    public g(View view) {
        this.f1273c = view;
    }

    public boolean a(float f2, float f3, boolean z) {
        ViewParent g;
        if (!this.f1274d || (g = g(0)) == null) {
            return false;
        }
        try {
            return g.onNestedFling(this.f1273c, f2, f3, z);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + g + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public boolean b(float f2, float f3) {
        ViewParent g;
        if (!this.f1274d || (g = g(0)) == null) {
            return false;
        }
        try {
            return g.onNestedPreFling(this.f1273c, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + g + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public boolean c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent g;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f1274d || (g = g(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f1273c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f1275e == null) {
                this.f1275e = new int[2];
            }
            iArr3 = this.f1275e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view = this.f1273c;
        if (g instanceof h) {
            ((h) g).c(view, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                g.onNestedPreScroll(view, i, i2, iArr3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + g + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            this.f1273c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public void d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        f(i, i2, i3, i4, null, i5, iArr2);
    }

    public boolean e(int i, int i2, int i3, int i4, int[] iArr) {
        return f(i, i2, i3, i4, iArr, 0, null);
    }

    public final boolean f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent g;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f1274d || (g = g(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f1273c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f1275e == null) {
                this.f1275e = new int[2];
            }
            int[] iArr4 = this.f1275e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f1273c;
        if (g instanceof i) {
            ((i) g).d(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (g instanceof h) {
                ((h) g).e(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    g.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + g + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (iArr != null) {
            this.f1273c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final ViewParent g(int i) {
        if (i == 0) {
            return this.f1271a;
        }
        if (i != 1) {
            return null;
        }
        return this.f1272b;
    }

    public boolean h(int i) {
        return g(i) != null;
    }

    public boolean i(int i, int i2) {
        boolean onStartNestedScroll;
        if (g(i2) != null) {
            return true;
        }
        if (this.f1274d) {
            View view = this.f1273c;
            for (ViewParent parent = this.f1273c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f1273c;
                boolean z = parent instanceof h;
                if (z) {
                    onStartNestedScroll = ((h) parent).f(view, view2, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            onStartNestedScroll = parent.onStartNestedScroll(view, view2, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    onStartNestedScroll = false;
                }
                if (onStartNestedScroll) {
                    if (i2 == 0) {
                        this.f1271a = parent;
                    } else if (i2 == 1) {
                        this.f1272b = parent;
                    }
                    View view3 = this.f1273c;
                    if (z) {
                        ((h) parent).a(view, view3, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = parent;
                }
            }
        }
        return false;
    }

    public void j(int i) {
        ViewParent g = g(i);
        if (g != null) {
            View view = this.f1273c;
            if (g instanceof h) {
                ((h) g).b(view, i);
            } else if (i == 0) {
                try {
                    g.onStopNestedScroll(view);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + g + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i == 0) {
                this.f1271a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f1272b = null;
            }
        }
    }
}
