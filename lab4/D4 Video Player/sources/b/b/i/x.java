package b.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f834a;

    /* renamed from: b, reason: collision with root package name */
    public j2 f835b;

    public x(ImageView imageView) {
        this.f834a = imageView;
    }

    public void a() {
        j2 j2Var;
        Drawable drawable = this.f834a.getDrawable();
        if (drawable != null) {
            int[] iArr = d1.f668a;
        }
        if (drawable == null || (j2Var = this.f835b) == null) {
            return;
        }
        u.f(drawable, j2Var, this.f834a.getDrawableState());
    }

    public void b(AttributeSet attributeSet, int i) {
        int m;
        Context context = this.f834a.getContext();
        int[] iArr = b.b.b.f409f;
        l2 r = l2.r(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f834a;
        b.h.j.u.h(imageView, imageView.getContext(), iArr, attributeSet, r.f730b, i, 0);
        try {
            Drawable drawable = this.f834a.getDrawable();
            if (drawable == null && (m = r.m(1, -1)) != -1 && (drawable = b.b.d.a.a.a(this.f834a.getContext(), m)) != null) {
                this.f834a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                int[] iArr2 = d1.f668a;
            }
            if (r.p(2)) {
                this.f834a.setImageTintList(r.c(2));
            }
            if (r.p(3)) {
                this.f834a.setImageTintMode(d1.c(r.j(3, -1), null));
            }
            r.f730b.recycle();
        } catch (Throwable th) {
            r.f730b.recycle();
            throw th;
        }
    }

    public void c(int i) {
        if (i != 0) {
            Drawable a2 = b.b.d.a.a.a(this.f834a.getContext(), i);
            if (a2 != null) {
                int[] iArr = d1.f668a;
            }
            this.f834a.setImageDrawable(a2);
        } else {
            this.f834a.setImageDrawable(null);
        }
        a();
    }

    public void d(ColorStateList colorStateList) {
        if (this.f835b == null) {
            this.f835b = new j2();
        }
        j2 j2Var = this.f835b;
        j2Var.f710a = colorStateList;
        j2Var.f713d = true;
        a();
    }

    public void e(PorterDuff.Mode mode) {
        if (this.f835b == null) {
            this.f835b = new j2();
        }
        j2 j2Var = this.f835b;
        j2Var.f711b = mode;
        j2Var.f712c = true;
        a();
    }
}
