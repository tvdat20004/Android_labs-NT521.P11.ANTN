package b.b.e.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class l extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int n = 0;

    /* renamed from: b, reason: collision with root package name */
    public k f514b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f515c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f516d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f517e;
    public boolean g;
    public boolean i;
    public Runnable j;
    public long k;
    public long l;
    public j m;

    /* renamed from: f, reason: collision with root package name */
    public int f518f = 255;
    public int h = -1;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f516d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L34
            long r9 = r13.k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L36
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f518f
            r3.setAlpha(r9)
            goto L34
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            b.b.e.a.k r10 = r13.f514b
            int r10 = r10.A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f518f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L37
        L34:
            r13.k = r7
        L36:
            r3 = r6
        L37:
            android.graphics.drawable.Drawable r9 = r13.f517e
            if (r9 == 0) goto L5d
            long r10 = r13.l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L5f
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4c
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f517e = r0
            goto L5d
        L4c:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            b.b.e.a.k r4 = r13.f514b
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f518f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L60
        L5d:
            r13.l = r7
        L5f:
            r0 = r3
        L60:
            if (r14 == 0) goto L6c
            if (r0 == 0) goto L6c
            java.lang.Runnable r14 = r13.j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.e.a.l.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        k kVar = this.f514b;
        Objects.requireNonNull(kVar);
        if (theme != null) {
            kVar.c();
            int i = kVar.h;
            Drawable[] drawableArr = kVar.g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    kVar.f512e |= drawableArr[i2].getChangingConfigurations();
                }
            }
            kVar.f(theme.getResources());
        }
    }

    public final void b(Drawable drawable) {
        if (this.m == null) {
            this.m = new j();
        }
        j jVar = this.m;
        jVar.f507b = drawable.getCallback();
        drawable.setCallback(jVar);
        try {
            if (this.f514b.A <= 0 && this.g) {
                drawable.setAlpha(this.f518f);
            }
            k kVar = this.f514b;
            if (kVar.E) {
                drawable.setColorFilter(kVar.D);
            } else {
                if (kVar.H) {
                    drawable.setTintList(kVar.F);
                }
                k kVar2 = this.f514b;
                if (kVar2.I) {
                    drawable.setTintMode(kVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f514b.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f514b.C);
            Rect rect = this.f515c;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            j jVar2 = this.m;
            Drawable.Callback callback = jVar2.f507b;
            jVar2.f507b = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(int r10) {
        /*
            r9 = this;
            int r0 = r9.h
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            b.b.e.a.k r0 = r9.f514b
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f517e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f516d
            if (r0 == 0) goto L29
            r9.f517e = r0
            b.b.e.a.k r0 = r9.f514b
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.l = r0
            goto L35
        L29:
            r9.f517e = r4
            r9.l = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f516d
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            b.b.e.a.k r0 = r9.f514b
            int r1 = r0.h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f516d = r0
            r9.h = r10
            if (r0 == 0) goto L5a
            b.b.e.a.k r10 = r9.f514b
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.k = r2
        L51:
            r9.b(r0)
            goto L5a
        L55:
            r9.f516d = r4
            r10 = -1
            r9.h = r10
        L5a:
            long r0 = r9.k
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.l
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.j
            if (r10 != 0) goto L73
            b.b.e.a.i r10 = new b.b.e.a.i
            r10.<init>(r9)
            r9.j = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.e.a.l.c(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f514b.canApplyTheme();
    }

    public abstract void d(k kVar);

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f516d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f517e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f518f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f514b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        k kVar = this.f514b;
        synchronized (kVar) {
            z = true;
            if (kVar.v) {
                z = kVar.w;
            } else {
                kVar.c();
                kVar.v = true;
                int i = kVar.h;
                Drawable[] drawableArr = kVar.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getConstantState() == null) {
                        kVar.w = false;
                        z = false;
                        break;
                    }
                }
                kVar.w = true;
            }
        }
        if (!z) {
            return null;
        }
        this.f514b.f511d = getChangingConfigurations();
        return this.f514b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f516d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f515c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        k kVar = this.f514b;
        if (kVar.l) {
            if (!kVar.m) {
                kVar.b();
            }
            return kVar.o;
        }
        Drawable drawable = this.f516d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        k kVar = this.f514b;
        if (kVar.l) {
            if (!kVar.m) {
                kVar.b();
            }
            return kVar.n;
        }
        Drawable drawable = this.f516d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        k kVar = this.f514b;
        if (kVar.l) {
            if (!kVar.m) {
                kVar.b();
            }
            return kVar.q;
        }
        Drawable drawable = this.f516d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        k kVar = this.f514b;
        if (kVar.l) {
            if (!kVar.m) {
                kVar.b();
            }
            return kVar.p;
        }
        Drawable drawable = this.f516d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f516d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        k kVar = this.f514b;
        if (kVar.r) {
            return kVar.s;
        }
        kVar.c();
        int i = kVar.h;
        Drawable[] drawableArr = kVar.g;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        kVar.s = opacity;
        kVar.r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f516d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        k kVar = this.f514b;
        Rect rect2 = null;
        boolean z = false;
        if (!kVar.i) {
            Rect rect3 = kVar.k;
            if (rect3 != null || kVar.j) {
                rect2 = rect3;
            } else {
                kVar.c();
                Rect rect4 = new Rect();
                int i = kVar.h;
                Drawable[] drawableArr = kVar.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                kVar.j = true;
                kVar.k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f516d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f514b.C && getLayoutDirection() == 1) {
            z = true;
        }
        if (z) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        k kVar = this.f514b;
        if (kVar != null) {
            kVar.r = false;
            kVar.t = false;
        }
        if (drawable != this.f516d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f514b.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f517e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f517e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f516d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.g) {
                this.f516d.setAlpha(this.f518f);
            }
        }
        if (this.l != 0) {
            this.l = 0L;
            z = true;
        }
        if (this.k != 0) {
            this.k = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            h hVar = (h) this;
            c cVar = new c(hVar.q, hVar, null);
            cVar.e();
            d(cVar);
            this.i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f517e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f516d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        k kVar = this.f514b;
        int i2 = this.h;
        int i3 = kVar.h;
        Drawable[] drawableArr = kVar.g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean layoutDirection = drawableArr[i4].setLayoutDirection(i);
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        kVar.z = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f517e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f516d;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f516d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.g && this.f518f == i) {
            return;
        }
        this.g = true;
        this.f518f = i;
        Drawable drawable = this.f516d;
        if (drawable != null) {
            if (this.k == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        k kVar = this.f514b;
        if (kVar.C != z) {
            kVar.C = z;
            Drawable drawable = this.f516d;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        k kVar = this.f514b;
        kVar.E = true;
        if (kVar.D != colorFilter) {
            kVar.D = colorFilter;
            Drawable drawable = this.f516d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        k kVar = this.f514b;
        if (kVar.x != z) {
            kVar.x = z;
            Drawable drawable = this.f516d;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f516d;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f515c;
        if (rect == null) {
            this.f515c = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f516d;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        k kVar = this.f514b;
        kVar.H = true;
        if (kVar.F != colorStateList) {
            kVar.F = colorStateList;
            b.h.b.h.F(this.f516d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        k kVar = this.f514b;
        kVar.I = true;
        if (kVar.G != mode) {
            kVar.G = mode;
            b.h.b.h.G(this.f516d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f517e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f516d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f516d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
