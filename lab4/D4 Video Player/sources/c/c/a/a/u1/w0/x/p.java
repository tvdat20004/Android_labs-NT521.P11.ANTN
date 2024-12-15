package c.c.a.a.u1.w0.x;

import c.c.a.a.l0;
import java.util.List;

/* loaded from: classes.dex */
public class p extends n {
    public final u g;
    public final u h;
    public final long i;

    public p(i iVar, long j, long j2, long j3, long j4, long j5, List<q> list, u uVar, u uVar2) {
        super(iVar, j, j2, j3, j5, list);
        this.g = uVar;
        this.h = uVar2;
        this.i = j4;
    }

    @Override // c.c.a.a.u1.w0.x.s
    public i a(m mVar) {
        u uVar = this.g;
        if (uVar == null) {
            return this.f3088a;
        }
        l0 l0Var = mVar.f3076a;
        return new i(uVar.a(l0Var.f2037b, 0L, l0Var.f2041f, 0L), 0L, -1L);
    }

    @Override // c.c.a.a.u1.w0.x.n
    public int b(long j) {
        List<q> list = this.f3083f;
        if (list != null) {
            return list.size();
        }
        long j2 = this.i;
        if (j2 != -1) {
            return (int) ((j2 - this.f3081d) + 1);
        }
        if (j == -9223372036854775807L) {
            return -1;
        }
        long j3 = (this.f3082e * 1000000) / this.f3089b;
        int i = c.c.a.a.z1.l0.f3761a;
        return (int) (((j + j3) - 1) / j3);
    }

    @Override // c.c.a.a.u1.w0.x.n
    public i d(m mVar, long j) {
        List<q> list = this.f3083f;
        long j2 = list != null ? list.get((int) (j - this.f3081d)).f3084a : (j - this.f3081d) * this.f3082e;
        u uVar = this.h;
        l0 l0Var = mVar.f3076a;
        return new i(uVar.a(l0Var.f2037b, j, l0Var.f2041f, j2), 0L, -1L);
    }
}
