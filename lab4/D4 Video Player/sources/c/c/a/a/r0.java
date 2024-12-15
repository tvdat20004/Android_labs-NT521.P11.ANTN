package c.c.a.a;

import android.util.Pair;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: c, reason: collision with root package name */
    public long f2689c;

    /* renamed from: e, reason: collision with root package name */
    public int f2691e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2692f;
    public p0 g;
    public p0 h;
    public p0 i;
    public int j;
    public Object k;
    public long l;

    /* renamed from: a, reason: collision with root package name */
    public final i1 f2687a = new i1();

    /* renamed from: b, reason: collision with root package name */
    public final j1 f2688b = new j1();

    /* renamed from: d, reason: collision with root package name */
    public k1 f2690d = k1.f2035a;

    public p0 a() {
        p0 p0Var = this.g;
        if (p0Var != null) {
            if (p0Var == this.h) {
                this.h = p0Var.k;
            }
            p0Var.g();
            int i = this.j - 1;
            this.j = i;
            if (i == 0) {
                this.i = null;
                p0 p0Var2 = this.g;
                this.k = p0Var2.f2192b;
                this.l = p0Var2.f2196f.f2207a.f2975d;
            }
            this.g = this.g.k;
        } else {
            p0 p0Var3 = this.i;
            this.g = p0Var3;
            this.h = p0Var3;
        }
        return this.g;
    }

    public void b(boolean z) {
        p0 d2 = d();
        if (d2 != null) {
            this.k = z ? d2.f2192b : null;
            this.l = d2.f2196f.f2207a.f2975d;
            d2.g();
            l(d2);
        } else if (!z) {
            this.k = null;
        }
        this.g = null;
        this.i = null;
        this.h = null;
        this.j = 0;
    }

    public final q0 c(p0 p0Var, long j) {
        long j2;
        Object obj;
        long j3;
        long j4;
        long j5;
        q0 q0Var = p0Var.f2196f;
        long j6 = (p0Var.n + q0Var.f2211e) - j;
        long j7 = 0;
        if (q0Var.f2212f) {
            int d2 = this.f2690d.d(this.f2690d.b(q0Var.f2207a.f2972a), this.f2687a, this.f2688b, this.f2691e, this.f2692f);
            if (d2 == -1) {
                return null;
            }
            int i = this.f2690d.g(d2, this.f2687a, true).f2021b;
            Object obj2 = this.f2687a.f2020a;
            long j8 = q0Var.f2207a.f2975d;
            if (this.f2690d.m(i, this.f2688b).f2031d == d2) {
                Pair<Object, Long> k = this.f2690d.k(this.f2688b, this.f2687a, i, -9223372036854775807L, Math.max(0L, j6));
                if (k == null) {
                    return null;
                }
                Object obj3 = k.first;
                long longValue = ((Long) k.second).longValue();
                p0 p0Var2 = p0Var.k;
                if (p0Var2 == null || !p0Var2.f2192b.equals(obj3)) {
                    j5 = this.f2689c;
                    this.f2689c = 1 + j5;
                } else {
                    j5 = p0Var2.f2196f.f2207a.f2975d;
                }
                j4 = longValue;
                j7 = -9223372036854775807L;
                j3 = j5;
                obj = obj3;
            } else {
                obj = obj2;
                j3 = j8;
                j4 = 0;
            }
            return e(n(obj, j4, j3), j7, j4);
        }
        c.c.a.a.u1.w wVar = q0Var.f2207a;
        this.f2690d.h(wVar.f2972a, this.f2687a);
        if (!wVar.a()) {
            int c2 = this.f2687a.c(q0Var.f2210d);
            if (c2 == -1) {
                return g(wVar.f2972a, q0Var.f2211e, wVar.f2975d);
            }
            int e2 = this.f2687a.e(c2);
            if (this.f2687a.f(c2, e2)) {
                return f(wVar.f2972a, c2, e2, q0Var.f2211e, wVar.f2975d);
            }
            return null;
        }
        int i2 = wVar.f2973b;
        c.c.a.a.u1.u0.a[] aVarArr = this.f2687a.f2024e.f2937c;
        int i3 = aVarArr[i2].f2930a;
        if (i3 == -1) {
            return null;
        }
        int a2 = aVarArr[i2].a(wVar.f2974c);
        if (a2 < i3) {
            if (this.f2687a.f(i2, a2)) {
                return f(wVar.f2972a, i2, a2, q0Var.f2209c, wVar.f2975d);
            }
            return null;
        }
        long j9 = q0Var.f2209c;
        if (j9 == -9223372036854775807L) {
            k1 k1Var = this.f2690d;
            j1 j1Var = this.f2688b;
            i1 i1Var = this.f2687a;
            Pair<Object, Long> k2 = k1Var.k(j1Var, i1Var, i1Var.f2021b, -9223372036854775807L, Math.max(0L, j6));
            if (k2 == null) {
                return null;
            }
            j2 = ((Long) k2.second).longValue();
        } else {
            j2 = j9;
        }
        return g(wVar.f2972a, j2, wVar.f2975d);
    }

    public p0 d() {
        return i() ? this.g : this.i;
    }

    public final q0 e(c.c.a.a.u1.w wVar, long j, long j2) {
        this.f2690d.h(wVar.f2972a, this.f2687a);
        if (!wVar.a()) {
            return g(wVar.f2972a, j2, wVar.f2975d);
        }
        if (this.f2687a.f(wVar.f2973b, wVar.f2974c)) {
            return f(wVar.f2972a, wVar.f2973b, wVar.f2974c, j, wVar.f2975d);
        }
        return null;
    }

    public final q0 f(Object obj, int i, int i2, long j, long j2) {
        c.c.a.a.u1.w wVar = new c.c.a.a.u1.w(obj, i, i2, j2);
        k1 k1Var = this.f2690d;
        long a2 = k1Var.g(k1Var.b(obj), this.f2687a, true).a(wVar.f2973b, wVar.f2974c);
        if (i2 == this.f2687a.f2024e.f2937c[i].a(-1)) {
            Objects.requireNonNull(this.f2687a.f2024e);
        }
        return new q0(wVar, 0L, j, -9223372036854775807L, a2, false, false);
    }

    public final q0 g(Object obj, long j, long j2) {
        int b2 = this.f2687a.b(j);
        c.c.a.a.u1.w wVar = new c.c.a.a.u1.w(obj, j2, b2);
        boolean z = !wVar.a() && wVar.f2976e == -1;
        boolean j3 = j(wVar, z);
        long d2 = b2 != -1 ? this.f2687a.d(b2) : -9223372036854775807L;
        return new q0(wVar, j, -9223372036854775807L, d2, (d2 == -9223372036854775807L || d2 == Long.MIN_VALUE) ? this.f2687a.f2022c : d2, z, j3);
    }

    public q0 h(q0 q0Var) {
        long j;
        c.c.a.a.u1.w wVar = q0Var.f2207a;
        boolean z = !wVar.a() && wVar.f2976e == -1;
        boolean j2 = j(wVar, z);
        this.f2690d.h(q0Var.f2207a.f2972a, this.f2687a);
        if (wVar.a()) {
            j = this.f2687a.a(wVar.f2973b, wVar.f2974c);
        } else {
            j = q0Var.f2210d;
            if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
                j = this.f2687a.f2022c;
            }
        }
        return new q0(wVar, q0Var.f2208b, q0Var.f2209c, q0Var.f2210d, j, z, j2);
    }

    public boolean i() {
        return this.g != null;
    }

    public final boolean j(c.c.a.a.u1.w wVar, boolean z) {
        int b2 = this.f2690d.b(wVar.f2972a);
        if (!this.f2690d.m(this.f2690d.f(b2, this.f2687a).f2021b, this.f2688b).f2030c) {
            if ((this.f2690d.d(b2, this.f2687a, this.f2688b, this.f2691e, this.f2692f) == -1) && z) {
                return true;
            }
        }
        return false;
    }

    public void k(long j) {
        p0 p0Var = this.i;
        if (p0Var != null) {
            c.c.a.a.x1.p.g(p0Var.f());
            if (p0Var.f2194d) {
                p0Var.f2191a.g(j - p0Var.n);
            }
        }
    }

    public boolean l(p0 p0Var) {
        boolean z = false;
        c.c.a.a.x1.p.g(p0Var != null);
        this.i = p0Var;
        while (true) {
            p0Var = p0Var.k;
            if (p0Var == null) {
                break;
            }
            if (p0Var == this.h) {
                this.h = this.g;
                z = true;
            }
            p0Var.g();
            this.j--;
        }
        p0 p0Var2 = this.i;
        if (p0Var2.k != null) {
            p0Var2.b();
            p0Var2.k = null;
            p0Var2.c();
        }
        return z;
    }

    public c.c.a.a.u1.w m(Object obj, long j) {
        long j2;
        int b2;
        k1 k1Var = this.f2690d;
        int i = k1Var.g(k1Var.b(obj), this.f2687a, true).f2021b;
        Object obj2 = this.k;
        if (obj2 == null || (b2 = this.f2690d.b(obj2)) == -1 || this.f2690d.f(b2, this.f2687a).f2021b != i) {
            p0 d2 = d();
            while (true) {
                if (d2 == null) {
                    d2 = d();
                    while (d2 != null) {
                        int b3 = this.f2690d.b(d2.f2192b);
                        if (b3 == -1 || this.f2690d.f(b3, this.f2687a).f2021b != i) {
                            d2 = d2.k;
                        }
                    }
                    j2 = this.f2689c;
                    this.f2689c = 1 + j2;
                } else {
                    if (d2.f2192b.equals(obj)) {
                        break;
                    }
                    d2 = d2.k;
                }
            }
            j2 = d2.f2196f.f2207a.f2975d;
        } else {
            j2 = this.l;
        }
        return n(obj, j, j2);
    }

    public final c.c.a.a.u1.w n(Object obj, long j, long j2) {
        k1 k1Var = this.f2690d;
        k1Var.g(k1Var.b(obj), this.f2687a, true);
        int c2 = this.f2687a.c(j);
        return c2 == -1 ? new c.c.a.a.u1.w(obj, j2, this.f2687a.b(j)) : new c.c.a.a.u1.w(obj, c2, this.f2687a.e(c2), j2);
    }

    public final boolean o() {
        p0 p0Var;
        p0 d2 = d();
        if (d2 == null) {
            return true;
        }
        int b2 = this.f2690d.b(d2.f2192b);
        while (true) {
            b2 = this.f2690d.d(b2, this.f2687a, this.f2688b, this.f2691e, this.f2692f);
            while (true) {
                p0Var = d2.k;
                if (p0Var == null || d2.f2196f.f2212f) {
                    break;
                }
                d2 = p0Var;
            }
            if (b2 == -1 || p0Var == null || this.f2690d.b(p0Var.f2192b) != b2) {
                break;
            }
            d2 = p0Var;
        }
        boolean l = l(d2);
        d2.f2196f = h(d2.f2196f);
        return (l && i()) ? false : true;
    }
}
