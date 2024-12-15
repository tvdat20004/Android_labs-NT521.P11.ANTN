package c.c.a.a.q1.b0;

import android.util.SparseArray;
import c.c.a.a.q1.m;
import c.c.a.a.q1.n;
import c.c.a.a.q1.y;
import c.c.a.a.s0;
import c.c.a.a.x1.p;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.r;
import c.c.a.a.z1.x;
import c.c.a.a.z1.z;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public class h implements m {
    public static final byte[] Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    public static final byte[] b0 = l0.s("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final byte[] c0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] d0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    public static final UUID e0 = new UUID(72057594037932032L, -9223371306706625679L);
    public long A;
    public r B;
    public r C;
    public boolean D;
    public int E;
    public long F;
    public long G;
    public int H;
    public int I;
    public int[] J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public byte S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public n Y;

    /* renamed from: a, reason: collision with root package name */
    public final c f2257a;

    /* renamed from: b, reason: collision with root package name */
    public final j f2258b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray<f> f2259c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2260d;

    /* renamed from: e, reason: collision with root package name */
    public final z f2261e;

    /* renamed from: f, reason: collision with root package name */
    public final z f2262f;
    public final z g;
    public final z h;
    public final z i;
    public final z j;
    public final z k;
    public final z l;
    public final z m;
    public ByteBuffer n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public f t;
    public boolean u;
    public int v;
    public long w;
    public boolean x;
    public long y;
    public long z;

    public h(int i) {
        c cVar = new c();
        this.p = -1L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.y = -1L;
        this.z = -1L;
        this.A = -9223372036854775807L;
        this.f2257a = cVar;
        cVar.f2241d = new e(this, null);
        this.f2260d = (i & 1) == 0;
        this.f2258b = new j();
        this.f2259c = new SparseArray<>();
        this.g = new z(4);
        this.h = new z(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new z(4);
        this.f2261e = new z(x.f3792a);
        this.f2262f = new z(4);
        this.j = new z();
        this.k = new z();
        this.l = new z(8);
        this.m = new z();
    }

    public static int[] f(int[] iArr, int i) {
        return iArr == null ? new int[i] : iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    @Override // c.c.a.a.q1.m
    public final void a() {
    }

    public final void b(f fVar, long j) {
        g gVar = fVar.Q;
        if (gVar == null) {
            if ("S_TEXT/UTF8".equals(fVar.f2246b)) {
                c(fVar, "%02d:%02d:%02d,%03d", 19, 1000L, a0);
            } else if ("S_TEXT/ASS".equals(fVar.f2246b)) {
                c(fVar, "%01d:%02d:%02d:%02d", 21, 10000L, d0);
            }
            fVar.U.d(j, this.M, this.V, 0, fVar.h);
        } else if (gVar.f2252b) {
            int i = gVar.f2253c;
            int i2 = i + 1;
            gVar.f2253c = i2;
            if (i == 0) {
                gVar.f2255e = j;
            }
            if (i2 >= 16) {
                fVar.U.d(gVar.f2255e, gVar.f2256f, gVar.f2254d, 0, fVar.h);
                gVar.f2253c = 0;
            }
        }
        this.W = true;
        k();
    }

    public final void c(f fVar, String str, int i, long j, byte[] bArr) {
        byte[] s;
        byte[] bArr2;
        byte[] bArr3 = this.k.f3800a;
        long j2 = this.G;
        if (j2 == -9223372036854775807L) {
            s = bArr;
            bArr2 = s;
        } else {
            int i2 = (int) (j2 / 3600000000L);
            long j3 = j2 - ((i2 * 3600) * 1000000);
            int i3 = (int) (j3 / 60000000);
            long j4 = j3 - ((i3 * 60) * 1000000);
            int i4 = (int) (j4 / 1000000);
            s = l0.s(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j4 - (i4 * 1000000)) / j))));
            bArr2 = bArr;
        }
        System.arraycopy(s, 0, bArr3, i, bArr2.length);
        y yVar = fVar.U;
        z zVar = this.k;
        yVar.a(zVar, zVar.f3802c);
        this.V += this.k.f3802c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0005 A[SYNTHETIC] */
    @Override // c.c.a.a.q1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(c.c.a.a.q1.j r11, c.c.a.a.q1.s r12) {
        /*
            r10 = this;
            r0 = 0
            r10.W = r0
            r1 = 1
            r2 = r1
        L5:
            if (r2 == 0) goto L38
            boolean r3 = r10.W
            if (r3 != 0) goto L38
            c.c.a.a.q1.b0.c r2 = r10.f2257a
            boolean r2 = r2.b(r11)
            if (r2 == 0) goto L5
            long r3 = r11.f2650d
            boolean r5 = r10.x
            if (r5 == 0) goto L23
            r10.z = r3
            long r3 = r10.y
            r12.f2664a = r3
            r10.x = r0
        L21:
            r3 = r1
            goto L35
        L23:
            boolean r3 = r10.u
            if (r3 == 0) goto L34
            long r3 = r10.z
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L34
            r12.f2664a = r3
            r10.z = r5
            goto L21
        L34:
            r3 = r0
        L35:
            if (r3 == 0) goto L5
            return r1
        L38:
            if (r2 != 0) goto L6c
            r11 = r0
        L3b:
            android.util.SparseArray<c.c.a.a.q1.b0.f> r12 = r10.f2259c
            int r12 = r12.size()
            if (r11 >= r12) goto L6a
            android.util.SparseArray<c.c.a.a.q1.b0.f> r12 = r10.f2259c
            java.lang.Object r12 = r12.valueAt(r11)
            c.c.a.a.q1.b0.f r12 = (c.c.a.a.q1.b0.f) r12
            c.c.a.a.q1.b0.g r1 = r12.Q
            if (r1 == 0) goto L67
            boolean r2 = r1.f2252b
            if (r2 == 0) goto L67
            int r2 = r1.f2253c
            if (r2 <= 0) goto L67
            c.c.a.a.q1.y r3 = r12.U
            long r4 = r1.f2255e
            int r6 = r1.f2256f
            int r7 = r1.f2254d
            r8 = 0
            c.c.a.a.q1.x r9 = r12.h
            r3.d(r4, r6, r7, r8, r9)
            r1.f2253c = r0
        L67:
            int r11 = r11 + 1
            goto L3b
        L6a:
            r11 = -1
            return r11
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.b0.h.d(c.c.a.a.q1.j, c.c.a.a.q1.s):int");
    }

    @Override // c.c.a.a.q1.m
    public final void e(n nVar) {
        this.Y = nVar;
    }

    public final void g(c.c.a.a.q1.j jVar, int i) {
        z zVar = this.g;
        if (zVar.f3802c >= i) {
            return;
        }
        byte[] bArr = zVar.f3800a;
        if (bArr.length < i) {
            zVar.y(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i)), this.g.f3802c);
        }
        z zVar2 = this.g;
        byte[] bArr2 = zVar2.f3800a;
        int i2 = zVar2.f3802c;
        jVar.g(bArr2, i2, i - i2, false);
        this.g.z(i);
    }

    @Override // c.c.a.a.q1.m
    public void h(long j, long j2) {
        this.A = -9223372036854775807L;
        this.E = 0;
        c cVar = this.f2257a;
        cVar.f2242e = 0;
        cVar.f2239b.clear();
        j jVar = cVar.f2240c;
        jVar.f2267b = 0;
        jVar.f2268c = 0;
        j jVar2 = this.f2258b;
        jVar2.f2267b = 0;
        jVar2.f2268c = 0;
        k();
        for (int i = 0; i < this.f2259c.size(); i++) {
            g gVar = this.f2259c.valueAt(i).Q;
            if (gVar != null) {
                gVar.f2252b = false;
            }
        }
    }

    @Override // c.c.a.a.q1.m
    public final boolean i(c.c.a.a.q1.j jVar) {
        i iVar = new i();
        long j = jVar.f2649c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        jVar.d(iVar.f2263a.f3800a, 0, 4, false);
        iVar.f2264b = 4;
        for (long q = iVar.f2263a.q(); q != 440786851; q = ((q << 8) & (-256)) | (iVar.f2263a.f3800a[0] & 255)) {
            int i2 = iVar.f2264b + 1;
            iVar.f2264b = i2;
            if (i2 == i) {
                return false;
            }
            jVar.d(iVar.f2263a.f3800a, 0, 1, false);
        }
        long a2 = iVar.a(jVar);
        long j3 = iVar.f2264b;
        if (a2 == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j3 + a2 >= j) {
            return false;
        }
        while (true) {
            long j4 = iVar.f2264b;
            long j5 = j3 + a2;
            if (j4 >= j5) {
                return j4 == j5;
            }
            if (iVar.a(jVar) == Long.MIN_VALUE) {
                return false;
            }
            long a3 = iVar.a(jVar);
            if (a3 < 0 || a3 > 2147483647L) {
                return false;
            }
            if (a3 != 0) {
                int i3 = (int) a3;
                jVar.a(i3, false);
                iVar.f2264b += i3;
            }
        }
    }

    public final int j(c.c.a.a.q1.j jVar, y yVar, int i) {
        int c2;
        int a2 = this.j.a();
        if (a2 > 0) {
            c2 = Math.min(i, a2);
            yVar.a(this.j, c2);
        } else {
            c2 = yVar.c(jVar, i, false);
        }
        this.N += c2;
        this.V += c2;
        return c2;
    }

    public final void k() {
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        this.j.v();
    }

    public final long l(long j) {
        long j2 = this.q;
        if (j2 != -9223372036854775807L) {
            return l0.C(j, j2, 1000L);
        }
        throw new s0("Can't scale timecode prior to timecodeScale being set.");
    }

    public final void m(c.c.a.a.q1.j jVar, f fVar, int i) {
        int i2;
        int i3;
        if ("S_TEXT/UTF8".equals(fVar.f2246b)) {
            n(jVar, Z, i);
            return;
        }
        if ("S_TEXT/ASS".equals(fVar.f2246b)) {
            n(jVar, c0, i);
            return;
        }
        y yVar = fVar.U;
        if (!this.O) {
            if (fVar.f2250f) {
                this.M &= -1073741825;
                if (!this.P) {
                    jVar.g(this.g.f3800a, 0, 1, false);
                    this.N++;
                    byte[] bArr = this.g.f3800a;
                    if ((bArr[0] & 128) == 128) {
                        throw new s0("Extension bit is set in signal byte");
                    }
                    this.S = bArr[0];
                    this.P = true;
                }
                byte b2 = this.S;
                if ((b2 & 1) == 1) {
                    boolean z = (b2 & 2) == 2;
                    this.M |= 1073741824;
                    if (!this.Q) {
                        jVar.g(this.l.f3800a, 0, 8, false);
                        this.N += 8;
                        this.Q = true;
                        z zVar = this.g;
                        zVar.f3800a[0] = (byte) ((z ? 128 : 0) | 8);
                        zVar.A(0);
                        yVar.a(this.g, 1);
                        this.V++;
                        this.l.A(0);
                        yVar.a(this.l, 8);
                        this.V += 8;
                    }
                    if (z) {
                        if (!this.R) {
                            jVar.g(this.g.f3800a, 0, 1, false);
                            this.N++;
                            this.g.A(0);
                            this.T = this.g.p();
                            this.R = true;
                        }
                        int i4 = this.T * 4;
                        this.g.w(i4);
                        jVar.g(this.g.f3800a, 0, i4, false);
                        this.N += i4;
                        short s = (short) ((this.T / 2) + 1);
                        int i5 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.n;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.n = ByteBuffer.allocate(i5);
                        }
                        this.n.position(0);
                        this.n.putShort(s);
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i3 = this.T;
                            if (i6 >= i3) {
                                break;
                            }
                            int s2 = this.g.s();
                            if (i6 % 2 == 0) {
                                this.n.putShort((short) (s2 - i7));
                            } else {
                                this.n.putInt(s2 - i7);
                            }
                            i6++;
                            i7 = s2;
                        }
                        int i8 = (i - this.N) - i7;
                        int i9 = i3 % 2;
                        ByteBuffer byteBuffer2 = this.n;
                        if (i9 == 1) {
                            byteBuffer2.putInt(i8);
                        } else {
                            byteBuffer2.putShort((short) i8);
                            this.n.putInt(0);
                        }
                        this.m.y(this.n.array(), i5);
                        yVar.a(this.m, i5);
                        this.V += i5;
                    }
                }
            } else {
                byte[] bArr2 = fVar.g;
                if (bArr2 != null) {
                    z zVar2 = this.j;
                    int length = bArr2.length;
                    zVar2.f3800a = bArr2;
                    zVar2.f3802c = length;
                    zVar2.f3801b = 0;
                }
            }
            this.O = true;
        }
        int i10 = i + this.j.f3802c;
        if (!"V_MPEG4/ISO/AVC".equals(fVar.f2246b) && !"V_MPEGH/ISO/HEVC".equals(fVar.f2246b)) {
            if (fVar.Q != null) {
                p.g(this.j.f3802c == 0);
                g gVar = fVar.Q;
                int i11 = this.M;
                if (!gVar.f2252b) {
                    jVar.d(gVar.f2251a, 0, 10, false);
                    jVar.f2652f = 0;
                    byte[] bArr3 = gVar.f2251a;
                    if (bArr3[4] == -8 && bArr3[5] == 114 && bArr3[6] == 111 && (bArr3[7] & 254) == 186) {
                        i2 = 40 << ((bArr3[(bArr3[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
                    } else {
                        i2 = 0;
                    }
                    if (i2 != 0) {
                        gVar.f2252b = true;
                        gVar.f2253c = 0;
                    }
                }
                if (gVar.f2253c == 0) {
                    gVar.f2256f = i11;
                    gVar.f2254d = 0;
                }
                gVar.f2254d += i10;
            }
            while (true) {
                int i12 = this.N;
                if (i12 >= i10) {
                    break;
                } else {
                    j(jVar, yVar, i10 - i12);
                }
            }
        } else {
            byte[] bArr4 = this.f2262f.f3800a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i13 = fVar.V;
            int i14 = 4 - i13;
            while (this.N < i10) {
                int i15 = this.U;
                if (i15 == 0) {
                    int min = Math.min(i13, this.j.a());
                    jVar.g(bArr4, i14 + min, i13 - min, false);
                    if (min > 0) {
                        z zVar3 = this.j;
                        System.arraycopy(zVar3.f3800a, zVar3.f3801b, bArr4, i14, min);
                        zVar3.f3801b += min;
                    }
                    this.N += i13;
                    this.f2262f.A(0);
                    this.U = this.f2262f.s();
                    this.f2261e.A(0);
                    yVar.a(this.f2261e, 4);
                    this.V += 4;
                } else {
                    this.U = i15 - j(jVar, yVar, i15);
                }
            }
        }
        if ("A_VORBIS".equals(fVar.f2246b)) {
            this.h.A(0);
            yVar.a(this.h, 4);
            this.V += 4;
        }
    }

    public final void n(c.c.a.a.q1.j jVar, byte[] bArr, int i) {
        int length = bArr.length + i;
        z zVar = this.k;
        byte[] bArr2 = zVar.f3800a;
        if (bArr2.length < length) {
            zVar.f3800a = Arrays.copyOf(bArr, length + i);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        jVar.g(this.k.f3800a, bArr.length, i, false);
        this.k.w(length);
    }
}
