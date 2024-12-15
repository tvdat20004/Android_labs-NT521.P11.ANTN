package b.h.j;

import android.os.Build;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f1280b;

    /* renamed from: a, reason: collision with root package name */
    public final i0 f1281a;

    static {
        f1280b = (Build.VERSION.SDK_INT >= 29 ? new c0() : new b0()).a().f1281a.a().f1281a.b().f1281a.c();
    }

    public j0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        this.f1281a = i >= 29 ? new h0(this, windowInsets) : i >= 28 ? new g0(this, windowInsets) : new f0(this, windowInsets);
    }

    public j0(j0 j0Var) {
        this.f1281a = new i0(this);
    }

    public static b.h.d.b f(b.h.d.b bVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, bVar.f1159a - i);
        int max2 = Math.max(0, bVar.f1160b - i2);
        int max3 = Math.max(0, bVar.f1161c - i3);
        int max4 = Math.max(0, bVar.f1162d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? bVar : b.h.d.b.a(max, max2, max3, max4);
    }

    public static j0 h(WindowInsets windowInsets) {
        Objects.requireNonNull(windowInsets);
        return new j0(windowInsets);
    }

    public int a() {
        return e().f1162d;
    }

    public int b() {
        return e().f1159a;
    }

    public int c() {
        return e().f1161c;
    }

    public int d() {
        return e().f1160b;
    }

    public b.h.d.b e() {
        return this.f1281a.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return Objects.equals(this.f1281a, ((j0) obj).f1281a);
        }
        return false;
    }

    public WindowInsets g() {
        i0 i0Var = this.f1281a;
        if (i0Var instanceof e0) {
            return ((e0) i0Var).f1268b;
        }
        return null;
    }

    public int hashCode() {
        i0 i0Var = this.f1281a;
        if (i0Var == null) {
            return 0;
        }
        return i0Var.hashCode();
    }
}
