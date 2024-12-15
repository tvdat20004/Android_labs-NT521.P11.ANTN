package b.d.c;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f874a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f2, float f3, boolean z) {
        if (!z) {
            return f2;
        }
        return (float) (((1.0d - f874a) * f3) + f2);
    }

    public static float b(float f2, float f3, boolean z) {
        float f4 = f2 * 1.5f;
        if (!z) {
            return f4;
        }
        return (float) (((1.0d - f874a) * f3) + f4);
    }
}
