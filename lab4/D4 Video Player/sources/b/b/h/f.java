package b.b.h;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import b.b.h.m.a0;
import b.b.h.m.u;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ActionMode.Callback f533a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f534b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<g> f535c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public final b.e.i<Menu, Menu> f536d = new b.e.i<>();

    public f(Context context, ActionMode.Callback callback) {
        this.f534b = context;
        this.f533a = callback;
    }

    @Override // b.b.h.a
    public boolean a(b bVar, Menu menu) {
        return this.f533a.onPrepareActionMode(e(bVar), f(menu));
    }

    @Override // b.b.h.a
    public boolean b(b bVar, MenuItem menuItem) {
        return this.f533a.onActionItemClicked(e(bVar), new u(this.f534b, (b.h.e.a.b) menuItem));
    }

    @Override // b.b.h.a
    public boolean c(b bVar, Menu menu) {
        return this.f533a.onCreateActionMode(e(bVar), f(menu));
    }

    @Override // b.b.h.a
    public void d(b bVar) {
        this.f533a.onDestroyActionMode(e(bVar));
    }

    public ActionMode e(b bVar) {
        int size = this.f535c.size();
        for (int i = 0; i < size; i++) {
            g gVar = this.f535c.get(i);
            if (gVar != null && gVar.f538b == bVar) {
                return gVar;
            }
        }
        g gVar2 = new g(this.f534b, bVar);
        this.f535c.add(gVar2);
        return gVar2;
    }

    public final Menu f(Menu menu) {
        Menu orDefault = this.f536d.getOrDefault(menu, null);
        if (orDefault != null) {
            return orDefault;
        }
        a0 a0Var = new a0(this.f534b, (b.h.e.a.a) menu);
        this.f536d.put(menu, a0Var);
        return a0Var;
    }
}
