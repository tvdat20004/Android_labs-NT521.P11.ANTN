package b.r.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public class q extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1671a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1672b;

    public q(s sVar) {
        this.f1672b = sVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f1671a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f1671a) {
            this.f1671a = false;
            return;
        }
        if (((Float) this.f1672b.z.getAnimatedValue()).floatValue() == 0.0f) {
            s sVar = this.f1672b;
            sVar.A = 0;
            sVar.h(0);
        } else {
            s sVar2 = this.f1672b;
            sVar2.A = 2;
            sVar2.s.invalidate();
        }
    }
}
