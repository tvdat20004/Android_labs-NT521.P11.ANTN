package b.l.b;

import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class k implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f1428b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f1429c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.h.f.a f1430d;

    public k(ViewGroup viewGroup, Fragment fragment, v vVar, b.h.f.a aVar) {
        this.f1427a = viewGroup;
        this.f1428b = fragment;
        this.f1429c = vVar;
        this.f1430d = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f1427a.post(new j(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
