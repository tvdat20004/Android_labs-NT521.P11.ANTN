package c.c.a.a.u1.y0;

import c.c.a.a.d1;
import c.c.a.a.l0;
import c.c.a.a.q1.d0.k;
import c.c.a.a.q1.d0.s;
import c.c.a.a.q1.d0.t;
import c.c.a.a.u1.v0.f;
import c.c.a.a.u1.v0.m;
import c.c.a.a.u1.v0.o;
import c.c.a.a.u1.y0.d;
import c.c.a.a.w1.g;
import c.c.a.a.w1.r;
import c.c.a.a.x1.p;
import c.c.a.a.y1.n;
import c.c.a.a.y1.q;
import c.c.a.a.y1.r0;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f3199a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3200b;

    /* renamed from: c, reason: collision with root package name */
    public final f[] f3201c;

    /* renamed from: d, reason: collision with root package name */
    public final n f3202d;

    /* renamed from: e, reason: collision with root package name */
    public r f3203e;

    /* renamed from: f, reason: collision with root package name */
    public c.c.a.a.u1.y0.f.c f3204f;
    public int g;
    public IOException h;

    public static final class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final n.a f3205a;

        public a(n.a aVar) {
            this.f3205a = aVar;
        }
    }

    public b(r0 r0Var, c.c.a.a.u1.y0.f.c cVar, int i, r rVar, n nVar) {
        this.f3199a = r0Var;
        this.f3204f = cVar;
        this.f3200b = i;
        this.f3203e = rVar;
        this.f3202d = nVar;
        c.c.a.a.u1.y0.f.b bVar = cVar.f3225f[i];
        g gVar = (g) rVar;
        this.f3201c = new f[gVar.f3409c.length];
        for (int i2 = 0; i2 < this.f3201c.length; i2++) {
            int i3 = gVar.f3409c[i2];
            l0 l0Var = bVar.j[i3];
            t[] tVarArr = l0Var.m != null ? cVar.f3224e.f3213c : null;
            int i4 = bVar.f3214a;
            this.f3201c[i2] = new f(new k(3, null, new s(i3, i4, bVar.f3216c, -9223372036854775807L, cVar.g, l0Var, 0, tVarArr, i4 == 2 ? 4 : 0, null, null), null, Collections.emptyList(), null), bVar.f3214a, l0Var);
        }
    }

    @Override // c.c.a.a.u1.v0.j
    public void a() {
        IOException iOException = this.h;
        if (iOException != null) {
            throw iOException;
        }
        this.f3199a.a();
    }

    @Override // c.c.a.a.u1.v0.j
    public long b(long j, d1 d1Var) {
        c.c.a.a.u1.y0.f.b bVar = this.f3204f.f3225f[this.f3200b];
        int c2 = c.c.a.a.z1.l0.c(bVar.o, j, true, true);
        long[] jArr = bVar.o;
        long j2 = jArr[c2];
        return c.c.a.a.z1.l0.B(j, d1Var, j2, (j2 >= j || c2 >= bVar.k - 1) ? j2 : jArr[c2 + 1]);
    }

    @Override // c.c.a.a.u1.v0.j
    public void c(c.c.a.a.u1.v0.d dVar) {
    }

    @Override // c.c.a.a.u1.v0.j
    public final void d(long j, long j2, List<? extends m> list, c.c.a.a.u1.v0.g gVar) {
        int c2;
        long b2;
        if (this.h != null) {
            return;
        }
        c.c.a.a.u1.y0.f.b bVar = this.f3204f.f3225f[this.f3200b];
        if (bVar.k == 0) {
            gVar.f2960b = !r1.f3223d;
            return;
        }
        if (list.isEmpty()) {
            c2 = c.c.a.a.z1.l0.c(bVar.o, j2, true, true);
        } else {
            c2 = (int) (list.get(list.size() - 1).c() - this.g);
            if (c2 < 0) {
                this.h = new c.c.a.a.u1.m();
                return;
            }
        }
        int i = c2;
        if (i >= bVar.k) {
            gVar.f2960b = !this.f3204f.f3223d;
            return;
        }
        long j3 = j2 - j;
        c.c.a.a.u1.y0.f.c cVar = this.f3204f;
        if (cVar.f3223d) {
            c.c.a.a.u1.y0.f.b bVar2 = cVar.f3225f[this.f3200b];
            int i2 = bVar2.k - 1;
            b2 = (bVar2.b(i2) + bVar2.o[i2]) - j;
        } else {
            b2 = -9223372036854775807L;
        }
        int length = ((g) this.f3203e).f3409c.length;
        o[] oVarArr = new o[length];
        for (int i3 = 0; i3 < length; i3++) {
            oVarArr[i3] = new c(bVar, ((g) this.f3203e).f3409c[i3], i);
        }
        this.f3203e.g(j, j3, b2, list, oVarArr);
        long j4 = bVar.o[i];
        long b3 = bVar.b(i) + j4;
        long j5 = list.isEmpty() ? j2 : -9223372036854775807L;
        int i4 = i + this.g;
        int b4 = this.f3203e.b();
        f fVar = this.f3201c[b4];
        int i5 = ((g) this.f3203e).f3409c[b4];
        p.g(bVar.j != null);
        p.g(bVar.n != null);
        p.g(i < bVar.n.size());
        String num = Integer.toString(bVar.j[i5].f2041f);
        String l = bVar.n.get(i).toString();
        gVar.f2959a = new c.c.a.a.u1.v0.k(this.f3202d, new q(p.r(bVar.l, bVar.m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l).replace("{start_time}", l)), 0L, -1L, null), ((g) this.f3203e).i(), this.f3203e.a(), this.f3203e.e(), j4, b3, j5, -9223372036854775807L, i4, 1, j4, fVar);
    }

    @Override // c.c.a.a.u1.v0.j
    public boolean e(c.c.a.a.u1.v0.d dVar, boolean z, Exception exc, long j) {
        if (z && j != -9223372036854775807L) {
            g gVar = (g) this.f3203e;
            if (gVar.h(gVar.k(dVar.f2944c), j)) {
                return true;
            }
        }
        return false;
    }

    @Override // c.c.a.a.u1.v0.j
    public int f(long j, List<? extends m> list) {
        if (this.h == null) {
            r rVar = this.f3203e;
            if (((g) rVar).f3409c.length >= 2) {
                return rVar.f(j, list);
            }
        }
        return list.size();
    }
}
