package b.b.d.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import b.b.i.b2;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f496a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<Context, SparseArray<Object>> f497b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f498c = new Object();

    public static Drawable a(Context context, int i) {
        return b2.d().f(context, i);
    }
}
