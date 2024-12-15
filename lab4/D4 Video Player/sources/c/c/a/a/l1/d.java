package c.c.a.a.l1;

import android.os.SystemClock;
import android.view.Surface;
import c.c.a.a.a2.x;
import c.c.a.a.a2.z;
import c.c.a.a.j1;
import c.c.a.a.k1;
import c.c.a.a.l0;
import c.c.a.a.m1.t;
import c.c.a.a.s1.h;
import c.c.a.a.u0;
import c.c.a.a.u1.s0;
import c.c.a.a.u1.w;
import c.c.a.a.w1.s;
import c.c.a.a.x0;
import c.c.a.a.y1.g;
import c.c.a.a.z1.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public class d implements x0.a, h, t, z, g, x {

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet<f> f2051b;

    /* renamed from: c, reason: collision with root package name */
    public final c.c.a.a.z1.g f2052c;

    /* renamed from: d, reason: collision with root package name */
    public final j1 f2053d;

    /* renamed from: e, reason: collision with root package name */
    public final c f2054e;

    /* renamed from: f, reason: collision with root package name */
    public x0 f2055f;

    public d(x0 x0Var, c.c.a.a.z1.g gVar) {
        if (x0Var != null) {
            this.f2055f = x0Var;
        }
        Objects.requireNonNull(gVar);
        this.f2052c = gVar;
        this.f2051b = new CopyOnWriteArraySet<>();
        this.f2054e = new c();
        this.f2053d = new j1();
    }

    @Override // c.c.a.a.m1.t
    public final void A(l0 l0Var) {
        e G = G();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().k(G, 1, l0Var);
        }
    }

    public final e B(b bVar) {
        Objects.requireNonNull(this.f2055f);
        if (bVar == null) {
            int v = this.f2055f.v();
            c cVar = this.f2054e;
            int i = 0;
            b bVar2 = null;
            while (true) {
                if (i >= cVar.f2045a.size()) {
                    break;
                }
                b bVar3 = cVar.f2045a.get(i);
                int b2 = cVar.f2050f.b(bVar3.f2042a.f2972a);
                if (b2 != -1 && cVar.f2050f.f(b2, cVar.f2047c).f2021b == v) {
                    if (bVar2 != null) {
                        bVar2 = null;
                        break;
                    }
                    bVar2 = bVar3;
                }
                i++;
            }
            if (bVar2 == null) {
                k1 o = this.f2055f.o();
                if (!(v < o.o())) {
                    o = k1.f2035a;
                }
                return w(o, v, null);
            }
            bVar = bVar2;
        }
        return w(bVar.f2043b, bVar.f2044c, bVar.f2042a);
    }

    public final e C() {
        return B(this.f2054e.f2048d);
    }

    public final e D() {
        b bVar;
        c cVar = this.f2054e;
        if (cVar.f2045a.isEmpty()) {
            bVar = null;
        } else {
            bVar = cVar.f2045a.get(r0.size() - 1);
        }
        return B(bVar);
    }

    public final e E(int i, w wVar) {
        k1 k1Var = k1.f2035a;
        Objects.requireNonNull(this.f2055f);
        if (wVar != null) {
            b bVar = this.f2054e.f2046b.get(wVar);
            return bVar != null ? B(bVar) : w(k1Var, i, wVar);
        }
        k1 o = this.f2055f.o();
        if (i < o.o()) {
            k1Var = o;
        }
        return w(k1Var, i, null);
    }

    public final e F() {
        c cVar = this.f2054e;
        return B((cVar.f2045a.isEmpty() || cVar.f2050f.p() || cVar.g) ? null : cVar.f2045a.get(0));
    }

    public final e G() {
        return B(this.f2054e.f2049e);
    }

    public final void H(int i, w wVar) {
        e E = E(i, wVar);
        c cVar = this.f2054e;
        b remove = cVar.f2046b.remove(wVar);
        boolean z = false;
        if (remove != null) {
            cVar.f2045a.remove(remove);
            b bVar = cVar.f2049e;
            if (bVar != null && wVar.equals(bVar.f2042a)) {
                cVar.f2049e = cVar.f2045a.isEmpty() ? null : cVar.f2045a.get(0);
            }
            z = true;
        }
        if (z) {
            Iterator<f> it = this.f2051b.iterator();
            while (it.hasNext()) {
                it.next().s(E);
            }
        }
    }

    public final void I() {
        Iterator it = new ArrayList(this.f2054e.f2045a).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            H(bVar.f2044c, bVar.f2042a);
        }
    }

    @Override // c.c.a.a.a2.z
    public final void a(int i, int i2, int i3, float f2) {
        e G = G();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().e(G, i, i2, i3, f2);
        }
    }

    @Override // c.c.a.a.x0.a
    public final void b(boolean z, int i) {
        e F = F();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().p(F, z, i);
        }
    }

    @Override // c.c.a.a.x0.a
    public final void c(boolean z) {
        e F = F();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().x(F, z);
        }
    }

    @Override // c.c.a.a.m1.t
    public final void d(int i, long j, long j2) {
        e G = G();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().y(G, i, j, j2);
        }
    }

    @Override // c.c.a.a.x0.a
    public final void e(int i) {
        this.f2054e.a();
        e F = F();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().q(F, i);
        }
    }

    @Override // c.c.a.a.m1.t
    public final void f(c.c.a.a.o1.f fVar) {
        e C = C();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().l(C, 1, fVar);
        }
    }

    @Override // c.c.a.a.a2.z
    public final void g(Surface surface) {
        e G = G();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().z(G, surface);
        }
    }

    @Override // c.c.a.a.m1.t
    public final void h(c.c.a.a.o1.f fVar) {
        e F = F();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().a(F, 1, fVar);
        }
    }

    @Override // c.c.a.a.x0.a
    public final void i(s0 s0Var, s sVar) {
        e F = F();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().B(F, s0Var, sVar);
        }
    }

    @Override // c.c.a.a.a2.z
    public final void j(c.c.a.a.o1.f fVar) {
        e C = C();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().l(C, 2, fVar);
        }
    }

    @Override // c.c.a.a.m1.t
    public final void k(String str, long j, long j2) {
        e G = G();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().o(G, 1, str, j2);
        }
    }

    @Override // c.c.a.a.x0.a
    public final void l(boolean z) {
        e F = F();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().d(F, z);
        }
    }

    @Override // c.c.a.a.a2.z
    public final void m(String str, long j, long j2) {
        e G = G();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().o(G, 2, str, j2);
        }
    }

    @Override // c.c.a.a.x0.a
    public final void n(k1 k1Var, Object obj, int i) {
        c cVar = this.f2054e;
        for (int i2 = 0; i2 < cVar.f2045a.size(); i2++) {
            b b2 = cVar.b(cVar.f2045a.get(i2), k1Var);
            cVar.f2045a.set(i2, b2);
            cVar.f2046b.put(b2.f2042a, b2);
        }
        b bVar = cVar.f2049e;
        if (bVar != null) {
            cVar.f2049e = cVar.b(bVar, k1Var);
        }
        cVar.f2050f = k1Var;
        cVar.a();
        e F = F();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().t(F, i);
        }
    }

    @Override // c.c.a.a.a2.x
    public void o(int i, int i2) {
        e G = G();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().c(G, i, i2);
        }
    }

    @Override // c.c.a.a.x0.a
    public final void p(u0 u0Var) {
        e F = F();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().v(F, u0Var);
        }
    }

    @Override // c.c.a.a.x0.a
    public final void q(int i) {
        e F = F();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().i(F, i);
        }
    }

    @Override // c.c.a.a.s1.h
    public final void r(c.c.a.a.s1.c cVar) {
        e F = F();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().g(F, cVar);
        }
    }

    @Override // c.c.a.a.x0.a
    public final void s(c.c.a.a.z zVar) {
        e D = zVar.f3709b == 0 ? D() : F();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().E(D, zVar);
        }
    }

    @Override // c.c.a.a.a2.x
    public final void t() {
    }

    @Override // c.c.a.a.x0.a
    public final void u() {
        c cVar = this.f2054e;
        if (cVar.g) {
            cVar.g = false;
            cVar.a();
            e F = F();
            Iterator<f> it = this.f2051b.iterator();
            while (it.hasNext()) {
                it.next().m(F);
            }
        }
    }

    @Override // c.c.a.a.a2.z
    public final void v(int i, long j) {
        e C = C();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().h(C, i, j);
        }
    }

    @RequiresNonNull({"player"})
    public e w(k1 k1Var, int i, w wVar) {
        long b2;
        if (k1Var.p()) {
            wVar = null;
        }
        w wVar2 = wVar;
        Objects.requireNonNull((h0) this.f2052c);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = k1Var == this.f2055f.o() && i == this.f2055f.v();
        long j = 0;
        if (wVar2 == null || !wVar2.a()) {
            if (z) {
                b2 = this.f2055f.h();
            } else if (!k1Var.p()) {
                b2 = c.c.a.a.s.b(k1Var.m(i, this.f2053d).f2033f);
            }
            j = b2;
        } else {
            if (z && this.f2055f.y() == wVar2.f2973b && this.f2055f.g() == wVar2.f2974c) {
                b2 = this.f2055f.getCurrentPosition();
                j = b2;
            }
        }
        return new e(elapsedRealtime, k1Var, i, wVar2, j, this.f2055f.getCurrentPosition(), this.f2055f.i());
    }

    @Override // c.c.a.a.a2.z
    public final void x(l0 l0Var) {
        e G = G();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().k(G, 2, l0Var);
        }
    }

    @Override // c.c.a.a.a2.z
    public final void y(c.c.a.a.o1.f fVar) {
        e F = F();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().a(F, 2, fVar);
        }
    }

    @Override // c.c.a.a.m1.t
    public final void z(int i) {
        e G = G();
        Iterator<f> it = this.f2051b.iterator();
        while (it.hasNext()) {
            it.next().C(G, i);
        }
    }
}
