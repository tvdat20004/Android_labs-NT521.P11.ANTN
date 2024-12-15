package c.c.a.a.q1.e0;

import c.c.a.a.z1.l0;
import c.c.a.a.z1.z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends n {
    public static final int o = l0.l("Opus");
    public static final byte[] p = {79, 112, 117, 115, 72, 101, 97, 100};
    public boolean n;

    @Override // c.c.a.a.q1.e0.n
    public long d(z zVar) {
        byte[] bArr = zVar.f3800a;
        int i = bArr[0] & 255;
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1 && i2 != 2) {
            i3 = bArr[1] & 63;
        }
        int i4 = i >> 3;
        return b(i3 * (i4 >= 16 ? 2500 << r1 : i4 >= 12 ? 10000 << (r1 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r1));
    }

    @Override // c.c.a.a.q1.e0.n
    public boolean e(z zVar, long j, l lVar) {
        if (this.n) {
            boolean z = zVar.d() == o;
            zVar.A(0);
            return z;
        }
        byte[] copyOf = Arrays.copyOf(zVar.f3800a, zVar.f3802c);
        int i = copyOf[9] & 255;
        int i2 = ((copyOf[11] & 255) << 8) | (copyOf[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(copyOf);
        g(arrayList, i2);
        g(arrayList, 3840);
        lVar.f2407a = c.c.a.a.l0.r(null, "audio/opus", null, -1, -1, i, 48000, arrayList, null, 0, null);
        this.n = true;
        return true;
    }

    @Override // c.c.a.a.q1.e0.n
    public void f(boolean z) {
        super.f(z);
        if (z) {
            this.n = false;
        }
    }

    public final void g(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i * 1000000000) / 48000).array());
    }
}
