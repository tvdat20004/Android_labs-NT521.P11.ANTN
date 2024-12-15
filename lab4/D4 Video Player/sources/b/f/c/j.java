package b.f.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public class j {
    public static SparseIntArray k0;

    /* renamed from: c, reason: collision with root package name */
    public int f1072c;

    /* renamed from: d, reason: collision with root package name */
    public int f1073d;
    public int[] e0;
    public String f0;
    public String g0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1070a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1071b = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1074e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f1075f = -1;
    public float g = -1.0f;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public float u = 0.5f;
    public float v = 0.5f;
    public String w = null;
    public int x = -1;
    public int y = 0;
    public float z = 0.0f;
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public int D = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public int I = -1;
    public int J = -1;
    public int K = -1;
    public int L = -1;
    public int M = -1;
    public int N = -1;
    public int O = -1;
    public float P = -1.0f;
    public float Q = -1.0f;
    public int R = 0;
    public int S = 0;
    public int T = 0;
    public int U = 0;
    public int V = -1;
    public int W = -1;
    public int X = -1;
    public int Y = -1;
    public float Z = 1.0f;
    public float a0 = 1.0f;
    public int b0 = -1;
    public int c0 = 0;
    public int d0 = -1;
    public boolean h0 = false;
    public boolean i0 = false;
    public boolean j0 = true;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        k0 = sparseIntArray;
        sparseIntArray.append(38, 24);
        k0.append(39, 25);
        k0.append(41, 28);
        k0.append(42, 29);
        k0.append(47, 35);
        k0.append(46, 34);
        k0.append(20, 4);
        k0.append(19, 3);
        k0.append(17, 1);
        k0.append(55, 6);
        k0.append(56, 7);
        k0.append(27, 17);
        k0.append(28, 18);
        k0.append(29, 19);
        k0.append(0, 26);
        k0.append(43, 31);
        k0.append(44, 32);
        k0.append(26, 10);
        k0.append(25, 9);
        k0.append(59, 13);
        k0.append(62, 16);
        k0.append(60, 14);
        k0.append(57, 11);
        k0.append(61, 15);
        k0.append(58, 12);
        k0.append(50, 38);
        k0.append(36, 37);
        k0.append(35, 39);
        k0.append(49, 40);
        k0.append(34, 20);
        k0.append(48, 36);
        k0.append(24, 5);
        k0.append(37, 76);
        k0.append(45, 76);
        k0.append(40, 76);
        k0.append(18, 76);
        k0.append(16, 76);
        k0.append(3, 23);
        k0.append(5, 27);
        k0.append(7, 30);
        k0.append(8, 8);
        k0.append(4, 33);
        k0.append(6, 2);
        k0.append(1, 22);
        k0.append(2, 21);
        k0.append(21, 61);
        k0.append(23, 62);
        k0.append(22, 63);
        k0.append(54, 69);
        k0.append(33, 70);
        k0.append(12, 71);
        k0.append(10, 72);
        k0.append(11, 73);
        k0.append(13, 74);
        k0.append(9, 75);
    }

    public void a(Context context, AttributeSet attributeSet) {
        StringBuilder sb;
        String str;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1101d);
        this.f1071b = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = k0.get(index);
            if (i2 == 80) {
                this.h0 = obtainStyledAttributes.getBoolean(index, this.h0);
            } else if (i2 != 81) {
                switch (i2) {
                    case 1:
                        int i3 = this.p;
                        int[] iArr = n.f1093d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i3);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.p = resourceId;
                        break;
                    case 2:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 3:
                        int i4 = this.o;
                        int[] iArr2 = n.f1093d;
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, i4);
                        if (resourceId2 == -1) {
                            resourceId2 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.o = resourceId2;
                        break;
                    case 4:
                        int i5 = this.n;
                        int[] iArr3 = n.f1093d;
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, i5);
                        if (resourceId3 == -1) {
                            resourceId3 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.n = resourceId3;
                        break;
                    case 5:
                        this.w = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                        break;
                    case 7:
                        this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                        break;
                    case 8:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 9:
                        int i6 = this.t;
                        int[] iArr4 = n.f1093d;
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, i6);
                        if (resourceId4 == -1) {
                            resourceId4 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.t = resourceId4;
                        break;
                    case 10:
                        int i7 = this.s;
                        int[] iArr5 = n.f1093d;
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, i7);
                        if (resourceId5 == -1) {
                            resourceId5 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.s = resourceId5;
                        break;
                    case 11:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 12:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 13:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 14:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 15:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 16:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 17:
                        this.f1074e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1074e);
                        break;
                    case 18:
                        this.f1075f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1075f);
                        break;
                    case 19:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 20:
                        this.u = obtainStyledAttributes.getFloat(index, this.u);
                        break;
                    case 21:
                        this.f1073d = obtainStyledAttributes.getLayoutDimension(index, this.f1073d);
                        break;
                    case 22:
                        this.f1072c = obtainStyledAttributes.getLayoutDimension(index, this.f1072c);
                        break;
                    case 23:
                        this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                        break;
                    case 24:
                        int i8 = this.h;
                        int[] iArr6 = n.f1093d;
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, i8);
                        if (resourceId6 == -1) {
                            resourceId6 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.h = resourceId6;
                        break;
                    case 25:
                        int i9 = this.i;
                        int[] iArr7 = n.f1093d;
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, i9);
                        if (resourceId7 == -1) {
                            resourceId7 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.i = resourceId7;
                        break;
                    case 26:
                        this.C = obtainStyledAttributes.getInt(index, this.C);
                        break;
                    case 27:
                        this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                        break;
                    case 28:
                        int i10 = this.j;
                        int[] iArr8 = n.f1093d;
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, i10);
                        if (resourceId8 == -1) {
                            resourceId8 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.j = resourceId8;
                        break;
                    case 29:
                        int i11 = this.k;
                        int[] iArr9 = n.f1093d;
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, i11);
                        if (resourceId9 == -1) {
                            resourceId9 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.k = resourceId9;
                        break;
                    case 30:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 31:
                        int i12 = this.q;
                        int[] iArr10 = n.f1093d;
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, i12);
                        if (resourceId10 == -1) {
                            resourceId10 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.q = resourceId10;
                        break;
                    case 32:
                        int i13 = this.r;
                        int[] iArr11 = n.f1093d;
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, i13);
                        if (resourceId11 == -1) {
                            resourceId11 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.r = resourceId11;
                        break;
                    case 33:
                        this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 34:
                        int i14 = this.m;
                        int[] iArr12 = n.f1093d;
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, i14);
                        if (resourceId12 == -1) {
                            resourceId12 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.m = resourceId12;
                        break;
                    case 35:
                        int i15 = this.l;
                        int[] iArr13 = n.f1093d;
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, i15);
                        if (resourceId13 == -1) {
                            resourceId13 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.l = resourceId13;
                        break;
                    case 36:
                        this.v = obtainStyledAttributes.getFloat(index, this.v);
                        break;
                    case 37:
                        this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                        break;
                    case 38:
                        this.P = obtainStyledAttributes.getFloat(index, this.P);
                        break;
                    case 39:
                        this.R = obtainStyledAttributes.getInt(index, this.R);
                        break;
                    case 40:
                        this.S = obtainStyledAttributes.getInt(index, this.S);
                        break;
                    default:
                        switch (i2) {
                            case 54:
                                this.T = obtainStyledAttributes.getInt(index, this.T);
                                break;
                            case 55:
                                this.U = obtainStyledAttributes.getInt(index, this.U);
                                break;
                            case 56:
                                this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                break;
                            case 57:
                                this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                break;
                            case 58:
                                this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                break;
                            case 59:
                                this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                break;
                            default:
                                switch (i2) {
                                    case 61:
                                        int i16 = this.x;
                                        int[] iArr14 = n.f1093d;
                                        int resourceId14 = obtainStyledAttributes.getResourceId(index, i16);
                                        if (resourceId14 == -1) {
                                            resourceId14 = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        this.x = resourceId14;
                                        break;
                                    case 62:
                                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                                        break;
                                    case 63:
                                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                                        break;
                                    default:
                                        switch (i2) {
                                            case 69:
                                                this.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                continue;
                                            case 70:
                                                this.a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                continue;
                                            case 71:
                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                continue;
                                            case 72:
                                                this.b0 = obtainStyledAttributes.getInt(index, this.b0);
                                                continue;
                                            case 73:
                                                this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                                continue;
                                            case 74:
                                                this.f0 = obtainStyledAttributes.getString(index);
                                                continue;
                                            case 75:
                                                this.j0 = obtainStyledAttributes.getBoolean(index, this.j0);
                                                continue;
                                            case 76:
                                                sb = new StringBuilder();
                                                str = "unused attribute 0x";
                                                break;
                                            case 77:
                                                this.g0 = obtainStyledAttributes.getString(index);
                                                continue;
                                            default:
                                                sb = new StringBuilder();
                                                str = "Unknown attribute 0x";
                                                break;
                                        }
                                        sb.append(str);
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(k0.get(index));
                                        Log.w("ConstraintSet", sb.toString());
                                        break;
                                }
                        }
                }
            } else {
                this.i0 = obtainStyledAttributes.getBoolean(index, this.i0);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
