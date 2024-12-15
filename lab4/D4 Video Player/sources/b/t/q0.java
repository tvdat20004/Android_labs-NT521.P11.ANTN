package b.t;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final w0 f1772a;

    /* renamed from: b, reason: collision with root package name */
    public static final Property<View, Float> f1773b;

    static {
        f1772a = Build.VERSION.SDK_INT >= 29 ? new v0() : new u0();
        f1773b = new o0(Float.class, "translationAlpha");
        new p0(Rect.class, "clipBounds");
    }

    public static float a(View view) {
        return f1772a.b(view);
    }

    public static void b(View view, int i, int i2, int i3, int i4) {
        f1772a.d(view, i, i2, i3, i4);
    }
}
