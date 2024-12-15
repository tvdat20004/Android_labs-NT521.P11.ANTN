package d.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b.q.q;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static Context f4288a;

    public static boolean a(Context context, String str, int i) {
        boolean z = q.a(context.getApplicationContext()).getBoolean(str, context.getResources().getBoolean(i));
        e("getPrefBool(): key= %s; val= %b", str, Boolean.valueOf(z));
        return z;
    }

    public static int b(Context context, String str, int i) {
        int integer = context.getResources().getInteger(i);
        int intValue = Integer.valueOf(q.a(context.getApplicationContext()).getString(str, "" + integer)).intValue();
        e("getPrefInt(): key= %s; val= %d", str, Integer.valueOf(intValue));
        return intValue;
    }

    public static int c(long j) {
        return ((int) j) / 3600000;
    }

    public static boolean d(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static void e(String str, Object... objArr) {
        Log.d("YAVP", String.format(Locale.US, str, objArr));
    }

    public static void f(String str, Object... objArr) {
        Log.e("YAVP", String.format(Locale.US, str, objArr));
    }

    public static void g(String str, Object... objArr) {
        Log.w("YAVP", String.format(Locale.US, str, objArr));
    }

    public static void h(Context context, String str, int i, boolean z) {
        SharedPreferences.Editor putInt;
        SharedPreferences a2 = q.a(context.getApplicationContext());
        if (a2 == null) {
            e("cannot save playback position: ConfigUtil.getAppConfig() returned null!", new Object[0]);
            return;
        }
        SharedPreferences.Editor edit = a2.edit();
        if (z) {
            putInt = edit.putString(str, "" + i);
        } else {
            putInt = edit.putInt(str, i);
        }
        putInt.apply();
        e("Set int key %s to %d", str, Integer.valueOf(i));
    }
}
