package b.b.h.m;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import b.b.c.k;
import b.b.h.m.y;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class j implements y, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public Context f594b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f595c;

    /* renamed from: d, reason: collision with root package name */
    public l f596d;

    /* renamed from: e, reason: collision with root package name */
    public ExpandedMenuView f597e;

    /* renamed from: f, reason: collision with root package name */
    public y.a f598f;
    public i g;

    public j(Context context, int i) {
        this.f594b = context;
        this.f595c = LayoutInflater.from(context);
    }

    @Override // b.b.h.m.y
    public void a(l lVar, boolean z) {
        y.a aVar = this.f598f;
        if (aVar != null) {
            aVar.a(lVar, z);
        }
    }

    public ListAdapter b() {
        if (this.g == null) {
            this.g = new i(this);
        }
        return this.g;
    }

    @Override // b.b.h.m.y
    public int c() {
        return 0;
    }

    @Override // b.b.h.m.y
    public boolean d() {
        return false;
    }

    @Override // b.b.h.m.y
    public Parcelable e() {
        if (this.f597e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f597e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // b.b.h.m.y
    public void g(Context context, l lVar) {
        if (this.f594b != null) {
            this.f594b = context;
            if (this.f595c == null) {
                this.f595c = LayoutInflater.from(context);
            }
        }
        this.f596d = lVar;
        i iVar = this.g;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // b.b.h.m.y
    public void h(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f597e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // b.b.h.m.y
    public boolean i(l lVar, o oVar) {
        return false;
    }

    @Override // b.b.h.m.y
    public boolean j(l lVar, o oVar) {
        return false;
    }

    @Override // b.b.h.m.y
    public void l(y.a aVar) {
        this.f598f = aVar;
    }

    @Override // b.b.h.m.y
    public boolean m(f0 f0Var) {
        if (!f0Var.hasVisibleItems()) {
            return false;
        }
        m mVar = new m(f0Var);
        k.a aVar = new k.a(f0Var.f604a);
        j jVar = new j(aVar.f455a.f436a, R.layout.abc_list_menu_item_layout);
        mVar.f612d = jVar;
        jVar.f598f = mVar;
        l lVar = mVar.f610b;
        lVar.b(jVar, lVar.f604a);
        ListAdapter b2 = mVar.f612d.b();
        b.b.c.h hVar = aVar.f455a;
        hVar.m = b2;
        hVar.n = mVar;
        View view = f0Var.o;
        if (view != null) {
            hVar.f440e = view;
        } else {
            hVar.f438c = f0Var.n;
            hVar.f439d = f0Var.m;
        }
        hVar.k = mVar;
        b.b.c.k a2 = aVar.a();
        mVar.f611c = a2;
        a2.setOnDismissListener(mVar);
        WindowManager.LayoutParams attributes = mVar.f611c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        mVar.f611c.show();
        y.a aVar2 = this.f598f;
        if (aVar2 == null) {
            return true;
        }
        aVar2.b(f0Var);
        return true;
    }

    @Override // b.b.h.m.y
    public void n(boolean z) {
        i iVar = this.g;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f596d.s(this.g.getItem(i), this, 0);
    }
}
