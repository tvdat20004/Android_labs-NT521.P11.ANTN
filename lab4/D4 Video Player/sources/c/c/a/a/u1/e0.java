package c.c.a.a.u1;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2862a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2863b;

    public e0(int i, boolean z) {
        this.f2862a = i;
        this.f2863b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f2862a == e0Var.f2862a && this.f2863b == e0Var.f2863b;
    }

    public int hashCode() {
        return (this.f2862a * 31) + (this.f2863b ? 1 : 0);
    }
}
