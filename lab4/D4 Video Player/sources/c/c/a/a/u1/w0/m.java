package c.c.a.a.u1.w0;

import c.c.a.a.u1.y;
import c.c.a.a.y1.i0;
import c.c.a.a.y1.j0;
import c.c.a.a.y1.p0;
import c.c.a.a.y1.s0;
import c.c.a.a.y1.v0;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class m implements i0<s0<Long>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DashMediaSource f3002b;

    public m(DashMediaSource dashMediaSource, DashMediaSource.a aVar) {
        this.f3002b = dashMediaSource;
    }

    @Override // c.c.a.a.y1.i0
    public j0 i(s0<Long> s0Var, long j, long j2, IOException iOException, int i) {
        s0<Long> s0Var2 = s0Var;
        DashMediaSource dashMediaSource = this.f3002b;
        y yVar = dashMediaSource.n;
        c.c.a.a.y1.q qVar = s0Var2.f3663a;
        v0 v0Var = s0Var2.f3665c;
        yVar.h(qVar, v0Var.f3691c, v0Var.f3692d, s0Var2.f3664b, j, j2, v0Var.f3690b, iOException, true);
        dashMediaSource.k(iOException);
        return p0.f3646d;
    }

    @Override // c.c.a.a.y1.i0
    public void l(s0<Long> s0Var, long j, long j2) {
        s0<Long> s0Var2 = s0Var;
        DashMediaSource dashMediaSource = this.f3002b;
        y yVar = dashMediaSource.n;
        c.c.a.a.y1.q qVar = s0Var2.f3663a;
        v0 v0Var = s0Var2.f3665c;
        yVar.f(qVar, v0Var.f3691c, v0Var.f3692d, s0Var2.f3664b, j, j2, v0Var.f3690b);
        dashMediaSource.I = s0Var2.f3667e.longValue() - j;
        dashMediaSource.m(true);
    }

    @Override // c.c.a.a.y1.i0
    public void p(s0<Long> s0Var, long j, long j2, boolean z) {
        this.f3002b.j(s0Var, j, j2);
    }
}
