package c.c.a.a.y1;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class p0 implements r0 {

    /* renamed from: d, reason: collision with root package name */
    public static final j0 f3646d = new j0(2, -9223372036854775807L, null);

    /* renamed from: e, reason: collision with root package name */
    public static final j0 f3647e = new j0(3, -9223372036854775807L, null);

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f3648a;

    /* renamed from: b, reason: collision with root package name */
    public k0<? extends l0> f3649b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f3650c;

    public p0(final String str) {
        int i = c.c.a.a.z1.l0.f3761a;
        this.f3648a = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: c.c.a.a.z1.d
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }

    public static j0 c(boolean z, long j) {
        return new j0(z ? 1 : 0, j, null);
    }

    @Override // c.c.a.a.y1.r0
    public void a() {
        e(Integer.MIN_VALUE);
    }

    public void b() {
        this.f3649b.a(false);
    }

    public boolean d() {
        return this.f3649b != null;
    }

    public void e(int i) {
        IOException iOException = this.f3650c;
        if (iOException != null) {
            throw iOException;
        }
        k0<? extends l0> k0Var = this.f3649b;
        if (k0Var != null) {
            if (i == Integer.MIN_VALUE) {
                i = k0Var.f3632b;
            }
            IOException iOException2 = k0Var.f3636f;
            if (iOException2 != null && k0Var.g > i) {
                throw iOException2;
            }
        }
    }

    public void f(m0 m0Var) {
        k0<? extends l0> k0Var = this.f3649b;
        if (k0Var != null) {
            k0Var.a(true);
        }
        if (m0Var != null) {
            this.f3648a.execute(new n0(m0Var));
        }
        this.f3648a.shutdown();
    }

    public <T extends l0> long g(T t, i0<T> i0Var, int i) {
        Looper myLooper = Looper.myLooper();
        c.c.a.a.x1.p.g(myLooper != null);
        this.f3650c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new k0(this, myLooper, t, i0Var, i, elapsedRealtime).b(0L);
        return elapsedRealtime;
    }
}
