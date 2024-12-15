package c.c.a.a.q1.g0;

/* loaded from: classes.dex */
public final class r implements j {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f2583a;

    /* renamed from: b, reason: collision with root package name */
    public String f2584b;

    /* renamed from: c, reason: collision with root package name */
    public c.c.a.a.q1.y f2585c;

    /* renamed from: d, reason: collision with root package name */
    public q f2586d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2587e;
    public long l;
    public long m;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f2588f = new boolean[3];
    public final v g = new v(32, 128);
    public final v h = new v(33, 128);
    public final v i = new v(34, 128);
    public final v j = new v(39, 128);
    public final v k = new v(40, 128);
    public final c.c.a.a.z1.z n = new c.c.a.a.z1.z();

    public r(f0 f0Var) {
        this.f2583a = f0Var;
    }

    @Override // c.c.a.a.q1.g0.j
    public void a() {
        c.c.a.a.z1.x.a(this.f2588f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        q qVar = this.f2586d;
        qVar.f2582f = false;
        qVar.g = false;
        qVar.h = false;
        qVar.i = false;
        qVar.j = false;
        this.l = 0L;
    }

    public final void b(byte[] bArr, int i, int i2) {
        if (this.f2587e) {
            q qVar = this.f2586d;
            if (qVar.f2582f) {
                int i3 = qVar.f2580d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    qVar.g = (bArr[i4] & 128) != 0;
                    qVar.f2582f = false;
                } else {
                    qVar.f2580d = (i2 - i) + i3;
                }
            }
        } else {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x037e  */
    @Override // c.c.a.a.q1.g0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(c.c.a.a.z1.z r36) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.g0.r.c(c.c.a.a.z1.z):void");
    }

    @Override // c.c.a.a.q1.g0.j
    public void d() {
    }

    @Override // c.c.a.a.q1.g0.j
    public void e(long j, int i) {
        this.m = j;
    }

    @Override // c.c.a.a.q1.g0.j
    public void f(c.c.a.a.q1.n nVar, p0 p0Var) {
        p0Var.a();
        this.f2584b = p0Var.b();
        c.c.a.a.q1.y j = nVar.j(p0Var.c(), 2);
        this.f2585c = j;
        this.f2586d = new q(j);
        this.f2583a.a(nVar, p0Var);
    }
}
