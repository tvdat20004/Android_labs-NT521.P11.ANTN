package c.c.a.a;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import c.c.a.a.x0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class c0 extends q implements x0 {

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.w1.w f1981b;

    /* renamed from: c, reason: collision with root package name */
    public final b1[] f1982c;

    /* renamed from: d, reason: collision with root package name */
    public final c.c.a.a.w1.v f1983d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f1984e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f1985f;
    public final Handler g;
    public final CopyOnWriteArrayList<o> h;
    public final i1 i;
    public final ArrayDeque<Runnable> j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public u0 r;
    public z s;
    public t0 t;
    public int u;
    public int v;
    public long w;

    @SuppressLint({"HandlerLeak"})
    public c0(b1[] b1VarArr, c.c.a.a.w1.v vVar, o0 o0Var, c.c.a.a.y1.h hVar, c.c.a.a.z1.g gVar, Looper looper) {
        StringBuilder j = c.a.a.a.a.j("Init ");
        j.append(Integer.toHexString(System.identityHashCode(this)));
        j.append(" [");
        j.append("ExoPlayerLib/2.10.4");
        j.append("] [");
        j.append(c.c.a.a.z1.l0.f3765e);
        j.append("]");
        Log.i("ExoPlayerImpl", j.toString());
        c.c.a.a.x1.p.g(b1VarArr.length > 0);
        this.f1982c = b1VarArr;
        Objects.requireNonNull(vVar);
        this.f1983d = vVar;
        this.k = false;
        this.m = 0;
        this.n = false;
        this.h = new CopyOnWriteArrayList<>();
        c.c.a.a.w1.w wVar = new c.c.a.a.w1.w(new c1[b1VarArr.length], new c.c.a.a.w1.r[b1VarArr.length], null);
        this.f1981b = wVar;
        this.i = new i1();
        this.r = u0.f2816e;
        d1 d1Var = d1.f1990d;
        a0 a0Var = new a0(this, looper);
        this.f1984e = a0Var;
        this.t = t0.c(0L, wVar);
        this.j = new ArrayDeque<>();
        i0 i0Var = new i0(b1VarArr, vVar, wVar, o0Var, hVar, this.k, this.m, this.n, a0Var, gVar);
        this.f1985f = i0Var;
        this.g = new Handler(i0Var.i.getLooper());
    }

    public static void G(CopyOnWriteArrayList<o> copyOnWriteArrayList, p pVar) {
        Iterator<o> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            o next = it.next();
            if (!next.f2164b) {
                pVar.a(next.f2163a);
            }
        }
    }

    public z0 E(b1 b1Var) {
        return new z0(this.f1985f, b1Var, this.t.f2805a, v(), this.g);
    }

    public final t0 F(boolean z, boolean z2, int i) {
        int b2;
        if (z) {
            this.u = 0;
            this.v = 0;
            this.w = 0L;
        } else {
            this.u = v();
            if (L()) {
                b2 = this.v;
            } else {
                t0 t0Var = this.t;
                b2 = t0Var.f2805a.b(t0Var.f2807c.f2972a);
            }
            this.v = b2;
            this.w = getCurrentPosition();
        }
        boolean z3 = z || z2;
        t0 t0Var2 = this.t;
        c.c.a.a.u1.w d2 = z3 ? t0Var2.d(this.n, this.f2206a) : t0Var2.f2807c;
        long j = z3 ? 0L : this.t.m;
        return new t0(z2 ? k1.f2035a : this.t.f2805a, z2 ? null : this.t.f2806b, d2, j, z3 ? -9223372036854775807L : this.t.f2809e, i, false, z2 ? c.c.a.a.u1.s0.f2921e : this.t.h, z2 ? this.f1981b : this.t.i, d2, j, 0L, j);
    }

    public final void H(final p pVar) {
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.h);
        I(new Runnable() { // from class: c.c.a.a.i
            @Override // java.lang.Runnable
            public final void run() {
                c0.G(copyOnWriteArrayList, pVar);
            }
        });
    }

    public final void I(Runnable runnable) {
        boolean z = !this.j.isEmpty();
        this.j.addLast(runnable);
        if (z) {
            return;
        }
        while (!this.j.isEmpty()) {
            this.j.peekFirst().run();
            this.j.removeFirst();
        }
    }

    public final long J(c.c.a.a.u1.w wVar, long j) {
        long b2 = s.b(j);
        this.t.f2805a.h(wVar.f2972a, this.i);
        return b2 + s.b(this.i.f2023d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public void K(final boolean z, boolean z2) {
        ?? r5 = (!z || z2) ? 0 : 1;
        if (this.l != r5) {
            this.l = r5;
            this.f1985f.h.a(1, r5, 0).sendToTarget();
        }
        if (this.k != z) {
            this.k = z;
            final int i = this.t.f2810f;
            H(new p() { // from class: c.c.a.a.a
                @Override // c.c.a.a.p
                public final void a(x0.a aVar) {
                    aVar.b(z, i);
                }
            });
        }
    }

    public final boolean L() {
        return this.t.f2805a.p() || this.o > 0;
    }

    public void M(boolean z) {
        if (z) {
            this.s = null;
        }
        t0 F = F(z, z, 1);
        this.o++;
        this.f1985f.h.a(6, z ? 1 : 0, 0).sendToTarget();
        N(F, false, 4, 1, false);
    }

    public final void N(t0 t0Var, boolean z, int i, int i2, boolean z2) {
        t0 t0Var2 = this.t;
        this.t = t0Var;
        I(new b0(t0Var, t0Var2, this.h, this.f1983d, z, i, i2, z2, this.k));
    }

    @Override // c.c.a.a.x0
    public u0 a() {
        return this.r;
    }

    @Override // c.c.a.a.x0
    public void b(final int i) {
        if (this.m != i) {
            this.m = i;
            this.f1985f.h.a(12, i, 0).sendToTarget();
            H(new p() { // from class: c.c.a.a.l
                @Override // c.c.a.a.p
                public final void a(x0.a aVar) {
                    aVar.q(i);
                }
            });
        }
    }

    @Override // c.c.a.a.x0
    public void c(boolean z) {
        K(z, false);
    }

    @Override // c.c.a.a.x0
    public y0 d() {
        return null;
    }

    @Override // c.c.a.a.x0
    public boolean e() {
        return !L() && this.t.f2807c.a();
    }

    @Override // c.c.a.a.x0
    public void f(x0.a aVar) {
        this.h.addIfAbsent(new o(aVar));
    }

    @Override // c.c.a.a.x0
    public int g() {
        if (e()) {
            return this.t.f2807c.f2974c;
        }
        return -1;
    }

    @Override // c.c.a.a.x0
    public long getCurrentPosition() {
        if (L()) {
            return this.w;
        }
        if (this.t.f2807c.a()) {
            return s.b(this.t.m);
        }
        t0 t0Var = this.t;
        return J(t0Var.f2807c, t0Var.m);
    }

    @Override // c.c.a.a.x0
    public long getDuration() {
        if (!e()) {
            return A();
        }
        t0 t0Var = this.t;
        c.c.a.a.u1.w wVar = t0Var.f2807c;
        t0Var.f2805a.h(wVar.f2972a, this.i);
        return s.b(this.i.a(wVar.f2973b, wVar.f2974c));
    }

    @Override // c.c.a.a.x0
    public long h() {
        if (!e()) {
            return getCurrentPosition();
        }
        t0 t0Var = this.t;
        t0Var.f2805a.h(t0Var.f2807c.f2972a, this.i);
        t0 t0Var2 = this.t;
        return t0Var2.f2809e == -9223372036854775807L ? s.b(t0Var2.f2805a.m(v(), this.f2206a).f2033f) : s.b(this.i.f2023d) + s.b(this.t.f2809e);
    }

    @Override // c.c.a.a.x0
    public long i() {
        return s.b(this.t.l);
    }

    @Override // c.c.a.a.x0
    public void j(int i, long j) {
        k1 k1Var = this.t.f2805a;
        if (i < 0 || (!k1Var.p() && i >= k1Var.o())) {
            throw new n0(k1Var, i, j);
        }
        this.q = true;
        this.o++;
        if (e()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            this.f1984e.obtainMessage(0, 1, -1, this.t).sendToTarget();
            return;
        }
        this.u = i;
        if (k1Var.p()) {
            this.w = j == -9223372036854775807L ? 0L : j;
            this.v = 0;
        } else {
            long a2 = j == -9223372036854775807L ? k1Var.m(i, this.f2206a).f2033f : s.a(j);
            Pair<Object, Long> j2 = k1Var.j(this.f2206a, this.i, i, a2);
            this.w = s.b(a2);
            this.v = k1Var.b(j2.first);
        }
        this.f1985f.h.b(3, new h0(k1Var, i, s.a(j))).sendToTarget();
        H(new p() { // from class: c.c.a.a.b
            @Override // c.c.a.a.p
            public final void a(x0.a aVar) {
                aVar.e(1);
            }
        });
    }

    @Override // c.c.a.a.x0
    public c.c.a.a.u1.s0 k() {
        return this.t.h;
    }

    @Override // c.c.a.a.x0
    public boolean l() {
        return this.k;
    }

    @Override // c.c.a.a.x0
    public int m() {
        return this.m;
    }

    @Override // c.c.a.a.x0
    public void n(final boolean z) {
        if (this.n != z) {
            this.n = z;
            this.f1985f.h.a(13, z ? 1 : 0, 0).sendToTarget();
            H(new p() { // from class: c.c.a.a.h
                @Override // c.c.a.a.p
                public final void a(x0.a aVar) {
                    aVar.l(z);
                }
            });
        }
    }

    @Override // c.c.a.a.x0
    public k1 o() {
        return this.t.f2805a;
    }

    @Override // c.c.a.a.x0
    public int p() {
        return this.t.f2810f;
    }

    @Override // c.c.a.a.x0
    public Looper q() {
        return this.f1984e.getLooper();
    }

    @Override // c.c.a.a.x0
    public boolean r() {
        return this.n;
    }

    @Override // c.c.a.a.x0
    public z s() {
        return this.s;
    }

    @Override // c.c.a.a.x0
    public void t(x0.a aVar) {
        Iterator<o> it = this.h.iterator();
        while (it.hasNext()) {
            o next = it.next();
            if (next.f2163a.equals(aVar)) {
                next.f2164b = true;
                this.h.remove(next);
            }
        }
    }

    @Override // c.c.a.a.x0
    public long u() {
        if (L()) {
            return this.w;
        }
        t0 t0Var = this.t;
        if (t0Var.j.f2975d != t0Var.f2807c.f2975d) {
            return t0Var.f2805a.m(v(), this.f2206a).a();
        }
        long j = t0Var.k;
        if (this.t.j.a()) {
            t0 t0Var2 = this.t;
            i1 h = t0Var2.f2805a.h(t0Var2.j.f2972a, this.i);
            long d2 = h.d(this.t.j.f2973b);
            j = d2 == Long.MIN_VALUE ? h.f2022c : d2;
        }
        return J(this.t.j, j);
    }

    @Override // c.c.a.a.x0
    public int v() {
        if (L()) {
            return this.u;
        }
        t0 t0Var = this.t;
        return t0Var.f2805a.h(t0Var.f2807c.f2972a, this.i).f2021b;
    }

    @Override // c.c.a.a.x0
    public c.c.a.a.w1.s w() {
        return this.t.i.f3452c;
    }

    @Override // c.c.a.a.x0
    public int x(int i) {
        return ((r) this.f1982c[i]).f2682b;
    }

    @Override // c.c.a.a.x0
    public int y() {
        if (e()) {
            return this.t.f2807c.f2973b;
        }
        return -1;
    }

    @Override // c.c.a.a.x0
    public g1 z() {
        return null;
    }
}
