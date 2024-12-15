package c.c.a.b.p;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* loaded from: classes.dex */
public class n implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f3977a;

    public n(o oVar, TextView textView) {
        this.f3977a = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f3977a.setScaleX(floatValue);
        this.f3977a.setScaleY(floatValue);
    }
}
