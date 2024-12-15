package b.r.b;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public long f1601a = 0;

    /* renamed from: b, reason: collision with root package name */
    public b f1602b;

    public void a(int i) {
        if (i < 64) {
            this.f1601a &= ~(1 << i);
            return;
        }
        b bVar = this.f1602b;
        if (bVar != null) {
            bVar.a(i - 64);
        }
    }

    public int b(int i) {
        long j;
        b bVar = this.f1602b;
        if (bVar == null) {
            if (i >= 64) {
                j = this.f1601a;
                return Long.bitCount(j);
            }
        } else if (i >= 64) {
            return Long.bitCount(this.f1601a) + bVar.b(i - 64);
        }
        j = this.f1601a & ((1 << i) - 1);
        return Long.bitCount(j);
    }

    public final void c() {
        if (this.f1602b == null) {
            this.f1602b = new b();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f1601a & (1 << i)) != 0;
        }
        c();
        return this.f1602b.d(i - 64);
    }

    public void e(int i, boolean z) {
        if (i >= 64) {
            c();
            this.f1602b.e(i - 64, z);
            return;
        }
        long j = this.f1601a;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f1601a = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            h(i);
        } else {
            a(i);
        }
        if (z2 || this.f1602b != null) {
            c();
            this.f1602b.e(0, z2);
        }
    }

    public boolean f(int i) {
        if (i >= 64) {
            c();
            return this.f1602b.f(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f1601a;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f1601a = j3;
        long j4 = j - 1;
        this.f1601a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        b bVar = this.f1602b;
        if (bVar != null) {
            if (bVar.d(0)) {
                h(63);
            }
            this.f1602b.f(0);
        }
        return z;
    }

    public void g() {
        this.f1601a = 0L;
        b bVar = this.f1602b;
        if (bVar != null) {
            bVar.g();
        }
    }

    public void h(int i) {
        if (i < 64) {
            this.f1601a |= 1 << i;
        } else {
            c();
            this.f1602b.h(i - 64);
        }
    }

    public String toString() {
        if (this.f1602b == null) {
            return Long.toBinaryString(this.f1601a);
        }
        return this.f1602b.toString() + "xx" + Long.toBinaryString(this.f1601a);
    }
}
