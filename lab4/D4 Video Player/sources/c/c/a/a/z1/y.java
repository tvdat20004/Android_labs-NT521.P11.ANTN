package c.c.a.a.z1;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3796a;

    /* renamed from: b, reason: collision with root package name */
    public int f3797b;

    /* renamed from: c, reason: collision with root package name */
    public int f3798c;

    /* renamed from: d, reason: collision with root package name */
    public int f3799d;

    public y() {
        this.f3796a = l0.f3766f;
    }

    public y(byte[] bArr) {
        int length = bArr.length;
        this.f3796a = bArr;
        this.f3799d = length;
    }

    public y(byte[] bArr, int i) {
        this.f3796a = bArr;
        this.f3799d = i;
    }

    public final void a() {
        int i;
        int i2 = this.f3797b;
        c.c.a.a.x1.p.g(i2 >= 0 && (i2 < (i = this.f3799d) || (i2 == i && this.f3798c == 0)));
    }

    public int b() {
        return ((this.f3799d - this.f3797b) * 8) - this.f3798c;
    }

    public void c() {
        if (this.f3798c == 0) {
            return;
        }
        this.f3798c = 0;
        this.f3797b++;
        a();
    }

    public int d() {
        return (this.f3797b * 8) + this.f3798c;
    }

    public boolean e() {
        boolean z = (this.f3796a[this.f3797b] & (128 >> this.f3798c)) != 0;
        k();
        return z;
    }

    public int f(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f3798c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f3798c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f3798c = i4;
            byte[] bArr = this.f3796a;
            int i5 = this.f3797b;
            this.f3797b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f3796a;
        int i6 = this.f3797b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f3798c = 0;
            this.f3797b = i6 + 1;
        }
        a();
        return i7;
    }

    public void g(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f3796a;
            int i4 = this.f3797b;
            int i5 = i4 + 1;
            this.f3797b = i5;
            byte b2 = bArr2[i4];
            int i6 = this.f3798c;
            bArr[i] = (byte) (b2 << i6);
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i]);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        bArr[i3] = (byte) (bArr[i3] & (255 >> i7));
        int i8 = this.f3798c;
        if (i8 + i7 > 8) {
            int i9 = bArr[i3];
            byte[] bArr3 = this.f3796a;
            int i10 = this.f3797b;
            this.f3797b = i10 + 1;
            bArr[i3] = (byte) (i9 | ((bArr3[i10] & 255) << i8));
            this.f3798c = i8 - 8;
        }
        int i11 = this.f3798c + i7;
        this.f3798c = i11;
        byte[] bArr4 = this.f3796a;
        int i12 = this.f3797b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i7))) | bArr[i3]);
        if (i11 == 8) {
            this.f3798c = 0;
            this.f3797b = i12 + 1;
        }
        a();
    }

    public void h(byte[] bArr, int i, int i2) {
        c.c.a.a.x1.p.g(this.f3798c == 0);
        System.arraycopy(this.f3796a, this.f3797b, bArr, i, i2);
        this.f3797b += i2;
        a();
    }

    public void i(byte[] bArr, int i) {
        this.f3796a = bArr;
        this.f3797b = 0;
        this.f3798c = 0;
        this.f3799d = i;
    }

    public void j(int i) {
        int i2 = i / 8;
        this.f3797b = i2;
        this.f3798c = i - (i2 * 8);
        a();
    }

    public void k() {
        int i = this.f3798c + 1;
        this.f3798c = i;
        if (i == 8) {
            this.f3798c = 0;
            this.f3797b++;
        }
        a();
    }

    public void l(int i) {
        int i2 = i / 8;
        int i3 = this.f3797b + i2;
        this.f3797b = i3;
        int i4 = (i - (i2 * 8)) + this.f3798c;
        this.f3798c = i4;
        if (i4 > 7) {
            this.f3797b = i3 + 1;
            this.f3798c = i4 - 8;
        }
        a();
    }
}
