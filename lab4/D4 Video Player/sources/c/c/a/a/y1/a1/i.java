package c.c.a.a.y1.a1;

import c.c.a.a.y1.c0;
import c.c.a.a.y1.n;

/* loaded from: classes.dex */
public final class i implements n.a {

    /* renamed from: a, reason: collision with root package name */
    public final c f3565a;

    /* renamed from: b, reason: collision with root package name */
    public final n.a f3566b;

    /* renamed from: c, reason: collision with root package name */
    public final n.a f3567c;

    /* renamed from: d, reason: collision with root package name */
    public final f f3568d;

    public i(c cVar, n.a aVar, int i) {
        c0 c0Var = new c0();
        f fVar = new f(cVar, 5242880L);
        this.f3565a = cVar;
        this.f3566b = aVar;
        this.f3567c = c0Var;
        this.f3568d = fVar;
    }

    @Override // c.c.a.a.y1.n.a
    public c.c.a.a.y1.n a() {
        c cVar = this.f3565a;
        c.c.a.a.y1.n a2 = this.f3566b.a();
        c.c.a.a.y1.n a3 = this.f3567c.a();
        f fVar = this.f3568d;
        return new h(cVar, a2, a3, fVar == null ? null : new e(fVar.f3558a, 5242880L, 20480), 3, null, null);
    }
}
