package c.c.a.a.u1.w0;

import android.os.SystemClock;
import c.c.a.a.d1;
import c.c.a.a.l0;
import c.c.a.a.u1.w0.c;
import c.c.a.a.y1.n;
import c.c.a.a.y1.r0;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class q implements c {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f3005a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3006b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3007c;

    /* renamed from: d, reason: collision with root package name */
    public final c.c.a.a.y1.n f3008d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3009e;

    /* renamed from: f, reason: collision with root package name */
    public final v f3010f;
    public final r[] g;
    public c.c.a.a.w1.r h;
    public c.c.a.a.u1.w0.x.b i;
    public int j;
    public IOException k;
    public boolean l;
    public long m;

    public static final class a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public final n.a f3011a;

        public a(n.a aVar) {
            this.f3011a = aVar;
        }
    }

    public q(r0 r0Var, c.c.a.a.u1.w0.x.b bVar, int i, int[] iArr, c.c.a.a.w1.r rVar, int i2, c.c.a.a.y1.n nVar, long j, int i3, boolean z, List<l0> list, v vVar) {
        this.f3005a = r0Var;
        this.i = bVar;
        this.f3006b = iArr;
        this.h = rVar;
        this.f3007c = i2;
        this.f3008d = nVar;
        this.j = i;
        this.f3009e = j;
        this.f3010f = vVar;
        long a2 = c.c.a.a.s.a(bVar.d(i));
        this.m = -9223372036854775807L;
        ArrayList<c.c.a.a.u1.w0.x.m> g = g();
        c.c.a.a.w1.g gVar = (c.c.a.a.w1.g) rVar;
        this.g = new r[gVar.f3409c.length];
        for (int i4 = 0; i4 < this.g.length; i4++) {
            this.g[i4] = new r(a2, i2, g.get(gVar.f3409c[i4]), z, list, vVar);
        }
    }

    @Override // c.c.a.a.u1.v0.j
    public void a() {
        IOException iOException = this.k;
        if (iOException != null) {
            throw iOException;
        }
        this.f3005a.a();
    }

    @Override // c.c.a.a.u1.v0.j
    public long b(long j, d1 d1Var) {
        for (r rVar : this.g) {
            o oVar = rVar.f3014c;
            if (oVar != null) {
                long a2 = oVar.a(j, rVar.f3015d) + rVar.f3016e;
                long h = rVar.h(a2);
                return c.c.a.a.z1.l0.B(j, d1Var, h, (h >= j || a2 >= ((long) (rVar.e() + (-1)))) ? h : rVar.h(a2 + 1));
            }
        }
        return j;
    }

    @Override // c.c.a.a.u1.v0.j
    public void c(c.c.a.a.u1.v0.d dVar) {
        c.c.a.a.u1.v0.f fVar;
        c.c.a.a.q1.v vVar;
        if (dVar instanceof c.c.a.a.u1.v0.l) {
            int k = ((c.c.a.a.w1.g) this.h).k(((c.c.a.a.u1.v0.l) dVar).f2944c);
            r[] rVarArr = this.g;
            r rVar = rVarArr[k];
            if (rVar.f3014c == null && (vVar = (fVar = rVar.f3012a).i) != null) {
                c.c.a.a.u1.w0.x.m mVar = rVar.f3013b;
                rVarArr[k] = new r(rVar.f3015d, mVar, fVar, rVar.f3016e, new p((c.c.a.a.q1.h) vVar, mVar.f3078c));
            }
        }
        v vVar2 = this.f3010f;
        if (vVar2 != null) {
            w wVar = vVar2.f3027d;
            long j = wVar.i;
            if (j != -9223372036854775807L || dVar.g > j) {
                wVar.i = dVar.g;
            }
        }
    }

    @Override // c.c.a.a.u1.v0.j
    public void d(long j, long j2, List<? extends c.c.a.a.u1.v0.m> list, c.c.a.a.u1.v0.g gVar) {
        c.c.a.a.u1.v0.d kVar;
        c.c.a.a.u1.v0.g gVar2;
        int i;
        int i2;
        c.c.a.a.u1.v0.o[] oVarArr;
        long j3;
        boolean z;
        c.c.a.a.u1.v0.o oVar = c.c.a.a.u1.v0.o.f2971a;
        if (this.k != null) {
            return;
        }
        long j4 = j2 - j;
        c.c.a.a.u1.w0.x.b bVar = this.i;
        long j5 = bVar.f3041d && (this.m > (-9223372036854775807L) ? 1 : (this.m == (-9223372036854775807L) ? 0 : -1)) != 0 ? this.m - j : -9223372036854775807L;
        long a2 = c.c.a.a.s.a(this.i.b(this.j).f3062b) + c.c.a.a.s.a(bVar.f3038a) + j2;
        v vVar = this.f3010f;
        if (vVar != null) {
            w wVar = vVar.f3027d;
            c.c.a.a.u1.w0.x.b bVar2 = wVar.g;
            if (!bVar2.f3041d) {
                z = false;
            } else if (wVar.k) {
                z = true;
            } else {
                Map.Entry<Long, Long> ceilingEntry = wVar.f3032f.ceilingEntry(Long.valueOf(bVar2.h));
                if (ceilingEntry == null || ceilingEntry.getValue().longValue() >= a2) {
                    z = false;
                } else {
                    long longValue = ceilingEntry.getKey().longValue();
                    wVar.h = longValue;
                    DashMediaSource dashMediaSource = wVar.f3029c.f2995a;
                    long j6 = dashMediaSource.K;
                    if (j6 == -9223372036854775807L || j6 < longValue) {
                        dashMediaSource.K = longValue;
                    }
                    z = true;
                }
                if (z) {
                    wVar.a();
                }
            }
            if (z) {
                return;
            }
        }
        long elapsedRealtime = (this.f3009e != 0 ? SystemClock.elapsedRealtime() + this.f3009e : System.currentTimeMillis()) * 1000;
        c.c.a.a.u1.v0.m mVar = list.isEmpty() ? null : list.get(list.size() - 1);
        int length = ((c.c.a.a.w1.g) this.h).f3409c.length;
        c.c.a.a.u1.v0.o[] oVarArr2 = new c.c.a.a.u1.v0.o[length];
        int i3 = 0;
        while (i3 < length) {
            r rVar = this.g[i3];
            if (rVar.f3014c == null) {
                oVarArr2[i3] = oVar;
                i = i3;
                i2 = length;
                oVarArr = oVarArr2;
                j3 = elapsedRealtime;
            } else {
                long b2 = rVar.b(this.i, this.j, elapsedRealtime);
                long d2 = rVar.d(this.i, this.j, elapsedRealtime);
                i = i3;
                i2 = length;
                oVarArr = oVarArr2;
                j3 = elapsedRealtime;
                long h = h(rVar, mVar, j2, b2, d2);
                if (h < b2) {
                    oVarArr[i] = oVar;
                } else {
                    oVarArr[i] = new s(rVar, h, d2);
                }
            }
            i3 = i + 1;
            length = i2;
            oVarArr2 = oVarArr;
            elapsedRealtime = j3;
        }
        long j7 = elapsedRealtime;
        this.h.g(j, j4, j5, list, oVarArr2);
        r rVar2 = this.g[this.h.b()];
        c.c.a.a.u1.v0.f fVar = rVar2.f3012a;
        if (fVar != null) {
            c.c.a.a.u1.w0.x.m mVar2 = rVar2.f3013b;
            c.c.a.a.u1.w0.x.i iVar = fVar.j == null ? mVar2.f3080e : null;
            c.c.a.a.u1.w0.x.i j8 = rVar2.f3014c == null ? mVar2.j() : null;
            if (iVar != null || j8 != null) {
                c.c.a.a.y1.n nVar = this.f3008d;
                l0 i4 = ((c.c.a.a.w1.g) this.h).i();
                int a3 = this.h.a();
                Object e2 = this.h.e();
                String str = rVar2.f3013b.f3077b;
                if (iVar == null || (j8 = iVar.a(j8, str)) != null) {
                    iVar = j8;
                }
                gVar.f2959a = new c.c.a.a.u1.v0.l(nVar, new c.c.a.a.y1.q(iVar.b(str), iVar.f3070a, iVar.f3071b, rVar2.f3013b.h()), i4, a3, e2, rVar2.f3012a);
                return;
            }
        }
        long j9 = rVar2.f3015d;
        boolean z2 = j9 != -9223372036854775807L;
        if (rVar2.e() == 0) {
            gVar.f2960b = z2;
            return;
        }
        long b3 = rVar2.b(this.i, this.j, j7);
        long d3 = rVar2.d(this.i, this.j, j7);
        this.m = this.i.f3041d ? rVar2.f(d3) : -9223372036854775807L;
        boolean z3 = z2;
        long h2 = h(rVar2, mVar, j2, b3, d3);
        if (h2 < b3) {
            this.k = new c.c.a.a.u1.m();
            return;
        }
        if (h2 > d3 || (this.l && h2 >= d3)) {
            gVar.f2960b = z3;
            return;
        }
        if (z3 && rVar2.h(h2) >= j9) {
            gVar.f2960b = true;
            return;
        }
        int i5 = 1;
        int min = (int) Math.min(1, (d3 - h2) + 1);
        if (j9 != -9223372036854775807L) {
            while (min > 1 && rVar2.h((min + h2) - 1) >= j9) {
                min--;
            }
        }
        long j10 = list.isEmpty() ? j2 : -9223372036854775807L;
        c.c.a.a.y1.n nVar2 = this.f3008d;
        int i6 = this.f3007c;
        l0 i7 = ((c.c.a.a.w1.g) this.h).i();
        int a4 = this.h.a();
        Object e3 = this.h.e();
        c.c.a.a.u1.w0.x.m mVar3 = rVar2.f3013b;
        long b4 = rVar2.f3014c.b(h2 - rVar2.f3016e);
        c.c.a.a.u1.w0.x.i g = rVar2.f3014c.g(h2 - rVar2.f3016e);
        String str2 = mVar3.f3077b;
        if (rVar2.f3012a == null) {
            kVar = new c.c.a.a.u1.v0.p(nVar2, new c.c.a.a.y1.q(g.b(str2), g.f3070a, g.f3071b, mVar3.h()), i7, a4, e3, b4, rVar2.f(h2), h2, i6, i7);
            gVar2 = gVar;
        } else {
            int i8 = 1;
            while (i5 < min) {
                c.c.a.a.u1.w0.x.i a5 = g.a(rVar2.f3014c.g((i5 + h2) - rVar2.f3016e), str2);
                if (a5 == null) {
                    break;
                }
                i8++;
                i5++;
                g = a5;
            }
            long f2 = rVar2.f((i8 + h2) - 1);
            long j11 = rVar2.f3015d;
            kVar = new c.c.a.a.u1.v0.k(nVar2, new c.c.a.a.y1.q(g.b(str2), g.f3070a, g.f3071b, mVar3.h()), i7, a4, e3, b4, f2, j10, (j11 == -9223372036854775807L || j11 > f2) ? -9223372036854775807L : j11, h2, i8, -mVar3.f3078c, rVar2.f3012a);
            gVar2 = gVar;
        }
        gVar2.f2959a = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035 A[RETURN] */
    @Override // c.c.a.a.u1.v0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(c.c.a.a.u1.v0.d r9, boolean r10, java.lang.Exception r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            c.c.a.a.u1.w0.v r10 = r8.f3010f
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 1
            if (r10 == 0) goto L36
            c.c.a.a.u1.w0.w r10 = r10.f3027d
            c.c.a.a.u1.w0.x.b r4 = r10.g
            boolean r4 = r4.f3041d
            if (r4 != 0) goto L17
            goto L32
        L17:
            boolean r4 = r10.k
            if (r4 == 0) goto L1c
            goto L30
        L1c:
            long r4 = r10.i
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 == 0) goto L2a
            long r6 = r9.f2947f
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L2a
            r4 = r3
            goto L2b
        L2a:
            r4 = r0
        L2b:
            if (r4 == 0) goto L32
            r10.a()
        L30:
            r10 = r3
            goto L33
        L32:
            r10 = r0
        L33:
            if (r10 == 0) goto L36
            return r3
        L36:
            c.c.a.a.u1.w0.x.b r10 = r8.i
            boolean r10 = r10.f3041d
            if (r10 != 0) goto L7a
            boolean r10 = r9 instanceof c.c.a.a.u1.v0.m
            if (r10 == 0) goto L7a
            boolean r10 = r11 instanceof c.c.a.a.y1.f0
            if (r10 == 0) goto L7a
            c.c.a.a.y1.f0 r11 = (c.c.a.a.y1.f0) r11
            int r10 = r11.f3621b
            r11 = 404(0x194, float:5.66E-43)
            if (r10 != r11) goto L7a
            c.c.a.a.u1.w0.r[] r10 = r8.g
            c.c.a.a.w1.r r11 = r8.h
            c.c.a.a.l0 r4 = r9.f2944c
            c.c.a.a.w1.g r11 = (c.c.a.a.w1.g) r11
            int r11 = r11.k(r4)
            r10 = r10[r11]
            int r11 = r10.e()
            r4 = -1
            if (r11 == r4) goto L7a
            if (r11 == 0) goto L7a
            long r4 = r10.c()
            long r10 = (long) r11
            long r4 = r4 + r10
            r10 = 1
            long r4 = r4 - r10
            r10 = r9
            c.c.a.a.u1.v0.m r10 = (c.c.a.a.u1.v0.m) r10
            long r10 = r10.c()
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 <= 0) goto L7a
            r8.l = r3
            return r3
        L7a:
            int r10 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r10 == 0) goto L8f
            c.c.a.a.w1.r r10 = r8.h
            c.c.a.a.l0 r9 = r9.f2944c
            c.c.a.a.w1.g r10 = (c.c.a.a.w1.g) r10
            int r9 = r10.k(r9)
            boolean r9 = r10.h(r9, r12)
            if (r9 == 0) goto L8f
            r0 = r3
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.w0.q.e(c.c.a.a.u1.v0.d, boolean, java.lang.Exception, long):boolean");
    }

    @Override // c.c.a.a.u1.v0.j
    public int f(long j, List<? extends c.c.a.a.u1.v0.m> list) {
        if (this.k == null) {
            c.c.a.a.w1.r rVar = this.h;
            if (((c.c.a.a.w1.g) rVar).f3409c.length >= 2) {
                return rVar.f(j, list);
            }
        }
        return list.size();
    }

    public final ArrayList<c.c.a.a.u1.w0.x.m> g() {
        List<c.c.a.a.u1.w0.x.a> list = this.i.b(this.j).f3063c;
        ArrayList<c.c.a.a.u1.w0.x.m> arrayList = new ArrayList<>();
        for (int i : this.f3006b) {
            arrayList.addAll(list.get(i).f3035c);
        }
        return arrayList;
    }

    public final long h(r rVar, c.c.a.a.u1.v0.m mVar, long j, long j2, long j3) {
        return mVar != null ? mVar.c() : c.c.a.a.z1.l0.g(rVar.f3014c.a(j, rVar.f3015d) + rVar.f3016e, j2, j3);
    }
}
