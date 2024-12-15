package b.m.a.a;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f1522a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1523b;

    public d(float[] fArr) {
        this.f1522a = fArr;
        this.f1523b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1522a;
        int min = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f1523b;
        float f4 = (f2 - (min * f3)) / f3;
        float[] fArr2 = this.f1522a;
        return ((fArr2[min + 1] - fArr2[min]) * f4) + fArr2[min];
    }
}
