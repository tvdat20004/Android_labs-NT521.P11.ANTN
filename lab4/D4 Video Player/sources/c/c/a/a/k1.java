package c.c.a.a;

import android.util.Pair;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final k1 f2035a = new h1();

    public int a() {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c() {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, i1 i1Var, j1 j1Var, int i2, boolean z) {
        int i3 = g(i, i1Var, false).f2021b;
        if (m(i3, j1Var).f2032e != i) {
            return i + 1;
        }
        int e2 = e(i3, i2, z);
        if (e2 == -1) {
            return -1;
        }
        return m(e2, j1Var).f2031d;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c()) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c() ? a() : i + 1;
        }
        throw new IllegalStateException();
    }

    public final i1 f(int i, i1 i1Var) {
        return g(i, i1Var, false);
    }

    public abstract i1 g(int i, i1 i1Var, boolean z);

    public i1 h(Object obj, i1 i1Var) {
        return g(b(obj), i1Var, true);
    }

    public abstract int i();

    public final Pair<Object, Long> j(j1 j1Var, i1 i1Var, int i, long j) {
        Pair<Object, Long> k = k(j1Var, i1Var, i, j, 0L);
        Objects.requireNonNull(k);
        return k;
    }

    public final Pair<Object, Long> k(j1 j1Var, i1 i1Var, int i, long j, long j2) {
        c.c.a.a.x1.p.f(i, 0, o());
        n(i, j1Var, false, j2);
        if (j == -9223372036854775807L) {
            j = j1Var.f2033f;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = j1Var.f2031d;
        long j3 = j1Var.h + j;
        while (true) {
            long j4 = g(i2, i1Var, true).f2022c;
            if (j4 == -9223372036854775807L || j3 < j4 || i2 >= j1Var.f2032e) {
                break;
            }
            j3 -= j4;
            i2++;
        }
        Object obj = i1Var.f2020a;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(j3));
    }

    public abstract Object l(int i);

    public final j1 m(int i, j1 j1Var) {
        return n(i, j1Var, false, 0L);
    }

    public abstract j1 n(int i, j1 j1Var, boolean z, long j);

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
