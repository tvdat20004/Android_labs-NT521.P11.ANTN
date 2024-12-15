package c.c.a.a.u1.w0;

import c.c.a.a.i1;
import c.c.a.a.j1;
import c.c.a.a.k1;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public final long f2990b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2991c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2992d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2993e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2994f;
    public final long g;
    public final c.c.a.a.u1.w0.x.b h;
    public final Object i;

    public g(long j, long j2, int i, long j3, long j4, long j5, c.c.a.a.u1.w0.x.b bVar, Object obj) {
        this.f2990b = j;
        this.f2991c = j2;
        this.f2992d = i;
        this.f2993e = j3;
        this.f2994f = j4;
        this.g = j5;
        this.h = bVar;
        this.i = obj;
    }

    @Override // c.c.a.a.k1
    public int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f2992d) >= 0 && intValue < i()) {
            return intValue;
        }
        return -1;
    }

    @Override // c.c.a.a.k1
    public i1 g(int i, i1 i1Var, boolean z) {
        c.c.a.a.x1.p.f(i, 0, i());
        if (z) {
            String str = this.h.l.get(i).f3061a;
        }
        Integer valueOf = z ? Integer.valueOf(this.f2992d + i) : null;
        long a2 = c.c.a.a.s.a(this.h.d(i));
        long a3 = c.c.a.a.s.a(this.h.l.get(i).f3062b - this.h.b(0).f3062b) - this.f2993e;
        Objects.requireNonNull(i1Var);
        c.c.a.a.u1.u0.b bVar = c.c.a.a.u1.u0.b.f2934e;
        i1Var.f2020a = valueOf;
        i1Var.f2021b = 0;
        i1Var.f2022c = a2;
        i1Var.f2023d = a3;
        i1Var.f2024e = bVar;
        return i1Var;
    }

    @Override // c.c.a.a.k1
    public int i() {
        return this.h.c();
    }

    @Override // c.c.a.a.k1
    public Object l(int i) {
        c.c.a.a.x1.p.f(i, 0, i());
        return Integer.valueOf(this.f2992d + i);
    }

    @Override // c.c.a.a.k1
    public j1 n(int i, j1 j1Var, boolean z, long j) {
        o i2;
        c.c.a.a.x1.p.f(i, 0, 1);
        long j2 = this.g;
        c.c.a.a.u1.w0.x.b bVar = this.h;
        if (bVar.f3041d) {
            if (j > 0) {
                j2 += j;
                if (j2 > this.f2994f) {
                    j2 = -9223372036854775807L;
                }
            }
            long j3 = this.f2993e + j2;
            long e2 = bVar.e(0);
            int i3 = 0;
            while (i3 < this.h.c() - 1 && j3 >= e2) {
                j3 -= e2;
                i3++;
                e2 = this.h.e(i3);
            }
            c.c.a.a.u1.w0.x.g b2 = this.h.b(i3);
            int size = b2.f3063c.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    i4 = -1;
                    break;
                }
                if (b2.f3063c.get(i4).f3034b == 2) {
                    break;
                }
                i4++;
            }
            if (i4 != -1 && (i2 = b2.f3063c.get(i4).f3035c.get(0).i()) != null && i2.f(e2) != 0) {
                j2 = (i2.b(i2.a(j3, e2)) + j2) - j3;
            }
        }
        Object obj = z ? this.i : null;
        c.c.a.a.u1.w0.x.b bVar2 = this.h;
        boolean z2 = bVar2.f3041d && bVar2.f3042e != -9223372036854775807L && bVar2.f3039b == -9223372036854775807L;
        long j4 = this.f2994f;
        int i5 = i() - 1;
        long j5 = this.f2993e;
        j1Var.f2028a = obj;
        j1Var.f2029b = true;
        j1Var.f2030c = z2;
        j1Var.f2033f = j2;
        j1Var.g = j4;
        j1Var.f2031d = 0;
        j1Var.f2032e = i5;
        j1Var.h = j5;
        return j1Var;
    }

    @Override // c.c.a.a.k1
    public int o() {
        return 1;
    }
}
