package b.b.c;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class p implements b.h.j.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f472a;

    public p(f0 f0Var) {
        this.f472a = f0Var;
    }

    @Override // b.h.j.k
    public b.h.j.j0 a(View view, b.h.j.j0 j0Var) {
        int d2 = j0Var.d();
        int M = this.f472a.M(j0Var, null);
        if (d2 != M) {
            int b2 = j0Var.b();
            int c2 = j0Var.c();
            int a2 = j0Var.a();
            b.h.j.d0 c0Var = Build.VERSION.SDK_INT >= 29 ? new b.h.j.c0(j0Var) : new b.h.j.b0(j0Var);
            c0Var.c(b.h.d.b.a(b2, M, c2, a2));
            j0Var = c0Var.a();
        }
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        WindowInsets g = j0Var.g();
        if (g == null) {
            return j0Var;
        }
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(g);
        return !onApplyWindowInsets.equals(g) ? new b.h.j.j0(onApplyWindowInsets) : j0Var;
    }
}
