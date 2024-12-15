package b.t;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class y0 extends AnimatorListenerAdapter implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f1792a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1793b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f1794c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1795d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1796e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1797f = false;

    public y0(View view, int i, boolean z) {
        this.f1792a = view;
        this.f1793b = i;
        this.f1794c = (ViewGroup) view.getParent();
        this.f1795d = z;
        g(true);
    }

    @Override // b.t.a0
    public void a(b0 b0Var) {
        g(false);
    }

    @Override // b.t.a0
    public void b(b0 b0Var) {
        g(true);
    }

    @Override // b.t.a0
    public void c(b0 b0Var) {
    }

    @Override // b.t.a0
    public void d(b0 b0Var) {
    }

    @Override // b.t.a0
    public void e(b0 b0Var) {
        f();
        b0Var.v(this);
    }

    public final void f() {
        if (!this.f1797f) {
            q0.f1772a.f(this.f1792a, this.f1793b);
            ViewGroup viewGroup = this.f1794c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    public final void g(boolean z) {
        ViewGroup viewGroup;
        if (!this.f1795d || this.f1796e == z || (viewGroup = this.f1794c) == null) {
            return;
        }
        this.f1796e = z;
        n0.a(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f1797f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        f();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(Animator animator) {
        if (this.f1797f) {
            return;
        }
        q0.f1772a.f(this.f1792a, this.f1793b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(Animator animator) {
        if (this.f1797f) {
            return;
        }
        q0.f1772a.f(this.f1792a, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
