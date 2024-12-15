package c.c.a.a.q1.b0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f2265d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2266a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f2267b;

    /* renamed from: c, reason: collision with root package name */
    public int f2268c;

    public static long a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f2265d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static int b(int i) {
        long j;
        int i2 = 0;
        do {
            long[] jArr = f2265d;
            if (i2 >= jArr.length) {
                return -1;
            }
            j = jArr[i2] & i;
            i2++;
        } while (j == 0);
        return i2;
    }

    public long c(c.c.a.a.q1.j jVar, boolean z, boolean z2, int i) {
        if (this.f2267b == 0) {
            if (!jVar.g(this.f2266a, 0, 1, z)) {
                return -1L;
            }
            int b2 = b(this.f2266a[0] & 255);
            this.f2268c = b2;
            if (b2 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f2267b = 1;
        }
        int i2 = this.f2268c;
        if (i2 > i) {
            this.f2267b = 0;
            return -2L;
        }
        if (i2 != 1) {
            jVar.g(this.f2266a, 1, i2 - 1, false);
        }
        this.f2267b = 0;
        return a(this.f2266a, this.f2268c, z2);
    }
}
