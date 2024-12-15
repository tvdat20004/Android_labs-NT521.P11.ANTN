package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import c.c.a.a.j0;
import c.c.a.a.t1.d;
import c.c.a.a.u1.k0;
import c.c.a.a.u1.l;
import c.c.a.a.u1.v;
import c.c.a.a.u1.w;
import c.c.a.a.u1.x0.b0.b;
import c.c.a.a.u1.x0.b0.c;
import c.c.a.a.u1.x0.b0.m;
import c.c.a.a.u1.x0.b0.n;
import c.c.a.a.u1.x0.b0.q;
import c.c.a.a.u1.x0.e;
import c.c.a.a.u1.x0.n;
import c.c.a.a.u1.x0.t;
import c.c.a.a.u1.y;
import c.c.a.a.x1.p;
import c.c.a.a.y1.n;
import c.c.a.a.y1.p0;
import c.c.a.a.y1.r;
import c.c.a.a.y1.s0;
import c.c.a.a.y1.x0;
import c.c.a.a.y1.z;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class HlsMediaSource extends l implements q {
    public final n g;
    public final Uri h;
    public final e i;
    public final c.c.a.a.u1.q j;
    public final z k;
    public final boolean l;
    public final boolean m;
    public final c.c.a.a.u1.x0.b0.n n;
    public final Object o = null;
    public x0 p;

    public static final class Factory {

        /* renamed from: a, reason: collision with root package name */
        public final e f4139a;

        /* renamed from: b, reason: collision with root package name */
        public n f4140b;

        /* renamed from: c, reason: collision with root package name */
        public m f4141c = new b();

        /* renamed from: d, reason: collision with root package name */
        public List<d> f4142d;

        /* renamed from: e, reason: collision with root package name */
        public n.a f4143e;

        /* renamed from: f, reason: collision with root package name */
        public c.c.a.a.u1.q f4144f;
        public z g;
        public boolean h;

        public Factory(n.a aVar) {
            this.f4139a = new e(aVar);
            int i = c.r;
            this.f4143e = c.c.a.a.u1.x0.b0.a.f3108a;
            this.f4140b = c.c.a.a.u1.x0.n.f3171a;
            this.g = new z();
            this.f4144f = new c.c.a.a.u1.q();
        }

        public HlsMediaSource createMediaSource(Uri uri) {
            this.h = true;
            List<d> list = this.f4142d;
            if (list != null) {
                this.f4141c = new c.c.a.a.u1.x0.b0.d(this.f4141c, list);
            }
            e eVar = this.f4139a;
            c.c.a.a.u1.x0.n nVar = this.f4140b;
            c.c.a.a.u1.q qVar = this.f4144f;
            z zVar = this.g;
            n.a aVar = this.f4143e;
            m mVar = this.f4141c;
            Objects.requireNonNull((c.c.a.a.u1.x0.b0.a) aVar);
            return new HlsMediaSource(uri, eVar, nVar, qVar, zVar, new c(eVar, zVar, mVar), false, false, null, null);
        }

        public Factory setStreamKeys(List<d> list) {
            p.g(!this.h);
            this.f4142d = list;
            return this;
        }
    }

    static {
        j0.a("goog.exo.hls");
    }

    public HlsMediaSource(Uri uri, e eVar, c.c.a.a.u1.x0.n nVar, c.c.a.a.u1.q qVar, z zVar, c.c.a.a.u1.x0.b0.n nVar2, boolean z, boolean z2, Object obj, a aVar) {
        this.h = uri;
        this.i = eVar;
        this.g = nVar;
        this.j = qVar;
        this.k = zVar;
        this.n = nVar2;
        this.l = z;
        this.m = z2;
    }

    @Override // c.c.a.a.u1.l
    public v b(w wVar, r rVar, long j) {
        return new c.c.a.a.u1.x0.q(this.g, this.n, this.i, this.p, this.k, a(wVar), rVar, this.j, this.l, this.m);
    }

    @Override // c.c.a.a.u1.l
    public void c() {
        c cVar = (c) this.n;
        p0 p0Var = cVar.j;
        if (p0Var != null) {
            p0Var.e(Integer.MIN_VALUE);
        }
        Uri uri = cVar.n;
        if (uri != null) {
            cVar.e(uri);
        }
    }

    @Override // c.c.a.a.u1.l
    public void d(x0 x0Var) {
        this.p = x0Var;
        y a2 = a(null);
        c.c.a.a.u1.x0.b0.n nVar = this.n;
        Uri uri = this.h;
        c cVar = (c) nVar;
        Objects.requireNonNull(cVar);
        cVar.k = new Handler();
        cVar.i = a2;
        cVar.l = this;
        s0 s0Var = new s0(cVar.f3109b.a(), uri, 4, cVar.f3110c.a());
        p.g(cVar.j == null);
        p0 p0Var = new p0("DefaultHlsPlaylistTracker:MasterPlaylist");
        cVar.j = p0Var;
        a2.j(s0Var.f3663a, s0Var.f3664b, p0Var.g(s0Var, cVar, cVar.f3111d.b(s0Var.f3664b)));
    }

    @Override // c.c.a.a.u1.l
    public void f(v vVar) {
        c.c.a.a.u1.x0.q qVar = (c.c.a.a.u1.x0.q) vVar;
        ((c) qVar.f3173c).f3113f.remove(qVar);
        for (t tVar : qVar.q) {
            if (tVar.A) {
                for (k0 k0Var : tVar.r) {
                    k0Var.j();
                }
            }
            tVar.h.f(tVar);
            tVar.o.removeCallbacksAndMessages(null);
            tVar.E = true;
            tVar.p.clear();
        }
        qVar.n = null;
        qVar.g.l();
    }

    @Override // c.c.a.a.u1.l
    public void g() {
        c cVar = (c) this.n;
        cVar.n = null;
        cVar.o = null;
        cVar.m = null;
        cVar.q = -9223372036854775807L;
        cVar.j.f(null);
        cVar.j = null;
        Iterator<c.a> it = cVar.f3112e.values().iterator();
        while (it.hasNext()) {
            it.next().f3115c.f(null);
        }
        cVar.k.removeCallbacksAndMessages(null);
        cVar.k = null;
        cVar.f3112e.clear();
    }
}
