package c.c.a.a.u1;

import android.media.MediaCodec;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class k0 implements c.c.a.a.q1.y {

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.y1.r f2893a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2894b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f2895c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f2896d;

    /* renamed from: e, reason: collision with root package name */
    public final c.c.a.a.z1.z f2897e;

    /* renamed from: f, reason: collision with root package name */
    public i0 f2898f;
    public i0 g;
    public i0 h;
    public c.c.a.a.l0 i;
    public boolean j;
    public c.c.a.a.l0 k;
    public long l;
    public long m;
    public boolean n;
    public j0 o;

    public k0(c.c.a.a.y1.r rVar) {
        this.f2893a = rVar;
        int i = rVar.f3658b;
        this.f2894b = i;
        this.f2895c = new h0();
        this.f2896d = new g0();
        this.f2897e = new c.c.a.a.z1.z(32);
        i0 i0Var = new i0(0L, i);
        this.f2898f = i0Var;
        this.g = i0Var;
        this.h = i0Var;
    }

    @Override // c.c.a.a.q1.y
    public void a(c.c.a.a.z1.z zVar, int i) {
        while (i > 0) {
            int r = r(i);
            i0 i0Var = this.h;
            zVar.c(i0Var.f2889d.f3617a, i0Var.a(this.m), r);
            i -= r;
            q(r);
        }
    }

    @Override // c.c.a.a.q1.y
    public void b(c.c.a.a.l0 l0Var) {
        c.c.a.a.l0 l0Var2;
        boolean z;
        long j = this.l;
        if (l0Var == null) {
            l0Var2 = null;
        } else {
            if (j != 0) {
                long j2 = l0Var.n;
                if (j2 != Long.MAX_VALUE) {
                    l0Var2 = l0Var.n(j2 + j);
                }
            }
            l0Var2 = l0Var;
        }
        h0 h0Var = this.f2895c;
        synchronized (h0Var) {
            z = true;
            if (l0Var2 == null) {
                h0Var.q = true;
            } else {
                h0Var.q = false;
                if (!c.c.a.a.z1.l0.a(l0Var2, h0Var.r)) {
                    h0Var.r = l0Var2;
                }
            }
            z = false;
        }
        this.k = l0Var;
        this.j = false;
        j0 j0Var = this.o;
        if (j0Var == null || !z) {
            return;
        }
        j0Var.r(l0Var2);
    }

    @Override // c.c.a.a.q1.y
    public int c(c.c.a.a.q1.j jVar, int i, boolean z) {
        int r = r(i);
        i0 i0Var = this.h;
        int e2 = jVar.e(i0Var.f2889d.f3617a, i0Var.a(this.m), r);
        if (e2 != -1) {
            q(e2);
            return e2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // c.c.a.a.q1.y
    public void d(long j, int i, int i2, int i3, c.c.a.a.q1.x xVar) {
        boolean z;
        if (this.j) {
            b(this.k);
        }
        long j2 = j + this.l;
        if (this.n) {
            if ((i & 1) == 0) {
                return;
            }
            h0 h0Var = this.f2895c;
            synchronized (h0Var) {
                if (h0Var.i == 0) {
                    z = j2 > h0Var.m;
                } else if (Math.max(h0Var.m, h0Var.d(h0Var.l)) >= j2) {
                    z = false;
                } else {
                    int i4 = h0Var.i;
                    int e2 = h0Var.e(i4 - 1);
                    while (i4 > h0Var.l && h0Var.f2882f[e2] >= j2) {
                        i4--;
                        e2--;
                        if (e2 == -1) {
                            e2 = h0Var.f2877a - 1;
                        }
                    }
                    h0Var.b(h0Var.j + i4);
                    z = true;
                }
            }
            if (!z) {
                return;
            } else {
                this.n = false;
            }
        }
        long j3 = (this.m - i2) - i3;
        h0 h0Var2 = this.f2895c;
        synchronized (h0Var2) {
            if (h0Var2.p) {
                if ((i & 1) != 0) {
                    h0Var2.p = false;
                }
            }
            c.c.a.a.x1.p.g(!h0Var2.q);
            h0Var2.o = (536870912 & i) != 0;
            h0Var2.n = Math.max(h0Var2.n, j2);
            int e3 = h0Var2.e(h0Var2.i);
            h0Var2.f2882f[e3] = j2;
            long[] jArr = h0Var2.f2879c;
            jArr[e3] = j3;
            h0Var2.f2880d[e3] = i2;
            h0Var2.f2881e[e3] = i;
            h0Var2.g[e3] = xVar;
            h0Var2.h[e3] = h0Var2.r;
            h0Var2.f2878b[e3] = h0Var2.s;
            int i5 = h0Var2.i + 1;
            h0Var2.i = i5;
            int i6 = h0Var2.f2877a;
            if (i5 == i6) {
                int i7 = i6 + 1000;
                int[] iArr = new int[i7];
                long[] jArr2 = new long[i7];
                long[] jArr3 = new long[i7];
                int[] iArr2 = new int[i7];
                int[] iArr3 = new int[i7];
                c.c.a.a.q1.x[] xVarArr = new c.c.a.a.q1.x[i7];
                c.c.a.a.l0[] l0VarArr = new c.c.a.a.l0[i7];
                int i8 = h0Var2.k;
                int i9 = i6 - i8;
                System.arraycopy(jArr, i8, jArr2, 0, i9);
                System.arraycopy(h0Var2.f2882f, h0Var2.k, jArr3, 0, i9);
                System.arraycopy(h0Var2.f2881e, h0Var2.k, iArr2, 0, i9);
                System.arraycopy(h0Var2.f2880d, h0Var2.k, iArr3, 0, i9);
                System.arraycopy(h0Var2.g, h0Var2.k, xVarArr, 0, i9);
                System.arraycopy(h0Var2.h, h0Var2.k, l0VarArr, 0, i9);
                System.arraycopy(h0Var2.f2878b, h0Var2.k, iArr, 0, i9);
                int i10 = h0Var2.k;
                System.arraycopy(h0Var2.f2879c, 0, jArr2, i9, i10);
                System.arraycopy(h0Var2.f2882f, 0, jArr3, i9, i10);
                System.arraycopy(h0Var2.f2881e, 0, iArr2, i9, i10);
                System.arraycopy(h0Var2.f2880d, 0, iArr3, i9, i10);
                System.arraycopy(h0Var2.g, 0, xVarArr, i9, i10);
                System.arraycopy(h0Var2.h, 0, l0VarArr, i9, i10);
                System.arraycopy(h0Var2.f2878b, 0, iArr, i9, i10);
                h0Var2.f2879c = jArr2;
                h0Var2.f2882f = jArr3;
                h0Var2.f2881e = iArr2;
                h0Var2.f2880d = iArr3;
                h0Var2.g = xVarArr;
                h0Var2.h = l0VarArr;
                h0Var2.f2878b = iArr;
                h0Var2.k = 0;
                h0Var2.i = h0Var2.f2877a;
                h0Var2.f2877a = i7;
            }
        }
    }

    public int e(long j, boolean z, boolean z2) {
        int c2;
        h0 h0Var = this.f2895c;
        synchronized (h0Var) {
            int e2 = h0Var.e(h0Var.l);
            if (h0Var.f() && j >= h0Var.f2882f[e2] && ((j <= h0Var.n || z2) && (c2 = h0Var.c(e2, h0Var.i - h0Var.l, j, z)) != -1)) {
                h0Var.l += c2;
                return c2;
            }
            return -1;
        }
    }

    public int f() {
        int i;
        h0 h0Var = this.f2895c;
        synchronized (h0Var) {
            int i2 = h0Var.i;
            i = i2 - h0Var.l;
            h0Var.l = i2;
        }
        return i;
    }

    public final void g(i0 i0Var) {
        if (i0Var.f2888c) {
            i0 i0Var2 = this.h;
            int i = (((int) (i0Var2.f2886a - i0Var.f2886a)) / this.f2894b) + (i0Var2.f2888c ? 1 : 0);
            c.c.a.a.y1.d[] dVarArr = new c.c.a.a.y1.d[i];
            int i2 = 0;
            while (i2 < i) {
                dVarArr[i2] = i0Var.f2889d;
                i0Var.f2889d = null;
                i0 i0Var3 = i0Var.f2890e;
                i0Var.f2890e = null;
                i2++;
                i0Var = i0Var3;
            }
            this.f2893a.a(dVarArr);
        }
    }

    public final void h(long j) {
        i0 i0Var;
        if (j == -1) {
            return;
        }
        while (true) {
            i0Var = this.f2898f;
            if (j < i0Var.f2887b) {
                break;
            }
            c.c.a.a.y1.r rVar = this.f2893a;
            c.c.a.a.y1.d dVar = i0Var.f2889d;
            synchronized (rVar) {
                c.c.a.a.y1.d[] dVarArr = rVar.f3659c;
                dVarArr[0] = dVar;
                rVar.a(dVarArr);
            }
            i0 i0Var2 = this.f2898f;
            i0Var2.f2889d = null;
            i0 i0Var3 = i0Var2.f2890e;
            i0Var2.f2890e = null;
            this.f2898f = i0Var3;
        }
        if (this.g.f2886a < i0Var.f2886a) {
            this.g = i0Var;
        }
    }

    public void i(long j, boolean z, boolean z2) {
        long j2;
        int i;
        h0 h0Var = this.f2895c;
        synchronized (h0Var) {
            int i2 = h0Var.i;
            j2 = -1;
            if (i2 != 0) {
                long[] jArr = h0Var.f2882f;
                int i3 = h0Var.k;
                if (j >= jArr[i3]) {
                    int c2 = h0Var.c(i3, (!z2 || (i = h0Var.l) == i2) ? i2 : i + 1, j, z);
                    if (c2 != -1) {
                        j2 = h0Var.a(c2);
                    }
                }
            }
        }
        h(j2);
    }

    public void j() {
        long a2;
        h0 h0Var = this.f2895c;
        synchronized (h0Var) {
            int i = h0Var.i;
            a2 = i == 0 ? -1L : h0Var.a(i);
        }
        h(a2);
    }

    public void k(int i) {
        long b2 = this.f2895c.b(i);
        this.m = b2;
        if (b2 != 0) {
            i0 i0Var = this.f2898f;
            if (b2 != i0Var.f2886a) {
                while (this.m > i0Var.f2887b) {
                    i0Var = i0Var.f2890e;
                }
                i0 i0Var2 = i0Var.f2890e;
                g(i0Var2);
                i0 i0Var3 = new i0(i0Var.f2887b, this.f2894b);
                i0Var.f2890e = i0Var3;
                if (this.m == i0Var.f2887b) {
                    i0Var = i0Var3;
                }
                this.h = i0Var;
                if (this.g == i0Var2) {
                    this.g = i0Var3;
                    return;
                }
                return;
            }
        }
        g(this.f2898f);
        i0 i0Var4 = new i0(this.m, this.f2894b);
        this.f2898f = i0Var4;
        this.g = i0Var4;
        this.h = i0Var4;
    }

    public long l() {
        long j;
        h0 h0Var = this.f2895c;
        synchronized (h0Var) {
            j = h0Var.n;
        }
        return j;
    }

    public int m() {
        h0 h0Var = this.f2895c;
        return h0Var.j + h0Var.l;
    }

    public c.c.a.a.l0 n() {
        c.c.a.a.l0 l0Var;
        h0 h0Var = this.f2895c;
        synchronized (h0Var) {
            l0Var = h0Var.q ? null : h0Var.r;
        }
        return l0Var;
    }

    public boolean o() {
        return this.f2895c.f();
    }

    public int p() {
        h0 h0Var = this.f2895c;
        return h0Var.f() ? h0Var.f2878b[h0Var.e(h0Var.l)] : h0Var.s;
    }

    public final void q(int i) {
        long j = this.m + i;
        this.m = j;
        i0 i0Var = this.h;
        if (j == i0Var.f2887b) {
            this.h = i0Var.f2890e;
        }
    }

    public final int r(int i) {
        c.c.a.a.y1.d dVar;
        i0 i0Var = this.h;
        if (!i0Var.f2888c) {
            c.c.a.a.y1.r rVar = this.f2893a;
            synchronized (rVar) {
                rVar.f3661e++;
                int i2 = rVar.f3662f;
                if (i2 > 0) {
                    c.c.a.a.y1.d[] dVarArr = rVar.g;
                    int i3 = i2 - 1;
                    rVar.f3662f = i3;
                    dVar = dVarArr[i3];
                    dVarArr[i3] = null;
                } else {
                    dVar = new c.c.a.a.y1.d(new byte[rVar.f3658b], 0);
                }
            }
            i0 i0Var2 = new i0(this.h.f2887b, this.f2894b);
            i0Var.f2889d = dVar;
            i0Var.f2890e = i0Var2;
            i0Var.f2888c = true;
        }
        return Math.min(i, (int) (this.h.f2887b - this.m));
    }

    public int s(c.c.a.a.m0 m0Var, c.c.a.a.o1.g gVar, boolean z, boolean z2, long j) {
        int i;
        int i2;
        char c2;
        h0 h0Var = this.f2895c;
        c.c.a.a.l0 l0Var = this.i;
        g0 g0Var = this.f2896d;
        synchronized (h0Var) {
            i2 = 1;
            if (h0Var.f()) {
                int e2 = h0Var.e(h0Var.l);
                if (!z && h0Var.h[e2] == l0Var) {
                    gVar.f2165b = h0Var.f2881e[e2];
                    gVar.f2181e = h0Var.f2882f[e2];
                    if (!(gVar.f2180d == null && gVar.f2182f == 0)) {
                        g0Var.f2871a = h0Var.f2880d[e2];
                        g0Var.f2872b = h0Var.f2879c[e2];
                        g0Var.f2873c = h0Var.g[e2];
                        h0Var.l++;
                    }
                    c2 = 65532;
                }
                m0Var.f2058a = h0Var.h[e2];
                c2 = 65531;
            } else {
                if (!z2 && !h0Var.o) {
                    c.c.a.a.l0 l0Var2 = h0Var.r;
                    if (l0Var2 == null || (!z && l0Var2 == l0Var)) {
                        c2 = 65533;
                    } else {
                        m0Var.f2058a = l0Var2;
                        c2 = 65531;
                    }
                }
                gVar.f2165b = 4;
                c2 = 65532;
            }
        }
        if (c2 == 65531) {
            this.i = m0Var.f2058a;
            return -5;
        }
        if (c2 != 65532) {
            if (c2 == 65533) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!gVar.h()) {
            if (gVar.f2181e < j) {
                gVar.e(Integer.MIN_VALUE);
            }
            if (!(gVar.f2180d == null && gVar.f2182f == 0)) {
                if (gVar.f(1073741824)) {
                    g0 g0Var2 = this.f2896d;
                    long j2 = g0Var2.f2872b;
                    this.f2897e.w(1);
                    t(j2, this.f2897e.f3800a, 1);
                    long j3 = j2 + 1;
                    byte b2 = this.f2897e.f3800a[0];
                    boolean z3 = (b2 & 128) != 0;
                    int i3 = b2 & Byte.MAX_VALUE;
                    c.c.a.a.o1.d dVar = gVar.f2179c;
                    if (dVar.f2168a == null) {
                        dVar.f2168a = new byte[16];
                    }
                    t(j3, dVar.f2168a, i3);
                    long j4 = j3 + i3;
                    if (z3) {
                        this.f2897e.w(2);
                        t(j4, this.f2897e.f3800a, 2);
                        j4 += 2;
                        i2 = this.f2897e.u();
                    }
                    c.c.a.a.o1.d dVar2 = gVar.f2179c;
                    int[] iArr = dVar2.f2169b;
                    if (iArr == null || iArr.length < i2) {
                        iArr = new int[i2];
                    }
                    int[] iArr2 = dVar2.f2170c;
                    if (iArr2 == null || iArr2.length < i2) {
                        iArr2 = new int[i2];
                    }
                    if (z3) {
                        int i4 = i2 * 6;
                        this.f2897e.w(i4);
                        t(j4, this.f2897e.f3800a, i4);
                        j4 += i4;
                        this.f2897e.A(0);
                        for (i = 0; i < i2; i++) {
                            iArr[i] = this.f2897e.u();
                            iArr2[i] = this.f2897e.s();
                        }
                    } else {
                        iArr[0] = 0;
                        iArr2[0] = g0Var2.f2871a - ((int) (j4 - g0Var2.f2872b));
                    }
                    c.c.a.a.q1.x xVar = g0Var2.f2873c;
                    c.c.a.a.o1.d dVar3 = gVar.f2179c;
                    byte[] bArr = xVar.f2673b;
                    byte[] bArr2 = dVar3.f2168a;
                    int i5 = xVar.f2672a;
                    int i6 = xVar.f2674c;
                    int i7 = xVar.f2675d;
                    dVar3.f2169b = iArr;
                    dVar3.f2170c = iArr2;
                    dVar3.f2168a = bArr2;
                    MediaCodec.CryptoInfo cryptoInfo = dVar3.f2171d;
                    cryptoInfo.numSubSamples = i2;
                    cryptoInfo.numBytesOfClearData = iArr;
                    cryptoInfo.numBytesOfEncryptedData = iArr2;
                    cryptoInfo.key = bArr;
                    cryptoInfo.iv = bArr2;
                    cryptoInfo.mode = i5;
                    if (c.c.a.a.z1.l0.f3761a >= 24) {
                        c.c.a.a.o1.c cVar = dVar3.f2172e;
                        cVar.f2167b.set(i6, i7);
                        cVar.f2166a.setPattern(cVar.f2167b);
                    }
                    long j5 = g0Var2.f2872b;
                    int i8 = (int) (j4 - j5);
                    g0Var2.f2872b = j5 + i8;
                    g0Var2.f2871a -= i8;
                }
                gVar.k(this.f2896d.f2871a);
                g0 g0Var3 = this.f2896d;
                long j6 = g0Var3.f2872b;
                ByteBuffer byteBuffer = gVar.f2180d;
                int i9 = g0Var3.f2871a;
                while (true) {
                    i0 i0Var = this.g;
                    if (j6 < i0Var.f2887b) {
                        break;
                    }
                    this.g = i0Var.f2890e;
                }
                while (i9 > 0) {
                    int min = Math.min(i9, (int) (this.g.f2887b - j6));
                    i0 i0Var2 = this.g;
                    byteBuffer.put(i0Var2.f2889d.f3617a, i0Var2.a(j6), min);
                    i9 -= min;
                    j6 += min;
                    i0 i0Var3 = this.g;
                    if (j6 == i0Var3.f2887b) {
                        this.g = i0Var3.f2890e;
                    }
                }
            }
        }
        return -4;
    }

    public final void t(long j, byte[] bArr, int i) {
        while (true) {
            i0 i0Var = this.g;
            if (j < i0Var.f2887b) {
                break;
            } else {
                this.g = i0Var.f2890e;
            }
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.g.f2887b - j));
            i0 i0Var2 = this.g;
            System.arraycopy(i0Var2.f2889d.f3617a, i0Var2.a(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            i0 i0Var3 = this.g;
            if (j == i0Var3.f2887b) {
                this.g = i0Var3.f2890e;
            }
        }
    }

    public void u(boolean z) {
        h0 h0Var = this.f2895c;
        h0Var.i = 0;
        h0Var.j = 0;
        h0Var.k = 0;
        h0Var.l = 0;
        h0Var.p = true;
        h0Var.m = Long.MIN_VALUE;
        h0Var.n = Long.MIN_VALUE;
        h0Var.o = false;
        if (z) {
            h0Var.r = null;
            h0Var.q = true;
        }
        g(this.f2898f);
        i0 i0Var = new i0(0L, this.f2894b);
        this.f2898f = i0Var;
        this.g = i0Var;
        this.h = i0Var;
        this.m = 0L;
        this.f2893a.c();
    }

    public void v() {
        h0 h0Var = this.f2895c;
        synchronized (h0Var) {
            h0Var.l = 0;
        }
        this.g = this.f2898f;
    }

    public void w(long j) {
        if (this.l != j) {
            this.l = j;
            this.j = true;
        }
    }
}
