package c.c.a.a;

import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.u1.v f2191a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2192b;

    /* renamed from: c, reason: collision with root package name */
    public final c.c.a.a.u1.l0[] f2193c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2194d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2195e;

    /* renamed from: f, reason: collision with root package name */
    public q0 f2196f;
    public final boolean[] g;
    public final r[] h;
    public final c.c.a.a.w1.v i;
    public final c.c.a.a.u1.l j;
    public p0 k;
    public c.c.a.a.u1.s0 l;
    public c.c.a.a.w1.w m;
    public long n;

    public p0(r[] rVarArr, long j, c.c.a.a.w1.v vVar, c.c.a.a.y1.r rVar, c.c.a.a.u1.l lVar, q0 q0Var) {
        this.h = rVarArr;
        this.n = j;
        this.i = vVar;
        this.j = lVar;
        c.c.a.a.u1.w wVar = q0Var.f2207a;
        this.f2192b = wVar.f2972a;
        this.f2196f = q0Var;
        this.f2193c = new c.c.a.a.u1.l0[rVarArr.length];
        this.g = new boolean[rVarArr.length];
        long j2 = q0Var.f2208b;
        long j3 = q0Var.f2210d;
        c.c.a.a.u1.v b2 = lVar.b(wVar, rVar, j2);
        if (j3 != -9223372036854775807L && j3 != Long.MIN_VALUE) {
            b2 = new c.c.a.a.u1.o(b2, true, 0L, j3);
        }
        this.f2191a = b2;
    }

    public long a(c.c.a.a.w1.w wVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= wVar.f3450a) {
                break;
            }
            boolean[] zArr2 = this.g;
            if (z || !wVar.a(this.m, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        c.c.a.a.u1.l0[] l0VarArr = this.f2193c;
        int i2 = 0;
        while (true) {
            r[] rVarArr = this.h;
            if (i2 >= rVarArr.length) {
                break;
            }
            if (rVarArr[i2].f2682b == 6) {
                l0VarArr[i2] = null;
            }
            i2++;
        }
        b();
        this.m = wVar;
        c();
        c.c.a.a.w1.s sVar = wVar.f3452c;
        long o = this.f2191a.o(sVar.a(), this.g, this.f2193c, zArr, j);
        c.c.a.a.u1.l0[] l0VarArr2 = this.f2193c;
        c.c.a.a.w1.w wVar2 = this.m;
        Objects.requireNonNull(wVar2);
        int i3 = 0;
        while (true) {
            r[] rVarArr2 = this.h;
            if (i3 >= rVarArr2.length) {
                break;
            }
            if (rVarArr2[i3].f2682b == 6 && wVar2.b(i3)) {
                l0VarArr2[i3] = new c.c.a.a.u1.r();
            }
            i3++;
        }
        this.f2195e = false;
        int i4 = 0;
        while (true) {
            c.c.a.a.u1.l0[] l0VarArr3 = this.f2193c;
            if (i4 >= l0VarArr3.length) {
                return o;
            }
            if (l0VarArr3[i4] != null) {
                c.c.a.a.x1.p.g(wVar.b(i4));
                if (this.h[i4].f2682b != 6) {
                    this.f2195e = true;
                }
            } else {
                c.c.a.a.x1.p.g(sVar.f3441b[i4] == null);
            }
            i4++;
        }
    }

    public final void b() {
        c.c.a.a.w1.w wVar = this.m;
        if (!f() || wVar == null) {
            return;
        }
        for (int i = 0; i < wVar.f3450a; i++) {
            wVar.b(i);
            c.c.a.a.w1.r rVar = wVar.f3452c.f3441b[i];
        }
    }

    public final void c() {
        c.c.a.a.w1.w wVar = this.m;
        if (!f() || wVar == null) {
            return;
        }
        for (int i = 0; i < wVar.f3450a; i++) {
            boolean b2 = wVar.b(i);
            c.c.a.a.w1.r rVar = wVar.f3452c.f3441b[i];
            if (b2 && rVar != null) {
                rVar.c();
            }
        }
    }

    public long d() {
        if (!this.f2194d) {
            return this.f2196f.f2208b;
        }
        long d2 = this.f2195e ? this.f2191a.d() : Long.MIN_VALUE;
        return d2 == Long.MIN_VALUE ? this.f2196f.f2211e : d2;
    }

    public boolean e() {
        return this.f2194d && (!this.f2195e || this.f2191a.d() == Long.MIN_VALUE);
    }

    public final boolean f() {
        return this.k == null;
    }

    public void g() {
        b();
        this.m = null;
        long j = this.f2196f.f2210d;
        c.c.a.a.u1.l lVar = this.j;
        c.c.a.a.u1.v vVar = this.f2191a;
        try {
            if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
                lVar.f(vVar);
            } else {
                lVar.f(((c.c.a.a.u1.o) vVar).f2907b);
            }
        } catch (RuntimeException e2) {
            Log.e("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0335, code lost:
    
        if (r2 < 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0352, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x09b4, code lost:
    
        if (r7 != 2) goto L479;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0252 A[LOOP:8: B:68:0x013c->B:116:0x0252, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x024c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0a44 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0a45  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c.c.a.a.w1.w h(float r52, c.c.a.a.k1 r53) {
        /*
            Method dump skipped, instructions count: 2652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.p0.h(float, c.c.a.a.k1):c.c.a.a.w1.w");
    }
}
