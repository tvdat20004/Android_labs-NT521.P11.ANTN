package c.c.a.b.c;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public long f3817a;

    /* renamed from: b, reason: collision with root package name */
    public long f3818b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3819c;

    /* renamed from: d, reason: collision with root package name */
    public int f3820d;

    /* renamed from: e, reason: collision with root package name */
    public int f3821e;

    public d(long j, long j2) {
        this.f3817a = 0L;
        this.f3818b = 300L;
        this.f3819c = null;
        this.f3820d = 0;
        this.f3821e = 1;
        this.f3817a = j;
        this.f3818b = j2;
    }

    public d(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f3817a = 0L;
        this.f3818b = 300L;
        this.f3819c = null;
        this.f3820d = 0;
        this.f3821e = 1;
        this.f3817a = j;
        this.f3818b = j2;
        this.f3819c = timeInterpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(this.f3817a);
        animator.setDuration(this.f3818b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f3820d);
            valueAnimator.setRepeatMode(this.f3821e);
        }
    }

    public TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f3819c;
        return timeInterpolator != null ? timeInterpolator : a.f3810b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3817a == dVar.f3817a && this.f3818b == dVar.f3818b && this.f3820d == dVar.f3820d && this.f3821e == dVar.f3821e) {
            return b().getClass().equals(dVar.b().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j = this.f3817a;
        long j2 = this.f3818b;
        return ((((b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f3820d) * 31) + this.f3821e;
    }

    public String toString() {
        return '\n' + d.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3817a + " duration: " + this.f3818b + " interpolator: " + b().getClass() + " repeatCount: " + this.f3820d + " repeatMode: " + this.f3821e + "}\n";
    }
}
