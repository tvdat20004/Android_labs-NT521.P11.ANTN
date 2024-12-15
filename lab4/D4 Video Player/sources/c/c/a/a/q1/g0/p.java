package c.c.a.a.q1.g0;

/* loaded from: classes.dex */
public final class p implements j {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f2566a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2567b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2568c;
    public long g;
    public String i;
    public c.c.a.a.q1.y j;
    public o k;
    public boolean l;
    public long m;
    public boolean n;
    public final boolean[] h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final v f2569d = new v(7, 128);

    /* renamed from: e, reason: collision with root package name */
    public final v f2570e = new v(8, 128);

    /* renamed from: f, reason: collision with root package name */
    public final v f2571f = new v(6, 128);
    public final c.c.a.a.z1.z o = new c.c.a.a.z1.z();

    public p(f0 f0Var, boolean z, boolean z2) {
        this.f2566a = f0Var;
        this.f2567b = z;
        this.f2568c = z2;
    }

    @Override // c.c.a.a.q1.g0.j
    public void a() {
        c.c.a.a.z1.x.a(this.h);
        this.f2569d.c();
        this.f2570e.c();
        this.f2571f.c();
        o oVar = this.k;
        oVar.k = false;
        oVar.o = false;
        n nVar = oVar.n;
        nVar.f2549b = false;
        nVar.f2548a = false;
        this.g = 0L;
        this.n = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.g0.p.b(byte[], int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0205, code lost:
    
        if ((r5.f2548a && !(r6.f2548a && r5.f2553f == r6.f2553f && r5.g == r6.g && r5.h == r6.h && ((!r5.i || !r6.i || r5.j == r6.j) && (((r7 = r5.f2551d) == (r10 = r6.f2551d) || (r7 != 0 && r10 != 0)) && (((r7 = r5.f2550c.k) != 0 || r6.f2550c.k != 0 || (r5.m == r6.m && r5.n == r6.n)) && ((r7 != 1 || r6.f2550c.k != 1 || (r5.o == r6.o && r5.p == r6.p)) && (r7 = r5.k) == (r10 = r6.k) && (!r7 || !r10 || r5.l == r6.l))))))) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x028c, code lost:
    
        if (r4 != 1) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028b  */
    @Override // c.c.a.a.q1.g0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(c.c.a.a.z1.z r33) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.g0.p.c(c.c.a.a.z1.z):void");
    }

    @Override // c.c.a.a.q1.g0.j
    public void d() {
    }

    @Override // c.c.a.a.q1.g0.j
    public void e(long j, int i) {
        this.m = j;
        this.n |= (i & 2) != 0;
    }

    @Override // c.c.a.a.q1.g0.j
    public void f(c.c.a.a.q1.n nVar, p0 p0Var) {
        p0Var.a();
        this.i = p0Var.b();
        c.c.a.a.q1.y j = nVar.j(p0Var.c(), 2);
        this.j = j;
        this.k = new o(j, this.f2567b, this.f2568c);
        this.f2566a.a(nVar, p0Var);
    }
}
