package c.c.a.a.m1;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d0 extends c0 {
    public int[] h;
    public boolean i;
    public int[] j;

    @Override // c.c.a.a.m1.r
    public boolean c() {
        return this.i;
    }

    @Override // c.c.a.a.m1.r
    public boolean e(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.h, this.j);
        int[] iArr = this.h;
        this.j = iArr;
        if (iArr == null) {
            this.i = false;
            return z;
        }
        if (i3 != 2) {
            throw new q(i, i2, i3);
        }
        if (!z && !o(i, i2, i3)) {
            return false;
        }
        this.i = i2 != iArr.length;
        int i4 = 0;
        while (i4 < iArr.length) {
            int i5 = iArr[i4];
            if (i5 >= i2) {
                throw new q(i, i2, i3);
            }
            this.i = (i5 != i4) | this.i;
            i4++;
        }
        return true;
    }

    @Override // c.c.a.a.m1.r
    public void h(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer n = n(((limit - position) / (this.f2074c * 2)) * iArr.length * 2);
        while (position < limit) {
            for (int i : iArr) {
                n.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f2074c * 2;
        }
        byteBuffer.position(limit);
        n.flip();
    }

    @Override // c.c.a.a.m1.c0, c.c.a.a.m1.r
    public int i() {
        int[] iArr = this.j;
        return iArr == null ? this.f2074c : iArr.length;
    }

    @Override // c.c.a.a.m1.c0
    public void m() {
        this.j = null;
        this.h = null;
        this.i = false;
    }
}
