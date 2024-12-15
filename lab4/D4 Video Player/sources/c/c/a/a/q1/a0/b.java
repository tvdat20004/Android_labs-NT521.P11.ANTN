package c.c.a.a.q1.a0;

import c.c.a.a.q1.j;
import c.c.a.a.q1.m;
import c.c.a.a.q1.n;
import c.c.a.a.q1.u;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.z;

/* loaded from: classes.dex */
public final class b implements m {
    public static final int q = l0.l("FLV");

    /* renamed from: f, reason: collision with root package name */
    public n f2228f;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public a o;
    public f p;

    /* renamed from: a, reason: collision with root package name */
    public final z f2223a = new z(4);

    /* renamed from: b, reason: collision with root package name */
    public final z f2224b = new z(9);

    /* renamed from: c, reason: collision with root package name */
    public final z f2225c = new z(11);

    /* renamed from: d, reason: collision with root package name */
    public final z f2226d = new z();

    /* renamed from: e, reason: collision with root package name */
    public final c f2227e = new c();
    public int g = 1;

    @Override // c.c.a.a.q1.m
    public void a() {
    }

    public final void b() {
        if (this.n) {
            return;
        }
        this.f2228f.a(new u(-9223372036854775807L, 0L));
        this.n = true;
    }

    public final z c(j jVar) {
        int i = this.l;
        z zVar = this.f2226d;
        byte[] bArr = zVar.f3800a;
        if (i > bArr.length) {
            zVar.f3800a = new byte[Math.max(bArr.length * 2, i)];
            zVar.f3802c = 0;
            zVar.f3801b = 0;
        } else {
            zVar.A(0);
        }
        this.f2226d.z(this.l);
        jVar.g(this.f2226d.f3800a, 0, this.l, false);
        return this.f2226d;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x008a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0004 A[SYNTHETIC] */
    @Override // c.c.a.a.q1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(c.c.a.a.q1.j r17, c.c.a.a.q1.s r18) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.a0.b.d(c.c.a.a.q1.j, c.c.a.a.q1.s):int");
    }

    @Override // c.c.a.a.q1.m
    public void e(n nVar) {
        this.f2228f = nVar;
    }

    @Override // c.c.a.a.q1.m
    public void h(long j, long j2) {
        this.g = 1;
        this.h = false;
        this.j = 0;
    }

    @Override // c.c.a.a.q1.m
    public boolean i(j jVar) {
        jVar.d(this.f2223a.f3800a, 0, 3, false);
        this.f2223a.A(0);
        if (this.f2223a.r() != q) {
            return false;
        }
        jVar.d(this.f2223a.f3800a, 0, 2, false);
        this.f2223a.A(0);
        if ((this.f2223a.u() & 250) != 0) {
            return false;
        }
        jVar.d(this.f2223a.f3800a, 0, 4, false);
        this.f2223a.A(0);
        int d2 = this.f2223a.d();
        jVar.f2652f = 0;
        jVar.a(d2, false);
        jVar.d(this.f2223a.f3800a, 0, 4, false);
        this.f2223a.A(0);
        return this.f2223a.d() == 0;
    }
}
