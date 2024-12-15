package c.c.a.a.u1;

import android.os.Looper;
import c.c.a.a.k1;
import c.c.a.a.y1.x0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<c.c.a.a.i0> f2899b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    public final y f2900c = new y();

    /* renamed from: d, reason: collision with root package name */
    public Looper f2901d;

    /* renamed from: e, reason: collision with root package name */
    public k1 f2902e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2903f;

    public final y a(w wVar) {
        return new y(this.f2900c.f3196c, 0, wVar, 0L);
    }

    public abstract v b(w wVar, c.c.a.a.y1.r rVar, long j);

    public abstract void c();

    public abstract void d(x0 x0Var);

    public final void e(k1 k1Var, Object obj) {
        this.f2902e = k1Var;
        this.f2903f = obj;
        Iterator<c.c.a.a.i0> it = this.f2899b.iterator();
        while (it.hasNext()) {
            it.next().h.b(8, new c.c.a.a.e0(this, k1Var, obj)).sendToTarget();
        }
    }

    public abstract void f(v vVar);

    public abstract void g();

    public final void h(c.c.a.a.l1.d dVar) {
        y yVar = this.f2900c;
        Iterator<x> it = yVar.f3196c.iterator();
        while (it.hasNext()) {
            x next = it.next();
            if (next.f3099b == dVar) {
                yVar.f3196c.remove(next);
            }
        }
    }
}
