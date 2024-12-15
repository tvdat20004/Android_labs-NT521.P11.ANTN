package c.c.a.a.q1.g0;

/* loaded from: classes.dex */
public final class l implements j {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f2531a;

    /* renamed from: b, reason: collision with root package name */
    public c.c.a.a.q1.y f2532b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2533c;

    /* renamed from: d, reason: collision with root package name */
    public long f2534d;

    /* renamed from: e, reason: collision with root package name */
    public final r0 f2535e;

    /* renamed from: f, reason: collision with root package name */
    public final c.c.a.a.z1.z f2536f;
    public final boolean[] g = new boolean[4];
    public final k h = new k(128);
    public final v i;
    public long j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public l(r0 r0Var) {
        c.c.a.a.z1.z zVar;
        this.f2535e = r0Var;
        if (r0Var != null) {
            this.i = new v(178, 128);
            zVar = new c.c.a.a.z1.z();
        } else {
            zVar = null;
            this.i = null;
        }
        this.f2536f = zVar;
    }

    @Override // c.c.a.a.q1.g0.j
    public void a() {
        c.c.a.a.z1.x.a(this.g);
        k kVar = this.h;
        kVar.f2525a = false;
        kVar.f2526b = 0;
        kVar.f2527c = 0;
        if (this.f2535e != null) {
            this.i.c();
        }
        this.j = 0L;
        this.k = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    @Override // c.c.a.a.q1.g0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(c.c.a.a.z1.z r30) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.g0.l.c(c.c.a.a.z1.z):void");
    }

    @Override // c.c.a.a.q1.g0.j
    public void d() {
    }

    @Override // c.c.a.a.q1.g0.j
    public void e(long j, int i) {
        this.l = j;
    }

    @Override // c.c.a.a.q1.g0.j
    public void f(c.c.a.a.q1.n nVar, p0 p0Var) {
        p0Var.a();
        this.f2531a = p0Var.b();
        this.f2532b = nVar.j(p0Var.c(), 2);
        r0 r0Var = this.f2535e;
        if (r0Var != null) {
            for (int i = 0; i < r0Var.f2590b.length; i++) {
                p0Var.a();
                c.c.a.a.q1.y j = nVar.j(p0Var.c(), 3);
                c.c.a.a.l0 l0Var = r0Var.f2589a.get(i);
                String str = l0Var.j;
                c.c.a.a.x1.p.d("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
                j.b(c.c.a.a.l0.z(p0Var.b(), str, null, -1, l0Var.f2039d, l0Var.B, l0Var.C, null, Long.MAX_VALUE, l0Var.l));
                r0Var.f2590b[i] = j;
            }
        }
    }
}
