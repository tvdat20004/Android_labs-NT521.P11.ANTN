package c.c.a.a.m1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s0 implements r {
    public int g;
    public boolean h;
    public r0 i;
    public ByteBuffer j;
    public ShortBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    /* renamed from: d, reason: collision with root package name */
    public float f2144d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f2145e = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f2142b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f2143c = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f2146f = -1;

    public s0() {
        ByteBuffer byteBuffer = r.f2133a;
        this.j = byteBuffer;
        this.k = byteBuffer.asShortBuffer();
        this.l = byteBuffer;
        this.g = -1;
    }

    @Override // c.c.a.a.m1.r
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.l;
        this.l = r.f2133a;
        return byteBuffer;
    }

    @Override // c.c.a.a.m1.r
    public void b() {
        int i;
        r0 r0Var = this.i;
        if (r0Var != null) {
            int i2 = r0Var.k;
            float f2 = r0Var.f2136c;
            float f3 = r0Var.f2137d;
            int i3 = r0Var.m + ((int) ((((i2 / (f2 / f3)) + r0Var.o) / (r0Var.f2138e * f3)) + 0.5f));
            r0Var.j = r0Var.c(r0Var.j, i2, (r0Var.h * 2) + i2);
            int i4 = 0;
            while (true) {
                i = r0Var.h * 2;
                int i5 = r0Var.f2135b;
                if (i4 >= i * i5) {
                    break;
                }
                r0Var.j[(i5 * i2) + i4] = 0;
                i4++;
            }
            r0Var.k = i + r0Var.k;
            r0Var.f();
            if (r0Var.m > i3) {
                r0Var.m = i3;
            }
            r0Var.k = 0;
            r0Var.r = 0;
            r0Var.o = 0;
        }
        this.o = true;
    }

    @Override // c.c.a.a.m1.r
    public boolean c() {
        return this.f2143c != -1 && (Math.abs(this.f2144d - 1.0f) >= 0.01f || Math.abs(this.f2145e - 1.0f) >= 0.01f || this.f2146f != this.f2143c);
    }

    @Override // c.c.a.a.m1.r
    public boolean d() {
        r0 r0Var;
        return this.o && ((r0Var = this.i) == null || (r0Var.m * r0Var.f2135b) * 2 == 0);
    }

    @Override // c.c.a.a.m1.r
    public boolean e(int i, int i2, int i3) {
        if (i3 != 2) {
            throw new q(i, i2, i3);
        }
        int i4 = this.g;
        if (i4 == -1) {
            i4 = i;
        }
        if (this.f2143c == i && this.f2142b == i2 && this.f2146f == i4) {
            return false;
        }
        this.f2143c = i;
        this.f2142b = i2;
        this.f2146f = i4;
        this.h = true;
        return true;
    }

    @Override // c.c.a.a.m1.r
    public int f() {
        return this.f2146f;
    }

    @Override // c.c.a.a.m1.r
    public void flush() {
        if (c()) {
            if (this.h) {
                this.i = new r0(this.f2143c, this.f2142b, this.f2144d, this.f2145e, this.f2146f);
            } else {
                r0 r0Var = this.i;
                if (r0Var != null) {
                    r0Var.k = 0;
                    r0Var.m = 0;
                    r0Var.o = 0;
                    r0Var.p = 0;
                    r0Var.q = 0;
                    r0Var.r = 0;
                    r0Var.s = 0;
                    r0Var.t = 0;
                    r0Var.u = 0;
                    r0Var.v = 0;
                }
            }
        }
        this.l = r.f2133a;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override // c.c.a.a.m1.r
    public int g() {
        return 2;
    }

    @Override // c.c.a.a.m1.r
    public void h(ByteBuffer byteBuffer) {
        r0 r0Var = this.i;
        Objects.requireNonNull(r0Var);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.m += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = r0Var.f2135b;
            int i2 = remaining2 / i;
            short[] c2 = r0Var.c(r0Var.j, r0Var.k, i2);
            r0Var.j = c2;
            asShortBuffer.get(c2, r0Var.k * r0Var.f2135b, ((i * i2) * 2) / 2);
            r0Var.k += i2;
            r0Var.f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i3 = r0Var.m * r0Var.f2135b * 2;
        if (i3 > 0) {
            if (this.j.capacity() < i3) {
                ByteBuffer order = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                this.j = order;
                this.k = order.asShortBuffer();
            } else {
                this.j.clear();
                this.k.clear();
            }
            ShortBuffer shortBuffer = this.k;
            int min = Math.min(shortBuffer.remaining() / r0Var.f2135b, r0Var.m);
            shortBuffer.put(r0Var.l, 0, r0Var.f2135b * min);
            int i4 = r0Var.m - min;
            r0Var.m = i4;
            short[] sArr = r0Var.l;
            int i5 = r0Var.f2135b;
            System.arraycopy(sArr, min * i5, sArr, 0, i4 * i5);
            this.n += i3;
            this.j.limit(i3);
            this.l = this.j;
        }
    }

    @Override // c.c.a.a.m1.r
    public int i() {
        return this.f2142b;
    }

    @Override // c.c.a.a.m1.r
    public void j() {
        this.f2144d = 1.0f;
        this.f2145e = 1.0f;
        this.f2142b = -1;
        this.f2143c = -1;
        this.f2146f = -1;
        ByteBuffer byteBuffer = r.f2133a;
        this.j = byteBuffer;
        this.k = byteBuffer.asShortBuffer();
        this.l = byteBuffer;
        this.g = -1;
        this.h = false;
        this.i = null;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }
}
