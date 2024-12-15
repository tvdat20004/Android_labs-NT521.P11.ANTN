package b.g.b;

import b.e.i;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final b.h.i.c<ArrayList<T>> f1106a = new b.h.i.c<>(10);

    /* renamed from: b, reason: collision with root package name */
    public final i<T, ArrayList<T>> f1107b = new i<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<T> f1108c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet<T> f1109d = new HashSet<>();

    public void a(T t) {
        if (this.f1107b.e(t) >= 0) {
            return;
        }
        this.f1107b.put(t, null);
    }

    public final void b(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> orDefault = this.f1107b.getOrDefault(t, null);
        if (orDefault != null) {
            int size = orDefault.size();
            for (int i = 0; i < size; i++) {
                b(orDefault.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }
}
