package c.c.a.a.l1;

import c.c.a.a.i1;
import c.c.a.a.k1;
import c.c.a.a.u1.w;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public b f2048d;

    /* renamed from: e, reason: collision with root package name */
    public b f2049e;
    public boolean g;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f2045a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<w, b> f2046b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final i1 f2047c = new i1();

    /* renamed from: f, reason: collision with root package name */
    public k1 f2050f = k1.f2035a;

    public final void a() {
        if (this.f2045a.isEmpty()) {
            return;
        }
        this.f2048d = this.f2045a.get(0);
    }

    public final b b(b bVar, k1 k1Var) {
        int b2 = k1Var.b(bVar.f2042a.f2972a);
        if (b2 == -1) {
            return bVar;
        }
        return new b(bVar.f2042a, k1Var, k1Var.f(b2, this.f2047c).f2021b);
    }
}
