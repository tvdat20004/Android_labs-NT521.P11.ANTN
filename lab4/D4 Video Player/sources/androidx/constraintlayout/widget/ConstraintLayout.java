package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import b.f.b.l.e;
import b.f.b.l.f;
import b.f.b.l.g;
import b.f.b.l.k.c;
import b.f.c.d;
import b.f.c.h;
import b.f.c.i;
import b.f.c.j;
import b.f.c.l;
import b.f.c.m;
import b.f.c.n;
import b.f.c.o;
import b.f.c.p;
import b.f.c.r;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public SparseArray<View> f149b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<d> f150c;

    /* renamed from: d, reason: collision with root package name */
    public e f151d;

    /* renamed from: e, reason: collision with root package name */
    public int f152e;

    /* renamed from: f, reason: collision with root package name */
    public int f153f;
    public int g;
    public int h;
    public boolean i;
    public int j;
    public n k;
    public h l;
    public int m;
    public HashMap<String, Integer> n;
    public int o;
    public int p;
    public SparseArray<b.f.b.l.d> q;
    public b r;
    public int s;
    public int t;

    public static class a extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        public int C;
        public float D;
        public float E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public float N;
        public float O;
        public int P;
        public int Q;
        public int R;
        public boolean S;
        public boolean T;
        public String U;
        public boolean V;
        public boolean W;
        public boolean X;
        public boolean Y;
        public boolean Z;

        /* renamed from: a, reason: collision with root package name */
        public int f154a;
        public int a0;

        /* renamed from: b, reason: collision with root package name */
        public int f155b;
        public int b0;

        /* renamed from: c, reason: collision with root package name */
        public float f156c;
        public int c0;

        /* renamed from: d, reason: collision with root package name */
        public int f157d;
        public int d0;

        /* renamed from: e, reason: collision with root package name */
        public int f158e;
        public int e0;

        /* renamed from: f, reason: collision with root package name */
        public int f159f;
        public int f0;
        public int g;
        public float g0;
        public int h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public float j0;
        public int k;
        public b.f.b.l.d k0;
        public int l;
        public int m;
        public int n;
        public float o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public float z;

        public a(int i, int i2) {
            super(i, i2);
            this.f154a = -1;
            this.f155b = -1;
            this.f156c = -1.0f;
            this.f157d = -1;
            this.f158e = -1;
            this.f159f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = -1;
            this.b0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = 0.5f;
            this.k0 = new b.f.b.l.d();
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            int i;
            this.f154a = -1;
            this.f155b = -1;
            this.f156c = -1.0f;
            this.f157d = -1;
            this.f158e = -1;
            this.f159f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = -1;
            this.b0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = 0.5f;
            this.k0 = new b.f.b.l.d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1099b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = b.f.c.e.f1051a.get(index);
                switch (i3) {
                    case 1:
                        this.R = obtainStyledAttributes.getInt(index, this.R);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId;
                        if (resourceId == -1) {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        this.n = obtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        continue;
                    case 4:
                        float f2 = obtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        this.o = f2;
                        if (f2 < 0.0f) {
                            this.o = (360.0f - f2) % 360.0f;
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f154a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f154a);
                        continue;
                    case 6:
                        this.f155b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f155b);
                        continue;
                    case 7:
                        this.f156c = obtainStyledAttributes.getFloat(index, this.f156c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f157d);
                        this.f157d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f157d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f158e);
                        this.f158e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f158e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f159f);
                        this.f159f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f159f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId5;
                        if (resourceId5 == -1) {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId6;
                        if (resourceId6 == -1) {
                            this.h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId7;
                        if (resourceId7 == -1) {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId8;
                        if (resourceId8 == -1) {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId9;
                        if (resourceId9 == -1) {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId10;
                        if (resourceId10 == -1) {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId11;
                        if (resourceId11 == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.q);
                        this.q = resourceId12;
                        if (resourceId12 == -1) {
                            this.q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId13;
                        if (resourceId13 == -1) {
                            this.r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId14;
                        if (resourceId14 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 21:
                        this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        continue;
                    case 22:
                        this.u = obtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        continue;
                    case 23:
                        this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        continue;
                    case 24:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        continue;
                    case 25:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        continue;
                    case 26:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        continue;
                    case 27:
                        this.S = obtainStyledAttributes.getBoolean(index, this.S);
                        continue;
                    case 28:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        continue;
                    case 29:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        continue;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        continue;
                    case 31:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.H = i4;
                        if (i4 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.I = i5;
                        if (i5 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.J) == -2) {
                                this.J = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.N));
                        this.H = 2;
                        continue;
                    case 36:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        continue;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.C = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.C = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.C == 1) {
                                                        Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            Float.parseFloat(substring4);
                                            continue;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                break;
                            case 46:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case 47:
                                this.F = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.P = obtainStyledAttributes.getDimensionPixelOffset(index, this.P);
                                break;
                            case 50:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                break;
                            case 51:
                                this.U = obtainStyledAttributes.getString(index);
                                break;
                        }
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f154a = -1;
            this.f155b = -1;
            this.f156c = -1.0f;
            this.f157d = -1;
            this.f158e = -1;
            this.f159f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = -1;
            this.b0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = 0.5f;
            this.k0 = new b.f.b.l.d();
        }

        public void a() {
            this.Y = false;
            this.V = true;
            this.W = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.S) {
                this.V = false;
                if (this.H == 0) {
                    this.H = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.V = false;
                if (i == 0 && this.H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.S = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.W = false;
                if (i2 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.T = true;
                }
            }
            if (this.f156c == -1.0f && this.f154a == -1 && this.f155b == -1) {
                return;
            }
            this.Y = true;
            this.V = true;
            this.W = true;
            if (!(this.k0 instanceof f)) {
                this.k0 = new f();
            }
            ((f) this.k0).P(this.R);
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
        
            if (r1 > 0) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00d0, code lost:
        
            ((android.view.ViewGroup.MarginLayoutParams) r9).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00dd, code lost:
        
            if (r1 > 0) goto L73;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    public class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public ConstraintLayout f160a;

        /* renamed from: b, reason: collision with root package name */
        public int f161b;

        /* renamed from: c, reason: collision with root package name */
        public int f162c;

        /* renamed from: d, reason: collision with root package name */
        public int f163d;

        /* renamed from: e, reason: collision with root package name */
        public int f164e;

        /* renamed from: f, reason: collision with root package name */
        public int f165f;
        public int g;

        public b(ConstraintLayout constraintLayout) {
            this.f160a = constraintLayout;
        }

        public final boolean a(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x0225  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0238  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x024f  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0259  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0261  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x026b  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x027a  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0295 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:130:0x02a2  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x02a8  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x0266  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x0254  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0242  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x01c1  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01cb A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01d3 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01dc  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01e7  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01fa A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x02c7  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x02ce  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x02d9  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x02de  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x02db  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x02c9  */
        @android.annotation.SuppressLint({"WrongCall"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(b.f.b.l.d r21, b.f.b.l.k.b r22) {
            /*
                Method dump skipped, instructions count: 753
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.b(b.f.b.l.d, b.f.b.l.k.b):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149b = new SparseArray<>();
        this.f150c = new ArrayList<>(4);
        this.f151d = new e();
        this.f152e = 0;
        this.f153f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 257;
        this.k = null;
        this.l = null;
        this.m = -1;
        this.n = new HashMap<>();
        this.o = -1;
        this.p = -1;
        this.q = new SparseArray<>();
        b bVar = new b(this);
        this.r = bVar;
        this.s = 0;
        this.t = 0;
        e eVar = this.f151d;
        eVar.b0 = this;
        eVar.o0 = bVar;
        eVar.n0.f1002f = bVar;
        this.f149b.put(getId(), this);
        this.k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f1099b, 0, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    this.f152e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f152e);
                } else if (index == 10) {
                    this.f153f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f153f);
                } else if (index == 7) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == 8) {
                    this.h = obtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                } else if (index == 89) {
                    this.j = obtainStyledAttributes.getInt(index, this.j);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.l = new h(getContext(), this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.l = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.k = nVar;
                        nVar.d(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.k = null;
                    }
                    this.m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f151d.Y(this.j);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x0045, code lost:
    
        if (r14 == 6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if (r14 == 6) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0142  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0322 -> B:79:0x0323). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r23, android.view.View r24, b.f.b.l.d r25, androidx.constraintlayout.widget.ConstraintLayout.a r26, android.util.SparseArray<b.f.b.l.d> r27) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a(boolean, android.view.View, b.f.b.l.d, androidx.constraintlayout.widget.ConstraintLayout$a, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    public Object c(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.n;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.n.get(str);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final b.f.b.l.d d(View view) {
        if (view == this) {
            return this.f151d;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).k0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<d> arrayList = this.f150c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                Objects.requireNonNull(this.f150c.get(i));
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i3;
                        float f3 = i4;
                        float f4 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    public boolean e() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void f(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        b bVar = this.r;
        int i5 = bVar.f164e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i3 + bVar.f163d, i, 0);
        int resolveSizeAndState2 = ViewGroup.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int min = Math.min(this.g, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.h, resolveSizeAndState2);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.o = min;
        this.p = min2;
    }

    @Override // android.view.View
    public void forceLayout() {
        this.i = true;
        this.o = -1;
        this.p = -1;
        super.forceLayout();
    }

    public void g(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.n == null) {
                this.n = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.n.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.g;
    }

    public int getMinHeight() {
        return this.f153f;
    }

    public int getMinWidth() {
        return this.f152e;
    }

    public int getOptimizationLevel() {
        return this.f151d.x0;
    }

    public final boolean h() {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        String str;
        int c2;
        int i3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        String str2;
        String resourceName;
        int id;
        b.f.b.l.d dVar;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = 1;
            if (i7 >= childCount) {
                z = false;
                break;
            }
            if (getChildAt(i7).isLayoutRequested()) {
                z = true;
                break;
            }
            i7++;
        }
        if (!z) {
            return z;
        }
        boolean isInEditMode = isInEditMode();
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            b.f.b.l.d d2 = d(getChildAt(i8));
            if (d2 != null) {
                d2.A();
            }
        }
        int i9 = -1;
        if (isInEditMode) {
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt = getChildAt(i10);
                try {
                    resourceName = getResources().getResourceName(childAt.getId());
                    g(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    id = childAt.getId();
                } catch (Resources.NotFoundException unused) {
                }
                if (id != 0) {
                    View view = this.f149b.get(id);
                    if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
                        onViewAdded(view);
                    }
                    if (view != this) {
                        dVar = view == null ? null : ((a) view.getLayoutParams()).k0;
                        dVar.d0 = resourceName;
                    }
                }
                dVar = this.f151d;
                dVar.d0 = resourceName;
            }
        }
        if (this.m != -1) {
            for (int i11 = 0; i11 < childCount2; i11++) {
                getChildAt(i11).getId();
            }
        }
        n nVar = this.k;
        if (nVar != null) {
            int childCount3 = getChildCount();
            HashSet hashSet = new HashSet(nVar.f1097c.keySet());
            while (i6 < childCount3) {
                View childAt2 = getChildAt(i6);
                int id2 = childAt2.getId();
                if (!nVar.f1097c.containsKey(Integer.valueOf(id2))) {
                    StringBuilder j = c.a.a.a.a.j("id unknown ");
                    try {
                        str2 = childAt2.getContext().getResources().getResourceEntryName(childAt2.getId());
                    } catch (Exception unused2) {
                        str2 = "UNKNOWN";
                    }
                    c.a.a.a.a.e(j, str2, "ConstraintSet");
                } else {
                    if (nVar.f1096b && id2 == i9) {
                        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                    }
                    if (id2 != i9) {
                        if (nVar.f1097c.containsKey(Integer.valueOf(id2))) {
                            hashSet.remove(Integer.valueOf(id2));
                            i iVar = nVar.f1097c.get(Integer.valueOf(id2));
                            if (childAt2 instanceof b.f.c.a) {
                                iVar.f1067d.d0 = i;
                            }
                            int i12 = iVar.f1067d.d0;
                            if (i12 != i9 && i12 == i) {
                                b.f.c.a aVar = (b.f.c.a) childAt2;
                                aVar.setId(id2);
                                aVar.setType(iVar.f1067d.b0);
                                aVar.setMargin(iVar.f1067d.c0);
                                aVar.setAllowsGoneWidget(iVar.f1067d.j0);
                                j jVar = iVar.f1067d;
                                int[] iArr = jVar.e0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str3 = jVar.f0;
                                    if (str3 != null) {
                                        jVar.e0 = nVar.b(aVar, str3);
                                        aVar.setReferencedIds(iVar.f1067d.e0);
                                    }
                                }
                            }
                            a aVar2 = (a) childAt2.getLayoutParams();
                            aVar2.a();
                            iVar.a(aVar2);
                            HashMap<String, b.f.c.c> hashMap = iVar.f1069f;
                            i3 = childCount3;
                            Class<?> cls = childAt2.getClass();
                            for (String str4 : hashMap.keySet()) {
                                boolean z6 = z;
                                b.f.c.c cVar = hashMap.get(str4);
                                HashMap<String, b.f.c.c> hashMap2 = hashMap;
                                String g = c.a.a.a.a.g("set", str4);
                                boolean z7 = isInEditMode;
                                try {
                                    switch (cVar.f1041b) {
                                        case INT_TYPE:
                                            i5 = childCount2;
                                            cls.getMethod(g, Integer.TYPE).invoke(childAt2, Integer.valueOf(cVar.f1042c));
                                            break;
                                        case FLOAT_TYPE:
                                            i5 = childCount2;
                                            cls.getMethod(g, Float.TYPE).invoke(childAt2, Float.valueOf(cVar.f1043d));
                                            break;
                                        case COLOR_TYPE:
                                            i5 = childCount2;
                                            cls.getMethod(g, Integer.TYPE).invoke(childAt2, Integer.valueOf(cVar.g));
                                            break;
                                        case COLOR_DRAWABLE_TYPE:
                                            i5 = childCount2;
                                            Method method = cls.getMethod(g, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(cVar.g);
                                            method.invoke(childAt2, colorDrawable);
                                            break;
                                        case STRING_TYPE:
                                            i5 = childCount2;
                                            cls.getMethod(g, CharSequence.class).invoke(childAt2, cVar.f1044e);
                                            break;
                                        case BOOLEAN_TYPE:
                                            i5 = childCount2;
                                            cls.getMethod(g, Boolean.TYPE).invoke(childAt2, Boolean.valueOf(cVar.f1045f));
                                            break;
                                        case DIMENSION_TYPE:
                                            i5 = childCount2;
                                            try {
                                                cls.getMethod(g, Float.TYPE).invoke(childAt2, Float.valueOf(cVar.f1043d));
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                z = z6;
                                                hashMap = hashMap2;
                                                isInEditMode = z7;
                                                childCount2 = i5;
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(cls.getName());
                                                sb.append(" must have a method ");
                                                sb.append(g);
                                                Log.e("TransitionLayout", sb.toString());
                                                z = z6;
                                                hashMap = hashMap2;
                                                isInEditMode = z7;
                                                childCount2 = i5;
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                z = z6;
                                                hashMap = hashMap2;
                                                isInEditMode = z7;
                                                childCount2 = i5;
                                            }
                                        default:
                                            i5 = childCount2;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    i5 = childCount2;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    i5 = childCount2;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    i5 = childCount2;
                                }
                                z = z6;
                                hashMap = hashMap2;
                                isInEditMode = z7;
                                childCount2 = i5;
                            }
                            z4 = z;
                            z5 = isInEditMode;
                            i4 = childCount2;
                            childAt2.setLayoutParams(aVar2);
                            l lVar = iVar.f1065b;
                            if (lVar.f1084c == 0) {
                                childAt2.setVisibility(lVar.f1083b);
                            }
                            childAt2.setAlpha(iVar.f1065b.f1085d);
                            childAt2.setRotation(iVar.f1068e.f1088b);
                            childAt2.setRotationX(iVar.f1068e.f1089c);
                            childAt2.setRotationY(iVar.f1068e.f1090d);
                            childAt2.setScaleX(iVar.f1068e.f1091e);
                            childAt2.setScaleY(iVar.f1068e.f1092f);
                            if (!Float.isNaN(iVar.f1068e.g)) {
                                childAt2.setPivotX(iVar.f1068e.g);
                            }
                            if (!Float.isNaN(iVar.f1068e.h)) {
                                childAt2.setPivotY(iVar.f1068e.h);
                            }
                            childAt2.setTranslationX(iVar.f1068e.i);
                            childAt2.setTranslationY(iVar.f1068e.j);
                            childAt2.setTranslationZ(iVar.f1068e.k);
                            m mVar = iVar.f1068e;
                            if (mVar.l) {
                                childAt2.setElevation(mVar.m);
                            }
                        } else {
                            i3 = childCount3;
                            z4 = z;
                            z5 = isInEditMode;
                            i4 = childCount2;
                            Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                        }
                        i6++;
                        i9 = -1;
                        i = 1;
                        childCount3 = i3;
                        z = z4;
                        isInEditMode = z5;
                        childCount2 = i4;
                    }
                }
                i3 = childCount3;
                z4 = z;
                z5 = isInEditMode;
                i4 = childCount2;
                i6++;
                i9 = -1;
                i = 1;
                childCount3 = i3;
                z = z4;
                isInEditMode = z5;
                childCount2 = i4;
            }
            z2 = z;
            z3 = isInEditMode;
            i2 = childCount2;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                i iVar2 = nVar.f1097c.get(num);
                int i13 = iVar2.f1067d.d0;
                if (i13 != -1 && i13 == 1) {
                    b.f.c.a aVar3 = new b.f.c.a(getContext());
                    aVar3.setId(num.intValue());
                    j jVar2 = iVar2.f1067d;
                    int[] iArr2 = jVar2.e0;
                    if (iArr2 != null) {
                        aVar3.setReferencedIds(iArr2);
                    } else {
                        String str5 = jVar2.f0;
                        if (str5 != null) {
                            jVar2.e0 = nVar.b(aVar3, str5);
                            aVar3.setReferencedIds(iVar2.f1067d.e0);
                        }
                    }
                    aVar3.setType(iVar2.f1067d.b0);
                    aVar3.setMargin(iVar2.f1067d.c0);
                    a generateDefaultLayoutParams = generateDefaultLayoutParams();
                    aVar3.d();
                    iVar2.a(generateDefaultLayoutParams);
                    addView(aVar3, generateDefaultLayoutParams);
                }
                if (iVar2.f1067d.f1070a) {
                    View pVar = new p(getContext());
                    pVar.setId(num.intValue());
                    a generateDefaultLayoutParams2 = generateDefaultLayoutParams();
                    iVar2.a(generateDefaultLayoutParams2);
                    addView(pVar, generateDefaultLayoutParams2);
                }
            }
        } else {
            z2 = z;
            z3 = isInEditMode;
            i2 = childCount2;
        }
        this.f151d.l0.clear();
        int size = this.f150c.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                d dVar2 = this.f150c.get(i14);
                if (dVar2.isInEditMode()) {
                    dVar2.setIds(dVar2.f1050f);
                }
                g gVar = dVar2.f1049e;
                if (gVar != null) {
                    b.f.b.l.h hVar = (b.f.b.l.h) gVar;
                    hVar.m0 = 0;
                    Arrays.fill(hVar.l0, (Object) null);
                    for (int i15 = 0; i15 < dVar2.f1047c; i15++) {
                        int i16 = dVar2.f1046b[i15];
                        View view2 = this.f149b.get(i16);
                        if (view2 == null && (c2 = dVar2.c(this, (str = dVar2.g.get(Integer.valueOf(i16))))) != 0) {
                            dVar2.f1046b[i15] = c2;
                            dVar2.g.put(Integer.valueOf(c2), str);
                            view2 = this.f149b.get(c2);
                        }
                        if (view2 != null) {
                            g gVar2 = dVar2.f1049e;
                            b.f.b.l.d d3 = d(view2);
                            b.f.b.l.h hVar2 = (b.f.b.l.h) gVar2;
                            Objects.requireNonNull(hVar2);
                            if (d3 != hVar2 && d3 != null) {
                                int i17 = hVar2.m0 + 1;
                                b.f.b.l.d[] dVarArr = hVar2.l0;
                                if (i17 > dVarArr.length) {
                                    hVar2.l0 = (b.f.b.l.d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                }
                                b.f.b.l.d[] dVarArr2 = hVar2.l0;
                                int i18 = hVar2.m0;
                                dVarArr2[i18] = d3;
                                hVar2.m0 = i18 + 1;
                            }
                        }
                    }
                    Objects.requireNonNull((b.f.b.l.h) dVar2.f1049e);
                }
            }
        }
        int i19 = i2;
        for (int i20 = 0; i20 < i19; i20++) {
            getChildAt(i20);
        }
        this.q.clear();
        this.q.put(0, this.f151d);
        this.q.put(getId(), this.f151d);
        for (int i21 = 0; i21 < i19; i21++) {
            View childAt3 = getChildAt(i21);
            this.q.put(childAt3.getId(), d(childAt3));
        }
        for (int i22 = 0; i22 < i19; i22++) {
            View childAt4 = getChildAt(i22);
            b.f.b.l.d d4 = d(childAt4);
            if (d4 != null) {
                a aVar4 = (a) childAt4.getLayoutParams();
                e eVar = this.f151d;
                eVar.l0.add(d4);
                b.f.b.l.d dVar3 = d4.P;
                if (dVar3 != null) {
                    ((b.f.b.l.j) dVar3).l0.remove(d4);
                    d4.P = null;
                }
                d4.P = eVar;
                a(z3, childAt4, d4, aVar4, this.q);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            a aVar = (a) childAt.getLayoutParams();
            b.f.b.l.d dVar = aVar.k0;
            if (childAt.getVisibility() != 8 || aVar.Y || aVar.Z || isInEditMode) {
                int r = dVar.r();
                int s = dVar.s();
                childAt.layout(r, s, dVar.q() + r, dVar.k() + s);
            }
        }
        int size = this.f150c.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                Objects.requireNonNull(this.f150c.get(i6));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x025e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020a  */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        b.f.b.l.d d2 = d(view);
        if ((view instanceof p) && !(d2 instanceof f)) {
            a aVar = (a) view.getLayoutParams();
            f fVar = new f();
            aVar.k0 = fVar;
            aVar.Y = true;
            fVar.P(aVar.R);
        }
        if (view instanceof d) {
            d dVar = (d) view;
            dVar.d();
            ((a) view.getLayoutParams()).Z = true;
            if (!this.f150c.contains(dVar)) {
                this.f150c.add(dVar);
            }
        }
        this.f149b.put(view.getId(), view);
        this.i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f149b.remove(view.getId());
        b.f.b.l.d d2 = d(view);
        this.f151d.l0.remove(d2);
        d2.P = null;
        this.f150c.remove(view);
        this.i = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.i = true;
        this.o = -1;
        this.p = -1;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.k = nVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f149b.remove(getId());
        super.setId(i);
        this.f149b.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.h) {
            return;
        }
        this.h = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f153f) {
            return;
        }
        this.f153f = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f152e) {
            return;
        }
        this.f152e = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        h hVar = this.l;
        if (hVar != null) {
            Objects.requireNonNull(hVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.j = i;
        e eVar = this.f151d;
        eVar.x0 = i;
        b.f.b.e.p = eVar.X(512);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
