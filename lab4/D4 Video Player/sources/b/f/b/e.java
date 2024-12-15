package b.f.b;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public class e {
    public static boolean p = false;
    public static int q = 1000;
    public static long r;

    /* renamed from: c, reason: collision with root package name */
    public c f939c;

    /* renamed from: f, reason: collision with root package name */
    public c[] f942f;
    public final d l;
    public c o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f937a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f938b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f940d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f941e = 32;
    public boolean g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;
    public int j = 0;
    public int k = 32;
    public k[] m = new k[q];
    public int n = 0;

    public e() {
        this.f942f = null;
        this.f942f = new c[32];
        t();
        d dVar = new d();
        this.l = dVar;
        this.f939c = new i(dVar);
        this.o = new c(dVar);
    }

    public final k a(j jVar, String str) {
        k a2 = this.l.f935c.a();
        if (a2 == null) {
            a2 = new k(jVar);
        } else {
            a2.c();
        }
        a2.i = jVar;
        int i = this.n;
        int i2 = q;
        if (i >= i2) {
            int i3 = i2 * 2;
            q = i3;
            this.m = (k[]) Arrays.copyOf(this.m, i3);
        }
        k[] kVarArr = this.m;
        int i4 = this.n;
        this.n = i4 + 1;
        kVarArr[i4] = a2;
        return a2;
    }

    public void b(k kVar, k kVar2, int i, float f2, k kVar3, k kVar4, int i2, int i3) {
        int i4;
        float f3;
        c m = m();
        if (kVar2 == kVar3) {
            m.f931d.c(kVar, 1.0f);
            m.f931d.c(kVar4, 1.0f);
            m.f931d.c(kVar2, -2.0f);
        } else {
            if (f2 == 0.5f) {
                m.f931d.c(kVar, 1.0f);
                m.f931d.c(kVar2, -1.0f);
                m.f931d.c(kVar3, -1.0f);
                m.f931d.c(kVar4, 1.0f);
                if (i > 0 || i2 > 0) {
                    i4 = (-i) + i2;
                    f3 = i4;
                }
            } else if (f2 <= 0.0f) {
                m.f931d.c(kVar, -1.0f);
                m.f931d.c(kVar2, 1.0f);
                f3 = i;
            } else if (f2 >= 1.0f) {
                m.f931d.c(kVar4, -1.0f);
                m.f931d.c(kVar3, 1.0f);
                i4 = -i2;
                f3 = i4;
            } else {
                float f4 = 1.0f - f2;
                m.f931d.c(kVar, f4 * 1.0f);
                m.f931d.c(kVar2, f4 * (-1.0f));
                m.f931d.c(kVar3, (-1.0f) * f2);
                m.f931d.c(kVar4, 1.0f * f2);
                if (i > 0 || i2 > 0) {
                    m.f929b = (i2 * f2) + ((-i) * f4);
                }
            }
            m.f929b = f3;
        }
        if (i3 != 8) {
            m.a(this, i3);
        }
        c(m);
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(b.f.b.c r17) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.b.e.c(b.f.b.c):void");
    }

    public c d(k kVar, k kVar2, int i, int i2) {
        if (i2 == 8 && kVar2.f958f && kVar.f955c == -1) {
            kVar.d(this, kVar2.f957e + i);
            return null;
        }
        c m = m();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            m.f929b = i;
        }
        if (z) {
            m.f931d.c(kVar, 1.0f);
            m.f931d.c(kVar2, -1.0f);
        } else {
            m.f931d.c(kVar, -1.0f);
            m.f931d.c(kVar2, 1.0f);
        }
        if (i2 != 8) {
            m.a(this, i2);
        }
        c(m);
        return m;
    }

    public void e(k kVar, int i) {
        c m;
        b bVar;
        float f2;
        int i2 = kVar.f955c;
        if (i2 == -1) {
            kVar.d(this, i);
            for (int i3 = 0; i3 < this.f938b + 1; i3++) {
                k kVar2 = this.l.f936d[i3];
            }
            return;
        }
        if (i2 != -1) {
            c cVar = this.f942f[i2];
            if (!cVar.f932e) {
                if (cVar.f931d.k() == 0) {
                    cVar.f932e = true;
                } else {
                    m = m();
                    if (i < 0) {
                        m.f929b = i * (-1);
                        bVar = m.f931d;
                        f2 = 1.0f;
                    } else {
                        m.f929b = i;
                        bVar = m.f931d;
                        f2 = -1.0f;
                    }
                    bVar.c(kVar, f2);
                }
            }
            cVar.f929b = i;
            return;
        }
        m = m();
        m.f928a = kVar;
        float f3 = i;
        kVar.f957e = f3;
        m.f929b = f3;
        m.f932e = true;
        c(m);
    }

    public void f(k kVar, k kVar2, int i, int i2) {
        c m = m();
        k n = n();
        n.f956d = 0;
        m.e(kVar, kVar2, n, i);
        if (i2 != 8) {
            m.f931d.c(k(i2, null), (int) (m.f931d.g(n) * (-1.0f)));
        }
        c(m);
    }

    public void g(k kVar, k kVar2, int i, int i2) {
        c m = m();
        k n = n();
        n.f956d = 0;
        m.f(kVar, kVar2, n, i);
        if (i2 != 8) {
            m.f931d.c(k(i2, null), (int) (m.f931d.g(n) * (-1.0f)));
        }
        c(m);
    }

    public void h(k kVar, k kVar2, k kVar3, k kVar4, float f2, int i) {
        c m = m();
        m.d(kVar, kVar2, kVar3, kVar4, f2);
        if (i != 8) {
            m.a(this, i);
        }
        c(m);
    }

    public final void i(c cVar) {
        int i;
        if (cVar.f932e) {
            cVar.f928a.d(this, cVar.f929b);
        } else {
            c[] cVarArr = this.f942f;
            int i2 = this.j;
            cVarArr[i2] = cVar;
            k kVar = cVar.f928a;
            kVar.f955c = i2;
            this.j = i2 + 1;
            kVar.e(this, cVar);
        }
        if (this.f937a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f942f[i3] == null) {
                    System.out.println("WTF");
                }
                c[] cVarArr2 = this.f942f;
                if (cVarArr2[i3] != null && cVarArr2[i3].f932e) {
                    c cVar2 = cVarArr2[i3];
                    cVar2.f928a.d(this, cVar2.f929b);
                    this.l.f934b.b(cVar2);
                    this.f942f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.j;
                        if (i4 >= i) {
                            break;
                        }
                        c[] cVarArr3 = this.f942f;
                        int i6 = i4 - 1;
                        cVarArr3[i6] = cVarArr3[i4];
                        if (cVarArr3[i6].f928a.f955c == i4) {
                            cVarArr3[i6].f928a.f955c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f942f[i5] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f937a = false;
        }
    }

    public final void j() {
        for (int i = 0; i < this.j; i++) {
            c cVar = this.f942f[i];
            cVar.f928a.f957e = cVar.f929b;
        }
    }

    public k k(int i, String str) {
        if (this.i + 1 >= this.f941e) {
            p();
        }
        k a2 = a(j.ERROR, str);
        int i2 = this.f938b + 1;
        this.f938b = i2;
        this.i++;
        a2.f954b = i2;
        a2.f956d = i;
        this.l.f936d[i2] = a2;
        this.f939c.b(a2);
        return a2;
    }

    public k l(Object obj) {
        k kVar = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f941e) {
            p();
        }
        if (obj instanceof b.f.b.l.c) {
            b.f.b.l.c cVar = (b.f.b.l.c) obj;
            kVar = cVar.i;
            if (kVar == null) {
                cVar.i();
                kVar = cVar.i;
            }
            int i = kVar.f954b;
            if (i == -1 || i > this.f938b || this.l.f936d[i] == null) {
                if (i != -1) {
                    kVar.c();
                }
                int i2 = this.f938b + 1;
                this.f938b = i2;
                this.i++;
                kVar.f954b = i2;
                kVar.i = j.UNRESTRICTED;
                this.l.f936d[i2] = kVar;
            }
        }
        return kVar;
    }

    public c m() {
        c a2 = this.l.f934b.a();
        if (a2 == null) {
            a2 = new c(this.l);
            r++;
        } else {
            a2.f928a = null;
            a2.f931d.clear();
            a2.f929b = 0.0f;
            a2.f932e = false;
        }
        k.n++;
        return a2;
    }

    public k n() {
        if (this.i + 1 >= this.f941e) {
            p();
        }
        k a2 = a(j.SLACK, null);
        int i = this.f938b + 1;
        this.f938b = i;
        this.i++;
        a2.f954b = i;
        this.l.f936d[i] = a2;
        return a2;
    }

    public int o(Object obj) {
        k kVar = ((b.f.b.l.c) obj).i;
        if (kVar != null) {
            return (int) (kVar.f957e + 0.5f);
        }
        return 0;
    }

    public final void p() {
        int i = this.f940d * 2;
        this.f940d = i;
        this.f942f = (c[]) Arrays.copyOf(this.f942f, i);
        d dVar = this.l;
        dVar.f936d = (k[]) Arrays.copyOf(dVar.f936d, this.f940d);
        int i2 = this.f940d;
        this.h = new boolean[i2];
        this.f941e = i2;
        this.k = i2;
    }

    public void q() {
        if (this.f939c.i()) {
            j();
            return;
        }
        if (this.g) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.j) {
                    z = true;
                    break;
                } else if (!this.f942f[i].f932e) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                j();
                return;
            }
        }
        r(this.f939c);
    }

    public void r(c cVar) {
        float f2;
        int i;
        boolean z;
        j jVar = j.UNRESTRICTED;
        int i2 = 0;
        while (true) {
            f2 = 0.0f;
            i = 1;
            if (i2 >= this.j) {
                z = false;
                break;
            }
            c[] cVarArr = this.f942f;
            if (cVarArr[i2].f928a.i != jVar && cVarArr[i2].f929b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f3 = Float.MAX_VALUE;
                int i4 = 0;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                while (i4 < this.j) {
                    c cVar2 = this.f942f[i4];
                    if (cVar2.f928a.i != jVar && !cVar2.f932e && cVar2.f929b < f2) {
                        int k = cVar2.f931d.k();
                        int i8 = 0;
                        while (i8 < k) {
                            k f4 = cVar2.f931d.f(i8);
                            float g = cVar2.f931d.g(f4);
                            if (g > f2) {
                                for (int i9 = 0; i9 < 9; i9++) {
                                    float f5 = f4.g[i9] / g;
                                    if ((f5 < f3 && i9 == i7) || i9 > i7) {
                                        i6 = f4.f954b;
                                        i7 = i9;
                                        f3 = f5;
                                        i5 = i4;
                                    }
                                }
                            }
                            i8++;
                            f2 = 0.0f;
                        }
                    }
                    i4++;
                    f2 = 0.0f;
                }
                if (i5 != -1) {
                    c cVar3 = this.f942f[i5];
                    cVar3.f928a.f955c = -1;
                    cVar3.l(this.l.f936d[i6]);
                    k kVar = cVar3.f928a;
                    kVar.f955c = i5;
                    kVar.e(this, cVar3);
                } else {
                    z2 = true;
                }
                if (i3 > this.i / 2) {
                    z2 = true;
                }
                f2 = 0.0f;
                i = 1;
            }
        }
        s(cVar);
        j();
    }

    public final int s(c cVar) {
        for (int i = 0; i < this.i; i++) {
            this.h[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.i * 2) {
                return i2;
            }
            k kVar = cVar.f928a;
            if (kVar != null) {
                this.h[kVar.f954b] = true;
            }
            k h = cVar.h(this, this.h);
            if (h != null) {
                boolean[] zArr = this.h;
                int i3 = h.f954b;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (h != null) {
                float f2 = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.j; i5++) {
                    c cVar2 = this.f942f[i5];
                    if (cVar2.f928a.i != j.UNRESTRICTED && !cVar2.f932e && cVar2.f931d.h(h)) {
                        float g = cVar2.f931d.g(h);
                        if (g < 0.0f) {
                            float f3 = (-cVar2.f929b) / g;
                            if (f3 < f2) {
                                i4 = i5;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    c cVar3 = this.f942f[i4];
                    cVar3.f928a.f955c = -1;
                    cVar3.l(h);
                    k kVar2 = cVar3.f928a;
                    kVar2.f955c = i4;
                    kVar2.e(this, cVar3);
                }
            } else {
                z = true;
            }
        }
        return i2;
    }

    public final void t() {
        for (int i = 0; i < this.j; i++) {
            c cVar = this.f942f[i];
            if (cVar != null) {
                this.l.f934b.b(cVar);
            }
            this.f942f[i] = null;
        }
    }

    public void u() {
        d dVar;
        int i = 0;
        while (true) {
            dVar = this.l;
            k[] kVarArr = dVar.f936d;
            if (i >= kVarArr.length) {
                break;
            }
            k kVar = kVarArr[i];
            if (kVar != null) {
                kVar.c();
            }
            i++;
        }
        f<k> fVar = dVar.f935c;
        k[] kVarArr2 = this.m;
        int i2 = this.n;
        Objects.requireNonNull(fVar);
        if (i2 > kVarArr2.length) {
            i2 = kVarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            k kVar2 = kVarArr2[i3];
            int i4 = fVar.f944b;
            Object[] objArr = fVar.f943a;
            if (i4 < objArr.length) {
                objArr[i4] = kVar2;
                fVar.f944b = i4 + 1;
            }
        }
        this.n = 0;
        Arrays.fill(this.l.f936d, (Object) null);
        this.f938b = 0;
        this.f939c.c();
        this.i = 1;
        for (int i5 = 0; i5 < this.j; i5++) {
            c[] cVarArr = this.f942f;
            if (cVarArr[i5] != null) {
                Objects.requireNonNull(cVarArr[i5]);
            }
        }
        t();
        this.j = 0;
        this.o = new c(this.l);
    }
}
