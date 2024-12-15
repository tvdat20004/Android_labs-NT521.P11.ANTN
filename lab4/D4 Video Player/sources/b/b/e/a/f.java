package b.b.e.a;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* loaded from: classes.dex */
public class f implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public int[] f503a;

    /* renamed from: b, reason: collision with root package name */
    public int f504b;

    /* renamed from: c, reason: collision with root package name */
    public int f505c;

    public f(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.f504b = numberOfFrames;
        int[] iArr = this.f503a;
        if (iArr == null || iArr.length < numberOfFrames) {
            this.f503a = new int[numberOfFrames];
        }
        int[] iArr2 = this.f503a;
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
            iArr2[i2] = duration;
            i += duration;
        }
        this.f505c = i;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        int i = (int) ((f2 * this.f505c) + 0.5f);
        int i2 = this.f504b;
        int[] iArr = this.f503a;
        int i3 = 0;
        while (i3 < i2 && i >= iArr[i3]) {
            i -= iArr[i3];
            i3++;
        }
        return (i3 / i2) + (i3 < i2 ? i / this.f505c : 0.0f);
    }
}
