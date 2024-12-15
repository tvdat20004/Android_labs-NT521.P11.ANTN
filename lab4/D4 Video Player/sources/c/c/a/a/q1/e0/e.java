package c.c.a.a.q1.e0;

import c.c.a.a.l0;
import c.c.a.a.z1.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends n {
    public c.c.a.a.z1.q n;
    public d o;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // c.c.a.a.q1.e0.n
    public long d(z zVar) {
        int i;
        int i2;
        int i3;
        byte[] bArr = zVar.f3800a;
        int i4 = -1;
        if (!(bArr[0] == -1)) {
            return -1L;
        }
        int i5 = (bArr[2] & 255) >> 4;
        switch (i5) {
            case 1:
                i4 = 192;
                return i4;
            case 2:
            case 3:
            case 4:
            case 5:
                i = 576;
                i2 = i5 - 2;
                i4 = i << i2;
                return i4;
            case 6:
            case 7:
                zVar.B(4);
                long j = zVar.f3800a[zVar.f3801b];
                int i6 = 7;
                while (true) {
                    if (i6 >= 0) {
                        if (((1 << i6) & j) != 0) {
                            i6--;
                        } else if (i6 < 6) {
                            j &= r8 - 1;
                            i3 = 7 - i6;
                        } else if (i6 == 7) {
                            i3 = 1;
                        }
                    }
                }
                i3 = 0;
                if (i3 == 0) {
                    throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
                }
                for (int i7 = 1; i7 < i3; i7++) {
                    if ((zVar.f3800a[zVar.f3801b + i7] & 192) != 128) {
                        throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                    }
                    j = (j << 6) | (r8 & 63);
                }
                zVar.f3801b += i3;
                int p = i5 == 6 ? zVar.p() : zVar.u();
                zVar.A(0);
                i4 = p + 1;
                return i4;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = 256;
                i2 = i5 - 8;
                i4 = i << i2;
                return i4;
            default:
                return i4;
        }
    }

    @Override // c.c.a.a.q1.e0.n
    public boolean e(z zVar, long j, l lVar) {
        byte[] bArr = zVar.f3800a;
        if (this.n == null) {
            this.n = new c.c.a.a.z1.q(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, zVar.f3802c);
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            c.c.a.a.z1.q qVar = this.n;
            int i = qVar.f3778c;
            int i2 = qVar.f3776a;
            lVar.f2407a = l0.r(null, "audio/flac", null, -1, i * i2, qVar.f3777b, i2, singletonList, null, 0, null);
        } else {
            if ((bArr[0] & Byte.MAX_VALUE) == 3) {
                d dVar = new d(this);
                this.o = dVar;
                zVar.B(1);
                int r = zVar.r() / 18;
                dVar.f2388a = new long[r];
                dVar.f2389b = new long[r];
                for (int i3 = 0; i3 < r; i3++) {
                    dVar.f2388a[i3] = zVar.j();
                    dVar.f2389b[i3] = zVar.j();
                    zVar.B(2);
                }
            } else if (bArr[0] == -1) {
                d dVar2 = this.o;
                if (dVar2 != null) {
                    dVar2.f2390c = j;
                    lVar.f2408b = dVar2;
                }
                return false;
            }
        }
        return true;
    }

    @Override // c.c.a.a.q1.e0.n
    public void f(boolean z) {
        super.f(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
