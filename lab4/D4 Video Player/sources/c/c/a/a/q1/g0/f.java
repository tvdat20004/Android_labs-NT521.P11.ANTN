package c.c.a.a.q1.g0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f implements j {
    public static final byte[] v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2490a;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.z1.y f2491b = new c.c.a.a.z1.y(new byte[7]);

    /* renamed from: c, reason: collision with root package name */
    public final c.c.a.a.z1.z f2492c = new c.c.a.a.z1.z(Arrays.copyOf(v, 10));

    /* renamed from: d, reason: collision with root package name */
    public final String f2493d;

    /* renamed from: e, reason: collision with root package name */
    public String f2494e;

    /* renamed from: f, reason: collision with root package name */
    public c.c.a.a.q1.y f2495f;
    public c.c.a.a.q1.y g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public c.c.a.a.q1.y t;
    public long u;

    public f(boolean z, String str) {
        h();
        this.m = -1;
        this.n = -1;
        this.q = -9223372036854775807L;
        this.f2490a = z;
        this.f2493d = str;
    }

    public static boolean g(int i) {
        return (i & 65526) == 65520;
    }

    @Override // c.c.a.a.q1.g0.j
    public void a() {
        this.l = false;
        h();
    }

    public final boolean b(c.c.a.a.z1.z zVar, byte[] bArr, int i) {
        int min = Math.min(zVar.a(), i - this.i);
        System.arraycopy(zVar.f3800a, zVar.f3801b, bArr, this.i, min);
        zVar.f3801b += min;
        int i2 = this.i + min;
        this.i = i2;
        return i2 == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x022b, code lost:
    
        if (((r24.f3800a[r6] & 8) >> 3) == r15) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0232 A[SYNTHETIC] */
    @Override // c.c.a.a.q1.g0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(c.c.a.a.z1.z r24) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.g0.f.c(c.c.a.a.z1.z):void");
    }

    @Override // c.c.a.a.q1.g0.j
    public void d() {
    }

    @Override // c.c.a.a.q1.g0.j
    public void e(long j, int i) {
        this.s = j;
    }

    @Override // c.c.a.a.q1.g0.j
    public void f(c.c.a.a.q1.n nVar, p0 p0Var) {
        p0Var.a();
        this.f2494e = p0Var.b();
        this.f2495f = nVar.j(p0Var.c(), 1);
        if (!this.f2490a) {
            this.g = new c.c.a.a.q1.l();
            return;
        }
        p0Var.a();
        c.c.a.a.q1.y j = nVar.j(p0Var.c(), 4);
        this.g = j;
        j.b(c.c.a.a.l0.v(p0Var.b(), "application/id3", null, -1, null));
    }

    public final void h() {
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    public final boolean i(c.c.a.a.z1.z zVar, byte[] bArr, int i) {
        if (zVar.a() < i) {
            return false;
        }
        System.arraycopy(zVar.f3800a, zVar.f3801b, bArr, 0, i);
        zVar.f3801b += i;
        return true;
    }
}
