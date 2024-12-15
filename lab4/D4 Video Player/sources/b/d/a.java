package b.d;

import b.f.b.l.c;
import b.f.b.l.d;
import b.f.b.l.f;
import b.f.b.l.h;
import b.f.b.l.k.q;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02d5, code lost:
    
        if (r3[r17].f970f.f968d == r9) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0148, code lost:
    
        if (r4[r2].f970f.f968d == r5) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0496 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0725 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0763 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0780 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(b.f.b.l.e r36, b.f.b.e r37, java.util.ArrayList<b.f.b.l.d> r38, int r39) {
        /*
            Method dump skipped, instructions count: 1935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.d.a.a(b.f.b.l.e, b.f.b.e, java.util.ArrayList, int):void");
    }

    public static q b(d dVar, int i, ArrayList<q> arrayList, q qVar) {
        c cVar;
        int i2;
        int i3 = i == 0 ? dVar.j0 : dVar.k0;
        if (i3 != -1 && (qVar == null || i3 != qVar.f1020b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                q qVar2 = arrayList.get(i4);
                if (qVar2.f1020b == i3) {
                    if (qVar != null) {
                        qVar.d(i, qVar2);
                        arrayList.remove(qVar);
                    }
                    qVar = qVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return qVar;
        }
        if (qVar == null) {
            if (dVar instanceof h) {
                h hVar = (h) dVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= hVar.m0) {
                        i2 = -1;
                        break;
                    }
                    d dVar2 = hVar.l0[i5];
                    if ((i == 0 && (i2 = dVar2.j0) != -1) || (i == 1 && (i2 = dVar2.k0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        q qVar3 = arrayList.get(i6);
                        if (qVar3.f1020b == i2) {
                            qVar = qVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (qVar == null) {
                qVar = new q(i);
            }
            arrayList.add(qVar);
        }
        if (qVar.a(dVar)) {
            if (dVar instanceof f) {
                f fVar = (f) dVar;
                fVar.o0.b(fVar.p0 == 0 ? 1 : 0, arrayList, qVar);
            }
            if (i == 0) {
                dVar.j0 = qVar.f1020b;
                dVar.D.b(i, arrayList, qVar);
                cVar = dVar.F;
            } else {
                dVar.k0 = qVar.f1020b;
                dVar.E.b(i, arrayList, qVar);
                dVar.H.b(i, arrayList, qVar);
                cVar = dVar.G;
            }
            cVar.b(i, arrayList, qVar);
            dVar.K.b(i, arrayList, qVar);
        }
        return qVar;
    }

    public static q c(ArrayList<q> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            q qVar = arrayList.get(i2);
            if (i == qVar.f1020b) {
                return qVar;
            }
        }
        return null;
    }

    public static boolean d(d.a aVar, d.a aVar2, d.a aVar3, d.a aVar4) {
        d.a aVar5 = d.a.MATCH_PARENT;
        d.a aVar6 = d.a.WRAP_CONTENT;
        d.a aVar7 = d.a.FIXED;
        return (aVar3 == aVar7 || aVar3 == aVar6 || (aVar3 == aVar5 && aVar != aVar6)) || (aVar4 == aVar7 || aVar4 == aVar6 || (aVar4 == aVar5 && aVar2 != aVar6));
    }
}
