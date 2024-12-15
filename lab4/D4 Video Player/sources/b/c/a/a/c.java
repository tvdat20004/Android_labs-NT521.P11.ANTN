package b.c.a.a;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class c extends d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f851a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f852b = Executors.newFixedThreadPool(4, new b(this));

    @Override // b.c.a.a.d
    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
