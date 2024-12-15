package b.l.b;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public class n extends AnimationSet implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f1449b;

    /* renamed from: c, reason: collision with root package name */
    public final View f1450c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1451d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1452e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1453f;

    public n(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1453f = true;
        this.f1449b = viewGroup;
        this.f1450c = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public boolean getTransformation(long j, Transformation transformation) {
        this.f1453f = true;
        if (this.f1451d) {
            return !this.f1452e;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f1451d = true;
            b.h.j.l.a(this.f1449b, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public boolean getTransformation(long j, Transformation transformation, float f2) {
        this.f1453f = true;
        if (this.f1451d) {
            return !this.f1452e;
        }
        if (!super.getTransformation(j, transformation, f2)) {
            this.f1451d = true;
            b.h.j.l.a(this.f1449b, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f1451d || !this.f1453f) {
            this.f1449b.endViewTransition(this.f1450c);
            this.f1452e = true;
        } else {
            this.f1453f = false;
            this.f1449b.post(this);
        }
    }
}
