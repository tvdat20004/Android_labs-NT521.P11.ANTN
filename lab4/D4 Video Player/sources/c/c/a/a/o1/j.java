package c.c.a.a.o1;

import c.c.a.a.o1.g;
import c.c.a.a.o1.h;
import c.c.a.a.x1.p;
import java.lang.Exception;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class j<I extends g, O extends h, E extends Exception> implements e<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    public final Thread f2185a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2186b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque<I> f2187c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque<O> f2188d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    public final I[] f2189e;

    /* renamed from: f, reason: collision with root package name */
    public final O[] f2190f;
    public int g;
    public int h;
    public I i;
    public E j;
    public boolean k;
    public boolean l;
    public int m;

    public j(I[] iArr, O[] oArr) {
        this.f2189e = iArr;
        this.g = iArr.length;
        for (int i = 0; i < this.g; i++) {
            this.f2189e[i] = new c.c.a.a.v1.j();
        }
        this.f2190f = oArr;
        this.h = oArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f2190f[i2] = new c.c.a.a.v1.d((c.c.a.a.v1.c) this);
        }
        i iVar = new i(this);
        this.f2185a = iVar;
        iVar.start();
    }

    @Override // c.c.a.a.o1.e
    public void a() {
        synchronized (this.f2186b) {
            this.l = true;
            this.f2186b.notify();
        }
        try {
            this.f2185a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // c.c.a.a.o1.e
    public void c(Object obj) {
        g gVar = (g) obj;
        synchronized (this.f2186b) {
            i();
            p.c(gVar == this.i);
            this.f2187c.addLast(gVar);
            h();
            this.i = null;
        }
    }

    @Override // c.c.a.a.o1.e
    public Object d() {
        O removeFirst;
        synchronized (this.f2186b) {
            i();
            removeFirst = this.f2188d.isEmpty() ? null : this.f2188d.removeFirst();
        }
        return removeFirst;
    }

    @Override // c.c.a.a.o1.e
    public Object e() {
        I i;
        synchronized (this.f2186b) {
            i();
            p.g(this.i == null);
            int i2 = this.g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f2189e;
                int i3 = i2 - 1;
                this.g = i3;
                i = iArr[i3];
            }
            this.i = i;
        }
        return i;
    }

    public abstract E f(I i, O o, boolean z);

    @Override // c.c.a.a.o1.e
    public final void flush() {
        synchronized (this.f2186b) {
            this.k = true;
            this.m = 0;
            I i = this.i;
            if (i != null) {
                j(i);
                this.i = null;
            }
            while (!this.f2187c.isEmpty()) {
                j(this.f2187c.removeFirst());
            }
            while (!this.f2188d.isEmpty()) {
                this.f2188d.removeFirst().i();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f2186b
            monitor-enter(r0)
        L3:
            boolean r1 = r7.l     // Catch: java.lang.Throwable -> L9e
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L20
            java.util.ArrayDeque<I extends c.c.a.a.o1.g> r1 = r7.f2187c     // Catch: java.lang.Throwable -> L9e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L9e
            if (r1 != 0) goto L17
            int r1 = r7.h     // Catch: java.lang.Throwable -> L9e
            if (r1 <= 0) goto L17
            r1 = r2
            goto L18
        L17:
            r1 = r3
        L18:
            if (r1 != 0) goto L20
            java.lang.Object r1 = r7.f2186b     // Catch: java.lang.Throwable -> L9e
            r1.wait()     // Catch: java.lang.Throwable -> L9e
            goto L3
        L20:
            boolean r1 = r7.l     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
            return r3
        L26:
            java.util.ArrayDeque<I extends c.c.a.a.o1.g> r1 = r7.f2187c     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L9e
            c.c.a.a.o1.g r1 = (c.c.a.a.o1.g) r1     // Catch: java.lang.Throwable -> L9e
            O extends c.c.a.a.o1.h[] r4 = r7.f2190f     // Catch: java.lang.Throwable -> L9e
            int r5 = r7.h     // Catch: java.lang.Throwable -> L9e
            int r5 = r5 - r2
            r7.h = r5     // Catch: java.lang.Throwable -> L9e
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L9e
            boolean r5 = r7.k     // Catch: java.lang.Throwable -> L9e
            r7.k = r3     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
            boolean r0 = r1.h()
            if (r0 == 0) goto L47
            r0 = 4
            r4.e(r0)
            goto L78
        L47:
            boolean r0 = r1.g()
            if (r0 == 0) goto L52
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.e(r0)
        L52:
            java.lang.Exception r0 = r7.f(r1, r4, r5)     // Catch: java.lang.OutOfMemoryError -> L59 java.lang.RuntimeException -> L62
            r7.j = r0     // Catch: java.lang.OutOfMemoryError -> L59 java.lang.RuntimeException -> L62
            goto L6c
        L59:
            r0 = move-exception
            c.c.a.a.v1.g r5 = new c.c.a.a.v1.g
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L6a
        L62:
            r0 = move-exception
            c.c.a.a.v1.g r5 = new c.c.a.a.v1.g
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L6a:
            r7.j = r5
        L6c:
            E extends java.lang.Exception r0 = r7.j
            if (r0 == 0) goto L78
            java.lang.Object r0 = r7.f2186b
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            return r3
        L75:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            throw r1
        L78:
            java.lang.Object r5 = r7.f2186b
            monitor-enter(r5)
            boolean r0 = r7.k     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L80
            goto L8b
        L80:
            boolean r0 = r4.g()     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L8f
            int r0 = r7.m     // Catch: java.lang.Throwable -> L9b
            int r0 = r0 + r2
            r7.m = r0     // Catch: java.lang.Throwable -> L9b
        L8b:
            r4.i()     // Catch: java.lang.Throwable -> L9b
            goto L96
        L8f:
            r7.m = r3     // Catch: java.lang.Throwable -> L9b
            java.util.ArrayDeque<O extends c.c.a.a.o1.h> r0 = r7.f2188d     // Catch: java.lang.Throwable -> L9b
            r0.addLast(r4)     // Catch: java.lang.Throwable -> L9b
        L96:
            r7.j(r1)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9b
            return r2
        L9b:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9b
            throw r0
        L9e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.o1.j.g():boolean");
    }

    public final void h() {
        if (!this.f2187c.isEmpty() && this.h > 0) {
            this.f2186b.notify();
        }
    }

    public final void i() {
        E e2 = this.j;
        if (e2 != null) {
            throw e2;
        }
    }

    public final void j(I i) {
        i.i();
        I[] iArr = this.f2189e;
        int i2 = this.g;
        this.g = i2 + 1;
        iArr[i2] = i;
    }
}
