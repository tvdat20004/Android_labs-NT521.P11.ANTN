package b.h.j;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class b0 extends d0 {

    /* renamed from: c, reason: collision with root package name */
    public static Field f1256c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f1257d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Constructor<WindowInsets> f1258e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1259f = false;

    /* renamed from: b, reason: collision with root package name */
    public WindowInsets f1260b;

    public b0() {
        WindowInsets windowInsets;
        if (!f1257d) {
            try {
                f1256c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f1257d = true;
        }
        Field field = f1256c;
        WindowInsets windowInsets2 = null;
        if (field != null) {
            try {
                windowInsets = (WindowInsets) field.get(null);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
            if (windowInsets != null) {
                windowInsets2 = new WindowInsets(windowInsets);
                this.f1260b = windowInsets2;
            }
        }
        if (!f1259f) {
            try {
                f1258e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f1259f = true;
        }
        Constructor<WindowInsets> constructor = f1258e;
        if (constructor != null) {
            try {
                windowInsets2 = constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        this.f1260b = windowInsets2;
    }

    public b0(j0 j0Var) {
        this.f1260b = j0Var.g();
    }

    @Override // b.h.j.d0
    public j0 a() {
        return j0.h(this.f1260b);
    }

    @Override // b.h.j.d0
    public void c(b.h.d.b bVar) {
        WindowInsets windowInsets = this.f1260b;
        if (windowInsets != null) {
            this.f1260b = windowInsets.replaceSystemWindowInsets(bVar.f1159a, bVar.f1160b, bVar.f1161c, bVar.f1162d);
        }
    }
}
