package b.c.a.b;

import java.util.HashMap;

/* loaded from: classes.dex */
public class a<K, V> extends e<K, V> {

    /* renamed from: f, reason: collision with root package name */
    public HashMap<K, d<K, V>> f853f = new HashMap<>();

    @Override // b.c.a.b.e
    public d<K, V> a(K k) {
        return this.f853f.get(k);
    }

    public boolean contains(K k) {
        return this.f853f.containsKey(k);
    }

    @Override // b.c.a.b.e
    public V d(K k, V v) {
        d<K, V> dVar = this.f853f.get(k);
        if (dVar != null) {
            return dVar.f855c;
        }
        this.f853f.put(k, c(k, v));
        return null;
    }

    @Override // b.c.a.b.e
    public V e(K k) {
        V v = (V) super.e(k);
        this.f853f.remove(k);
        return v;
    }
}
