package c.c.a.a.x1.v;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.WindowManager;
import c.c.a.a.b1;
import c.c.a.a.g1;
import c.c.a.a.r;
import c.c.a.a.x1.p;
import c.c.a.a.y0;
import c.c.a.a.z0;
import c.c.a.a.z1.l0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k extends GLSurfaceView {

    /* renamed from: b, reason: collision with root package name */
    public final SensorManager f3532b;

    /* renamed from: c, reason: collision with root package name */
    public final Sensor f3533c;

    /* renamed from: d, reason: collision with root package name */
    public final e f3534d;

    /* renamed from: e, reason: collision with root package name */
    public final j f3535e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f3536f;
    public final l g;
    public final h h;
    public SurfaceTexture i;
    public Surface j;
    public y0 k;

    public k(Context context) {
        super(context, null);
        this.f3536f = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        Objects.requireNonNull(systemService);
        SensorManager sensorManager = (SensorManager) systemService;
        this.f3532b = sensorManager;
        Sensor defaultSensor = l0.f3761a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f3533c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        h hVar = new h();
        this.h = hVar;
        j jVar = new j(this, hVar);
        this.f3535e = jVar;
        l lVar = new l(context, jVar, 25.0f);
        this.g = lVar;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Objects.requireNonNull(windowManager);
        this.f3534d = new e(windowManager.getDefaultDisplay(), lVar, jVar);
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(lVar);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3536f.post(new Runnable() { // from class: c.c.a.a.x1.v.c
            @Override // java.lang.Runnable
            public final void run() {
                k kVar = k.this;
                Surface surface = kVar.j;
                if (surface != null) {
                    y0 y0Var = kVar.k;
                    if (y0Var != null) {
                        g1 g1Var = (g1) y0Var;
                        g1Var.N();
                        if (surface == g1Var.o) {
                            g1Var.H(null);
                        }
                    }
                    SurfaceTexture surfaceTexture = kVar.i;
                    Surface surface2 = kVar.j;
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                    }
                    if (surface2 != null) {
                        surface2.release();
                    }
                    kVar.i = null;
                    kVar.j = null;
                }
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        if (this.f3533c != null) {
            this.f3532b.unregisterListener(this.f3534d);
        }
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        Sensor sensor = this.f3533c;
        if (sensor != null) {
            this.f3532b.registerListener(this.f3534d, sensor, 0);
        }
    }

    public void setDefaultStereoMode(int i) {
        this.h.k = i;
    }

    public void setSingleTapListener(i iVar) {
        this.g.h = iVar;
    }

    public void setVideoComponent(y0 y0Var) {
        y0 y0Var2 = this.k;
        if (y0Var == y0Var2) {
            return;
        }
        if (y0Var2 != null) {
            Surface surface = this.j;
            if (surface != null) {
                g1 g1Var = (g1) y0Var2;
                g1Var.N();
                if (surface == g1Var.o) {
                    g1Var.H(null);
                }
            }
            y0 y0Var3 = this.k;
            h hVar = this.h;
            g1 g1Var2 = (g1) y0Var3;
            g1Var2.N();
            if (g1Var2.y == hVar) {
                for (b1 b1Var : g1Var2.f2004b) {
                    if (((r) b1Var).f2682b == 2) {
                        z0 E = g1Var2.f2005c.E(b1Var);
                        E.e(6);
                        E.d(null);
                        E.c();
                    }
                }
            }
            y0 y0Var4 = this.k;
            h hVar2 = this.h;
            g1 g1Var3 = (g1) y0Var4;
            g1Var3.N();
            if (g1Var3.z == hVar2) {
                for (b1 b1Var2 : g1Var3.f2004b) {
                    if (((r) b1Var2).f2682b == 5) {
                        z0 E2 = g1Var3.f2005c.E(b1Var2);
                        E2.e(7);
                        E2.d(null);
                        E2.c();
                    }
                }
            }
        }
        this.k = y0Var;
        if (y0Var != null) {
            h hVar3 = this.h;
            g1 g1Var4 = (g1) y0Var;
            g1Var4.N();
            g1Var4.y = hVar3;
            for (b1 b1Var3 : g1Var4.f2004b) {
                if (((r) b1Var3).f2682b == 2) {
                    z0 E3 = g1Var4.f2005c.E(b1Var3);
                    E3.e(6);
                    p.g(!E3.h);
                    E3.f3714e = hVar3;
                    E3.c();
                }
            }
            y0 y0Var5 = this.k;
            h hVar4 = this.h;
            g1 g1Var5 = (g1) y0Var5;
            g1Var5.N();
            g1Var5.z = hVar4;
            for (b1 b1Var4 : g1Var5.f2004b) {
                if (((r) b1Var4).f2682b == 5) {
                    z0 E4 = g1Var5.f2005c.E(b1Var4);
                    E4.e(7);
                    p.g(!E4.h);
                    E4.f3714e = hVar4;
                    E4.c();
                }
            }
            ((g1) this.k).H(this.j);
        }
    }
}
