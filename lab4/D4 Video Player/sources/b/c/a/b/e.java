package b.c.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class e<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b, reason: collision with root package name */
    public d<K, V> f858b;

    /* renamed from: c, reason: collision with root package name */
    public d<K, V> f859c;

    /* renamed from: d, reason: collision with root package name */
    public WeakHashMap<g<K, V>, Boolean> f860d = new WeakHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public int f861e = 0;

    public class a implements Iterator<Map.Entry<K, V>>, g<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public d<K, V> f862b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f863c = true;

        public a() {
        }

        @Override // b.c.a.b.g
        public void a(d<K, V> dVar) {
            d<K, V> dVar2 = this.f862b;
            if (dVar == dVar2) {
                d<K, V> dVar3 = dVar2.f857e;
                this.f862b = dVar3;
                this.f863c = dVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f863c) {
                return e.this.f858b != null;
            }
            d<K, V> dVar = this.f862b;
            return (dVar == null || dVar.f856d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            d<K, V> dVar;
            if (this.f863c) {
                this.f863c = false;
                dVar = e.this.f858b;
            } else {
                d<K, V> dVar2 = this.f862b;
                dVar = dVar2 != null ? dVar2.f856d : null;
            }
            this.f862b = dVar;
            return dVar;
        }
    }

    public d<K, V> a(K k) {
        d<K, V> dVar = this.f858b;
        while (dVar != null && !dVar.f854b.equals(k)) {
            dVar = dVar.f856d;
        }
        return dVar;
    }

    public e<K, V>.a b() {
        e<K, V>.a aVar = new a();
        this.f860d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public d<K, V> c(K k, V v) {
        d<K, V> dVar = new d<>(k, v);
        this.f861e++;
        d<K, V> dVar2 = this.f859c;
        if (dVar2 == null) {
            this.f858b = dVar;
        } else {
            dVar2.f856d = dVar;
            dVar.f857e = dVar2;
        }
        this.f859c = dVar;
        return dVar;
    }

    public V d(K k, V v) {
        d<K, V> a2 = a(k);
        if (a2 != null) {
            return a2.f855c;
        }
        c(k, v);
        return null;
    }

    public V e(K k) {
        d<K, V> a2 = a(k);
        if (a2 == null) {
            return null;
        }
        this.f861e--;
        if (!this.f860d.isEmpty()) {
            Iterator<g<K, V>> it = this.f860d.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(a2);
            }
        }
        d<K, V> dVar = a2.f857e;
        d<K, V> dVar2 = a2.f856d;
        if (dVar != null) {
            dVar.f856d = dVar2;
        } else {
            this.f858b = dVar2;
        }
        d<K, V> dVar3 = a2.f856d;
        if (dVar3 != null) {
            dVar3.f857e = dVar;
        } else {
            this.f859c = dVar;
        }
        a2.f856d = null;
        a2.f857e = null;
        return a2.f855c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((b.c.a.b.f) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof b.c.a.b.e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            b.c.a.b.e r7 = (b.c.a.b.e) r7
            int r1 = r6.f861e
            int r3 = r7.f861e
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            b.c.a.b.f r3 = (b.c.a.b.f) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            b.c.a.b.f r4 = (b.c.a.b.f) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            b.c.a.b.f r7 = (b.c.a.b.f) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.a.b.e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (true) {
            f fVar = (f) it;
            if (!fVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) fVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        b bVar = new b(this.f858b, this.f859c);
        this.f860d.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            f fVar = (f) it;
            if (!fVar.hasNext()) {
                j.append("]");
                return j.toString();
            }
            j.append(((Map.Entry) fVar.next()).toString());
            if (fVar.hasNext()) {
                j.append(", ");
            }
        }
    }
}
