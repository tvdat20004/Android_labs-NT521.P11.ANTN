package c.c.a.b.l;

import android.view.View;
import c.c.a.b.l.j;

/* loaded from: classes.dex */
public class n implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f3926b;

    public n(j jVar) {
        this.f3926b = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        j jVar = this.f3926b;
        j.e eVar = j.e.DAY;
        j.e eVar2 = jVar.Y;
        j.e eVar3 = j.e.YEAR;
        if (eVar2 == eVar3) {
            jVar.t0(eVar);
        } else if (eVar2 == eVar) {
            jVar.t0(eVar3);
        }
    }
}
