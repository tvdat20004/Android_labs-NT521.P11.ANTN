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
public final class j implements i0<s0<c.c.a.a.u1.w0.x.b>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DashMediaSource f2997b;

    public j(DashMediaSource dashMediaSource, DashMediaSource.a aVar) {
        this.f2997b = dashMediaSource;
    }

    @Override // c.c.a.a.y1.i0
    public j0 i(s0<c.c.a.a.u1.w0.x.b> s0Var, long j, long j2, IOException iOException, int i) {
        s0<c.c.a.a.u1.w0.x.b> s0Var2 = s0Var;
        DashMediaSource dashMediaSource = this.f2997b;
        long c2 = dashMediaSource.k.c(iOException, i);
        j0 c3 = c2 == -9223372036854775807L ? p0.f3647e : p0.c(false, c2);
        y yVar = dashMediaSource.n;
        c.c.a.a.y1.q qVar = s0Var2.f3663a;
        v0 v0Var = s0Var2.f3665c;
        yVar.h(qVar, v0Var.f3691c, v0Var.f3692d, s0Var2.f3664b, j, j2, v0Var.f3690b, iOException, !c3.a());
        return c3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    @Override // c.c.a.a.y1.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(c.c.a.a.y1.s0<c.c.a.a.u1.w0.x.b> r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.w0.j.l(c.c.a.a.y1.l0, long, long):void");
    }

    @Override // c.c.a.a.y1.i0
    public void p(s0<c.c.a.a.u1.w0.x.b> s0Var, long j, long j2, boolean z) {
        this.f2997b.j(s0Var, j, j2);
    }
}
