package c.c.a.a.q1.g0;

/* loaded from: classes.dex */
public final class w implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f2614a;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.z1.y f2615b = new c.c.a.a.z1.y(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    public int f2616c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2617d;

    /* renamed from: e, reason: collision with root package name */
    public c.c.a.a.z1.k0 f2618e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2619f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public w(j jVar) {
        this.f2614a = jVar;
    }

    @Override // c.c.a.a.q1.g0.q0
    public final void a() {
        this.f2616c = 0;
        this.f2617d = 0;
        this.h = false;
        this.f2614a.a();
    }

    @Override // c.c.a.a.q1.g0.q0
    public void b(c.c.a.a.z1.k0 k0Var, c.c.a.a.q1.n nVar, p0 p0Var) {
        this.f2618e = k0Var;
        this.f2614a.f(nVar, p0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006f -> B:11:0x0071). Please report as a decompilation issue!!! */
    @Override // c.c.a.a.q1.g0.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(c.c.a.a.z1.z r14, int r15) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.g0.w.c(c.c.a.a.z1.z, int):void");
    }

    public final boolean d(c.c.a.a.z1.z zVar, byte[] bArr, int i) {
        int min = Math.min(zVar.a(), i - this.f2617d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zVar.B(min);
        } else {
            System.arraycopy(zVar.f3800a, zVar.f3801b, bArr, this.f2617d, min);
            zVar.f3801b += min;
        }
        int i2 = this.f2617d + min;
        this.f2617d = i2;
        return i2 == i;
    }

    public final void e(int i) {
        this.f2616c = i;
        this.f2617d = 0;
    }
}
