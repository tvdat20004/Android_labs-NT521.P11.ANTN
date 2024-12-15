package c.c.a.a.y1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3657a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3658b;

    /* renamed from: c, reason: collision with root package name */
    public final d[] f3659c;

    /* renamed from: d, reason: collision with root package name */
    public int f3660d;

    /* renamed from: e, reason: collision with root package name */
    public int f3661e;

    /* renamed from: f, reason: collision with root package name */
    public int f3662f;
    public d[] g;

    public r(boolean z, int i) {
        c.c.a.a.x1.p.c(i > 0);
        c.c.a.a.x1.p.c(true);
        this.f3657a = z;
        this.f3658b = i;
        this.f3662f = 0;
        this.g = new d[100];
        this.f3659c = new d[1];
    }

    public synchronized void a(d[] dVarArr) {
        int i = this.f3662f;
        int length = dVarArr.length + i;
        d[] dVarArr2 = this.g;
        if (length >= dVarArr2.length) {
            this.g = (d[]) Arrays.copyOf(dVarArr2, Math.max(dVarArr2.length * 2, i + dVarArr.length));
        }
        for (d dVar : dVarArr) {
            d[] dVarArr3 = this.g;
            int i2 = this.f3662f;
            this.f3662f = i2 + 1;
            dVarArr3[i2] = dVar;
        }
        this.f3661e -= dVarArr.length;
        notifyAll();
    }

    public synchronized void b(int i) {
        boolean z = i < this.f3660d;
        this.f3660d = i;
        if (z) {
            c();
        }
    }

    public synchronized void c() {
        int max = Math.max(0, c.c.a.a.z1.l0.d(this.f3660d, this.f3658b) - this.f3661e);
        int i = this.f3662f;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.g, max, i, (Object) null);
        this.f3662f = max;
    }
}
