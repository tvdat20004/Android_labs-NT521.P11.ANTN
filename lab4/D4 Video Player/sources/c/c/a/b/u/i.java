package c.c.a.b.u;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class i extends Drawable implements w {
    public static final String x = i.class.getSimpleName();
    public static final Paint y = new Paint(1);

    /* renamed from: b, reason: collision with root package name */
    public h f4024b;

    /* renamed from: c, reason: collision with root package name */
    public final u[] f4025c;

    /* renamed from: d, reason: collision with root package name */
    public final u[] f4026d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f4027e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4028f;
    public final Matrix g;
    public final Path h;
    public final Path i;
    public final RectF j;
    public final RectF k;
    public final Region l;
    public final Region m;
    public m n;
    public final Paint o;
    public final Paint p;
    public final c.c.a.b.t.a q;
    public final g r;
    public final n s;
    public PorterDuffColorFilter t;
    public PorterDuffColorFilter u;
    public final RectF v;
    public boolean w;

    public i() {
        this(new m());
    }

    public i(h hVar) {
        this.f4025c = new u[4];
        this.f4026d = new u[4];
        this.f4027e = new BitSet(8);
        this.g = new Matrix();
        this.h = new Path();
        this.i = new Path();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new Region();
        this.m = new Region();
        Paint paint = new Paint(1);
        this.o = paint;
        Paint paint2 = new Paint(1);
        this.p = paint2;
        this.q = new c.c.a.b.t.a();
        this.s = new n();
        this.v = new RectF();
        this.w = true;
        this.f4024b = hVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = y;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        v();
        u(getState());
        this.r = new g(this);
    }

    public i(m mVar) {
        this(new h(mVar, null));
    }

    public final void b(RectF rectF, Path path) {
        c(rectF, path);
        if (this.f4024b.j != 1.0f) {
            this.g.reset();
            Matrix matrix = this.g;
            float f2 = this.f4024b.j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.g);
        }
        path.computeBounds(this.v, true);
    }

    public final void c(RectF rectF, Path path) {
        n nVar = this.s;
        h hVar = this.f4024b;
        nVar.a(hVar.f4018a, hVar.k, rectF, this.r, path);
    }

    public final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int e2;
        if (colorStateList == null || mode == null) {
            return (!z || (e2 = e((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(e2, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = e(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
    
        if (((r2.f4018a.d(h()) || r12.h.isConvex() || android.os.Build.VERSION.SDK_INT >= 29) ? false : true) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ad  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.b.u.i.draw(android.graphics.Canvas):void");
    }

    public final int e(int i) {
        h hVar = this.f4024b;
        float f2 = hVar.o + hVar.p + hVar.n;
        c.c.a.b.n.a aVar = hVar.f4019b;
        if (aVar == null || !aVar.f3952a) {
            return i;
        }
        if (!(b.h.d.a.c(i, 255) == aVar.f3954c)) {
            return i;
        }
        float f3 = 0.0f;
        if (aVar.f3955d > 0.0f && f2 > 0.0f) {
            f3 = Math.min(((((float) Math.log1p(f2 / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return b.h.d.a.c(c.c.a.b.a.h(b.h.d.a.c(i, 255), aVar.f3953b, f3), Color.alpha(i));
    }

    public final void f(Canvas canvas) {
        if (this.f4027e.cardinality() > 0) {
            Log.w(x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f4024b.s != 0) {
            canvas.drawPath(this.h, this.q.f4008a);
        }
        for (int i = 0; i < 4; i++) {
            u uVar = this.f4025c[i];
            c.c.a.b.t.a aVar = this.q;
            int i2 = this.f4024b.r;
            Matrix matrix = u.f4062a;
            uVar.a(matrix, aVar, i2, canvas);
            this.f4026d[i].a(matrix, this.q, this.f4024b.r, canvas);
        }
        if (this.w) {
            int i3 = i();
            int j = j();
            canvas.translate(-i3, -j);
            canvas.drawPath(this.h, y);
            canvas.translate(i3, j);
        }
    }

    public final void g(Canvas canvas, Paint paint, Path path, m mVar, RectF rectF) {
        if (!mVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = mVar.f4035f.a(rectF) * this.f4024b.k;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f4024b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        h hVar = this.f4024b;
        if (hVar.q == 2) {
            return;
        }
        if (hVar.f4018a.d(h())) {
            outline.setRoundRect(getBounds(), l() * this.f4024b.k);
            return;
        }
        b(h(), this.h);
        if (this.h.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.h);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f4024b.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.l.set(getBounds());
        b(h(), this.h);
        this.m.setPath(this.h, this.l);
        this.l.op(this.m, Region.Op.DIFFERENCE);
        return this.l;
    }

    public RectF h() {
        this.j.set(getBounds());
        return this.j;
    }

    public int i() {
        h hVar = this.f4024b;
        return (int) (Math.sin(Math.toRadians(hVar.t)) * hVar.s);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f4028f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f4024b.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f4024b.f4023f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f4024b.f4022e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f4024b.f4021d) != null && colorStateList4.isStateful())));
    }

    public int j() {
        h hVar = this.f4024b;
        return (int) (Math.cos(Math.toRadians(hVar.t)) * hVar.s);
    }

    public final float k() {
        if (m()) {
            return this.p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float l() {
        return this.f4024b.f4018a.f4034e.a(h());
    }

    public final boolean m() {
        Paint.Style style = this.f4024b.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.p.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f4024b = new h(this.f4024b);
        return this;
    }

    public void n(Context context) {
        this.f4024b.f4019b = new c.c.a.b.n.a(context);
        w();
    }

    public void o(float f2) {
        h hVar = this.f4024b;
        if (hVar.o != f2) {
            hVar.o = f2;
            w();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f4028f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, c.c.a.b.p.l
    public boolean onStateChange(int[] iArr) {
        boolean z = u(iArr) || v();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void p(ColorStateList colorStateList) {
        h hVar = this.f4024b;
        if (hVar.f4021d != colorStateList) {
            hVar.f4021d = colorStateList;
            onStateChange(getState());
        }
    }

    public void q(float f2) {
        h hVar = this.f4024b;
        if (hVar.k != f2) {
            hVar.k = f2;
            this.f4028f = true;
            invalidateSelf();
        }
    }

    public void r(float f2, int i) {
        this.f4024b.l = f2;
        invalidateSelf();
        t(ColorStateList.valueOf(i));
    }

    public void s(float f2, ColorStateList colorStateList) {
        this.f4024b.l = f2;
        invalidateSelf();
        t(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        h hVar = this.f4024b;
        if (hVar.m != i) {
            hVar.m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4024b.f4020c = colorFilter;
        super.invalidateSelf();
    }

    @Override // c.c.a.b.u.w
    public void setShapeAppearanceModel(m mVar) {
        this.f4024b.f4018a = mVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f4024b.g = colorStateList;
        v();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        h hVar = this.f4024b;
        if (hVar.h != mode) {
            hVar.h = mode;
            v();
            super.invalidateSelf();
        }
    }

    public void t(ColorStateList colorStateList) {
        h hVar = this.f4024b;
        if (hVar.f4022e != colorStateList) {
            hVar.f4022e = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean u(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f4024b.f4021d == null || color2 == (colorForState2 = this.f4024b.f4021d.getColorForState(iArr, (color2 = this.o.getColor())))) {
            z = false;
        } else {
            this.o.setColor(colorForState2);
            z = true;
        }
        if (this.f4024b.f4022e == null || color == (colorForState = this.f4024b.f4022e.getColorForState(iArr, (color = this.p.getColor())))) {
            return z;
        }
        this.p.setColor(colorForState);
        return true;
    }

    public final boolean v() {
        PorterDuffColorFilter porterDuffColorFilter = this.t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        h hVar = this.f4024b;
        this.t = d(hVar.g, hVar.h, this.o, true);
        h hVar2 = this.f4024b;
        this.u = d(hVar2.f4023f, hVar2.h, this.p, false);
        h hVar3 = this.f4024b;
        if (hVar3.u) {
            this.q.a(hVar3.g.getColorForState(getState(), 0));
        }
        return (Objects.equals(porterDuffColorFilter, this.t) && Objects.equals(porterDuffColorFilter2, this.u)) ? false : true;
    }

    public final void w() {
        h hVar = this.f4024b;
        float f2 = hVar.o + hVar.p;
        hVar.r = (int) Math.ceil(0.75f * f2);
        this.f4024b.s = (int) Math.ceil(f2 * 0.25f);
        v();
        super.invalidateSelf();
    }
}
