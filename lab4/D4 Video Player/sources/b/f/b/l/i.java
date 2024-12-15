package b.f.b.l;

import b.f.b.l.d;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static boolean[] f987a = new boolean[3];

    public static void a(e eVar, b.f.b.e eVar2, d dVar) {
        d.a aVar = d.a.MATCH_PARENT;
        dVar.k = -1;
        dVar.l = -1;
        d.a aVar2 = eVar.O[0];
        d.a aVar3 = d.a.WRAP_CONTENT;
        if (aVar2 != aVar3 && dVar.O[0] == aVar) {
            int i = dVar.D.g;
            int q = eVar.q() - dVar.F.g;
            c cVar = dVar.D;
            cVar.i = eVar2.l(cVar);
            c cVar2 = dVar.F;
            cVar2.i = eVar2.l(cVar2);
            eVar2.e(dVar.D.i, i);
            eVar2.e(dVar.F.i, q);
            dVar.k = 2;
            dVar.U = i;
            int i2 = q - i;
            dVar.Q = i2;
            int i3 = dVar.X;
            if (i2 < i3) {
                dVar.Q = i3;
            }
        }
        if (eVar.O[1] == aVar3 || dVar.O[1] != aVar) {
            return;
        }
        int i4 = dVar.E.g;
        int k = eVar.k() - dVar.G.g;
        c cVar3 = dVar.E;
        cVar3.i = eVar2.l(cVar3);
        c cVar4 = dVar.G;
        cVar4.i = eVar2.l(cVar4);
        eVar2.e(dVar.E.i, i4);
        eVar2.e(dVar.G.i, k);
        if (dVar.W > 0 || dVar.c0 == 8) {
            c cVar5 = dVar.H;
            cVar5.i = eVar2.l(cVar5);
            eVar2.e(dVar.H.i, dVar.W + i4);
        }
        dVar.l = 2;
        dVar.V = i4;
        int i5 = k - i4;
        dVar.R = i5;
        int i6 = dVar.Y;
        if (i5 < i6) {
            dVar.R = i6;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
