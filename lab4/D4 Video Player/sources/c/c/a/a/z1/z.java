package c.c.a.a.z1;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3800a;

    /* renamed from: b, reason: collision with root package name */
    public int f3801b;

    /* renamed from: c, reason: collision with root package name */
    public int f3802c;

    public z() {
        this.f3800a = l0.f3766f;
    }

    public z(int i) {
        this.f3800a = new byte[i];
        this.f3802c = i;
    }

    public z(byte[] bArr) {
        this.f3800a = bArr;
        this.f3802c = bArr.length;
    }

    public z(byte[] bArr, int i) {
        this.f3800a = bArr;
        this.f3802c = i;
    }

    public void A(int i) {
        c.c.a.a.x1.p.c(i >= 0 && i <= this.f3802c);
        this.f3801b = i;
    }

    public void B(int i) {
        A(this.f3801b + i);
    }

    public int a() {
        return this.f3802c - this.f3801b;
    }

    public void b(y yVar, int i) {
        c(yVar.f3796a, 0, i);
        yVar.j(0);
    }

    public void c(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f3800a, this.f3801b, bArr, i, i2);
        this.f3801b += i2;
    }

    public int d() {
        byte[] bArr = this.f3800a;
        int i = this.f3801b;
        int i2 = i + 1;
        this.f3801b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i2 + 1;
        this.f3801b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 16);
        int i6 = i4 + 1;
        this.f3801b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f3801b = i6 + 1;
        return (bArr[i6] & 255) | i7;
    }

    public String e() {
        if (a() == 0) {
            return null;
        }
        int i = this.f3801b;
        while (i < this.f3802c && !l0.w(this.f3800a[i])) {
            i++;
        }
        int i2 = this.f3801b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f3800a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f3801b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f3800a;
        int i3 = this.f3801b;
        String i4 = l0.i(bArr2, i3, i - i3);
        this.f3801b = i;
        int i5 = this.f3802c;
        if (i == i5) {
            return i4;
        }
        byte[] bArr3 = this.f3800a;
        if (bArr3[i] == 13) {
            int i6 = i + 1;
            this.f3801b = i6;
            if (i6 == i5) {
                return i4;
            }
        }
        int i7 = this.f3801b;
        if (bArr3[i7] == 10) {
            this.f3801b = i7 + 1;
        }
        return i4;
    }

    public int f() {
        byte[] bArr = this.f3800a;
        int i = this.f3801b;
        int i2 = i + 1;
        this.f3801b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        this.f3801b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        int i6 = i4 + 1;
        this.f3801b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f3801b = i6 + 1;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public long g() {
        byte[] bArr = this.f3800a;
        int i = this.f3801b + 1;
        this.f3801b = i;
        long j = bArr[r1] & 255;
        int i2 = i + 1;
        this.f3801b = i2;
        int i3 = i2 + 1;
        this.f3801b = i3;
        long j2 = j | ((bArr[i] & 255) << 8) | ((bArr[i2] & 255) << 16);
        this.f3801b = i3 + 1;
        return j2 | ((bArr[i3] & 255) << 24);
    }

    public int h() {
        int f2 = f();
        if (f2 >= 0) {
            return f2;
        }
        throw new IllegalStateException(c.a.a.a.a.b("Top bit not zero: ", f2));
    }

    public int i() {
        byte[] bArr = this.f3800a;
        int i = this.f3801b;
        int i2 = i + 1;
        this.f3801b = i2;
        int i3 = bArr[i] & 255;
        this.f3801b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public long j() {
        byte[] bArr = this.f3800a;
        int i = this.f3801b + 1;
        this.f3801b = i;
        long j = (bArr[r1] & 255) << 56;
        int i2 = i + 1;
        this.f3801b = i2;
        int i3 = i2 + 1;
        this.f3801b = i3;
        long j2 = j | ((bArr[i] & 255) << 48) | ((bArr[i2] & 255) << 40);
        int i4 = i3 + 1;
        this.f3801b = i4;
        long j3 = j2 | ((bArr[i3] & 255) << 32);
        int i5 = i4 + 1;
        this.f3801b = i5;
        long j4 = j3 | ((bArr[i4] & 255) << 24);
        int i6 = i5 + 1;
        this.f3801b = i6;
        long j5 = j4 | ((bArr[i5] & 255) << 16);
        int i7 = i6 + 1;
        this.f3801b = i7;
        long j6 = j5 | ((bArr[i6] & 255) << 8);
        this.f3801b = i7 + 1;
        return j6 | (bArr[i7] & 255);
    }

    public String k() {
        if (a() == 0) {
            return null;
        }
        int i = this.f3801b;
        while (i < this.f3802c && this.f3800a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f3800a;
        int i2 = this.f3801b;
        String i3 = l0.i(bArr, i2, i - i2);
        this.f3801b = i;
        if (i < this.f3802c) {
            this.f3801b = i + 1;
        }
        return i3;
    }

    public String l(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f3801b;
        int i3 = (i2 + i) - 1;
        String i4 = l0.i(this.f3800a, i2, (i3 >= this.f3802c || this.f3800a[i3] != 0) ? i : i - 1);
        this.f3801b += i;
        return i4;
    }

    public String m(int i) {
        return n(i, Charset.forName("UTF-8"));
    }

    public String n(int i, Charset charset) {
        String str = new String(this.f3800a, this.f3801b, i, charset);
        this.f3801b += i;
        return str;
    }

    public int o() {
        return (p() << 21) | (p() << 14) | (p() << 7) | p();
    }

    public int p() {
        byte[] bArr = this.f3800a;
        int i = this.f3801b;
        this.f3801b = i + 1;
        return bArr[i] & 255;
    }

    public long q() {
        byte[] bArr = this.f3800a;
        int i = this.f3801b + 1;
        this.f3801b = i;
        long j = (bArr[r1] & 255) << 24;
        int i2 = i + 1;
        this.f3801b = i2;
        int i3 = i2 + 1;
        this.f3801b = i3;
        long j2 = j | ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.f3801b = i3 + 1;
        return j2 | (bArr[i3] & 255);
    }

    public int r() {
        byte[] bArr = this.f3800a;
        int i = this.f3801b;
        int i2 = i + 1;
        this.f3801b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i2 + 1;
        this.f3801b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        this.f3801b = i4 + 1;
        return (bArr[i4] & 255) | i5;
    }

    public int s() {
        int d2 = d();
        if (d2 >= 0) {
            return d2;
        }
        throw new IllegalStateException(c.a.a.a.a.b("Top bit not zero: ", d2));
    }

    public long t() {
        long j = j();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException("Top bit not zero: " + j);
    }

    public int u() {
        byte[] bArr = this.f3800a;
        int i = this.f3801b;
        int i2 = i + 1;
        this.f3801b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f3801b = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    public void v() {
        this.f3801b = 0;
        this.f3802c = 0;
    }

    public void w(int i) {
        byte[] bArr = this.f3800a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        y(bArr, i);
    }

    public void x(byte[] bArr) {
        int length = bArr.length;
        this.f3800a = bArr;
        this.f3802c = length;
        this.f3801b = 0;
    }

    public void y(byte[] bArr, int i) {
        this.f3800a = bArr;
        this.f3802c = i;
        this.f3801b = 0;
    }

    public void z(int i) {
        c.c.a.a.x1.p.c(i >= 0 && i <= this.f3800a.length);
        this.f3802c = i;
    }
}
