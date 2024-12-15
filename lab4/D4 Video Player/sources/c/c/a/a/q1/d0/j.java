package c.c.a.a.q1.d0;

import c.c.a.a.q1.y;
import c.c.a.a.z1.z;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final y f2320a;

    /* renamed from: c, reason: collision with root package name */
    public s f2322c;

    /* renamed from: d, reason: collision with root package name */
    public h f2323d;

    /* renamed from: e, reason: collision with root package name */
    public int f2324e;

    /* renamed from: f, reason: collision with root package name */
    public int f2325f;
    public int g;
    public int h;

    /* renamed from: b, reason: collision with root package name */
    public final u f2321b = new u();
    public final z i = new z(1);
    public final z j = new z();

    public j(y yVar) {
        this.f2320a = yVar;
    }

    public final t a() {
        u uVar = this.f2321b;
        int i = uVar.f2365a.f2314a;
        t tVar = uVar.n;
        if (tVar == null) {
            tVar = this.f2322c.a(i);
        }
        if (tVar == null || !tVar.f2360a) {
            return null;
        }
        return tVar;
    }

    public void b(s sVar, h hVar) {
        Objects.requireNonNull(sVar);
        this.f2322c = sVar;
        Objects.requireNonNull(hVar);
        this.f2323d = hVar;
        this.f2320a.b(sVar.f2359f);
        d();
    }

    public boolean c() {
        this.f2324e++;
        int i = this.f2325f + 1;
        this.f2325f = i;
        int[] iArr = this.f2321b.g;
        int i2 = this.g;
        if (i != iArr[i2]) {
            return true;
        }
        this.g = i2 + 1;
        this.f2325f = 0;
        return false;
    }

    public void d() {
        u uVar = this.f2321b;
        uVar.f2368d = 0;
        uVar.r = 0L;
        uVar.l = false;
        uVar.q = false;
        uVar.n = null;
        this.f2324e = 0;
        this.g = 0;
        this.f2325f = 0;
        this.h = 0;
    }
}
