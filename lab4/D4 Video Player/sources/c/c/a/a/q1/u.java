package c.c.a.a.q1;

/* loaded from: classes.dex */
public final class u implements v {

    /* renamed from: a, reason: collision with root package name */
    public final long f2667a;

    /* renamed from: b, reason: collision with root package name */
    public final t f2668b;

    public u(long j, long j2) {
        this.f2667a = j;
        this.f2668b = new t(j2 == 0 ? w.f2669c : new w(0L, j2));
    }

    @Override // c.c.a.a.q1.v
    public boolean c() {
        return false;
    }

    @Override // c.c.a.a.q1.v
    public t g(long j) {
        return this.f2668b;
    }

    @Override // c.c.a.a.q1.v
    public long j() {
        return this.f2667a;
    }
}
