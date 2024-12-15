package c.c.a.a.u1.y0.f;

import c.c.a.a.z1.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class c implements c.c.a.a.t1.a<c> {

    /* renamed from: a, reason: collision with root package name */
    public final int f3220a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3221b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3222c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3223d;

    /* renamed from: e, reason: collision with root package name */
    public final a f3224e;

    /* renamed from: f, reason: collision with root package name */
    public final b[] f3225f;
    public final long g;
    public final long h;

    public c(int i, int i2, long j, long j2, int i3, boolean z, a aVar, b[] bVarArr) {
        this.f3220a = i;
        this.f3221b = i2;
        this.g = j;
        this.h = j2;
        this.f3222c = i3;
        this.f3223d = z;
        this.f3224e = aVar;
        this.f3225f = bVarArr;
    }

    public c(int i, int i2, long j, long j2, long j3, int i3, boolean z, a aVar, b[] bVarArr) {
        long C = j2 == 0 ? -9223372036854775807L : l0.C(j2, 1000000L, j);
        long C2 = j3 != 0 ? l0.C(j3, 1000000L, j) : -9223372036854775807L;
        this.f3220a = i;
        this.f3221b = i2;
        this.g = C;
        this.h = C2;
        this.f3222c = i3;
        this.f3223d = z;
        this.f3224e = aVar;
        this.f3225f = bVarArr;
    }

    @Override // c.c.a.a.t1.a
    public c a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i = 0;
        while (i < arrayList.size()) {
            c.c.a.a.t1.d dVar = (c.c.a.a.t1.d) arrayList.get(i);
            b bVar2 = this.f3225f[dVar.f2814c];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.a((c.c.a.a.l0[]) arrayList3.toArray(new c.c.a.a.l0[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.j[dVar.f2815d]);
            i++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((c.c.a.a.l0[]) arrayList3.toArray(new c.c.a.a.l0[0])));
        }
        return new c(this.f3220a, this.f3221b, this.g, this.h, this.f3222c, this.f3223d, this.f3224e, (b[]) arrayList2.toArray(new b[0]));
    }
}
