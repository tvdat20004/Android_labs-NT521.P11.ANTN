package c.c.a.b.g;

import android.view.View;
import b.h.j.j0;
import b.h.j.u;
import b.h.j.y;
import c.c.a.b.p.s;
import c.c.a.b.p.t;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class j implements s {
    public j(BottomNavigationView bottomNavigationView) {
    }

    @Override // c.c.a.b.p.s
    public j0 a(View view, j0 j0Var, t tVar) {
        int a2 = j0Var.a() + tVar.f3985d;
        tVar.f3985d = a2;
        int i = tVar.f3982a;
        int i2 = tVar.f3983b;
        int i3 = tVar.f3984c;
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        view.setPaddingRelative(i, i2, i3, a2);
        return j0Var;
    }
}
