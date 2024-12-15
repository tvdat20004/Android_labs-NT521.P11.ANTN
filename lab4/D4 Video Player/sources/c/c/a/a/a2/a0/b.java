package c.c.a.a.a2.a0;

import android.opengl.Matrix;
import c.c.a.a.z1.j0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f1895a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f1896b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final j0<float[]> f1897c = new j0<>();

    /* renamed from: d, reason: collision with root package name */
    public boolean f1898d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float sqrt = (float) Math.sqrt((fArr2[8] * fArr2[8]) + (fArr2[10] * fArr2[10]));
        fArr[0] = fArr2[10] / sqrt;
        fArr[2] = fArr2[8] / sqrt;
        fArr[8] = (-fArr2[8]) / sqrt;
        fArr[10] = fArr2[10] / sqrt;
    }
}
