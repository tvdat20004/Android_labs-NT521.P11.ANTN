package b.t;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static Field f1780a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f1781b;

    public abstract void a(View view);

    public abstract float b(View view);

    public abstract void c(View view);

    public abstract void d(View view, int i, int i2, int i3, int i4);

    public abstract void e(View view, float f2);

    public void f(View view, int i) {
        if (!f1781b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f1780a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f1781b = true;
        }
        Field field = f1780a;
        if (field != null) {
            try {
                f1780a.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);
}
