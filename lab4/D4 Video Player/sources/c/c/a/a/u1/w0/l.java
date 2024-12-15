package c.c.a.a.u1.w0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2999a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3000b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3001c;

    public l(boolean z, long j, long j2) {
        this.f2999a = z;
        this.f3000b = j;
        this.f3001c = j2;
    }

    public static l a(c.c.a.a.u1.w0.x.g gVar, long j) {
        boolean z;
        boolean z2;
        int i;
        int size = gVar.f3063c.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = gVar.f3063c.get(i3).f3034b;
            if (i4 == 1 || i4 == 2) {
                z = true;
                break;
            }
        }
        z = false;
        long j2 = Long.MAX_VALUE;
        int i5 = 0;
        boolean z3 = false;
        boolean z4 = false;
        long j3 = 0;
        while (i5 < size) {
            c.c.a.a.u1.w0.x.a aVar = gVar.f3063c.get(i5);
            if (!z || aVar.f3034b != 3) {
                o i6 = aVar.f3035c.get(i2).i();
                if (i6 == null) {
                    return new l(true, 0L, j);
                }
                z3 |= i6.c();
                int f2 = i6.f(j);
                if (f2 == 0) {
                    z2 = z;
                    i = i5;
                    j2 = 0;
                    j3 = 0;
                    z4 = true;
                } else if (!z4) {
                    z2 = z;
                    long e2 = i6.e();
                    i = i5;
                    j3 = Math.max(j3, i6.b(e2));
                    if (f2 != -1) {
                        long j4 = (e2 + f2) - 1;
                        j2 = Math.min(j2, i6.d(j4, j) + i6.b(j4));
                    }
                }
                i5 = i + 1;
                z = z2;
                i2 = 0;
            }
            z2 = z;
            i = i5;
            i5 = i + 1;
            z = z2;
            i2 = 0;
        }
        return new l(z3, j3, j2);
    }
}
