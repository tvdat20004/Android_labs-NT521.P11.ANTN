package b.h.b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f1124a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f1125b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1126c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1127d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1128e = false;

    public f(Activity activity) {
        this.f1125b = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f1125b == activity) {
            this.f1125b = null;
            this.f1127d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (!this.f1127d || this.f1128e || this.f1126c) {
            return;
        }
        Object obj = this.f1124a;
        boolean z = false;
        try {
            Object obj2 = g.f1131c.get(activity);
            if (obj2 == obj) {
                g.g.postAtFrontOfQueue(new e(g.f1130b.get(activity), obj2));
                z = true;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
        if (z) {
            this.f1128e = true;
            this.f1124a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.f1125b == activity) {
            this.f1126c = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
