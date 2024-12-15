package c.c.a.b.g;

import android.view.View;
import b.b.h.m.o;

/* loaded from: classes.dex */
public class d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f3853b;

    public d(e eVar) {
        this.f3853b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        o itemData = ((b) view).getItemData();
        e eVar = this.f3853b;
        if (eVar.z.s(itemData, eVar.y, 0)) {
            return;
        }
        itemData.setChecked(true);
    }
}
