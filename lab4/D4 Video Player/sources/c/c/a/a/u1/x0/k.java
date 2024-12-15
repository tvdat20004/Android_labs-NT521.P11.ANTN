package c.c.a.a.u1.x0;

import android.os.SystemClock;
import c.c.a.a.u1.q0;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends c.c.a.a.w1.g {
    public int g;

    public k(q0 q0Var, int[] iArr) {
        super(q0Var, iArr);
        this.g = k(q0Var.f2919c[0]);
    }

    @Override // c.c.a.a.w1.r
    public int a() {
        return 0;
    }

    @Override // c.c.a.a.w1.r
    public int b() {
        return this.g;
    }

    @Override // c.c.a.a.w1.r
    public Object e() {
        return null;
    }

    @Override // c.c.a.a.w1.r
    public void g(long j, long j2, long j3, List<? extends c.c.a.a.u1.v0.m> list, c.c.a.a.u1.v0.o[] oVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (l(this.g, elapsedRealtime)) {
            for (int i = this.f3408b - 1; i >= 0; i--) {
                if (!l(i, elapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
