package c.c.a.a;

import android.os.Handler;
import android.util.Log;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f3710a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f3711b;

    /* renamed from: c, reason: collision with root package name */
    public final k1 f3712c;

    /* renamed from: d, reason: collision with root package name */
    public int f3713d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3714e;

    /* renamed from: f, reason: collision with root package name */
    public Handler f3715f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;

    public z0(i0 i0Var, b1 b1Var, k1 k1Var, int i, Handler handler) {
        this.f3711b = i0Var;
        this.f3710a = b1Var;
        this.f3712c = k1Var;
        this.f3715f = handler;
        this.g = i;
    }

    public synchronized boolean a() {
        return false;
    }

    public synchronized void b(boolean z) {
        this.i = z | this.i;
        this.j = true;
        notifyAll();
    }

    public z0 c() {
        c.c.a.a.x1.p.g(!this.h);
        c.c.a.a.x1.p.c(true);
        this.h = true;
        i0 i0Var = this.f3711b;
        synchronized (i0Var) {
            if (i0Var.x) {
                Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                b(false);
            } else {
                i0Var.h.b(15, this).sendToTarget();
            }
        }
        return this;
    }

    public z0 d(Object obj) {
        c.c.a.a.x1.p.g(!this.h);
        this.f3714e = obj;
        return this;
    }

    public z0 e(int i) {
        c.c.a.a.x1.p.g(!this.h);
        this.f3713d = i;
        return this;
    }
}
