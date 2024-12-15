package c.c.a.a.q1;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final a f2436a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2437b;

    /* renamed from: c, reason: collision with root package name */
    public d f2438c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2439d;

    public g(b bVar, f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f2437b = fVar;
        this.f2439d = i;
        this.f2436a = new a(bVar, j, j2, j3, j4, j5, j6);
    }

    public int a(j jVar, s sVar, c cVar) {
        j jVar2 = jVar;
        s sVar2 = sVar;
        f fVar = this.f2437b;
        Objects.requireNonNull(fVar);
        while (true) {
            d dVar = this.f2438c;
            Objects.requireNonNull(dVar);
            long j = dVar.f2293f;
            long j2 = dVar.g;
            long j3 = dVar.h;
            if (j2 - j <= this.f2439d) {
                b(false, j);
                return c(jVar2, j, sVar2);
            }
            if (!e(jVar2, j3)) {
                return c(jVar2, j3, sVar2);
            }
            jVar2.f2652f = 0;
            e a2 = fVar.a(jVar2, dVar.f2289b, null);
            int i = a2.f2378a;
            if (i == -3) {
                b(false, j3);
                return c(jVar, j3, sVar);
            }
            if (i == -2) {
                long j4 = a2.f2379b;
                long j5 = a2.f2380c;
                dVar.f2291d = j4;
                dVar.f2293f = j5;
                dVar.h = d.a(dVar.f2289b, j4, dVar.f2292e, j5, dVar.g, dVar.f2290c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    b(true, a2.f2380c);
                    e(jVar2, a2.f2380c);
                    return c(jVar2, a2.f2380c, sVar2);
                }
                long j6 = a2.f2379b;
                long j7 = a2.f2380c;
                dVar.f2292e = j6;
                dVar.g = j7;
                dVar.h = d.a(dVar.f2289b, dVar.f2291d, j6, dVar.f2293f, j7, dVar.f2290c);
            }
            jVar2 = jVar;
            sVar2 = sVar;
        }
    }

    public final void b(boolean z, long j) {
        this.f2438c = null;
        this.f2437b.b();
    }

    public final int c(j jVar, long j, s sVar) {
        if (j == jVar.f2650d) {
            return 0;
        }
        sVar.f2664a = j;
        return 1;
    }

    public final void d(long j) {
        d dVar = this.f2438c;
        if (dVar == null || dVar.f2288a != j) {
            Objects.requireNonNull(this.f2436a.f2213a);
            a aVar = this.f2436a;
            this.f2438c = new d(j, j, aVar.f2215c, aVar.f2216d, aVar.f2217e, aVar.f2218f, aVar.g);
        }
    }

    public final boolean e(j jVar, long j) {
        long j2 = j - jVar.f2650d;
        if (j2 < 0 || j2 > 262144) {
            return false;
        }
        jVar.h((int) j2);
        return true;
    }
}
