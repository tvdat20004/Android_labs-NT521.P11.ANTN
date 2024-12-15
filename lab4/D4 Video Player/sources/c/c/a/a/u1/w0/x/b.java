package c.c.a.a.u1.w0.x;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class b implements c.c.a.a.t1.a<b> {

    /* renamed from: a, reason: collision with root package name */
    public final long f3038a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3039b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3040c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3041d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3042e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3043f;
    public final long g;
    public final long h;
    public final v i;
    public final Uri j;
    public final h k;
    public final List<g> l;

    public b(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, h hVar, v vVar, Uri uri, List<g> list) {
        this.f3038a = j;
        this.f3039b = j2;
        this.f3040c = j3;
        this.f3041d = z;
        this.f3042e = j4;
        this.f3043f = j5;
        this.g = j6;
        this.h = j7;
        this.k = hVar;
        this.i = vVar;
        this.j = uri;
        this.l = list == null ? Collections.emptyList() : list;
    }

    @Override // c.c.a.a.t1.a
    public b a(List list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new c.c.a.a.t1.d(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= c()) {
                break;
            }
            if (((c.c.a.a.t1.d) linkedList.peek()).f2813b != i) {
                long d2 = d(i);
                if (d2 != -9223372036854775807L) {
                    j += d2;
                }
            } else {
                g b2 = b(i);
                List<a> list2 = b2.f3063c;
                c.c.a.a.t1.d dVar = (c.c.a.a.t1.d) linkedList.poll();
                int i2 = dVar.f2813b;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = dVar.f2814c;
                    a aVar = list2.get(i3);
                    List<m> list3 = aVar.f3035c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add(list3.get(dVar.f2815d));
                        dVar = (c.c.a.a.t1.d) linkedList.poll();
                        if (dVar.f2813b != i2) {
                            break;
                        }
                    } while (dVar.f2814c == i3);
                    List<a> list4 = list2;
                    arrayList2.add(new a(aVar.f3033a, aVar.f3034b, arrayList3, aVar.f3036d, aVar.f3037e));
                    if (dVar.f2813b != i2) {
                        break;
                    }
                    list2 = list4;
                }
                linkedList.addFirst(dVar);
                arrayList.add(new g(b2.f3061a, b2.f3062b - j, arrayList2, b2.f3064d));
            }
            i++;
        }
        long j2 = this.f3039b;
        return new b(this.f3038a, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, this.f3040c, this.f3041d, this.f3042e, this.f3043f, this.g, this.h, this.k, this.i, this.j, arrayList);
    }

    public final g b(int i) {
        return this.l.get(i);
    }

    public final int c() {
        return this.l.size();
    }

    public final long d(int i) {
        if (i != this.l.size() - 1) {
            return this.l.get(i + 1).f3062b - this.l.get(i).f3062b;
        }
        long j = this.f3039b;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - this.l.get(i).f3062b;
    }

    public final long e(int i) {
        return c.c.a.a.s.a(d(i));
    }
}
