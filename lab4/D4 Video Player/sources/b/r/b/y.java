package b.r.b;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class y extends RecyclerView.w {
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    public y(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.view.View r11, androidx.recyclerview.widget.RecyclerView.x r12, b.r.b.m0 r13) {
        /*
            r10 = this;
            android.graphics.PointF r12 = r10.k
            r0 = 1
            r1 = -1
            r2 = 0
            r3 = 0
            if (r12 == 0) goto L15
            float r12 = r12.x
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto Lf
            goto L15
        Lf:
            if (r12 <= 0) goto L13
            r9 = r0
            goto L16
        L13:
            r9 = r1
            goto L16
        L15:
            r9 = r3
        L16:
            androidx.recyclerview.widget.RecyclerView$m r12 = r10.f350c
            if (r12 == 0) goto L47
            boolean r4 = r12.e()
            if (r4 != 0) goto L21
            goto L47
        L21:
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r4 = (androidx.recyclerview.widget.RecyclerView.n) r4
            int r5 = r12.D(r11)
            int r6 = r4.leftMargin
            int r5 = r5 - r6
            int r6 = r12.G(r11)
            int r4 = r4.rightMargin
            int r6 = r6 + r4
            int r7 = r12.N()
            int r4 = r12.p
            int r12 = r12.O()
            int r8 = r4 - r12
            r4 = r10
            int r12 = r4.e(r5, r6, r7, r8, r9)
            goto L48
        L47:
            r12 = r3
        L48:
            android.graphics.PointF r4 = r10.k
            if (r4 == 0) goto L59
            float r4 = r4.y
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L53
            goto L59
        L53:
            if (r2 <= 0) goto L57
            r9 = r0
            goto L5a
        L57:
            r9 = r1
            goto L5a
        L59:
            r9 = r3
        L5a:
            androidx.recyclerview.widget.RecyclerView$m r0 = r10.f350c
            if (r0 == 0) goto L8c
            boolean r1 = r0.f()
            if (r1 != 0) goto L65
            goto L8c
        L65:
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r1 = (androidx.recyclerview.widget.RecyclerView.n) r1
            int r2 = r0.H(r11)
            int r3 = r1.topMargin
            int r5 = r2 - r3
            int r11 = r0.B(r11)
            int r1 = r1.bottomMargin
            int r6 = r11 + r1
            int r7 = r0.P()
            int r11 = r0.q
            int r0 = r0.M()
            int r8 = r11 - r0
            r4 = r10
            int r3 = r4.e(r5, r6, r7, r8, r9)
        L8c:
            int r11 = r12 * r12
            int r0 = r3 * r3
            int r0 = r0 + r11
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            int r11 = (int) r0
            int r11 = r10.g(r11)
            double r0 = (double) r11
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r0 = r0 / r4
            double r0 = java.lang.Math.ceil(r0)
            int r11 = (int) r0
            if (r11 <= 0) goto Lb0
            int r12 = -r12
            int r0 = -r3
            android.view.animation.DecelerateInterpolator r1 = r10.j
            r13.b(r12, r0, r11, r1)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.r.b.y.c(android.view.View, androidx.recyclerview.widget.RecyclerView$x, b.r.b.m0):void");
    }

    public int e(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int g(int i) {
        float abs = Math.abs(i);
        if (!this.m) {
            this.n = f(this.l);
            this.m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }
}
