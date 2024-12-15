package c.c.a.a.u1.x0;

import android.net.Uri;
import c.c.a.a.d1;
import c.c.a.a.u1.l0;
import c.c.a.a.u1.m0;
import c.c.a.a.u1.n0;
import c.c.a.a.u1.q0;
import c.c.a.a.u1.s0;
import c.c.a.a.y1.x0;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q implements c.c.a.a.u1.v, m0 {

    /* renamed from: b, reason: collision with root package name */
    public final n f3172b;

    /* renamed from: c, reason: collision with root package name */
    public final c.c.a.a.u1.x0.b0.n f3173c;

    /* renamed from: d, reason: collision with root package name */
    public final e f3174d;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f3175e;

    /* renamed from: f, reason: collision with root package name */
    public final c.c.a.a.y1.z f3176f;
    public final c.c.a.a.u1.y g;
    public final c.c.a.a.y1.r h;
    public final IdentityHashMap<l0, Integer> i;
    public final z j;
    public final c.c.a.a.u1.q k;
    public final boolean l;
    public final boolean m;
    public c.c.a.a.u1.u n;
    public int o;
    public s0 p;
    public t[] q;
    public t[] r;
    public n0 s;
    public boolean t;

    public q(n nVar, c.c.a.a.u1.x0.b0.n nVar2, e eVar, x0 x0Var, c.c.a.a.y1.z zVar, c.c.a.a.u1.y yVar, c.c.a.a.y1.r rVar, c.c.a.a.u1.q qVar, boolean z, boolean z2) {
        this.f3172b = nVar;
        this.f3173c = nVar2;
        this.f3174d = eVar;
        this.f3175e = x0Var;
        this.f3176f = zVar;
        this.g = yVar;
        this.h = rVar;
        this.k = qVar;
        this.l = z;
        this.m = z2;
        Objects.requireNonNull(qVar);
        this.s = new c.c.a.a.u1.p(new n0[0]);
        this.i = new IdentityHashMap<>();
        this.j = new z();
        this.q = new t[0];
        this.r = new t[0];
        yVar.k();
    }

    public static c.c.a.a.l0 j(c.c.a.a.l0 l0Var, c.c.a.a.l0 l0Var2, boolean z) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        if (l0Var2 != null) {
            String str4 = l0Var2.g;
            int i4 = l0Var2.w;
            int i5 = l0Var2.f2039d;
            int i6 = l0Var2.f2040e;
            String str5 = l0Var2.B;
            str2 = l0Var2.f2038c;
            str = str4;
            i3 = i4;
            i = i5;
            i2 = i6;
            str3 = str5;
        } else {
            String k = c.c.a.a.z1.l0.k(l0Var.g, 1);
            if (z) {
                int i7 = l0Var.w;
                str = k;
                i = l0Var.f2039d;
                i3 = i7;
                i2 = l0Var.f2040e;
                str3 = l0Var.B;
                str2 = l0Var.f2038c;
            } else {
                str = k;
                str2 = null;
                str3 = null;
                i = 0;
                i2 = 0;
                i3 = -1;
            }
        }
        return c.c.a.a.l0.o(l0Var.f2037b, str2, l0Var.i, c.c.a.a.z1.u.c(str), str, z ? l0Var.f2041f : -1, i3, -1, null, i, i2, str3);
    }

    @Override // c.c.a.a.u1.v
    public long b(long j, d1 d1Var) {
        return j;
    }

    @Override // c.c.a.a.u1.m0
    public void c(n0 n0Var) {
        this.n.c(this);
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public long d() {
        return this.s.d();
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public long e() {
        return this.s.e();
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public boolean f(long j) {
        if (this.p != null) {
            return this.s.f(j);
        }
        for (t tVar : this.q) {
            if (!tVar.A) {
                tVar.f(tVar.M);
            }
        }
        return false;
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public void g(long j) {
        this.s.g(j);
    }

    @Override // c.c.a.a.u1.v
    public s0 h() {
        return this.p;
    }

    public final t i(int i, Uri[] uriArr, c.c.a.a.l0[] l0VarArr, c.c.a.a.l0 l0Var, List<c.c.a.a.l0> list, Map<String, c.c.a.a.p1.e> map, long j) {
        return new t(i, this, new l(this.f3172b, this.f3173c, uriArr, l0VarArr, this.f3174d, this.f3175e, this.j, list), map, this.h, j, l0Var, this.f3176f, this.g);
    }

    public void k() {
        int i = this.o - 1;
        this.o = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (t tVar : this.q) {
            i2 += tVar.F.f2922b;
        }
        q0[] q0VarArr = new q0[i2];
        int i3 = 0;
        for (t tVar2 : this.q) {
            int i4 = tVar2.F.f2922b;
            int i5 = 0;
            while (i5 < i4) {
                q0VarArr[i3] = tVar2.F.f2923c[i5];
                i5++;
                i3++;
            }
        }
        this.p = new s0(q0VarArr);
        this.n.a(this);
    }

    @Override // c.c.a.a.u1.v
    public void m() {
        for (t tVar : this.q) {
            tVar.B();
        }
    }

    @Override // c.c.a.a.u1.v
    public void n(long j, boolean z) {
        for (t tVar : this.r) {
            if (tVar.z && !tVar.z()) {
                int length = tVar.r.length;
                for (int i = 0; i < length; i++) {
                    tVar.r[i].i(j, z, tVar.K[i]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0276  */
    @Override // c.c.a.a.u1.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long o(c.c.a.a.w1.r[] r38, boolean[] r39, c.c.a.a.u1.l0[] r40, boolean[] r41, long r42) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.x0.q.o(c.c.a.a.w1.r[], boolean[], c.c.a.a.u1.l0[], boolean[], long):long");
    }

    @Override // c.c.a.a.u1.v
    public long q(long j) {
        t[] tVarArr = this.r;
        if (tVarArr.length > 0) {
            boolean E = tVarArr[0].E(j, false);
            int i = 1;
            while (true) {
                t[] tVarArr2 = this.r;
                if (i >= tVarArr2.length) {
                    break;
                }
                tVarArr2[i].E(j, E);
                i++;
            }
            if (E) {
                this.j.f3193a.clear();
            }
        }
        return j;
    }

    @Override // c.c.a.a.u1.v
    public long s() {
        if (this.t) {
            return -9223372036854775807L;
        }
        this.g.n();
        this.t = true;
        return -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0396 A[LOOP:8: B:132:0x0390->B:134:0x0396, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.util.HashMap] */
    @Override // c.c.a.a.u1.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(c.c.a.a.u1.u r35, long r36) {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.x0.q.t(c.c.a.a.u1.u, long):void");
    }
}
