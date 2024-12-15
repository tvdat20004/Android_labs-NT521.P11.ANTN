package b.f.b.l.k;

import b.f.b.l.c;
import b.f.b.l.d;
import b.f.b.l.k.c;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static b f1014a = new b();

    public static boolean a(b.f.b.l.d dVar) {
        d.a aVar = d.a.MATCH_CONSTRAINT;
        d.a aVar2 = d.a.WRAP_CONTENT;
        d.a aVar3 = d.a.FIXED;
        d.a l = dVar.l();
        d.a p = dVar.p();
        b.f.b.l.d dVar2 = dVar.P;
        b.f.b.l.e eVar = dVar2 != null ? (b.f.b.l.e) dVar2 : null;
        if (eVar != null) {
            eVar.l();
        }
        if (eVar != null) {
            eVar.p();
        }
        boolean z = l == aVar3 || l == aVar2 || (l == aVar && dVar.m == 0 && dVar.S == 0.0f && dVar.t(0)) || dVar.y();
        boolean z2 = p == aVar3 || p == aVar2 || (p == aVar && dVar.n == 0 && dVar.S == 0.0f && dVar.t(1)) || dVar.z();
        if (dVar.S <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    public static void b(b.f.b.l.d dVar, c.a aVar) {
        HashSet<b.f.b.l.c> hashSet;
        b.f.b.l.c cVar;
        b.f.b.l.c cVar2;
        b.f.b.l.c cVar3;
        b.f.b.l.c cVar4;
        b.f.b.l.c cVar5;
        d.a aVar2 = d.a.MATCH_CONSTRAINT;
        if (!(dVar instanceof b.f.b.l.e) && dVar.x() && a(dVar)) {
            b.f.b.l.e.W(dVar, aVar, new b(), false);
        }
        b.f.b.l.c h = dVar.h(c.a.LEFT);
        b.f.b.l.c h2 = dVar.h(c.a.RIGHT);
        int c2 = h.c();
        int c3 = h2.c();
        HashSet<b.f.b.l.c> hashSet2 = h.f965a;
        if (hashSet2 != null && h.f967c) {
            Iterator<b.f.b.l.c> it = hashSet2.iterator();
            while (it.hasNext()) {
                b.f.b.l.c next = it.next();
                b.f.b.l.d dVar2 = next.f968d;
                boolean a2 = a(dVar2);
                if (dVar2.x() && a2) {
                    b.f.b.l.e.W(dVar2, aVar, new b(), false);
                }
                if (dVar2.l() != aVar2 || a2) {
                    if (!dVar2.x()) {
                        b.f.b.l.c cVar6 = dVar2.D;
                        if (next == cVar6 && dVar2.F.f970f == null) {
                            int d2 = cVar6.d() + c2;
                            dVar2.E(d2, dVar2.q() + d2);
                        } else {
                            b.f.b.l.c cVar7 = dVar2.F;
                            if (next == cVar7 && cVar6.f970f == null) {
                                int d3 = c2 - cVar7.d();
                                dVar2.E(d3 - dVar2.q(), d3);
                            } else if (next == cVar6 && (cVar3 = cVar7.f970f) != null && cVar3.f967c && !dVar2.v()) {
                                c(aVar, dVar2);
                            }
                        }
                        b(dVar2, aVar);
                    }
                } else if (dVar2.l() == aVar2 && (dVar2.c0 == 8 || (dVar2.m == 0 && dVar2.S == 0.0f))) {
                    if (!dVar2.v()) {
                        b.f.b.l.c cVar8 = dVar2.D;
                        if (((next == cVar8 && (cVar5 = dVar2.F.f970f) != null && cVar5.f967c) || (next == dVar2.F && (cVar4 = cVar8.f970f) != null && cVar4.f967c)) && !dVar2.v()) {
                            d(dVar, aVar, dVar2);
                        }
                    }
                }
            }
        }
        if ((dVar instanceof b.f.b.l.f) || (hashSet = h2.f965a) == null || !h2.f967c) {
            return;
        }
        Iterator<b.f.b.l.c> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            b.f.b.l.c next2 = it2.next();
            b.f.b.l.d dVar3 = next2.f968d;
            boolean a3 = a(dVar3);
            if (dVar3.x() && a3) {
                b.f.b.l.e.W(dVar3, aVar, new b(), false);
            }
            b.f.b.l.c cVar9 = dVar3.D;
            boolean z = (next2 == cVar9 && (cVar2 = dVar3.F.f970f) != null && cVar2.f967c) || (next2 == dVar3.F && (cVar = cVar9.f970f) != null && cVar.f967c);
            if (dVar3.l() != aVar2 || a3) {
                if (!dVar3.x()) {
                    b.f.b.l.c cVar10 = dVar3.D;
                    if (next2 == cVar10 && dVar3.F.f970f == null) {
                        int d4 = cVar10.d() + c3;
                        dVar3.E(d4, dVar3.q() + d4);
                    } else {
                        b.f.b.l.c cVar11 = dVar3.F;
                        if (next2 == cVar11 && cVar10.f970f == null) {
                            int d5 = c3 - cVar11.d();
                            dVar3.E(d5 - dVar3.q(), d5);
                        } else if (z && !dVar3.v()) {
                            c(aVar, dVar3);
                        }
                    }
                    b(dVar3, aVar);
                }
            } else if (dVar3.l() == aVar2 && (dVar3.c0 == 8 || (dVar3.m == 0 && dVar3.S == 0.0f))) {
                if (!dVar3.v() && z && !dVar3.v()) {
                    d(dVar, aVar, dVar3);
                }
            }
        }
    }

    public static void c(c.a aVar, b.f.b.l.d dVar) {
        float f2 = dVar.Z;
        int c2 = dVar.D.f970f.c();
        int c3 = dVar.F.f970f.c();
        int d2 = dVar.D.d() + c2;
        int d3 = c3 - dVar.F.d();
        if (c2 == c3) {
            f2 = 0.5f;
        } else {
            c2 = d2;
            c3 = d3;
        }
        int q = dVar.q();
        int i = (c3 - c2) - q;
        if (c2 > c3) {
            i = (c2 - c3) - q;
        }
        if (((b.f.b.l.e) dVar.P).p0) {
            f2 = 1.0f - f2;
        }
        int i2 = ((int) ((f2 * i) + 0.5f)) + c2;
        int i3 = i2 + q;
        if (c2 > c3) {
            i3 = i2 - q;
        }
        dVar.E(i2, i3);
        b(dVar, aVar);
    }

    public static void d(b.f.b.l.d dVar, c.a aVar, b.f.b.l.d dVar2) {
        float f2 = dVar2.Z;
        int d2 = dVar2.D.d() + dVar2.D.f970f.c();
        int c2 = dVar2.F.f970f.c() - dVar2.F.d();
        if (c2 >= d2) {
            int q = dVar2.q();
            if (dVar2.c0 != 8) {
                int i = dVar2.m;
                if (i == 2) {
                    if (!(dVar instanceof b.f.b.l.e)) {
                        dVar = dVar.P;
                    }
                    q = (int) (dVar2.Z * 0.5f * dVar.q());
                } else if (i == 0) {
                    q = c2 - d2;
                }
                q = Math.max(dVar2.p, q);
                int i2 = dVar2.q;
                if (i2 > 0) {
                    q = Math.min(i2, q);
                }
            }
            int i3 = d2 + ((int) ((f2 * ((c2 - d2) - q)) + 0.5f));
            dVar2.E(i3, q + i3);
            b(dVar2, aVar);
        }
    }

    public static void e(c.a aVar, b.f.b.l.d dVar) {
        float f2 = dVar.a0;
        int c2 = dVar.E.f970f.c();
        int c3 = dVar.G.f970f.c();
        int d2 = dVar.E.d() + c2;
        int d3 = c3 - dVar.G.d();
        if (c2 == c3) {
            f2 = 0.5f;
        } else {
            c2 = d2;
            c3 = d3;
        }
        int k = dVar.k();
        int i = (c3 - c2) - k;
        if (c2 > c3) {
            i = (c2 - c3) - k;
        }
        int i2 = (int) ((f2 * i) + 0.5f);
        int i3 = c2 + i2;
        int i4 = i3 + k;
        if (c2 > c3) {
            i3 = c2 - i2;
            i4 = i3 - k;
        }
        dVar.F(i3, i4);
        g(dVar, aVar);
    }

    public static void f(b.f.b.l.d dVar, c.a aVar, b.f.b.l.d dVar2) {
        float f2 = dVar2.a0;
        int d2 = dVar2.E.d() + dVar2.E.f970f.c();
        int c2 = dVar2.G.f970f.c() - dVar2.G.d();
        if (c2 >= d2) {
            int k = dVar2.k();
            if (dVar2.c0 != 8) {
                int i = dVar2.n;
                if (i == 2) {
                    if (!(dVar instanceof b.f.b.l.e)) {
                        dVar = dVar.P;
                    }
                    k = (int) (f2 * 0.5f * dVar.k());
                } else if (i == 0) {
                    k = c2 - d2;
                }
                k = Math.max(dVar2.s, k);
                int i2 = dVar2.t;
                if (i2 > 0) {
                    k = Math.min(i2, k);
                }
            }
            int i3 = d2 + ((int) ((f2 * ((c2 - d2) - k)) + 0.5f));
            dVar2.F(i3, k + i3);
            g(dVar2, aVar);
        }
    }

    public static void g(b.f.b.l.d dVar, c.a aVar) {
        b.f.b.l.c cVar;
        b.f.b.l.c cVar2;
        b.f.b.l.c cVar3;
        b.f.b.l.c cVar4;
        b.f.b.l.c cVar5;
        d.a aVar2 = d.a.MATCH_CONSTRAINT;
        if (!(dVar instanceof b.f.b.l.e) && dVar.x() && a(dVar)) {
            b.f.b.l.e.W(dVar, aVar, new b(), false);
        }
        b.f.b.l.c h = dVar.h(c.a.TOP);
        b.f.b.l.c h2 = dVar.h(c.a.BOTTOM);
        int c2 = h.c();
        int c3 = h2.c();
        HashSet<b.f.b.l.c> hashSet = h.f965a;
        if (hashSet != null && h.f967c) {
            Iterator<b.f.b.l.c> it = hashSet.iterator();
            while (it.hasNext()) {
                b.f.b.l.c next = it.next();
                b.f.b.l.d dVar2 = next.f968d;
                boolean a2 = a(dVar2);
                if (dVar2.x() && a2) {
                    b.f.b.l.e.W(dVar2, aVar, new b(), false);
                }
                if (dVar2.p() != aVar2 || a2) {
                    if (!dVar2.x()) {
                        b.f.b.l.c cVar6 = dVar2.E;
                        if (next == cVar6 && dVar2.G.f970f == null) {
                            int d2 = cVar6.d() + c2;
                            dVar2.F(d2, dVar2.k() + d2);
                        } else {
                            b.f.b.l.c cVar7 = dVar2.G;
                            if (next == cVar7 && cVar7.f970f == null) {
                                int d3 = c2 - cVar7.d();
                                dVar2.F(d3 - dVar2.k(), d3);
                            } else if (next == cVar6 && (cVar3 = cVar7.f970f) != null && cVar3.f967c) {
                                e(aVar, dVar2);
                            }
                        }
                        g(dVar2, aVar);
                    }
                } else if (dVar2.p() == aVar2 && (dVar2.c0 == 8 || (dVar2.n == 0 && dVar2.S == 0.0f))) {
                    if (!dVar2.w()) {
                        b.f.b.l.c cVar8 = dVar2.E;
                        if (((next == cVar8 && (cVar5 = dVar2.G.f970f) != null && cVar5.f967c) || (next == dVar2.G && (cVar4 = cVar8.f970f) != null && cVar4.f967c)) && !dVar2.w()) {
                            f(dVar, aVar, dVar2);
                        }
                    }
                }
            }
        }
        if (dVar instanceof b.f.b.l.f) {
            return;
        }
        HashSet<b.f.b.l.c> hashSet2 = h2.f965a;
        if (hashSet2 != null && h2.f967c) {
            Iterator<b.f.b.l.c> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                b.f.b.l.c next2 = it2.next();
                b.f.b.l.d dVar3 = next2.f968d;
                boolean a3 = a(dVar3);
                if (dVar3.x() && a3) {
                    b.f.b.l.e.W(dVar3, aVar, new b(), false);
                }
                b.f.b.l.c cVar9 = dVar3.E;
                boolean z = (next2 == cVar9 && (cVar2 = dVar3.G.f970f) != null && cVar2.f967c) || (next2 == dVar3.G && (cVar = cVar9.f970f) != null && cVar.f967c);
                if (dVar3.p() != aVar2 || a3) {
                    if (!dVar3.x()) {
                        b.f.b.l.c cVar10 = dVar3.E;
                        if (next2 == cVar10 && dVar3.G.f970f == null) {
                            int d4 = cVar10.d() + c3;
                            dVar3.F(d4, dVar3.k() + d4);
                        } else {
                            b.f.b.l.c cVar11 = dVar3.G;
                            if (next2 == cVar11 && cVar10.f970f == null) {
                                int d5 = c3 - cVar11.d();
                                dVar3.F(d5 - dVar3.k(), d5);
                            } else if (z && !dVar3.w()) {
                                e(aVar, dVar3);
                            }
                        }
                        g(dVar3, aVar);
                    }
                } else if (dVar3.p() == aVar2 && (dVar3.c0 == 8 || (dVar3.n == 0 && dVar3.S == 0.0f))) {
                    if (!dVar3.w() && z && !dVar3.w()) {
                        f(dVar, aVar, dVar3);
                    }
                }
            }
        }
        b.f.b.l.c h3 = dVar.h(c.a.BASELINE);
        if (h3.f965a == null || !h3.f967c) {
            return;
        }
        int c4 = h3.c();
        Iterator<b.f.b.l.c> it3 = h3.f965a.iterator();
        while (it3.hasNext()) {
            b.f.b.l.c next3 = it3.next();
            b.f.b.l.d dVar4 = next3.f968d;
            boolean a4 = a(dVar4);
            if (dVar4.x() && a4) {
                b.f.b.l.e.W(dVar4, aVar, new b(), false);
            }
            if (dVar4.p() != aVar2 || a4) {
                if (!dVar4.x() && next3 == dVar4.H) {
                    if (dVar4.z) {
                        int i = c4 - dVar4.W;
                        int i2 = dVar4.R + i;
                        dVar4.V = i;
                        dVar4.E.j(i);
                        dVar4.G.j(i2);
                        b.f.b.l.c cVar12 = dVar4.H;
                        cVar12.f966b = c4;
                        cVar12.f967c = true;
                        dVar4.j = true;
                    }
                    g(dVar4, aVar);
                }
            }
        }
    }
}
