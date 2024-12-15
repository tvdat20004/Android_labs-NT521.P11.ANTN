package c.c.a.a.q1.g0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f2524e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f2525a;

    /* renamed from: b, reason: collision with root package name */
    public int f2526b;

    /* renamed from: c, reason: collision with root package name */
    public int f2527c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f2528d;

    public k(int i) {
        this.f2528d = new byte[i];
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.f2525a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f2528d;
            int length = bArr2.length;
            int i4 = this.f2526b;
            if (length < i4 + i3) {
                this.f2528d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f2528d, this.f2526b, i3);
            this.f2526b += i3;
        }
    }
}
