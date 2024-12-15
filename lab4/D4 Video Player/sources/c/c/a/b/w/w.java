package c.c.a.b.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public class w extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f4118a;

    public w(x xVar) {
        this.f4118a = xVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        x xVar = this.f4118a;
        xVar.f4124c.setChecked(xVar.j);
        this.f4118a.p.start();
    }
}
