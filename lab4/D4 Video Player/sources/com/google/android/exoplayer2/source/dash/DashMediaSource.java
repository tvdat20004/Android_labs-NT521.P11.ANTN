package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import c.c.a.a.j0;
import c.c.a.a.s;
import c.c.a.a.t1.d;
import c.c.a.a.u1.l;
import c.c.a.a.u1.q;
import c.c.a.a.u1.v;
import c.c.a.a.u1.w;
import c.c.a.a.u1.w0.c;
import c.c.a.a.u1.w0.f;
import c.c.a.a.u1.w0.h;
import c.c.a.a.u1.w0.j;
import c.c.a.a.u1.w0.k;
import c.c.a.a.u1.w0.q;
import c.c.a.a.u1.w0.t;
import c.c.a.a.u1.w0.x.b;
import c.c.a.a.u1.w0.x.m;
import c.c.a.a.u1.y;
import c.c.a.a.w1.g;
import c.c.a.a.x1.p;
import c.c.a.a.y1.n;
import c.c.a.a.y1.p0;
import c.c.a.a.y1.r;
import c.c.a.a.y1.r0;
import c.c.a.a.y1.s0;
import c.c.a.a.y1.v0;
import c.c.a.a.y1.x0;
import c.c.a.a.y1.z;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class DashMediaSource extends l {
    public IOException A;
    public Handler B;
    public Uri C;
    public Uri D;
    public boolean F;
    public long G;
    public long H;
    public long I;
    public int J;
    public int L;
    public final n.a h;
    public final c.a i;
    public final q j;
    public final z k;
    public final long l;
    public final boolean m;
    public final s0.a<? extends b> o;
    public n x;
    public p0 y;
    public x0 z;
    public b E = null;
    public final Object w = null;
    public final boolean g = false;
    public final y n = a(null);
    public final Object q = new Object();
    public final SparseArray<f> r = new SparseArray<>();
    public final h u = new h(this, null);
    public long K = -9223372036854775807L;
    public final j p = new j(this, null);
    public final r0 v = new k(this);
    public final Runnable s = new Runnable() { // from class: c.c.a.a.u1.w0.a
        @Override // java.lang.Runnable
        public final void run() {
            DashMediaSource.this.o();
        }
    };
    public final Runnable t = new Runnable() { // from class: c.c.a.a.u1.w0.b
        @Override // java.lang.Runnable
        public final void run() {
            DashMediaSource.this.m(false);
        }
    };

    public static final class Factory {

        /* renamed from: a, reason: collision with root package name */
        public final c.a f4133a;

        /* renamed from: b, reason: collision with root package name */
        public final n.a f4134b;

        /* renamed from: c, reason: collision with root package name */
        public s0.a<? extends b> f4135c;

        /* renamed from: d, reason: collision with root package name */
        public List<d> f4136d;
        public boolean h;

        /* renamed from: f, reason: collision with root package name */
        public z f4138f = new z();
        public long g = 30000;

        /* renamed from: e, reason: collision with root package name */
        public q f4137e = new q();

        public Factory(n.a aVar) {
            this.f4133a = new q.a(aVar);
            this.f4134b = aVar;
        }

        public DashMediaSource createMediaSource(Uri uri) {
            this.h = true;
            if (this.f4135c == null) {
                this.f4135c = new c.c.a.a.u1.w0.x.d();
            }
            List<d> list = this.f4136d;
            if (list != null) {
                this.f4135c = new c.c.a.a.t1.b(this.f4135c, list);
            }
            Objects.requireNonNull(uri);
            return new DashMediaSource(null, uri, this.f4134b, this.f4135c, this.f4133a, this.f4137e, this.f4138f, this.g, false, null, null);
        }

        public Factory setStreamKeys(List<d> list) {
            p.g(!this.h);
            this.f4136d = list;
            return this;
        }
    }

    static {
        j0.a("goog.exo.dash");
    }

    public DashMediaSource(b bVar, Uri uri, n.a aVar, s0.a aVar2, c.a aVar3, c.c.a.a.u1.q qVar, z zVar, long j, boolean z, Object obj, a aVar4) {
        this.C = uri;
        this.D = uri;
        this.h = aVar;
        this.o = aVar2;
        this.i = aVar3;
        this.k = zVar;
        this.l = j;
        this.m = z;
        this.j = qVar;
    }

    @Override // c.c.a.a.u1.l
    public v b(w wVar, r rVar, long j) {
        int intValue = ((Integer) wVar.f2972a).intValue() - this.L;
        long j2 = this.E.b(intValue).f3062b;
        p.c(true);
        y yVar = new y(this.f2900c.f3196c, 0, wVar, j2);
        int i = this.L + intValue;
        f fVar = new f(i, this.E, intValue, this.i, this.z, this.k, yVar, this.I, this.v, rVar, this.j, this.u);
        this.r.put(i, fVar);
        return fVar;
    }

    @Override // c.c.a.a.u1.l
    public void c() {
        this.v.a();
    }

    @Override // c.c.a.a.u1.l
    public void d(x0 x0Var) {
        this.z = x0Var;
        if (this.g) {
            m(false);
            return;
        }
        this.x = this.h.a();
        this.y = new p0("Loader:DashMediaSource");
        this.B = new Handler();
        o();
    }

    @Override // c.c.a.a.u1.l
    public void f(v vVar) {
        f fVar = (f) vVar;
        c.c.a.a.u1.w0.w wVar = fVar.l;
        wVar.l = true;
        wVar.f3031e.removeCallbacksAndMessages(null);
        for (c.c.a.a.u1.v0.h<c> hVar : fVar.p) {
            hVar.A(fVar);
        }
        fVar.o = null;
        fVar.n.l();
        this.r.remove(fVar.f2985b);
    }

    @Override // c.c.a.a.u1.l
    public void g() {
        this.F = false;
        this.x = null;
        p0 p0Var = this.y;
        if (p0Var != null) {
            p0Var.f(null);
            this.y = null;
        }
        this.G = 0L;
        this.H = 0L;
        this.E = this.g ? this.E : null;
        this.D = this.C;
        this.A = null;
        Handler handler = this.B;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.B = null;
        }
        this.I = 0L;
        this.J = 0;
        this.K = -9223372036854775807L;
        this.L = 0;
        this.r.clear();
    }

    public void j(s0<?> s0Var, long j, long j2) {
        y yVar = this.n;
        c.c.a.a.y1.q qVar = s0Var.f3663a;
        v0 v0Var = s0Var.f3665c;
        yVar.d(qVar, v0Var.f3691c, v0Var.f3692d, s0Var.f3664b, j, j2, v0Var.f3690b);
    }

    public final void k(IOException iOException) {
        Log.e("DashMediaSource", "Failed to resolve UtcTiming element.", iOException);
        m(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r30v0, types: [c.c.a.a.u1.l, com.google.android.exoplayer2.source.dash.DashMediaSource] */
    public final void m(boolean z) {
        long j;
        boolean z2;
        long j2;
        boolean z3 = false;
        int i = 0;
        while (i < this.r.size()) {
            int keyAt = this.r.keyAt(i);
            if (keyAt >= this.L) {
                f valueAt = this.r.valueAt(i);
                b bVar = this.E;
                int i2 = keyAt - this.L;
                valueAt.s = bVar;
                valueAt.t = i2;
                c.c.a.a.u1.w0.w wVar = valueAt.l;
                wVar.k = z3;
                wVar.h = -9223372036854775807L;
                wVar.g = bVar;
                Iterator<Map.Entry<Long, Long>> it = wVar.f3032f.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getKey().longValue() < wVar.g.h) {
                        it.remove();
                    }
                }
                c.c.a.a.u1.v0.h<c>[] hVarArr = valueAt.p;
                if (hVarArr != null) {
                    int length = hVarArr.length;
                    for (?? r10 = z3; r10 < length; r10++) {
                        c.c.a.a.u1.w0.q qVar = (c.c.a.a.u1.w0.q) hVarArr[r10].f2965f;
                        Objects.requireNonNull(qVar);
                        try {
                            qVar.i = bVar;
                            qVar.j = i2;
                            long e2 = bVar.e(i2);
                            ArrayList<m> g = qVar.g();
                            for (?? r14 = z3; r14 < qVar.g.length; r14++) {
                                m mVar = g.get(((g) qVar.h).f3409c[r14]);
                                c.c.a.a.u1.w0.r[] rVarArr = qVar.g;
                                rVarArr[r14] = rVarArr[r14].a(e2, mVar);
                            }
                        } catch (c.c.a.a.u1.m e3) {
                            qVar.k = e3;
                        }
                        z3 = false;
                    }
                    valueAt.o.c(valueAt);
                }
                valueAt.u = bVar.l.get(i2).f3064d;
                for (t tVar : valueAt.q) {
                    Iterator<c.c.a.a.u1.w0.x.f> it2 = valueAt.u.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            c.c.a.a.u1.w0.x.f next = it2.next();
                            if (next.a().equals(tVar.f3021f.a())) {
                                tVar.d(next, bVar.f3041d && i2 == bVar.c() - 1);
                            }
                        }
                    }
                }
            }
            i++;
            z3 = false;
        }
        int c2 = this.E.c() - 1;
        c.c.a.a.u1.w0.l a2 = c.c.a.a.u1.w0.l.a(this.E.b(0), this.E.e(0));
        c.c.a.a.u1.w0.l a3 = c.c.a.a.u1.w0.l.a(this.E.b(c2), this.E.e(c2));
        long j3 = a2.f3000b;
        long j4 = a3.f3001c;
        if (!this.E.f3041d || a3.f2999a) {
            j = j3;
            z2 = false;
        } else {
            j4 = Math.min((s.a(this.I != 0 ? SystemClock.elapsedRealtime() + this.I : System.currentTimeMillis()) - s.a(this.E.f3038a)) - s.a(this.E.b(c2).f3062b), j4);
            long j5 = this.E.f3043f;
            if (j5 != -9223372036854775807L) {
                long a4 = j4 - s.a(j5);
                while (a4 < 0 && c2 > 0) {
                    c2--;
                    a4 += this.E.e(c2);
                }
                j3 = c2 == 0 ? Math.max(j3, a4) : this.E.e(0);
            }
            j = j3;
            z2 = true;
        }
        long j6 = j4 - j;
        for (int i3 = 0; i3 < this.E.c() - 1; i3++) {
            j6 = this.E.e(i3) + j6;
        }
        b bVar2 = this.E;
        if (bVar2.f3041d) {
            long j7 = this.l;
            if (!this.m) {
                long j8 = bVar2.g;
                if (j8 != -9223372036854775807L) {
                    j7 = j8;
                }
            }
            long a5 = j6 - s.a(j7);
            if (a5 < 5000000) {
                a5 = Math.min(5000000L, j6 / 2);
            }
            j2 = a5;
        } else {
            j2 = 0;
        }
        b bVar3 = this.E;
        long b2 = s.b(j) + bVar3.f3038a + bVar3.b(0).f3062b;
        b bVar4 = this.E;
        e(new c.c.a.a.u1.w0.g(bVar4.f3038a, b2, this.L, j, j6, j2, bVar4, this.w), bVar4);
        if (this.g) {
            return;
        }
        this.B.removeCallbacks(this.t);
        if (z2) {
            this.B.postDelayed(this.t, 5000L);
        }
        if (this.F) {
            o();
            return;
        }
        if (z) {
            b bVar5 = this.E;
            if (bVar5.f3041d) {
                long j9 = bVar5.f3042e;
                if (j9 != -9223372036854775807L) {
                    this.B.postDelayed(this.s, Math.max(0L, (this.G + (j9 != 0 ? j9 : 5000L)) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void n(c.c.a.a.u1.w0.x.v vVar, s0.a<Long> aVar) {
        s0 s0Var = new s0(this.x, Uri.parse(vVar.f3097b), 5, aVar);
        this.n.j(s0Var.f3663a, s0Var.f3664b, this.y.g(s0Var, new c.c.a.a.u1.w0.m(this, null), 1));
    }

    public final void o() {
        Uri uri;
        this.B.removeCallbacks(this.s);
        if (this.y.d()) {
            this.F = true;
            return;
        }
        synchronized (this.q) {
            uri = this.D;
        }
        this.F = false;
        s0 s0Var = new s0(this.x, uri, 4, this.o);
        this.n.j(s0Var.f3663a, s0Var.f3664b, this.y.g(s0Var, this.p, this.k.b(4)));
    }
}
