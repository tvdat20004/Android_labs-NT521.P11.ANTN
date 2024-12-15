package c.c.a.b.l;

import android.view.View;

/* loaded from: classes.dex */
public class s implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f3934b;

    public s(r rVar) {
        this.f3934b = rVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        r rVar = this.f3934b;
        rVar.x0.setEnabled(rVar.m0.e());
        this.f3934b.v0.toggle();
        r rVar2 = this.f3934b;
        rVar2.x0(rVar2.v0);
        this.f3934b.v0();
    }
}
