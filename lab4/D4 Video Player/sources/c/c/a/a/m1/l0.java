package c.c.a.a.m1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class l0 extends c0 {
    public static final int h = Float.floatToIntBits(Float.NaN);

    public static void p(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (floatToIntBits == h) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // c.c.a.a.m1.r
    public boolean c() {
        return c.c.a.a.z1.l0.u(this.f2075d);
    }

    @Override // c.c.a.a.m1.r
    public boolean e(int i, int i2, int i3) {
        if (c.c.a.a.z1.l0.u(i3)) {
            return o(i, i2, i3);
        }
        throw new q(i, i2, i3);
    }

    @Override // c.c.a.a.m1.c0, c.c.a.a.m1.r
    public int g() {
        return 4;
    }

    @Override // c.c.a.a.m1.r
    public void h(ByteBuffer byteBuffer) {
        boolean z = this.f2075d == 1073741824;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (!z) {
            i = (i / 3) * 4;
        }
        ByteBuffer n = n(i);
        if (z) {
            while (position < limit) {
                p((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), n);
                position += 4;
            }
        } else {
            while (position < limit) {
                p(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), n);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        n.flip();
    }
}
