package c.c.a.a.s1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c.c.a.a.m0;
import c.c.a.a.r;
import c.c.a.a.z1.l0;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i extends r implements Handler.Callback {
    public final f k;
    public final h l;
    public final Handler m;
    public final m0 n;
    public final g o;
    public final c[] p;
    public final long[] q;
    public int r;
    public int s;
    public d t;
    public boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, Looper looper) {
        super(4);
        Handler handler;
        f fVar = f.f2720a;
        Objects.requireNonNull(hVar);
        this.l = hVar;
        if (looper == null) {
            handler = null;
        } else {
            int i = l0.f3761a;
            handler = new Handler(looper, this);
        }
        this.m = handler;
        this.k = fVar;
        this.n = new m0();
        this.o = new g();
        this.p = new c[5];
        this.q = new long[5];
    }

    @Override // c.c.a.a.b1
    public boolean c() {
        return true;
    }

    @Override // c.c.a.a.b1
    public boolean d() {
        return this.u;
    }

    @Override // c.c.a.a.b1
    public void f(long j, long j2) {
        if (!this.u && this.s < 5) {
            this.o.i();
            if (r(this.n, this.o, false) == -4) {
                if (this.o.h()) {
                    this.u = true;
                } else if (!this.o.g()) {
                    g gVar = this.o;
                    gVar.g = this.n.f2058a.n;
                    gVar.f2180d.flip();
                    int i = (this.r + this.s) % 5;
                    c a2 = this.t.a(this.o);
                    if (a2 != null) {
                        this.p[i] = a2;
                        this.q[i] = this.o.f2181e;
                        this.s++;
                    }
                }
            }
        }
        if (this.s > 0) {
            long[] jArr = this.q;
            int i2 = this.r;
            if (jArr[i2] <= j) {
                c cVar = this.p[i2];
                Handler handler = this.m;
                if (handler != null) {
                    handler.obtainMessage(0, cVar).sendToTarget();
                } else {
                    this.l.r(cVar);
                }
                c[] cVarArr = this.p;
                int i3 = this.r;
                cVarArr[i3] = null;
                this.r = (i3 + 1) % 5;
                this.s--;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.l.r((c) message.obj);
        return true;
    }

    @Override // c.c.a.a.r
    public void k() {
        Arrays.fill(this.p, (Object) null);
        this.r = 0;
        this.s = 0;
        this.t = null;
    }

    @Override // c.c.a.a.r
    public void m(long j, boolean z) {
        Arrays.fill(this.p, (Object) null);
        this.r = 0;
        this.s = 0;
        this.u = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (r2.equals("application/x-icy") == false) goto L4;
     */
    @Override // c.c.a.a.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(c.c.a.a.l0[] r2, long r3) {
        /*
            r1 = this;
            c.c.a.a.s1.f r3 = r1.k
            r4 = 0
            r2 = r2[r4]
            c.c.a.a.s1.e r3 = (c.c.a.a.s1.e) r3
            java.util.Objects.requireNonNull(r3)
            java.lang.String r2 = r2.j
            r2.hashCode()
            r3 = -1
            int r0 = r2.hashCode()
            switch(r0) {
                case -1348231605: goto L3a;
                case -1248341703: goto L2f;
                case 1154383568: goto L24;
                case 1652648887: goto L19;
                default: goto L17;
            }
        L17:
            r4 = r3
            goto L43
        L19:
            java.lang.String r4 = "application/x-scte35"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L22
            goto L17
        L22:
            r4 = 3
            goto L43
        L24:
            java.lang.String r4 = "application/x-emsg"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L2d
            goto L17
        L2d:
            r4 = 2
            goto L43
        L2f:
            java.lang.String r4 = "application/id3"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L38
            goto L17
        L38:
            r4 = 1
            goto L43
        L3a:
            java.lang.String r0 = "application/x-icy"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L43
            goto L17
        L43:
            switch(r4) {
                case 0: goto L60;
                case 1: goto L5a;
                case 2: goto L54;
                case 3: goto L4e;
                default: goto L46;
            }
        L46:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Attempted to create decoder for unsupported format"
            r2.<init>(r3)
            throw r2
        L4e:
            c.c.a.a.s1.n.d r2 = new c.c.a.a.s1.n.d
            r2.<init>()
            goto L65
        L54:
            c.c.a.a.s1.j.c r2 = new c.c.a.a.s1.j.c
            r2.<init>()
            goto L65
        L5a:
            c.c.a.a.s1.m.o r2 = new c.c.a.a.s1.m.o
            r2.<init>()
            goto L65
        L60:
            c.c.a.a.s1.l.a r2 = new c.c.a.a.s1.l.a
            r2.<init>()
        L65:
            r1.t = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.s1.i.q(c.c.a.a.l0[], long):void");
    }

    @Override // c.c.a.a.r
    public int t(c.c.a.a.l0 l0Var) {
        Objects.requireNonNull((e) this.k);
        String str = l0Var.j;
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str)) {
            return r.u(l0Var.m) ? 4 : 2;
        }
        return 0;
    }
}
