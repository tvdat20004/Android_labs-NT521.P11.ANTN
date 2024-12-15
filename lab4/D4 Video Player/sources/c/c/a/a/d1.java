package c.c.a.a;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: c, reason: collision with root package name */
    public static final d1 f1989c;

    /* renamed from: d, reason: collision with root package name */
    public static final d1 f1990d;

    /* renamed from: a, reason: collision with root package name */
    public final long f1991a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1992b;

    static {
        d1 d1Var = new d1(0L, 0L);
        f1989c = d1Var;
        c.c.a.a.x1.p.c(Long.MAX_VALUE >= 0);
        c.c.a.a.x1.p.c(Long.MAX_VALUE >= 0);
        c.c.a.a.x1.p.c(Long.MAX_VALUE >= 0);
        c.c.a.a.x1.p.c(0 >= 0);
        c.c.a.a.x1.p.c(0 >= 0);
        c.c.a.a.x1.p.c(Long.MAX_VALUE >= 0);
        f1990d = d1Var;
    }

    public d1(long j, long j2) {
        c.c.a.a.x1.p.c(j >= 0);
        c.c.a.a.x1.p.c(j2 >= 0);
        this.f1991a = j;
        this.f1992b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.f1991a == d1Var.f1991a && this.f1992b == d1Var.f1992b;
    }

    public int hashCode() {
        return (((int) this.f1991a) * 31) + ((int) this.f1992b);
    }
}
