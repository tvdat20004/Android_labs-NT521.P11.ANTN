package c.c.a.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i0 implements Handler.Callback, c.c.a.a.u1.u, w {
    public int A;
    public boolean B;
    public boolean C;
    public int D;
    public h0 E;
    public long F;
    public int G;

    /* renamed from: b, reason: collision with root package name */
    public final b1[] f2015b;

    /* renamed from: c, reason: collision with root package name */
    public final r[] f2016c;

    /* renamed from: d, reason: collision with root package name */
    public final c.c.a.a.w1.v f2017d;

    /* renamed from: e, reason: collision with root package name */
    public final c.c.a.a.w1.w f2018e;

    /* renamed from: f, reason: collision with root package name */
    public final o0 f2019f;
    public final c.c.a.a.y1.h g;
    public final c.c.a.a.z1.i0 h;
    public final HandlerThread i;
    public final Handler j;
    public final j1 k;
    public final i1 l;
    public final long m;
    public final boolean n;
    public final x o;
    public final ArrayList<f0> q;
    public final c.c.a.a.z1.g r;
    public t0 u;
    public c.c.a.a.u1.l v;
    public b1[] w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final r0 s = new r0();
    public d1 t = d1.f1990d;
    public final g0 p = new g0(null);

    public i0(b1[] b1VarArr, c.c.a.a.w1.v vVar, c.c.a.a.w1.w wVar, o0 o0Var, c.c.a.a.y1.h hVar, boolean z, int i, boolean z2, Handler handler, c.c.a.a.z1.g gVar) {
        this.f2015b = b1VarArr;
        this.f2017d = vVar;
        this.f2018e = wVar;
        this.f2019f = o0Var;
        this.g = hVar;
        this.y = z;
        this.A = i;
        this.B = z2;
        this.j = handler;
        this.r = gVar;
        v vVar2 = (v) o0Var;
        this.m = vVar2.i;
        this.n = vVar2.j;
        this.u = t0.c(-9223372036854775807L, wVar);
        this.f2016c = new r[b1VarArr.length];
        for (int i2 = 0; i2 < b1VarArr.length; i2++) {
            ((r) b1VarArr[i2]).f2684d = i2;
            r[] rVarArr = this.f2016c;
            r rVar = (r) b1VarArr[i2];
            Objects.requireNonNull(rVar);
            rVarArr[i2] = rVar;
        }
        this.o = new x(this, gVar);
        this.q = new ArrayList<>();
        this.w = new b1[0];
        this.k = new j1();
        this.l = new i1();
        vVar.f3448a = this;
        vVar.f3449b = hVar;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.i = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        Objects.requireNonNull((c.c.a.a.z1.h0) gVar);
        this.h = new c.c.a.a.z1.i0(new Handler(looper, this));
    }

    public static l0[] h(c.c.a.a.w1.r rVar) {
        int length = rVar != null ? ((c.c.a.a.w1.g) rVar).f3409c.length : 0;
        l0[] l0VarArr = new l0[length];
        for (int i = 0; i < length; i++) {
            l0VarArr[i] = ((c.c.a.a.w1.g) rVar).f3410d[i];
        }
        return l0VarArr;
    }

    public final Object A(Object obj, k1 k1Var, k1 k1Var2) {
        int b2 = k1Var.b(obj);
        int i = k1Var.i();
        int i2 = b2;
        int i3 = -1;
        for (int i4 = 0; i4 < i && i3 == -1; i4++) {
            i2 = k1Var.d(i2, this.l, this.k, this.A, this.B);
            if (i2 == -1) {
                break;
            }
            i3 = k1Var2.b(k1Var.l(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return k1Var2.l(i3);
    }

    public final void B(long j, long j2) {
        this.h.f3752a.removeMessages(2);
        this.h.f3752a.sendEmptyMessageAtTime(2, j + j2);
    }

    public final void C(boolean z) {
        c.c.a.a.u1.w wVar = this.s.g.f2196f.f2207a;
        long E = E(wVar, this.u.m, true);
        if (E != this.u.m) {
            t0 t0Var = this.u;
            this.u = t0Var.a(wVar, E, t0Var.f2809e, j());
            if (z) {
                this.p.b(4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(c.c.a.a.h0 r23) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.i0.D(c.c.a.a.h0):void");
    }

    public final long E(c.c.a.a.u1.w wVar, long j, boolean z) {
        P();
        this.z = false;
        M(2);
        p0 p0Var = this.s.g;
        p0 p0Var2 = p0Var;
        while (true) {
            if (p0Var2 == null) {
                break;
            }
            if (wVar.equals(p0Var2.f2196f.f2207a) && p0Var2.f2194d) {
                this.s.l(p0Var2);
                break;
            }
            p0Var2 = this.s.a();
        }
        if (z || p0Var != p0Var2 || (p0Var2 != null && p0Var2.n + j < 0)) {
            for (b1 b1Var : this.w) {
                d(b1Var);
            }
            this.w = new b1[0];
            p0Var = null;
            if (p0Var2 != null) {
                p0Var2.n = 0L;
            }
        }
        if (p0Var2 != null) {
            S(p0Var);
            if (p0Var2.f2195e) {
                long q = p0Var2.f2191a.q(j);
                p0Var2.f2191a.n(q - this.m, this.n);
                j = q;
            }
            y(j);
            r();
        } else {
            this.s.b(true);
            this.u = this.u.b(c.c.a.a.u1.s0.f2921e, this.f2018e);
            y(j);
        }
        m(false);
        this.h.c(2);
        return j;
    }

    public final void F(z0 z0Var) {
        if (z0Var.f3715f.getLooper() != this.h.f3752a.getLooper()) {
            this.h.b(16, z0Var).sendToTarget();
            return;
        }
        b(z0Var);
        int i = this.u.f2810f;
        if (i == 3 || i == 2) {
            this.h.c(2);
        }
    }

    public final void G(final z0 z0Var) {
        z0Var.f3715f.post(new Runnable() { // from class: c.c.a.a.m
            @Override // java.lang.Runnable
            public final void run() {
                i0 i0Var = i0.this;
                z0 z0Var2 = z0Var;
                Objects.requireNonNull(i0Var);
                try {
                    i0Var.b(z0Var2);
                } catch (z e2) {
                    Log.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
                    throw new RuntimeException(e2);
                }
            }
        });
    }

    public final void H(boolean z, AtomicBoolean atomicBoolean) {
        if (this.C != z) {
            this.C = z;
            if (!z) {
                for (b1 b1Var : this.f2015b) {
                    if (((r) b1Var).f2685e == 0) {
                        ((r) b1Var).s();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void I(boolean z) {
        t0 t0Var = this.u;
        if (t0Var.g != z) {
            this.u = new t0(t0Var.f2805a, t0Var.f2806b, t0Var.f2807c, t0Var.f2808d, t0Var.f2809e, t0Var.f2810f, z, t0Var.h, t0Var.i, t0Var.j, t0Var.k, t0Var.l, t0Var.m);
        }
    }

    public final void J(boolean z) {
        this.z = false;
        this.y = z;
        if (!z) {
            P();
            R();
            return;
        }
        int i = this.u.f2810f;
        if (i == 3) {
            N();
        } else if (i != 2) {
            return;
        }
        this.h.c(2);
    }

    public final void K(int i) {
        this.A = i;
        r0 r0Var = this.s;
        r0Var.f2691e = i;
        if (!r0Var.o()) {
            C(true);
        }
        m(false);
    }

    public final void L(boolean z) {
        this.B = z;
        r0 r0Var = this.s;
        r0Var.f2692f = z;
        if (!r0Var.o()) {
            C(true);
        }
        m(false);
    }

    public final void M(int i) {
        t0 t0Var = this.u;
        if (t0Var.f2810f != i) {
            this.u = new t0(t0Var.f2805a, t0Var.f2806b, t0Var.f2807c, t0Var.f2808d, t0Var.f2809e, i, t0Var.g, t0Var.h, t0Var.i, t0Var.j, t0Var.k, t0Var.l, t0Var.m);
        }
    }

    public final void N() {
        this.z = false;
        c.c.a.a.z1.g0 g0Var = this.o.f3454b;
        if (!g0Var.f3741c) {
            Objects.requireNonNull((c.c.a.a.z1.h0) g0Var.f3740b);
            g0Var.f3743e = SystemClock.elapsedRealtime();
            g0Var.f3741c = true;
        }
        for (b1 b1Var : this.w) {
            r rVar = (r) b1Var;
            c.c.a.a.x1.p.g(rVar.f2685e == 1);
            rVar.f2685e = 2;
            rVar.o();
        }
    }

    public final void O(boolean z, boolean z2, boolean z3) {
        x(z || !this.C, true, z2, z2);
        this.p.a(this.D + (z3 ? 1 : 0));
        this.D = 0;
        ((v) this.f2019f).b(true);
        M(1);
    }

    public final void P() {
        c.c.a.a.z1.g0 g0Var = this.o.f3454b;
        if (g0Var.f3741c) {
            g0Var.c(g0Var.i());
            g0Var.f3741c = false;
        }
        for (b1 b1Var : this.w) {
            g(b1Var);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Q(c.c.a.a.u1.s0 s0Var, c.c.a.a.w1.w wVar) {
        boolean z;
        o0 o0Var = this.f2019f;
        b1[] b1VarArr = this.f2015b;
        c.c.a.a.w1.s sVar = wVar.f3452c;
        v vVar = (v) o0Var;
        Objects.requireNonNull(vVar);
        int i = 0;
        while (true) {
            if (i >= b1VarArr.length) {
                z = false;
                break;
            } else {
                if (((r) b1VarArr[i]).f2682b == 2 && sVar.f3441b[i] != null) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        vVar.m = z;
        int i2 = vVar.g;
        if (i2 == -1) {
            i2 = 0;
            for (int i3 = 0; i3 < b1VarArr.length; i3++) {
                if (sVar.f3441b[i3] != null) {
                    int i4 = ((r) b1VarArr[i3]).f2682b;
                    int i5 = c.c.a.a.z1.l0.f3761a;
                    int i6 = 131072;
                    switch (i4) {
                        case 0:
                            i6 = 16777216;
                            i2 += i6;
                            break;
                        case 1:
                            i6 = 3538944;
                            i2 += i6;
                            break;
                        case 2:
                            i6 = 13107200;
                            i2 += i6;
                            break;
                        case 3:
                        case 4:
                        case 5:
                            i2 += i6;
                            break;
                        case 6:
                            i6 = 0;
                            i2 += i6;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        vVar.k = i2;
        vVar.f3238a.b(i2);
    }

    public final void R() {
        long i;
        if (this.s.i()) {
            p0 p0Var = this.s.g;
            long s = p0Var.f2191a.s();
            if (s != -9223372036854775807L) {
                y(s);
                if (s != this.u.m) {
                    t0 t0Var = this.u;
                    this.u = t0Var.a(t0Var.f2807c, s, t0Var.f2809e, j());
                    this.p.b(4);
                }
            } else {
                x xVar = this.o;
                if (xVar.d()) {
                    xVar.c();
                    i = xVar.f3457e.i();
                } else {
                    i = xVar.f3454b.i();
                }
                this.F = i;
                long j = i - p0Var.n;
                long j2 = this.u.m;
                if (!this.q.isEmpty() && !this.u.f2807c.a()) {
                    t0 t0Var2 = this.u;
                    int i2 = (t0Var2.f2808d > j2 ? 1 : (t0Var2.f2808d == j2 ? 0 : -1));
                    t0Var2.f2805a.b(t0Var2.f2807c.f2972a);
                    int i3 = this.G;
                    if ((i3 > 0 ? this.q.get(i3 - 1) : null) != null) {
                        throw null;
                    }
                    f0 f0Var = this.G < this.q.size() ? this.q.get(this.G) : null;
                    if (f0Var != null) {
                        throw null;
                    }
                    if (f0Var != null) {
                        throw null;
                    }
                }
                this.u.m = j;
            }
            this.u.k = this.s.i.d();
            this.u.l = j();
        }
    }

    public final void S(p0 p0Var) {
        p0 p0Var2 = this.s.g;
        if (p0Var2 == null || p0Var == p0Var2) {
            return;
        }
        boolean[] zArr = new boolean[this.f2015b.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            b1[] b1VarArr = this.f2015b;
            if (i >= b1VarArr.length) {
                t0 t0Var = this.u;
                c.c.a.a.u1.s0 s0Var = p0Var2.l;
                Objects.requireNonNull(s0Var);
                c.c.a.a.w1.w wVar = p0Var2.m;
                Objects.requireNonNull(wVar);
                this.u = t0Var.b(s0Var, wVar);
                f(zArr, i2);
                return;
            }
            b1 b1Var = b1VarArr[i];
            r rVar = (r) b1Var;
            zArr[i] = rVar.f2685e != 0;
            c.c.a.a.w1.w wVar2 = p0Var2.m;
            Objects.requireNonNull(wVar2);
            if (wVar2.b(i)) {
                i2++;
            }
            if (zArr[i]) {
                c.c.a.a.w1.w wVar3 = p0Var2.m;
                Objects.requireNonNull(wVar3);
                if (!wVar3.b(i) || (rVar.j && rVar.f2686f == p0Var.f2193c[i])) {
                    d(b1Var);
                }
            }
            i++;
        }
    }

    @Override // c.c.a.a.u1.u
    public void a(c.c.a.a.u1.v vVar) {
        this.h.b(9, vVar).sendToTarget();
    }

    public final void b(z0 z0Var) {
        z0Var.a();
        try {
            z0Var.f3710a.g(z0Var.f3713d, z0Var.f3714e);
        } finally {
            z0Var.b(true);
        }
    }

    @Override // c.c.a.a.u1.m0
    public void c(c.c.a.a.u1.v vVar) {
        this.h.b(10, vVar).sendToTarget();
    }

    public final void d(b1 b1Var) {
        x xVar = this.o;
        if (b1Var == xVar.f3456d) {
            xVar.f3457e = null;
            xVar.f3456d = null;
        }
        g(b1Var);
        r rVar = (r) b1Var;
        c.c.a.a.x1.p.g(rVar.f2685e == 1);
        rVar.f2685e = 0;
        rVar.f2686f = null;
        rVar.g = null;
        rVar.j = false;
        rVar.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x038e, code lost:
    
        if (r5 >= r0.k) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0397, code lost:
    
        if (r0 == false) goto L226;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03fb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.i0.e():void");
    }

    public final void f(boolean[] zArr, int i) {
        int i2;
        c.c.a.a.z1.s sVar;
        this.w = new b1[i];
        c.c.a.a.w1.w wVar = this.s.g.m;
        Objects.requireNonNull(wVar);
        for (int i3 = 0; i3 < this.f2015b.length; i3++) {
            if (!wVar.b(i3)) {
                ((r) this.f2015b[i3]).s();
            }
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.f2015b.length) {
            if (wVar.b(i4)) {
                boolean z = zArr[i4];
                int i6 = i5 + 1;
                p0 p0Var = this.s.g;
                b1 b1Var = this.f2015b[i4];
                this.w[i5] = b1Var;
                r rVar = (r) b1Var;
                if (rVar.f2685e == 0) {
                    c.c.a.a.w1.w wVar2 = p0Var.m;
                    Objects.requireNonNull(wVar2);
                    c1 c1Var = wVar2.f3451b[i4];
                    l0[] h = h(wVar2.f3452c.f3441b[i4]);
                    boolean z2 = this.y && this.u.f2810f == 3;
                    boolean z3 = !z && z2;
                    c.c.a.a.u1.l0 l0Var = p0Var.f2193c[i4];
                    long j = this.F;
                    i2 = i4;
                    long j2 = p0Var.n;
                    c.c.a.a.x1.p.g(rVar.f2685e == 0);
                    rVar.f2683c = c1Var;
                    rVar.f2685e = 1;
                    rVar.l(z3);
                    c.c.a.a.x1.p.g(!rVar.j);
                    rVar.f2686f = l0Var;
                    rVar.i = j2;
                    rVar.g = h;
                    rVar.h = j2;
                    rVar.q(h, j2);
                    rVar.m(j, z3);
                    x xVar = this.o;
                    Objects.requireNonNull(xVar);
                    c.c.a.a.z1.s e2 = b1Var.e();
                    if (e2 != null && e2 != (sVar = xVar.f3457e)) {
                        if (sVar != null) {
                            throw new z(2, new IllegalStateException("Multiple renderer media clocks enabled."), -1);
                        }
                        xVar.f3457e = e2;
                        xVar.f3456d = b1Var;
                        e2.b(xVar.f3454b.f3744f);
                        xVar.c();
                    }
                    if (z2) {
                        c.c.a.a.x1.p.g(rVar.f2685e == 1);
                        rVar.f2685e = 2;
                        rVar.o();
                    }
                } else {
                    i2 = i4;
                }
                i5 = i6;
            } else {
                i2 = i4;
            }
            i4 = i2 + 1;
        }
    }

    public final void g(b1 b1Var) {
        if (((r) b1Var).f2685e == 2) {
            r rVar = (r) b1Var;
            c.c.a.a.x1.p.g(rVar.f2685e == 2);
            rVar.f2685e = 1;
            rVar.p();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleMessage(android.os.Message r8) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.i0.handleMessage(android.os.Message):boolean");
    }

    public final Pair<Object, Long> i(k1 k1Var, int i, long j) {
        return k1Var.j(this.k, this.l, i, j);
    }

    public final long j() {
        return k(this.u.k);
    }

    public final long k(long j) {
        p0 p0Var = this.s.i;
        if (p0Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.F - p0Var.n));
    }

    public final void l(c.c.a.a.u1.v vVar) {
        r0 r0Var = this.s;
        p0 p0Var = r0Var.i;
        if (p0Var != null && p0Var.f2191a == vVar) {
            r0Var.k(this.F);
            r();
        }
    }

    public final void m(boolean z) {
        p0 p0Var;
        boolean z2;
        i0 i0Var = this;
        p0 p0Var2 = i0Var.s.i;
        c.c.a.a.u1.w wVar = p0Var2 == null ? i0Var.u.f2807c : p0Var2.f2196f.f2207a;
        boolean z3 = !i0Var.u.j.equals(wVar);
        if (z3) {
            t0 t0Var = i0Var.u;
            z2 = z3;
            p0Var = p0Var2;
            i0Var = this;
            i0Var.u = new t0(t0Var.f2805a, t0Var.f2806b, t0Var.f2807c, t0Var.f2808d, t0Var.f2809e, t0Var.f2810f, t0Var.g, t0Var.h, t0Var.i, wVar, t0Var.k, t0Var.l, t0Var.m);
        } else {
            p0Var = p0Var2;
            z2 = z3;
        }
        t0 t0Var2 = i0Var.u;
        t0Var2.k = p0Var == null ? t0Var2.m : p0Var.d();
        i0Var.u.l = j();
        if ((z2 || z) && p0Var != null) {
            p0 p0Var3 = p0Var;
            if (p0Var3.f2194d) {
                c.c.a.a.u1.s0 s0Var = p0Var3.l;
                Objects.requireNonNull(s0Var);
                c.c.a.a.w1.w wVar2 = p0Var3.m;
                Objects.requireNonNull(wVar2);
                i0Var.Q(s0Var, wVar2);
            }
        }
    }

    public final void n(c.c.a.a.u1.v vVar) {
        p0 p0Var = this.s.i;
        if (p0Var != null && p0Var.f2191a == vVar) {
            float f2 = this.o.a().f2817a;
            k1 k1Var = this.u.f2805a;
            p0Var.f2194d = true;
            p0Var.l = p0Var.f2191a.h();
            c.c.a.a.w1.w h = p0Var.h(f2, k1Var);
            Objects.requireNonNull(h);
            long a2 = p0Var.a(h, p0Var.f2196f.f2208b, false, new boolean[p0Var.h.length]);
            long j = p0Var.n;
            q0 q0Var = p0Var.f2196f;
            long j2 = q0Var.f2208b;
            p0Var.n = (j2 - a2) + j;
            if (a2 != j2) {
                q0Var = new q0(q0Var.f2207a, a2, q0Var.f2209c, q0Var.f2210d, q0Var.f2211e, q0Var.f2212f, q0Var.g);
            }
            p0Var.f2196f = q0Var;
            c.c.a.a.u1.s0 s0Var = p0Var.l;
            Objects.requireNonNull(s0Var);
            c.c.a.a.w1.w wVar = p0Var.m;
            Objects.requireNonNull(wVar);
            Q(s0Var, wVar);
            if (!this.s.i()) {
                y(this.s.a().f2196f.f2208b);
                S(null);
            }
            r();
        }
    }

    public final void o(u0 u0Var) {
        int i;
        this.j.obtainMessage(1, u0Var).sendToTarget();
        float f2 = u0Var.f2817a;
        p0 d2 = this.s.d();
        while (true) {
            i = 0;
            if (d2 == null || !d2.f2194d) {
                break;
            }
            c.c.a.a.w1.w wVar = d2.m;
            Objects.requireNonNull(wVar);
            c.c.a.a.w1.r[] a2 = wVar.f3452c.a();
            int length = a2.length;
            while (i < length) {
                c.c.a.a.w1.r rVar = a2[i];
                if (rVar != null) {
                    rVar.d(f2);
                }
                i++;
            }
            d2 = d2.k;
        }
        b1[] b1VarArr = this.f2015b;
        int length2 = b1VarArr.length;
        while (i < length2) {
            b1 b1Var = b1VarArr[i];
            if (b1Var != null) {
                b1Var.h(u0Var.f2817a);
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0233 A[LOOP:2: B:100:0x0233->B:107:0x0233, LOOP_START, PHI: r1
      0x0233: PHI (r1v33 c.c.a.a.p0) = (r1v28 c.c.a.a.p0), (r1v34 c.c.a.a.p0) binds: [B:99:0x0231, B:107:0x0233] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(c.c.a.a.e0 r39) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.i0.p(c.c.a.a.e0):void");
    }

    public final boolean q() {
        p0 p0Var = this.s.g;
        p0 p0Var2 = p0Var.k;
        long j = p0Var.f2196f.f2211e;
        return j == -9223372036854775807L || this.u.m < j || (p0Var2 != null && (p0Var2.f2194d || p0Var2.f2196f.f2207a.a()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
    
        if (r6 == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r13 = this;
            c.c.a.a.r0 r0 = r13.s
            c.c.a.a.p0 r0 = r0.i
            boolean r1 = r0.f2194d
            if (r1 != 0) goto Lb
            r1 = 0
            goto L11
        Lb:
            c.c.a.a.u1.v r1 = r0.f2191a
            long r1 = r1.e()
        L11:
            r3 = -9223372036854775808
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 != 0) goto L1c
            r13.I(r4)
            return
        L1c:
            long r1 = r13.k(r1)
            c.c.a.a.o0 r3 = r13.f2019f
            c.c.a.a.x r5 = r13.o
            c.c.a.a.u0 r5 = r5.a()
            float r5 = r5.f2817a
            c.c.a.a.v r3 = (c.c.a.a.v) r3
            c.c.a.a.y1.r r6 = r3.f3238a
            monitor-enter(r6)
            int r7 = r6.f3661e     // Catch: java.lang.Throwable -> L8d
            int r8 = r6.f3658b     // Catch: java.lang.Throwable -> L8d
            int r7 = r7 * r8
            monitor-exit(r6)
            int r6 = r3.k
            r8 = 1
            if (r7 < r6) goto L3c
            r6 = r8
            goto L3d
        L3c:
            r6 = r4
        L3d:
            boolean r7 = r3.m
            if (r7 == 0) goto L44
            long r9 = r3.f3240c
            goto L46
        L44:
            long r9 = r3.f3239b
        L46:
            r7 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 <= 0) goto L5e
            int r11 = c.c.a.a.z1.l0.f3761a
            if (r7 != 0) goto L51
            goto L58
        L51:
            double r9 = (double) r9
            double r11 = (double) r5
            double r9 = r9 * r11
            long r9 = java.lang.Math.round(r9)
        L58:
            long r11 = r3.f3241d
            long r9 = java.lang.Math.min(r9, r11)
        L5e:
            int r5 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r5 >= 0) goto L6a
            boolean r1 = r3.h
            if (r1 != 0) goto L68
            if (r6 != 0) goto L72
        L68:
            r4 = r8
            goto L72
        L6a:
            long r7 = r3.f3241d
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 >= 0) goto L72
            if (r6 == 0) goto L74
        L72:
            r3.l = r4
        L74:
            boolean r1 = r3.l
            r13.I(r1)
            if (r1 == 0) goto L8c
            long r1 = r13.F
            boolean r3 = r0.f()
            c.c.a.a.x1.p.g(r3)
            long r3 = r0.n
            long r1 = r1 - r3
            c.c.a.a.u1.v r0 = r0.f2191a
            r0.f(r1)
        L8c:
            return
        L8d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.i0.r():void");
    }

    public final void s() {
        g0 g0Var = this.p;
        t0 t0Var = this.u;
        if (t0Var != g0Var.f2000a || g0Var.f2001b > 0 || g0Var.f2002c) {
            this.j.obtainMessage(0, g0Var.f2001b, g0Var.f2002c ? g0Var.f2003d : -1, t0Var).sendToTarget();
            g0 g0Var2 = this.p;
            g0Var2.f2000a = this.u;
            g0Var2.f2001b = 0;
            g0Var2.f2002c = false;
        }
    }

    public final void t() {
        r0 r0Var = this.s;
        p0 p0Var = r0Var.i;
        p0 p0Var2 = r0Var.h;
        if (p0Var == null || p0Var.f2194d) {
            return;
        }
        if (p0Var2 == null || p0Var2.k == p0Var) {
            for (b1 b1Var : this.w) {
                if (!((r) b1Var).j()) {
                    return;
                }
            }
            p0Var.f2191a.m();
        }
    }

    public final void u(c.c.a.a.u1.l lVar, boolean z, boolean z2) {
        boolean z3 = true;
        this.D++;
        x(false, true, z, z2);
        ((v) this.f2019f).b(false);
        this.v = lVar;
        M(2);
        c.c.a.a.y1.t tVar = (c.c.a.a.y1.t) this.g;
        Objects.requireNonNull(tVar);
        Objects.requireNonNull(lVar);
        Looper myLooper = Looper.myLooper();
        Looper looper = lVar.f2901d;
        if (looper != null && looper != myLooper) {
            z3 = false;
        }
        c.c.a.a.x1.p.c(z3);
        lVar.f2899b.add(this);
        if (lVar.f2901d == null) {
            lVar.f2901d = myLooper;
            lVar.d(tVar);
        } else {
            k1 k1Var = lVar.f2902e;
            if (k1Var != null) {
                this.h.b(8, new e0(lVar, k1Var, lVar.f2903f)).sendToTarget();
            }
        }
        this.h.c(2);
    }

    public final void v() {
        x(true, true, true, true);
        ((v) this.f2019f).b(true);
        M(1);
        this.i.quit();
        synchronized (this) {
            this.x = true;
            notifyAll();
        }
    }

    public final void w() {
        if (this.s.i()) {
            float f2 = this.o.a().f2817a;
            r0 r0Var = this.s;
            p0 p0Var = r0Var.g;
            p0 p0Var2 = r0Var.h;
            boolean z = true;
            for (p0 p0Var3 = p0Var; p0Var3 != null && p0Var3.f2194d; p0Var3 = p0Var3.k) {
                c.c.a.a.w1.w h = p0Var3.h(f2, this.u.f2805a);
                if (h != null) {
                    r0 r0Var2 = this.s;
                    if (z) {
                        p0 p0Var4 = r0Var2.g;
                        boolean l = r0Var2.l(p0Var4);
                        boolean[] zArr = new boolean[this.f2015b.length];
                        long a2 = p0Var4.a(h, this.u.m, l, zArr);
                        t0 t0Var = this.u;
                        if (t0Var.f2810f != 4 && a2 != t0Var.m) {
                            t0 t0Var2 = this.u;
                            this.u = t0Var2.a(t0Var2.f2807c, a2, t0Var2.f2809e, j());
                            this.p.b(4);
                            y(a2);
                        }
                        boolean[] zArr2 = new boolean[this.f2015b.length];
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            b1[] b1VarArr = this.f2015b;
                            if (i >= b1VarArr.length) {
                                break;
                            }
                            b1 b1Var = b1VarArr[i];
                            r rVar = (r) b1Var;
                            zArr2[i] = rVar.f2685e != 0;
                            c.c.a.a.u1.l0 l0Var = p0Var4.f2193c[i];
                            if (l0Var != null) {
                                i2++;
                            }
                            if (zArr2[i]) {
                                if (l0Var != rVar.f2686f) {
                                    d(b1Var);
                                } else if (zArr[i]) {
                                    long j = this.F;
                                    rVar.j = false;
                                    rVar.i = j;
                                    rVar.m(j, false);
                                }
                            }
                            i++;
                        }
                        t0 t0Var3 = this.u;
                        c.c.a.a.u1.s0 s0Var = p0Var4.l;
                        Objects.requireNonNull(s0Var);
                        c.c.a.a.w1.w wVar = p0Var4.m;
                        Objects.requireNonNull(wVar);
                        this.u = t0Var3.b(s0Var, wVar);
                        f(zArr2, i2);
                    } else {
                        r0Var2.l(p0Var3);
                        if (p0Var3.f2194d) {
                            p0Var3.a(h, Math.max(p0Var3.f2196f.f2208b, this.F - p0Var3.n), false, new boolean[p0Var3.h.length]);
                        }
                    }
                    m(true);
                    if (this.u.f2810f != 4) {
                        r();
                        R();
                        this.h.c(2);
                        return;
                    }
                    return;
                }
                if (p0Var3 == p0Var2) {
                    z = false;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(boolean r25, boolean r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.i0.x(boolean, boolean, boolean, boolean):void");
    }

    public final void y(long j) {
        if (this.s.i()) {
            j += this.s.g.n;
        }
        this.F = j;
        this.o.f3454b.c(j);
        for (b1 b1Var : this.w) {
            long j2 = this.F;
            r rVar = (r) b1Var;
            rVar.j = false;
            rVar.i = j2;
            rVar.m(j2, false);
        }
        for (p0 d2 = this.s.d(); d2 != null; d2 = d2.k) {
            c.c.a.a.w1.w wVar = d2.m;
            Objects.requireNonNull(wVar);
            for (c.c.a.a.w1.r rVar2 : wVar.f3452c.a()) {
            }
        }
    }

    public final Pair<Object, Long> z(h0 h0Var, boolean z) {
        Pair<Object, Long> j;
        int b2;
        k1 k1Var = this.u.f2805a;
        k1 k1Var2 = h0Var.f2010a;
        if (k1Var.p()) {
            return null;
        }
        if (k1Var2.p()) {
            k1Var2 = k1Var;
        }
        try {
            j = k1Var2.j(this.k, this.l, h0Var.f2011b, h0Var.f2012c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (k1Var == k1Var2 || (b2 = k1Var.b(j.first)) != -1) {
            return j;
        }
        if (z && A(j.first, k1Var2, k1Var) != null) {
            return i(k1Var, k1Var.f(b2, this.l).f2021b, -9223372036854775807L);
        }
        return null;
    }
}
