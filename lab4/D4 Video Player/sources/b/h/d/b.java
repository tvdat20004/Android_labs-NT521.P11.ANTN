package b.h.d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f1158e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1159a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1160b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1161c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1162d;

    public b(int i, int i2, int i3, int i4) {
        this.f1159a = i;
        this.f1160b = i2;
        this.f1161c = i3;
        this.f1162d = i4;
    }

    public static b a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f1158e : new b(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1162d == bVar.f1162d && this.f1159a == bVar.f1159a && this.f1161c == bVar.f1161c && this.f1160b == bVar.f1160b;
    }

    public int hashCode() {
        return (((((this.f1159a * 31) + this.f1160b) * 31) + this.f1161c) * 31) + this.f1162d;
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("Insets{left=");
        j.append(this.f1159a);
        j.append(", top=");
        j.append(this.f1160b);
        j.append(", right=");
        j.append(this.f1161c);
        j.append(", bottom=");
        j.append(this.f1162d);
        j.append('}');
        return j.toString();
    }
}
