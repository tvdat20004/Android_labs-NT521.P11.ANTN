package c.c.a.b.w;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f4099a;

    public i(j jVar) {
        this.f4099a = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f4099a.f4124c.setScaleX(floatValue);
        this.f4099a.f4124c.setScaleY(floatValue);
    }
}
