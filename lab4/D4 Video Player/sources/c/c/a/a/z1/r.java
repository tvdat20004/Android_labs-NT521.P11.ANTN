package c.c.a.a.z1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f3780a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f3781b = new long[32];

    public void a(long j) {
        int i = this.f3780a;
        long[] jArr = this.f3781b;
        if (i == jArr.length) {
            this.f3781b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f3781b;
        int i2 = this.f3780a;
        this.f3780a = i2 + 1;
        jArr2[i2] = j;
    }

    public long b(int i) {
        if (i >= 0 && i < this.f3780a) {
            return this.f3781b[i];
        }
        StringBuilder k = c.a.a.a.a.k("Invalid index ", i, ", size is ");
        k.append(this.f3780a);
        throw new IndexOutOfBoundsException(k.toString());
    }
}
