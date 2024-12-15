package c.c.a.a.z1;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3718a;

    /* renamed from: b, reason: collision with root package name */
    public int f3719b;

    /* renamed from: c, reason: collision with root package name */
    public int f3720c;

    /* renamed from: d, reason: collision with root package name */
    public int f3721d = 0;

    public a0(byte[] bArr, int i, int i2) {
        this.f3718a = bArr;
        this.f3720c = i;
        this.f3719b = i2;
        a();
    }

    public final void a() {
        int i;
        int i2 = this.f3720c;
        c.c.a.a.x1.p.g(i2 >= 0 && (i2 < (i = this.f3719b) || (i2 == i && this.f3721d == 0)));
    }

    public boolean b(int i) {
        int i2 = this.f3720c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f3721d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f3719b) {
                break;
            }
            if (h(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f3719b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    public boolean c() {
        int i = this.f3720c;
        int i2 = this.f3721d;
        int i3 = 0;
        while (this.f3720c < this.f3719b && !d()) {
            i3++;
        }
        boolean z = this.f3720c == this.f3719b;
        this.f3720c = i;
        this.f3721d = i2;
        return !z && b((i3 * 2) + 1);
    }

    public boolean d() {
        boolean z = (this.f3718a[this.f3720c] & (128 >> this.f3721d)) != 0;
        i();
        return z;
    }

    public int e(int i) {
        int i2;
        this.f3721d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f3721d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f3721d = i4;
            byte[] bArr = this.f3718a;
            int i5 = this.f3720c;
            i3 |= (bArr[i5] & 255) << i4;
            if (!h(i5 + 1)) {
                r3 = 1;
            }
            this.f3720c = i5 + r3;
        }
        byte[] bArr2 = this.f3718a;
        int i6 = this.f3720c;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f3721d = 0;
            this.f3720c = i6 + (h(i6 + 1) ? 2 : 1);
        }
        a();
        return i7;
    }

    public final int f() {
        int i = 0;
        while (!d()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? e(i) : 0);
    }

    public int g() {
        int f2 = f();
        return ((f2 + 1) / 2) * (f2 % 2 == 0 ? -1 : 1);
    }

    public final boolean h(int i) {
        if (2 <= i && i < this.f3719b) {
            byte[] bArr = this.f3718a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        int i = this.f3721d + 1;
        this.f3721d = i;
        if (i == 8) {
            this.f3721d = 0;
            int i2 = this.f3720c;
            this.f3720c = i2 + (h(i2 + 1) ? 2 : 1);
        }
        a();
    }

    public void j(int i) {
        int i2 = this.f3720c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f3720c = i4;
        int i5 = (i - (i3 * 8)) + this.f3721d;
        this.f3721d = i5;
        if (i5 > 7) {
            this.f3720c = i4 + 1;
            this.f3721d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f3720c) {
                a();
                return;
            } else if (h(i2)) {
                this.f3720c++;
                i2 += 2;
            }
        }
    }
}
