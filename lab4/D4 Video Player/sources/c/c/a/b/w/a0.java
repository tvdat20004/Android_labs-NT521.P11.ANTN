package c.c.a.b.w;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4079a;

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f4080b;

    /* renamed from: c, reason: collision with root package name */
    public LinearLayout f4081c;

    /* renamed from: d, reason: collision with root package name */
    public int f4082d;

    /* renamed from: e, reason: collision with root package name */
    public FrameLayout f4083e;

    /* renamed from: f, reason: collision with root package name */
    public int f4084f;
    public Animator g;
    public final float h;
    public int i;
    public int j;
    public CharSequence k;
    public boolean l;
    public TextView m;
    public CharSequence n;
    public int o;
    public ColorStateList p;
    public CharSequence q;
    public boolean r;
    public TextView s;
    public int t;
    public ColorStateList u;
    public Typeface v;

    public a0(TextInputLayout textInputLayout) {
        this.f4079a = textInputLayout.getContext();
        this.f4080b = textInputLayout;
        this.h = r0.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public void a(TextView textView, int i) {
        if (this.f4081c == null && this.f4083e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f4079a);
            this.f4081c = linearLayout;
            linearLayout.setOrientation(0);
            this.f4080b.addView(this.f4081c, -1, -2);
            this.f4083e = new FrameLayout(this.f4079a);
            this.f4081c.addView(this.f4083e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f4080b.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f4083e.setVisibility(0);
            this.f4083e.addView(textView);
            this.f4084f++;
        } else {
            this.f4081c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f4081c.setVisibility(0);
        this.f4082d++;
    }

    public void b() {
        if ((this.f4081c == null || this.f4080b.getEditText() == null) ? false : true) {
            LinearLayout linearLayout = this.f4081c;
            EditText editText = this.f4080b.getEditText();
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            linearLayout.setPaddingRelative(editText.getPaddingStart(), 0, this.f4080b.getEditText().getPaddingEnd(), 0);
        }
    }

    public void c() {
        Animator animator = this.g;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, i3 == i ? 1.0f : 0.0f);
            ofFloat.setDuration(167L);
            ofFloat.setInterpolator(c.c.a.b.c.a.f3809a);
            list.add(ofFloat);
            if (i3 == i) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.h, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(c.c.a.b.c.a.f3812d);
                list.add(ofFloat2);
            }
        }
    }

    public boolean e() {
        return (this.j != 1 || this.m == null || TextUtils.isEmpty(this.k)) ? false : true;
    }

    public final TextView f(int i) {
        if (i == 1) {
            return this.m;
        }
        if (i != 2) {
            return null;
        }
        return this.s;
    }

    public int g() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public void h() {
        this.k = null;
        c();
        if (this.i == 1) {
            this.j = (!this.r || TextUtils.isEmpty(this.q)) ? 0 : 2;
        }
        k(this.i, this.j, j(this.m, null));
    }

    public void i(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f4081c;
        if (linearLayout == null) {
            return;
        }
        if (!(i == 0 || i == 1) || (frameLayout = this.f4083e) == null) {
            linearLayout.removeView(textView);
        } else {
            int i2 = this.f4084f - 1;
            this.f4084f = i2;
            if (i2 == 0) {
                frameLayout.setVisibility(8);
            }
            this.f4083e.removeView(textView);
        }
        int i3 = this.f4082d - 1;
        this.f4082d = i3;
        LinearLayout linearLayout2 = this.f4081c;
        if (i3 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean j(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f4080b;
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        return textInputLayout.isLaidOut() && this.f4080b.isEnabled() && !(this.j == this.i && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void k(int i, int i2, boolean z) {
        TextView f2;
        TextView f3;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.g = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.r, this.s, 2, i, i2);
            d(arrayList, this.l, this.m, 1, i, i2);
            c.c.a.b.a.j(animatorSet, arrayList);
            animatorSet.addListener(new z(this, i2, f(i), i, f(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (f3 = f(i2)) != null) {
                f3.setVisibility(0);
                f3.setAlpha(1.0f);
            }
            if (i != 0 && (f2 = f(i)) != null) {
                f2.setVisibility(4);
                if (i == 1) {
                    f2.setText((CharSequence) null);
                }
            }
            this.i = i2;
        }
        this.f4080b.v();
        this.f4080b.y(z, false);
        this.f4080b.F();
    }
}
