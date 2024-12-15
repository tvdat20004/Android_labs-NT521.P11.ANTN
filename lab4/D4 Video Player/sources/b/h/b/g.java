package b.h.b;

import android.os.Build;
import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f1129a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f1130b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f1131c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f1132d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f1133e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f1134f;
    public static final Handler g;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class r0 = java.lang.Boolean.TYPE
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            b.h.b.g.g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            b.h.b.g.f1129a = r2
            r2 = 1
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            java.lang.String r4 = "mMainThread"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L25
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L25
            goto L26
        L25:
            r3 = r1
        L26:
            b.h.b.g.f1130b = r3
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            java.lang.String r4 = "mToken"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L34
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L34
            goto L35
        L34:
            r3 = r1
        L35:
            b.h.b.g.f1131c = r3
            java.lang.Class<?> r3 = b.h.b.g.f1129a
            r4 = 3
            java.lang.String r5 = "performStopActivity"
            r6 = 2
            r7 = 0
            if (r3 != 0) goto L42
        L40:
            r3 = r1
            goto L55
        L42:
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L40
            java.lang.Class<android.os.IBinder> r9 = android.os.IBinder.class
            r8[r7] = r9     // Catch: java.lang.Throwable -> L40
            r8[r2] = r0     // Catch: java.lang.Throwable -> L40
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r6] = r9     // Catch: java.lang.Throwable -> L40
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r8)     // Catch: java.lang.Throwable -> L40
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L40
        L55:
            b.h.b.g.f1132d = r3
            java.lang.Class<?> r3 = b.h.b.g.f1129a
            if (r3 != 0) goto L5d
        L5b:
            r3 = r1
            goto L6c
        L5d:
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L5b
            java.lang.Class<android.os.IBinder> r9 = android.os.IBinder.class
            r8[r7] = r9     // Catch: java.lang.Throwable -> L5b
            r8[r2] = r0     // Catch: java.lang.Throwable -> L5b
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r8)     // Catch: java.lang.Throwable -> L5b
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L5b
        L6c:
            b.h.b.g.f1133e = r3
            java.lang.Class<?> r3 = b.h.b.g.f1129a
            boolean r5 = a()
            if (r5 == 0) goto Lab
            if (r3 != 0) goto L79
            goto Lab
        L79:
            java.lang.String r5 = "requestRelaunchActivity"
            r8 = 9
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> Lab
            java.lang.Class<android.os.IBinder> r9 = android.os.IBinder.class
            r8[r7] = r9     // Catch: java.lang.Throwable -> Lab
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r8[r2] = r7     // Catch: java.lang.Throwable -> Lab
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r8[r6] = r7     // Catch: java.lang.Throwable -> Lab
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lab
            r8[r4] = r6     // Catch: java.lang.Throwable -> Lab
            r4 = 4
            r8[r4] = r0     // Catch: java.lang.Throwable -> Lab
            r4 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r8[r4] = r6     // Catch: java.lang.Throwable -> Lab
            r4 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r8[r4] = r6     // Catch: java.lang.Throwable -> Lab
            r4 = 7
            r8[r4] = r0     // Catch: java.lang.Throwable -> Lab
            r4 = 8
            r8[r4] = r0     // Catch: java.lang.Throwable -> Lab
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r5, r8)     // Catch: java.lang.Throwable -> Lab
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Lab
            r1 = r0
        Lab:
            b.h.b.g.f1134f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.b.g.<clinit>():void");
    }

    public static boolean a() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }
}
