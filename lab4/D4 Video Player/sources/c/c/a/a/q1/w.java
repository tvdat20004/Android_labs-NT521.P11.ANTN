package c.c.a.a.q1;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final w f2669c = new w(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f2670a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2671b;

    public w(long j, long j2) {
        this.f2670a = j;
        this.f2671b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.f2670a == wVar.f2670a && this.f2671b == wVar.f2671b;
    }

    public int hashCode() {
        return (((int) this.f2670a) * 31) + ((int) this.f2671b);
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("[timeUs=");
        j.append(this.f2670a);
        j.append(", position=");
        j.append(this.f2671b);
        j.append("]");
        return j.toString();
    }
}
