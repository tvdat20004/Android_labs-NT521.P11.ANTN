package c.b.a;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import android.view.Surface;
import b.q.u;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public abstract class a implements GLSurfaceView.Renderer {

    /* renamed from: b, reason: collision with root package name */
    public b f1859b;

    /* renamed from: c, reason: collision with root package name */
    public c.b.a.j.a f1860c;

    /* renamed from: d, reason: collision with root package name */
    public final Queue<Runnable> f1861d = new LinkedList();

    public void finalize() {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this.f1861d) {
            while (!this.f1861d.isEmpty()) {
                this.f1861d.poll().run();
            }
        }
        this.f1859b.a();
        b bVar = this.f1859b;
        GLES20.glViewport(0, 0, bVar.f1862a, bVar.f1863b);
        b bVar2 = this.f1859b;
        d dVar = (d) this;
        synchronized (dVar) {
            if (dVar.f1870f) {
                dVar.f1869e.f1875b.updateTexImage();
                f fVar = dVar.f1869e;
                fVar.f1875b.getTransformMatrix(dVar.l);
                dVar.f1870f = false;
            }
        }
        if (dVar.p) {
            c.b.a.j.a aVar = dVar.o;
            if (aVar != null) {
                aVar.f();
                dVar.o.e(bVar2.f1862a, bVar2.f1863b);
            }
            dVar.p = false;
        }
        if (dVar.o != null) {
            dVar.m.a();
            b bVar3 = dVar.m;
            GLES20.glViewport(0, 0, bVar3.f1862a, bVar3.f1863b);
        }
        GLES20.glClear(16384);
        Matrix.multiplyMM(dVar.h, 0, dVar.k, 0, dVar.j, 0);
        float[] fArr = dVar.h;
        Matrix.multiplyMM(fArr, 0, dVar.i, 0, fArr, 0);
        c.b.a.j.b bVar4 = dVar.n;
        int i = dVar.g;
        float[] fArr2 = dVar.h;
        float[] fArr3 = dVar.l;
        float f2 = dVar.r;
        GLES20.glUseProgram(bVar4.f1887d);
        GLES20.glUniformMatrix4fv(bVar4.c("uMVPMatrix"), 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(bVar4.c("uSTMatrix"), 1, false, fArr3, 0);
        GLES20.glUniform1f(bVar4.c("uCRatio"), f2);
        GLES20.glBindBuffer(34962, bVar4.g);
        GLES20.glEnableVertexAttribArray(bVar4.c("aPosition"));
        GLES20.glVertexAttribPointer(bVar4.c("aPosition"), 3, 5126, false, 20, 0);
        GLES20.glEnableVertexAttribArray(bVar4.c("aTextureCoord"));
        GLES20.glVertexAttribPointer(bVar4.c("aTextureCoord"), 2, 5126, false, 20, 12);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(bVar4.j, i);
        GLES20.glUniform1i(bVar4.c("sTexture"), 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(bVar4.c("aPosition"));
        GLES20.glDisableVertexAttribArray(bVar4.c("aTextureCoord"));
        GLES20.glBindBuffer(34962, 0);
        GLES20.glBindTexture(3553, 0);
        if (dVar.o != null) {
            bVar2.a();
            GLES20.glClear(16384);
            dVar.o.b(dVar.m.f1866e, bVar2);
        }
        GLES20.glBindFramebuffer(36160, 0);
        b bVar5 = this.f1859b;
        GLES20.glViewport(0, 0, bVar5.f1862a, bVar5.f1863b);
        GLES20.glClear(16640);
        this.f1860c.b(this.f1859b.f1866e, null);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f1859b.c(i, i2);
        this.f1860c.e(i, i2);
        d dVar = (d) this;
        Log.d(d.t, "onSurfaceChanged width = " + i + "  height = " + i2);
        dVar.m.c(i, i2);
        Objects.requireNonNull(dVar.n);
        c.b.a.j.a aVar = dVar.o;
        if (aVar != null) {
            aVar.e(i, i2);
        }
        float f2 = i / i2;
        dVar.r = f2;
        Matrix.frustumM(dVar.i, 0, -f2, f2, -1.0f, 1.0f, 5.0f, 7.0f);
        Matrix.setIdentityM(dVar.j, 0);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f1859b = new b();
        c.b.a.j.a aVar = new c.b.a.j.a();
        this.f1860c = aVar;
        aVar.f();
        d dVar = (d) this;
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        dVar.g = i;
        f fVar = new f(i);
        dVar.f1869e = fVar;
        fVar.f1876c = dVar;
        GLES20.glBindTexture(36197, dVar.g);
        Objects.requireNonNull(dVar.f1869e);
        u.r(36197, 9729, 9728);
        GLES20.glBindTexture(3553, 0);
        dVar.m = new b();
        Objects.requireNonNull(dVar.f1869e);
        c.b.a.j.b bVar = new c.b.a.j.b(36197);
        dVar.n = bVar;
        bVar.f();
        dVar.s.H(new Surface(dVar.f1869e.f1875b));
        Matrix.setLookAtM(dVar.k, 0, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        synchronized (dVar) {
            dVar.f1870f = false;
        }
        if (dVar.o != null) {
            dVar.p = true;
        }
        GLES20.glGetIntegerv(3379, iArr, 0);
    }
}
