package c.c.a.b.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* loaded from: classes.dex */
public class z extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f4126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f4128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f4129e;

    public z(a0 a0Var, int i, TextView textView, int i2, TextView textView2) {
        this.f4129e = a0Var;
        this.f4125a = i;
        this.f4126b = textView;
        this.f4127c = i2;
        this.f4128d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        TextView textView;
        a0 a0Var = this.f4129e;
        a0Var.i = this.f4125a;
        a0Var.g = null;
        TextView textView2 = this.f4126b;
        if (textView2 != null) {
            textView2.setVisibility(4);
            if (this.f4127c == 1 && (textView = this.f4129e.m) != null) {
                textView.setText((CharSequence) null);
            }
        }
        TextView textView3 = this.f4128d;
        if (textView3 != null) {
            textView3.setTranslationY(0.0f);
            this.f4128d.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        TextView textView = this.f4128d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
