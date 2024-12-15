package b.h.b;

import android.app.Application;

/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Application f1120b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f1121c;

    public d(Application application, f fVar) {
        this.f1120b = application;
        this.f1121c = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1120b.unregisterActivityLifecycleCallbacks(this.f1121c);
    }
}
