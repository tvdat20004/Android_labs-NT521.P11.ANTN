package c.c.a.b.w;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class j extends y {

    /* renamed from: d, reason: collision with root package name */
    public final TextWatcher f4103d;

    /* renamed from: e, reason: collision with root package name */
    public final View.OnFocusChangeListener f4104e;

    /* renamed from: f, reason: collision with root package name */
    public final TextInputLayout.f f4105f;
    public final TextInputLayout.g g;
    public AnimatorSet h;
    public ValueAnimator i;

    public j(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f4103d = new a(this);
        this.f4104e = new b(this);
        this.f4105f = new c(this);
        this.g = new d(this);
    }

    @Override // c.c.a.b.w.y
    public void a() {
        this.f4122a.setEndIconDrawable(b.b.d.a.a.a(this.f4123b, R.drawable.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f4122a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.f4122a.setEndIconOnClickListener(new e(this));
        this.f4122a.a(this.f4105f);
        this.f4122a.g0.add(this.g);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(c.c.a.b.c.a.f3812d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new i(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = c.c.a.b.c.a.f3809a;
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new h(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.h = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.h.addListener(new f(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new h(this));
        this.i = ofFloat3;
        ofFloat3.addListener(new g(this));
    }

    @Override // c.c.a.b.w.y
    public void c(boolean z) {
        if (this.f4122a.getSuffixText() == null) {
            return;
        }
        e(z);
    }

    public final void e(boolean z) {
        boolean z2 = this.f4122a.l() == z;
        if (z) {
            this.i.cancel();
            this.h.start();
            if (z2) {
                this.h.end();
                return;
            }
            return;
        }
        this.h.cancel();
        this.i.start();
        if (z2) {
            this.i.end();
        }
    }
}
