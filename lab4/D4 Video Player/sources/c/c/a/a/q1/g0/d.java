package c.c.a.a.q1.g0;

/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.z1.y f2472a;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.z1.z f2473b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2474c;

    /* renamed from: d, reason: collision with root package name */
    public String f2475d;

    /* renamed from: e, reason: collision with root package name */
    public c.c.a.a.q1.y f2476e;

    /* renamed from: f, reason: collision with root package name */
    public int f2477f;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public c.c.a.a.l0 k;
    public int l;
    public long m;

    public d(String str) {
        c.c.a.a.z1.y yVar = new c.c.a.a.z1.y(new byte[16]);
        this.f2472a = yVar;
        this.f2473b = new c.c.a.a.z1.z(yVar.f3796a);
        this.f2477f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.f2474c = str;
    }

    @Override // c.c.a.a.q1.g0.j
    public void a() {
        this.f2477f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
    }

    @Override // c.c.a.a.q1.g0.j
    public void c(c.c.a.a.z1.z zVar) {
        boolean z;
        int p;
        while (zVar.a() > 0) {
            int i = this.f2477f;
            if (i == 0) {
                while (true) {
                    if (zVar.a() <= 0) {
                        z = false;
                        break;
                    } else if (this.h) {
                        p = zVar.p();
                        this.h = p == 172;
                        if (p == 64 || p == 65) {
                            break;
                        }
                    } else {
                        this.h = zVar.p() == 172;
                    }
                }
                this.i = p == 65;
                z = true;
                if (z) {
                    this.f2477f = 1;
                    byte[] bArr = this.f2473b.f3800a;
                    bArr[0] = -84;
                    bArr[1] = (byte) (this.i ? 65 : 64);
                    this.g = 2;
                }
            } else if (i == 1) {
                byte[] bArr2 = this.f2473b.f3800a;
                int min = Math.min(zVar.a(), 16 - this.g);
                System.arraycopy(zVar.f3800a, zVar.f3801b, bArr2, this.g, min);
                zVar.f3801b += min;
                int i2 = this.g + min;
                this.g = i2;
                if (i2 == 16) {
                    this.f2472a.j(0);
                    c.c.a.a.m1.i b2 = c.c.a.a.m1.j.b(this.f2472a);
                    c.c.a.a.l0 l0Var = this.k;
                    if (l0Var == null || 2 != l0Var.w || b2.f2106a != l0Var.x || !"audio/ac4".equals(l0Var.j)) {
                        c.c.a.a.l0 r = c.c.a.a.l0.r(this.f2475d, "audio/ac4", null, -1, -1, 2, b2.f2106a, null, null, 0, this.f2474c);
                        this.k = r;
                        this.f2476e.b(r);
                    }
                    this.l = b2.f2107b;
                    this.j = (b2.f2108c * 1000000) / this.k.x;
                    this.f2473b.A(0);
                    this.f2476e.a(this.f2473b, 16);
                    this.f2477f = 2;
                }
            } else if (i == 2) {
                int min2 = Math.min(zVar.a(), this.l - this.g);
                this.f2476e.a(zVar, min2);
                int i3 = this.g + min2;
                this.g = i3;
                int i4 = this.l;
                if (i3 == i4) {
                    this.f2476e.d(this.m, 1, i4, 0, null);
                    this.m += this.j;
                    this.f2477f = 0;
                }
            }
        }
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
        this.f2475d = p0Var.b();
        this.f2476e = nVar.j(p0Var.c(), 1);
    }
}
