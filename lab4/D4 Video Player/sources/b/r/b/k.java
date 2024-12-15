package b.r.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f1638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1640c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f1641d;

    public k(n nVar, l lVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1641d = nVar;
        this.f1638a = lVar;
        this.f1639b = viewPropertyAnimator;
        this.f1640c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f1639b.setListener(null);
        this.f1640c.setAlpha(1.0f);
        this.f1640c.setTranslationX(0.0f);
        this.f1640c.setTranslationY(0.0f);
        this.f1641d.c(this.f1638a.f1647b);
        this.f1641d.r.remove(this.f1638a.f1647b);
        this.f1641d.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        n nVar = this.f1641d;
        RecyclerView.a0 a0Var = this.f1638a.f1647b;
        Objects.requireNonNull(nVar);
    }
}
