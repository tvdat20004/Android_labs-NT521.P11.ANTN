package c.c.a.a.q1;

import c.c.a.a.z1.l0;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.y1.n f2648b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2649c;

    /* renamed from: d, reason: collision with root package name */
    public long f2650d;

    /* renamed from: f, reason: collision with root package name */
    public int f2652f;
    public int g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f2651e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2647a = new byte[4096];

    public j(c.c.a.a.y1.n nVar, long j, long j2) {
        this.f2648b = nVar;
        this.f2650d = j;
        this.f2649c = j2;
    }

    public boolean a(int i, boolean z) {
        int i2 = this.f2652f + i;
        byte[] bArr = this.f2651e;
        if (i2 > bArr.length) {
            this.f2651e = Arrays.copyOf(this.f2651e, l0.f(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
        int i3 = this.g - this.f2652f;
        while (i3 < i) {
            i3 = f(this.f2651e, this.f2652f, i, i3, z);
            if (i3 == -1) {
                return false;
            }
            this.g = this.f2652f + i3;
        }
        this.f2652f += i;
        return true;
    }

    public final void b(int i) {
        if (i != -1) {
            this.f2650d += i;
        }
    }

    public long c() {
        return this.f2650d + this.f2652f;
    }

    public boolean d(byte[] bArr, int i, int i2, boolean z) {
        if (!a(i2, z)) {
            return false;
        }
        System.arraycopy(this.f2651e, this.f2652f - i2, bArr, i, i2);
        return true;
    }

    public int e(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.f2651e, 0, bArr, i, min);
            i(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = f(bArr, i, i2, 0, true);
        }
        b(i4);
        return i4;
    }

    public final int f(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int e2 = this.f2648b.e(bArr, i + i3, i2 - i3);
        if (e2 != -1) {
            return i3 + e2;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public boolean g(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.g;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.f2651e, 0, bArr, i, min);
            i(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = f(bArr, i, i2, i4, z);
        }
        b(i4);
        return i4 != -1;
    }

    public void h(int i) {
        int min = Math.min(this.g, i);
        i(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = f(this.f2647a, -i2, Math.min(i, this.f2647a.length + i2), i2, false);
        }
        b(i2);
    }

    public final void i(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f2652f = 0;
        byte[] bArr = this.f2651e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f2651e = bArr2;
    }
}
