package c.c.a.b.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import c.c.a.b.p.l;
import c.c.a.b.p.m;
import c.c.a.b.p.p;
import c.c.a.b.u.i;
import java.lang.ref.WeakReference;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class c extends Drawable implements l {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference<Context> f3841b;

    /* renamed from: c, reason: collision with root package name */
    public final i f3842c;

    /* renamed from: d, reason: collision with root package name */
    public final m f3843d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f3844e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3845f;
    public final float g;
    public final float h;
    public final b i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public float o;
    public WeakReference<View> p;
    public WeakReference<ViewGroup> q;

    public c(Context context) {
        c.c.a.b.r.d dVar;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f3841b = weakReference;
        p.c(context, p.f3979b, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.f3844e = new Rect();
        this.f3842c = new i();
        this.f3845f = resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius);
        this.h = resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.g = resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius);
        m mVar = new m(this);
        this.f3843d = mVar;
        mVar.f3971a.setTextAlign(Paint.Align.CENTER);
        this.i = new b(context);
        Context context3 = weakReference.get();
        if (context3 == null || mVar.f3976f == (dVar = new c.c.a.b.r.d(context3, R.style.TextAppearance_MaterialComponents_Badge)) || (context2 = weakReference.get()) == null) {
            return;
        }
        mVar.b(dVar, context2);
        e();
    }

    @Override // c.c.a.b.p.l
    public void a() {
        invalidateSelf();
    }

    public final String b() {
        if (c() <= this.l) {
            return Integer.toString(c());
        }
        Context context = this.f3841b.get();
        return context == null ? "" : context.getString(R.string.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.l), "+");
    }

    public int c() {
        if (d()) {
            return this.i.f3839e;
        }
        return 0;
    }

    public boolean d() {
        return this.i.f3839e != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || this.i.f3838d == 0 || !isVisible()) {
            return;
        }
        this.f3842c.draw(canvas);
        if (d()) {
            Rect rect = new Rect();
            String b2 = b();
            this.f3843d.f3971a.getTextBounds(b2, 0, b2.length(), rect);
            canvas.drawText(b2, this.j, this.k + (rect.height() / 2), this.f3843d.f3971a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b7, code lost:
    
        if (r1.getLayoutDirection() == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c2, code lost:
    
        r1 = ((r4.left - r8.n) + r0) + r8.i.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d1, code lost:
    
        r1 = ((r4.right + r8.n) - r0) - r8.i.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        if (r1.getLayoutDirection() == 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.b.e.c.e():void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.i.f3838d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3844e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3844e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, c.c.a.b.p.l
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.i.f3838d = i;
        this.f3843d.f3971a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
