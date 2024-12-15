package b.b.e.a;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* loaded from: classes.dex */
public class e extends g {

    /* renamed from: a, reason: collision with root package name */
    public final ObjectAnimator f501a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f502b;

    public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        super(null);
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        f fVar = new f(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(fVar.f505c);
        ofInt.setInterpolator(fVar);
        this.f502b = z2;
        this.f501a = ofInt;
    }

    @Override // b.b.e.a.g
    public boolean a() {
        return this.f502b;
    }

    @Override // b.b.e.a.g
    public void b() {
        this.f501a.reverse();
    }

    @Override // b.b.e.a.g
    public void c() {
        this.f501a.start();
    }

    @Override // b.b.e.a.g
    public void d() {
        this.f501a.cancel();
    }
}
