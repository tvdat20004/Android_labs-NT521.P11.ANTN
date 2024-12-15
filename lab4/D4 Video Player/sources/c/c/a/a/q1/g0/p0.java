package c.c.a.a.q1.g0;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2572a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2573b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2574c;

    /* renamed from: d, reason: collision with root package name */
    public int f2575d;

    /* renamed from: e, reason: collision with root package name */
    public String f2576e;

    public p0(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f2572a = str;
        this.f2573b = i2;
        this.f2574c = i3;
        this.f2575d = Integer.MIN_VALUE;
    }

    public void a() {
        int i = this.f2575d;
        this.f2575d = i == Integer.MIN_VALUE ? this.f2573b : i + this.f2574c;
        this.f2576e = this.f2572a + this.f2575d;
    }

    public String b() {
        if (this.f2575d != Integer.MIN_VALUE) {
            return this.f2576e;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public int c() {
        int i = this.f2575d;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }
}
