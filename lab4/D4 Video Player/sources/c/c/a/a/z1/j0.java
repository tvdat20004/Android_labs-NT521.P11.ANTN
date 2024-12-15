package c.c.a.a.z1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j0<V> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f3754a = new long[10];

    /* renamed from: b, reason: collision with root package name */
    public V[] f3755b = (V[]) new Object[10];

    /* renamed from: c, reason: collision with root package name */
    public int f3756c;

    /* renamed from: d, reason: collision with root package name */
    public int f3757d;

    public synchronized void a(long j, V v) {
        if (this.f3757d > 0) {
            if (j <= this.f3754a[((this.f3756c + r0) - 1) % this.f3755b.length]) {
                b();
            }
        }
        c();
        int i = this.f3756c;
        int i2 = this.f3757d;
        V[] vArr = this.f3755b;
        int length = (i + i2) % vArr.length;
        this.f3754a[length] = j;
        vArr[length] = v;
        this.f3757d = i2 + 1;
    }

    public synchronized void b() {
        this.f3756c = 0;
        this.f3757d = 0;
        Arrays.fill(this.f3755b, (Object) null);
    }

    public final void c() {
        int length = this.f3755b.length;
        if (this.f3757d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) new Object[i];
        int i2 = this.f3756c;
        int i3 = length - i2;
        System.arraycopy(this.f3754a, i2, jArr, 0, i3);
        System.arraycopy(this.f3755b, this.f3756c, vArr, 0, i3);
        int i4 = this.f3756c;
        if (i4 > 0) {
            System.arraycopy(this.f3754a, 0, jArr, i3, i4);
            System.arraycopy(this.f3755b, 0, vArr, i3, this.f3756c);
        }
        this.f3754a = jArr;
        this.f3755b = vArr;
        this.f3756c = 0;
    }

    public final V d(long j, boolean z) {
        long j2 = Long.MAX_VALUE;
        V v = null;
        while (true) {
            int i = this.f3757d;
            if (i <= 0) {
                break;
            }
            long[] jArr = this.f3754a;
            int i2 = this.f3756c;
            long j3 = j - jArr[i2];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            V[] vArr = this.f3755b;
            v = vArr[i2];
            vArr[i2] = null;
            this.f3756c = (i2 + 1) % vArr.length;
            this.f3757d = i - 1;
            j2 = j3;
        }
        return v;
    }

    public synchronized V e(long j) {
        return d(j, true);
    }
}
