package c.c.a.a.m1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q0 extends c0 {
    public int h;
    public boolean i;
    public byte[] j;
    public byte[] k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public long p;

    public q0() {
        byte[] bArr = c.c.a.a.z1.l0.f3766f;
        this.j = bArr;
        this.k = bArr;
    }

    @Override // c.c.a.a.m1.r
    public boolean c() {
        return (this.f2073b != -1) && this.i;
    }

    @Override // c.c.a.a.m1.r
    public boolean e(int i, int i2, int i3) {
        if (i3 != 2) {
            throw new q(i, i2, i3);
        }
        this.h = i2 * 2;
        return o(i, i2, i3);
    }

    @Override // c.c.a.a.m1.r
    public void h(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f2077f.hasRemaining()) {
            int i = this.l;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.j.length));
                int limit2 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.get(limit2)) > 4) {
                            int i2 = this.h;
                            position = ((limit2 / i2) * i2) + i2;
                            break;
                        }
                        limit2 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.l = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    n(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.o = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i == 1) {
                int limit3 = byteBuffer.limit();
                int p = p(byteBuffer);
                int position2 = p - byteBuffer.position();
                byte[] bArr = this.j;
                int length = bArr.length;
                int i3 = this.m;
                int i4 = length - i3;
                if (p >= limit3 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.j, this.m, min);
                    int i5 = this.m + min;
                    this.m = i5;
                    byte[] bArr2 = this.j;
                    if (i5 == bArr2.length) {
                        if (this.o) {
                            q(bArr2, this.n);
                            this.p += (this.m - (this.n * 2)) / this.h;
                        } else {
                            this.p += (i5 - this.n) / this.h;
                        }
                        r(byteBuffer, this.j, this.m);
                        this.m = 0;
                        this.l = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    q(bArr, i3);
                    this.m = 0;
                    this.l = 0;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int limit4 = byteBuffer.limit();
                int p2 = p(byteBuffer);
                byteBuffer.limit(p2);
                this.p += byteBuffer.remaining() / this.h;
                r(byteBuffer, this.k, this.n);
                if (p2 < limit4) {
                    q(this.k, this.n);
                    this.l = 0;
                    byteBuffer.limit(limit4);
                }
            }
        }
    }

    @Override // c.c.a.a.m1.c0
    public void k() {
        if (c()) {
            long j = this.f2073b;
            int i = this.h;
            int i2 = ((int) ((150000 * j) / 1000000)) * i;
            if (this.j.length != i2) {
                this.j = new byte[i2];
            }
            int i3 = ((int) ((j * 20000) / 1000000)) * i;
            this.n = i3;
            if (this.k.length != i3) {
                this.k = new byte[i3];
            }
        }
        this.l = 0;
        this.p = 0L;
        this.m = 0;
        this.o = false;
    }

    @Override // c.c.a.a.m1.c0
    public void l() {
        int i = this.m;
        if (i > 0) {
            q(this.j, i);
        }
        if (this.o) {
            return;
        }
        this.p += this.n / this.h;
    }

    @Override // c.c.a.a.m1.c0
    public void m() {
        this.i = false;
        this.n = 0;
        byte[] bArr = c.c.a.a.z1.l0.f3766f;
        this.j = bArr;
        this.k = bArr;
    }

    public final int p(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.get(position)) > 4) {
                int i = this.h;
                return (position / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    public final void q(byte[] bArr, int i) {
        n(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.o = true;
        }
    }

    public final void r(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.n);
        int i2 = this.n - min;
        System.arraycopy(bArr, i - i2, this.k, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.k, i2, min);
    }
}
