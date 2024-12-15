package c.c.a.a.q1.g0;

import android.util.Pair;

/* loaded from: classes.dex */
public final class t implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f2597a;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.z1.z f2598b;

    /* renamed from: c, reason: collision with root package name */
    public final c.c.a.a.z1.y f2599c;

    /* renamed from: d, reason: collision with root package name */
    public c.c.a.a.q1.y f2600d;

    /* renamed from: e, reason: collision with root package name */
    public c.c.a.a.l0 f2601e;

    /* renamed from: f, reason: collision with root package name */
    public String f2602f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;

    public t(String str) {
        this.f2597a = str;
        c.c.a.a.z1.z zVar = new c.c.a.a.z1.z(1024);
        this.f2598b = zVar;
        this.f2599c = new c.c.a.a.z1.y(zVar.f3800a);
    }

    public static long b(c.c.a.a.z1.y yVar) {
        return yVar.f((yVar.f(2) + 1) * 8);
    }

    @Override // c.c.a.a.q1.g0.j
    public void a() {
        this.g = 0;
        this.l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0142, code lost:
    
        if (r23.l == false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012a  */
    @Override // c.c.a.a.q1.g0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(c.c.a.a.z1.z r24) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.g0.t.c(c.c.a.a.z1.z):void");
    }

    @Override // c.c.a.a.q1.g0.j
    public void d() {
    }

    @Override // c.c.a.a.q1.g0.j
    public void e(long j, int i) {
        this.k = j;
    }

    @Override // c.c.a.a.q1.g0.j
    public void f(c.c.a.a.q1.n nVar, p0 p0Var) {
        p0Var.a();
        this.f2600d = nVar.j(p0Var.c(), 1);
        this.f2602f = p0Var.b();
    }

    public final int g(c.c.a.a.z1.y yVar) {
        int b2 = yVar.b();
        Pair<Integer, Integer> d2 = c.c.a.a.z1.h.d(yVar, true);
        this.r = ((Integer) d2.first).intValue();
        this.t = ((Integer) d2.second).intValue();
        return b2 - yVar.b();
    }
}
