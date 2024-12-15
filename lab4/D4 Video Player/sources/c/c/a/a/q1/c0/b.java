package c.c.a.a.q1.c0;

import android.util.Pair;
import c.c.a.a.q1.t;
import c.c.a.a.q1.w;
import c.c.a.a.s;
import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f2269a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f2270b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2271c;

    public b(long[] jArr, long[] jArr2) {
        this.f2269a = jArr;
        this.f2270b = jArr2;
        this.f2271c = s.a(jArr2[jArr2.length - 1]);
    }

    public static Pair<Long, Long> a(long j, long[] jArr, long[] jArr2) {
        Long valueOf;
        Long valueOf2;
        int c2 = l0.c(jArr, j, true, true);
        long j2 = jArr[c2];
        long j3 = jArr2[c2];
        int i = c2 + 1;
        if (i == jArr.length) {
            valueOf = Long.valueOf(j2);
            valueOf2 = Long.valueOf(j3);
        } else {
            long j4 = jArr[i];
            long j5 = jArr2[i];
            double d2 = j4 == j2 ? 0.0d : (j - j2) / (j4 - j2);
            valueOf = Long.valueOf(j);
            valueOf2 = Long.valueOf(((long) (d2 * (j5 - j3))) + j3);
        }
        return Pair.create(valueOf, valueOf2);
    }

    @Override // c.c.a.a.q1.c0.c
    public long b(long j) {
        return s.a(((Long) a(j, this.f2269a, this.f2270b).second).longValue());
    }

    @Override // c.c.a.a.q1.v
    public boolean c() {
        return true;
    }

    @Override // c.c.a.a.q1.c0.c
    public long f() {
        return -1L;
    }

    @Override // c.c.a.a.q1.v
    public t g(long j) {
        Pair<Long, Long> a2 = a(s.b(l0.g(j, 0L, this.f2271c)), this.f2270b, this.f2269a);
        return new t(new w(s.a(((Long) a2.first).longValue()), ((Long) a2.second).longValue()));
    }

    @Override // c.c.a.a.q1.v
    public long j() {
        return this.f2271c;
    }
}
