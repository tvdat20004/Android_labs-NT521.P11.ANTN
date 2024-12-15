package c.c.a.a.u1.x0.b0;

import c.c.a.a.y1.s0;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    public final m f3119a;

    /* renamed from: b, reason: collision with root package name */
    public final List<c.c.a.a.t1.d> f3120b;

    public d(m mVar, List<c.c.a.a.t1.d> list) {
        this.f3119a = mVar;
        this.f3120b = list;
    }

    @Override // c.c.a.a.u1.x0.b0.m
    public s0.a<j> a() {
        return new c.c.a.a.t1.b(this.f3119a.a(), this.f3120b);
    }

    @Override // c.c.a.a.u1.x0.b0.m
    public s0.a<j> b(g gVar) {
        return new c.c.a.a.t1.b(this.f3119a.b(gVar), this.f3120b);
    }
}
