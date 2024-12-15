package c.c.a.a.v1.n;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e {
    public static final int[] A;
    public static final int[] B;
    public static final boolean[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final int w = d(2, 2, 2, 0);
    public static final int x;
    public static final int y;
    public static final int[] z;

    /* renamed from: a, reason: collision with root package name */
    public final List<SpannableString> f3268a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f3269b = new SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3270c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3271d;

    /* renamed from: e, reason: collision with root package name */
    public int f3272e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3273f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    static {
        int d2 = d(0, 0, 0, 0);
        x = d2;
        int d3 = d(0, 0, 0, 3);
        y = d3;
        z = new int[]{0, 0, 0, 0, 0, 2, 0};
        A = new int[]{0, 0, 0, 0, 0, 0, 2};
        B = new int[]{3, 3, 3, 3, 3, 3, 1};
        C = new boolean[]{false, false, false, true, true, true, false};
        D = new int[]{d2, d3, d2, d2, d3, d2, d2};
        E = new int[]{0, 1, 2, 3, 4, 3, 4};
        F = new int[]{0, 0, 0, 0, 0, 3, 3};
        G = new int[]{d2, d2, d2, d2, d2, d3, d3};
    }

    public e() {
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(int r4, int r5, int r6, int r7) {
        /*
            r0 = 0
            r1 = 4
            c.c.a.a.x1.p.f(r4, r0, r1)
            c.c.a.a.x1.p.f(r5, r0, r1)
            c.c.a.a.x1.p.f(r6, r0, r1)
            c.c.a.a.x1.p.f(r7, r0, r1)
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L21
            if (r7 == r1) goto L21
            r3 = 2
            if (r7 == r3) goto L1e
            r3 = 3
            if (r7 == r3) goto L1c
            goto L21
        L1c:
            r7 = r0
            goto L22
        L1e:
            r7 = 127(0x7f, float:1.78E-43)
            goto L22
        L21:
            r7 = r2
        L22:
            if (r4 <= r1) goto L26
            r4 = r2
            goto L27
        L26:
            r4 = r0
        L27:
            if (r5 <= r1) goto L2b
            r5 = r2
            goto L2c
        L2b:
            r5 = r0
        L2c:
            if (r6 <= r1) goto L2f
            r0 = r2
        L2f:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.v1.n.e.d(int, int, int, int):int");
    }

    public void a(char c2) {
        if (c2 != '\n') {
            this.f3269b.append(c2);
            return;
        }
        this.f3268a.add(b());
        this.f3269b.clear();
        if (this.p != -1) {
            this.p = 0;
        }
        if (this.q != -1) {
            this.q = 0;
        }
        if (this.r != -1) {
            this.r = 0;
        }
        if (this.t != -1) {
            this.t = 0;
        }
        while (true) {
            if ((!this.k || this.f3268a.size() < this.j) && this.f3268a.size() < 15) {
                return;
            } else {
                this.f3268a.remove(0);
            }
        }
    }

    public SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f3269b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.p, length, 33);
            }
            if (this.q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
            }
            if (this.r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, length, 33);
            }
            if (this.t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public void c() {
        this.f3268a.clear();
        this.f3269b.clear();
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.t = -1;
        this.v = 0;
    }

    public boolean e() {
        return !this.f3270c || (this.f3268a.isEmpty() && this.f3269b.length() == 0);
    }

    public void f() {
        c();
        this.f3270c = false;
        this.f3271d = false;
        this.f3272e = 4;
        this.f3273f = false;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 15;
        this.k = true;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        int i = x;
        this.o = i;
        this.s = w;
        this.u = i;
    }

    public void g(boolean z2, boolean z3) {
        if (this.p != -1) {
            if (!z2) {
                this.f3269b.setSpan(new StyleSpan(2), this.p, this.f3269b.length(), 33);
                this.p = -1;
            }
        } else if (z2) {
            this.p = this.f3269b.length();
        }
        if (this.q == -1) {
            if (z3) {
                this.q = this.f3269b.length();
            }
        } else {
            if (z3) {
                return;
            }
            this.f3269b.setSpan(new UnderlineSpan(), this.q, this.f3269b.length(), 33);
            this.q = -1;
        }
    }

    public void h(int i, int i2) {
        if (this.r != -1 && this.s != i) {
            this.f3269b.setSpan(new ForegroundColorSpan(this.s), this.r, this.f3269b.length(), 33);
        }
        if (i != w) {
            this.r = this.f3269b.length();
            this.s = i;
        }
        if (this.t != -1 && this.u != i2) {
            this.f3269b.setSpan(new BackgroundColorSpan(this.u), this.t, this.f3269b.length(), 33);
        }
        if (i2 != x) {
            this.t = this.f3269b.length();
            this.u = i2;
        }
    }
}
