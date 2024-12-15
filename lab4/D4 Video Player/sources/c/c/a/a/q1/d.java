package c.c.a.a.q1;

import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f2288a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2289b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2290c;

    /* renamed from: d, reason: collision with root package name */
    public long f2291d;

    /* renamed from: e, reason: collision with root package name */
    public long f2292e;

    /* renamed from: f, reason: collision with root package name */
    public long f2293f;
    public long g;
    public long h;

    public d(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f2288a = j;
        this.f2289b = j2;
        this.f2291d = j3;
        this.f2292e = j4;
        this.f2293f = j5;
        this.g = j6;
        this.f2290c = j7;
        this.h = a(j2, j3, j4, j5, j6, j7);
    }

    public static long a(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return l0.g(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }
}
