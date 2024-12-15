package c.c.a.a;

import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f2026a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    public static String f2027b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (j0.class) {
            if (f2026a.add(str)) {
                f2027b += ", " + str;
            }
        }
    }
}
