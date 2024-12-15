package b.l.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public class y extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f1510c;

    public y(z zVar, ViewGroup viewGroup, View view, Fragment fragment) {
        this.f1508a = viewGroup;
        this.f1509b = view;
        this.f1510c = fragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f1508a.endViewTransition(this.f1509b);
        animator.removeListener(this);
        Fragment fragment = this.f1510c;
        View view = fragment.E;
        if (view == null || !fragment.y) {
            return;
        }
        view.setVisibility(8);
    }
}
