package c.c.a.a.u1.w0;

import c.c.a.a.l0;
import c.c.a.a.q1.y;
import java.util.List;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.u1.v0.f f3012a;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.u1.w0.x.m f3013b;

    /* renamed from: c, reason: collision with root package name */
    public final o f3014c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3015d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3016e;

    public r(long j, int i, c.c.a.a.u1.w0.x.m mVar, boolean z, List<l0> list, y yVar) {
        c.c.a.a.q1.m kVar;
        c.c.a.a.u1.v0.f fVar;
        String str = mVar.f3076a.i;
        if (c.c.a.a.z1.u.i(str) || "application/ttml+xml".equals(str)) {
            fVar = null;
        } else {
            if ("application/x-rawcc".equals(str)) {
                kVar = new c.c.a.a.q1.f0.a(mVar.f3076a);
            } else {
                if (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm")) {
                    kVar = new c.c.a.a.q1.b0.h(1);
                } else {
                    kVar = new c.c.a.a.q1.d0.k(z ? 4 : 0, null, null, null, list, yVar);
                }
            }
            fVar = new c.c.a.a.u1.v0.f(kVar, i, mVar.f3076a);
        }
        o i2 = mVar.i();
        this.f3015d = j;
        this.f3013b = mVar;
        this.f3016e = 0L;
        this.f3012a = fVar;
        this.f3014c = i2;
    }

    public r(long j, c.c.a.a.u1.w0.x.m mVar, c.c.a.a.u1.v0.f fVar, long j2, o oVar) {
        this.f3015d = j;
        this.f3013b = mVar;
        this.f3016e = j2;
        this.f3012a = fVar;
        this.f3014c = oVar;
    }

    public r a(long j, c.c.a.a.u1.w0.x.m mVar) {
        int f2;
        long a2;
        o i = this.f3013b.i();
        o i2 = mVar.i();
        if (i == null) {
            return new r(j, mVar, this.f3012a, this.f3016e, i);
        }
        if (i.c() && (f2 = i.f(j)) != 0) {
            long e2 = (i.e() + f2) - 1;
            long d2 = i.d(e2, j) + i.b(e2);
            long e3 = i2.e();
            long b2 = i2.b(e3);
            long j2 = this.f3016e;
            if (d2 == b2) {
                a2 = e2 + 1;
            } else {
                if (d2 < b2) {
                    throw new c.c.a.a.u1.m();
                }
                a2 = i.a(b2, j);
            }
            return new r(j, mVar, this.f3012a, (a2 - e3) + j2, i2);
        }
        return new r(j, mVar, this.f3012a, this.f3016e, i2);
    }

    public long b(c.c.a.a.u1.w0.x.b bVar, int i, long j) {
        if (e() != -1 || bVar.f3043f == -9223372036854775807L) {
            return c();
        }
        return Math.max(c(), g(((j - c.c.a.a.s.a(bVar.f3038a)) - c.c.a.a.s.a(bVar.l.get(i).f3062b)) - c.c.a.a.s.a(bVar.f3043f)));
    }

    public long c() {
        return this.f3014c.e() + this.f3016e;
    }

    public long d(c.c.a.a.u1.w0.x.b bVar, int i, long j) {
        int e2 = e();
        return (e2 == -1 ? g((j - c.c.a.a.s.a(bVar.f3038a)) - c.c.a.a.s.a(bVar.l.get(i).f3062b)) : c() + e2) - 1;
    }

    public int e() {
        return this.f3014c.f(this.f3015d);
    }

    public long f(long j) {
        return this.f3014c.d(j - this.f3016e, this.f3015d) + this.f3014c.b(j - this.f3016e);
    }

    public long g(long j) {
        return this.f3014c.a(j, this.f3015d) + this.f3016e;
    }

    public long h(long j) {
        return this.f3014c.b(j - this.f3016e);
    }
}
