package c.c.a.a.y1;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import c.c.a.a.y1.l0;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class k0<T extends l0> extends Handler implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final int f3632b;

    /* renamed from: c, reason: collision with root package name */
    public final T f3633c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3634d;

    /* renamed from: e, reason: collision with root package name */
    public i0<T> f3635e;

    /* renamed from: f, reason: collision with root package name */
    public IOException f3636f;
    public int g;
    public volatile Thread h;
    public volatile boolean i;
    public volatile boolean j;
    public final /* synthetic */ p0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p0 p0Var, Looper looper, T t, i0<T> i0Var, int i, long j) {
        super(looper);
        this.k = p0Var;
        this.f3633c = t;
        this.f3635e = i0Var;
        this.f3632b = i;
        this.f3634d = j;
    }

    public void a(boolean z) {
        this.j = z;
        this.f3636f = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.i = true;
            this.f3633c.b();
            if (this.h != null) {
                this.h.interrupt();
            }
        }
        if (z) {
            this.k.f3649b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f3635e.p(this.f3633c, elapsedRealtime, elapsedRealtime - this.f3634d, true);
            this.f3635e = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(long j) {
        c.c.a.a.x1.p.g(this.k.f3649b == null);
        p0 p0Var = this.k;
        p0Var.f3649b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            this.f3636f = null;
            p0Var.f3648a.execute(this);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (this.j) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            this.f3636f = null;
            p0 p0Var = this.k;
            p0Var.f3648a.execute(p0Var.f3649b);
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.k.f3649b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.f3634d;
        if (this.i) {
            this.f3635e.p(this.f3633c, elapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            this.f3635e.p(this.f3633c, elapsedRealtime, j, false);
            return;
        }
        if (i2 == 2) {
            try {
                this.f3635e.l(this.f3633c, elapsedRealtime, j);
                return;
            } catch (RuntimeException e2) {
                Log.e("LoadTask", "Unexpected exception handling load completed", e2);
                this.k.f3650c = new o0(e2);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f3636f = iOException;
        int i3 = this.g + 1;
        this.g = i3;
        j0 i4 = this.f3635e.i(this.f3633c, elapsedRealtime, j, iOException, i3);
        int i5 = i4.f3628a;
        if (i5 == 3) {
            this.k.f3650c = this.f3636f;
        } else if (i5 != 2) {
            if (i5 == 1) {
                this.g = 1;
            }
            long j2 = i4.f3629b;
            if (j2 == -9223372036854775807L) {
                j2 = Math.min((this.g - 1) * 1000, 5000);
            }
            b(j2);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Object e2;
        try {
            this.h = Thread.currentThread();
            if (!this.i) {
                c.c.a.a.x1.p.b("load:" + this.f3633c.getClass().getSimpleName());
                try {
                    this.f3633c.a();
                    c.c.a.a.x1.p.j();
                } catch (Throwable th) {
                    c.c.a.a.x1.p.j();
                    throw th;
                }
            }
            if (this.j) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e3) {
            e2 = e3;
            if (this.j) {
                return;
            }
            obtainMessage(3, e2).sendToTarget();
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.j) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (InterruptedException unused) {
            c.c.a.a.x1.p.g(this.i);
            if (this.j) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e5) {
            Log.e("LoadTask", "Unexpected exception loading stream", e5);
            if (this.j) {
                return;
            }
            e2 = new o0(e5);
            obtainMessage(3, e2).sendToTarget();
        } catch (OutOfMemoryError e6) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e6);
            if (this.j) {
                return;
            }
            e2 = new o0(e6);
            obtainMessage(3, e2).sendToTarget();
        }
    }
}
