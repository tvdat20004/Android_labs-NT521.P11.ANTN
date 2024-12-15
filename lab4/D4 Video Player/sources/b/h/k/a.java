package b.h.k;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1321a;

    /* renamed from: b, reason: collision with root package name */
    public int f1322b;

    /* renamed from: c, reason: collision with root package name */
    public float f1323c;

    /* renamed from: d, reason: collision with root package name */
    public float f1324d;
    public float j;
    public int k;

    /* renamed from: e, reason: collision with root package name */
    public long f1325e = Long.MIN_VALUE;
    public long i = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f1326f = 0;
    public int g = 0;
    public int h = 0;

    public final float a(long j) {
        if (j < this.f1325e) {
            return 0.0f;
        }
        long j2 = this.i;
        if (j2 < 0 || j < j2) {
            return d.b((j - r0) / this.f1321a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.j;
        return (d.b((j - j2) / this.k, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
