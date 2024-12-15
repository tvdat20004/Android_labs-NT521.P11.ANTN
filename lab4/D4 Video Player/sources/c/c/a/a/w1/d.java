package c.c.a.a.w1;

import android.os.SystemClock;
import c.c.a.a.l0;
import c.c.a.a.u1.q0;
import c.c.a.a.w1.r;
import c.c.a.a.z1.h0;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class d extends g {
    public final c g;
    public final long h;
    public final long i;
    public final long j;
    public final float k;
    public final long l;
    public final c.c.a.a.z1.g m;
    public final l0[] n;
    public final int[] o;
    public final int[] p;
    public p q;
    public float r;
    public int s;
    public int t;
    public long u;

    public static class a implements r.a {

        /* renamed from: a, reason: collision with root package name */
        public p f3406a;

        public a() {
            int i = p.f3435a;
            this.f3406a = c.c.a.a.w1.a.f3401b;
        }
    }

    public d(q0 q0Var, int[] iArr, c cVar, long j, long j2, long j3, float f2, long j4, c.c.a.a.z1.g gVar, b bVar) {
        super(q0Var, iArr);
        this.g = cVar;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = f2;
        this.l = j4;
        this.m = gVar;
        this.r = 1.0f;
        this.t = 0;
        this.u = -9223372036854775807L;
        int i = p.f3435a;
        this.q = c.c.a.a.w1.a.f3401b;
        int i2 = this.f3408b;
        this.n = new l0[i2];
        this.o = new int[i2];
        this.p = new int[i2];
        for (int i3 = 0; i3 < this.f3408b; i3++) {
            l0 l0Var = this.f3410d[i3];
            l0[] l0VarArr = this.n;
            l0VarArr[i3] = l0Var;
            this.o[i3] = l0VarArr[i3].f2041f;
        }
    }

    public static void n(long[][][] jArr, int i, long[][] jArr2, int[] iArr) {
        long j = 0;
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2][i][1] = jArr2[i2][iArr[i2]];
            j += jArr[i2][i][1];
        }
        for (long[][] jArr3 : jArr) {
            jArr3[i][0] = j;
        }
    }

    @Override // c.c.a.a.w1.r
    public int a() {
        return this.t;
    }

    @Override // c.c.a.a.w1.r
    public int b() {
        return this.s;
    }

    @Override // c.c.a.a.w1.g, c.c.a.a.w1.r
    public void c() {
        this.u = -9223372036854775807L;
    }

    @Override // c.c.a.a.w1.g, c.c.a.a.w1.r
    public void d(float f2) {
        this.r = f2;
    }

    @Override // c.c.a.a.w1.r
    public Object e() {
        return null;
    }

    @Override // c.c.a.a.w1.g, c.c.a.a.w1.r
    public int f(long j, List<? extends c.c.a.a.u1.v0.m> list) {
        int i;
        int i2;
        Objects.requireNonNull((h0) this.m);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.u;
        if (!(j2 == -9223372036854775807L || elapsedRealtime - j2 >= this.l)) {
            return list.size();
        }
        this.u = elapsedRealtime;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long p = c.c.a.a.z1.l0.p(list.get(size - 1).f2947f - j, this.r);
        long j3 = this.j;
        if (p < j3) {
            return size;
        }
        l0 l0Var = this.f3410d[m(elapsedRealtime, this.o)];
        for (int i3 = 0; i3 < size; i3++) {
            c.c.a.a.u1.v0.m mVar = list.get(i3);
            l0 l0Var2 = mVar.f2944c;
            if (c.c.a.a.z1.l0.p(mVar.f2947f - j, this.r) >= j3 && l0Var2.f2041f < l0Var.f2041f && (i = l0Var2.p) != -1 && i < 720 && (i2 = l0Var2.o) != -1 && i2 < 1280 && i < l0Var.p) {
                return i3;
            }
        }
        return size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r7 < (r1 ? (long) (r9 * r4.k) : r4.h)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        r4.s = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (r7 >= r4.i) goto L29;
     */
    @Override // c.c.a.a.w1.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(long r5, long r7, long r9, java.util.List<? extends c.c.a.a.u1.v0.m> r11, c.c.a.a.u1.v0.o[] r12) {
        /*
            r4 = this;
            c.c.a.a.z1.g r5 = r4.m
            c.c.a.a.z1.h0 r5 = (c.c.a.a.z1.h0) r5
            java.util.Objects.requireNonNull(r5)
            long r5 = android.os.SystemClock.elapsedRealtime()
            c.c.a.a.w1.p r11 = r4.q
            c.c.a.a.l0[] r12 = r4.n
            int[] r0 = r4.p
            c.c.a.a.w1.a r11 = (c.c.a.a.w1.a) r11
            java.util.Objects.requireNonNull(r11)
            int r11 = r12.length
            if (r0 != 0) goto L1b
            int[] r0 = new int[r11]
        L1b:
            r1 = 0
            r2 = r1
        L1d:
            if (r2 >= r11) goto L28
            r3 = r12[r2]
            int r3 = r3.f2041f
            r0[r2] = r3
            int r2 = r2 + 1
            goto L1d
        L28:
            int r11 = r4.t
            r12 = 1
            if (r11 != 0) goto L38
            r4.t = r12
            int[] r7 = r4.p
            int r5 = r4.m(r5, r7)
            r4.s = r5
            return
        L38:
            int r11 = r4.s
            int[] r0 = r4.p
            int r0 = r4.m(r5, r0)
            r4.s = r0
            if (r0 != r11) goto L45
            return
        L45:
            boolean r5 = r4.l(r11, r5)
            if (r5 != 0) goto L83
            c.c.a.a.l0[] r5 = r4.f3410d
            r6 = r5[r11]
            int r0 = r4.s
            r5 = r5[r0]
            int r5 = r5.f2041f
            int r6 = r6.f2041f
            if (r5 <= r6) goto L7a
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 == 0) goto L69
            long r2 = r4.h
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 > 0) goto L69
            r1 = r12
        L69:
            if (r1 == 0) goto L71
            float r9 = (float) r9
            float r10 = r4.k
            float r9 = r9 * r10
            long r9 = (long) r9
            goto L73
        L71:
            long r9 = r4.h
        L73:
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 >= 0) goto L7a
        L77:
            r4.s = r11
            goto L83
        L7a:
            if (r5 >= r6) goto L83
            long r5 = r4.i
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 < 0) goto L83
            goto L77
        L83:
            int r5 = r4.s
            if (r5 == r11) goto L8a
            r5 = 3
            r4.t = r5
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.w1.d.g(long, long, long, java.util.List, c.c.a.a.u1.v0.o[]):void");
    }

    public final int m(long j, int[] iArr) {
        long j2;
        long[][] jArr;
        c cVar = this.g;
        c.c.a.a.y1.t tVar = (c.c.a.a.y1.t) cVar.f3402a;
        synchronized (tVar) {
            j2 = tVar.l;
        }
        long max = Math.max(0L, ((long) (j2 * cVar.f3403b)) - cVar.f3404c);
        if (cVar.f3405d != null) {
            int i = 1;
            while (true) {
                jArr = cVar.f3405d;
                if (i >= jArr.length - 1 || jArr[i][0] >= max) {
                    break;
                }
                i++;
            }
            long[] jArr2 = jArr[i - 1];
            long[] jArr3 = jArr[i];
            max = jArr2[1] + ((long) (((max - jArr2[0]) / (jArr3[0] - jArr2[0])) * (jArr3[1] - jArr2[1])));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f3408b; i3++) {
            if (j == Long.MIN_VALUE || !l(i3, j)) {
                l0 l0Var = this.f3410d[i3];
                if (((long) Math.round(((float) iArr[i3]) * this.r)) <= max) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
