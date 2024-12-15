package b.j.b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import b.h.j.u;
import b.h.j.y;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class h {
    public static final Interpolator w = new f();

    /* renamed from: a, reason: collision with root package name */
    public int f1359a;

    /* renamed from: b, reason: collision with root package name */
    public int f1360b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f1362d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f1363e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f1364f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public float m;
    public float n;
    public int o;
    public int p;
    public OverScroller q;
    public final a r;
    public View s;
    public boolean t;
    public final ViewGroup u;

    /* renamed from: c, reason: collision with root package name */
    public int f1361c = -1;
    public final Runnable v = new g(this);

    public static abstract class a {
        public abstract int a(View view, int i, int i2);

        public abstract int b(View view, int i, int i2);

        public int c(View view) {
            return 0;
        }

        public int d(View view) {
            return 0;
        }

        public void e(int i, int i2) {
        }

        public boolean f(int i) {
            return false;
        }

        public void g(int i, int i2) {
        }

        public void h(View view, int i) {
        }

        public abstract void i(int i);

        public abstract void j(View view, int i, int i2, int i3, int i4);

        public abstract void k(View view, float f2, float f3);

        public abstract boolean l(View view, int i);
    }

    public h(Context context, ViewGroup viewGroup, a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.u = viewGroup;
        this.r = aVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1360b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = new OverScroller(context, w);
    }

    public static h j(ViewGroup viewGroup, float f2, a aVar) {
        h hVar = new h(viewGroup.getContext(), viewGroup, aVar);
        hVar.f1360b = (int) ((1.0f / f2) * hVar.f1360b);
        return hVar;
    }

    public void a() {
        this.f1361c = -1;
        float[] fArr = this.f1362d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1363e, 0.0f);
            Arrays.fill(this.f1364f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public void b(View view, int i) {
        if (view.getParent() != this.u) {
            StringBuilder j = c.a.a.a.a.j("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            j.append(this.u);
            j.append(")");
            throw new IllegalArgumentException(j.toString());
        }
        this.s = view;
        this.f1361c = i;
        this.r.h(view, i);
        u(1);
    }

    public final boolean c(float f2, float f3, int i, int i2) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.h[i] & i2) != i2 || (this.p & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f1360b;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.r.f(i2)) {
            return (this.i[i] & i2) == 0 && abs > ((float) this.f1360b);
        }
        int[] iArr = this.j;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    public final boolean d(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.r.c(view) > 0;
        boolean z2 = this.r.d(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f1360b) : z2 && Math.abs(f3) > ((float) this.f1360b);
        }
        float f4 = (f3 * f3) + (f2 * f2);
        int i = this.f1360b;
        return f4 > ((float) (i * i));
    }

    public final float e(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    public final int f(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    public final void g(int i) {
        if (this.f1362d == null || !n(i)) {
            return;
        }
        this.f1362d[i] = 0.0f;
        this.f1363e[i] = 0.0f;
        this.f1364f[i] = 0.0f;
        this.g[i] = 0.0f;
        this.h[i] = 0;
        this.i[i] = 0;
        this.j[i] = 0;
        this.k = (~(1 << i)) & this.k;
    }

    public final int h(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.u.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public boolean i(boolean z) {
        if (this.f1359a == 2) {
            boolean computeScrollOffset = this.q.computeScrollOffset();
            int currX = this.q.getCurrX();
            int currY = this.q.getCurrY();
            int left = currX - this.s.getLeft();
            int top = currY - this.s.getTop();
            if (left != 0) {
                View view = this.s;
                WeakHashMap<View, y> weakHashMap = u.f1311a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.s;
                WeakHashMap<View, y> weakHashMap2 = u.f1311a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.r.j(this.s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.q.getFinalX() && currY == this.q.getFinalY()) {
                this.q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.u.post(this.v);
                } else {
                    u(0);
                }
            }
        }
        return this.f1359a == 2;
    }

    public final void k(float f2, float f3) {
        this.t = true;
        this.r.k(this.s, f2, f3);
        this.t = false;
        if (this.f1359a == 1) {
            u(0);
        }
    }

    public View l(int i, int i2) {
        for (int childCount = this.u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.u;
            Objects.requireNonNull(this.r);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean m(int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.s.getLeft();
        int top = this.s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.q.abortAnimation();
            u(0);
            return false;
        }
        View view = this.s;
        int f6 = f(i3, (int) this.n, (int) this.m);
        int f7 = f(i4, (int) this.n, (int) this.m);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(f6);
        int abs4 = Math.abs(f7);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (f6 != 0) {
            f2 = abs3;
            f3 = i7;
        } else {
            f2 = abs;
            f3 = i8;
        }
        float f8 = f2 / f3;
        if (f7 != 0) {
            f4 = abs4;
            f5 = i7;
        } else {
            f4 = abs2;
            f5 = i8;
        }
        int h = h(i5, f6, this.r.c(view));
        this.q.startScroll(left, top, i5, i6, (int) ((h(i6, f7, this.r.d(view)) * (f4 / f5)) + (h * f8)));
        u(2);
        return true;
    }

    public boolean n(int i) {
        return ((1 << i) & this.k) != 0;
    }

    public final boolean o(int i) {
        if (n(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public void p(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View l = l((int) x, (int) y);
            s(x, y, pointerId);
            y(l, pointerId);
            int i3 = this.h[pointerId];
            int i4 = this.p;
            if ((i3 & i4) != 0) {
                this.r.g(i3 & i4, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f1359a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (o(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f2 = x2 - this.f1362d[pointerId2];
                            float f3 = y2 - this.f1363e[pointerId2];
                            r(f2, f3, pointerId2);
                            if (this.f1359a != 1) {
                                View l2 = l((int) x2, (int) y2);
                                if (d(l2, f2, f3) && y(l2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                } else {
                    if (!o(this.f1361c)) {
                        return;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.f1361c);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f1364f;
                    int i5 = this.f1361c;
                    int i6 = (int) (x3 - fArr[i5]);
                    int i7 = (int) (y3 - this.g[i5]);
                    int left = this.s.getLeft() + i6;
                    int top = this.s.getTop() + i7;
                    int left2 = this.s.getLeft();
                    int top2 = this.s.getTop();
                    if (i6 != 0) {
                        left = this.r.a(this.s, left, i6);
                        WeakHashMap<View, y> weakHashMap = u.f1311a;
                        this.s.offsetLeftAndRight(left - left2);
                    }
                    int i8 = left;
                    if (i7 != 0) {
                        top = this.r.b(this.s, top, i7);
                        WeakHashMap<View, y> weakHashMap2 = u.f1311a;
                        this.s.offsetTopAndBottom(top - top2);
                    }
                    int i9 = top;
                    if (i6 != 0 || i7 != 0) {
                        this.r.j(this.s, i8, i9, i8 - left2, i9 - top2);
                    }
                }
                t(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    if (this.f1359a == 1 && pointerId3 == this.f1361c) {
                        int pointerCount2 = motionEvent.getPointerCount();
                        while (true) {
                            if (i2 >= pointerCount2) {
                                i = -1;
                                break;
                            }
                            int pointerId4 = motionEvent.getPointerId(i2);
                            if (pointerId4 != this.f1361c) {
                                View l3 = l((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                View view = this.s;
                                if (l3 == view && y(view, pointerId4)) {
                                    i = this.f1361c;
                                    break;
                                }
                            }
                            i2++;
                        }
                        if (i == -1) {
                            q();
                        }
                    }
                    g(pointerId3);
                    return;
                }
                int pointerId5 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                s(x4, y4, pointerId5);
                if (this.f1359a == 0) {
                    y(l((int) x4, (int) y4), pointerId5);
                    int i10 = this.h[pointerId5];
                    int i11 = this.p;
                    if ((i10 & i11) != 0) {
                        this.r.g(i10 & i11, pointerId5);
                        return;
                    }
                    return;
                }
                int i12 = (int) x4;
                int i13 = (int) y4;
                View view2 = this.s;
                if (view2 != null && i12 >= view2.getLeft() && i12 < view2.getRight() && i13 >= view2.getTop() && i13 < view2.getBottom()) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    y(this.s, pointerId5);
                    return;
                }
                return;
            }
            if (this.f1359a == 1) {
                k(0.0f, 0.0f);
            }
        } else if (this.f1359a == 1) {
            q();
        }
        a();
    }

    public final void q() {
        this.l.computeCurrentVelocity(1000, this.m);
        k(e(this.l.getXVelocity(this.f1361c), this.n, this.m), e(this.l.getYVelocity(this.f1361c), this.n, this.m));
    }

    public final void r(float f2, float f3, int i) {
        int i2 = c(f2, f3, i, 1) ? 1 : 0;
        if (c(f3, f2, i, 4)) {
            i2 |= 4;
        }
        if (c(f2, f3, i, 2)) {
            i2 |= 2;
        }
        if (c(f3, f2, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | i2;
            this.r.e(i2, i);
        }
    }

    public final void s(float f2, float f3, int i) {
        float[] fArr = this.f1362d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1363e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1364f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1362d = fArr2;
            this.f1363e = fArr3;
            this.f1364f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f1362d;
        this.f1364f[i] = f2;
        fArr9[i] = f2;
        float[] fArr10 = this.f1363e;
        this.g[i] = f3;
        fArr10[i] = f3;
        int[] iArr7 = this.h;
        int i3 = (int) f2;
        int i4 = (int) f3;
        int i5 = i3 < this.u.getLeft() + this.o ? 1 : 0;
        if (i4 < this.u.getTop() + this.o) {
            i5 |= 4;
        }
        if (i3 > this.u.getRight() - this.o) {
            i5 |= 2;
        }
        if (i4 > this.u.getBottom() - this.o) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.k |= 1 << i;
    }

    public final void t(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (o(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f1364f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    public void u(int i) {
        this.u.removeCallbacks(this.v);
        if (this.f1359a != i) {
            this.f1359a = i;
            this.r.i(i);
            if (this.f1359a == 0) {
                this.s = null;
            }
        }
    }

    public boolean v(int i, int i2) {
        if (this.t) {
            return m(i, i2, (int) this.l.getXVelocity(this.f1361c), (int) this.l.getYVelocity(this.f1361c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00de, code lost:
    
        if (r12 != r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean w(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.b.h.w(android.view.MotionEvent):boolean");
    }

    public boolean x(View view, int i, int i2) {
        this.s = view;
        this.f1361c = -1;
        boolean m = m(i, i2, 0, 0);
        if (!m && this.f1359a == 0 && this.s != null) {
            this.s = null;
        }
        return m;
    }

    public boolean y(View view, int i) {
        if (view == this.s && this.f1361c == i) {
            return true;
        }
        if (view == null || !this.r.l(view, i)) {
            return false;
        }
        this.f1361c = i;
        b(view, i);
        return true;
    }
}
