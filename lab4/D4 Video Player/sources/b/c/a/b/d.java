package b.c.a.b;

import java.util.Map;

/* loaded from: classes.dex */
public class d<K, V> implements Map.Entry<K, V> {

    /* renamed from: b, reason: collision with root package name */
    public final K f854b;

    /* renamed from: c, reason: collision with root package name */
    public final V f855c;

    /* renamed from: d, reason: collision with root package name */
    public d<K, V> f856d;

    /* renamed from: e, reason: collision with root package name */
    public d<K, V> f857e;

    public d(K k, V v) {
        this.f854b = k;
        this.f855c = v;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f854b.equals(dVar.f854b) && this.f855c.equals(dVar.f855c);
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.f854b;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f855c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return this.f854b.hashCode() ^ this.f855c.hashCode();
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public String toString() {
        return this.f854b + "=" + this.f855c;
    }
}
