package c.c.a.a.q1.g0;

import android.util.Log;

/* loaded from: classes.dex */
public final class s implements j {

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.z1.z f2591a = new c.c.a.a.z1.z(10);

    /* renamed from: b, reason: collision with root package name */
    public c.c.a.a.q1.y f2592b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2593c;

    /* renamed from: d, reason: collision with root package name */
    public long f2594d;

    /* renamed from: e, reason: collision with root package name */
    public int f2595e;

    /* renamed from: f, reason: collision with root package name */
    public int f2596f;

    @Override // c.c.a.a.q1.g0.j
    public void a() {
        this.f2593c = false;
    }

    @Override // c.c.a.a.q1.g0.j
    public void c(c.c.a.a.z1.z zVar) {
        if (this.f2593c) {
            int a2 = zVar.a();
            int i = this.f2596f;
            if (i < 10) {
                int min = Math.min(a2, 10 - i);
                System.arraycopy(zVar.f3800a, zVar.f3801b, this.f2591a.f3800a, this.f2596f, min);
                if (this.f2596f + min == 10) {
                    this.f2591a.A(0);
                    if (73 != this.f2591a.p() || 68 != this.f2591a.p() || 51 != this.f2591a.p()) {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f2593c = false;
                        return;
                    } else {
                        this.f2591a.B(3);
                        this.f2595e = this.f2591a.o() + 10;
                    }
                }
            }
            int min2 = Math.min(a2, this.f2595e - this.f2596f);
            this.f2592b.a(zVar, min2);
            this.f2596f += min2;
        }
    }

    @Override // c.c.a.a.q1.g0.j
    public void d() {
        int i;
        if (this.f2593c && (i = this.f2595e) != 0 && this.f2596f == i) {
            this.f2592b.d(this.f2594d, 1, i, 0, null);
            this.f2593c = false;
        }
    }

    @Override // c.c.a.a.q1.g0.j
    public void e(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f2593c = true;
        this.f2594d = j;
        this.f2595e = 0;
        this.f2596f = 0;
    }

    @Override // c.c.a.a.q1.g0.j
    public void f(c.c.a.a.q1.n nVar, p0 p0Var) {
        p0Var.a();
        c.c.a.a.q1.y j = nVar.j(p0Var.c(), 4);
        this.f2592b = j;
        j.b(c.c.a.a.l0.v(p0Var.b(), "application/id3", null, -1, null));
    }
}
