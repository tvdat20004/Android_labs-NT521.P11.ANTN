package b.e;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes.dex */
public class c<E> extends h<E, E> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f876d;

    public c(d dVar) {
        this.f876d = dVar;
    }

    @Override // b.e.h
    public void a() {
        this.f876d.clear();
    }

    @Override // b.e.h
    public Object b(int i, int i2) {
        return this.f876d.f879c[i];
    }

    @Override // b.e.h
    public Map<E, E> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // b.e.h
    public int d() {
        return this.f876d.f880d;
    }

    @Override // b.e.h
    public int e(Object obj) {
        return this.f876d.c(obj);
    }

    @Override // b.e.h
    public int f(Object obj) {
        return this.f876d.c(obj);
    }

    @Override // b.e.h
    public void g(E e2, E e3) {
        this.f876d.add(e2);
    }

    @Override // b.e.h
    public void h(int i) {
        this.f876d.f(i);
    }

    @Override // b.e.h
    public E i(int i, E e2) {
        throw new UnsupportedOperationException("not a map");
    }
}
