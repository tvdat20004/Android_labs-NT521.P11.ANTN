package c.c.a.a.x1.v;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* loaded from: classes.dex */
public final class e implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f3505a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f3506b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f3507c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f3508d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    public final Display f3509e;

    /* renamed from: f, reason: collision with root package name */
    public final d[] f3510f;
    public boolean g;

    public e(Display display, d... dVarArr) {
        this.f3509e = display;
        this.f3510f = dVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f3505a, sensorEvent.values);
        float[] fArr = this.f3505a;
        int rotation = this.f3509e.getRotation();
        if (rotation != 0) {
            int i = 130;
            int i2 = 129;
            if (rotation == 1) {
                i = 2;
            } else if (rotation == 2) {
                i2 = 130;
                i = 129;
            } else {
                if (rotation != 3) {
                    throw new IllegalStateException();
                }
                i2 = 1;
            }
            float[] fArr2 = this.f3506b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f3506b, i, i2, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f3505a, 1, 131, this.f3506b);
        SensorManager.getOrientation(this.f3506b, this.f3508d);
        float f2 = this.f3508d[2];
        Matrix.rotateM(this.f3505a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.f3505a;
        if (!this.g) {
            c.c.a.a.a2.a0.b.a(this.f3507c, fArr3);
            this.g = true;
        }
        float[] fArr4 = this.f3506b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.f3506b, 0, this.f3507c, 0);
        float[] fArr5 = this.f3505a;
        for (d dVar : this.f3510f) {
            dVar.a(fArr5, f2);
        }
    }
}
