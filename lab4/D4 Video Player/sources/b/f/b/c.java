package b.f.b;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public b f931d;

    /* renamed from: a, reason: collision with root package name */
    public k f928a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f929b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<k> f930c = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public boolean f932e = false;

    public c(d dVar) {
        this.f931d = new a(this, dVar);
    }

    public c a(e eVar, int i) {
        this.f931d.c(eVar.k(i, "ep"), 1.0f);
        this.f931d.c(eVar.k(i, "em"), -1.0f);
        return this;
    }

    public void b(k kVar) {
        float f2;
        int i = kVar.f956d;
        if (i != 1) {
            if (i == 2) {
                f2 = 1000.0f;
            } else if (i == 3) {
                f2 = 1000000.0f;
            } else if (i == 4) {
                f2 = 1.0E9f;
            } else if (i == 5) {
                f2 = 1.0E12f;
            }
            this.f931d.c(kVar, f2);
        }
        f2 = 1.0f;
        this.f931d.c(kVar, f2);
    }

    public void c() {
        this.f931d.clear();
        this.f928a = null;
        this.f929b = 0.0f;
    }

    public c d(k kVar, k kVar2, k kVar3, k kVar4, float f2) {
        this.f931d.c(kVar, -1.0f);
        this.f931d.c(kVar2, 1.0f);
        this.f931d.c(kVar3, f2);
        this.f931d.c(kVar4, -f2);
        return this;
    }

    public c e(k kVar, k kVar2, k kVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f929b = i;
        }
        if (z) {
            this.f931d.c(kVar, 1.0f);
            this.f931d.c(kVar2, -1.0f);
            this.f931d.c(kVar3, -1.0f);
        } else {
            this.f931d.c(kVar, -1.0f);
            this.f931d.c(kVar2, 1.0f);
            this.f931d.c(kVar3, 1.0f);
        }
        return this;
    }

    public c f(k kVar, k kVar2, k kVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f929b = i;
        }
        if (z) {
            this.f931d.c(kVar, 1.0f);
            this.f931d.c(kVar2, -1.0f);
            this.f931d.c(kVar3, 1.0f);
        } else {
            this.f931d.c(kVar, -1.0f);
            this.f931d.c(kVar2, 1.0f);
            this.f931d.c(kVar3, -1.0f);
        }
        return this;
    }

    public c g(k kVar, k kVar2, k kVar3, k kVar4, float f2) {
        this.f931d.c(kVar3, 0.5f);
        this.f931d.c(kVar4, 0.5f);
        this.f931d.c(kVar, -0.5f);
        this.f931d.c(kVar2, -0.5f);
        this.f929b = -f2;
        return this;
    }

    public k h(e eVar, boolean[] zArr) {
        return k(zArr, null);
    }

    public boolean i() {
        return this.f928a == null && this.f929b == 0.0f && this.f931d.k() == 0;
    }

    public final boolean j(k kVar) {
        return kVar.l <= 1;
    }

    public final k k(boolean[] zArr, k kVar) {
        j jVar;
        int k = this.f931d.k();
        k kVar2 = null;
        float f2 = 0.0f;
        for (int i = 0; i < k; i++) {
            float a2 = this.f931d.a(i);
            if (a2 < 0.0f) {
                k f3 = this.f931d.f(i);
                if ((zArr == null || !zArr[f3.f954b]) && f3 != kVar && (((jVar = f3.i) == j.SLACK || jVar == j.ERROR) && a2 < f2)) {
                    f2 = a2;
                    kVar2 = f3;
                }
            }
        }
        return kVar2;
    }

    public void l(k kVar) {
        k kVar2 = this.f928a;
        if (kVar2 != null) {
            this.f931d.c(kVar2, -1.0f);
            this.f928a.f955c = -1;
            this.f928a = null;
        }
        float d2 = this.f931d.d(kVar, true) * (-1.0f);
        this.f928a = kVar;
        if (d2 == 1.0f) {
            return;
        }
        this.f929b /= d2;
        this.f931d.i(d2);
    }

    public void m(e eVar, k kVar, boolean z) {
        if (kVar.f958f) {
            float g = this.f931d.g(kVar);
            this.f929b = (kVar.f957e * g) + this.f929b;
            this.f931d.d(kVar, z);
            if (z) {
                kVar.b(this);
            }
            if (this.f931d.k() == 0) {
                this.f932e = true;
                eVar.f937a = true;
            }
        }
    }

    public void n(e eVar, c cVar, boolean z) {
        float b2 = this.f931d.b(cVar, z);
        this.f929b = (cVar.f929b * b2) + this.f929b;
        if (z) {
            cVar.f928a.b(this);
        }
        if (this.f928a == null || this.f931d.k() != 0) {
            return;
        }
        this.f932e = true;
        eVar.f937a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            b.f.b.k r0 = r10.f928a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L16
        L7:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = c.a.a.a.a.j(r0)
            b.f.b.k r1 = r10.f928a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L16:
            java.lang.String r1 = " = "
            java.lang.String r0 = c.a.a.a.a.g(r0, r1)
            float r1 = r10.f929b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L34
            java.lang.StringBuilder r0 = c.a.a.a.a.j(r0)
            float r1 = r10.f929b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L35
        L34:
            r1 = r3
        L35:
            b.f.b.b r5 = r10.f931d
            int r5 = r5.k()
        L3b:
            if (r3 >= r5) goto La5
            b.f.b.b r6 = r10.f931d
            b.f.b.k r6 = r6.f(r3)
            if (r6 != 0) goto L46
            goto La2
        L46:
            b.f.b.b r7 = r10.f931d
            float r7 = r7.a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L51
            goto La2
        L51:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L64
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7e
            java.lang.StringBuilder r0 = c.a.a.a.a.j(r0)
            java.lang.String r1 = "- "
            goto L76
        L64:
            java.lang.StringBuilder r0 = c.a.a.a.a.j(r0)
            if (r8 <= 0) goto L74
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L7e
        L74:
            java.lang.String r1 = " - "
        L76:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r7 = r7 * r9
        L7e:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L8a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L97
        L8a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L97:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r4
        La2:
            int r3 = r3 + 1
            goto L3b
        La5:
            if (r1 != 0) goto Lad
            java.lang.String r1 = "0.0"
            java.lang.String r0 = c.a.a.a.a.g(r0, r1)
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.b.c.toString():java.lang.String");
    }
}
