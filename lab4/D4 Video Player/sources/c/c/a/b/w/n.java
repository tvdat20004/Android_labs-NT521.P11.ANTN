package c.c.a.b.w;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public class n implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f4108a;

    public n(x xVar) {
        this.f4108a = xVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4108a.f4124c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
