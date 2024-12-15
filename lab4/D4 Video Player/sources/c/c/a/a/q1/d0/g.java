package c.c.a.a.q1.d0;

import android.util.Pair;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.z;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2308a = l0.l("vide");

    /* renamed from: b, reason: collision with root package name */
    public static final int f2309b = l0.l("soun");

    /* renamed from: c, reason: collision with root package name */
    public static final int f2310c = l0.l("text");

    /* renamed from: d, reason: collision with root package name */
    public static final int f2311d = l0.l("sbtl");

    /* renamed from: e, reason: collision with root package name */
    public static final int f2312e = l0.l("subt");

    /* renamed from: f, reason: collision with root package name */
    public static final int f2313f = l0.l("clcp");
    public static final int g = l0.l("meta");
    public static final int h = l0.l("mdta");
    public static final byte[] i = l0.s("OpusHead");

    public static Pair<String, byte[]> a(z zVar, int i2) {
        zVar.A(i2 + 8 + 4);
        zVar.B(1);
        b(zVar);
        zVar.B(2);
        int p = zVar.p();
        if ((p & 128) != 0) {
            zVar.B(2);
        }
        if ((p & 64) != 0) {
            zVar.B(zVar.u());
        }
        if ((p & 32) != 0) {
            zVar.B(2);
        }
        zVar.B(1);
        b(zVar);
        String d2 = c.c.a.a.z1.u.d(zVar.p());
        if ("audio/mpeg".equals(d2) || "audio/vnd.dts".equals(d2) || "audio/vnd.dts.hd".equals(d2)) {
            return Pair.create(d2, null);
        }
        zVar.B(12);
        zVar.B(1);
        int b2 = b(zVar);
        byte[] bArr = new byte[b2];
        System.arraycopy(zVar.f3800a, zVar.f3801b, bArr, 0, b2);
        zVar.f3801b += b2;
        return Pair.create(d2, bArr);
    }

    public static int b(z zVar) {
        int p = zVar.p();
        int i2 = p & 127;
        while ((p & 128) == 128) {
            p = zVar.p();
            i2 = (i2 << 7) | (p & 127);
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair<Integer, t> c(z zVar, int i2, int i3) {
        Integer num;
        t tVar;
        Pair<Integer, t> create;
        int i4;
        int i5;
        byte[] bArr;
        int i6 = zVar.f3801b;
        while (i6 - i2 < i3) {
            zVar.A(i6);
            int d2 = zVar.d();
            int i7 = 1;
            c.c.a.a.x1.p.d(d2 > 0, "childAtomSize should be positive");
            if (zVar.d() == c.j0) {
                int i8 = i6 + 8;
                int i9 = 0;
                int i10 = -1;
                String str = null;
                Integer num2 = null;
                while (i8 - i6 < d2) {
                    zVar.A(i8);
                    int d3 = zVar.d();
                    int d4 = zVar.d();
                    if (d4 == c.p0) {
                        num2 = Integer.valueOf(zVar.d());
                    } else if (d4 == c.k0) {
                        zVar.B(4);
                        str = zVar.m(4);
                    } else if (d4 == c.l0) {
                        i10 = i8;
                        i9 = d3;
                    }
                    i8 += d3;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    c.c.a.a.x1.p.d(num2 != null, "frma atom is mandatory");
                    c.c.a.a.x1.p.d(i10 != -1, "schi atom is mandatory");
                    int i11 = i10 + 8;
                    while (true) {
                        if (i11 - i10 >= i9) {
                            num = num2;
                            tVar = null;
                            break;
                        }
                        zVar.A(i11);
                        int d5 = zVar.d();
                        if (zVar.d() == c.m0) {
                            int d6 = (zVar.d() >> 24) & 255;
                            zVar.B(i7);
                            if (d6 == 0) {
                                zVar.B(i7);
                                i4 = 0;
                                i5 = 0;
                            } else {
                                int p = zVar.p();
                                int i12 = (p & 240) >> 4;
                                i4 = p & 15;
                                i5 = i12;
                            }
                            boolean z = zVar.p() == i7 ? i7 : 0;
                            int p2 = zVar.p();
                            byte[] bArr2 = new byte[16];
                            System.arraycopy(zVar.f3800a, zVar.f3801b, bArr2, 0, 16);
                            zVar.f3801b += 16;
                            if (z == 0 || p2 != 0) {
                                bArr = null;
                            } else {
                                int p3 = zVar.p();
                                byte[] bArr3 = new byte[p3];
                                System.arraycopy(zVar.f3800a, zVar.f3801b, bArr3, 0, p3);
                                zVar.f3801b += p3;
                                bArr = bArr3;
                            }
                            num = num2;
                            tVar = new t(z, str, p2, bArr2, i5, i4, bArr);
                        } else {
                            i11 += d5;
                            i7 = 1;
                        }
                    }
                    c.c.a.a.x1.p.d(tVar != null, "tenc atom is mandatory");
                    create = Pair.create(num, tVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i6 += d2;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:523:0x00a1, code lost:
    
        if (r12 == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c.c.a.a.q1.d0.s d(c.c.a.a.q1.d0.a r44, c.c.a.a.q1.d0.b r45, long r46, c.c.a.a.p1.e r48, boolean r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 2407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.d0.g.d(c.c.a.a.q1.d0.a, c.c.a.a.q1.d0.b, long, c.c.a.a.p1.e, boolean, boolean):c.c.a.a.q1.d0.s");
    }
}
