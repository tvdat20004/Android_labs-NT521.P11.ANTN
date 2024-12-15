package c.c.a.a.u1.y0;

import c.c.a.a.d1;
import c.c.a.a.u1.l0;
import c.c.a.a.u1.m0;
import c.c.a.a.u1.n0;
import c.c.a.a.u1.p;
import c.c.a.a.u1.q;
import c.c.a.a.u1.q0;
import c.c.a.a.u1.s0;
import c.c.a.a.u1.u;
import c.c.a.a.u1.v;
import c.c.a.a.u1.v0.h;
import c.c.a.a.u1.y;
import c.c.a.a.u1.y0.b;
import c.c.a.a.u1.y0.d;
import c.c.a.a.w1.g;
import c.c.a.a.y1.n;
import c.c.a.a.y1.r;
import c.c.a.a.y1.r0;
import c.c.a.a.y1.x0;
import c.c.a.a.y1.z;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e implements v, m0<h<d>> {

    /* renamed from: b, reason: collision with root package name */
    public final d.a f3206b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f3207c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f3208d;

    /* renamed from: e, reason: collision with root package name */
    public final z f3209e;

    /* renamed from: f, reason: collision with root package name */
    public final y f3210f;
    public final r g;
    public final s0 h;
    public final q i;
    public u j;
    public c.c.a.a.u1.y0.f.c k;
    public h<d>[] l;
    public n0 m;
    public boolean n;

    public e(c.c.a.a.u1.y0.f.c cVar, d.a aVar, x0 x0Var, q qVar, z zVar, y yVar, r0 r0Var, r rVar) {
        this.k = cVar;
        this.f3206b = aVar;
        this.f3207c = x0Var;
        this.f3208d = r0Var;
        this.f3209e = zVar;
        this.f3210f = yVar;
        this.g = rVar;
        this.i = qVar;
        q0[] q0VarArr = new q0[cVar.f3225f.length];
        int i = 0;
        while (true) {
            c.c.a.a.u1.y0.f.b[] bVarArr = cVar.f3225f;
            if (i >= bVarArr.length) {
                this.h = new s0(q0VarArr);
                h<d>[] hVarArr = new h[0];
                this.l = hVarArr;
                Objects.requireNonNull(qVar);
                this.m = new p(hVarArr);
                yVar.k();
                return;
            }
            q0VarArr[i] = new q0(bVarArr[i].j);
            i++;
        }
    }

    @Override // c.c.a.a.u1.v
    public long b(long j, d1 d1Var) {
        for (h<d> hVar : this.l) {
            if (hVar.f2961b == 2) {
                return hVar.f2965f.b(j, d1Var);
            }
        }
        return j;
    }

    @Override // c.c.a.a.u1.m0
    public void c(h<d> hVar) {
        this.j.c(this);
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public long d() {
        return this.m.d();
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public long e() {
        return this.m.e();
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public boolean f(long j) {
        return this.m.f(j);
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public void g(long j) {
        this.m.g(j);
    }

    @Override // c.c.a.a.u1.v
    public s0 h() {
        return this.h;
    }

    @Override // c.c.a.a.u1.v
    public void m() {
        this.f3208d.a();
    }

    @Override // c.c.a.a.u1.v
    public void n(long j, boolean z) {
        for (h<d> hVar : this.l) {
            hVar.n(j, z);
        }
    }

    @Override // c.c.a.a.u1.v
    public long o(c.c.a.a.w1.r[] rVarArr, boolean[] zArr, l0[] l0VarArr, boolean[] zArr2, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < rVarArr.length; i++) {
            if (l0VarArr[i] != null) {
                h hVar = (h) l0VarArr[i];
                if (rVarArr[i] == null || !zArr[i]) {
                    hVar.A(null);
                    l0VarArr[i] = null;
                } else {
                    ((b) ((d) hVar.f2965f)).f3203e = rVarArr[i];
                    arrayList.add(hVar);
                }
            }
            if (l0VarArr[i] == null && rVarArr[i] != null) {
                c.c.a.a.w1.r rVar = rVarArr[i];
                int i2 = this.h.i(((g) rVar).f3407a);
                d.a aVar = this.f3206b;
                r0 r0Var = this.f3208d;
                c.c.a.a.u1.y0.f.c cVar = this.k;
                x0 x0Var = this.f3207c;
                n a2 = ((b.a) aVar).f3205a.a();
                if (x0Var != null) {
                    a2.b(x0Var);
                }
                h hVar2 = new h(this.k.f3225f[i2].f3214a, null, null, new b(r0Var, cVar, i2, rVar, a2), this, this.g, j, this.f3209e, this.f3210f);
                arrayList.add(hVar2);
                l0VarArr[i] = hVar2;
                zArr2[i] = true;
            }
        }
        h<d>[] hVarArr = new h[arrayList.size()];
        this.l = hVarArr;
        arrayList.toArray(hVarArr);
        q qVar = this.i;
        h<d>[] hVarArr2 = this.l;
        Objects.requireNonNull(qVar);
        this.m = new p(hVarArr2);
        return j;
    }

    @Override // c.c.a.a.u1.v
    public long q(long j) {
        for (h<d> hVar : this.l) {
            hVar.B(j);
        }
        return j;
    }

    @Override // c.c.a.a.u1.v
    public long s() {
        if (this.n) {
            return -9223372036854775807L;
        }
        this.f3210f.n();
        this.n = true;
        return -9223372036854775807L;
    }

    @Override // c.c.a.a.u1.v
    public void t(u uVar, long j) {
        this.j = uVar;
        uVar.a(this);
    }
}
