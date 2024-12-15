package c.c.a.a.a2;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import c.c.a.a.z1.l0;
import java.util.Objects;

@TargetApi(17)
/* loaded from: classes.dex */
public final class n extends Surface {

    /* renamed from: d, reason: collision with root package name */
    public static int f1949d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f1950e;

    /* renamed from: b, reason: collision with root package name */
    public final m f1951b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1952c;

    public n(m mVar, SurfaceTexture surfaceTexture, boolean z, l lVar) {
        super(surfaceTexture);
        this.f1951b = mVar;
    }

    @TargetApi(24)
    public static int i(Context context) {
        String eglQueryString;
        int i = l0.f3761a;
        if (i < 26 && ("samsung".equals(l0.f3763c) || "XT1650".equals(l0.f3764d))) {
            return 0;
        }
        if ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
            return eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean j(Context context) {
        boolean z;
        synchronized (n.class) {
            if (!f1950e) {
                f1949d = l0.f3761a < 24 ? 0 : i(context);
                f1950e = true;
            }
            z = f1949d != 0;
        }
        return z;
    }

    public static n k(Context context, boolean z) {
        if (l0.f3761a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
        boolean z2 = false;
        c.c.a.a.x1.p.g(!z || j(context));
        m mVar = new m();
        int i = z ? f1949d : 0;
        mVar.start();
        Handler handler = new Handler(mVar.getLooper(), mVar);
        mVar.f1945c = handler;
        mVar.f1944b = new c.c.a.a.z1.m(handler);
        synchronized (mVar) {
            mVar.f1945c.obtainMessage(1, i, 0).sendToTarget();
            while (mVar.f1948f == null && mVar.f1947e == null && mVar.f1946d == null) {
                try {
                    mVar.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = mVar.f1947e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = mVar.f1946d;
        if (error != null) {
            throw error;
        }
        n nVar = mVar.f1948f;
        Objects.requireNonNull(nVar);
        return nVar;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f1951b) {
            if (!this.f1952c) {
                m mVar = this.f1951b;
                Objects.requireNonNull(mVar.f1945c);
                mVar.f1945c.sendEmptyMessage(2);
                this.f1952c = true;
            }
        }
    }
}
