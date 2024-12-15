package c.c.a.a.a2;

import c.c.a.a.s0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f1953a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1954b;

    public o(List<byte[]> list, int i) {
        this.f1953a = list;
        this.f1954b = i;
    }

    public static o a(c.c.a.a.z1.z zVar) {
        try {
            zVar.B(21);
            int p = zVar.p() & 3;
            int p2 = zVar.p();
            int i = zVar.f3801b;
            int i2 = 0;
            for (int i3 = 0; i3 < p2; i3++) {
                zVar.B(1);
                int u = zVar.u();
                for (int i4 = 0; i4 < u; i4++) {
                    int u2 = zVar.u();
                    i2 += u2 + 4;
                    zVar.B(u2);
                }
            }
            zVar.A(i);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < p2; i6++) {
                zVar.B(1);
                int u3 = zVar.u();
                for (int i7 = 0; i7 < u3; i7++) {
                    int u4 = zVar.u();
                    byte[] bArr2 = c.c.a.a.z1.x.f3792a;
                    System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                    int length = i5 + bArr2.length;
                    System.arraycopy(zVar.f3800a, zVar.f3801b, bArr, length, u4);
                    i5 = length + u4;
                    zVar.B(u4);
                }
            }
            return new o(i2 == 0 ? null : Collections.singletonList(bArr), p + 1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new s0("Error parsing HEVC config", e2);
        }
    }
}
