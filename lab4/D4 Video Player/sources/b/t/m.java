package b.t;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class m extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final View f1757a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1758b = false;

    public m(View view) {
        this.f1757a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        q0.f1772a.e(this.f1757a, 1.0f);
        if (this.f1758b) {
            this.f1757a.setLayerType(0, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        View view = this.f1757a;
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        if (view.hasOverlappingRendering() && this.f1757a.getLayerType() == 0) {
            this.f1758b = true;
            this.f1757a.setLayerType(2, null);
        }
    }
}
