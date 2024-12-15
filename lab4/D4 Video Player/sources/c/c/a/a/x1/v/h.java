package c.c.a.a.x1.v;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.util.Log;
import c.c.a.a.x1.p;
import c.c.a.a.z1.j0;
import java.nio.IntBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h {
    public int i;
    public SurfaceTexture j;
    public byte[] m;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f3521a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f3522b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    public final g f3523c = new g();

    /* renamed from: d, reason: collision with root package name */
    public final c.c.a.a.a2.a0.b f3524d = new c.c.a.a.a2.a0.b();

    /* renamed from: e, reason: collision with root package name */
    public final j0<Long> f3525e = new j0<>();

    /* renamed from: f, reason: collision with root package name */
    public final j0<c.c.a.a.a2.a0.e> f3526f = new j0<>();
    public final float[] g = new float[16];
    public final float[] h = new float[16];
    public volatile int k = 0;
    public int l = -1;

    public SurfaceTexture a() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        p.e();
        g gVar = this.f3523c;
        Objects.requireNonNull(gVar);
        String[] strArr = g.j;
        String[] strArr2 = g.k;
        String join = TextUtils.join("\n", strArr);
        String join2 = TextUtils.join("\n", strArr2);
        int glCreateProgram = GLES20.glCreateProgram();
        p.e();
        p.a(35633, join, glCreateProgram);
        p.a(35632, join2, glCreateProgram);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            StringBuilder j = c.a.a.a.a.j("Unable to link shader program: \n");
            j.append(GLES20.glGetProgramInfoLog(glCreateProgram));
            Log.e("GlUtil", j.toString());
        }
        p.e();
        gVar.f3518d = glCreateProgram;
        gVar.f3519e = GLES20.glGetUniformLocation(glCreateProgram, "uMvpMatrix");
        gVar.f3520f = GLES20.glGetUniformLocation(gVar.f3518d, "uTexMatrix");
        gVar.g = GLES20.glGetAttribLocation(gVar.f3518d, "aPosition");
        gVar.h = GLES20.glGetAttribLocation(gVar.f3518d, "aTexCoords");
        gVar.i = GLES20.glGetUniformLocation(gVar.f3518d, "uTexture");
        p.e();
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr2));
        GLES20.glBindTexture(36197, iArr2[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        p.e();
        this.i = iArr2[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
        this.j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: c.c.a.a.x1.v.a
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                h.this.f3521a.set(true);
            }
        });
        return this.j;
    }
}
