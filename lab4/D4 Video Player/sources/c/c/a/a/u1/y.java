package c.c.a.a.u1;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import c.c.a.a.k1;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f3194a;

    /* renamed from: b, reason: collision with root package name */
    public final w f3195b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList<x> f3196c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3197d;

    public y() {
        this.f3196c = new CopyOnWriteArrayList<>();
        this.f3194a = 0;
        this.f3195b = null;
        this.f3197d = 0L;
    }

    public y(CopyOnWriteArrayList<x> copyOnWriteArrayList, int i, w wVar, long j) {
        this.f3196c = copyOnWriteArrayList;
        this.f3194a = i;
        this.f3195b = wVar;
        this.f3197d = j;
    }

    public final long a(long j) {
        long b2 = c.c.a.a.s.b(j);
        if (b2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f3197d + b2;
    }

    public void b(int i, c.c.a.a.l0 l0Var, int i2, Object obj, long j) {
        final a0 a0Var = new a0(1, i, l0Var, i2, obj, a(j), -9223372036854775807L);
        Iterator<x> it = this.f3196c.iterator();
        while (it.hasNext()) {
            x next = it.next();
            final c.c.a.a.l1.d dVar = next.f3099b;
            m(next.f3098a, new Runnable() { // from class: c.c.a.a.u1.d
                @Override // java.lang.Runnable
                public final void run() {
                    y yVar = y.this;
                    c.c.a.a.l1.d dVar2 = dVar;
                    a0 a0Var2 = a0Var;
                    c.c.a.a.l1.e E = dVar2.E(yVar.f3194a, yVar.f3195b);
                    Iterator<c.c.a.a.l1.f> it2 = dVar2.f2051b.iterator();
                    while (it2.hasNext()) {
                        it2.next().D(E, a0Var2);
                    }
                }
            });
        }
    }

    public void c(c.c.a.a.y1.q qVar, Uri uri, Map<String, List<String>> map, int i, int i2, c.c.a.a.l0 l0Var, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        final z zVar = new z(qVar, uri, map, j3, j4, j5);
        final a0 a0Var = new a0(i, i2, l0Var, i3, obj, a(j), a(j2));
        Iterator<x> it = this.f3196c.iterator();
        while (it.hasNext()) {
            x next = it.next();
            final c.c.a.a.l1.d dVar = next.f3099b;
            m(next.f3098a, new Runnable() { // from class: c.c.a.a.u1.e
                @Override // java.lang.Runnable
                public final void run() {
                    y yVar = y.this;
                    c.c.a.a.l1.d dVar2 = dVar;
                    z zVar2 = zVar;
                    a0 a0Var2 = a0Var;
                    c.c.a.a.l1.e E = dVar2.E(yVar.f3194a, yVar.f3195b);
                    Iterator<c.c.a.a.l1.f> it2 = dVar2.f2051b.iterator();
                    while (it2.hasNext()) {
                        it2.next().j(E, zVar2, a0Var2);
                    }
                }
            });
        }
    }

    public void d(c.c.a.a.y1.q qVar, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
        c(qVar, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
    }

    public void e(c.c.a.a.y1.q qVar, Uri uri, Map<String, List<String>> map, int i, int i2, c.c.a.a.l0 l0Var, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        final z zVar = new z(qVar, uri, map, j3, j4, j5);
        final a0 a0Var = new a0(i, i2, l0Var, i3, obj, a(j), a(j2));
        Iterator<x> it = this.f3196c.iterator();
        while (it.hasNext()) {
            x next = it.next();
            final c.c.a.a.l1.d dVar = next.f3099b;
            m(next.f3098a, new Runnable() { // from class: c.c.a.a.u1.g
                @Override // java.lang.Runnable
                public final void run() {
                    y yVar = y.this;
                    c.c.a.a.l1.d dVar2 = dVar;
                    z zVar2 = zVar;
                    a0 a0Var2 = a0Var;
                    c.c.a.a.l1.e E = dVar2.E(yVar.f3194a, yVar.f3195b);
                    Iterator<c.c.a.a.l1.f> it2 = dVar2.f2051b.iterator();
                    while (it2.hasNext()) {
                        it2.next().f(E, zVar2, a0Var2);
                    }
                }
            });
        }
    }

    public void f(c.c.a.a.y1.q qVar, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
        e(qVar, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
    }

    public void g(c.c.a.a.y1.q qVar, Uri uri, Map<String, List<String>> map, int i, int i2, c.c.a.a.l0 l0Var, int i3, Object obj, long j, long j2, long j3, long j4, long j5, final IOException iOException, final boolean z) {
        final z zVar = new z(qVar, uri, map, j3, j4, j5);
        final a0 a0Var = new a0(i, i2, l0Var, i3, obj, a(j), a(j2));
        Iterator<x> it = this.f3196c.iterator();
        while (it.hasNext()) {
            x next = it.next();
            final c.c.a.a.l1.d dVar = next.f3099b;
            m(next.f3098a, new Runnable() { // from class: c.c.a.a.u1.c
                @Override // java.lang.Runnable
                public final void run() {
                    y yVar = y.this;
                    c.c.a.a.l1.d dVar2 = dVar;
                    z zVar2 = zVar;
                    a0 a0Var2 = a0Var;
                    IOException iOException2 = iOException;
                    boolean z2 = z;
                    c.c.a.a.l1.e E = dVar2.E(yVar.f3194a, yVar.f3195b);
                    Iterator<c.c.a.a.l1.f> it2 = dVar2.f2051b.iterator();
                    while (it2.hasNext()) {
                        it2.next().A(E, zVar2, a0Var2, iOException2, z2);
                    }
                }
            });
        }
    }

    public void h(c.c.a.a.y1.q qVar, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3, IOException iOException, boolean z) {
        g(qVar, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
    }

    public void i(c.c.a.a.y1.q qVar, int i, int i2, c.c.a.a.l0 l0Var, int i3, Object obj, long j, long j2, long j3) {
        final z zVar = new z(qVar, qVar.f3651a, Collections.emptyMap(), j3, 0L, 0L);
        final a0 a0Var = new a0(i, i2, l0Var, i3, obj, a(j), a(j2));
        Iterator<x> it = this.f3196c.iterator();
        while (it.hasNext()) {
            x next = it.next();
            final c.c.a.a.l1.d dVar = next.f3099b;
            m(next.f3098a, new Runnable() { // from class: c.c.a.a.u1.a
                @Override // java.lang.Runnable
                public final void run() {
                    y yVar = y.this;
                    c.c.a.a.l1.d dVar2 = dVar;
                    z zVar2 = zVar;
                    a0 a0Var2 = a0Var;
                    c.c.a.a.l1.e E = dVar2.E(yVar.f3194a, yVar.f3195b);
                    Iterator<c.c.a.a.l1.f> it2 = dVar2.f2051b.iterator();
                    while (it2.hasNext()) {
                        it2.next().u(E, zVar2, a0Var2);
                    }
                }
            });
        }
    }

    public void j(c.c.a.a.y1.q qVar, int i, long j) {
        i(qVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j);
    }

    public void k() {
        final w wVar = this.f3195b;
        Objects.requireNonNull(wVar);
        Iterator<x> it = this.f3196c.iterator();
        while (it.hasNext()) {
            x next = it.next();
            final c.c.a.a.l1.d dVar = next.f3099b;
            m(next.f3098a, new Runnable() { // from class: c.c.a.a.u1.i
                @Override // java.lang.Runnable
                public final void run() {
                    y yVar = y.this;
                    c.c.a.a.l1.d dVar2 = dVar;
                    w wVar2 = wVar;
                    int i = yVar.f3194a;
                    c.c.a.a.l1.c cVar = dVar2.f2054e;
                    c.c.a.a.l1.b bVar = new c.c.a.a.l1.b(wVar2, cVar.f2050f.b(wVar2.f2972a) != -1 ? cVar.f2050f : k1.f2035a, i);
                    cVar.f2045a.add(bVar);
                    cVar.f2046b.put(wVar2, bVar);
                    if (cVar.f2045a.size() == 1 && !cVar.f2050f.p()) {
                        cVar.a();
                    }
                    c.c.a.a.l1.e E = dVar2.E(i, wVar2);
                    Iterator<c.c.a.a.l1.f> it2 = dVar2.f2051b.iterator();
                    while (it2.hasNext()) {
                        it2.next().n(E);
                    }
                }
            });
        }
    }

    public void l() {
        final w wVar = this.f3195b;
        Objects.requireNonNull(wVar);
        Iterator<x> it = this.f3196c.iterator();
        while (it.hasNext()) {
            x next = it.next();
            final c.c.a.a.l1.d dVar = next.f3099b;
            m(next.f3098a, new Runnable() { // from class: c.c.a.a.u1.f
                @Override // java.lang.Runnable
                public final void run() {
                    y yVar = y.this;
                    dVar.H(yVar.f3194a, wVar);
                }
            });
        }
    }

    public final void m(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public void n() {
        final w wVar = this.f3195b;
        Objects.requireNonNull(wVar);
        Iterator<x> it = this.f3196c.iterator();
        while (it.hasNext()) {
            x next = it.next();
            final c.c.a.a.l1.d dVar = next.f3099b;
            m(next.f3098a, new Runnable() { // from class: c.c.a.a.u1.h
                @Override // java.lang.Runnable
                public final void run() {
                    y yVar = y.this;
                    c.c.a.a.l1.d dVar2 = dVar;
                    w wVar2 = wVar;
                    int i = yVar.f3194a;
                    c.c.a.a.l1.c cVar = dVar2.f2054e;
                    cVar.f2049e = cVar.f2046b.get(wVar2);
                    c.c.a.a.l1.e E = dVar2.E(i, wVar2);
                    Iterator<c.c.a.a.l1.f> it2 = dVar2.f2051b.iterator();
                    while (it2.hasNext()) {
                        it2.next().r(E);
                    }
                }
            });
        }
    }
}
