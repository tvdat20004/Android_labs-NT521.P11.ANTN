package c.c.a.a.u1.w0.x;

import c.c.a.a.l0;
import java.util.List;

/* loaded from: classes.dex */
public class k extends m implements c.c.a.a.u1.w0.o {

    /* renamed from: f, reason: collision with root package name */
    public final n f3074f;

    public k(long j, l0 l0Var, String str, n nVar, List<e> list) {
        super(j, l0Var, str, nVar, list, null);
        this.f3074f = nVar;
    }

    @Override // c.c.a.a.u1.w0.o
    public long a(long j, long j2) {
        long j3;
        n nVar = this.f3074f;
        long j4 = nVar.f3081d;
        long b2 = nVar.b(j2);
        if (b2 == 0) {
            return j4;
        }
        if (nVar.f3083f == null) {
            j3 = (j / ((nVar.f3082e * 1000000) / nVar.f3089b)) + nVar.f3081d;
            if (j3 < j4) {
                return j4;
            }
            if (b2 != -1) {
                return Math.min(j3, (j4 + b2) - 1);
            }
        } else {
            long j5 = (b2 + j4) - 1;
            j3 = j4;
            while (j3 <= j5) {
                long j6 = ((j5 - j3) / 2) + j3;
                long c2 = nVar.c(j6);
                if (c2 < j) {
                    j3 = j6 + 1;
                } else {
                    if (c2 <= j) {
                        return j6;
                    }
                    j5 = j6 - 1;
                }
            }
            if (j3 != j4) {
                return j5;
            }
        }
        return j3;
    }

    @Override // c.c.a.a.u1.w0.o
    public long b(long j) {
        return this.f3074f.c(j);
    }

    @Override // c.c.a.a.u1.w0.o
    public boolean c() {
        return this.f3074f.e();
    }

    @Override // c.c.a.a.u1.w0.o
    public long d(long j, long j2) {
        long j3;
        n nVar = this.f3074f;
        List<q> list = nVar.f3083f;
        if (list != null) {
            j3 = list.get((int) (j - nVar.f3081d)).f3085b;
        } else {
            int b2 = nVar.b(j2);
            if (b2 != -1 && j == (nVar.f3081d + b2) - 1) {
                return j2 - nVar.c(j);
            }
            j3 = nVar.f3082e;
        }
        return (j3 * 1000000) / nVar.f3089b;
    }

    @Override // c.c.a.a.u1.w0.o
    public long e() {
        return this.f3074f.f3081d;
    }

    @Override // c.c.a.a.u1.w0.o
    public int f(long j) {
        return this.f3074f.b(j);
    }

    @Override // c.c.a.a.u1.w0.o
    public i g(long j) {
        return this.f3074f.d(this, j);
    }

    @Override // c.c.a.a.u1.w0.x.m
    public String h() {
        return null;
    }

    @Override // c.c.a.a.u1.w0.x.m
    public c.c.a.a.u1.w0.o i() {
        return this;
    }

    @Override // c.c.a.a.u1.w0.x.m
    public i j() {
        return null;
    }
}
