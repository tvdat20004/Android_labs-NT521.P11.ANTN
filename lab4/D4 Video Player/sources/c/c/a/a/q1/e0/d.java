package c.c.a.a.q1.e0;

import c.c.a.a.q1.v;
import c.c.a.a.q1.w;
import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public class d implements i, v {

    /* renamed from: a, reason: collision with root package name */
    public long[] f2388a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f2389b;

    /* renamed from: c, reason: collision with root package name */
    public long f2390c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f2391d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f2392e;

    public d(e eVar) {
        this.f2392e = eVar;
    }

    @Override // c.c.a.a.q1.e0.i
    public v a() {
        return this;
    }

    @Override // c.c.a.a.q1.v
    public boolean c() {
        return true;
    }

    @Override // c.c.a.a.q1.e0.i
    public long d(c.c.a.a.q1.j jVar) {
        long j = this.f2391d;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.f2391d = -1L;
        return j2;
    }

    @Override // c.c.a.a.q1.e0.i
    public void e(long j) {
        this.f2391d = this.f2388a[l0.c(this.f2388a, j, true, true)];
    }

    @Override // c.c.a.a.q1.v
    public c.c.a.a.q1.t g(long j) {
        int c2 = l0.c(this.f2388a, (this.f2392e.i * j) / 1000000, true, true);
        long a2 = this.f2392e.a(this.f2388a[c2]);
        w wVar = new w(a2, this.f2390c + this.f2389b[c2]);
        if (a2 < j) {
            long[] jArr = this.f2388a;
            if (c2 != jArr.length - 1) {
                int i = c2 + 1;
                return new c.c.a.a.q1.t(wVar, new w(this.f2392e.a(jArr[i]), this.f2390c + this.f2389b[i]));
            }
        }
        return new c.c.a.a.q1.t(wVar);
    }

    @Override // c.c.a.a.q1.v
    public long j() {
        return (this.f2392e.n.f3779d * 1000000) / r0.f3776a;
    }
}
