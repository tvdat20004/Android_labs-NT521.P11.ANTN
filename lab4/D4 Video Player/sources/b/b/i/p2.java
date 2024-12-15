package b.b.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class p2 implements c1 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f760a;

    /* renamed from: b, reason: collision with root package name */
    public int f761b;

    /* renamed from: c, reason: collision with root package name */
    public View f762c;

    /* renamed from: d, reason: collision with root package name */
    public View f763d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f764e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f765f;
    public Drawable g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public boolean m;
    public m n;
    public int o;
    public Drawable p;

    public p2(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.o = 0;
        this.f760a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        l2 r = l2.r(toolbar.getContext(), null, b.b.b.f404a, R.attr.actionBarStyle, 0);
        int i = 15;
        this.p = r.g(15);
        if (z) {
            CharSequence o = r.o(27);
            if (!TextUtils.isEmpty(o)) {
                this.h = true;
                this.i = o;
                if ((this.f761b & 8) != 0) {
                    this.f760a.setTitle(o);
                }
            }
            CharSequence o2 = r.o(25);
            if (!TextUtils.isEmpty(o2)) {
                this.j = o2;
                if ((this.f761b & 8) != 0) {
                    this.f760a.setSubtitle(o2);
                }
            }
            Drawable g = r.g(20);
            if (g != null) {
                this.f765f = g;
                f();
            }
            Drawable g2 = r.g(17);
            if (g2 != null) {
                this.f764e = g2;
                f();
            }
            if (this.g == null && (drawable = this.p) != null) {
                this.g = drawable;
                e();
            }
            b(r.j(10, 0));
            int m = r.m(9, 0);
            if (m != 0) {
                View inflate = LayoutInflater.from(this.f760a.getContext()).inflate(m, (ViewGroup) this.f760a, false);
                View view = this.f763d;
                if (view != null && (this.f761b & 16) != 0) {
                    this.f760a.removeView(view);
                }
                this.f763d = inflate;
                if (inflate != null && (this.f761b & 16) != 0) {
                    this.f760a.addView(inflate);
                }
                b(this.f761b | 16);
            }
            int l = r.l(13, 0);
            if (l > 0) {
                ViewGroup.LayoutParams layoutParams = this.f760a.getLayoutParams();
                layoutParams.height = l;
                this.f760a.setLayoutParams(layoutParams);
            }
            int e2 = r.e(7, -1);
            int e3 = r.e(3, -1);
            if (e2 >= 0 || e3 >= 0) {
                Toolbar toolbar2 = this.f760a;
                int max = Math.max(e2, 0);
                int max2 = Math.max(e3, 0);
                toolbar2.d();
                toolbar2.u.a(max, max2);
            }
            int m2 = r.m(28, 0);
            if (m2 != 0) {
                Toolbar toolbar3 = this.f760a;
                Context context = toolbar3.getContext();
                toolbar3.m = m2;
                TextView textView = toolbar3.f124c;
                if (textView != null) {
                    textView.setTextAppearance(context, m2);
                }
            }
            int m3 = r.m(26, 0);
            if (m3 != 0) {
                Toolbar toolbar4 = this.f760a;
                Context context2 = toolbar4.getContext();
                toolbar4.n = m3;
                TextView textView2 = toolbar4.f125d;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, m3);
                }
            }
            int m4 = r.m(22, 0);
            if (m4 != 0) {
                this.f760a.setPopupTheme(m4);
            }
        } else {
            if (this.f760a.getNavigationIcon() != null) {
                this.p = this.f760a.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f761b = i;
        }
        r.f730b.recycle();
        if (R.string.abc_action_bar_up_description != this.o) {
            this.o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f760a.getNavigationContentDescription())) {
                int i2 = this.o;
                this.k = i2 != 0 ? a().getString(i2) : null;
                d();
            }
        }
        this.k = this.f760a.getNavigationContentDescription();
        this.f760a.setNavigationOnClickListener(new n2(this));
    }

    public Context a() {
        return this.f760a.getContext();
    }

    public void b(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f761b ^ i;
        this.f761b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    d();
                }
                e();
            }
            if ((i2 & 3) != 0) {
                f();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f760a.setTitle(this.i);
                    toolbar = this.f760a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.f760a.setTitle((CharSequence) null);
                    toolbar = this.f760a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f763d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f760a.addView(view);
            } else {
                this.f760a.removeView(view);
            }
        }
    }

    public b.h.j.y c(int i, long j) {
        b.h.j.y a2 = b.h.j.u.a(this.f760a);
        a2.a(i == 0 ? 1.0f : 0.0f);
        a2.c(j);
        o2 o2Var = new o2(this, i);
        View view = a2.f1319a.get();
        if (view != null) {
            a2.e(view, o2Var);
        }
        return a2;
    }

    public final void d() {
        if ((this.f761b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.f760a.setNavigationContentDescription(this.o);
            } else {
                this.f760a.setNavigationContentDescription(this.k);
            }
        }
    }

    public final void e() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f761b & 4) != 0) {
            toolbar = this.f760a;
            drawable = this.g;
            if (drawable == null) {
                drawable = this.p;
            }
        } else {
            toolbar = this.f760a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void f() {
        Drawable drawable;
        int i = this.f761b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f765f) == null) {
            drawable = this.f764e;
        }
        this.f760a.setLogo(drawable);
    }
}
