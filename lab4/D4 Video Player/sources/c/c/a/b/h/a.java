package c.c.a.b.h;

import android.animation.ValueAnimator;
import c.c.a.b.u.i;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f3866a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f3866a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        i iVar = this.f3866a.i;
        if (iVar != null) {
            iVar.q(floatValue);
        }
    }
}
