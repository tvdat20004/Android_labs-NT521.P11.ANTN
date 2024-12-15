package c.c.a.a.a2;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.WindowManager;
import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final WindowManager f1966a;

    /* renamed from: b, reason: collision with root package name */
    public final u f1967b;

    /* renamed from: c, reason: collision with root package name */
    public final t f1968c;

    /* renamed from: d, reason: collision with root package name */
    public long f1969d;

    /* renamed from: e, reason: collision with root package name */
    public long f1970e;

    /* renamed from: f, reason: collision with root package name */
    public long f1971f;
    public long g;
    public long h;
    public boolean i;
    public long j;
    public long k;
    public long l;

    public v(Context context) {
        DisplayManager displayManager;
        t tVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f1966a = (WindowManager) context.getSystemService("window");
        } else {
            this.f1966a = null;
        }
        if (this.f1966a != null) {
            if (l0.f3761a >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                tVar = new t(this, displayManager);
            }
            this.f1968c = tVar;
            this.f1967b = u.g;
        } else {
            this.f1968c = null;
            this.f1967b = null;
        }
        this.f1969d = -9223372036854775807L;
        this.f1970e = -9223372036854775807L;
    }

    public final boolean a(long j, long j2) {
        return Math.abs((j2 - this.j) - (j - this.k)) > 20000000;
    }

    public final void b() {
        if (this.f1966a.getDefaultDisplay() != null) {
            long refreshRate = (long) (1.0E9d / r0.getRefreshRate());
            this.f1969d = refreshRate;
            this.f1970e = (refreshRate * 80) / 100;
        }
    }
}
