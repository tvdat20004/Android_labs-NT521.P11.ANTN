package c.c.a.a.u1;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2972a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2973b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2974c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2975d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2976e;

    public w(Object obj) {
        this.f2972a = obj;
        this.f2973b = -1;
        this.f2974c = -1;
        this.f2975d = -1L;
        this.f2976e = -1;
    }

    public boolean a() {
        return this.f2973b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.f2972a.equals(wVar.f2972a) && this.f2973b == wVar.f2973b && this.f2974c == wVar.f2974c && this.f2975d == wVar.f2975d && this.f2976e == wVar.f2976e;
    }

    public int hashCode() {
        return ((((((((this.f2972a.hashCode() + 527) * 31) + this.f2973b) * 31) + this.f2974c) * 31) + ((int) this.f2975d)) * 31) + this.f2976e;
    }

    public w(Object obj, int i, int i2, long j) {
        this.f2972a = obj;
        this.f2973b = i;
        this.f2974c = i2;
        this.f2975d = j;
        this.f2976e = -1;
    }

    public w(Object obj, long j, int i) {
        this.f2972a = obj;
        this.f2973b = -1;
        this.f2974c = -1;
        this.f2975d = j;
        this.f2976e = i;
    }
}
