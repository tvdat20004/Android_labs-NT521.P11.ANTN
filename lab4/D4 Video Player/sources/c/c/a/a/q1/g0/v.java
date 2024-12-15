package c.c.a.a.q1.g0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f2609a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2610b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2611c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f2612d;

    /* renamed from: e, reason: collision with root package name */
    public int f2613e;

    public v(int i, int i2) {
        this.f2609a = i;
        byte[] bArr = new byte[i2 + 3];
        this.f2612d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.f2610b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f2612d;
            int length = bArr2.length;
            int i4 = this.f2613e;
            if (length < i4 + i3) {
                this.f2612d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f2612d, this.f2613e, i3);
            this.f2613e += i3;
        }
    }

    public boolean b(int i) {
        if (!this.f2610b) {
            return false;
        }
        this.f2613e -= i;
        this.f2610b = false;
        this.f2611c = true;
        return true;
    }

    public void c() {
        this.f2610b = false;
        this.f2611c = false;
    }

    public void d(int i) {
        c.c.a.a.x1.p.g(!this.f2610b);
        boolean z = i == this.f2609a;
        this.f2610b = z;
        if (z) {
            this.f2613e = 3;
            this.f2611c = false;
        }
    }
}
