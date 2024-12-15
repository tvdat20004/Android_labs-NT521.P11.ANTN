package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import c.c.a.a.j0;
import c.c.a.a.s;
import c.c.a.a.u1.l;
import c.c.a.a.u1.o0;
import c.c.a.a.u1.q;
import c.c.a.a.u1.v;
import c.c.a.a.u1.v0.h;
import c.c.a.a.u1.w;
import c.c.a.a.u1.y;
import c.c.a.a.u1.y0.b;
import c.c.a.a.u1.y0.d;
import c.c.a.a.u1.y0.e;
import c.c.a.a.u1.y0.f.c;
import c.c.a.a.u1.y0.f.j;
import c.c.a.a.x1.p;
import c.c.a.a.y1.i0;
import c.c.a.a.y1.n;
import c.c.a.a.y1.p0;
import c.c.a.a.y1.q0;
import c.c.a.a.y1.r;
import c.c.a.a.y1.r0;
import c.c.a.a.y1.s0;
import c.c.a.a.y1.v0;
import c.c.a.a.y1.x0;
import c.c.a.a.y1.z;
import c.c.a.a.z1.l0;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class SsMediaSource extends l implements i0<s0<c>> {
    public final boolean g;
    public final Uri h;
    public final n.a i;
    public final d.a j;
    public final q k;
    public final z l;
    public final long m;
    public final y n;
    public final s0.a<? extends c> o;
    public final ArrayList<e> p;
    public final Object q;
    public n r;
    public p0 s;
    public r0 t;
    public x0 u;
    public long v;
    public c w;
    public Handler x;

    public static final class Factory {

        /* renamed from: a, reason: collision with root package name */
        public final d.a f4145a;

        /* renamed from: b, reason: collision with root package name */
        public final n.a f4146b;

        /* renamed from: c, reason: collision with root package name */
        public s0.a<? extends c> f4147c;

        /* renamed from: d, reason: collision with root package name */
        public List<c.c.a.a.t1.d> f4148d;
        public boolean h;

        /* renamed from: f, reason: collision with root package name */
        public z f4150f = new z();
        public long g = 30000;

        /* renamed from: e, reason: collision with root package name */
        public q f4149e = new q();

        public Factory(n.a aVar) {
            this.f4145a = new b.a(aVar);
            this.f4146b = aVar;
        }

        public SsMediaSource createMediaSource(Uri uri) {
            this.h = true;
            if (this.f4147c == null) {
                this.f4147c = new j();
            }
            List<c.c.a.a.t1.d> list = this.f4148d;
            if (list != null) {
                this.f4147c = new c.c.a.a.t1.b(this.f4147c, list);
            }
            Objects.requireNonNull(uri);
            return new SsMediaSource(null, uri, this.f4146b, this.f4147c, this.f4145a, this.f4149e, this.f4150f, this.g, null, null);
        }

        public Factory setStreamKeys(List<c.c.a.a.t1.d> list) {
            p.g(!this.h);
            this.f4148d = list;
            return this;
        }
    }

    static {
        j0.a("goog.exo.smoothstreaming");
    }

    public SsMediaSource(c cVar, Uri uri, n.a aVar, s0.a aVar2, d.a aVar3, q qVar, z zVar, long j, Object obj, a aVar4) {
        p.g(true);
        this.w = null;
        String lastPathSegment = uri.getLastPathSegment();
        this.h = (lastPathSegment == null || !l0.I(lastPathSegment).matches("manifest(\\(.+\\))?")) ? Uri.withAppendedPath(uri, "Manifest") : uri;
        this.i = aVar;
        this.o = aVar2;
        this.j = aVar3;
        this.k = qVar;
        this.l = zVar;
        this.m = j;
        this.n = a(null);
        this.q = null;
        this.g = false;
        this.p = new ArrayList<>();
    }

    @Override // c.c.a.a.u1.l
    public v b(w wVar, r rVar, long j) {
        e eVar = new e(this.w, this.j, this.u, this.k, this.l, a(wVar), this.t, rVar);
        this.p.add(eVar);
        return eVar;
    }

    @Override // c.c.a.a.u1.l
    public void c() {
        this.t.a();
    }

    @Override // c.c.a.a.u1.l
    public void d(x0 x0Var) {
        this.u = x0Var;
        if (this.g) {
            this.t = new q0();
            j();
            return;
        }
        this.r = this.i.a();
        p0 p0Var = new p0("Loader:Manifest");
        this.s = p0Var;
        this.t = p0Var;
        this.x = new Handler();
        k();
    }

    @Override // c.c.a.a.u1.l
    public void f(v vVar) {
        e eVar = (e) vVar;
        for (h<d> hVar : eVar.l) {
            hVar.A(null);
        }
        eVar.j = null;
        eVar.f3210f.l();
        this.p.remove(vVar);
    }

    @Override // c.c.a.a.u1.l
    public void g() {
        this.w = this.g ? this.w : null;
        this.r = null;
        this.v = 0L;
        p0 p0Var = this.s;
        if (p0Var != null) {
            p0Var.f(null);
            this.s = null;
        }
        Handler handler = this.x;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.x = null;
        }
    }

    @Override // c.c.a.a.y1.i0
    public c.c.a.a.y1.j0 i(s0<c> s0Var, long j, long j2, IOException iOException, int i) {
        s0<c> s0Var2 = s0Var;
        long c2 = this.l.c(iOException, i);
        c.c.a.a.y1.j0 c3 = c2 == -9223372036854775807L ? p0.f3647e : p0.c(false, c2);
        y yVar = this.n;
        c.c.a.a.y1.q qVar = s0Var2.f3663a;
        v0 v0Var = s0Var2.f3665c;
        yVar.h(qVar, v0Var.f3691c, v0Var.f3692d, s0Var2.f3664b, j, j2, v0Var.f3690b, iOException, !c3.a());
        return c3;
    }

    public final void j() {
        o0 o0Var;
        int i;
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            e eVar = this.p.get(i2);
            c cVar = this.w;
            eVar.k = cVar;
            for (h<d> hVar : eVar.l) {
                b bVar = (b) hVar.f2965f;
                c.c.a.a.u1.y0.f.b[] bVarArr = bVar.f3204f.f3225f;
                int i3 = bVar.f3200b;
                c.c.a.a.u1.y0.f.b bVar2 = bVarArr[i3];
                int i4 = bVar2.k;
                c.c.a.a.u1.y0.f.b bVar3 = cVar.f3225f[i3];
                if (i4 != 0 && bVar3.k != 0) {
                    int i5 = i4 - 1;
                    long b2 = bVar2.b(i5) + bVar2.o[i5];
                    long j = bVar3.o[0];
                    if (b2 > j) {
                        i = bVar2.c(j) + bVar.g;
                        bVar.g = i;
                        bVar.f3204f = cVar;
                    }
                }
                i = bVar.g + i4;
                bVar.g = i;
                bVar.f3204f = cVar;
            }
            eVar.j.c(eVar);
        }
        long j2 = Long.MIN_VALUE;
        long j3 = Long.MAX_VALUE;
        for (c.c.a.a.u1.y0.f.b bVar4 : this.w.f3225f) {
            if (bVar4.k > 0) {
                j3 = Math.min(j3, bVar4.o[0]);
                int i6 = bVar4.k;
                j2 = Math.max(j2, bVar4.b(i6 - 1) + bVar4.o[i6 - 1]);
            }
        }
        if (j3 == Long.MAX_VALUE) {
            o0Var = new o0(this.w.f3223d ? -9223372036854775807L : 0L, 0L, 0L, 0L, true, this.w.f3223d, this.q);
        } else {
            c cVar2 = this.w;
            if (cVar2.f3223d) {
                long j4 = cVar2.h;
                if (j4 != -9223372036854775807L && j4 > 0) {
                    j3 = Math.max(j3, j2 - j4);
                }
                long j5 = j3;
                long j6 = j2 - j5;
                long a2 = j6 - s.a(this.m);
                if (a2 < 5000000) {
                    a2 = Math.min(5000000L, j6 / 2);
                }
                o0Var = new o0(-9223372036854775807L, j6, j5, a2, true, true, this.q);
            } else {
                long j7 = cVar2.g;
                long j8 = j7 != -9223372036854775807L ? j7 : j2 - j3;
                o0Var = new o0(j3 + j8, j8, j3, 0L, true, false, this.q);
            }
        }
        e(o0Var, this.w);
    }

    public final void k() {
        s0 s0Var = new s0(this.r, this.h, 4, this.o);
        this.n.j(s0Var.f3663a, s0Var.f3664b, this.s.g(s0Var, this, this.l.b(s0Var.f3664b)));
    }

    @Override // c.c.a.a.y1.i0
    public void l(s0<c> s0Var, long j, long j2) {
        s0<c> s0Var2 = s0Var;
        y yVar = this.n;
        c.c.a.a.y1.q qVar = s0Var2.f3663a;
        v0 v0Var = s0Var2.f3665c;
        yVar.f(qVar, v0Var.f3691c, v0Var.f3692d, s0Var2.f3664b, j, j2, v0Var.f3690b);
        this.w = s0Var2.f3667e;
        this.v = j - j2;
        j();
        if (this.w.f3223d) {
            this.x.postDelayed(new Runnable() { // from class: c.c.a.a.u1.y0.a
                @Override // java.lang.Runnable
                public final void run() {
                    SsMediaSource.this.k();
                }
            }, Math.max(0L, (this.v + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // c.c.a.a.y1.i0
    public void p(s0<c> s0Var, long j, long j2, boolean z) {
        s0<c> s0Var2 = s0Var;
        y yVar = this.n;
        c.c.a.a.y1.q qVar = s0Var2.f3663a;
        v0 v0Var = s0Var2.f3665c;
        yVar.d(qVar, v0Var.f3691c, v0Var.f3692d, s0Var2.f3664b, j, j2, v0Var.f3690b);
    }
}
