package b.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class f0 extends b0 {

    /* renamed from: d, reason: collision with root package name */
    public final SeekBar f678d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f679e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f680f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public f0(SeekBar seekBar) {
        super(seekBar);
        this.f680f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.f678d = seekBar;
    }

    @Override // b.b.i.b0
    public void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        Context context = this.f678d.getContext();
        int[] iArr = b.b.b.g;
        l2 r = l2.r(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f678d;
        b.h.j.u.h(seekBar, seekBar.getContext(), iArr, attributeSet, r.f730b, i, 0);
        Drawable h = r.h(0);
        if (h != null) {
            this.f678d.setThumb(h);
        }
        Drawable g = r.g(1);
        Drawable drawable = this.f679e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f679e = g;
        if (g != null) {
            g.setCallback(this.f678d);
            SeekBar seekBar2 = this.f678d;
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            g.setLayoutDirection(seekBar2.getLayoutDirection());
            if (g.isStateful()) {
                g.setState(this.f678d.getDrawableState());
            }
            c();
        }
        this.f678d.invalidate();
        if (r.p(3)) {
            this.g = d1.c(r.j(3, -1), this.g);
            this.i = true;
        }
        if (r.p(2)) {
            this.f680f = r.c(2);
            this.h = true;
        }
        r.f730b.recycle();
        c();
    }

    public final void c() {
        Drawable drawable = this.f679e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable mutate = drawable.mutate();
                this.f679e = mutate;
                if (this.h) {
                    mutate.setTintList(this.f680f);
                }
                if (this.i) {
                    this.f679e.setTintMode(this.g);
                }
                if (this.f679e.isStateful()) {
                    this.f679e.setState(this.f678d.getDrawableState());
                }
            }
        }
    }

    public void d(Canvas canvas) {
        if (this.f679e != null) {
            int max = this.f678d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f679e.getIntrinsicWidth();
                int intrinsicHeight = this.f679e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f679e.setBounds(-i, -i2, i, i2);
                float width = ((this.f678d.getWidth() - this.f678d.getPaddingLeft()) - this.f678d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f678d.getPaddingLeft(), this.f678d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f679e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
