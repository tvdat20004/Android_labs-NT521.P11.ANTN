package b.t;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f1750a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f1751b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f1752c;

    static {
        int i = Build.VERSION.SDK_INT;
        f1750a = true;
        f1751b = true;
        f1752c = i >= 28;
    }
}
