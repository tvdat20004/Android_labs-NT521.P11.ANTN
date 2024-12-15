package c.c.a.b.l;

import android.view.View;

/* loaded from: classes.dex */
public class p implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f3929b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3930c;

    public p(j jVar, a0 a0Var) {
        this.f3930c = jVar;
        this.f3929b = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int l1 = this.f3930c.q0().l1() - 1;
        if (l1 >= 0) {
            this.f3930c.s0(this.f3929b.g(l1));
        }
    }
}
