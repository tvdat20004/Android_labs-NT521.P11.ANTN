package c.c.a.a.q1.g0;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public boolean f2446c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2447d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2448e;

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.z1.k0 f2444a = new c.c.a.a.z1.k0(0);

    /* renamed from: f, reason: collision with root package name */
    public long f2449f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.z1.z f2445b = new c.c.a.a.z1.z();

    public static long c(c.c.a.a.z1.z zVar) {
        int i = zVar.f3801b;
        if (zVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        System.arraycopy(zVar.f3800a, zVar.f3801b, bArr, 0, 9);
        zVar.f3801b += 9;
        zVar.A(i);
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
        }
        return -9223372036854775807L;
    }

    public final int a(c.c.a.a.q1.j jVar) {
        this.f2445b.x(c.c.a.a.z1.l0.f3766f);
        this.f2446c = true;
        jVar.f2652f = 0;
        return 0;
    }

    public final int b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
