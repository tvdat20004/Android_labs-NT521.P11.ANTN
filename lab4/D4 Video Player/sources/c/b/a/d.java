package c.b.a;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import c.c.a.a.g1;

/* loaded from: classes.dex */
public class d extends a implements SurfaceTexture.OnFrameAvailableListener {
    public static final String t = d.class.getSimpleName();

    /* renamed from: e, reason: collision with root package name */
    public f f1869e;
    public int g;
    public float[] l;
    public b m;
    public c.b.a.j.b n;
    public c.b.a.j.a o;
    public boolean p;
    public final e q;
    public g1 s;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1870f = false;
    public float[] h = new float[16];
    public float[] i = new float[16];
    public float[] j = new float[16];
    public float[] k = new float[16];
    public float r = 1.0f;

    public d(e eVar) {
        float[] fArr = new float[16];
        this.l = fArr;
        Matrix.setIdentityM(fArr, 0);
        this.q = eVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f1870f = true;
        this.q.requestRender();
    }
}
