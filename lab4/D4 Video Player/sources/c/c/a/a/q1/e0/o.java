package c.c.a.a.q1.e0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2415a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2416b;

    /* renamed from: c, reason: collision with root package name */
    public int f2417c;

    /* renamed from: d, reason: collision with root package name */
    public int f2418d;

    public o(byte[] bArr) {
        this.f2415a = bArr;
        this.f2416b = bArr.length;
    }

    public boolean a() {
        boolean z = (((this.f2415a[this.f2417c] & 255) >> this.f2418d) & 1) == 1;
        c(1);
        return z;
    }

    public int b(int i) {
        int i2 = this.f2417c;
        int min = Math.min(i, 8 - this.f2418d);
        int i3 = i2 + 1;
        int i4 = ((this.f2415a[i2] & 255) >> this.f2418d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f2415a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        c(i);
        return i5;
    }

    public void c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f2417c + i3;
        this.f2417c = i4;
        int i5 = (i - (i3 * 8)) + this.f2418d;
        this.f2418d = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f2417c = i4 + 1;
            this.f2418d = i5 - 8;
        }
        int i6 = this.f2417c;
        if (i6 < 0 || (i6 >= (i2 = this.f2416b) && (i6 != i2 || this.f2418d != 0))) {
            z = false;
        }
        c.c.a.a.x1.p.g(z);
    }
}
