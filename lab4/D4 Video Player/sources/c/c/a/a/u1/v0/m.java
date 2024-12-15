package c.c.a.a.u1.v0;

import c.c.a.a.l0;
import c.c.a.a.y1.q;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class m extends d {
    public final long i;

    public m(c.c.a.a.y1.n nVar, q qVar, l0 l0Var, int i, Object obj, long j, long j2, long j3) {
        super(nVar, qVar, 1, l0Var, i, obj, j, j2);
        Objects.requireNonNull(l0Var);
        this.i = j3;
    }

    public long c() {
        long j = this.i;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    public abstract boolean d();
}
