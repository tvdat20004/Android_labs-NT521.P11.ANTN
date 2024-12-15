package b.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f814b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static u f815c;

    /* renamed from: a, reason: collision with root package name */
    public b2 f816a;

    public static synchronized u a() {
        u uVar;
        synchronized (u.class) {
            if (f815c == null) {
                e();
            }
            uVar = f815c;
        }
        return uVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        synchronized (u.class) {
            h = b2.h(i, mode);
        }
        return h;
    }

    public static synchronized void e() {
        synchronized (u.class) {
            if (f815c == null) {
                u uVar = new u();
                f815c = uVar;
                uVar.f816a = b2.d();
                b2 b2Var = f815c.f816a;
                t tVar = new t();
                synchronized (b2Var) {
                    b2Var.g = tVar;
                }
            }
        }
    }

    public static void f(Drawable drawable, j2 j2Var, int[] iArr) {
        PorterDuff.Mode mode = b2.h;
        if (d1.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = j2Var.f713d;
        if (z || j2Var.f712c) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z ? j2Var.f710a : null;
            PorterDuff.Mode mode2 = j2Var.f712c ? j2Var.f711b : b2.h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = b2.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable b(Context context, int i) {
        return this.f816a.f(context, i);
    }

    public synchronized ColorStateList d(Context context, int i) {
        return this.f816a.i(context, i);
    }
}
