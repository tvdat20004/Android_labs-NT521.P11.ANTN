package b.f.b.l.k;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class n {

    /* renamed from: c, reason: collision with root package name */
    public static int f1015c;

    /* renamed from: a, reason: collision with root package name */
    public s f1016a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<s> f1017b = new ArrayList<>();

    public n(s sVar, int i) {
        this.f1016a = null;
        f1015c++;
        this.f1016a = sVar;
    }

    public final long a(h hVar, long j) {
        s sVar = hVar.f1011d;
        if (sVar instanceof l) {
            return j;
        }
        int size = hVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            e eVar = hVar.k.get(i);
            if (eVar instanceof h) {
                h hVar2 = (h) eVar;
                if (hVar2.f1011d != sVar) {
                    j2 = Math.min(j2, a(hVar2, hVar2.f1013f + j));
                }
            }
        }
        if (hVar != sVar.i) {
            return j2;
        }
        long j3 = j - sVar.j();
        return Math.min(Math.min(j2, a(sVar.h, j3)), j3 - sVar.h.f1013f);
    }

    public final long b(h hVar, long j) {
        s sVar = hVar.f1011d;
        if (sVar instanceof l) {
            return j;
        }
        int size = hVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            e eVar = hVar.k.get(i);
            if (eVar instanceof h) {
                h hVar2 = (h) eVar;
                if (hVar2.f1011d != sVar) {
                    j2 = Math.max(j2, b(hVar2, hVar2.f1013f + j));
                }
            }
        }
        if (hVar != sVar.h) {
            return j2;
        }
        long j3 = j + sVar.j();
        return Math.max(Math.max(j2, b(sVar.i, j3)), j3 - sVar.i.f1013f);
    }
}
