package c.c.a.a.v1.n;

import c.c.a.a.x1.p;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public abstract class k implements c.c.a.a.v1.f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque<i> f3279a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<c.c.a.a.v1.k> f3280b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityQueue<i> f3281c;

    /* renamed from: d, reason: collision with root package name */
    public i f3282d;

    /* renamed from: e, reason: collision with root package name */
    public long f3283e;

    /* renamed from: f, reason: collision with root package name */
    public long f3284f;

    public k() {
        for (int i = 0; i < 10; i++) {
            this.f3279a.add(new i(null));
        }
        this.f3280b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f3280b.add(new j(this, null));
        }
        this.f3281c = new PriorityQueue<>();
    }

    @Override // c.c.a.a.o1.e
    public void a() {
    }

    @Override // c.c.a.a.v1.f
    public void b(long j) {
        this.f3283e = j;
    }

    @Override // c.c.a.a.o1.e
    public void c(c.c.a.a.v1.j jVar) {
        c.c.a.a.v1.j jVar2 = jVar;
        p.c(jVar2 == this.f3282d);
        if (jVar2.g()) {
            i(this.f3282d);
        } else {
            i iVar = this.f3282d;
            long j = this.f3284f;
            this.f3284f = 1 + j;
            iVar.h = j;
            this.f3281c.add(iVar);
        }
        this.f3282d = null;
    }

    @Override // c.c.a.a.o1.e
    public c.c.a.a.v1.k d() {
        c.c.a.a.v1.k kVar = null;
        if (!this.f3280b.isEmpty()) {
            while (!this.f3281c.isEmpty() && this.f3281c.peek().f2181e <= this.f3283e) {
                i poll = this.f3281c.poll();
                if (poll.h()) {
                    kVar = this.f3280b.pollFirst();
                    kVar.e(4);
                } else {
                    g(poll);
                    if (h()) {
                        c.c.a.a.v1.e f2 = f();
                        if (!poll.g()) {
                            kVar = this.f3280b.pollFirst();
                            long j = poll.f2181e;
                            kVar.f2183c = j;
                            kVar.f3257d = f2;
                            kVar.f3258e = j;
                        }
                    }
                    i(poll);
                }
                i(poll);
            }
        }
        return kVar;
    }

    @Override // c.c.a.a.o1.e
    public c.c.a.a.v1.j e() {
        p.g(this.f3282d == null);
        if (this.f3279a.isEmpty()) {
            return null;
        }
        i pollFirst = this.f3279a.pollFirst();
        this.f3282d = pollFirst;
        return pollFirst;
    }

    public abstract c.c.a.a.v1.e f();

    @Override // c.c.a.a.o1.e
    public void flush() {
        this.f3284f = 0L;
        this.f3283e = 0L;
        while (!this.f3281c.isEmpty()) {
            i(this.f3281c.poll());
        }
        i iVar = this.f3282d;
        if (iVar != null) {
            i(iVar);
            this.f3282d = null;
        }
    }

    public abstract void g(c.c.a.a.v1.j jVar);

    public abstract boolean h();

    public final void i(i iVar) {
        iVar.i();
        this.f3279a.add(iVar);
    }
}
