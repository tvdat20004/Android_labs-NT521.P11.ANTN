package c.c.a.a.r1;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import c.c.a.a.m0;
import c.c.a.a.r;
import c.c.a.a.s;
import c.c.a.a.z;
import c.c.a.a.z1.j0;
import c.c.a.a.z1.l0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class c extends r {
    public static final byte[] o0 = l0.j("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    public long A;
    public float B;
    public MediaCodec C;
    public c.c.a.a.l0 D;
    public float E;
    public ArrayDeque<a> F;
    public b G;
    public a H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public ByteBuffer[] S;
    public ByteBuffer[] T;
    public long U;
    public int V;
    public int W;
    public ByteBuffer X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public int b0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public long g0;
    public long h0;
    public boolean i0;
    public boolean j0;
    public final e k;
    public boolean k0;
    public final boolean l;
    public boolean l0;
    public final boolean m;
    public boolean m0;
    public final float n;
    public c.c.a.a.o1.f n0;
    public final c.c.a.a.o1.g o;
    public final c.c.a.a.o1.g p;
    public final m0 q;
    public final j0<c.c.a.a.l0> r;
    public final ArrayList<Long> s;
    public final MediaCodec.BufferInfo t;
    public c.c.a.a.l0 u;
    public c.c.a.a.l0 v;
    public c.c.a.a.p1.g<c.c.a.a.p1.h> w;
    public c.c.a.a.p1.g<c.c.a.a.p1.h> x;
    public MediaCrypto y;
    public boolean z;

    public c(int i, e eVar, boolean z, boolean z2, float f2) {
        super(i);
        Objects.requireNonNull(eVar);
        this.k = eVar;
        this.l = z;
        this.m = z2;
        this.n = f2;
        this.o = new c.c.a.a.o1.g(0);
        this.p = new c.c.a.a.o1.g(0);
        this.q = new m0();
        this.r = new j0<>();
        this.s = new ArrayList<>();
        this.t = new MediaCodec.BufferInfo();
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.E = -1.0f;
        this.B = 1.0f;
        this.A = -9223372036854775807L;
    }

    public final boolean A() {
        boolean B = B();
        if (B) {
            H();
        }
        return B;
    }

    public boolean B() {
        MediaCodec mediaCodec = this.C;
        if (mediaCodec == null) {
            return false;
        }
        if (this.d0 == 3 || this.L || (this.M && this.f0)) {
            R();
            return true;
        }
        mediaCodec.flush();
        T();
        U();
        this.U = -9223372036854775807L;
        this.f0 = false;
        this.e0 = false;
        this.l0 = true;
        this.P = false;
        this.Q = false;
        this.Y = false;
        this.Z = false;
        this.k0 = false;
        this.s.clear();
        this.h0 = -9223372036854775807L;
        this.g0 = -9223372036854775807L;
        this.c0 = 0;
        this.d0 = 0;
        this.b0 = this.a0 ? 1 : 0;
        return false;
    }

    public final List<a> C(boolean z) {
        List<a> F = F(this.k, this.u, z);
        if (F.isEmpty() && z) {
            F = F(this.k, this.u, false);
            if (!F.isEmpty()) {
                StringBuilder j = c.a.a.a.a.j("Drm session requires secure decoder for ");
                j.append(this.u.j);
                j.append(", but no secure decoder available. Trying to proceed with ");
                j.append(F);
                j.append(".");
                Log.w("MediaCodecRenderer", j.toString());
            }
        }
        return F;
    }

    public boolean D() {
        return false;
    }

    public abstract float E(float f2, c.c.a.a.l0 l0Var, c.c.a.a.l0[] l0VarArr);

    public abstract List<a> F(e eVar, c.c.a.a.l0 l0Var, boolean z);

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0179, code lost:
    
        if ("stvm8".equals(r1) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0189, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r8) == false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(c.c.a.a.r1.a r17, android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.r1.c.G(c.c.a.a.r1.a, android.media.MediaCrypto):void");
    }

    public final void H() {
        if (this.C != null || this.u == null) {
            return;
        }
        V(this.x);
        String str = this.u.j;
        c.c.a.a.p1.g<c.c.a.a.p1.h> gVar = this.w;
        if (gVar != null) {
            boolean z = false;
            if (this.y == null) {
                if (gVar.a() != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(null, null);
                        this.y = mediaCrypto;
                        this.z = mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e2) {
                        throw z.a(e2, this.f2684d);
                    }
                } else if (this.w.b() == null) {
                    return;
                }
            }
            if ("Amazon".equals(l0.f3763c)) {
                String str2 = l0.f3764d;
                if ("AFTM".equals(str2) || "AFTB".equals(str2)) {
                    z = true;
                }
            }
            if (z) {
                int state = this.w.getState();
                if (state == 1) {
                    throw z.a(this.w.b(), this.f2684d);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            I(this.y, this.z);
        } catch (b e3) {
            throw z.a(e3, this.f2684d);
        }
    }

    public final void I(MediaCrypto mediaCrypto, boolean z) {
        if (this.F == null) {
            try {
                List<a> C = C(z);
                ArrayDeque<a> arrayDeque = new ArrayDeque<>();
                this.F = arrayDeque;
                if (this.m) {
                    arrayDeque.addAll(C);
                } else if (!C.isEmpty()) {
                    this.F.add(C.get(0));
                }
                this.G = null;
            } catch (h e2) {
                throw new b(this.u, e2, z, -49998);
            }
        }
        if (this.F.isEmpty()) {
            throw new b(this.u, null, z, -49999);
        }
        while (this.C == null) {
            a peekFirst = this.F.peekFirst();
            if (!X(peekFirst)) {
                return;
            }
            try {
                G(peekFirst, mediaCrypto);
            } catch (Exception e3) {
                Log.w("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst, e3);
                this.F.removeFirst();
                c.c.a.a.l0 l0Var = this.u;
                String str = peekFirst.f2693a;
                b bVar = new b("Decoder init failed: " + str + ", " + l0Var, e3, l0Var.j, z, str, (l0.f3761a < 21 || !(e3 instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) e3).getDiagnosticInfo(), null);
                b bVar2 = this.G;
                if (bVar2 == null) {
                    this.G = bVar;
                } else {
                    this.G = new b(bVar2.getMessage(), bVar2.getCause(), bVar2.f2699b, bVar2.f2700c, bVar2.f2701d, bVar2.f2702e, bVar);
                }
                if (this.F.isEmpty()) {
                    throw this.G;
                }
            }
        }
        this.F = null;
    }

    public abstract void J(String str, long j, long j2);

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0098, code lost:
    
        if (r6.p == r2.p) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(c.c.a.a.l0 r6) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.r1.c.K(c.c.a.a.l0):void");
    }

    public abstract void L(MediaCodec mediaCodec, MediaFormat mediaFormat);

    public abstract void M(long j);

    public abstract void N(c.c.a.a.o1.g gVar);

    public final void O() {
        int i = this.d0;
        if (i == 1) {
            A();
            return;
        }
        if (i == 2) {
            a0();
        } else if (i != 3) {
            this.j0 = true;
            S();
        } else {
            R();
            H();
        }
    }

    public abstract boolean P(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2, c.c.a.a.l0 l0Var);

    public final boolean Q(boolean z) {
        this.p.i();
        int r = r(this.q, this.p, z);
        if (r == -5) {
            K(this.q.f2058a);
            return true;
        }
        if (r != -4 || !this.p.h()) {
            return false;
        }
        this.i0 = true;
        O();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void R() {
        this.F = null;
        this.H = null;
        this.D = null;
        T();
        U();
        if (l0.f3761a < 21) {
            this.S = null;
            this.T = null;
        }
        this.k0 = false;
        this.U = -9223372036854775807L;
        this.s.clear();
        this.h0 = -9223372036854775807L;
        this.g0 = -9223372036854775807L;
        try {
            MediaCodec mediaCodec = this.C;
            if (mediaCodec != null) {
                this.n0.f2174b++;
                try {
                    mediaCodec.stop();
                    this.C.release();
                } catch (Throwable th) {
                    this.C.release();
                    throw th;
                }
            }
            this.C = null;
            try {
                MediaCrypto mediaCrypto = this.y;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.C = null;
            try {
                MediaCrypto mediaCrypto2 = this.y;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public void S() {
    }

    public final void T() {
        this.V = -1;
        this.o.f2180d = null;
    }

    public final void U() {
        this.W = -1;
        this.X = null;
    }

    public final void V(c.c.a.a.p1.g<c.c.a.a.p1.h> gVar) {
        c.c.a.a.p1.g<c.c.a.a.p1.h> gVar2 = this.w;
        this.w = gVar;
        if (gVar2 != null && gVar2 != this.x && gVar2 != gVar) {
            throw null;
        }
    }

    public final void W(c.c.a.a.p1.g<c.c.a.a.p1.h> gVar) {
        c.c.a.a.p1.g<c.c.a.a.p1.h> gVar2 = this.x;
        this.x = null;
        if (gVar2 != null && gVar2 != this.w) {
            throw null;
        }
    }

    public boolean X(a aVar) {
        return true;
    }

    public abstract int Y(e eVar, c.c.a.a.p1.a<c.c.a.a.p1.h> aVar, c.c.a.a.l0 l0Var);

    public final void Z() {
        if (l0.f3761a < 23) {
            return;
        }
        float E = E(this.B, this.D, this.g);
        float f2 = this.E;
        if (f2 == E) {
            return;
        }
        if (E == -1.0f) {
            y();
            return;
        }
        if (f2 != -1.0f || E > this.n) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", E);
            this.C.setParameters(bundle);
            this.E = E;
        }
    }

    @TargetApi(23)
    public final void a0() {
        if (this.x.a() == null) {
            R();
            H();
            return;
        }
        if (s.f2718d.equals(null)) {
            R();
            H();
        } else {
            if (A()) {
                return;
            }
            try {
                this.y.setMediaDrmSession(null);
                V(this.x);
                this.c0 = 0;
                this.d0 = 0;
            } catch (MediaCryptoException e2) {
                throw z.a(e2, this.f2684d);
            }
        }
    }

    @Override // c.c.a.a.b1
    public boolean c() {
        if (this.u != null && !this.k0) {
            if (j() ? this.j : this.f2686f.c()) {
                return true;
            }
            if (this.W >= 0) {
                return true;
            }
            if (this.U != -9223372036854775807L && SystemClock.elapsedRealtime() < this.U) {
                return true;
            }
        }
        return false;
    }

    @Override // c.c.a.a.b1
    public boolean d() {
        return this.j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x00a8, code lost:
    
        if (r26.c0 == 2) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b8 A[LOOP:0: B:14:0x0027->B:37:0x01b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bc A[EDGE_INSN: B:38:0x01bc->B:39:0x01bc BREAK  A[LOOP:0: B:14:0x0027->B:37:0x01b8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0454 A[EDGE_INSN: B:66:0x0454->B:60:0x0454 BREAK  A[LOOP:1: B:39:0x01bc->B:58:0x0451], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    @Override // c.c.a.a.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(long r27, long r29) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.r1.c.f(long, long):void");
    }

    @Override // c.c.a.a.r, c.c.a.a.b1
    public final void h(float f2) {
        this.B = f2;
        if (this.C == null || this.d0 == 3 || this.f2685e == 0) {
            return;
        }
        Z();
    }

    @Override // c.c.a.a.r
    public void k() {
        this.u = null;
        if (this.x == null && this.w == null) {
            B();
        } else {
            n();
        }
    }

    @Override // c.c.a.a.r
    public abstract void n();

    @Override // c.c.a.a.r
    public final int t(c.c.a.a.l0 l0Var) {
        try {
            return Y(this.k, null, l0Var);
        } catch (h e2) {
            throw z.a(e2, this.f2684d);
        }
    }

    @Override // c.c.a.a.r
    public final int v() {
        return 8;
    }

    public abstract int w(MediaCodec mediaCodec, a aVar, c.c.a.a.l0 l0Var, c.c.a.a.l0 l0Var2);

    public abstract void x(a aVar, MediaCodec mediaCodec, c.c.a.a.l0 l0Var, MediaCrypto mediaCrypto, float f2);

    public final void y() {
        if (this.e0) {
            this.c0 = 1;
            this.d0 = 3;
        } else {
            R();
            H();
        }
    }

    public final void z() {
        if (l0.f3761a < 23) {
            y();
        } else if (!this.e0) {
            a0();
        } else {
            this.c0 = 1;
            this.d0 = 2;
        }
    }
}
