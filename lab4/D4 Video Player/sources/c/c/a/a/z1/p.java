package c.c.a.a.z1;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class p<T> {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<o<T>> f3775a = new CopyOnWriteArrayList<>();

    public void a(T t) {
        Iterator<o<T>> it = this.f3775a.iterator();
        while (it.hasNext()) {
            o<T> next = it.next();
            if (next.f3773b == t) {
                next.f3774c = true;
                this.f3775a.remove(next);
            }
        }
    }
}
