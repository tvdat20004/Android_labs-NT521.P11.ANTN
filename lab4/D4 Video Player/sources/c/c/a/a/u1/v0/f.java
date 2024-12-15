package c.c.a.a.u1.v0;

import android.util.SparseArray;
import c.c.a.a.l0;
import c.c.a.a.q1.v;
import c.c.a.a.q1.y;

/* loaded from: classes.dex */
public final class f implements c.c.a.a.q1.n {

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.q1.m f2954b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2955c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f2956d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray<e> f2957e = new SparseArray<>();

    /* renamed from: f, reason: collision with root package name */
    public boolean f2958f;
    public c g;
    public long h;
    public v i;
    public l0[] j;

    public f(c.c.a.a.q1.m mVar, int i, l0 l0Var) {
        this.f2954b = mVar;
        this.f2955c = i;
        this.f2956d = l0Var;
    }

    @Override // c.c.a.a.q1.n
    public void a(v vVar) {
        this.i = vVar;
    }

    public void b(c cVar, long j, long j2) {
        this.g = cVar;
        this.h = j2;
        if (!this.f2958f) {
            this.f2954b.e(this);
            if (j != -9223372036854775807L) {
                this.f2954b.h(0L, j);
            }
            this.f2958f = true;
            return;
        }
        c.c.a.a.q1.m mVar = this.f2954b;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        mVar.h(0L, j);
        for (int i = 0; i < this.f2957e.size(); i++) {
            this.f2957e.valueAt(i).e(cVar, j2);
        }
    }

    @Override // c.c.a.a.q1.n
    public void c() {
        l0[] l0VarArr = new l0[this.f2957e.size()];
        for (int i = 0; i < this.f2957e.size(); i++) {
            l0VarArr[i] = this.f2957e.valueAt(i).f2952e;
        }
        this.j = l0VarArr;
    }

    @Override // c.c.a.a.q1.n
    public y j(int i, int i2) {
        e eVar = this.f2957e.get(i);
        if (eVar == null) {
            c.c.a.a.x1.p.g(this.j == null);
            eVar = new e(i, i2, i2 == this.f2955c ? this.f2956d : null);
            eVar.e(this.g, this.h);
            this.f2957e.put(i, eVar);
        }
        return eVar;
    }
}
