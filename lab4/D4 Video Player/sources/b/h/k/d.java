package b.h.k;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;
import b.h.j.u;
import b.h.j.y;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class d implements View.OnTouchListener {
    public static final int s = ViewConfiguration.getTapTimeout();

    /* renamed from: b, reason: collision with root package name */
    public final a f1329b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f1330c;

    /* renamed from: d, reason: collision with root package name */
    public final View f1331d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f1332e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f1333f;
    public float[] g;
    public int h;
    public int i;
    public float[] j;
    public float[] k;
    public float[] l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public final ListView r;

    public d(ListView listView) {
        a aVar = new a();
        this.f1329b = aVar;
        this.f1330c = new AccelerateInterpolator();
        this.f1333f = new float[]{0.0f, 0.0f};
        this.g = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.j = new float[]{0.0f, 0.0f};
        this.k = new float[]{0.0f, 0.0f};
        this.l = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1331d = listView;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.l;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float[] fArr2 = this.k;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        this.h = 1;
        float[] fArr3 = this.g;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f1333f;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.j;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.i = s;
        aVar.f1321a = 500;
        aVar.f1322b = 500;
        this.r = listView;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    public final float a(int i, float f2, float f3, float f4) {
        float d2 = d(this.f1333f[i], f3, this.g[i], f2);
        if (d2 == 0.0f) {
            return 0.0f;
        }
        float f5 = this.j[i];
        float f6 = this.k[i];
        float f7 = this.l[i];
        float f8 = f5 * f4;
        return d2 > 0.0f ? b(d2 * f8, f6, f7) : -b((-d2) * f8, f6, f7);
    }

    public final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i = this.h;
        if (i == 0 || i == 1) {
            if (f2 < f3) {
                return f2 >= 0.0f ? 1.0f - (f2 / f3) : (this.p && i == 1) ? 1.0f : 0.0f;
            }
            return 0.0f;
        }
        if (i == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    public final float d(float f2, float f3, float f4, float f5) {
        float interpolation;
        float b2 = b(f2 * f3, 0.0f, f4);
        float c2 = c(f3 - f5, b2) - c(f5, b2);
        if (c2 < 0.0f) {
            interpolation = -this.f1330c.getInterpolation(-c2);
        } else {
            if (c2 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f1330c.getInterpolation(c2);
        }
        return b(interpolation, -1.0f, 1.0f);
    }

    public final void e() {
        int i = 0;
        if (this.n) {
            this.p = false;
            return;
        }
        a aVar = this.f1329b;
        Objects.requireNonNull(aVar);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - aVar.f1325e);
        int i3 = aVar.f1322b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.k = i;
        aVar.j = aVar.a(currentAnimationTimeMillis);
        aVar.i = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f() {
        /*
            r8 = this;
            b.h.k.a r0 = r8.f1329b
            float r1 = r0.f1324d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f1323c
            java.lang.Math.abs(r0)
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L4e
            android.widget.ListView r3 = r8.r
            int r4 = r3.getCount()
            if (r4 != 0) goto L1c
            goto L4b
        L1c:
            int r5 = r3.getChildCount()
            int r6 = r3.getFirstVisiblePosition()
            int r7 = r6 + r5
            if (r1 <= 0) goto L3a
            if (r7 < r4) goto L49
            int r5 = r5 - r0
            android.view.View r1 = r3.getChildAt(r5)
            int r1 = r1.getBottom()
            int r3 = r3.getHeight()
            if (r1 > r3) goto L49
            goto L4b
        L3a:
            if (r1 >= 0) goto L4b
            if (r6 > 0) goto L49
            android.view.View r1 = r3.getChildAt(r2)
            int r1 = r1.getTop()
            if (r1 < 0) goto L49
            goto L4b
        L49:
            r1 = r0
            goto L4c
        L4b:
            r1 = r2
        L4c:
            if (r1 != 0) goto L4f
        L4e:
            r0 = r2
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.k.d.f():boolean");
    }

    public final void g() {
        int i;
        if (this.f1332e == null) {
            this.f1332e = new b(this);
        }
        this.p = true;
        this.n = true;
        if (this.m || (i = this.i) <= 0) {
            this.f1332e.run();
        } else {
            View view = this.f1331d;
            Runnable runnable = this.f1332e;
            long j = i;
            WeakHashMap<View, y> weakHashMap = u.f1311a;
            view.postOnAnimationDelayed(runnable, j);
        }
        this.m = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.q
            r1 = 0
            if (r0 != 0) goto L6
            goto L59
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L59
        L16:
            r5.e()
            goto L59
        L1a:
            r5.o = r2
            r5.m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1331d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1331d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            b.h.k.a r7 = r5.f1329b
            r7.f1323c = r0
            r7.f1324d = r6
            boolean r6 = r5.p
            if (r6 != 0) goto L59
            boolean r6 = r5.f()
            if (r6 == 0) goto L59
            r5.g()
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.k.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
