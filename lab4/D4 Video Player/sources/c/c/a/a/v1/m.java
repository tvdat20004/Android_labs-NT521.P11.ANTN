package c.c.a.a.v1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c.c.a.a.l0;
import c.c.a.a.m0;
import c.c.a.a.r;
import c.c.a.a.z;
import c.c.a.a.z1.u;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m extends r implements Handler.Callback {
    public final Handler k;
    public final l l;
    public final i m;
    public final m0 n;
    public boolean o;
    public boolean p;
    public int q;
    public l0 r;
    public f s;
    public j t;
    public k u;
    public k v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, Looper looper) {
        super(3);
        Handler handler;
        i iVar = i.f3256a;
        Objects.requireNonNull(lVar);
        this.l = lVar;
        if (looper == null) {
            handler = null;
        } else {
            int i = c.c.a.a.z1.l0.f3761a;
            handler = new Handler(looper, this);
        }
        this.k = handler;
        this.m = iVar;
        this.n = new m0();
    }

    @Override // c.c.a.a.b1
    public boolean c() {
        return true;
    }

    @Override // c.c.a.a.b1
    public boolean d() {
        return this.p;
    }

    @Override // c.c.a.a.b1
    public void f(long j, long j2) {
        boolean z;
        if (this.p) {
            return;
        }
        if (this.v == null) {
            this.s.b(j);
            try {
                this.v = this.s.d();
            } catch (g e2) {
                throw z.a(e2, this.f2684d);
            }
        }
        if (this.f2685e != 2) {
            return;
        }
        if (this.u != null) {
            long x = x();
            z = false;
            while (x <= j) {
                this.w++;
                x = x();
                z = true;
            }
        } else {
            z = false;
        }
        k kVar = this.v;
        if (kVar != null) {
            if (kVar.h()) {
                if (!z && x() == Long.MAX_VALUE) {
                    if (this.q == 2) {
                        z();
                    } else {
                        y();
                        this.p = true;
                    }
                }
            } else if (this.v.f2183c <= j) {
                k kVar2 = this.u;
                if (kVar2 != null) {
                    kVar2.i();
                }
                k kVar3 = this.v;
                this.u = kVar3;
                this.v = null;
                e eVar = kVar3.f3257d;
                Objects.requireNonNull(eVar);
                this.w = eVar.a(j - kVar3.f3258e);
                z = true;
            }
        }
        if (z) {
            k kVar4 = this.u;
            e eVar2 = kVar4.f3257d;
            Objects.requireNonNull(eVar2);
            List<b> b2 = eVar2.b(j - kVar4.f3258e);
            Handler handler = this.k;
            if (handler != null) {
                handler.obtainMessage(0, b2).sendToTarget();
            } else {
                this.l.w(b2);
            }
        }
        if (this.q == 2) {
            return;
        }
        while (!this.o) {
            try {
                if (this.t == null) {
                    j e3 = this.s.e();
                    this.t = e3;
                    if (e3 == null) {
                        return;
                    }
                }
                if (this.q == 1) {
                    j jVar = this.t;
                    jVar.f2165b = 4;
                    this.s.c(jVar);
                    this.t = null;
                    this.q = 2;
                    return;
                }
                int r = r(this.n, this.t, false);
                if (r == -4) {
                    if (this.t.h()) {
                        this.o = true;
                    } else {
                        j jVar2 = this.t;
                        jVar2.g = this.n.f2058a.n;
                        jVar2.f2180d.flip();
                    }
                    this.s.c(this.t);
                    this.t = null;
                } else if (r == -3) {
                    return;
                }
            } catch (g e4) {
                throw z.a(e4, this.f2684d);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.l.w((List) message.obj);
        return true;
    }

    @Override // c.c.a.a.r
    public void k() {
        this.r = null;
        w();
        y();
        this.s.a();
        this.s = null;
        this.q = 0;
    }

    @Override // c.c.a.a.r
    public void m(long j, boolean z) {
        w();
        this.o = false;
        this.p = false;
        if (this.q != 0) {
            z();
        } else {
            y();
            this.s.flush();
        }
    }

    @Override // c.c.a.a.r
    public void q(l0[] l0VarArr, long j) {
        l0 l0Var = l0VarArr[0];
        this.r = l0Var;
        if (this.s != null) {
            this.q = 1;
        } else {
            this.s = ((h) this.m).a(l0Var);
        }
    }

    @Override // c.c.a.a.r
    public int t(l0 l0Var) {
        Objects.requireNonNull((h) this.m);
        String str = l0Var.j;
        return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) ? r.u(l0Var.m) ? 4 : 2 : u.i(l0Var.j) ? 1 : 0;
    }

    public final void w() {
        List<b> emptyList = Collections.emptyList();
        Handler handler = this.k;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.l.w(emptyList);
        }
    }

    public final long x() {
        int i = this.w;
        if (i != -1) {
            e eVar = this.u.f3257d;
            Objects.requireNonNull(eVar);
            if (i < eVar.d()) {
                k kVar = this.u;
                int i2 = this.w;
                e eVar2 = kVar.f3257d;
                Objects.requireNonNull(eVar2);
                return eVar2.c(i2) + kVar.f3258e;
            }
        }
        return Long.MAX_VALUE;
    }

    public final void y() {
        this.t = null;
        this.w = -1;
        k kVar = this.u;
        if (kVar != null) {
            kVar.i();
            this.u = null;
        }
        k kVar2 = this.v;
        if (kVar2 != null) {
            kVar2.i();
            this.v = null;
        }
    }

    public final void z() {
        y();
        this.s.a();
        this.s = null;
        this.q = 0;
        this.s = ((h) this.m).a(this.r);
    }
}
