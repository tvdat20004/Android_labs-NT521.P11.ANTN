package b.c.a.b;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class f<K, V> implements Iterator<Map.Entry<K, V>>, g<K, V> {

    /* renamed from: b, reason: collision with root package name */
    public d<K, V> f865b;

    /* renamed from: c, reason: collision with root package name */
    public d<K, V> f866c;

    public f(d<K, V> dVar, d<K, V> dVar2) {
        this.f865b = dVar2;
        this.f866c = dVar;
    }

    @Override // b.c.a.b.g
    public void a(d<K, V> dVar) {
        d<K, V> dVar2 = null;
        if (this.f865b == dVar && dVar == this.f866c) {
            this.f866c = null;
            this.f865b = null;
        }
        d<K, V> dVar3 = this.f865b;
        if (dVar3 == dVar) {
            this.f865b = b(dVar3);
        }
        d<K, V> dVar4 = this.f866c;
        if (dVar4 == dVar) {
            d<K, V> dVar5 = this.f865b;
            if (dVar4 != dVar5 && dVar5 != null) {
                dVar2 = c(dVar4);
            }
            this.f866c = dVar2;
        }
    }

    public abstract d<K, V> b(d<K, V> dVar);

    public abstract d<K, V> c(d<K, V> dVar);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f866c != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        d<K, V> dVar = this.f866c;
        d<K, V> dVar2 = this.f865b;
        this.f866c = (dVar == dVar2 || dVar2 == null) ? null : c(dVar);
        return dVar;
    }
}
