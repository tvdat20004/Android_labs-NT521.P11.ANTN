package c.c.a.a.u1.x0;

import android.net.Uri;
import c.c.a.a.l0;
import c.c.a.a.z1.k0;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class p extends c.c.a.a.u1.v0.m {
    public static final AtomicInteger H = new AtomicInteger();
    public c.c.a.a.q1.m A;
    public boolean B;
    public t C;
    public int D;
    public boolean E;
    public volatile boolean F;
    public boolean G;
    public final int j;
    public final int k;
    public final Uri l;
    public final c.c.a.a.y1.n m;
    public final c.c.a.a.y1.q n;
    public final boolean o;
    public final boolean p;
    public final k0 q;
    public final boolean r;
    public final n s;
    public final List<l0> t;
    public final c.c.a.a.p1.e u;
    public final c.c.a.a.q1.m v;
    public final c.c.a.a.s1.m.o w;
    public final c.c.a.a.z1.z x;
    public final boolean y;
    public final boolean z;

    public p(n nVar, c.c.a.a.y1.n nVar2, c.c.a.a.y1.q qVar, l0 l0Var, boolean z, c.c.a.a.y1.n nVar3, c.c.a.a.y1.q qVar2, boolean z2, Uri uri, List<l0> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, boolean z4, k0 k0Var, c.c.a.a.p1.e eVar, c.c.a.a.q1.m mVar, c.c.a.a.s1.m.o oVar, c.c.a.a.z1.z zVar, boolean z5) {
        super(nVar2, qVar, l0Var, i, obj, j, j2, j3);
        this.y = z;
        this.k = i2;
        this.m = nVar3;
        this.n = qVar2;
        this.z = z2;
        this.l = uri;
        this.o = z4;
        this.q = k0Var;
        this.p = z3;
        this.s = nVar;
        this.t = list;
        this.u = eVar;
        this.v = mVar;
        this.w = oVar;
        this.x = zVar;
        this.r = z5;
        this.E = qVar2 != null;
        this.j = H.getAndIncrement();
    }

    public static byte[] f(String str) {
        if (c.c.a.a.z1.l0.I(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // c.c.a.a.y1.l0
    public void a() {
        c.c.a.a.q1.m mVar;
        if (this.A == null && (mVar = this.v) != null) {
            this.A = mVar;
            this.B = true;
            this.E = false;
            this.C.y(this.j, this.r, true);
        }
        if (this.E) {
            e(this.m, this.n, this.z);
            this.D = 0;
            this.E = false;
        }
        if (this.F) {
            return;
        }
        if (!this.p) {
            if (this.o) {
                k0 k0Var = this.q;
                if (k0Var.f3758a == Long.MAX_VALUE) {
                    k0Var.d(this.f2947f);
                }
            } else {
                k0 k0Var2 = this.q;
                synchronized (k0Var2) {
                    while (k0Var2.f3760c == -9223372036854775807L) {
                        k0Var2.wait();
                    }
                }
            }
            e(this.h, this.f2942a, this.y);
        }
        this.G = true;
    }

    @Override // c.c.a.a.y1.l0
    public void b() {
        this.F = true;
    }

    @Override // c.c.a.a.u1.v0.m
    public boolean d() {
        return this.G;
    }

    public final void e(c.c.a.a.y1.n nVar, c.c.a.a.y1.q qVar, boolean z) {
        c.c.a.a.y1.q c2;
        boolean z2;
        int i = 0;
        if (z) {
            z2 = this.D != 0;
            c2 = qVar;
        } else {
            c2 = qVar.c(this.D);
            z2 = false;
        }
        try {
            c.c.a.a.q1.j g = g(nVar, c2);
            if (z2) {
                g.h(this.D);
            }
            while (i == 0) {
                try {
                    if (this.F) {
                        break;
                    } else {
                        i = this.A.d(g, null);
                    }
                } finally {
                    this.D = (int) (g.f2650d - qVar.f3654d);
                }
            }
            int i2 = c.c.a.a.z1.l0.f3761a;
            try {
                nVar.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            int i3 = c.c.a.a.z1.l0.f3761a;
            if (nVar != null) {
                try {
                    nVar.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x022f, code lost:
    
        if (c.c.a.a.u1.x0.f.d(r3, r8) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x023e, code lost:
    
        if (c.c.a.a.u1.x0.f.d(r3, r8) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x024d, code lost:
    
        if (c.c.a.a.u1.x0.f.d(r3, r8) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ef, code lost:
    
        if (c.c.a.a.u1.x0.f.d(r3, r8) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x024f, code lost:
    
        r1 = c.c.a.a.u1.x0.f.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ff, code lost:
    
        if (c.c.a.a.u1.x0.f.d(r3, r8) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x020f, code lost:
    
        if (c.c.a.a.u1.x0.f.d(r3, r8) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x021f, code lost:
    
        if (c.c.a.a.u1.x0.f.d(r3, r8) != false) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c.c.a.a.q1.j g(c.c.a.a.y1.n r17, c.c.a.a.y1.q r18) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.x0.p.g(c.c.a.a.y1.n, c.c.a.a.y1.q):c.c.a.a.q1.j");
    }
}
