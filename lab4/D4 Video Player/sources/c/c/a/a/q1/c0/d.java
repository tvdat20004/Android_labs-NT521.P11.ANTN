package c.c.a.a.q1.c0;

import c.c.a.a.q1.j;
import c.c.a.a.q1.m;
import c.c.a.a.q1.n;
import c.c.a.a.q1.p;
import c.c.a.a.q1.q;
import c.c.a.a.q1.r;
import c.c.a.a.q1.y;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.z;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class d implements m {
    public static final int o = l0.l("Xing");
    public static final int p = l0.l("Info");
    public static final int q = l0.l("VBRI");

    /* renamed from: a, reason: collision with root package name */
    public final long f2272a;

    /* renamed from: f, reason: collision with root package name */
    public n f2277f;
    public y g;
    public int h;
    public c.c.a.a.s1.c i;
    public c j;
    public long l;
    public long m;
    public int n;

    /* renamed from: b, reason: collision with root package name */
    public final z f2273b = new z(10);

    /* renamed from: c, reason: collision with root package name */
    public final r f2274c = new r();

    /* renamed from: d, reason: collision with root package name */
    public final p f2275d = new p();
    public long k = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public final q f2276e = new q();

    public d(int i, long j) {
        this.f2272a = j;
    }

    public static boolean c(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // c.c.a.a.q1.m
    public void a() {
    }

    public final c b(j jVar) {
        jVar.d(this.f2273b.f3800a, 0, 4, false);
        this.f2273b.A(0);
        r.b(this.f2273b.d(), this.f2274c);
        return new a(jVar.f2649c, jVar.f2650d, this.f2274c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r10 != c.c.a.a.q1.c0.d.p) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x029a  */
    @Override // c.c.a.a.q1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(c.c.a.a.q1.j r39, c.c.a.a.q1.s r40) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.c0.d.d(c.c.a.a.q1.j, c.c.a.a.q1.s):int");
    }

    @Override // c.c.a.a.q1.m
    public void e(n nVar) {
        this.f2277f = nVar;
        this.g = nVar.j(0, 1);
        this.f2277f.c();
    }

    public final boolean f(j jVar) {
        c cVar = this.j;
        if (cVar != null) {
            long f2 = cVar.f();
            if (f2 != -1 && jVar.c() > f2 - 4) {
                return true;
            }
        }
        try {
            return !jVar.d(this.f2273b.f3800a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d4, code lost:
    
        if (r12 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d6, code lost:
    
        r11.h(r2 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dd, code lost:
    
        r10.h = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00df, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        r11.f2652f = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(c.c.a.a.q1.j r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.c0.d.g(c.c.a.a.q1.j, boolean):boolean");
    }

    @Override // c.c.a.a.q1.m
    public void h(long j, long j2) {
        this.h = 0;
        this.k = -9223372036854775807L;
        this.l = 0L;
        this.n = 0;
    }

    @Override // c.c.a.a.q1.m
    public boolean i(j jVar) {
        return g(jVar, true);
    }
}
