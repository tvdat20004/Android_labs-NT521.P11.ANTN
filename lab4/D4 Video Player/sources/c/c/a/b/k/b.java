package c.c.a.b.k;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import b.h.b.h;
import c.c.a.b.c.c;
import c.c.a.b.p.l;
import c.c.a.b.p.m;
import c.c.a.b.r.d;
import c.c.a.b.u.i;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public class b extends i implements Drawable.Callback, l {
    public static final int[] I0 = {R.attr.state_enabled};
    public static final ShapeDrawable J0 = new ShapeDrawable(new OvalShape());
    public ColorStateList A;
    public int[] A0;
    public float B;
    public boolean B0;
    public float C;
    public ColorStateList C0;
    public ColorStateList D;
    public WeakReference<a> D0;
    public float E;
    public TextUtils.TruncateAt E0;
    public ColorStateList F;
    public boolean F0;
    public CharSequence G;
    public int G0;
    public boolean H;
    public boolean H0;
    public Drawable I;
    public ColorStateList J;
    public float K;
    public boolean L;
    public boolean M;
    public Drawable N;
    public Drawable O;
    public ColorStateList P;
    public float Q;
    public CharSequence R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public ColorStateList V;
    public c W;
    public c X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public float f0;
    public final Context g0;
    public final Paint h0;
    public final Paint.FontMetrics i0;
    public final RectF j0;
    public final PointF k0;
    public final Path l0;
    public final m m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public boolean t0;
    public int u0;
    public int v0;
    public ColorFilter w0;
    public PorterDuffColorFilter x0;
    public ColorStateList y0;
    public ColorStateList z;
    public PorterDuff.Mode z0;

    public interface a {
    }

    public b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(c.c.a.b.u.m.b(context, attributeSet, i, i2).a());
        this.C = -1.0f;
        this.h0 = new Paint(1);
        this.i0 = new Paint.FontMetrics();
        this.j0 = new RectF();
        this.k0 = new PointF();
        this.l0 = new Path();
        this.v0 = 255;
        this.z0 = PorterDuff.Mode.SRC_IN;
        this.D0 = new WeakReference<>(null);
        this.f4024b.f4019b = new c.c.a.b.n.a(context);
        w();
        this.g0 = context;
        m mVar = new m(this);
        this.m0 = mVar;
        this.G = "";
        mVar.f3971a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = I0;
        setState(iArr);
        c0(iArr);
        this.F0 = true;
        int[] iArr2 = c.c.a.b.s.a.f4002a;
        J0.setTint(-1);
    }

    public static boolean F(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean G(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (p0()) {
            float f2 = this.f0 + this.e0;
            if (getLayoutDirection() == 0) {
                float f3 = rect.right - f2;
                rectF.right = f3;
                rectF.left = f3 - this.Q;
            } else {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + this.Q;
            }
            float exactCenterY = rect.exactCenterY();
            float f5 = this.Q;
            float f6 = exactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    public final void B(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (p0()) {
            float f2 = this.f0 + this.e0 + this.Q + this.d0 + this.c0;
            if (getLayoutDirection() == 0) {
                float f3 = rect.right;
                rectF.right = f3;
                rectF.left = f3 - f2;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f2;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public float C() {
        if (p0()) {
            return this.d0 + this.Q + this.e0;
        }
        return 0.0f;
    }

    public float D() {
        return this.H0 ? l() : this.C;
    }

    public Drawable E() {
        Drawable drawable = this.N;
        if (drawable != null) {
            return h.J(drawable);
        }
        return null;
    }

    public void H() {
        a aVar = this.D0.get();
        if (aVar != null) {
            Chip chip = (Chip) aVar;
            chip.c(chip.p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean I(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.z;
        int colorForState = colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.n0) : 0;
        boolean z3 = true;
        if (this.n0 != colorForState) {
            this.n0 = colorForState;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.A;
        int colorForState2 = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.o0) : 0;
        if (this.o0 != colorForState2) {
            this.o0 = colorForState2;
            onStateChange = true;
        }
        int a2 = b.h.d.a.a(colorForState2, colorForState);
        if ((this.p0 != a2) | (this.f4024b.f4021d == null)) {
            this.p0 = a2;
            p(ColorStateList.valueOf(a2));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.D;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.q0) : 0;
        if (this.q0 != colorForState3) {
            this.q0 = colorForState3;
            onStateChange = true;
        }
        int colorForState4 = (this.C0 == null || !c.c.a.b.s.a.c(iArr)) ? 0 : this.C0.getColorForState(iArr, this.r0);
        if (this.r0 != colorForState4) {
            this.r0 = colorForState4;
            if (this.B0) {
                onStateChange = true;
            }
        }
        d dVar = this.m0.f3976f;
        int colorForState5 = (dVar == null || (colorStateList = dVar.f3997b) == null) ? 0 : colorStateList.getColorForState(iArr, this.s0);
        if (this.s0 != colorForState5) {
            this.s0 = colorForState5;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i : state) {
                if (i == 16842912) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z4 = z && this.S;
        if (this.t0 == z4 || this.U == null) {
            z2 = false;
        } else {
            float z5 = z();
            this.t0 = z4;
            if (z5 != z()) {
                onStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.y0;
        int colorForState6 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.u0) : 0;
        if (this.u0 != colorForState6) {
            this.u0 = colorForState6;
            this.x0 = c.c.a.b.a.p(this, this.y0, this.z0);
        } else {
            z3 = onStateChange;
        }
        if (G(this.I)) {
            z3 |= this.I.setState(iArr);
        }
        if (G(this.U)) {
            z3 |= this.U.setState(iArr);
        }
        if (G(this.N)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z3 |= this.N.setState(iArr3);
        }
        int[] iArr4 = c.c.a.b.s.a.f4002a;
        if (G(this.O)) {
            z3 |= this.O.setState(iArr2);
        }
        if (z3) {
            invalidateSelf();
        }
        if (z2) {
            H();
        }
        return z3;
    }

    public void J(boolean z) {
        if (this.S != z) {
            this.S = z;
            float z2 = z();
            if (!z && this.t0) {
                this.t0 = false;
            }
            float z3 = z();
            invalidateSelf();
            if (z2 != z3) {
                H();
            }
        }
    }

    public void K(Drawable drawable) {
        if (this.U != drawable) {
            float z = z();
            this.U = drawable;
            float z2 = z();
            q0(this.U);
            x(this.U);
            invalidateSelf();
            if (z != z2) {
                H();
            }
        }
    }

    public void L(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (this.T && this.U != null && this.S) {
                this.U.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void M(boolean z) {
        if (this.T != z) {
            boolean n0 = n0();
            this.T = z;
            boolean n02 = n0();
            if (n0 != n02) {
                if (n02) {
                    x(this.U);
                } else {
                    q0(this.U);
                }
                invalidateSelf();
                H();
            }
        }
    }

    public void N(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    public void O(float f2) {
        if (this.C != f2) {
            this.C = f2;
            this.f4024b.f4018a = this.f4024b.f4018a.e(f2);
            invalidateSelf();
        }
    }

    public void P(float f2) {
        if (this.f0 != f2) {
            this.f0 = f2;
            invalidateSelf();
            H();
        }
    }

    public void Q(Drawable drawable) {
        Drawable drawable2 = this.I;
        Drawable J = drawable2 != null ? h.J(drawable2) : null;
        if (J != drawable) {
            float z = z();
            this.I = drawable != null ? drawable.mutate() : null;
            float z2 = z();
            q0(J);
            if (o0()) {
                x(this.I);
            }
            invalidateSelf();
            if (z != z2) {
                H();
            }
        }
    }

    public void R(float f2) {
        if (this.K != f2) {
            float z = z();
            this.K = f2;
            float z2 = z();
            invalidateSelf();
            if (z != z2) {
                H();
            }
        }
    }

    public void S(ColorStateList colorStateList) {
        this.L = true;
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (o0()) {
                this.I.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void T(boolean z) {
        if (this.H != z) {
            boolean o0 = o0();
            this.H = z;
            boolean o02 = o0();
            if (o0 != o02) {
                if (o02) {
                    x(this.I);
                } else {
                    q0(this.I);
                }
                invalidateSelf();
                H();
            }
        }
    }

    public void U(float f2) {
        if (this.B != f2) {
            this.B = f2;
            invalidateSelf();
            H();
        }
    }

    public void V(float f2) {
        if (this.Y != f2) {
            this.Y = f2;
            invalidateSelf();
            H();
        }
    }

    public void W(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.H0) {
                t(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void X(float f2) {
        if (this.E != f2) {
            this.E = f2;
            this.h0.setStrokeWidth(f2);
            if (this.H0) {
                this.f4024b.l = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public void Y(Drawable drawable) {
        Drawable E = E();
        if (E != drawable) {
            float C = C();
            this.N = drawable != null ? drawable.mutate() : null;
            int[] iArr = c.c.a.b.s.a.f4002a;
            this.O = new RippleDrawable(c.c.a.b.s.a.b(this.F), this.N, J0);
            float C2 = C();
            q0(E);
            if (p0()) {
                x(this.N);
            }
            invalidateSelf();
            if (C != C2) {
                H();
            }
        }
    }

    public void Z(float f2) {
        if (this.e0 != f2) {
            this.e0 = f2;
            invalidateSelf();
            if (p0()) {
                H();
            }
        }
    }

    @Override // c.c.a.b.p.l
    public void a() {
        H();
        invalidateSelf();
    }

    public void a0(float f2) {
        if (this.Q != f2) {
            this.Q = f2;
            invalidateSelf();
            if (p0()) {
                H();
            }
        }
    }

    public void b0(float f2) {
        if (this.d0 != f2) {
            this.d0 = f2;
            invalidateSelf();
            if (p0()) {
                H();
            }
        }
    }

    public boolean c0(int[] iArr) {
        if (Arrays.equals(this.A0, iArr)) {
            return false;
        }
        this.A0 = iArr;
        if (p0()) {
            return I(getState(), iArr);
        }
        return false;
    }

    public void d0(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (p0()) {
                this.N.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // c.c.a.b.u.i, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.v0) == 0) {
            return;
        }
        int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        if (!this.H0) {
            this.h0.setColor(this.n0);
            this.h0.setStyle(Paint.Style.FILL);
            this.j0.set(bounds);
            canvas.drawRoundRect(this.j0, D(), D(), this.h0);
        }
        if (!this.H0) {
            this.h0.setColor(this.o0);
            this.h0.setStyle(Paint.Style.FILL);
            Paint paint = this.h0;
            ColorFilter colorFilter = this.w0;
            if (colorFilter == null) {
                colorFilter = this.x0;
            }
            paint.setColorFilter(colorFilter);
            this.j0.set(bounds);
            canvas.drawRoundRect(this.j0, D(), D(), this.h0);
        }
        if (this.H0) {
            super.draw(canvas);
        }
        if (this.E > 0.0f && !this.H0) {
            this.h0.setColor(this.q0);
            this.h0.setStyle(Paint.Style.STROKE);
            if (!this.H0) {
                Paint paint2 = this.h0;
                ColorFilter colorFilter2 = this.w0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.x0;
                }
                paint2.setColorFilter(colorFilter2);
            }
            RectF rectF = this.j0;
            float f3 = bounds.left;
            float f4 = this.E / 2.0f;
            rectF.set(f3 + f4, bounds.top + f4, bounds.right - f4, bounds.bottom - f4);
            float f5 = this.C - (this.E / 2.0f);
            canvas.drawRoundRect(this.j0, f5, f5, this.h0);
        }
        this.h0.setColor(this.r0);
        this.h0.setStyle(Paint.Style.FILL);
        this.j0.set(bounds);
        if (this.H0) {
            c(new RectF(bounds), this.l0);
            g(canvas, this.h0, this.l0, this.f4024b.f4018a, h());
        } else {
            canvas.drawRoundRect(this.j0, D(), D(), this.h0);
        }
        if (o0()) {
            y(bounds, this.j0);
            RectF rectF2 = this.j0;
            float f6 = rectF2.left;
            float f7 = rectF2.top;
            canvas.translate(f6, f7);
            this.I.setBounds(0, 0, (int) this.j0.width(), (int) this.j0.height());
            this.I.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (n0()) {
            y(bounds, this.j0);
            RectF rectF3 = this.j0;
            float f8 = rectF3.left;
            float f9 = rectF3.top;
            canvas.translate(f8, f9);
            this.U.setBounds(0, 0, (int) this.j0.width(), (int) this.j0.height());
            this.U.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (!this.F0 || this.G == null) {
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.k0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.G != null) {
                float z = z() + this.Y + this.b0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + z;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - z;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                this.m0.f3971a.getFontMetrics(this.i0);
                Paint.FontMetrics fontMetrics = this.i0;
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            RectF rectF4 = this.j0;
            rectF4.setEmpty();
            if (this.G != null) {
                float z2 = z() + this.Y + this.b0;
                float C = C() + this.f0 + this.c0;
                if (getLayoutDirection() == 0) {
                    rectF4.left = bounds.left + z2;
                    f2 = bounds.right - C;
                } else {
                    rectF4.left = bounds.left + C;
                    f2 = bounds.right - z2;
                }
                rectF4.right = f2;
                rectF4.top = bounds.top;
                rectF4.bottom = bounds.bottom;
            }
            m mVar = this.m0;
            if (mVar.f3976f != null) {
                mVar.f3971a.drawableState = getState();
                m mVar2 = this.m0;
                mVar2.f3976f.c(this.g0, mVar2.f3971a, mVar2.f3972b);
            }
            this.m0.f3971a.setTextAlign(align);
            boolean z3 = Math.round(this.m0.a(this.G.toString())) > Math.round(this.j0.width());
            if (z3) {
                i5 = canvas.save();
                canvas.clipRect(this.j0);
            } else {
                i5 = 0;
            }
            CharSequence charSequence = this.G;
            if (z3 && this.E0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.m0.f3971a, this.j0.width(), this.E0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF2 = this.k0;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
            canvas.drawText(charSequence2, 0, length, pointF2.x, pointF2.y, this.m0.f3971a);
            if (z3) {
                canvas.restoreToCount(i5);
            }
        }
        if (p0()) {
            A(bounds, this.j0);
            RectF rectF5 = this.j0;
            float f10 = rectF5.left;
            float f11 = rectF5.top;
            canvas.translate(f10, f11);
            this.N.setBounds(i3, i3, (int) this.j0.width(), (int) this.j0.height());
            int[] iArr = c.c.a.b.s.a.f4002a;
            this.O.setBounds(this.N.getBounds());
            this.O.jumpToCurrentState();
            this.O.draw(canvas);
            canvas.translate(-f10, -f11);
        }
        if (this.v0 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    public void e0(boolean z) {
        if (this.M != z) {
            boolean p0 = p0();
            this.M = z;
            boolean p02 = p0();
            if (p0 != p02) {
                if (p02) {
                    x(this.N);
                } else {
                    q0(this.N);
                }
                invalidateSelf();
                H();
            }
        }
    }

    public void f0(float f2) {
        if (this.a0 != f2) {
            float z = z();
            this.a0 = f2;
            float z2 = z();
            invalidateSelf();
            if (z != z2) {
                H();
            }
        }
    }

    public void g0(float f2) {
        if (this.Z != f2) {
            float z = z();
            this.Z = f2;
            float z2 = z();
            invalidateSelf();
            if (z != z2) {
                H();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.v0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.w0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(C() + this.m0.a(this.G.toString()) + z() + this.Y + this.b0 + this.c0 + this.f0), this.G0);
    }

    @Override // c.c.a.b.u.i, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // c.c.a.b.u.i, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.H0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.B, this.C);
        } else {
            outline.setRoundRect(bounds, this.C);
        }
        outline.setAlpha(this.v0 / 255.0f);
    }

    public void h0(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            this.C0 = this.B0 ? c.c.a.b.s.a.b(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public void i0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.G, charSequence)) {
            return;
        }
        this.G = charSequence;
        this.m0.f3974d = true;
        invalidateSelf();
        H();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // c.c.a.b.u.i, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        if (!F(this.z) && !F(this.A) && !F(this.D) && (!this.B0 || !F(this.C0))) {
            d dVar = this.m0.f3976f;
            if (!((dVar == null || (colorStateList = dVar.f3997b) == null || !colorStateList.isStateful()) ? false : true)) {
                if (!(this.T && this.U != null && this.S) && !G(this.I) && !G(this.U) && !F(this.y0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void j0(d dVar) {
        this.m0.b(dVar, this.g0);
    }

    public void k0(float f2) {
        if (this.c0 != f2) {
            this.c0 = f2;
            invalidateSelf();
            H();
        }
    }

    public void l0(float f2) {
        if (this.b0 != f2) {
            this.b0 = f2;
            invalidateSelf();
            H();
        }
    }

    public void m0(boolean z) {
        if (this.B0 != z) {
            this.B0 = z;
            this.C0 = z ? c.c.a.b.s.a.b(this.F) : null;
            onStateChange(getState());
        }
    }

    public final boolean n0() {
        return this.T && this.U != null && this.t0;
    }

    public final boolean o0() {
        return this.H && this.I != null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (o0()) {
            onLayoutDirectionChanged |= this.I.setLayoutDirection(i);
        }
        if (n0()) {
            onLayoutDirectionChanged |= this.U.setLayoutDirection(i);
        }
        if (p0()) {
            onLayoutDirectionChanged |= this.N.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (o0()) {
            onLevelChange |= this.I.setLevel(i);
        }
        if (n0()) {
            onLevelChange |= this.U.setLevel(i);
        }
        if (p0()) {
            onLevelChange |= this.N.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // c.c.a.b.u.i, android.graphics.drawable.Drawable, c.c.a.b.p.l
    public boolean onStateChange(int[] iArr) {
        if (this.H0) {
            super.onStateChange(iArr);
        }
        return I(iArr, this.A0);
    }

    public final boolean p0() {
        return this.M && this.N != null;
    }

    public final void q0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // c.c.a.b.u.i, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.v0 != i) {
            this.v0 = i;
            invalidateSelf();
        }
    }

    @Override // c.c.a.b.u.i, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.w0 != colorFilter) {
            this.w0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // c.c.a.b.u.i, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // c.c.a.b.u.i, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.z0 != mode) {
            this.z0 = mode;
            this.x0 = c.c.a.b.a.p(this, this.y0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (o0()) {
            visible |= this.I.setVisible(z, z2);
        }
        if (n0()) {
            visible |= this.U.setVisible(z, z2);
        }
        if (p0()) {
            visible |= this.N.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void x(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.N) {
            if (drawable.isStateful()) {
                drawable.setState(this.A0);
            }
            drawable.setTintList(this.P);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.I;
        if (drawable == drawable2 && this.L) {
            drawable2.setTintList(this.J);
        }
    }

    public final void y(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (o0() || n0()) {
            float f2 = this.Y + this.Z;
            if (getLayoutDirection() == 0) {
                float f3 = rect.left + f2;
                rectF.left = f3;
                rectF.right = f3 + this.K;
            } else {
                float f4 = rect.right - f2;
                rectF.right = f4;
                rectF.left = f4 - this.K;
            }
            float exactCenterY = rect.exactCenterY();
            float f5 = this.K;
            float f6 = exactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    public float z() {
        if (o0() || n0()) {
            return this.Z + this.K + this.a0;
        }
        return 0.0f;
    }
}
