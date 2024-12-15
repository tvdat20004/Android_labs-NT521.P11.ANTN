package c.c.a.a.q1.e0;

import c.c.a.a.q1.v;
import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final h f2382a = new h();

    /* renamed from: b, reason: collision with root package name */
    public final long f2383b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2384c;

    /* renamed from: d, reason: collision with root package name */
    public final n f2385d;

    /* renamed from: e, reason: collision with root package name */
    public int f2386e;

    /* renamed from: f, reason: collision with root package name */
    public long f2387f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public c(n nVar, long j, long j2, long j3, long j4, boolean z) {
        c.c.a.a.x1.p.c(j >= 0 && j2 > j);
        this.f2385d = nVar;
        this.f2383b = j;
        this.f2384c = j2;
        if (j3 != j2 - j && !z) {
            this.f2386e = 0;
        } else {
            this.f2387f = j4;
            this.f2386e = 4;
        }
    }

    @Override // c.c.a.a.q1.e0.i
    public v a() {
        if (this.f2387f != 0) {
            return new b(this, null);
        }
        return null;
    }

    public final boolean b(c.c.a.a.q1.j jVar, long j) {
        int i;
        long min = Math.min(j + 3, this.f2384c);
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            long j2 = jVar.f2650d;
            int i3 = 0;
            if (i2 + j2 > min && (i2 = (int) (min - j2)) < 4) {
                return false;
            }
            jVar.d(bArr, 0, i2, false);
            while (true) {
                i = i2 - 3;
                if (i3 < i) {
                    if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        jVar.h(i3);
                        return true;
                    }
                    i3++;
                }
            }
            jVar.h(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    @Override // c.c.a.a.q1.e0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long d(c.c.a.a.q1.j r24) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.e0.c.d(c.c.a.a.q1.j):long");
    }

    @Override // c.c.a.a.q1.e0.i
    public void e(long j) {
        this.h = l0.g(j, 0L, this.f2387f - 1);
        this.f2386e = 2;
        this.i = this.f2383b;
        this.j = this.f2384c;
        this.k = 0L;
        this.l = this.f2387f;
    }
}
