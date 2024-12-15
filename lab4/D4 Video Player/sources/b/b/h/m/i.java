package b.b.h.m;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import b.b.h.m.z;
import java.util.ArrayList;
import java.util.Objects;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class i extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public int f592b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f593c;

    public i(j jVar) {
        this.f593c = jVar;
        a();
    }

    public void a() {
        l lVar = this.f593c.f596d;
        o oVar = lVar.v;
        if (oVar != null) {
            lVar.i();
            ArrayList<o> arrayList = lVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == oVar) {
                    this.f592b = i;
                    return;
                }
            }
        }
        this.f592b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public o getItem(int i) {
        l lVar = this.f593c.f596d;
        lVar.i();
        ArrayList<o> arrayList = lVar.j;
        Objects.requireNonNull(this.f593c);
        int i2 = i + 0;
        int i3 = this.f592b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return arrayList.get(i2);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        l lVar = this.f593c.f596d;
        lVar.i();
        int size = lVar.j.size();
        Objects.requireNonNull(this.f593c);
        int i = size + 0;
        return this.f592b < 0 ? i : i - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f593c.f595c.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((z.a) view).d(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
