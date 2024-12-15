package b.r.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.a0 f1626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1628c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1630e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f1631f;

    public i(n nVar, RecyclerView.a0 a0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1631f = nVar;
        this.f1626a = a0Var;
        this.f1627b = i;
        this.f1628c = view;
        this.f1629d = i2;
        this.f1630e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (this.f1627b != 0) {
            this.f1628c.setTranslationX(0.0f);
        }
        if (this.f1629d != 0) {
            this.f1628c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f1630e.setListener(null);
        this.f1631f.c(this.f1626a);
        this.f1631f.p.remove(this.f1626a);
        this.f1631f.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f1631f);
    }
}
