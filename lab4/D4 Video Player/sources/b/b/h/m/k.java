package b.b.h.m;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import b.b.h.m.z;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class k extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public l f599b;

    /* renamed from: c, reason: collision with root package name */
    public int f600c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f601d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f602e;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f603f;
    public final int g;

    public k(l lVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f602e = z;
        this.f603f = layoutInflater;
        this.f599b = lVar;
        this.g = i;
        a();
    }

    public void a() {
        l lVar = this.f599b;
        o oVar = lVar.v;
        if (oVar != null) {
            lVar.i();
            ArrayList<o> arrayList = lVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == oVar) {
                    this.f600c = i;
                    return;
                }
            }
        }
        this.f600c = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public o getItem(int i) {
        ArrayList<o> l;
        if (this.f602e) {
            l lVar = this.f599b;
            lVar.i();
            l = lVar.j;
        } else {
            l = this.f599b.l();
        }
        int i2 = this.f600c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return l.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<o> l;
        if (this.f602e) {
            l lVar = this.f599b;
            lVar.i();
            l = lVar.j;
        } else {
            l = this.f599b.l();
        }
        int i = this.f600c;
        int size = l.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f603f.inflate(this.g, viewGroup, false);
        }
        int i2 = getItem(i).f615b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f599b.m() && i2 != (i3 >= 0 ? getItem(i3).f615b : i2));
        z.a aVar = (z.a) view;
        if (this.f601d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
