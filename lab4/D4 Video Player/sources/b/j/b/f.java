package b.j.b;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class f implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        float f3 = f2 - 1.0f;
        return (f3 * f3 * f3 * f3 * f3) + 1.0f;
    }
}
