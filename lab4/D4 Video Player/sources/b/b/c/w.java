package b.b.c;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class w implements b.b.h.a {

    /* renamed from: a, reason: collision with root package name */
    public b.b.h.a f489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f490b;

    public w(f0 f0Var, b.b.h.a aVar) {
        this.f490b = f0Var;
        this.f489a = aVar;
    }

    @Override // b.b.h.a
    public boolean a(b.b.h.b bVar, Menu menu) {
        ViewGroup viewGroup = this.f490b.u;
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        viewGroup.requestApplyInsets();
        return this.f489a.a(bVar, menu);
    }

    @Override // b.b.h.a
    public boolean b(b.b.h.b bVar, MenuItem menuItem) {
        return this.f489a.b(bVar, menuItem);
    }

    @Override // b.b.h.a
    public boolean c(b.b.h.b bVar, Menu menu) {
        return this.f489a.c(bVar, menu);
    }

    @Override // b.b.h.a
    public void d(b.b.h.b bVar) {
        this.f489a.d(bVar);
        f0 f0Var = this.f490b;
        if (f0Var.q != null) {
            f0Var.f431f.getDecorView().removeCallbacks(this.f490b.r);
        }
        f0 f0Var2 = this.f490b;
        if (f0Var2.p != null) {
            f0Var2.x();
            f0 f0Var3 = this.f490b;
            b.h.j.y a2 = b.h.j.u.a(f0Var3.p);
            a2.a(0.0f);
            f0Var3.s = a2;
            b.h.j.y yVar = this.f490b.s;
            v vVar = new v(this);
            View view = yVar.f1319a.get();
            if (view != null) {
                yVar.e(view, vVar);
            }
        }
        f0 f0Var4 = this.f490b;
        m mVar = f0Var4.h;
        if (mVar != null) {
            mVar.f(f0Var4.o);
        }
        f0 f0Var5 = this.f490b;
        f0Var5.o = null;
        ViewGroup viewGroup = f0Var5.u;
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        viewGroup.requestApplyInsets();
    }
}
