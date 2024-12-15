package b.h.g;

import android.os.Handler;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f1211b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Handler f1212c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f1213d;

    public l(o oVar, Callable callable, Handler handler, n nVar) {
        this.f1211b = callable;
        this.f1212c = handler;
        this.f1213d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        try {
            obj = this.f1211b.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f1212c.post(new k(this, obj));
    }
}
