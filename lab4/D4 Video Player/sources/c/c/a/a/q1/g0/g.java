package c.c.a.a.q1.g0;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f2498a;

    /* renamed from: b, reason: collision with root package name */
    public final List<c.c.a.a.l0> f2499b;

    public g(int i) {
        List<c.c.a.a.l0> singletonList = Collections.singletonList(c.c.a.a.l0.y(null, "application/cea-608", 0, null, null));
        this.f2498a = i;
        this.f2499b = singletonList;
    }

    public g(int i, List<c.c.a.a.l0> list) {
        this.f2498a = i;
        this.f2499b = list;
    }

    public q0 a(int i, o0 o0Var) {
        if (i == 2) {
            return new w(new l(new r0(b(o0Var))));
        }
        if (i == 3 || i == 4) {
            return new w(new u(o0Var.f2563b));
        }
        if (i == 15) {
            if (c(2)) {
                return null;
            }
            return new w(new f(false, o0Var.f2563b));
        }
        if (i == 17) {
            if (c(2)) {
                return null;
            }
            return new w(new t(o0Var.f2563b));
        }
        if (i == 21) {
            return new w(new s());
        }
        if (i == 27) {
            if (c(4)) {
                return null;
            }
            return new w(new p(new f0(b(o0Var)), c(1), c(8)));
        }
        if (i == 36) {
            return new w(new r(new f0(b(o0Var))));
        }
        if (i == 89) {
            return new w(new i(o0Var.f2564c));
        }
        if (i != 138) {
            if (i == 172) {
                return new w(new d(o0Var.f2563b));
            }
            if (i != 129) {
                if (i != 130) {
                    if (i == 134) {
                        if (c(16)) {
                            return null;
                        }
                        return new e0(new g0());
                    }
                    if (i != 135) {
                        return null;
                    }
                } else if (!c(64)) {
                    return null;
                }
            }
            return new w(new b(o0Var.f2563b));
        }
        return new w(new h(o0Var.f2563b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final List<c.c.a.a.l0> b(o0 o0Var) {
        String str;
        int i;
        if (c(32)) {
            return this.f2499b;
        }
        byte[] bArr = o0Var.f2565d;
        int length = bArr.length;
        int i2 = 0;
        ArrayList arrayList = this.f2499b;
        while (length - i2 > 0) {
            int i3 = i2 + 1;
            int i4 = bArr[i2] & 255;
            int i5 = i3 + 1;
            int i6 = (bArr[i3] & 255) + i5;
            boolean z = true;
            if (i4 == 134) {
                arrayList = new ArrayList();
                int i7 = i5 + 1;
                int i8 = bArr[i5] & 255 & 31;
                for (int i9 = 0; i9 < i8; i9++) {
                    String str2 = new String(bArr, i7, 3, Charset.forName("UTF-8"));
                    int i10 = i7 + 3;
                    int i11 = i10 + 1;
                    int i12 = bArr[i10] & 255;
                    boolean z2 = (i12 & 128) != 0;
                    if (z2) {
                        i = i12 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    int i13 = i11 + 1;
                    byte b2 = (byte) (bArr[i11] & 255);
                    i7 = i13 + 1;
                    c.c.a.a.x1.p.c(i7 >= 0 && i7 <= length);
                    arrayList.add(c.c.a.a.l0.z(null, str, null, -1, 0, str2, i, null, Long.MAX_VALUE, z2 ? Collections.singletonList(new byte[]{(byte) ((b2 & 64) != 0 ? 1 : 0)}) : null));
                }
            }
            if (i6 < 0 || i6 > length) {
                z = false;
            }
            c.c.a.a.x1.p.c(z);
            i2 = i6;
            arrayList = arrayList;
        }
        return arrayList;
    }

    public final boolean c(int i) {
        return (i & this.f2498a) != 0;
    }
}
