package b.h.g;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class o {

    /* renamed from: b, reason: collision with root package name */
    public HandlerThread f1220b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f1221c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1219a = new Object();

    /* renamed from: e, reason: collision with root package name */
    public Handler.Callback f1223e = new j(this);

    /* renamed from: d, reason: collision with root package name */
    public int f1222d = 0;

    public o(String str, int i, int i2) {
    }

    public final void a(Runnable runnable) {
        synchronized (this.f1219a) {
            if (this.f1220b == null) {
                HandlerThread handlerThread = new HandlerThread("fonts", 10);
                this.f1220b = handlerThread;
                handlerThread.start();
                this.f1221c = new Handler(this.f1220b.getLooper(), this.f1223e);
                this.f1222d++;
            }
            this.f1221c.removeMessages(0);
            Handler handler = this.f1221c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    public <T> T b(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        a(new m(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}
