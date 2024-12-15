package c.c.a.a.u1.x0.b0;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import c.c.a.a.l0;
import c.c.a.a.s;
import c.c.a.a.u1.x0.t;
import c.c.a.a.u1.y;
import c.c.a.a.y1.i0;
import c.c.a.a.y1.j0;
import c.c.a.a.y1.p0;
import c.c.a.a.y1.s0;
import c.c.a.a.y1.v0;
import c.c.a.a.y1.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements n, i0<s0<j>> {
    public static final /* synthetic */ int r = 0;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.u1.x0.e f3109b;

    /* renamed from: c, reason: collision with root package name */
    public final m f3110c;

    /* renamed from: d, reason: collision with root package name */
    public final z f3111d;
    public s0.a<j> h;
    public y i;
    public p0 j;
    public Handler k;
    public q l;
    public g m;
    public Uri n;
    public i o;
    public boolean p;
    public final double g = 3.5d;

    /* renamed from: f, reason: collision with root package name */
    public final List<c.c.a.a.u1.x0.q> f3113f = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<Uri, a> f3112e = new HashMap<>();
    public long q = -9223372036854775807L;

    public final class a implements i0<s0<j>>, Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final Uri f3114b;

        /* renamed from: c, reason: collision with root package name */
        public final p0 f3115c = new p0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: d, reason: collision with root package name */
        public final s0<j> f3116d;

        /* renamed from: e, reason: collision with root package name */
        public i f3117e;

        /* renamed from: f, reason: collision with root package name */
        public long f3118f;
        public long g;
        public long h;
        public long i;
        public boolean j;
        public IOException k;

        public a(Uri uri) {
            this.f3114b = uri;
            this.f3116d = new s0<>(c.this.f3109b.a(), uri, 4, c.this.h);
        }

        public final boolean a(long j) {
            boolean z;
            this.i = SystemClock.elapsedRealtime() + j;
            if (this.f3114b.equals(c.this.n)) {
                c cVar = c.this;
                List<f> list = cVar.m.f3131e;
                int size = list.size();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = false;
                        break;
                    }
                    a aVar = cVar.f3112e.get(list.get(i).f3124a);
                    if (elapsedRealtime > aVar.i) {
                        cVar.n = aVar.f3114b;
                        aVar.b();
                        z = true;
                        break;
                    }
                    i++;
                }
                if (!z) {
                    return true;
                }
            }
            return false;
        }

        public void b() {
            this.i = 0L;
            if (this.j || this.f3115c.d()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.h;
            if (elapsedRealtime >= j) {
                c();
            } else {
                this.j = true;
                c.this.k.postDelayed(this, j - elapsedRealtime);
            }
        }

        public final void c() {
            p0 p0Var = this.f3115c;
            s0<j> s0Var = this.f3116d;
            long g = p0Var.g(s0Var, this, c.this.f3111d.b(s0Var.f3664b));
            y yVar = c.this.i;
            s0<j> s0Var2 = this.f3116d;
            yVar.j(s0Var2.f3663a, s0Var2.f3664b, g);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x028e  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0291  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0222  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0089  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void d(c.c.a.a.u1.x0.b0.i r32, long r33) {
            /*
                Method dump skipped, instructions count: 692
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.x0.b0.c.a.d(c.c.a.a.u1.x0.b0.i, long):void");
        }

        @Override // c.c.a.a.y1.i0
        public j0 i(s0<j> s0Var, long j, long j2, IOException iOException, int i) {
            j0 j0Var;
            s0<j> s0Var2 = s0Var;
            z zVar = c.this.f3111d;
            int i2 = s0Var2.f3664b;
            long a2 = zVar.a(iOException);
            boolean z = a2 != -9223372036854775807L;
            boolean z2 = c.a(c.this, this.f3114b, a2) || !z;
            if (z) {
                z2 |= a(a2);
            }
            if (z2) {
                long c2 = c.this.f3111d.c(iOException, i);
                j0Var = c2 != -9223372036854775807L ? p0.c(false, c2) : p0.f3647e;
            } else {
                j0Var = p0.f3646d;
            }
            j0 j0Var2 = j0Var;
            y yVar = c.this.i;
            c.c.a.a.y1.q qVar = s0Var2.f3663a;
            v0 v0Var = s0Var2.f3665c;
            yVar.h(qVar, v0Var.f3691c, v0Var.f3692d, 4, j, j2, v0Var.f3690b, iOException, !j0Var2.a());
            return j0Var2;
        }

        @Override // c.c.a.a.y1.i0
        public void l(s0<j> s0Var, long j, long j2) {
            s0<j> s0Var2 = s0Var;
            j jVar = s0Var2.f3667e;
            if (!(jVar instanceof i)) {
                this.k = new c.c.a.a.s0("Loaded playlist has unexpected type.");
                return;
            }
            d((i) jVar, j2);
            y yVar = c.this.i;
            c.c.a.a.y1.q qVar = s0Var2.f3663a;
            v0 v0Var = s0Var2.f3665c;
            yVar.f(qVar, v0Var.f3691c, v0Var.f3692d, 4, j, j2, v0Var.f3690b);
        }

        @Override // c.c.a.a.y1.i0
        public void p(s0<j> s0Var, long j, long j2, boolean z) {
            s0<j> s0Var2 = s0Var;
            y yVar = c.this.i;
            c.c.a.a.y1.q qVar = s0Var2.f3663a;
            v0 v0Var = s0Var2.f3665c;
            yVar.d(qVar, v0Var.f3691c, v0Var.f3692d, 4, j, j2, v0Var.f3690b);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.j = false;
            c();
        }
    }

    public c(c.c.a.a.u1.x0.e eVar, z zVar, m mVar) {
        this.f3109b = eVar;
        this.f3110c = mVar;
        this.f3111d = zVar;
    }

    public static boolean a(c cVar, Uri uri, long j) {
        boolean z;
        int j2;
        c cVar2 = cVar;
        int size = cVar2.f3113f.size();
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            c.c.a.a.u1.x0.q qVar = cVar2.f3113f.get(i);
            boolean z3 = true;
            for (t tVar : qVar.q) {
                c.c.a.a.u1.x0.l lVar = tVar.f3182d;
                int i2 = 0;
                while (true) {
                    Uri[] uriArr = lVar.f3166e;
                    if (i2 >= uriArr.length) {
                        i2 = -1;
                        break;
                    }
                    if (uriArr[i2].equals(uri)) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1 && (j2 = ((c.c.a.a.w1.g) lVar.p).j(i2)) != -1) {
                    lVar.r |= uri.equals(lVar.n);
                    if (j != -9223372036854775807L && !((c.c.a.a.w1.g) lVar.p).h(j2, j)) {
                        z = false;
                        z3 &= z;
                    }
                }
                z = true;
                z3 &= z;
            }
            qVar.n.c(qVar);
            z2 |= !z3;
            i++;
            cVar2 = cVar;
        }
        return z2;
    }

    public static h b(i iVar, i iVar2) {
        int i = (int) (iVar2.i - iVar.i);
        List<h> list = iVar.o;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    public i c(Uri uri, boolean z) {
        i iVar;
        i iVar2 = this.f3112e.get(uri).f3117e;
        if (iVar2 != null && z && !uri.equals(this.n)) {
            List<f> list = this.m.f3131e;
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (uri.equals(list.get(i).f3124a)) {
                    z2 = true;
                    break;
                }
                i++;
            }
            if (z2 && ((iVar = this.o) == null || !iVar.l)) {
                this.n = uri;
                this.f3112e.get(uri).b();
            }
        }
        return iVar2;
    }

    public boolean d(Uri uri) {
        int i;
        a aVar = this.f3112e.get(uri);
        if (aVar.f3117e == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, s.b(aVar.f3117e.p));
        i iVar = aVar.f3117e;
        return iVar.l || (i = iVar.f3138d) == 2 || i == 1 || aVar.f3118f + max > elapsedRealtime;
    }

    public void e(Uri uri) {
        a aVar = this.f3112e.get(uri);
        aVar.f3115c.e(Integer.MIN_VALUE);
        IOException iOException = aVar.k;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // c.c.a.a.y1.i0
    public j0 i(s0<j> s0Var, long j, long j2, IOException iOException, int i) {
        s0<j> s0Var2 = s0Var;
        z zVar = this.f3111d;
        int i2 = s0Var2.f3664b;
        long c2 = zVar.c(iOException, i);
        boolean z = c2 == -9223372036854775807L;
        y yVar = this.i;
        c.c.a.a.y1.q qVar = s0Var2.f3663a;
        v0 v0Var = s0Var2.f3665c;
        yVar.h(qVar, v0Var.f3691c, v0Var.f3692d, 4, j, j2, v0Var.f3690b, iOException, z);
        return z ? p0.f3647e : p0.c(false, c2);
    }

    @Override // c.c.a.a.y1.i0
    public void l(s0<j> s0Var, long j, long j2) {
        g gVar;
        s0<j> s0Var2 = s0Var;
        j jVar = s0Var2.f3667e;
        boolean z = jVar instanceof i;
        if (z) {
            String str = jVar.f3141a;
            g gVar2 = g.l;
            gVar = new g(null, Collections.emptyList(), Collections.singletonList(new f(Uri.parse(str), l0.s("0", null, "application/x-mpegURL", null, null, -1, 0, 0, null), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            gVar = (g) jVar;
        }
        this.m = gVar;
        this.h = this.f3110c.b(gVar);
        this.n = gVar.f3131e.get(0).f3124a;
        List<Uri> list = gVar.f3130d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = list.get(i);
            this.f3112e.put(uri, new a(uri));
        }
        a aVar = this.f3112e.get(this.n);
        if (z) {
            aVar.d((i) jVar, j2);
        } else {
            aVar.b();
        }
        y yVar = this.i;
        c.c.a.a.y1.q qVar = s0Var2.f3663a;
        v0 v0Var = s0Var2.f3665c;
        yVar.f(qVar, v0Var.f3691c, v0Var.f3692d, 4, j, j2, v0Var.f3690b);
    }

    @Override // c.c.a.a.y1.i0
    public void p(s0<j> s0Var, long j, long j2, boolean z) {
        s0<j> s0Var2 = s0Var;
        y yVar = this.i;
        c.c.a.a.y1.q qVar = s0Var2.f3663a;
        v0 v0Var = s0Var2.f3665c;
        yVar.d(qVar, v0Var.f3691c, v0Var.f3692d, 4, j, j2, v0Var.f3690b);
    }
}
