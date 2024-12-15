package b.r.b;

/* loaded from: classes.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1680a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1681b;

    /* renamed from: c, reason: collision with root package name */
    public int f1682c;

    /* renamed from: d, reason: collision with root package name */
    public int f1683d;

    /* renamed from: e, reason: collision with root package name */
    public int f1684e;

    public boolean a() {
        int i = this.f1680a;
        if ((i & 7) != 0 && (i & (b(this.f1683d, this.f1681b) << 0)) == 0) {
            return false;
        }
        int i2 = this.f1680a;
        if ((i2 & 112) != 0 && (i2 & (b(this.f1683d, this.f1682c) << 4)) == 0) {
            return false;
        }
        int i3 = this.f1680a;
        if ((i3 & 1792) != 0 && (i3 & (b(this.f1684e, this.f1681b) << 8)) == 0) {
            return false;
        }
        int i4 = this.f1680a;
        return (i4 & 28672) == 0 || (i4 & (b(this.f1684e, this.f1682c) << 12)) != 0;
    }

    public int b(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 2 : 4;
    }
}
