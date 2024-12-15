package c.c.a.b.p;

import android.view.View;
import b.h.j.j0;

/* loaded from: classes.dex */
public final class q implements b.h.j.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f3980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f3981b;

    public q(s sVar, t tVar) {
        this.f3980a = sVar;
        this.f3981b = tVar;
    }

    @Override // b.h.j.k
    public j0 a(View view, j0 j0Var) {
        return this.f3980a.a(view, j0Var, new t(this.f3981b));
    }
}
