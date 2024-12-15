package c.c.a.a.q1;

import c.c.a.a.l0;
import c.c.a.a.z1.z;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class l implements y {
    @Override // c.c.a.a.q1.y
    public void a(z zVar, int i) {
        zVar.A(zVar.f3801b + i);
    }

    @Override // c.c.a.a.q1.y
    public void b(l0 l0Var) {
    }

    @Override // c.c.a.a.q1.y
    public int c(j jVar, int i, boolean z) {
        int min = Math.min(jVar.g, i);
        jVar.i(min);
        if (min == 0) {
            byte[] bArr = jVar.f2647a;
            min = jVar.f(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        jVar.b(min);
        if (min != -1) {
            return min;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // c.c.a.a.q1.y
    public void d(long j, int i, int i2, int i3, x xVar) {
    }
}
