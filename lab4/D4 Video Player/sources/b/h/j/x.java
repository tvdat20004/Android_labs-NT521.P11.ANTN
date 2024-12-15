package b.h.j;

import android.animation.ValueAnimator;
import android.view.View;
import b.b.c.p0;

/* loaded from: classes.dex */
public class x implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f1317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1318b;

    public x(y yVar, p0 p0Var, View view) {
        this.f1317a = p0Var;
        this.f1318b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) this.f1317a.f473a.f482d.getParent()).invalidate();
    }
}
