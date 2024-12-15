package c.c.a.a.v1.o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.y;

/* loaded from: classes.dex */
public final class j {
    public static final byte[] h = {0, 7, 8, 15};
    public static final byte[] i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3320a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f3321b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f3322c;

    /* renamed from: d, reason: collision with root package name */
    public final c f3323d;

    /* renamed from: e, reason: collision with root package name */
    public final b f3324e;

    /* renamed from: f, reason: collision with root package name */
    public final i f3325f;
    public Bitmap g;

    public j(int i2, int i3) {
        Paint paint = new Paint();
        this.f3320a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f3321b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f3322c = new Canvas();
        this.f3323d = new c(719, 575, 0, 719, 0, 575);
        this.f3324e = new b(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f3325f = new i(i2, i3);
    }

    public static byte[] a(int i2, int i3, y yVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) yVar.f(i3);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = d(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = d(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = d(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = d(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = d(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = d(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = d(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d9 A[LOOP:3: B:84:0x014f->B:94:0x01d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.v1.o.j.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static b f(y yVar, int i2) {
        int i3;
        int f2;
        int i4;
        int i5;
        int i6 = 8;
        int f3 = yVar.f(8);
        yVar.l(8);
        int i7 = i2 - 2;
        int i8 = 4;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] b2 = b();
        int[] c2 = c();
        while (i7 > 0) {
            int f4 = yVar.f(i6);
            int f5 = yVar.f(i6);
            int i9 = i7 - 2;
            int[] iArr2 = (f5 & 128) != 0 ? iArr : (f5 & 64) != 0 ? b2 : c2;
            if ((f5 & 1) != 0) {
                i4 = yVar.f(i6);
                i3 = yVar.f(i6);
                i5 = yVar.f(i6);
                f2 = yVar.f(i6);
                i7 = i9 - 4;
            } else {
                int f6 = yVar.f(6) << 2;
                int f7 = yVar.f(i8) << i8;
                int f8 = yVar.f(i8) << i8;
                i7 = i9 - 2;
                i3 = f7;
                f2 = yVar.f(2) << 6;
                i4 = f6;
                i5 = f8;
            }
            if (i4 == 0) {
                f2 = 255;
                i3 = 0;
                i5 = 0;
            }
            double d2 = i4;
            double d3 = i3 - 128;
            double d4 = i5 - 128;
            iArr2[f4] = d((byte) (255 - (f2 & 255)), l0.f((int) ((1.402d * d3) + d2), 0, 255), l0.f((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), l0.f((int) ((d4 * 1.772d) + d2), 0, 255));
            iArr = iArr;
            f3 = f3;
            i6 = 8;
            i8 = 4;
        }
        return new b(f3, iArr, b2, c2);
    }

    public static d g(y yVar) {
        byte[] bArr;
        int f2 = yVar.f(16);
        yVar.l(4);
        int f3 = yVar.f(2);
        boolean e2 = yVar.e();
        yVar.l(1);
        byte[] bArr2 = null;
        if (f3 == 1) {
            yVar.l(yVar.f(8) * 16);
        } else if (f3 == 0) {
            int f4 = yVar.f(16);
            int f5 = yVar.f(16);
            if (f4 > 0) {
                bArr2 = new byte[f4];
                yVar.h(bArr2, 0, f4);
            }
            if (f5 > 0) {
                bArr = new byte[f5];
                yVar.h(bArr, 0, f5);
                return new d(f2, e2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new d(f2, e2, bArr2, bArr);
    }
}
