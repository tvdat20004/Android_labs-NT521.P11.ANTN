package c.c.a.a.u1;

/* loaded from: classes.dex */
public class p implements n0 {

    /* renamed from: b, reason: collision with root package name */
    public final n0[] f2917b;

    public p(n0[] n0VarArr) {
        this.f2917b = n0VarArr;
    }

    @Override // c.c.a.a.u1.n0
    public final long d() {
        long j = Long.MAX_VALUE;
        for (n0 n0Var : this.f2917b) {
            long d2 = n0Var.d();
            if (d2 != Long.MIN_VALUE) {
                j = Math.min(j, d2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // c.c.a.a.u1.n0
    public final long e() {
        long j = Long.MAX_VALUE;
        for (n0 n0Var : this.f2917b) {
            long e2 = n0Var.e();
            if (e2 != Long.MIN_VALUE) {
                j = Math.min(j, e2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // c.c.a.a.u1.n0
    public boolean f(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long e2 = e();
            if (e2 == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (n0 n0Var : this.f2917b) {
                long e3 = n0Var.e();
                boolean z3 = e3 != Long.MIN_VALUE && e3 <= j;
                if (e3 == e2 || z3) {
                    z |= n0Var.f(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // c.c.a.a.u1.n0
    public final void g(long j) {
        for (n0 n0Var : this.f2917b) {
            n0Var.g(j);
        }
    }
}
