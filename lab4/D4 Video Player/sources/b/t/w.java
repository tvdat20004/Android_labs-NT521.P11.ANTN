package b.t;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public class w extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.e.b f1778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f1779b;

    public w(b0 b0Var, b.e.b bVar) {
        this.f1779b = b0Var;
        this.f1778a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f1778a.remove(animator);
        this.f1779b.n.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f1779b.n.add(animator);
    }
}
