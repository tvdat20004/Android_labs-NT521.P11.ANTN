package c.c.a.a.z1;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

@TargetApi(17)
/* loaded from: classes.dex */
public final class m implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b, reason: collision with root package name */
    public final Handler f3767b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f3768c = new int[1];

    /* renamed from: d, reason: collision with root package name */
    public EGLDisplay f3769d;

    /* renamed from: e, reason: collision with root package name */
    public EGLContext f3770e;

    /* renamed from: f, reason: collision with root package name */
    public EGLSurface f3771f;
    public SurfaceTexture g;

    public m(Handler handler) {
        this.f3767b = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f3767b.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        SurfaceTexture surfaceTexture = this.g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
