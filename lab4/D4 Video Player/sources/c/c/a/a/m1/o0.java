package c.c.a.a.m1;

import android.app.UiModeManager;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class o0 extends c.c.a.a.r1.c implements c.c.a.a.z1.s {
    public int A0;
    public int B0;
    public long C0;
    public boolean D0;
    public boolean E0;
    public long F0;
    public int G0;
    public final Context p0;
    public final s q0;
    public final x r0;
    public final long[] s0;
    public int t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public MediaFormat x0;
    public int y0;
    public int z0;

    public o0(Context context, c.c.a.a.r1.e eVar, boolean z, boolean z2, Handler handler, t tVar, x xVar) {
        super(1, eVar, z, z2, 44100.0f);
        this.p0 = context.getApplicationContext();
        this.r0 = xVar;
        this.F0 = -9223372036854775807L;
        this.s0 = new long[10];
        this.q0 = new s(handler, tVar);
        ((j0) xVar).j = new n0(this, null);
    }

    @Override // c.c.a.a.r1.c
    public float E(float f2, c.c.a.a.l0 l0Var, c.c.a.a.l0[] l0VarArr) {
        int i = -1;
        for (c.c.a.a.l0 l0Var2 : l0VarArr) {
            int i2 = l0Var2.x;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f2 * i;
    }

    @Override // c.c.a.a.r1.c
    public List<c.c.a.a.r1.a> F(c.c.a.a.r1.e eVar, c.c.a.a.l0 l0Var, boolean z) {
        c.c.a.a.r1.a a2;
        if ((c0(l0Var.w, l0Var.j) != 0) && (a2 = ((c.c.a.a.r1.d) eVar).a()) != null) {
            return Collections.singletonList(a2);
        }
        String str = l0Var.j;
        Objects.requireNonNull((c.c.a.a.r1.d) eVar);
        List<c.c.a.a.r1.a> e2 = c.c.a.a.r1.n.e(str, z, false);
        if ("audio/eac3-joc".equals(l0Var.j)) {
            e2.addAll(c.c.a.a.r1.n.e("audio/eac3", z, false));
        }
        return Collections.unmodifiableList(e2);
    }

    @Override // c.c.a.a.r1.c
    public void J(final String str, final long j, final long j2) {
        final s sVar = this.q0;
        if (sVar.f2141b != null) {
            sVar.f2140a.post(new Runnable() { // from class: c.c.a.a.m1.d
                @Override // java.lang.Runnable
                public final void run() {
                    s sVar2 = s.this;
                    sVar2.f2141b.k(str, j, j2);
                }
            });
        }
    }

    @Override // c.c.a.a.r1.c
    public void K(final c.c.a.a.l0 l0Var) {
        super.K(l0Var);
        final s sVar = this.q0;
        if (sVar.f2141b != null) {
            sVar.f2140a.post(new Runnable() { // from class: c.c.a.a.m1.a
                @Override // java.lang.Runnable
                public final void run() {
                    s sVar2 = s.this;
                    sVar2.f2141b.A(l0Var);
                }
            });
        }
        this.y0 = "audio/raw".equals(l0Var.j) ? l0Var.y : 2;
        this.z0 = l0Var.w;
        this.A0 = l0Var.z;
        this.B0 = l0Var.A;
    }

    @Override // c.c.a.a.r1.c
    public void L(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int[] iArr;
        int i2;
        MediaFormat mediaFormat2 = this.x0;
        if (mediaFormat2 != null) {
            i = c0(mediaFormat2.getInteger("channel-count"), mediaFormat2.getString("mime"));
            mediaFormat = mediaFormat2;
        } else {
            i = this.y0;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.v0 && integer == 6 && (i2 = this.z0) < 6) {
            iArr = new int[i2];
            for (int i3 = 0; i3 < this.z0; i3++) {
                iArr[i3] = i3;
            }
        } else {
            iArr = null;
        }
        try {
            ((j0) this.r0).b(i, integer, integer2, 0, iArr, this.A0, this.B0);
        } catch (u e2) {
            throw c.c.a.a.z.a(e2, this.f2684d);
        }
    }

    @Override // c.c.a.a.r1.c
    public void M(long j) {
        while (true) {
            int i = this.G0;
            if (i == 0) {
                return;
            }
            long[] jArr = this.s0;
            if (j < jArr[0]) {
                return;
            }
            j0 j0Var = (j0) this.r0;
            if (j0Var.z == 1) {
                j0Var.z = 2;
            }
            int i2 = i - 1;
            this.G0 = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
        }
    }

    @Override // c.c.a.a.r1.c
    public void N(c.c.a.a.o1.g gVar) {
        if (this.D0 && !gVar.g()) {
            if (Math.abs(gVar.f2181e - this.C0) > 500000) {
                this.C0 = gVar.f2181e;
            }
            this.D0 = false;
        }
        this.F0 = Math.max(gVar.f2181e, this.F0);
    }

    @Override // c.c.a.a.r1.c
    public boolean P(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2, c.c.a.a.l0 l0Var) {
        if (this.w0 && j3 == 0 && (i2 & 4) != 0) {
            long j4 = this.F0;
            if (j4 != -9223372036854775807L) {
                j3 = j4;
            }
        }
        if (this.u0 && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.n0.f2178f++;
            j0 j0Var = (j0) this.r0;
            if (j0Var.z == 1) {
                j0Var.z = 2;
            }
            return true;
        }
        try {
            if (!((j0) this.r0).g(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.n0.f2177e++;
            return true;
        } catch (v | w e2) {
            throw c.c.a.a.z.a(e2, this.f2684d);
        }
    }

    @Override // c.c.a.a.r1.c
    public void S() {
        try {
            j0 j0Var = (j0) this.r0;
            if (!j0Var.J && j0Var.i() && j0Var.c()) {
                j0Var.k();
                j0Var.J = true;
            }
        } catch (w e2) {
            throw c.c.a.a.z.a(e2, this.f2684d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (((c.c.a.a.m1.j0) r10.r0).o(r13.w, r13.y) != false) goto L24;
     */
    @Override // c.c.a.a.r1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int Y(c.c.a.a.r1.e r11, c.c.a.a.p1.a<c.c.a.a.p1.h> r12, c.c.a.a.l0 r13) {
        /*
            r10 = this;
            java.lang.String r12 = r13.j
            boolean r0 = c.c.a.a.z1.u.h(r12)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            int r0 = c.c.a.a.z1.l0.f3761a
            r2 = 21
            if (r0 < r2) goto L13
            r0 = 32
            goto L14
        L13:
            r0 = r1
        L14:
            c.c.a.a.p1.e r2 = r13.m
            boolean r2 = c.c.a.a.r.u(r2)
            r3 = 4
            r4 = 1
            r5 = 8
            if (r2 == 0) goto L3a
            int r6 = r13.w
            int r6 = r10.c0(r6, r12)
            if (r6 == 0) goto L2a
            r6 = r4
            goto L2b
        L2a:
            r6 = r1
        L2b:
            if (r6 == 0) goto L3a
            r6 = r11
            c.c.a.a.r1.d r6 = (c.c.a.a.r1.d) r6
            c.c.a.a.r1.a r6 = r6.a()
            if (r6 == 0) goto L3a
            r11 = r0 | 8
            r11 = r11 | r3
            return r11
        L3a:
            java.lang.String r6 = "audio/raw"
            boolean r12 = r6.equals(r12)
            if (r12 == 0) goto L50
            c.c.a.a.m1.x r12 = r10.r0
            int r6 = r13.w
            int r7 = r13.y
            c.c.a.a.m1.j0 r12 = (c.c.a.a.m1.j0) r12
            boolean r12 = r12.o(r6, r7)
            if (r12 == 0) goto L5d
        L50:
            c.c.a.a.m1.x r12 = r10.r0
            int r6 = r13.w
            c.c.a.a.m1.j0 r12 = (c.c.a.a.m1.j0) r12
            r7 = 2
            boolean r12 = r12.o(r6, r7)
            if (r12 != 0) goto L5e
        L5d:
            return r4
        L5e:
            c.c.a.a.p1.e r12 = r13.m
            if (r12 == 0) goto L72
            r6 = r1
            r8 = r6
        L64:
            int r9 = r12.f2205e
            if (r6 >= r9) goto L73
            c.c.a.a.p1.d[] r9 = r12.f2202b
            r9 = r9[r6]
            boolean r9 = r9.g
            r8 = r8 | r9
            int r6 = r6 + 1
            goto L64
        L72:
            r8 = r1
        L73:
            java.lang.String r12 = r13.j
            c.c.a.a.r1.d r11 = (c.c.a.a.r1.d) r11
            java.util.Objects.requireNonNull(r11)
            java.util.List r11 = c.c.a.a.r1.n.e(r12, r8, r1)
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L94
            if (r8 == 0) goto L93
            java.lang.String r11 = r13.j
            java.util.List r11 = c.c.a.a.r1.n.e(r11, r1, r1)
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L93
            r4 = r7
        L93:
            return r4
        L94:
            if (r2 != 0) goto L97
            return r7
        L97:
            java.lang.Object r11 = r11.get(r1)
            c.c.a.a.r1.a r11 = (c.c.a.a.r1.a) r11
            boolean r12 = r11.b(r13)
            if (r12 == 0) goto Lab
            boolean r11 = r11.c(r13)
            if (r11 == 0) goto Lab
            r5 = 16
        Lab:
            if (r12 == 0) goto Lae
            goto Laf
        Lae:
            r3 = 3
        Laf:
            r11 = r5 | r0
            r11 = r11 | r3
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.m1.o0.Y(c.c.a.a.r1.e, c.c.a.a.p1.a, c.c.a.a.l0):int");
    }

    @Override // c.c.a.a.z1.s
    public c.c.a.a.u0 a() {
        return ((j0) this.r0).p;
    }

    @Override // c.c.a.a.z1.s
    public c.c.a.a.u0 b(c.c.a.a.u0 u0Var) {
        j0 j0Var = (j0) this.r0;
        f0 f0Var = j0Var.l;
        if (f0Var != null && !f0Var.j) {
            c.c.a.a.u0 u0Var2 = c.c.a.a.u0.f2816e;
            j0Var.p = u0Var2;
            return u0Var2;
        }
        c.c.a.a.u0 u0Var3 = j0Var.o;
        if (u0Var3 == null) {
            u0Var3 = !j0Var.i.isEmpty() ? j0Var.i.getLast().f2103a : j0Var.p;
        }
        if (!u0Var.equals(u0Var3)) {
            if (j0Var.i()) {
                j0Var.o = u0Var;
            } else {
                j0Var.p = u0Var;
            }
        }
        return j0Var.p;
    }

    public final int b0(c.c.a.a.r1.a aVar, c.c.a.a.l0 l0Var) {
        int i;
        if ("OMX.google.raw.decoder".equals(aVar.f2693a) && (i = c.c.a.a.z1.l0.f3761a) < 24) {
            if (i != 23) {
                return -1;
            }
            UiModeManager uiModeManager = (UiModeManager) this.p0.getApplicationContext().getSystemService("uimode");
            if (!(uiModeManager != null && uiModeManager.getCurrentModeType() == 4)) {
                return -1;
            }
        }
        return l0Var.k;
    }

    @Override // c.c.a.a.r1.c, c.c.a.a.b1
    public boolean c() {
        return ((j0) this.r0).h() || super.c();
    }

    public int c0(int i, String str) {
        if ("audio/eac3-joc".equals(str)) {
            if (((j0) this.r0).o(i, 18)) {
                return c.c.a.a.z1.u.b("audio/eac3-joc");
            }
            str = "audio/eac3";
        }
        int b2 = c.c.a.a.z1.u.b(str);
        if (((j0) this.r0).o(i, b2)) {
            return b2;
        }
        return 0;
    }

    @Override // c.c.a.a.r1.c, c.c.a.a.b1
    public boolean d() {
        if (this.j0) {
            j0 j0Var = (j0) this.r0;
            if (!j0Var.i() || (j0Var.J && !j0Var.h())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x00d8, code lost:
    
        if (r8 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00db, code lost:
    
        if (r8 == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024b A[Catch: Exception -> 0x026a, TRY_LEAVE, TryCatch #0 {Exception -> 0x026a, blocks: (B:52:0x0220, B:54:0x024b), top: B:51:0x0220 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0322  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0() {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.m1.o0.d0():void");
    }

    @Override // c.c.a.a.r, c.c.a.a.b1
    public c.c.a.a.z1.s e() {
        return this;
    }

    @Override // c.c.a.a.r, c.c.a.a.b1
    public void g(int i, Object obj) {
        if (i == 2) {
            x xVar = this.r0;
            float floatValue = ((Float) obj).floatValue();
            j0 j0Var = (j0) xVar;
            if (j0Var.B != floatValue) {
                j0Var.B = floatValue;
                j0Var.n();
                return;
            }
            return;
        }
        if (i == 3) {
            l lVar = (l) obj;
            j0 j0Var2 = (j0) this.r0;
            if (j0Var2.n.equals(lVar)) {
                return;
            }
            j0Var2.n = lVar;
            if (j0Var2.O) {
                return;
            }
            j0Var2.d();
            j0Var2.M = 0;
            return;
        }
        if (i != 5) {
            return;
        }
        b0 b0Var = (b0) obj;
        j0 j0Var3 = (j0) this.r0;
        if (j0Var3.N.equals(b0Var)) {
            return;
        }
        Objects.requireNonNull(b0Var);
        if (j0Var3.m != null) {
            Objects.requireNonNull(j0Var3.N);
        }
        j0Var3.N = b0Var;
    }

    @Override // c.c.a.a.z1.s
    public long i() {
        if (this.f2685e == 2) {
            d0();
        }
        return this.C0;
    }

    @Override // c.c.a.a.r1.c, c.c.a.a.r
    public void k() {
        try {
            this.F0 = -9223372036854775807L;
            this.G0 = 0;
            ((j0) this.r0).d();
            try {
                super.k();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.k();
                throw th;
            } finally {
            }
        }
    }

    @Override // c.c.a.a.r
    public void l(boolean z) {
        final c.c.a.a.o1.f fVar = new c.c.a.a.o1.f();
        this.n0 = fVar;
        final s sVar = this.q0;
        if (sVar.f2141b != null) {
            sVar.f2140a.post(new Runnable() { // from class: c.c.a.a.m1.e
                @Override // java.lang.Runnable
                public final void run() {
                    s sVar2 = s.this;
                    sVar2.f2141b.h(fVar);
                }
            });
        }
        int i = this.f2683c.f1987a;
        if (i == 0) {
            j0 j0Var = (j0) this.r0;
            if (j0Var.O) {
                j0Var.O = false;
                j0Var.M = 0;
                j0Var.d();
                return;
            }
            return;
        }
        j0 j0Var2 = (j0) this.r0;
        Objects.requireNonNull(j0Var2);
        c.c.a.a.x1.p.g(c.c.a.a.z1.l0.f3761a >= 21);
        if (j0Var2.O && j0Var2.M == i) {
            return;
        }
        j0Var2.O = true;
        j0Var2.M = i;
        j0Var2.d();
    }

    @Override // c.c.a.a.r
    public void m(long j, boolean z) {
        this.i0 = false;
        this.j0 = false;
        A();
        this.r.b();
        ((j0) this.r0).d();
        this.C0 = j;
        this.D0 = true;
        this.E0 = true;
        this.F0 = -9223372036854775807L;
        this.G0 = 0;
    }

    @Override // c.c.a.a.r1.c, c.c.a.a.r
    public void n() {
        try {
            try {
                R();
            } finally {
                W(null);
            }
        } finally {
            ((j0) this.r0).m();
        }
    }

    @Override // c.c.a.a.r
    public void o() {
        ((j0) this.r0).j();
    }

    @Override // c.c.a.a.r
    public void p() {
        d0();
        j0 j0Var = (j0) this.r0;
        boolean z = false;
        j0Var.L = false;
        if (j0Var.i()) {
            a0 a0Var = j0Var.h;
            a0Var.j = 0L;
            a0Var.u = 0;
            a0Var.t = 0;
            a0Var.k = 0L;
            if (a0Var.v == -9223372036854775807L) {
                z zVar = a0Var.f2066f;
                Objects.requireNonNull(zVar);
                zVar.a();
                z = true;
            }
            if (z) {
                j0Var.m.pause();
            }
        }
    }

    @Override // c.c.a.a.r
    public void q(c.c.a.a.l0[] l0VarArr, long j) {
        if (this.F0 != -9223372036854775807L) {
            int i = this.G0;
            if (i == this.s0.length) {
                StringBuilder j2 = c.a.a.a.a.j("Too many stream changes, so dropping change at ");
                j2.append(this.s0[this.G0 - 1]);
                Log.w("MediaCodecAudioRenderer", j2.toString());
            } else {
                this.G0 = i + 1;
            }
            this.s0[this.G0 - 1] = this.F0;
        }
    }

    @Override // c.c.a.a.r1.c
    public int w(MediaCodec mediaCodec, c.c.a.a.r1.a aVar, c.c.a.a.l0 l0Var, c.c.a.a.l0 l0Var2) {
        if (b0(aVar, l0Var2) <= this.t0 && l0Var.z == 0 && l0Var.A == 0 && l0Var2.z == 0 && l0Var2.A == 0) {
            if (aVar.d(l0Var, l0Var2, true)) {
                return 3;
            }
            if (c.c.a.a.z1.l0.a(l0Var.j, l0Var2.j) && l0Var.w == l0Var2.w && l0Var.x == l0Var2.x && l0Var.E(l0Var2)) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b4  */
    @Override // c.c.a.a.r1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(c.c.a.a.r1.a r9, android.media.MediaCodec r10, c.c.a.a.l0 r11, android.media.MediaCrypto r12, float r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.m1.o0.x(c.c.a.a.r1.a, android.media.MediaCodec, c.c.a.a.l0, android.media.MediaCrypto, float):void");
    }
}
