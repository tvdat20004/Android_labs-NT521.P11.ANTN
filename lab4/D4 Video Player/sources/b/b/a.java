package b.b;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import b.b.i.s2;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Field f398a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f399b;

    /* renamed from: c, reason: collision with root package name */
    public static Class<?> f400c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f401d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f402e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f403f;
    public static Field g;
    public static boolean h;

    public static void a(Object obj) {
        if (!f401d) {
            try {
                f400c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f401d = true;
        }
        Class<?> cls = f400c;
        if (cls == null) {
            return;
        }
        if (!f403f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f402e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f403f = true;
        }
        Field field = f402e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static InputConnection b(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return inputConnection;
    }

    public static void c(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        s2 s2Var = s2.k;
        if (s2Var != null && s2Var.f793b == view) {
            s2.c(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new s2(view, charSequence);
            return;
        }
        s2 s2Var2 = s2.l;
        if (s2Var2 != null && s2Var2.f793b == view) {
            s2Var2.b();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
