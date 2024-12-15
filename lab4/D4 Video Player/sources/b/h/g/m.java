package b.h.g;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f1214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Callable f1215c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ReentrantLock f1216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f1217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Condition f1218f;

    public m(o oVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        this.f1214b = atomicReference;
        this.f1215c = callable;
        this.f1216d = reentrantLock;
        this.f1217e = atomicBoolean;
        this.f1218f = condition;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f1214b.set(this.f1215c.call());
        } catch (Exception unused) {
        }
        this.f1216d.lock();
        try {
            this.f1217e.set(false);
            this.f1218f.signal();
        } finally {
            this.f1216d.unlock();
        }
    }
}
