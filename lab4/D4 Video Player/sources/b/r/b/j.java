package b.r.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f1633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1634b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1635c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f1636d;

    public j(n nVar, l lVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1636d = nVar;
        this.f1633a = lVar;
        this.f1634b = viewPropertyAnimator;
        this.f1635c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f1634b.setListener(null);
        this.f1635c.setAlpha(1.0f);
        this.f1635c.setTranslationX(0.0f);
        this.f1635c.setTranslationY(0.0f);
        this.f1636d.c(this.f1633a.f1646a);
        this.f1636d.r.remove(this.f1633a.f1646a);
        this.f1636d.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        n nVar = this.f1636d;
        RecyclerView.a0 a0Var = this.f1633a.f1646a;
        Objects.requireNonNull(nVar);
    }
}
