package c.c.a.a.x1.v;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.view.Surface;
import c.c.a.a.g1;
import c.c.a.a.x1.p;
import c.c.a.a.y0;
import c.c.a.a.z1.j0;
import java.nio.Buffer;
import java.util.Objects;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public class j implements GLSurfaceView.Renderer, d {

    /* renamed from: b, reason: collision with root package name */
    public final h f3527b;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f3530e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f3531f;
    public final float[] g;
    public float h;
    public float i;
    public final /* synthetic */ k l;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f3528c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f3529d = new float[16];
    public final float[] j = new float[16];
    public final float[] k = new float[16];

    public j(k kVar, h hVar) {
        this.l = kVar;
        float[] fArr = new float[16];
        this.f3530e = fArr;
        float[] fArr2 = new float[16];
        this.f3531f = fArr2;
        float[] fArr3 = new float[16];
        this.g = fArr3;
        this.f3527b = hVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.i = 3.1415927f;
    }

    @Override // c.c.a.a.x1.v.d
    public synchronized void a(float[] fArr, float f2) {
        float[] fArr2 = this.f3530e;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        this.i = -f2;
        b();
    }

    public final void b() {
        Matrix.setRotateM(this.f3531f, 0, -this.h, (float) Math.cos(this.i), (float) Math.sin(this.i), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        Long d2;
        synchronized (this) {
            Matrix.multiplyMM(this.k, 0, this.f3530e, 0, this.g, 0);
            Matrix.multiplyMM(this.j, 0, this.f3531f, 0, this.k, 0);
        }
        Matrix.multiplyMM(this.f3529d, 0, this.f3528c, 0, this.j, 0);
        h hVar = this.f3527b;
        float[] fArr = this.f3529d;
        Objects.requireNonNull(hVar);
        GLES20.glClear(16384);
        p.e();
        if (hVar.f3521a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = hVar.j;
            Objects.requireNonNull(surfaceTexture);
            surfaceTexture.updateTexImage();
            p.e();
            if (hVar.f3522b.compareAndSet(true, false)) {
                Matrix.setIdentityM(hVar.g, 0);
            }
            long timestamp = hVar.j.getTimestamp();
            j0<Long> j0Var = hVar.f3525e;
            synchronized (j0Var) {
                d2 = j0Var.d(timestamp, false);
            }
            Long l = d2;
            if (l != null) {
                c.c.a.a.a2.a0.b bVar = hVar.f3524d;
                float[] fArr2 = hVar.g;
                float[] e2 = bVar.f1897c.e(l.longValue());
                if (e2 != null) {
                    float[] fArr3 = bVar.f1896b;
                    float f2 = e2[0];
                    float f3 = -e2[1];
                    float f4 = -e2[2];
                    float length = Matrix.length(f2, f3, f4);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr3, 0, (float) Math.toDegrees(length), f2 / length, f3 / length, f4 / length);
                    } else {
                        Matrix.setIdentityM(fArr3, 0);
                    }
                    if (!bVar.f1898d) {
                        c.c.a.a.a2.a0.b.a(bVar.f1895a, bVar.f1896b);
                        bVar.f1898d = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, bVar.f1895a, 0, bVar.f1896b, 0);
                }
            }
            c.c.a.a.a2.a0.e e3 = hVar.f3526f.e(timestamp);
            if (e3 != null) {
                g gVar = hVar.f3523c;
                Objects.requireNonNull(gVar);
                if (g.a(e3)) {
                    gVar.f3515a = e3.f1906c;
                    f fVar = new f(e3.f1904a.f1899a[0]);
                    gVar.f3516b = fVar;
                    if (!e3.f1907d) {
                        fVar = new f(e3.f1905b.f1899a[0]);
                    }
                    gVar.f3517c = fVar;
                }
            }
        }
        Matrix.multiplyMM(hVar.h, 0, fArr, 0, hVar.g, 0);
        g gVar2 = hVar.f3523c;
        int i = hVar.i;
        float[] fArr4 = hVar.h;
        f fVar2 = gVar2.f3516b;
        if (fVar2 == null) {
            return;
        }
        GLES20.glUseProgram(gVar2.f3518d);
        p.e();
        GLES20.glEnableVertexAttribArray(gVar2.g);
        GLES20.glEnableVertexAttribArray(gVar2.h);
        p.e();
        int i2 = gVar2.f3515a;
        GLES20.glUniformMatrix3fv(gVar2.f3520f, 1, false, i2 == 1 ? g.m : i2 == 2 ? g.o : g.l, 0);
        GLES20.glUniformMatrix4fv(gVar2.f3519e, 1, false, fArr4, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(gVar2.i, 0);
        p.e();
        GLES20.glVertexAttribPointer(gVar2.g, 3, 5126, false, 12, (Buffer) fVar2.f3512b);
        p.e();
        GLES20.glVertexAttribPointer(gVar2.h, 2, 5126, false, 8, (Buffer) fVar2.f3513c);
        p.e();
        GLES20.glDrawArrays(fVar2.f3514d, 0, fVar2.f3511a);
        p.e();
        GLES20.glDisableVertexAttribArray(gVar2.g);
        GLES20.glDisableVertexAttribArray(gVar2.h);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f2 = i / i2;
        Matrix.perspectiveM(this.f3528c, 0, f2 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2)) * 2.0d) : 90.0f, f2, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        final k kVar = this.l;
        final SurfaceTexture a2 = this.f3527b.a();
        kVar.f3536f.post(new Runnable() { // from class: c.c.a.a.x1.v.b
            @Override // java.lang.Runnable
            public final void run() {
                k kVar2 = k.this;
                SurfaceTexture surfaceTexture = a2;
                SurfaceTexture surfaceTexture2 = kVar2.i;
                Surface surface = kVar2.j;
                kVar2.i = surfaceTexture;
                Surface surface2 = new Surface(surfaceTexture);
                kVar2.j = surface2;
                y0 y0Var = kVar2.k;
                if (y0Var != null) {
                    ((g1) y0Var).H(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                }
            }
        });
    }
}
