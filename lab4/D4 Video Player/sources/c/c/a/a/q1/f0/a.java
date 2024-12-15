package c.c.a.a.q1.f0;

import c.c.a.a.q1.j;
import c.c.a.a.q1.m;
import c.c.a.a.q1.n;
import c.c.a.a.q1.s;
import c.c.a.a.q1.u;
import c.c.a.a.q1.y;
import c.c.a.a.s0;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.z;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements m {
    public static final int i = l0.l("RCC\u0001");

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.l0 f2430a;

    /* renamed from: c, reason: collision with root package name */
    public y f2432c;

    /* renamed from: e, reason: collision with root package name */
    public int f2434e;

    /* renamed from: f, reason: collision with root package name */
    public long f2435f;
    public int g;
    public int h;

    /* renamed from: b, reason: collision with root package name */
    public final z f2431b = new z(9);

    /* renamed from: d, reason: collision with root package name */
    public int f2433d = 0;

    public a(c.c.a.a.l0 l0Var) {
        this.f2430a = l0Var;
    }

    @Override // c.c.a.a.q1.m
    public void a() {
    }

    @Override // c.c.a.a.q1.m
    public int d(j jVar, s sVar) {
        long j;
        while (true) {
            int i2 = this.f2433d;
            boolean z = false;
            boolean z2 = true;
            if (i2 == 0) {
                this.f2431b.v();
                if (jVar.g(this.f2431b.f3800a, 0, 8, true)) {
                    if (this.f2431b.d() != i) {
                        throw new IOException("Input not RawCC");
                    }
                    this.f2434e = this.f2431b.p();
                    z = true;
                }
                if (!z) {
                    return -1;
                }
                this.f2433d = 1;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException();
                    }
                    while (this.g > 0) {
                        this.f2431b.v();
                        jVar.g(this.f2431b.f3800a, 0, 3, false);
                        this.f2432c.a(this.f2431b, 3);
                        this.h += 3;
                        this.g--;
                    }
                    int i3 = this.h;
                    if (i3 > 0) {
                        this.f2432c.d(this.f2435f, 1, i3, 0, null);
                    }
                    this.f2433d = 1;
                    return 0;
                }
                this.f2431b.v();
                int i4 = this.f2434e;
                if (i4 == 0) {
                    if (jVar.g(this.f2431b.f3800a, 0, 5, true)) {
                        j = (this.f2431b.q() * 1000) / 45;
                        this.f2435f = j;
                        this.g = this.f2431b.p();
                        this.h = 0;
                    }
                    z2 = false;
                } else {
                    if (i4 != 1) {
                        StringBuilder j2 = c.a.a.a.a.j("Unsupported version number: ");
                        j2.append(this.f2434e);
                        throw new s0(j2.toString());
                    }
                    if (jVar.g(this.f2431b.f3800a, 0, 9, true)) {
                        j = this.f2431b.j();
                        this.f2435f = j;
                        this.g = this.f2431b.p();
                        this.h = 0;
                    }
                    z2 = false;
                }
                if (!z2) {
                    this.f2433d = 0;
                    return -1;
                }
                this.f2433d = 2;
            }
        }
    }

    @Override // c.c.a.a.q1.m
    public void e(n nVar) {
        nVar.a(new u(-9223372036854775807L, 0L));
        this.f2432c = nVar.j(0, 3);
        nVar.c();
        this.f2432c.b(this.f2430a);
    }

    @Override // c.c.a.a.q1.m
    public void h(long j, long j2) {
        this.f2433d = 0;
    }

    @Override // c.c.a.a.q1.m
    public boolean i(j jVar) {
        this.f2431b.v();
        jVar.d(this.f2431b.f3800a, 0, 8, false);
        return this.f2431b.d() == i;
    }
}
