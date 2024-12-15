package c.c.a.a;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: e, reason: collision with root package name */
    public static final u0 f2816e = new u0(1.0f, 1.0f, false);

    /* renamed from: a, reason: collision with root package name */
    public final float f2817a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2818b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2819c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2820d;

    public u0(float f2, float f3, boolean z) {
        c.c.a.a.x1.p.c(f2 > 0.0f);
        c.c.a.a.x1.p.c(f3 > 0.0f);
        this.f2817a = f2;
        this.f2818b = f3;
        this.f2819c = z;
        this.f2820d = Math.round(f2 * 1000.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u0.class != obj.getClass()) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f2817a == u0Var.f2817a && this.f2818b == u0Var.f2818b && this.f2819c == u0Var.f2819c;
    }

    public int hashCode() {
        return ((Float.floatToRawIntBits(this.f2818b) + ((Float.floatToRawIntBits(this.f2817a) + 527) * 31)) * 31) + (this.f2819c ? 1 : 0);
    }
}
