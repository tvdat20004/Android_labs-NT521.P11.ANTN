package c.c.a.a.z1;

import android.util.Pair;
import c.c.a.a.s0;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3745a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3746b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f3747c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static byte[] a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    public static int b(y yVar) {
        int f2 = yVar.f(4);
        if (f2 == 15) {
            return yVar.f(24);
        }
        c.c.a.a.x1.p.c(f2 < 13);
        return f3746b[f2];
    }

    public static boolean c(byte[] bArr, int i) {
        byte[] bArr2 = f3745a;
        if (bArr.length - i <= bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static Pair<Integer, Integer> d(y yVar, boolean z) {
        int f2 = yVar.f(5);
        if (f2 == 31) {
            f2 = yVar.f(6) + 32;
        }
        int b2 = b(yVar);
        int f3 = yVar.f(4);
        if (f2 == 5 || f2 == 29) {
            b2 = b(yVar);
            int f4 = yVar.f(5);
            if (f4 == 31) {
                f4 = yVar.f(6) + 32;
            }
            f2 = f4;
            if (f2 == 22) {
                f3 = yVar.f(4);
            }
        }
        if (z) {
            if (f2 != 1 && f2 != 2 && f2 != 3 && f2 != 4 && f2 != 6 && f2 != 7 && f2 != 17) {
                switch (f2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new s0(c.a.a.a.a.b("Unsupported audio object type: ", f2));
                }
            }
            yVar.l(1);
            if (yVar.e()) {
                yVar.l(14);
            }
            boolean e2 = yVar.e();
            if (f3 == 0) {
                throw new UnsupportedOperationException();
            }
            if (f2 == 6 || f2 == 20) {
                yVar.l(3);
            }
            if (e2) {
                if (f2 == 22) {
                    yVar.l(16);
                }
                if (f2 == 17 || f2 == 19 || f2 == 20 || f2 == 23) {
                    yVar.l(3);
                }
                yVar.l(1);
            }
            switch (f2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int f5 = yVar.f(2);
                    if (f5 == 2 || f5 == 3) {
                        throw new s0(c.a.a.a.a.b("Unsupported epConfig: ", f5));
                    }
            }
        }
        int i = f3747c[f3];
        c.c.a.a.x1.p.c(i != -1);
        return Pair.create(Integer.valueOf(b2), Integer.valueOf(i));
    }

    public static Pair<Integer, Integer> e(byte[] bArr) {
        return d(new y(bArr), false);
    }
}
