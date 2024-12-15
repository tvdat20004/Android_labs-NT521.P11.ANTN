package c.c.a.a.u1.x0;

import c.c.a.a.l0;
import c.c.a.a.u1.k0;

/* loaded from: classes.dex */
public final class s extends k0 {
    public s(c.c.a.a.y1.r rVar) {
        super(rVar);
    }

    @Override // c.c.a.a.u1.k0, c.c.a.a.q1.y
    public void b(l0 l0Var) {
        c.c.a.a.s1.c cVar = l0Var.h;
        if (cVar != null) {
            int length = cVar.f2719b.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                c.c.a.a.s1.b bVar = cVar.f2719b[i2];
                if ((bVar instanceof c.c.a.a.s1.m.v) && "com.apple.streaming.transportStreamTimestamp".equals(((c.c.a.a.s1.m.v) bVar).f2774c)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                if (length != 1) {
                    c.c.a.a.s1.b[] bVarArr = new c.c.a.a.s1.b[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            bVarArr[i < i2 ? i : i - 1] = cVar.f2719b[i];
                        }
                        i++;
                    }
                    cVar = new c.c.a.a.s1.c(bVarArr);
                }
            }
            super.b(l0Var.m(cVar));
        }
        cVar = null;
        super.b(l0Var.m(cVar));
    }
}
