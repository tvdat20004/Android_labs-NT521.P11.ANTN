package b.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final View f746a;

    /* renamed from: d, reason: collision with root package name */
    public j2 f749d;

    /* renamed from: e, reason: collision with root package name */
    public j2 f750e;

    /* renamed from: f, reason: collision with root package name */
    public j2 f751f;

    /* renamed from: c, reason: collision with root package name */
    public int f748c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final u f747b = u.a();

    public o(View view) {
        this.f746a = view;
    }

    public void a() {
        Drawable background = this.f746a.getBackground();
        if (background != null) {
            boolean z = true;
            if (this.f749d != null) {
                if (this.f751f == null) {
                    this.f751f = new j2();
                }
                j2 j2Var = this.f751f;
                j2Var.f710a = null;
                j2Var.f713d = false;
                j2Var.f711b = null;
                j2Var.f712c = false;
                View view = this.f746a;
                WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    j2Var.f713d = true;
                    j2Var.f710a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = this.f746a.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    j2Var.f712c = true;
                    j2Var.f711b = backgroundTintMode;
                }
                if (j2Var.f713d || j2Var.f712c) {
                    u.f(background, j2Var, this.f746a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            j2 j2Var2 = this.f750e;
            if (j2Var2 != null) {
                u.f(background, j2Var2, this.f746a.getDrawableState());
                return;
            }
            j2 j2Var3 = this.f749d;
            if (j2Var3 != null) {
                u.f(background, j2Var3, this.f746a.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        j2 j2Var = this.f750e;
        if (j2Var != null) {
            return j2Var.f710a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        j2 j2Var = this.f750e;
        if (j2Var != null) {
            return j2Var.f711b;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i) {
        Context context = this.f746a.getContext();
        int[] iArr = b.b.b.A;
        l2 r = l2.r(context, attributeSet, iArr, i, 0);
        View view = this.f746a;
        b.h.j.u.h(view, view.getContext(), iArr, attributeSet, r.f730b, i, 0);
        try {
            if (r.p(0)) {
                this.f748c = r.m(0, -1);
                ColorStateList d2 = this.f747b.d(this.f746a.getContext(), this.f748c);
                if (d2 != null) {
                    g(d2);
                }
            }
            if (r.p(1)) {
                this.f746a.setBackgroundTintList(r.c(1));
            }
            if (r.p(2)) {
                this.f746a.setBackgroundTintMode(d1.c(r.j(2, -1), null));
            }
            r.f730b.recycle();
        } catch (Throwable th) {
            r.f730b.recycle();
            throw th;
        }
    }

    public void e() {
        this.f748c = -1;
        g(null);
        a();
    }

    public void f(int i) {
        this.f748c = i;
        u uVar = this.f747b;
        g(uVar != null ? uVar.d(this.f746a.getContext(), i) : null);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f749d == null) {
                this.f749d = new j2();
            }
            j2 j2Var = this.f749d;
            j2Var.f710a = colorStateList;
            j2Var.f713d = true;
        } else {
            this.f749d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (this.f750e == null) {
            this.f750e = new j2();
        }
        j2 j2Var = this.f750e;
        j2Var.f710a = colorStateList;
        j2Var.f713d = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.f750e == null) {
            this.f750e = new j2();
        }
        j2 j2Var = this.f750e;
        j2Var.f711b = mode;
        j2Var.f712c = true;
        a();
    }
}
