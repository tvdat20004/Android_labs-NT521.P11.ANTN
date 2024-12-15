package b.h.b;

import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1122b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1123c;

    public e(Object obj, Object obj2) {
        this.f1122b = obj;
        this.f1123c = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Boolean bool = Boolean.FALSE;
        try {
            Method method = g.f1132d;
            if (method != null) {
                method.invoke(this.f1122b, this.f1123c, bool, "AppCompat recreation");
            } else {
                g.f1133e.invoke(this.f1122b, this.f1123c, bool);
            }
        } catch (RuntimeException e2) {
            if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                throw e2;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
