package e.a.a;

import java.lang.Thread;

/* loaded from: classes.dex */
public abstract class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final d f4318b;

    public p(d dVar) {
        this.f4318b = dVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f4318b.h.d()) {
                return;
            }
            a();
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}
