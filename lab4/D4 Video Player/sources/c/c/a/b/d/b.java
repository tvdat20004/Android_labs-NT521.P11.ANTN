package c.c.a.b.d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class b<V extends View> extends d<V> {

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f3822c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3823d;

    /* renamed from: e, reason: collision with root package name */
    public int f3824e;

    /* renamed from: f, reason: collision with root package name */
    public int f3825f;
    public int g;
    public VelocityTracker h;

    public b() {
        this.f3824e = -1;
        this.g = -1;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3824e = -1;
        this.g = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A(androidx.coordinatorlayout.widget.CoordinatorLayout r6, V r7, android.view.MotionEvent r8) {
        /*
            r5 = this;
            int r6 = r8.getActionMasked()
            r0 = -1
            r1 = 0
            r2 = 1
            r3 = 0
            if (r6 == r2) goto L41
            r4 = 2
            if (r6 == r4) goto L2e
            r7 = 3
            if (r6 == r7) goto L45
            r7 = 6
            if (r6 == r7) goto L14
            goto L52
        L14:
            int r6 = r8.getActionIndex()
            if (r6 != 0) goto L1c
            r6 = r2
            goto L1d
        L1c:
            r6 = r3
        L1d:
            int r7 = r8.getPointerId(r6)
            r5.f3824e = r7
            float r6 = r8.getY(r6)
            r7 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r7
            int r6 = (int) r6
            r5.f3825f = r6
            goto L52
        L2e:
            int r6 = r5.f3824e
            int r6 = r8.findPointerIndex(r6)
            if (r6 != r0) goto L37
            return r3
        L37:
            float r6 = r8.getY(r6)
            int r6 = (int) r6
            r5.f3825f = r6
            com.google.android.material.appbar.AppBarLayout r7 = (com.google.android.material.appbar.AppBarLayout) r7
            throw r1
        L41:
            android.view.VelocityTracker r6 = r5.h
            if (r6 != 0) goto L5f
        L45:
            r5.f3823d = r3
            r5.f3824e = r0
            android.view.VelocityTracker r6 = r5.h
            if (r6 == 0) goto L52
            r6.recycle()
            r5.h = r1
        L52:
            android.view.VelocityTracker r6 = r5.h
            if (r6 == 0) goto L59
            r6.addMovement(r8)
        L59:
            boolean r6 = r5.f3823d
            if (r6 != 0) goto L5e
            r2 = r3
        L5e:
            return r2
        L5f:
            r6.addMovement(r8)
            android.view.VelocityTracker r6 = r5.h
            r8 = 1000(0x3e8, float:1.401E-42)
            r6.computeCurrentVelocity(r8)
            android.view.VelocityTracker r6 = r5.h
            int r8 = r5.f3824e
            r6.getYVelocity(r8)
            com.google.android.material.appbar.AppBarLayout r7 = (com.google.android.material.appbar.AppBarLayout) r7
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.b.d.b.A(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        int findPointerIndex;
        if (this.g < 0) {
            this.g = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f3823d) {
            int i = this.f3824e;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f3825f) > this.g) {
                this.f3825f = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f3824e = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            WeakReference<View> weakReference = ((AppBarLayout.BaseBehavior) this).m;
            boolean z = (weakReference == null || ((view = weakReference.get()) != null && view.isShown() && !view.canScrollVertically(-1))) && coordinatorLayout.o(v, x, y2);
            this.f3823d = z;
            if (z) {
                this.f3825f = y2;
                this.f3824e = motionEvent.getPointerId(0);
                if (this.h == null) {
                    this.h = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f3822c;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f3822c.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.h;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}
