package b.h.j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1261a;

    public c(Object obj) {
        this.f1261a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f1261a;
        Object obj3 = ((c) obj).f1261a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f1261a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("DisplayCutoutCompat{");
        j.append(this.f1261a);
        j.append("}");
        return j.toString();
    }
}
