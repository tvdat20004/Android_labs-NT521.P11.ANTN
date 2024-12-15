package b.e;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
public class a<K, V> extends h<K, V> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f875d;

    public a(b bVar) {
        this.f875d = bVar;
    }

    @Override // b.e.h
    public void a() {
        this.f875d.clear();
    }

    @Override // b.e.h
    public Object b(int i, int i2) {
        return this.f875d.f914c[(i << 1) + i2];
    }

    @Override // b.e.h
    public Map<K, V> c() {
        return this.f875d;
    }

    @Override // b.e.h
    public int d() {
        return this.f875d.f915d;
    }

    @Override // b.e.h
    public int e(Object obj) {
        return this.f875d.e(obj);
    }

    @Override // b.e.h
    public int f(Object obj) {
        return this.f875d.g(obj);
    }

    @Override // b.e.h
    public void g(K k, V v) {
        this.f875d.put(k, v);
    }

    @Override // b.e.h
    public void h(int i) {
        this.f875d.i(i);
    }

    @Override // b.e.h
    public V i(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f875d.f914c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }
}
