package b.e;

import b.e.h.b;
import b.e.h.c;
import b.e.h.e;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class b<K, V> extends i<K, V> implements Map<K, V> {
    public h<K, V> i;

    public b() {
    }

    public b(int i) {
        super(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(i iVar) {
        if (iVar != null) {
            int i = iVar.f915d;
            b(this.f915d + i);
            if (this.f915d != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(iVar.h(i2), iVar.k(i2));
                }
            } else if (i > 0) {
                System.arraycopy(iVar.f913b, 0, this.f913b, 0, i);
                System.arraycopy(iVar.f914c, 0, this.f914c, 0, i << 1);
                this.f915d = i;
            }
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        h<K, V> l = l();
        if (l.f896a == null) {
            l.f896a = l.new b();
        }
        return l.f896a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        h<K, V> l = l();
        if (l.f897b == null) {
            l.f897b = l.new c();
        }
        return l.f897b;
    }

    public final h<K, V> l() {
        if (this.i == null) {
            this.i = new a(this);
        }
        return this.i;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f915d);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        h<K, V> l = l();
        if (l.f898c == null) {
            l.f898c = l.new e();
        }
        return l.f898c;
    }
}
