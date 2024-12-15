package c.c.a.a.w1;

import android.os.SystemClock;
import c.c.a.a.l0;
import c.c.a.a.u1.q0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class g implements r {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f3407a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3408b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f3409c;

    /* renamed from: d, reason: collision with root package name */
    public final l0[] f3410d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f3411e;

    /* renamed from: f, reason: collision with root package name */
    public int f3412f;

    public g(q0 q0Var, int... iArr) {
        int i = 0;
        c.c.a.a.x1.p.g(iArr.length > 0);
        Objects.requireNonNull(q0Var);
        this.f3407a = q0Var;
        int length = iArr.length;
        this.f3408b = length;
        this.f3410d = new l0[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f3410d[i2] = q0Var.f2919c[iArr[i2]];
        }
        Arrays.sort(this.f3410d, new f(null));
        this.f3409c = new int[this.f3408b];
        while (true) {
            int i3 = this.f3408b;
            if (i >= i3) {
                this.f3411e = new long[i3];
                return;
            } else {
                this.f3409c[i] = q0Var.i(this.f3410d[i]);
                i++;
            }
        }
    }

    @Override // c.c.a.a.w1.r
    public void c() {
    }

    @Override // c.c.a.a.w1.r
    public void d(float f2) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f3407a == gVar.f3407a && Arrays.equals(this.f3409c, gVar.f3409c);
    }

    @Override // c.c.a.a.w1.r
    public int f(long j, List<? extends c.c.a.a.u1.v0.m> list) {
        return list.size();
    }

    public final boolean h(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean l = l(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.f3408b && !l) {
            l = (i2 == i || l(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!l) {
            return false;
        }
        long[] jArr = this.f3411e;
        long j2 = jArr[i];
        int i3 = c.c.a.a.z1.l0.f3761a;
        long j3 = elapsedRealtime + j;
        jArr[i] = Math.max(j2, ((j ^ j3) & (elapsedRealtime ^ j3)) >= 0 ? j3 : Long.MAX_VALUE);
        return true;
    }

    public int hashCode() {
        if (this.f3412f == 0) {
            this.f3412f = Arrays.hashCode(this.f3409c) + (System.identityHashCode(this.f3407a) * 31);
        }
        return this.f3412f;
    }

    public final l0 i() {
        return this.f3410d[b()];
    }

    public final int j(int i) {
        for (int i2 = 0; i2 < this.f3408b; i2++) {
            if (this.f3409c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int k(l0 l0Var) {
        for (int i = 0; i < this.f3408b; i++) {
            if (this.f3410d[i] == l0Var) {
                return i;
            }
        }
        return -1;
    }

    public final boolean l(int i, long j) {
        return this.f3411e[i] > j;
    }
}
