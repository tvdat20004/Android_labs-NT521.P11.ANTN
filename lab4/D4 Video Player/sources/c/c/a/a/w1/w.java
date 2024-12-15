package c.c.a.a.w1;

import c.c.a.a.c1;
import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f3450a;

    /* renamed from: b, reason: collision with root package name */
    public final c1[] f3451b;

    /* renamed from: c, reason: collision with root package name */
    public final s f3452c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3453d;

    public w(c1[] c1VarArr, r[] rVarArr, Object obj) {
        this.f3451b = c1VarArr;
        this.f3452c = new s(rVarArr);
        this.f3453d = obj;
        this.f3450a = c1VarArr.length;
    }

    public boolean a(w wVar, int i) {
        return wVar != null && l0.a(this.f3451b[i], wVar.f3451b[i]) && l0.a(this.f3452c.f3441b[i], wVar.f3452c.f3441b[i]);
    }

    public boolean b(int i) {
        return this.f3451b[i] != null;
    }
}
