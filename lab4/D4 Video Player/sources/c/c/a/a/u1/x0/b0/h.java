package c.c.a.a.u1.x0.b0;

/* loaded from: classes.dex */
public final class h implements Comparable<Long> {

    /* renamed from: b, reason: collision with root package name */
    public final String f3133b;

    /* renamed from: c, reason: collision with root package name */
    public final h f3134c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3135d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3136e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3137f;
    public final c.c.a.a.p1.e g;
    public final String h;
    public final String i;
    public final long j;
    public final long k;
    public final boolean l;

    public h(String str, h hVar, String str2, long j, int i, long j2, c.c.a.a.p1.e eVar, String str3, String str4, long j3, long j4, boolean z) {
        this.f3133b = str;
        this.f3134c = hVar;
        this.f3135d = j;
        this.f3136e = i;
        this.f3137f = j2;
        this.g = eVar;
        this.h = str3;
        this.i = str4;
        this.j = j3;
        this.k = j4;
        this.l = z;
    }

    @Override // java.lang.Comparable
    public int compareTo(Long l) {
        Long l2 = l;
        if (this.f3137f > l2.longValue()) {
            return 1;
        }
        return this.f3137f < l2.longValue() ? -1 : 0;
    }
}
