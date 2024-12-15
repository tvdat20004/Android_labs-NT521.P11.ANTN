package c.c.a.a;

import c.c.a.a.w1.o;
import c.c.a.a.x0;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class b0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final t0 f1975b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList<o> f1976c;

    /* renamed from: d, reason: collision with root package name */
    public final c.c.a.a.w1.v f1977d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1978e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1979f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public b0(t0 t0Var, t0 t0Var2, CopyOnWriteArrayList<o> copyOnWriteArrayList, c.c.a.a.w1.v vVar, boolean z, int i, int i2, boolean z2, boolean z3) {
        this.f1975b = t0Var;
        this.f1976c = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        this.f1977d = vVar;
        this.f1978e = z;
        this.f1979f = i;
        this.g = i2;
        this.h = z2;
        this.m = z3;
        this.i = t0Var2.f2810f != t0Var.f2810f;
        this.j = (t0Var2.f2805a == t0Var.f2805a && t0Var2.f2806b == t0Var.f2806b) ? false : true;
        this.k = t0Var2.g != t0Var.g;
        this.l = t0Var2.i != t0Var.i;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.j || this.g == 0) {
            c0.G(this.f1976c, new p() { // from class: c.c.a.a.d
                @Override // c.c.a.a.p
                public final void a(x0.a aVar) {
                    b0 b0Var = b0.this;
                    t0 t0Var = b0Var.f1975b;
                    aVar.n(t0Var.f2805a, t0Var.f2806b, b0Var.g);
                }
            });
        }
        if (this.f1978e) {
            c0.G(this.f1976c, new p() { // from class: c.c.a.a.f
                @Override // c.c.a.a.p
                public final void a(x0.a aVar) {
                    aVar.e(b0.this.f1979f);
                }
            });
        }
        if (this.l) {
            c.c.a.a.w1.v vVar = this.f1977d;
            Object obj = this.f1975b.i.f3453d;
            c.c.a.a.w1.o oVar = (c.c.a.a.w1.o) vVar;
            Objects.requireNonNull(oVar);
            oVar.f3429c = (o.a) obj;
            c0.G(this.f1976c, new p() { // from class: c.c.a.a.c
                @Override // c.c.a.a.p
                public final void a(x0.a aVar) {
                    t0 t0Var = b0.this.f1975b;
                    aVar.i(t0Var.h, t0Var.i.f3452c);
                }
            });
        }
        if (this.k) {
            c0.G(this.f1976c, new p() { // from class: c.c.a.a.g
                @Override // c.c.a.a.p
                public final void a(x0.a aVar) {
                    aVar.c(b0.this.f1975b.g);
                }
            });
        }
        if (this.i) {
            c0.G(this.f1976c, new p() { // from class: c.c.a.a.e
                @Override // c.c.a.a.p
                public final void a(x0.a aVar) {
                    b0 b0Var = b0.this;
                    aVar.b(b0Var.m, b0Var.f1975b.f2810f);
                }
            });
        }
        if (this.h) {
            c0.G(this.f1976c, new p() { // from class: c.c.a.a.n
                @Override // c.c.a.a.p
                public final void a(x0.a aVar) {
                    aVar.u();
                }
            });
        }
    }
}
