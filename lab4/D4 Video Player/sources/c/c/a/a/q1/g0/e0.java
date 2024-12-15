package c.c.a.a.q1.g0;

/* loaded from: classes.dex */
public final class e0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f2484a;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.z1.z f2485b = new c.c.a.a.z1.z(32);

    /* renamed from: c, reason: collision with root package name */
    public int f2486c;

    /* renamed from: d, reason: collision with root package name */
    public int f2487d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2488e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2489f;

    public e0(d0 d0Var) {
        this.f2484a = d0Var;
    }

    @Override // c.c.a.a.q1.g0.q0
    public void a() {
        this.f2489f = true;
    }

    @Override // c.c.a.a.q1.g0.q0
    public void b(c.c.a.a.z1.k0 k0Var, c.c.a.a.q1.n nVar, p0 p0Var) {
        this.f2484a.b(k0Var, nVar, p0Var);
        this.f2489f = true;
    }

    @Override // c.c.a.a.q1.g0.q0
    public void c(c.c.a.a.z1.z zVar, int i) {
        boolean z = (i & 1) != 0;
        int p = z ? zVar.f3801b + zVar.p() : -1;
        if (this.f2489f) {
            if (!z) {
                return;
            }
            this.f2489f = false;
            zVar.A(p);
            this.f2487d = 0;
        }
        while (zVar.a() > 0) {
            int i2 = this.f2487d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int p2 = zVar.p();
                    zVar.A(zVar.f3801b - 1);
                    if (p2 == 255) {
                        this.f2489f = true;
                        return;
                    }
                }
                int min = Math.min(zVar.a(), 3 - this.f2487d);
                zVar.c(this.f2485b.f3800a, this.f2487d, min);
                int i3 = this.f2487d + min;
                this.f2487d = i3;
                if (i3 == 3) {
                    this.f2485b.w(3);
                    this.f2485b.B(1);
                    int p3 = this.f2485b.p();
                    int p4 = this.f2485b.p();
                    this.f2488e = (p3 & 128) != 0;
                    int i4 = (((p3 & 15) << 8) | p4) + 3;
                    this.f2486c = i4;
                    c.c.a.a.z1.z zVar2 = this.f2485b;
                    byte[] bArr = zVar2.f3800a;
                    if (bArr.length < i4) {
                        zVar2.w(Math.min(4098, Math.max(i4, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f2485b.f3800a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(zVar.a(), this.f2486c - this.f2487d);
                zVar.c(this.f2485b.f3800a, this.f2487d, min2);
                int i5 = this.f2487d + min2;
                this.f2487d = i5;
                int i6 = this.f2486c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.f2488e) {
                        byte[] bArr2 = this.f2485b.f3800a;
                        int i7 = c.c.a.a.z1.l0.f3761a;
                        int i8 = -1;
                        for (int i9 = 0; i9 < i6; i9++) {
                            i8 = c.c.a.a.z1.l0.l[((i8 >>> 24) ^ (bArr2[i9] & 255)) & 255] ^ (i8 << 8);
                        }
                        if (i8 != 0) {
                            this.f2489f = true;
                            return;
                        }
                        this.f2485b.w(this.f2486c - 4);
                    } else {
                        this.f2485b.w(i6);
                    }
                    this.f2484a.c(this.f2485b);
                    this.f2487d = 0;
                }
            }
        }
    }
}
