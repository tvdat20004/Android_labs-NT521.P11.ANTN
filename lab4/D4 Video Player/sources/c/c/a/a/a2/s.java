package c.c.a.a.a2;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import c.c.a.a.z1.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class s extends c.c.a.a.r1.c {
    public static final int[] b1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean c1;
    public static boolean d1;
    public Surface A0;
    public int B0;
    public boolean C0;
    public long D0;
    public long E0;
    public long F0;
    public int G0;
    public int H0;
    public int I0;
    public long J0;
    public int K0;
    public float L0;
    public int M0;
    public int N0;
    public int O0;
    public float P0;
    public int Q0;
    public int R0;
    public int S0;
    public float T0;
    public boolean U0;
    public int V0;
    public r W0;
    public long X0;
    public long Y0;
    public int Z0;
    public c.c.a.a.x1.v.h a1;
    public final Context p0;
    public final v q0;
    public final y r0;
    public final long s0;
    public final int t0;
    public final boolean u0;
    public final long[] v0;
    public final long[] w0;
    public q x0;
    public boolean y0;
    public Surface z0;

    public s(Context context, c.c.a.a.r1.e eVar, long j, boolean z, boolean z2, Handler handler, z zVar, int i) {
        super(2, eVar, z, z2, 30.0f);
        this.s0 = j;
        this.t0 = i;
        Context applicationContext = context.getApplicationContext();
        this.p0 = applicationContext;
        this.q0 = new v(applicationContext);
        this.r0 = new y(handler, zVar);
        this.u0 = "NVIDIA".equals(l0.f3763c);
        this.v0 = new long[10];
        this.w0 = new long[10];
        this.Y0 = -9223372036854775807L;
        this.X0 = -9223372036854775807L;
        this.E0 = -9223372036854775807L;
        this.M0 = -1;
        this.N0 = -1;
        this.P0 = -1.0f;
        this.L0 = -1.0f;
        this.B0 = 1;
        c0();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int e0(c.c.a.a.r1.a aVar, String str, int i, int i2) {
        char c2;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        str.hashCode();
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 2:
            case 4:
                i3 = i * i2;
                i4 = 2;
                break;
            case 1:
            case 5:
                i3 = i * i2;
                break;
            case 3:
                String str2 = l0.f3764d;
                if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(l0.f3763c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !aVar.f2698f)))) {
                    i3 = l0.d(i2, 16) * l0.d(i, 16) * 16 * 16;
                    i4 = 2;
                    break;
                }
                break;
        }
        return -1;
    }

    public static int f0(c.c.a.a.r1.a aVar, c.c.a.a.l0 l0Var) {
        if (l0Var.k == -1) {
            return e0(aVar, l0Var.j, l0Var.o, l0Var.p);
        }
        int size = l0Var.l.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += l0Var.l.get(i2).length;
        }
        return l0Var.k + i;
    }

    public static boolean g0(long j) {
        return j < -30000;
    }

    @Override // c.c.a.a.r1.c
    public boolean B() {
        try {
            return super.B();
        } finally {
            this.I0 = 0;
        }
    }

    @Override // c.c.a.a.r1.c
    public boolean D() {
        return this.U0;
    }

    @Override // c.c.a.a.r1.c
    public float E(float f2, c.c.a.a.l0 l0Var, c.c.a.a.l0[] l0VarArr) {
        float f3 = -1.0f;
        for (c.c.a.a.l0 l0Var2 : l0VarArr) {
            float f4 = l0Var2.q;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        if (f3 == -1.0f) {
            return -1.0f;
        }
        return f3 * f2;
    }

    @Override // c.c.a.a.r1.c
    public List<c.c.a.a.r1.a> F(c.c.a.a.r1.e eVar, c.c.a.a.l0 l0Var, boolean z) {
        String str = l0Var.j;
        boolean z2 = this.U0;
        Objects.requireNonNull((c.c.a.a.r1.d) eVar);
        return Collections.unmodifiableList(c.c.a.a.r1.n.e(str, z, z2));
    }

    @Override // c.c.a.a.r1.c
    public void J(final String str, final long j, final long j2) {
        final y yVar = this.r0;
        if (yVar.f1973b != null) {
            yVar.f1972a.post(new Runnable() { // from class: c.c.a.a.a2.d
                @Override // java.lang.Runnable
                public final void run() {
                    y yVar2 = y.this;
                    yVar2.f1973b.m(str, j, j2);
                }
            });
        }
        this.y0 = d0(str);
    }

    @Override // c.c.a.a.r1.c
    public void K(final c.c.a.a.l0 l0Var) {
        super.K(l0Var);
        final y yVar = this.r0;
        if (yVar.f1973b != null) {
            yVar.f1972a.post(new Runnable() { // from class: c.c.a.a.a2.a
                @Override // java.lang.Runnable
                public final void run() {
                    y yVar2 = y.this;
                    yVar2.f1973b.x(l0Var);
                }
            });
        }
        this.L0 = l0Var.s;
        this.K0 = l0Var.r;
    }

    @Override // c.c.a.a.r1.c
    public void L(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        n0(mediaCodec, z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width"), z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height"));
    }

    @Override // c.c.a.a.r1.c
    public void M(long j) {
        this.I0--;
        while (true) {
            int i = this.Z0;
            if (i == 0 || j < this.w0[0]) {
                return;
            }
            long[] jArr = this.v0;
            this.Y0 = jArr[0];
            int i2 = i - 1;
            this.Z0 = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.w0;
            System.arraycopy(jArr2, 1, jArr2, 0, this.Z0);
        }
    }

    @Override // c.c.a.a.r1.c
    public void N(c.c.a.a.o1.g gVar) {
        this.I0++;
        this.X0 = Math.max(gVar.f2181e, this.X0);
        if (l0.f3761a >= 23 || !this.U0) {
            return;
        }
        m0(gVar.f2181e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00c8, code lost:
    
        if (r11.a(r12, r14) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if ((g0(r14) && r9 - r22.J0 > 100000) != false) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0174  */
    @Override // c.c.a.a.r1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean P(long r23, long r25, android.media.MediaCodec r27, java.nio.ByteBuffer r28, int r29, int r30, long r31, boolean r33, boolean r34, c.c.a.a.l0 r35) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.a2.s.P(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean, boolean, c.c.a.a.l0):boolean");
    }

    @Override // c.c.a.a.r1.c
    public void R() {
        try {
            super.R();
        } finally {
            this.I0 = 0;
        }
    }

    @Override // c.c.a.a.r1.c
    public boolean X(c.c.a.a.r1.a aVar) {
        return this.z0 != null || r0(aVar);
    }

    @Override // c.c.a.a.r1.c
    public int Y(c.c.a.a.r1.e eVar, c.c.a.a.p1.a<c.c.a.a.p1.h> aVar, c.c.a.a.l0 l0Var) {
        boolean z;
        int i = 0;
        if (!c.c.a.a.z1.u.j(l0Var.j)) {
            return 0;
        }
        c.c.a.a.p1.e eVar2 = l0Var.m;
        if (eVar2 != null) {
            z = false;
            for (int i2 = 0; i2 < eVar2.f2205e; i2++) {
                z |= eVar2.f2202b[i2].g;
            }
        } else {
            z = false;
        }
        List<c.c.a.a.r1.a> F = F(eVar, l0Var, z);
        if (F.isEmpty()) {
            if (z) {
                String str = l0Var.j;
                Objects.requireNonNull((c.c.a.a.r1.d) eVar);
                if (!c.c.a.a.r1.n.e(str, false, false).isEmpty()) {
                    return 2;
                }
            }
            return 1;
        }
        if (!c.c.a.a.r.u(eVar2)) {
            return 2;
        }
        c.c.a.a.r1.a aVar2 = F.get(0);
        boolean b2 = aVar2.b(l0Var);
        int i3 = aVar2.c(l0Var) ? 16 : 8;
        if (b2) {
            String str2 = l0Var.j;
            Objects.requireNonNull((c.c.a.a.r1.d) eVar);
            List<c.c.a.a.r1.a> e2 = c.c.a.a.r1.n.e(str2, z, true);
            if (!e2.isEmpty()) {
                c.c.a.a.r1.a aVar3 = e2.get(0);
                if (aVar3.b(l0Var) && aVar3.c(l0Var)) {
                    i = 32;
                }
            }
        }
        return (b2 ? 4 : 3) | i3 | i;
    }

    public final void b0() {
        MediaCodec mediaCodec;
        this.C0 = false;
        if (l0.f3761a < 23 || !this.U0 || (mediaCodec = this.C) == null) {
            return;
        }
        this.W0 = new r(this, mediaCodec, null);
    }

    @Override // c.c.a.a.r1.c, c.c.a.a.b1
    public boolean c() {
        Surface surface;
        if (super.c() && (this.C0 || (((surface = this.A0) != null && this.z0 == surface) || this.C == null || this.U0))) {
            this.E0 = -9223372036854775807L;
            return true;
        }
        if (this.E0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.E0) {
            return true;
        }
        this.E0 = -9223372036854775807L;
        return false;
    }

    public final void c0() {
        this.Q0 = -1;
        this.R0 = -1;
        this.T0 = -1.0f;
        this.S0 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if ("HWEML".equals(r5) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0635, code lost:
    
        if (r0 != true) goto L414;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0635  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d0(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 2356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.a2.s.d0(java.lang.String):boolean");
    }

    @Override // c.c.a.a.r, c.c.a.a.b1
    public void g(int i, Object obj) {
        if (i != 1) {
            if (i != 4) {
                if (i == 6) {
                    this.a1 = (c.c.a.a.x1.v.h) obj;
                    return;
                }
                return;
            } else {
                int intValue = ((Integer) obj).intValue();
                this.B0 = intValue;
                MediaCodec mediaCodec = this.C;
                if (mediaCodec != null) {
                    mediaCodec.setVideoScalingMode(intValue);
                    return;
                }
                return;
            }
        }
        Surface surface = (Surface) obj;
        if (surface == null) {
            Surface surface2 = this.A0;
            if (surface2 != null) {
                surface = surface2;
            } else {
                c.c.a.a.r1.a aVar = this.H;
                if (aVar != null && r0(aVar)) {
                    surface = n.k(this.p0, aVar.f2698f);
                    this.A0 = surface;
                }
            }
        }
        if (this.z0 == surface) {
            if (surface == null || surface == this.A0) {
                return;
            }
            k0();
            if (this.C0) {
                y yVar = this.r0;
                Surface surface3 = this.z0;
                if (yVar.f1973b != null) {
                    yVar.f1972a.post(new e(yVar, surface3));
                    return;
                }
                return;
            }
            return;
        }
        this.z0 = surface;
        int i2 = this.f2685e;
        MediaCodec mediaCodec2 = this.C;
        if (mediaCodec2 != null) {
            if (l0.f3761a < 23 || surface == null || this.y0) {
                R();
                H();
            } else {
                mediaCodec2.setOutputSurface(surface);
            }
        }
        if (surface == null || surface == this.A0) {
            c0();
            b0();
            return;
        }
        k0();
        b0();
        if (i2 == 2) {
            q0();
        }
    }

    public final void h0() {
        if (this.G0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final long j = elapsedRealtime - this.F0;
            final y yVar = this.r0;
            final int i = this.G0;
            if (yVar.f1973b != null) {
                yVar.f1972a.post(new Runnable() { // from class: c.c.a.a.a2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        y yVar2 = y.this;
                        yVar2.f1973b.v(i, j);
                    }
                });
            }
            this.G0 = 0;
            this.F0 = elapsedRealtime;
        }
    }

    public void i0() {
        if (this.C0) {
            return;
        }
        this.C0 = true;
        y yVar = this.r0;
        Surface surface = this.z0;
        if (yVar.f1973b != null) {
            yVar.f1972a.post(new e(yVar, surface));
        }
    }

    public final void j0() {
        int i = this.M0;
        if (i == -1 && this.N0 == -1) {
            return;
        }
        if (this.Q0 == i && this.R0 == this.N0 && this.S0 == this.O0 && this.T0 == this.P0) {
            return;
        }
        this.r0.a(i, this.N0, this.O0, this.P0);
        this.Q0 = this.M0;
        this.R0 = this.N0;
        this.S0 = this.O0;
        this.T0 = this.P0;
    }

    @Override // c.c.a.a.r1.c, c.c.a.a.r
    public void k() {
        this.X0 = -9223372036854775807L;
        this.Y0 = -9223372036854775807L;
        this.Z0 = 0;
        c0();
        b0();
        v vVar = this.q0;
        if (vVar.f1966a != null) {
            t tVar = vVar.f1968c;
            if (tVar != null) {
                tVar.f1959a.unregisterDisplayListener(tVar);
            }
            vVar.f1967b.f1962c.sendEmptyMessage(2);
        }
        this.W0 = null;
        try {
            super.k();
            final y yVar = this.r0;
            final c.c.a.a.o1.f fVar = this.n0;
            Objects.requireNonNull(yVar);
            synchronized (fVar) {
            }
            if (yVar.f1973b != null) {
                yVar.f1972a.post(new Runnable() { // from class: c.c.a.a.a2.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        y yVar2 = y.this;
                        c.c.a.a.o1.f fVar2 = fVar;
                        Objects.requireNonNull(yVar2);
                        synchronized (fVar2) {
                        }
                        yVar2.f1973b.j(fVar2);
                    }
                });
            }
        } catch (Throwable th) {
            final y yVar2 = this.r0;
            final c.c.a.a.o1.f fVar2 = this.n0;
            Objects.requireNonNull(yVar2);
            synchronized (fVar2) {
                if (yVar2.f1973b != null) {
                    yVar2.f1972a.post(new Runnable() { // from class: c.c.a.a.a2.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            y yVar22 = y.this;
                            c.c.a.a.o1.f fVar22 = fVar2;
                            Objects.requireNonNull(yVar22);
                            synchronized (fVar22) {
                            }
                            yVar22.f1973b.j(fVar22);
                        }
                    });
                }
                throw th;
            }
        }
    }

    public final void k0() {
        int i = this.Q0;
        if (i == -1 && this.R0 == -1) {
            return;
        }
        this.r0.a(i, this.R0, this.S0, this.T0);
    }

    @Override // c.c.a.a.r
    public void l(boolean z) {
        this.n0 = new c.c.a.a.o1.f();
        int i = this.V0;
        int i2 = this.f2683c.f1987a;
        this.V0 = i2;
        this.U0 = i2 != 0;
        if (i2 != i) {
            R();
        }
        final y yVar = this.r0;
        final c.c.a.a.o1.f fVar = this.n0;
        if (yVar.f1973b != null) {
            yVar.f1972a.post(new Runnable() { // from class: c.c.a.a.a2.b
                @Override // java.lang.Runnable
                public final void run() {
                    y yVar2 = y.this;
                    yVar2.f1973b.y(fVar);
                }
            });
        }
        v vVar = this.q0;
        vVar.i = false;
        if (vVar.f1966a != null) {
            vVar.f1967b.f1962c.sendEmptyMessage(1);
            t tVar = vVar.f1968c;
            if (tVar != null) {
                tVar.f1959a.registerDisplayListener(tVar, null);
            }
            vVar.b();
        }
    }

    public final void l0(long j, long j2, c.c.a.a.l0 l0Var) {
        c.c.a.a.x1.v.h hVar;
        float f2;
        float f3;
        int i;
        int i2;
        ArrayList<c.c.a.a.a2.a0.c> arrayList;
        int d2;
        c.c.a.a.x1.v.h hVar2 = this.a1;
        if (hVar2 != null) {
            hVar2.f3525e.a(j2, Long.valueOf(j));
            byte[] bArr = l0Var.u;
            int i3 = l0Var.t;
            byte[] bArr2 = hVar2.m;
            int i4 = hVar2.l;
            hVar2.m = bArr;
            if (i3 == -1) {
                i3 = hVar2.k;
            }
            hVar2.l = i3;
            if (i4 == i3 && Arrays.equals(bArr2, hVar2.m)) {
                return;
            }
            byte[] bArr3 = hVar2.m;
            c.c.a.a.a2.a0.e eVar = null;
            int i5 = 0;
            if (bArr3 != null) {
                int i6 = hVar2.l;
                int i7 = c.c.a.a.a2.a0.f.f1908a;
                c.c.a.a.z1.z zVar = new c.c.a.a.z1.z(bArr3);
                try {
                    zVar.B(4);
                    d2 = zVar.d();
                    zVar.A(0);
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                if (d2 == c.c.a.a.a2.a0.f.f1913f) {
                    zVar.B(8);
                    int i8 = zVar.f3801b;
                    int i9 = zVar.f3802c;
                    while (i8 < i9) {
                        int d3 = zVar.d() + i8;
                        if (d3 <= i8 || d3 > i9) {
                            break;
                        }
                        int d4 = zVar.d();
                        if (d4 != c.c.a.a.a2.a0.f.f1908a && d4 != c.c.a.a.a2.a0.f.f1909b) {
                            zVar.A(d3);
                            i8 = d3;
                        }
                        zVar.z(d3);
                        arrayList = c.c.a.a.a2.a0.f.a(zVar);
                        break;
                    }
                    arrayList = null;
                } else {
                    arrayList = c.c.a.a.a2.a0.f.a(zVar);
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    if (size == 1) {
                        eVar = new c.c.a.a.a2.a0.e(arrayList.get(0), i6);
                    } else if (size == 2) {
                        eVar = new c.c.a.a.a2.a0.e(arrayList.get(0), arrayList.get(1), i6);
                    }
                }
            }
            if (eVar == null || !c.c.a.a.x1.v.g.a(eVar)) {
                int i10 = hVar2.l;
                c.c.a.a.x1.p.c(true);
                c.c.a.a.x1.p.c(true);
                c.c.a.a.x1.p.c(true);
                c.c.a.a.x1.p.c(true);
                c.c.a.a.x1.p.c(true);
                float radians = (float) Math.toRadians(180.0f);
                float radians2 = (float) Math.toRadians(360.0f);
                float f4 = radians / 36;
                float f5 = radians2 / 72;
                float[] fArr = new float[15984];
                float[] fArr2 = new float[10656];
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 36; i5 < i13; i13 = 36) {
                    float f6 = radians / 2.0f;
                    float f7 = (i5 * f4) - f6;
                    int i14 = i5 + 1;
                    float f8 = (i14 * f4) - f6;
                    int i15 = 0;
                    while (i15 < 73) {
                        int i16 = i14;
                        int i17 = 0;
                        int i18 = 2;
                        while (i17 < i18) {
                            if (i17 == 0) {
                                f3 = f7;
                                f2 = f3;
                            } else {
                                f2 = f7;
                                f3 = f8;
                            }
                            float f9 = i15 * f5;
                            float f10 = f8;
                            int i19 = i11 + 1;
                            float f11 = f5;
                            double d5 = 50.0f;
                            double d6 = (f9 + 3.1415927f) - (radians2 / 2.0f);
                            int i20 = i10;
                            c.c.a.a.x1.v.h hVar3 = hVar2;
                            double d7 = f3;
                            float f12 = radians;
                            int i21 = i15;
                            fArr[i11] = -((float) (Math.cos(d7) * Math.sin(d6) * d5));
                            int i22 = i19 + 1;
                            int i23 = i5;
                            fArr[i19] = (float) (Math.sin(d7) * d5);
                            int i24 = i22 + 1;
                            fArr[i22] = (float) (Math.cos(d7) * Math.cos(d6) * d5);
                            int i25 = i12 + 1;
                            fArr2[i12] = f9 / radians2;
                            int i26 = i25 + 1;
                            fArr2[i25] = ((i23 + i17) * f4) / f12;
                            if (i21 == 0 && i17 == 0) {
                                i = i21;
                            } else {
                                i = i21;
                                if (i != 72 || i17 != 1) {
                                    i2 = 2;
                                    i12 = i26;
                                    i11 = i24;
                                    i17++;
                                    i15 = i;
                                    f7 = f2;
                                    f5 = f11;
                                    f8 = f10;
                                    hVar2 = hVar3;
                                    i10 = i20;
                                    i5 = i23;
                                    i18 = i2;
                                    radians = f12;
                                }
                            }
                            System.arraycopy(fArr, i24 - 3, fArr, i24, 3);
                            i24 += 3;
                            i2 = 2;
                            System.arraycopy(fArr2, i26 - 2, fArr2, i26, 2);
                            i26 += 2;
                            i12 = i26;
                            i11 = i24;
                            i17++;
                            i15 = i;
                            f7 = f2;
                            f5 = f11;
                            f8 = f10;
                            hVar2 = hVar3;
                            i10 = i20;
                            i5 = i23;
                            i18 = i2;
                            radians = f12;
                        }
                        i15++;
                        radians = radians;
                        i14 = i16;
                        i10 = i10;
                    }
                    i5 = i14;
                }
                eVar = new c.c.a.a.a2.a0.e(new c.c.a.a.a2.a0.c(new c.c.a.a.a2.a0.d(0, fArr, fArr2, 1)), i10);
                hVar = hVar2;
            } else {
                hVar = hVar2;
            }
            hVar.f3526f.a(j2, eVar);
        }
    }

    @Override // c.c.a.a.r
    public void m(long j, boolean z) {
        this.i0 = false;
        this.j0 = false;
        A();
        this.r.b();
        b0();
        this.D0 = -9223372036854775807L;
        this.H0 = 0;
        this.X0 = -9223372036854775807L;
        int i = this.Z0;
        if (i != 0) {
            this.Y0 = this.v0[i - 1];
            this.Z0 = 0;
        }
        if (z) {
            q0();
        } else {
            this.E0 = -9223372036854775807L;
        }
    }

    public void m0(long j) {
        c.c.a.a.l0 e2 = this.r.e(j);
        if (e2 != null) {
            this.v = e2;
        }
        if (e2 != null) {
            n0(this.C, e2.o, e2.p);
        }
        j0();
        i0();
        M(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.c.a.a.r1.c, c.c.a.a.r
    public void n() {
        try {
            try {
                R();
            } finally {
                W(null);
            }
        } finally {
            Surface surface = this.A0;
            if (surface != null) {
                if (this.z0 == surface) {
                    this.z0 = null;
                }
                surface.release();
                this.A0 = null;
            }
        }
    }

    public final void n0(MediaCodec mediaCodec, int i, int i2) {
        this.M0 = i;
        this.N0 = i2;
        float f2 = this.L0;
        this.P0 = f2;
        if (l0.f3761a >= 21) {
            int i3 = this.K0;
            if (i3 == 90 || i3 == 270) {
                this.M0 = i2;
                this.N0 = i;
                this.P0 = 1.0f / f2;
            }
        } else {
            this.O0 = this.K0;
        }
        mediaCodec.setVideoScalingMode(this.B0);
    }

    @Override // c.c.a.a.r
    public void o() {
        this.G0 = 0;
        this.F0 = SystemClock.elapsedRealtime();
        this.J0 = SystemClock.elapsedRealtime() * 1000;
    }

    public void o0(MediaCodec mediaCodec, int i) {
        j0();
        c.c.a.a.x1.p.b("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        c.c.a.a.x1.p.j();
        this.J0 = SystemClock.elapsedRealtime() * 1000;
        this.n0.f2177e++;
        this.H0 = 0;
        i0();
    }

    @Override // c.c.a.a.r
    public void p() {
        this.E0 = -9223372036854775807L;
        h0();
    }

    @TargetApi(21)
    public void p0(MediaCodec mediaCodec, int i, long j) {
        j0();
        c.c.a.a.x1.p.b("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        c.c.a.a.x1.p.j();
        this.J0 = SystemClock.elapsedRealtime() * 1000;
        this.n0.f2177e++;
        this.H0 = 0;
        i0();
    }

    @Override // c.c.a.a.r
    public void q(c.c.a.a.l0[] l0VarArr, long j) {
        if (this.Y0 == -9223372036854775807L) {
            this.Y0 = j;
            return;
        }
        int i = this.Z0;
        if (i == this.v0.length) {
            StringBuilder j2 = c.a.a.a.a.j("Too many stream changes, so dropping offset: ");
            j2.append(this.v0[this.Z0 - 1]);
            Log.w("MediaCodecVideoRenderer", j2.toString());
        } else {
            this.Z0 = i + 1;
        }
        long[] jArr = this.v0;
        int i2 = this.Z0 - 1;
        jArr[i2] = j;
        this.w0[i2] = this.X0;
    }

    public final void q0() {
        this.E0 = this.s0 > 0 ? SystemClock.elapsedRealtime() + this.s0 : -9223372036854775807L;
    }

    public final boolean r0(c.c.a.a.r1.a aVar) {
        return l0.f3761a >= 23 && !this.U0 && !d0(aVar.f2693a) && (!aVar.f2698f || n.j(this.p0));
    }

    public void s0(int i) {
        c.c.a.a.o1.f fVar = this.n0;
        fVar.g += i;
        this.G0 += i;
        int i2 = this.H0 + i;
        this.H0 = i2;
        fVar.h = Math.max(i2, fVar.h);
        int i3 = this.t0;
        if (i3 <= 0 || this.G0 < i3) {
            return;
        }
        h0();
    }

    @Override // c.c.a.a.r1.c
    public int w(MediaCodec mediaCodec, c.c.a.a.r1.a aVar, c.c.a.a.l0 l0Var, c.c.a.a.l0 l0Var2) {
        if (!aVar.d(l0Var, l0Var2, true)) {
            return 0;
        }
        int i = l0Var2.o;
        q qVar = this.x0;
        if (i > qVar.f1955a || l0Var2.p > qVar.f1956b || f0(aVar, l0Var2) > this.x0.f1957c) {
            return 0;
        }
        return l0Var.E(l0Var2) ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012f A[SYNTHETIC] */
    @Override // c.c.a.a.r1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(c.c.a.a.r1.a r24, android.media.MediaCodec r25, c.c.a.a.l0 r26, android.media.MediaCrypto r27, float r28) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.a2.s.x(c.c.a.a.r1.a, android.media.MediaCodec, c.c.a.a.l0, android.media.MediaCrypto, float):void");
    }
}
