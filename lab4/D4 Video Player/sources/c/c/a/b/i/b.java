package c.c.a.b.i;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import c.c.a.b.u.i;
import c.c.a.b.u.m;
import c.c.a.b.u.w;
import com.google.android.material.button.MaterialButton;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f3868a;

    /* renamed from: b, reason: collision with root package name */
    public m f3869b;

    /* renamed from: c, reason: collision with root package name */
    public int f3870c;

    /* renamed from: d, reason: collision with root package name */
    public int f3871d;

    /* renamed from: e, reason: collision with root package name */
    public int f3872e;

    /* renamed from: f, reason: collision with root package name */
    public int f3873f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q;
    public LayerDrawable r;

    public b(MaterialButton materialButton, m mVar) {
        this.f3868a = materialButton;
        this.f3869b = mVar;
    }

    public w a() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (w) (this.r.getNumberOfLayers() > 2 ? this.r.getDrawable(2) : this.r.getDrawable(1));
    }

    public i b() {
        return c(false);
    }

    public final i c(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (i) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final i d() {
        return c(true);
    }

    public void e(m mVar) {
        this.f3869b = mVar;
        if (b() != null) {
            i b2 = b();
            b2.f4024b.f4018a = mVar;
            b2.invalidateSelf();
        }
        if (d() != null) {
            i d2 = d();
            d2.f4024b.f4018a = mVar;
            d2.invalidateSelf();
        }
        if (a() != null) {
            a().setShapeAppearanceModel(mVar);
        }
    }

    public final void f() {
        i b2 = b();
        i d2 = d();
        if (b2 != null) {
            b2.s(this.h, this.k);
            if (d2 != null) {
                d2.r(this.h, this.n ? c.c.a.b.a.d(this.f3868a, R.attr.colorSurface) : 0);
            }
        }
    }
}
