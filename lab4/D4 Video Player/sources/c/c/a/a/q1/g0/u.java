package c.c.a.a.q1.g0;

/* loaded from: classes.dex */
public final class u implements j {

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.z1.z f2603a;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.q1.r f2604b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2605c;

    /* renamed from: d, reason: collision with root package name */
    public String f2606d;

    /* renamed from: e, reason: collision with root package name */
    public c.c.a.a.q1.y f2607e;

    /* renamed from: f, reason: collision with root package name */
    public int f2608f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public u(String str) {
        c.c.a.a.z1.z zVar = new c.c.a.a.z1.z(4);
        this.f2603a = zVar;
        zVar.f3800a[0] = -1;
        this.f2604b = new c.c.a.a.q1.r();
        this.f2605c = str;
    }

    @Override // c.c.a.a.q1.g0.j
    public void a() {
        this.f2608f = 0;
        this.g = 0;
        this.i = false;
    }

    @Override // c.c.a.a.q1.g0.j
    public void c(c.c.a.a.z1.z zVar) {
        while (zVar.a() > 0) {
            int i = this.f2608f;
            if (i == 0) {
                byte[] bArr = zVar.f3800a;
                int i2 = zVar.f3801b;
                int i3 = zVar.f3802c;
                while (true) {
                    if (i2 >= i3) {
                        zVar.A(i3);
                        break;
                    }
                    boolean z = (bArr[i2] & 255) == 255;
                    boolean z2 = this.i && (bArr[i2] & 224) == 224;
                    this.i = z;
                    if (z2) {
                        zVar.A(i2 + 1);
                        this.i = false;
                        this.f2603a.f3800a[1] = bArr[i2];
                        this.g = 2;
                        this.f2608f = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int min = Math.min(zVar.a(), 4 - this.g);
                zVar.c(this.f2603a.f3800a, this.g, min);
                int i4 = this.g + min;
                this.g = i4;
                if (i4 >= 4) {
                    this.f2603a.A(0);
                    if (c.c.a.a.q1.r.b(this.f2603a.d(), this.f2604b)) {
                        c.c.a.a.q1.r rVar = this.f2604b;
                        this.k = rVar.f2660c;
                        if (!this.h) {
                            int i5 = rVar.f2661d;
                            this.j = (rVar.g * 1000000) / i5;
                            this.f2607e.b(c.c.a.a.l0.r(this.f2606d, rVar.f2659b, null, -1, 4096, rVar.f2662e, i5, null, null, 0, this.f2605c));
                            this.h = true;
                        }
                        this.f2603a.A(0);
                        this.f2607e.a(this.f2603a, 4);
                        this.f2608f = 2;
                    } else {
                        this.g = 0;
                        this.f2608f = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(zVar.a(), this.k - this.g);
                this.f2607e.a(zVar, min2);
                int i6 = this.g + min2;
                this.g = i6;
                int i7 = this.k;
                if (i6 >= i7) {
                    this.f2607e.d(this.l, 1, i7, 0, null);
                    this.l += this.j;
                    this.g = 0;
                    this.f2608f = 0;
                }
            }
        }
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
        this.f2606d = p0Var.b();
        this.f2607e = nVar.j(p0Var.c(), 1);
    }
}
