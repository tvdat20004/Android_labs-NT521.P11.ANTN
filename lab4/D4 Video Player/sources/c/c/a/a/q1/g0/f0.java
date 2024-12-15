package c.c.a.a.q1.g0;

import java.util.List;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final List<c.c.a.a.l0> f2496a;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.q1.y[] f2497b;

    public f0(List<c.c.a.a.l0> list) {
        this.f2496a = list;
        this.f2497b = new c.c.a.a.q1.y[list.size()];
    }

    public void a(c.c.a.a.q1.n nVar, p0 p0Var) {
        for (int i = 0; i < this.f2497b.length; i++) {
            p0Var.a();
            c.c.a.a.q1.y j = nVar.j(p0Var.c(), 3);
            c.c.a.a.l0 l0Var = this.f2496a.get(i);
            String str = l0Var.j;
            c.c.a.a.x1.p.d("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = l0Var.f2037b;
            if (str2 == null) {
                str2 = p0Var.b();
            }
            j.b(c.c.a.a.l0.z(str2, str, null, -1, l0Var.f2039d, l0Var.B, l0Var.C, null, Long.MAX_VALUE, l0Var.l));
            this.f2497b[i] = j;
        }
    }
}
