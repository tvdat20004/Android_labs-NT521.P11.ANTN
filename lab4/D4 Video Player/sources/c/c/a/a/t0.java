package c.c.a.a;

/* loaded from: classes.dex */
public final class t0 {
    public static final c.c.a.a.u1.w n = new c.c.a.a.u1.w(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final k1 f2805a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2806b;

    /* renamed from: c, reason: collision with root package name */
    public final c.c.a.a.u1.w f2807c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2808d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2809e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2810f;
    public final boolean g;
    public final c.c.a.a.u1.s0 h;
    public final c.c.a.a.w1.w i;
    public final c.c.a.a.u1.w j;
    public volatile long k;
    public volatile long l;
    public volatile long m;

    public t0(k1 k1Var, Object obj, c.c.a.a.u1.w wVar, long j, long j2, int i, boolean z, c.c.a.a.u1.s0 s0Var, c.c.a.a.w1.w wVar2, c.c.a.a.u1.w wVar3, long j3, long j4, long j5) {
        this.f2805a = k1Var;
        this.f2806b = obj;
        this.f2807c = wVar;
        this.f2808d = j;
        this.f2809e = j2;
        this.f2810f = i;
        this.g = z;
        this.h = s0Var;
        this.i = wVar2;
        this.j = wVar3;
        this.k = j3;
        this.l = j4;
        this.m = j5;
    }

    public static t0 c(long j, c.c.a.a.w1.w wVar) {
        k1 k1Var = k1.f2035a;
        c.c.a.a.u1.w wVar2 = n;
        return new t0(k1Var, null, wVar2, j, -9223372036854775807L, 1, false, c.c.a.a.u1.s0.f2921e, wVar, wVar2, j, 0L, j);
    }

    public t0 a(c.c.a.a.u1.w wVar, long j, long j2, long j3) {
        return new t0(this.f2805a, this.f2806b, wVar, j, wVar.a() ? j2 : -9223372036854775807L, this.f2810f, this.g, this.h, this.i, this.j, this.k, j3, j);
    }

    public t0 b(c.c.a.a.u1.s0 s0Var, c.c.a.a.w1.w wVar) {
        return new t0(this.f2805a, this.f2806b, this.f2807c, this.f2808d, this.f2809e, this.f2810f, this.g, s0Var, wVar, this.j, this.k, this.l, this.m);
    }

    public c.c.a.a.u1.w d(boolean z, j1 j1Var) {
        if (this.f2805a.p()) {
            return n;
        }
        k1 k1Var = this.f2805a;
        return new c.c.a.a.u1.w(this.f2805a.l(k1Var.m(k1Var.a(), j1Var).f2031d));
    }
}
