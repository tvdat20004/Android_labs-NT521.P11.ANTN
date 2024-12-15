package b.h.b;

import android.app.Activity;
import android.content.Context;
import android.os.Process;
import b.b.c.l;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f1117a = new Object();

    public static int a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Activity activity, String[] strArr, int i) {
        if (!((l) ((a) activity)).l && i != -1) {
            l.k(i);
        }
        activity.requestPermissions(strArr, i);
    }
}
