package c.c.a.b.w;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f4097a;

    public h(j jVar) {
        this.f4097a = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4097a.f4124c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
