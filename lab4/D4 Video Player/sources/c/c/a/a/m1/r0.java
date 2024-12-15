package c.c.a.a.m1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2134a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2135b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2136c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2137d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2138e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2139f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    public r0(int i, int i2, float f2, float f3, int i3) {
        this.f2134a = i;
        this.f2135b = i2;
        this.f2136c = f2;
        this.f2137d = f3;
        this.f2138e = i / i3;
        this.f2139f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 * 2;
        this.h = i5;
        this.i = new short[i5];
        this.j = new short[i5 * i2];
        this.l = new short[i5 * i2];
        this.n = new short[i5 * i2];
    }

    public static void e(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final void a(short[] sArr, int i, int i2) {
        short[] c2 = c(this.l, this.m, i2);
        this.l = c2;
        int i3 = this.f2135b;
        System.arraycopy(sArr, i * i3, c2, this.m * i3, i3 * i2);
        this.m += i2;
    }

    public final void b(short[] sArr, int i, int i2) {
        int i3 = this.h / i2;
        int i4 = this.f2135b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.i[i7] = (short) (i8 / i5);
        }
    }

    public final short[] c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f2135b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int d(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f2135b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.u = i5 / i7;
        this.v = i8 / i6;
        return i7;
    }

    public final void f() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.m;
        float f2 = this.f2136c;
        float f3 = this.f2137d;
        float f4 = f2 / f3;
        float f5 = this.f2138e * f3;
        double d2 = f4;
        float f6 = 1.0f;
        int i9 = 1;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            int i10 = this.k;
            if (i10 >= this.h) {
                int i11 = 0;
                while (true) {
                    int i12 = this.r;
                    if (i12 > 0) {
                        int min = Math.min(this.h, i12);
                        a(this.j, i11, min);
                        this.r -= min;
                        i11 += min;
                    } else {
                        short[] sArr = this.j;
                        int i13 = this.f2134a;
                        int i14 = i13 > 4000 ? i13 / 4000 : i9;
                        if (this.f2135b == i9 && i14 == i9) {
                            i = d(sArr, i11, this.f2139f, this.g);
                        } else {
                            b(sArr, i11, i14);
                            int d3 = d(this.i, 0, this.f2139f / i14, this.g / i14);
                            if (i14 != i9) {
                                int i15 = d3 * i14;
                                int i16 = i14 * 4;
                                int i17 = i15 - i16;
                                int i18 = i15 + i16;
                                int i19 = this.f2139f;
                                if (i17 < i19) {
                                    i17 = i19;
                                }
                                int i20 = this.g;
                                if (i18 > i20) {
                                    i18 = i20;
                                }
                                if (this.f2135b == i9) {
                                    i = d(sArr, i11, i17, i18);
                                } else {
                                    b(sArr, i11, i9);
                                    i = d(this.i, 0, i17, i18);
                                }
                            } else {
                                i = d3;
                            }
                        }
                        int i21 = this.u;
                        int i22 = ((i21 == 0 || this.s == 0 || this.v > i21 * 3 || i21 * 2 <= this.t * 3) ? 0 : i9) != 0 ? this.s : i;
                        this.t = i21;
                        this.s = i;
                        short[] sArr2 = this.j;
                        if (d2 > 1.0d) {
                            if (f4 >= 2.0f) {
                                i3 = (int) (i22 / (f4 - f6));
                            } else {
                                this.r = (int) (((2.0f - f4) * i22) / (f4 - f6));
                                i3 = i22;
                            }
                            short[] c2 = c(this.l, this.m, i3);
                            this.l = c2;
                            int i23 = i3;
                            e(i3, this.f2135b, c2, this.m, sArr2, i11, sArr2, i11 + i22);
                            this.m += i23;
                            i11 = i22 + i23 + i11;
                        } else {
                            int i24 = i22;
                            if (f4 < 0.5f) {
                                i2 = (int) ((i24 * f4) / (f6 - f4));
                            } else {
                                this.r = (int) ((((2.0f * f4) - f6) * i24) / (f6 - f4));
                                i2 = i24;
                            }
                            int i25 = i24 + i2;
                            short[] c3 = c(this.l, this.m, i25);
                            this.l = c3;
                            int i26 = this.f2135b;
                            System.arraycopy(sArr2, i11 * i26, c3, this.m * i26, i26 * i24);
                            e(i2, this.f2135b, this.l, this.m + i24, sArr2, i11 + i24, sArr2, i11);
                            this.m += i25;
                            i11 += i2;
                        }
                    }
                    if (this.h + i11 > i10) {
                        break;
                    }
                    f6 = 1.0f;
                    i9 = 1;
                }
                int i27 = this.k - i11;
                short[] sArr3 = this.j;
                int i28 = this.f2135b;
                System.arraycopy(sArr3, i11 * i28, sArr3, 0, i28 * i27);
                this.k = i27;
            }
            f6 = 1.0f;
        } else {
            a(this.j, 0, this.k);
            this.k = 0;
        }
        if (f5 == f6 || this.m == i8) {
            return;
        }
        int i29 = this.f2134a;
        int i30 = (int) (i29 / f5);
        while (true) {
            if (i30 <= 16384 && i29 <= 16384) {
                break;
            }
            i30 /= 2;
            i29 /= 2;
        }
        int i31 = this.m - i8;
        short[] c4 = c(this.n, this.o, i31);
        this.n = c4;
        short[] sArr4 = this.l;
        int i32 = this.f2135b;
        System.arraycopy(sArr4, i8 * i32, c4, this.o * i32, i32 * i31);
        this.m = i8;
        this.o += i31;
        int i33 = 0;
        while (true) {
            i4 = this.o;
            i5 = i4 - 1;
            if (i33 >= i5) {
                break;
            }
            while (true) {
                i6 = this.p + 1;
                int i34 = i6 * i30;
                i7 = this.q;
                if (i34 <= i7 * i29) {
                    break;
                }
                this.l = c(this.l, this.m, 1);
                int i35 = 0;
                while (true) {
                    int i36 = this.f2135b;
                    if (i35 < i36) {
                        short[] sArr5 = this.l;
                        int i37 = (this.m * i36) + i35;
                        short[] sArr6 = this.n;
                        int i38 = (i33 * i36) + i35;
                        short s = sArr6[i38];
                        short s2 = sArr6[i38 + i36];
                        int i39 = this.q * i29;
                        int i40 = this.p;
                        int i41 = i40 * i30;
                        int i42 = (i40 + 1) * i30;
                        int i43 = i42 - i39;
                        int i44 = i42 - i41;
                        sArr5[i37] = (short) ((((i44 - i43) * s2) + (s * i43)) / i44);
                        i35++;
                    }
                }
                this.q++;
                this.m++;
            }
            this.p = i6;
            if (i6 == i29) {
                this.p = 0;
                c.c.a.a.x1.p.g(i7 == i30);
                this.q = 0;
            }
            i33++;
        }
        if (i5 == 0) {
            return;
        }
        short[] sArr7 = this.n;
        int i45 = this.f2135b;
        System.arraycopy(sArr7, i5 * i45, sArr7, 0, (i4 - i5) * i45);
        this.o -= i5;
    }
}
