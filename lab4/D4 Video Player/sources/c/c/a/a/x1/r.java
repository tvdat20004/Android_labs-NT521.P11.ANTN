package c.c.a.a.x1;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class r {
    public float A;
    public int B;
    public int C;
    public int D;
    public int E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* renamed from: a, reason: collision with root package name */
    public final float f3489a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3490b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3491c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3492d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3493e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPaint f3494f;
    public final Paint g;
    public CharSequence h;
    public Layout.Alignment i;
    public Bitmap j;
    public float k;
    public int l;
    public int m;
    public float n;
    public int o;
    public float p;
    public float q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public float y;
    public float z;

    public r(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f3493e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f3492d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f3489a = round;
        this.f3490b = round;
        this.f3491c = round;
        TextPaint textPaint = new TextPaint();
        this.f3494f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(Canvas canvas, boolean z) {
        if (!z) {
            canvas.drawBitmap(this.j, (Rect) null, this.J, (Paint) null);
            return;
        }
        StaticLayout staticLayout = this.F;
        if (staticLayout == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.v) > 0) {
            this.g.setColor(this.v);
            canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.g);
        }
        int i = this.x;
        if (i == 1) {
            this.f3494f.setStrokeJoin(Paint.Join.ROUND);
            this.f3494f.setStrokeWidth(this.f3489a);
            this.f3494f.setColor(this.w);
            this.f3494f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout.draw(canvas);
        } else if (i == 2) {
            TextPaint textPaint = this.f3494f;
            float f2 = this.f3490b;
            float f3 = this.f3491c;
            textPaint.setShadowLayer(f2, f3, f3, this.w);
        } else if (i == 3 || i == 4) {
            boolean z2 = i == 3;
            int i2 = z2 ? -1 : this.w;
            int i3 = z2 ? this.w : -1;
            float f4 = this.f3490b / 2.0f;
            this.f3494f.setColor(this.t);
            this.f3494f.setStyle(Paint.Style.FILL);
            float f5 = -f4;
            this.f3494f.setShadowLayer(this.f3490b, f5, f5, i2);
            staticLayout.draw(canvas);
            this.f3494f.setShadowLayer(this.f3490b, f4, f4, i3);
        }
        this.f3494f.setColor(this.t);
        this.f3494f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f3494f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }
}
