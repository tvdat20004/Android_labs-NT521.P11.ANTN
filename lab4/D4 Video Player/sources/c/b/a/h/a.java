package c.b.a.h;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* loaded from: classes.dex */
public class a implements GLSurfaceView.EGLConfigChooser {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1881a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1882b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1883c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1884d;

    public a() {
        int[] iArr = new int[15];
        System.arraycopy(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, 0, iArr, 0, 12);
        iArr[12] = 12352;
        iArr[13] = 4;
        iArr[14] = 12344;
        this.f1881a = iArr;
        this.f1882b = 8;
        this.f1883c = 8;
        this.f1884d = 8;
    }

    public final int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        int[] iArr = new int[1];
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr) ? iArr[0] : i2;
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        int[] iArr = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, this.f1881a, null, 0, iArr)) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int i = iArr[0];
        if (i <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        if (!egl10.eglChooseConfig(eGLDisplay, this.f1881a, eGLConfigArr, i, iArr)) {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                eGLConfig = null;
                break;
            }
            eGLConfig = eGLConfigArr[i2];
            int a2 = a(egl10, eGLDisplay, eGLConfig, 12325, 0);
            int a3 = a(egl10, eGLDisplay, eGLConfig, 12326, 0);
            if (a2 >= 0 && a3 >= 0) {
                int a4 = a(egl10, eGLDisplay, eGLConfig, 12324, 0);
                int a5 = a(egl10, eGLDisplay, eGLConfig, 12323, 0);
                int a6 = a(egl10, eGLDisplay, eGLConfig, 12322, 0);
                int a7 = a(egl10, eGLDisplay, eGLConfig, 12321, 0);
                if (a4 == this.f1882b && a5 == this.f1883c && a6 == this.f1884d && a7 == 0) {
                    break;
                }
            }
            i2++;
        }
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new IllegalArgumentException("No config chosen");
    }
}
