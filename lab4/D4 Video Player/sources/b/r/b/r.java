package b.r.b;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public class r implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f1673a;

    public r(s sVar) {
        this.f1673a = sVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.f1673a.f1676c.setAlpha(floatValue);
        this.f1673a.f1677d.setAlpha(floatValue);
        this.f1673a.s.invalidate();
    }
}
