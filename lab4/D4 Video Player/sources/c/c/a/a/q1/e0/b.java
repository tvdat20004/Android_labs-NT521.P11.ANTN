package c.c.a.a.q1.e0;

import c.c.a.a.q1.v;
import c.c.a.a.q1.w;
import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class b implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f2381a;

    public b(c cVar, a aVar) {
        this.f2381a = cVar;
    }

    @Override // c.c.a.a.q1.v
    public boolean c() {
        return true;
    }

    @Override // c.c.a.a.q1.v
    public c.c.a.a.q1.t g(long j) {
        c cVar = this.f2381a;
        long j2 = (cVar.f2385d.i * j) / 1000000;
        long j3 = cVar.f2383b;
        long j4 = cVar.f2384c;
        return new c.c.a.a.q1.t(new w(j, l0.g(((((j4 - j3) * j2) / cVar.f2387f) + j3) - 30000, j3, j4 - 1)));
    }

    @Override // c.c.a.a.q1.v
    public long j() {
        c cVar = this.f2381a;
        return cVar.f2385d.a(cVar.f2387f);
    }
}
