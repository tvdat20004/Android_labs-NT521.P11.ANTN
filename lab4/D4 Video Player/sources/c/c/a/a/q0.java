package c.c.a.a;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.u1.w f2207a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2208b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2209c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2210d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2211e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2212f;
    public final boolean g;

    public q0(c.c.a.a.u1.w wVar, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f2207a = wVar;
        this.f2208b = j;
        this.f2209c = j2;
        this.f2210d = j3;
        this.f2211e = j4;
        this.f2212f = z;
        this.g = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q0.class != obj.getClass()) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f2208b == q0Var.f2208b && this.f2209c == q0Var.f2209c && this.f2210d == q0Var.f2210d && this.f2211e == q0Var.f2211e && this.f2212f == q0Var.f2212f && this.g == q0Var.g && c.c.a.a.z1.l0.a(this.f2207a, q0Var.f2207a);
    }

    public int hashCode() {
        return ((((((((((((this.f2207a.hashCode() + 527) * 31) + ((int) this.f2208b)) * 31) + ((int) this.f2209c)) * 31) + ((int) this.f2210d)) * 31) + ((int) this.f2211e)) * 31) + (this.f2212f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
