package b.l.b;

import android.animation.Animator;
import android.view.animation.Animation;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final Animation f1441a;

    /* renamed from: b, reason: collision with root package name */
    public final Animator f1442b;

    public m(Animator animator) {
        this.f1441a = null;
        this.f1442b = animator;
    }

    public m(Animation animation) {
        this.f1441a = animation;
        this.f1442b = null;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }
}
