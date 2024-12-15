package c.c.a.a.a2;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import c.c.a.a.z1.l0;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public class m extends HandlerThread implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public c.c.a.a.z1.m f1944b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f1945c;

    /* renamed from: d, reason: collision with root package name */
    public Error f1946d;

    /* renamed from: e, reason: collision with root package name */
    public RuntimeException f1947e;

    /* renamed from: f, reason: collision with root package name */
    public n f1948f;

    public m() {
        super("dummySurface");
    }

    public final void a(int i) {
        EGLSurface eglCreatePbufferSurface;
        Objects.requireNonNull(this.f1944b);
        c.c.a.a.z1.m mVar = this.f1944b;
        Objects.requireNonNull(mVar);
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new c.c.a.a.z1.l("eglGetDisplay failed", null);
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            throw new c.c.a.a.z1.l("eglInitialize failed", null);
        }
        mVar.f3769d = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, c.c.a.a.z1.m.h, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (!eglChooseConfig || iArr2[0] <= 0 || eGLConfigArr[0] == null) {
            Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
            int i2 = l0.f3761a;
            throw new c.c.a.a.z1.l(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), null);
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(mVar.f3769d, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext == null) {
            throw new c.c.a.a.z1.l("eglCreateContext failed", null);
        }
        mVar.f3770e = eglCreateContext;
        EGLDisplay eGLDisplay = mVar.f3769d;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface == null) {
                throw new c.c.a.a.z1.l("eglCreatePbufferSurface failed", null);
            }
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
            throw new c.c.a.a.z1.l("eglMakeCurrent failed", null);
        }
        mVar.f3771f = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, mVar.f3768c, 0);
        c.c.a.a.x1.p.e();
        SurfaceTexture surfaceTexture = new SurfaceTexture(mVar.f3768c[0]);
        mVar.g = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(mVar);
        SurfaceTexture surfaceTexture2 = this.f1944b.g;
        Objects.requireNonNull(surfaceTexture2);
        this.f1948f = new n(this, surfaceTexture2, i != 0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        Objects.requireNonNull(this.f1944b);
        c.c.a.a.z1.m mVar = this.f1944b;
        mVar.f3767b.removeCallbacks(mVar);
        try {
            SurfaceTexture surfaceTexture = mVar.g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, mVar.f3768c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = mVar.f3769d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = mVar.f3769d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = mVar.f3771f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(mVar.f3769d, mVar.f3771f);
            }
            EGLContext eGLContext = mVar.f3770e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(mVar.f3769d, eGLContext);
            }
            if (l0.f3761a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = mVar.f3769d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(mVar.f3769d);
            }
            mVar.f3769d = null;
            mVar.f3770e = null;
            mVar.f3771f = null;
            mVar.g = null;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                this.f1946d = e2;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e3) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e3);
                this.f1947e = e3;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
