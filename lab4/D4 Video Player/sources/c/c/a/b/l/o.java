package c.c.a.b.l;

import android.view.View;

/* loaded from: classes.dex */
public class o implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f3927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3928c;

    public o(j jVar, a0 a0Var) {
        this.f3928c = jVar;
        this.f3927b = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int j1 = this.f3928c.q0().j1() + 1;
        if (j1 < this.f3928c.b0.getAdapter().a()) {
            this.f3928c.s0(this.f3927b.g(j1));
        }
    }
}
