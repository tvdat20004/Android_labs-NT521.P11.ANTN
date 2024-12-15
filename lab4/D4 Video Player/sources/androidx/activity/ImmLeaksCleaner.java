package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import b.n.e;
import b.n.f;
import b.n.h;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements f {

    /* renamed from: b, reason: collision with root package name */
    public static int f39b;

    /* renamed from: c, reason: collision with root package name */
    public static Field f40c;

    /* renamed from: d, reason: collision with root package name */
    public static Field f41d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f42e;

    /* renamed from: a, reason: collision with root package name */
    public Activity f43a;

    public ImmLeaksCleaner(Activity activity) {
        this.f43a = activity;
    }

    @Override // b.n.f
    public void d(h hVar, e.a aVar) {
        if (aVar != e.a.ON_DESTROY) {
            return;
        }
        if (f39b == 0) {
            try {
                f39b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f41d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f42e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f40c = declaredField3;
                declaredField3.setAccessible(true);
                f39b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f39b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f43a.getSystemService("input_method");
            try {
                Object obj = f40c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f41d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f42e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
