package c.c.a.b.p;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import b.h.j.y;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d {
    public float A;
    public float B;
    public int[] C;
    public boolean D;
    public final TextPaint E;
    public final TextPaint F;
    public TimeInterpolator G;
    public TimeInterpolator H;
    public float I;
    public float J;
    public float K;
    public ColorStateList L;
    public StaticLayout M;
    public float N;
    public float O;
    public float P;
    public CharSequence Q;

    /* renamed from: a, reason: collision with root package name */
    public final View f3958a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3959b;

    /* renamed from: c, reason: collision with root package name */
    public float f3960c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f3961d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f3962e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f3963f;
    public int g = 16;
    public int h = 16;
    public float i = 15.0f;
    public float j = 15.0f;
    public ColorStateList k;
    public ColorStateList l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public c.c.a.b.r.a v;
    public CharSequence w;
    public CharSequence x;
    public boolean y;
    public Bitmap z;

    public d(View view) {
        this.f3958a = view;
        TextPaint textPaint = new TextPaint(129);
        this.E = textPaint;
        this.F = new TextPaint(textPaint);
        this.f3962e = new Rect();
        this.f3961d = new Rect();
        this.f3963f = new RectF();
    }

    public static int a(int i, int i2, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((Color.alpha(i2) * f2) + (Color.alpha(i) * f3)), (int) ((Color.red(i2) * f2) + (Color.red(i) * f3)), (int) ((Color.green(i2) * f2) + (Color.green(i) * f3)), (int) ((Color.blue(i2) * f2) + (Color.blue(i) * f3)));
    }

    public static float i(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        TimeInterpolator timeInterpolator2 = c.c.a.b.c.a.f3809a;
        return ((f3 - f2) * f4) + f2;
    }

    public static boolean l(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    public float b() {
        if (this.w == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.F;
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
        TextPaint textPaint2 = this.F;
        CharSequence charSequence = this.w;
        return textPaint2.measureText(charSequence, 0, charSequence.length());
    }

    public final boolean c(CharSequence charSequence) {
        View view = this.f3958a;
        WeakHashMap<View, y> weakHashMap = b.h.j.u.f1311a;
        return (view.getLayoutDirection() == 1 ? b.h.h.i.f1245d : b.h.h.i.f1244c).b(charSequence, 0, charSequence.length());
    }

    public final void d(float f2) {
        TextPaint textPaint;
        int g;
        this.f3963f.left = i(this.f3961d.left, this.f3962e.left, f2, this.G);
        this.f3963f.top = i(this.m, this.n, f2, this.G);
        this.f3963f.right = i(this.f3961d.right, this.f3962e.right, f2, this.G);
        this.f3963f.bottom = i(this.f3961d.bottom, this.f3962e.bottom, f2, this.G);
        this.q = i(this.o, this.p, f2, this.G);
        this.r = i(this.m, this.n, f2, this.G);
        p(i(this.i, this.j, f2, this.H));
        TimeInterpolator timeInterpolator = c.c.a.b.c.a.f3810b;
        this.N = 1.0f - i(0.0f, 1.0f, 1.0f - f2, timeInterpolator);
        View view = this.f3958a;
        WeakHashMap<View, y> weakHashMap = b.h.j.u.f1311a;
        view.postInvalidateOnAnimation();
        this.O = i(1.0f, 0.0f, f2, timeInterpolator);
        this.f3958a.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.l;
        ColorStateList colorStateList2 = this.k;
        if (colorStateList != colorStateList2) {
            textPaint = this.E;
            g = a(h(colorStateList2), g(), f2);
        } else {
            textPaint = this.E;
            g = g();
        }
        textPaint.setColor(g);
        this.E.setShadowLayer(i(0.0f, this.I, f2, null), i(0.0f, this.J, f2, null), i(0.0f, this.K, f2, null), a(h(null), h(this.L), f2));
        this.f3958a.postInvalidateOnAnimation();
    }

    public final void e(float f2) {
        boolean z;
        float f3;
        StaticLayout staticLayout;
        if (this.w == null) {
            return;
        }
        float width = this.f3962e.width();
        float width2 = this.f3961d.width();
        if (Math.abs(f2 - this.j) < 0.001f) {
            f3 = this.j;
            this.A = 1.0f;
            Typeface typeface = this.u;
            Typeface typeface2 = this.s;
            if (typeface != typeface2) {
                this.u = typeface2;
                z = true;
            } else {
                z = false;
            }
        } else {
            float f4 = this.i;
            Typeface typeface3 = this.u;
            Typeface typeface4 = this.t;
            if (typeface3 != typeface4) {
                this.u = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (Math.abs(f2 - f4) < 0.001f) {
                this.A = 1.0f;
            } else {
                this.A = f2 / this.i;
            }
            float f5 = this.j / this.i;
            width = width2 * f5 > width ? Math.min(width / f5, width2) : width2;
            f3 = f4;
        }
        if (width > 0.0f) {
            z = this.B != f3 || this.D || z;
            this.B = f3;
            this.D = false;
        }
        if (this.x == null || z) {
            this.E.setTextSize(this.B);
            this.E.setTypeface(this.u);
            this.E.setLinearText(this.A != 1.0f);
            boolean c2 = c(this.w);
            this.y = c2;
            try {
                CharSequence charSequence = this.w;
                TextPaint textPaint = this.E;
                int length = charSequence.length();
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                int max = Math.max(0, (int) width);
                CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, max, truncateAt);
                int min = Math.min(ellipsize.length(), length);
                if (c2) {
                    alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                }
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(ellipsize, 0, min, textPaint, max);
                obtain.setAlignment(alignment2);
                obtain.setIncludePad(false);
                obtain.setTextDirection(c2 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
                if (truncateAt != null) {
                    obtain.setEllipsize(truncateAt);
                }
                obtain.setMaxLines(1);
                staticLayout = obtain.build();
            } catch (j e2) {
                Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
                staticLayout = null;
            }
            Objects.requireNonNull(staticLayout);
            this.M = staticLayout;
            this.x = staticLayout.getText();
        }
    }

    public float f() {
        TextPaint textPaint = this.F;
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
        return -this.F.ascent();
    }

    public int g() {
        return h(this.l);
    }

    public final int h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.C;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public void j() {
        this.f3959b = this.f3962e.width() > 0 && this.f3962e.height() > 0 && this.f3961d.width() > 0 && this.f3961d.height() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.b.p.d.k():void");
    }

    public void m(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            k();
        }
    }

    public void n(int i) {
        if (this.h != i) {
            this.h = i;
            k();
        }
    }

    public void o(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f3960c) {
            this.f3960c = f2;
            d(f2);
        }
    }

    public final void p(float f2) {
        e(f2);
        View view = this.f3958a;
        WeakHashMap<View, y> weakHashMap = b.h.j.u.f1311a;
        view.postInvalidateOnAnimation();
    }

    public void q(Typeface typeface) {
        boolean z;
        c.c.a.b.r.a aVar = this.v;
        boolean z2 = true;
        if (aVar != null) {
            aVar.f3990c = true;
        }
        if (this.s != typeface) {
            this.s = typeface;
            z = true;
        } else {
            z = false;
        }
        if (this.t != typeface) {
            this.t = typeface;
        } else {
            z2 = false;
        }
        if (z || z2) {
            k();
        }
    }
}
