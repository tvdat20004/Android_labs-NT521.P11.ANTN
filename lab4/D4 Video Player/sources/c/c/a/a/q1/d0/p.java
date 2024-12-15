package c.c.a.a.q1.d0;

import c.c.a.a.q1.w;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.x;
import c.c.a.a.z1.z;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class p implements c.c.a.a.q1.m, c.c.a.a.q1.v {
    public static final int u = l0.l("qt  ");

    /* renamed from: f, reason: collision with root package name */
    public int f2351f;
    public int g;
    public long h;
    public int i;
    public z j;
    public int l;
    public int m;
    public boolean n;
    public c.c.a.a.q1.n o;
    public o[] p;
    public long[][] q;
    public int r;
    public long s;
    public boolean t;

    /* renamed from: d, reason: collision with root package name */
    public final z f2349d = new z(16);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque<a> f2350e = new ArrayDeque<>();

    /* renamed from: a, reason: collision with root package name */
    public final z f2346a = new z(x.f3792a);

    /* renamed from: b, reason: collision with root package name */
    public final z f2347b = new z(4);

    /* renamed from: c, reason: collision with root package name */
    public final z f2348c = new z();
    public int k = -1;

    public p(int i) {
    }

    public static long l(v vVar, long j, long j2) {
        int a2 = vVar.a(j);
        if (a2 == -1) {
            a2 = vVar.b(j);
        }
        return a2 == -1 ? j2 : Math.min(vVar.f2373c[a2], j2);
    }

    @Override // c.c.a.a.q1.m
    public void a() {
    }

    @Override // c.c.a.a.q1.v
    public boolean c() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0291  */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    @Override // c.c.a.a.q1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(c.c.a.a.q1.j r31, c.c.a.a.q1.s r32) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.d0.p.d(c.c.a.a.q1.j, c.c.a.a.q1.s):int");
    }

    @Override // c.c.a.a.q1.m
    public void e(c.c.a.a.q1.n nVar) {
        this.o = nVar;
    }

    @Override // c.c.a.a.q1.v
    public c.c.a.a.q1.t g(long j) {
        long j2;
        long j3;
        long j4;
        int b2;
        long j5 = j;
        w wVar = w.f2669c;
        o[] oVarArr = this.p;
        if (oVarArr.length == 0) {
            return new c.c.a.a.q1.t(wVar);
        }
        long j6 = -1;
        int i = this.r;
        if (i != -1) {
            v vVar = oVarArr[i].f2343b;
            int a2 = vVar.a(j5);
            if (a2 == -1) {
                a2 = vVar.b(j5);
            }
            if (a2 == -1) {
                return new c.c.a.a.q1.t(wVar);
            }
            long j7 = vVar.f2376f[a2];
            j2 = vVar.f2373c[a2];
            if (j7 >= j5 || a2 >= vVar.f2372b - 1 || (b2 = vVar.b(j5)) == -1 || b2 == a2) {
                j4 = -9223372036854775807L;
            } else {
                long j8 = vVar.f2376f[b2];
                long j9 = vVar.f2373c[b2];
                j4 = j8;
                j6 = j9;
            }
            j3 = j4;
            j5 = j7;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            o[] oVarArr2 = this.p;
            if (i2 >= oVarArr2.length) {
                break;
            }
            if (i2 != this.r) {
                v vVar2 = oVarArr2[i2].f2343b;
                long l = l(vVar2, j5, j2);
                if (j3 != -9223372036854775807L) {
                    j6 = l(vVar2, j3, j6);
                }
                j2 = l;
            }
            i2++;
        }
        w wVar2 = new w(j5, j2);
        return j3 == -9223372036854775807L ? new c.c.a.a.q1.t(wVar2) : new c.c.a.a.q1.t(wVar2, new w(j3, j6));
    }

    @Override // c.c.a.a.q1.m
    public void h(long j, long j2) {
        this.f2350e.clear();
        this.i = 0;
        this.k = -1;
        this.l = 0;
        this.m = 0;
        this.n = false;
        if (j == 0) {
            k();
            return;
        }
        o[] oVarArr = this.p;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                v vVar = oVar.f2343b;
                int a2 = vVar.a(j2);
                if (a2 == -1) {
                    a2 = vVar.b(j2);
                }
                oVar.f2345d = a2;
            }
        }
    }

    @Override // c.c.a.a.q1.m
    public boolean i(c.c.a.a.q1.j jVar) {
        return r.a(jVar, false);
    }

    @Override // c.c.a.a.q1.v
    public long j() {
        return this.s;
    }

    public final void k() {
        this.f2351f = 0;
        this.i = 0;
    }

    public final void m(long j) {
        while (!this.f2350e.isEmpty() && this.f2350e.peek().g1 == j) {
            a pop = this.f2350e.pop();
            if (pop.f2299a == c.R) {
                n(pop);
                this.f2350e.clear();
                this.f2351f = 2;
            } else if (!this.f2350e.isEmpty()) {
                this.f2350e.peek().i1.add(pop);
            }
        }
        if (this.f2351f != 2) {
            k();
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[Catch: all -> 0x01ba, TryCatch #1 {all -> 0x01ba, blocks: (B:27:0x0082, B:29:0x0086, B:31:0x008c, B:33:0x0091, B:35:0x0099, B:43:0x00a0, B:46:0x00a7, B:49:0x00b4, B:50:0x00ae, B:53:0x00ba, B:55:0x00be, B:56:0x00c6, B:58:0x00ca, B:59:0x00d2, B:61:0x00d6, B:62:0x00dc, B:65:0x01ac, B:66:0x00e4, B:69:0x00ec, B:72:0x00f4, B:75:0x00fc, B:78:0x0104, B:81:0x010c, B:83:0x0110, B:84:0x0118, B:86:0x011c, B:87:0x0124, B:90:0x012c, B:93:0x0134, B:95:0x0138, B:96:0x018d, B:102:0x013e, B:104:0x0146, B:105:0x014c, B:107:0x0150, B:110:0x0155, B:112:0x0159, B:115:0x015e, B:118:0x0165, B:121:0x016c, B:124:0x0173, B:127:0x017a, B:130:0x0181, B:133:0x0186), top: B:26:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0 A[Catch: all -> 0x01ba, TryCatch #1 {all -> 0x01ba, blocks: (B:27:0x0082, B:29:0x0086, B:31:0x008c, B:33:0x0091, B:35:0x0099, B:43:0x00a0, B:46:0x00a7, B:49:0x00b4, B:50:0x00ae, B:53:0x00ba, B:55:0x00be, B:56:0x00c6, B:58:0x00ca, B:59:0x00d2, B:61:0x00d6, B:62:0x00dc, B:65:0x01ac, B:66:0x00e4, B:69:0x00ec, B:72:0x00f4, B:75:0x00fc, B:78:0x0104, B:81:0x010c, B:83:0x0110, B:84:0x0118, B:86:0x011c, B:87:0x0124, B:90:0x012c, B:93:0x0134, B:95:0x0138, B:96:0x018d, B:102:0x013e, B:104:0x0146, B:105:0x014c, B:107:0x0150, B:110:0x0155, B:112:0x0159, B:115:0x015e, B:118:0x0165, B:121:0x016c, B:124:0x0173, B:127:0x017a, B:130:0x0181, B:133:0x0186), top: B:26:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0b10 A[LOOP:22: B:522:0x0b0d->B:524:0x0b10, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0b2f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(c.c.a.a.q1.d0.a r66) {
        /*
            Method dump skipped, instructions count: 2943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.d0.p.n(c.c.a.a.q1.d0.a):void");
    }
}
