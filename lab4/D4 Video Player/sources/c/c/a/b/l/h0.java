package c.c.a.b.l;

import android.view.View;
import c.c.a.b.l.j;

/* loaded from: classes.dex */
public class h0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f3907c;

    public h0(j0 j0Var, int i) {
        this.f3907c = j0Var;
        this.f3906b = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        w j = w.j(this.f3906b, this.f3907c.f3918c.X.f3938d);
        b bVar = this.f3907c.f3918c.W;
        if (j.compareTo(bVar.f3881b) < 0) {
            j = bVar.f3881b;
        } else if (j.compareTo(bVar.f3882c) > 0) {
            j = bVar.f3882c;
        }
        this.f3907c.f3918c.s0(j);
        this.f3907c.f3918c.t0(j.e.DAY);
    }
}
