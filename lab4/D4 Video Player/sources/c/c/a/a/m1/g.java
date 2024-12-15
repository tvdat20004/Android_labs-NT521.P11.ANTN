package c.c.a.a.m1;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2094a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2095b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2096c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2097d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2098e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2099f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f2095b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f2099f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return ((i2 % 2) + iArr2[i3]) * 2;
        }
        int i5 = f2098e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }
}
