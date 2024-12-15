package c.c.a.a.u1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class n implements l0 {

    /* renamed from: b, reason: collision with root package name */
    public final l0 f2904b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2905c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f2906d;

    public n(o oVar, l0 l0Var) {
        this.f2906d = oVar;
        this.f2904b = l0Var;
    }

    @Override // c.c.a.a.u1.l0
    public void a() {
        this.f2904b.a();
    }

    @Override // c.c.a.a.u1.l0
    public boolean c() {
        return !this.f2906d.i() && this.f2904b.c();
    }

    @Override // c.c.a.a.u1.l0
    public int j(c.c.a.a.m0 m0Var, c.c.a.a.o1.g gVar, boolean z) {
        if (this.f2906d.i()) {
            return -3;
        }
        if (this.f2905c) {
            gVar.f2165b = 4;
            return -4;
        }
        int j = this.f2904b.j(m0Var, gVar, z);
        if (j == -5) {
            c.c.a.a.l0 l0Var = m0Var.f2058a;
            int i = l0Var.z;
            if (i != 0 || l0Var.A != 0) {
                o oVar = this.f2906d;
                Objects.requireNonNull(oVar);
                m0Var.f2058a = l0Var.k(i, oVar.f2911f == Long.MIN_VALUE ? l0Var.A : 0);
            }
            return -5;
        }
        o oVar2 = this.f2906d;
        long j2 = oVar2.f2911f;
        if (j2 == Long.MIN_VALUE || ((j != -4 || gVar.f2181e < j2) && !(j == -3 && oVar2.d() == Long.MIN_VALUE))) {
            return j;
        }
        gVar.i();
        gVar.f2165b = 4;
        this.f2905c = true;
        return -4;
    }

    @Override // c.c.a.a.u1.l0
    public int r(long j) {
        if (this.f2906d.i()) {
            return -3;
        }
        return this.f2904b.r(j);
    }
}
