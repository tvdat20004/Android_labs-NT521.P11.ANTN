package c.c.a.a.u1.x0.b0;

import android.net.Uri;
import c.c.a.a.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends j {
    public static final g l = new g("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d, reason: collision with root package name */
    public final List<Uri> f3130d;

    /* renamed from: e, reason: collision with root package name */
    public final List<f> f3131e;

    /* renamed from: f, reason: collision with root package name */
    public final List<e> f3132f;
    public final List<e> g;
    public final l0 h;
    public final List<l0> i;
    public final Map<String, String> j;
    public final List<c.c.a.a.p1.e> k;

    public g(String str, List<String> list, List<f> list2, List<e> list3, List<e> list4, List<e> list5, List<e> list6, l0 l0Var, List<l0> list7, boolean z, Map<String, String> map, List<c.c.a.a.p1.e> list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = list2.get(i).f3124a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f3130d = Collections.unmodifiableList(arrayList);
        this.f3131e = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f3132f = Collections.unmodifiableList(list4);
        this.g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.h = l0Var;
        this.i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.j = Collections.unmodifiableMap(map);
        this.k = Collections.unmodifiableList(list8);
    }

    public static void b(List<e> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).f3121a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    public static <T> List<T> c(List<T> list, int i, List<c.c.a.a.t1.d> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    c.c.a.a.t1.d dVar = list2.get(i3);
                    if (dVar.f2814c == i && dVar.f2815d == i2) {
                        arrayList.add(t);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    @Override // c.c.a.a.t1.a
    public j a(List list) {
        return new g(this.f3141a, this.f3142b, c(this.f3131e, 0, list), Collections.emptyList(), c(this.f3132f, 1, list), c(this.g, 2, list), Collections.emptyList(), this.h, this.i, this.f3143c, this.j, this.k);
    }
}
