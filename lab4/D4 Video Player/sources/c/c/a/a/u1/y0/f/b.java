package c.c.a.a.u1.y0.f;

import c.c.a.a.l0;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f3214a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3215b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3216c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3217d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3218e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3219f;
    public final int g;
    public final int h;
    public final String i;
    public final l0[] j;
    public final int k;
    public final String l;
    public final String m;
    public final List<Long> n;
    public final long[] o;
    public final long p;

    public b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, l0[] l0VarArr, List<Long> list, long[] jArr, long j2) {
        this.l = str;
        this.m = str2;
        this.f3214a = i;
        this.f3215b = str3;
        this.f3216c = j;
        this.f3217d = str4;
        this.f3218e = i2;
        this.f3219f = i3;
        this.g = i4;
        this.h = i5;
        this.i = str5;
        this.j = l0VarArr;
        this.n = list;
        this.o = jArr;
        this.p = j2;
        this.k = list.size();
    }

    public b a(l0[] l0VarArr) {
        return new b(this.l, this.m, this.f3214a, this.f3215b, this.f3216c, this.f3217d, this.f3218e, this.f3219f, this.g, this.h, this.i, l0VarArr, this.n, this.o, this.p);
    }

    public long b(int i) {
        if (i == this.k - 1) {
            return this.p;
        }
        long[] jArr = this.o;
        return jArr[i + 1] - jArr[i];
    }

    public int c(long j) {
        return c.c.a.a.z1.l0.c(this.o, j, true, true);
    }
}
