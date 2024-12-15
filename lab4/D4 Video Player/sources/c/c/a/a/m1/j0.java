package c.c.a.a.m1;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j0 implements x {
    public long A;
    public float B;
    public r[] C;
    public ByteBuffer[] D;
    public ByteBuffer E;
    public ByteBuffer F;
    public byte[] G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public b0 N;
    public boolean O;
    public long P;

    /* renamed from: a, reason: collision with root package name */
    public final m f2111a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f2112b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f2113c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f2114d;

    /* renamed from: e, reason: collision with root package name */
    public final r[] f2115e;

    /* renamed from: f, reason: collision with root package name */
    public final r[] f2116f;
    public final ConditionVariable g;
    public final a0 h;
    public final ArrayDeque<h0> i;
    public n0 j;
    public f0 k;
    public f0 l;
    public AudioTrack m;
    public l n;
    public c.c.a.a.u0 o;
    public c.c.a.a.u0 p;
    public long q;
    public long r;
    public ByteBuffer s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public int y;
    public int z;

    public j0(m mVar, r[] rVarArr) {
        g0 g0Var = new g0(rVarArr);
        this.f2111a = mVar;
        this.f2112b = g0Var;
        this.g = new ConditionVariable(true);
        this.h = new a0(new i0(this, null));
        d0 d0Var = new d0();
        this.f2113c = d0Var;
        t0 t0Var = new t0();
        this.f2114d = t0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new p0(), d0Var, t0Var);
        Collections.addAll(arrayList, g0Var.f2100a);
        this.f2115e = (r[]) arrayList.toArray(new r[0]);
        this.f2116f = new r[]{new l0()};
        this.B = 1.0f;
        this.z = 0;
        this.n = l.f2120b;
        this.M = 0;
        this.N = new b0(0, 0.0f);
        this.p = c.c.a.a.u0.f2816e;
        this.I = -1;
        this.C = new r[0];
        this.D = new ByteBuffer[0];
        this.i = new ArrayDeque<>();
    }

    public final void a(c.c.a.a.u0 u0Var, long j) {
        c.c.a.a.u0 u0Var2;
        if (this.l.j) {
            g0 g0Var = this.f2112b;
            q0 q0Var = g0Var.f2101b;
            q0Var.i = u0Var.f2819c;
            q0Var.flush();
            s0 s0Var = g0Var.f2102c;
            float f2 = u0Var.f2817a;
            Objects.requireNonNull(s0Var);
            float e2 = c.c.a.a.z1.l0.e(f2, 0.1f, 8.0f);
            if (s0Var.f2144d != e2) {
                s0Var.f2144d = e2;
                s0Var.h = true;
            }
            s0Var.flush();
            s0 s0Var2 = g0Var.f2102c;
            float f3 = u0Var.f2818b;
            Objects.requireNonNull(s0Var2);
            float e3 = c.c.a.a.z1.l0.e(f3, 0.1f, 8.0f);
            if (s0Var2.f2145e != e3) {
                s0Var2.f2145e = e3;
                s0Var2.h = true;
            }
            s0Var2.flush();
            u0Var2 = new c.c.a.a.u0(e2, e3, u0Var.f2819c);
        } else {
            u0Var2 = c.c.a.a.u0.f2816e;
        }
        this.i.add(new h0(u0Var2, Math.max(0L, j), this.l.b(f()), null));
        r[] rVarArr = this.l.k;
        ArrayList arrayList = new ArrayList();
        for (r rVar : rVarArr) {
            if (rVar.c()) {
                arrayList.add(rVar);
            } else {
                rVar.flush();
            }
        }
        int size = arrayList.size();
        this.C = (r[]) arrayList.toArray(new r[size]);
        this.D = new ByteBuffer[size];
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c7 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r19, int r20, int r21, int r22, int[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.m1.j0.b(int, int, int, int, int[], int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0034 -> B:6:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r9 = this;
            int r0 = r9.I
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L16
            c.c.a.a.m1.f0 r0 = r9.l
            boolean r0 = r0.i
            if (r0 == 0) goto Lf
            r0 = r3
            goto L12
        Lf:
            c.c.a.a.m1.r[] r0 = r9.C
            int r0 = r0.length
        L12:
            r9.I = r0
            r0 = r2
            goto L17
        L16:
            r0 = r3
        L17:
            int r4 = r9.I
            c.c.a.a.m1.r[] r5 = r9.C
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L2a
            r4.b()
        L2a:
            r9.l(r7)
            boolean r0 = r4.d()
            if (r0 != 0) goto L34
            return r3
        L34:
            int r0 = r9.I
            int r0 = r0 + r2
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.F
            if (r0 == 0) goto L44
            r9.p(r0, r7)
            java.nio.ByteBuffer r0 = r9.F
            if (r0 == 0) goto L44
            return r3
        L44:
            r9.I = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.m1.j0.c():boolean");
    }

    public void d() {
        if (i()) {
            this.u = 0L;
            this.v = 0L;
            this.w = 0L;
            this.x = 0L;
            this.y = 0;
            c.c.a.a.u0 u0Var = this.o;
            if (u0Var != null) {
                this.p = u0Var;
                this.o = null;
            } else if (!this.i.isEmpty()) {
                this.p = this.i.getLast().f2103a;
            }
            this.i.clear();
            this.q = 0L;
            this.r = 0L;
            this.f2114d.p = 0L;
            e();
            this.E = null;
            this.F = null;
            this.K = false;
            this.J = false;
            this.I = -1;
            this.s = null;
            this.t = 0;
            this.z = 0;
            AudioTrack audioTrack = this.h.f2063c;
            Objects.requireNonNull(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                this.m.pause();
            }
            AudioTrack audioTrack2 = this.m;
            this.m = null;
            f0 f0Var = this.k;
            if (f0Var != null) {
                this.l = f0Var;
                this.k = null;
            }
            a0 a0Var = this.h;
            a0Var.j = 0L;
            a0Var.u = 0;
            a0Var.t = 0;
            a0Var.k = 0L;
            a0Var.f2063c = null;
            a0Var.f2066f = null;
            this.g.close();
            new e0(this, audioTrack2).start();
        }
    }

    public final void e() {
        int i = 0;
        while (true) {
            r[] rVarArr = this.C;
            if (i >= rVarArr.length) {
                return;
            }
            r rVar = rVarArr[i];
            rVar.flush();
            this.D[i] = rVar.a();
            i++;
        }
    }

    public final long f() {
        return this.l.f2088a ? this.w / r0.f2091d : this.x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x01b9, code lost:
    
        if (r4.b() == 0) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0204 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0333 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(java.nio.ByteBuffer r30, long r31) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.m1.j0.g(java.nio.ByteBuffer, long):boolean");
    }

    public boolean h() {
        return i() && this.h.c(f());
    }

    public final boolean i() {
        return this.m != null;
    }

    public void j() {
        this.L = true;
        if (i()) {
            z zVar = this.h.f2066f;
            Objects.requireNonNull(zVar);
            zVar.a();
            this.m.play();
        }
    }

    public final void k() {
        if (this.K) {
            return;
        }
        this.K = true;
        a0 a0Var = this.h;
        long f2 = f();
        a0Var.x = a0Var.b();
        a0Var.v = SystemClock.elapsedRealtime() * 1000;
        a0Var.y = f2;
        this.m.stop();
        this.t = 0;
    }

    public final void l(long j) {
        ByteBuffer byteBuffer;
        int length = this.C.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.D[i - 1];
            } else {
                byteBuffer = this.E;
                if (byteBuffer == null) {
                    byteBuffer = r.f2133a;
                }
            }
            if (i == length) {
                p(byteBuffer, j);
            } else {
                r rVar = this.C[i];
                rVar.h(byteBuffer);
                ByteBuffer a2 = rVar.a();
                this.D[i] = a2;
                if (a2.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    public void m() {
        d();
        for (r rVar : this.f2115e) {
            rVar.j();
        }
        for (r rVar2 : this.f2116f) {
            rVar2.j();
        }
        this.M = 0;
        this.L = false;
    }

    public final void n() {
        if (i()) {
            if (c.c.a.a.z1.l0.f3761a >= 21) {
                this.m.setVolume(this.B);
                return;
            }
            AudioTrack audioTrack = this.m;
            float f2 = this.B;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    public boolean o(int i, int i2) {
        if (c.c.a.a.z1.l0.v(i2)) {
            return i2 != 4 || c.c.a.a.z1.l0.f3761a >= 21;
        }
        m mVar = this.f2111a;
        if (mVar != null) {
            if ((Arrays.binarySearch(mVar.f2124a, i2) >= 0) && (i == -1 || i <= this.f2111a.f2125b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e0, code lost:
    
        if (r15 < r14) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(java.nio.ByteBuffer r13, long r14) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.m1.j0.p(java.nio.ByteBuffer, long):void");
    }
}
