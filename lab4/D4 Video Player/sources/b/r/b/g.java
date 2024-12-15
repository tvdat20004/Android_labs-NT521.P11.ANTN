package b.r.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.a0 f1617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1618b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1619c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f1620d;

    public g(n nVar, RecyclerView.a0 a0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1620d = nVar;
        this.f1617a = a0Var;
        this.f1618b = viewPropertyAnimator;
        this.f1619c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f1618b.setListener(null);
        this.f1619c.setAlpha(1.0f);
        this.f1620d.c(this.f1617a);
        this.f1620d.q.remove(this.f1617a);
        this.f1620d.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f1620d);
    }
}
