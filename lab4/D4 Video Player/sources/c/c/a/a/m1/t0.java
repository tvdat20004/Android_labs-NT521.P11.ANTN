package c.c.a.a.m1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class t0 extends c0 {
    public boolean h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public byte[] n = c.c.a.a.z1.l0.f3766f;
    public int o;
    public long p;

    @Override // c.c.a.a.m1.c0, c.c.a.a.m1.r
    public ByteBuffer a() {
        int i;
        if (super.d() && (i = this.o) > 0) {
            n(i).put(this.n, 0, this.o).flip();
            this.o = 0;
        }
        return super.a();
    }

    @Override // c.c.a.a.m1.r
    public boolean c() {
        return this.h;
    }

    @Override // c.c.a.a.m1.c0, c.c.a.a.m1.r
    public boolean d() {
        return super.d() && this.o == 0;
    }

    @Override // c.c.a.a.m1.r
    public boolean e(int i, int i2, int i3) {
        if (i3 != 2) {
            throw new q(i, i2, i3);
        }
        if (this.o > 0) {
            this.p += r1 / this.k;
        }
        int o = c.c.a.a.z1.l0.o(2, i2);
        this.k = o;
        int i4 = this.j;
        this.n = new byte[i4 * o];
        this.o = 0;
        int i5 = this.i;
        this.m = o * i5;
        boolean z = this.h;
        this.h = (i5 == 0 && i4 == 0) ? false : true;
        this.l = false;
        o(i, i2, i3);
        return z != this.h;
    }

    @Override // c.c.a.a.m1.r
    public void h(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        this.l = true;
        int min = Math.min(i, this.m);
        this.p += min / this.k;
        this.m -= min;
        byteBuffer.position(position + min);
        if (this.m > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.o + i2) - this.n.length;
        ByteBuffer n = n(length);
        int f2 = c.c.a.a.z1.l0.f(length, 0, this.o);
        n.put(this.n, 0, f2);
        int f3 = c.c.a.a.z1.l0.f(length - f2, 0, i2);
        byteBuffer.limit(byteBuffer.position() + f3);
        n.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - f3;
        int i4 = this.o - f2;
        this.o = i4;
        byte[] bArr = this.n;
        System.arraycopy(bArr, f2, bArr, 0, i4);
        byteBuffer.get(this.n, this.o, i3);
        this.o += i3;
        n.flip();
    }

    @Override // c.c.a.a.m1.c0
    public void k() {
        if (this.l) {
            this.m = 0;
        }
        this.o = 0;
    }

    @Override // c.c.a.a.m1.c0
    public void m() {
        this.n = c.c.a.a.z1.l0.f3766f;
    }
}
