package c.c.a.a.q1.e0;

import c.c.a.a.q1.y;
import c.c.a.a.z1.z;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final g f2409a = new g();

    /* renamed from: b, reason: collision with root package name */
    public y f2410b;

    /* renamed from: c, reason: collision with root package name */
    public c.c.a.a.q1.n f2411c;

    /* renamed from: d, reason: collision with root package name */
    public i f2412d;

    /* renamed from: e, reason: collision with root package name */
    public long f2413e;

    /* renamed from: f, reason: collision with root package name */
    public long f2414f;
    public long g;
    public int h;
    public int i;
    public l j;
    public long k;
    public boolean l;
    public boolean m;

    public long a(long j) {
        return (j * 1000000) / this.i;
    }

    public long b(long j) {
        return (this.i * j) / 1000000;
    }

    public void c(long j) {
        this.g = j;
    }

    public abstract long d(z zVar);

    public abstract boolean e(z zVar, long j, l lVar);

    public void f(boolean z) {
        int i;
        if (z) {
            this.j = new l();
            this.f2414f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.h = i;
        this.f2413e = -1L;
        this.g = 0L;
    }
}
