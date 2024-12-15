package c.c.a.a.y1.a1;

import android.net.Uri;
import c.c.a.a.y1.w0;
import c.c.a.a.y1.x0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h implements c.c.a.a.y1.n {

    /* renamed from: a, reason: collision with root package name */
    public final c f3559a;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.y1.n f3560b;

    /* renamed from: c, reason: collision with root package name */
    public final c.c.a.a.y1.n f3561c;

    /* renamed from: d, reason: collision with root package name */
    public final c.c.a.a.y1.n f3562d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3563e;

    /* renamed from: f, reason: collision with root package name */
    public final g f3564f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public c.c.a.a.y1.n j;
    public boolean k;
    public Uri l;
    public Uri m;
    public int n;
    public int o;
    public String p;
    public long q;
    public long r;
    public n s;
    public boolean t;
    public boolean u;
    public long v;
    public long w;

    public h(c cVar, c.c.a.a.y1.n nVar, c.c.a.a.y1.n nVar2, e eVar, int i, g gVar, m mVar) {
        this.f3559a = cVar;
        this.f3560b = nVar2;
        int i2 = o.f3579a;
        this.f3563e = a.f3545a;
        this.g = (i & 1) != 0;
        this.h = (i & 2) != 0;
        this.i = (i & 4) != 0;
        this.f3562d = nVar;
        this.f3561c = eVar != null ? new w0(nVar, eVar) : null;
        this.f3564f = null;
    }

    @Override // c.c.a.a.y1.n
    public long a(c.c.a.a.y1.q qVar) {
        g gVar;
        try {
            Objects.requireNonNull((a) this.f3563e);
            int i = o.f3579a;
            String str = qVar.g;
            if (str == null) {
                str = qVar.f3651a.toString();
            }
            this.p = str;
            Uri uri = qVar.f3651a;
            this.l = uri;
            x xVar = (x) ((a0) this.f3559a).h(str);
            Uri uri2 = null;
            String str2 = xVar.f3606b.containsKey("exo_redir") ? new String(xVar.f3606b.get("exo_redir"), Charset.forName("UTF-8")) : null;
            if (str2 != null) {
                uri2 = Uri.parse(str2);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.m = uri;
            this.n = qVar.f3652b;
            this.o = qVar.h;
            this.q = qVar.f3655e;
            boolean z = true;
            int i2 = (this.h && this.t) ? 0 : (this.i && qVar.f3656f == -1) ? 1 : -1;
            if (i2 == -1) {
                z = false;
            }
            this.u = z;
            if (z && (gVar = this.f3564f) != null) {
                gVar.a(i2);
            }
            long j = qVar.f3656f;
            if (j == -1 && !this.u) {
                long a2 = u.a(((a0) this.f3559a).h(this.p));
                this.r = a2;
                if (a2 != -1) {
                    long j2 = a2 - qVar.f3655e;
                    this.r = j2;
                    if (j2 <= 0) {
                        throw new c.c.a.a.y1.o(0);
                    }
                }
                i(false);
                return this.r;
            }
            this.r = j;
            i(false);
            return this.r;
        } catch (IOException e2) {
            g(e2);
            throw e2;
        }
    }

    @Override // c.c.a.a.y1.n
    public void b(x0 x0Var) {
        this.f3560b.b(x0Var);
        this.f3562d.b(x0Var);
    }

    @Override // c.c.a.a.y1.n
    public Uri c() {
        return this.m;
    }

    @Override // c.c.a.a.y1.n
    public void close() {
        this.l = null;
        this.m = null;
        this.n = 1;
        g gVar = this.f3564f;
        if (gVar != null && this.v > 0) {
            gVar.b(((a0) this.f3559a).g(), this.v);
            this.v = 0L;
        }
        try {
            f();
        } catch (IOException e2) {
            g(e2);
            throw e2;
        }
    }

    @Override // c.c.a.a.y1.n
    public Map<String, List<String>> d() {
        return h() ^ true ? this.f3562d.d() : Collections.emptyMap();
    }

    @Override // c.c.a.a.y1.n
    public int e(byte[] bArr, int i, int i2) {
        boolean z = false;
        if (i2 == 0) {
            return 0;
        }
        if (this.r == 0) {
            return -1;
        }
        try {
            if (this.q >= this.w) {
                i(true);
            }
            int e2 = this.j.e(bArr, i, i2);
            if (e2 != -1) {
                if (h()) {
                    this.v += e2;
                }
                long j = e2;
                this.q += j;
                long j2 = this.r;
                if (j2 != -1) {
                    this.r = j2 - j;
                }
            } else {
                if (!this.k) {
                    long j3 = this.r;
                    if (j3 <= 0) {
                        if (j3 == -1) {
                        }
                    }
                    f();
                    i(false);
                    return e(bArr, i, i2);
                }
                j();
            }
            return e2;
        } catch (IOException e3) {
            if (this.k) {
                int i3 = o.f3579a;
                Throwable th = e3;
                while (true) {
                    if (th != null) {
                        if ((th instanceof c.c.a.a.y1.o) && ((c.c.a.a.y1.o) th).f3640b == 0) {
                            z = true;
                            break;
                        }
                        th = th.getCause();
                    } else {
                        break;
                    }
                }
                if (z) {
                    j();
                    return -1;
                }
            }
            g(e3);
            throw e3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        c.c.a.a.y1.n nVar = this.j;
        if (nVar == null) {
            return;
        }
        try {
            nVar.close();
        } finally {
            this.j = null;
            this.k = false;
            n nVar2 = this.s;
            if (nVar2 != null) {
                ((a0) this.f3559a).l(nVar2);
                this.s = null;
            }
        }
    }

    public final void g(IOException iOException) {
        if (h() || (iOException instanceof b)) {
            this.t = true;
        }
    }

    public final boolean h() {
        return this.j == this.f3560b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(boolean r23) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.y1.a1.h.i(boolean):void");
    }

    public final void j() {
        this.r = 0L;
        if (this.j == this.f3561c) {
            w wVar = new w();
            w.a(wVar, this.q);
            ((a0) this.f3559a).c(this.p, wVar);
        }
    }
}
