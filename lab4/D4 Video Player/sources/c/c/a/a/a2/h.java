package c.c.a.a.a2;

import c.c.a.a.s0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f1932a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1933b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1934c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1935d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1936e;

    public h(List<byte[]> list, int i, int i2, int i3, float f2) {
        this.f1932a = list;
        this.f1933b = i;
        this.f1934c = i2;
        this.f1935d = i3;
        this.f1936e = f2;
    }

    public static byte[] a(c.c.a.a.z1.z zVar) {
        int u = zVar.u();
        int i = zVar.f3801b;
        zVar.B(u);
        byte[] bArr = zVar.f3800a;
        byte[] bArr2 = c.c.a.a.z1.h.f3745a;
        byte[] bArr3 = new byte[bArr2.length + u];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, u);
        return bArr3;
    }

    public static h b(c.c.a.a.z1.z zVar) {
        float f2;
        int i;
        int i2;
        try {
            zVar.B(4);
            int p = (zVar.p() & 3) + 1;
            if (p == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int p2 = zVar.p() & 31;
            for (int i3 = 0; i3 < p2; i3++) {
                arrayList.add(a(zVar));
            }
            int p3 = zVar.p();
            for (int i4 = 0; i4 < p3; i4++) {
                arrayList.add(a(zVar));
            }
            if (p2 > 0) {
                c.c.a.a.z1.w d2 = c.c.a.a.z1.x.d((byte[]) arrayList.get(0), p, ((byte[]) arrayList.get(0)).length);
                int i5 = d2.f3790e;
                int i6 = d2.f3791f;
                f2 = d2.g;
                i = i5;
                i2 = i6;
            } else {
                f2 = 1.0f;
                i = -1;
                i2 = -1;
            }
            return new h(arrayList, p, i, i2, f2);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new s0("Error parsing AVC config", e2);
        }
    }
}
