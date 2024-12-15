package b.l.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f1436c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f1437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b.h.f.a f1438e;

    public l(ViewGroup viewGroup, View view, Fragment fragment, v vVar, b.h.f.a aVar) {
        this.f1434a = viewGroup;
        this.f1435b = view;
        this.f1436c = fragment;
        this.f1437d = vVar;
        this.f1438e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f1434a.endViewTransition(this.f1435b);
        Fragment fragment = this.f1436c;
        f fVar = fragment.H;
        Animator animator2 = fVar == null ? null : fVar.f1399b;
        fragment.i0(null);
        if (animator2 == null || this.f1434a.indexOfChild(this.f1435b) >= 0) {
            return;
        }
        this.f1437d.a(this.f1436c, this.f1438e);
    }
}
