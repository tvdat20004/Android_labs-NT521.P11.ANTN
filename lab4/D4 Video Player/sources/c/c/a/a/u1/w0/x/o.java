package c.c.a.a.u1.w0.x;

import java.util.List;

/* loaded from: classes.dex */
public class o extends n {
    public final List<i> g;

    public o(i iVar, long j, long j2, long j3, long j4, List<q> list, List<i> list2) {
        super(iVar, j, j2, j3, j4, list);
        this.g = list2;
    }

    @Override // c.c.a.a.u1.w0.x.n
    public int b(long j) {
        return this.g.size();
    }

    @Override // c.c.a.a.u1.w0.x.n
    public i d(m mVar, long j) {
        return this.g.get((int) (j - this.f3081d));
    }

    @Override // c.c.a.a.u1.w0.x.n
    public boolean e() {
        return true;
    }
}
