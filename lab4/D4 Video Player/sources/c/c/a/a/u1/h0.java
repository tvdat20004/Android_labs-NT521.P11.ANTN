package c.c.a.a.u1;

/* loaded from: classes.dex */
public final class h0 {
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean o;
    public c.c.a.a.l0 r;
    public int s;

    /* renamed from: a, reason: collision with root package name */
    public int f2877a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2878b = new int[1000];

    /* renamed from: c, reason: collision with root package name */
    public long[] f2879c = new long[1000];

    /* renamed from: f, reason: collision with root package name */
    public long[] f2882f = new long[1000];

    /* renamed from: e, reason: collision with root package name */
    public int[] f2881e = new int[1000];

    /* renamed from: d, reason: collision with root package name */
    public int[] f2880d = new int[1000];
    public c.c.a.a.q1.x[] g = new c.c.a.a.q1.x[1000];
    public c.c.a.a.l0[] h = new c.c.a.a.l0[1000];
    public long m = Long.MIN_VALUE;
    public long n = Long.MIN_VALUE;
    public boolean q = true;
    public boolean p = true;

    public final long a(int i) {
        this.m = Math.max(this.m, d(i));
        int i2 = this.i - i;
        this.i = i2;
        this.j += i;
        int i3 = this.k + i;
        this.k = i3;
        int i4 = this.f2877a;
        if (i3 >= i4) {
            this.k = i3 - i4;
        }
        int i5 = this.l - i;
        this.l = i5;
        if (i5 < 0) {
            this.l = 0;
        }
        if (i2 != 0) {
            return this.f2879c[this.k];
        }
        int i6 = this.k;
        if (i6 != 0) {
            i4 = i6;
        }
        return this.f2879c[i4 - 1] + this.f2880d[r2];
    }

    public long b(int i) {
        int i2 = this.j;
        int i3 = this.i;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        c.c.a.a.x1.p.c(i4 >= 0 && i4 <= i3 - this.l);
        int i5 = this.i - i4;
        this.i = i5;
        this.n = Math.max(this.m, d(i5));
        if (i4 == 0 && this.o) {
            z = true;
        }
        this.o = z;
        int i6 = this.i;
        if (i6 == 0) {
            return 0L;
        }
        return this.f2879c[e(i6 - 1)] + this.f2880d[r8];
    }

    public final int c(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2 && this.f2882f[i] <= j; i4++) {
            if (!z || (this.f2881e[i] & 1) != 0) {
                i3 = i4;
            }
            i++;
            if (i == this.f2877a) {
                i = 0;
            }
        }
        return i3;
    }

    public final long d(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int e2 = e(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f2882f[e2]);
            if ((this.f2881e[e2] & 1) != 0) {
                break;
            }
            e2--;
            if (e2 == -1) {
                e2 = this.f2877a - 1;
            }
        }
        return j;
    }

    public final int e(int i) {
        int i2 = this.k + i;
        int i3 = this.f2877a;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public synchronized boolean f() {
        return this.l != this.i;
    }
}
