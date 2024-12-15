package b.r.b;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1665b;

    public o(s sVar) {
        this.f1665b = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        s sVar = this.f1665b;
        int i = sVar.A;
        if (i == 1) {
            sVar.z.cancel();
        } else if (i != 2) {
            return;
        }
        sVar.A = 3;
        ValueAnimator valueAnimator = sVar.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        sVar.z.setDuration(500);
        sVar.z.start();
    }
}
