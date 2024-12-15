package b.b.c;

import android.view.View;

/* loaded from: classes.dex */
public class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f485b;

    public s(f0 f0Var) {
        this.f485b = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        f0 f0Var = this.f485b;
        f0Var.q.showAtLocation(f0Var.p, 55, 0, 0);
        this.f485b.x();
        if (!this.f485b.K()) {
            this.f485b.p.setAlpha(1.0f);
            this.f485b.p.setVisibility(0);
            return;
        }
        this.f485b.p.setAlpha(0.0f);
        f0 f0Var2 = this.f485b;
        b.h.j.y a2 = b.h.j.u.a(f0Var2.p);
        a2.a(1.0f);
        f0Var2.s = a2;
        b.h.j.y yVar = this.f485b.s;
        r rVar = new r(this);
        View view = yVar.f1319a.get();
        if (view != null) {
            yVar.e(view, rVar);
        }
    }
}
