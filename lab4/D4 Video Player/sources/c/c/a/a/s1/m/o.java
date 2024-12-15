package c.c.a.a.s1.m;

import c.c.a.a.z1.l0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class o implements c.c.a.a.s1.d {

    /* renamed from: b, reason: collision with root package name */
    public static final int f2764b = l0.l("ID3");

    /* renamed from: a, reason: collision with root package name */
    public final m f2765a;

    public o() {
        this.f2765a = null;
    }

    public o(m mVar) {
        this.f2765a = mVar;
    }

    public static byte[] b(byte[] bArr, int i, int i2) {
        return i2 <= i ? l0.f3766f : Arrays.copyOfRange(bArr, i, i2);
    }

    public static b d(c.c.a.a.z1.z zVar, int i, int i2) {
        int v;
        String g;
        int p = zVar.p();
        String s = s(p);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        System.arraycopy(zVar.f3800a, zVar.f3801b, bArr, 0, i3);
        zVar.f3801b += i3;
        if (i2 == 2) {
            StringBuilder j = c.a.a.a.a.j("image/");
            j.append(l0.I(new String(bArr, 0, 3, "ISO-8859-1")));
            g = j.toString();
            if ("image/jpg".equals(g)) {
                g = "image/jpeg";
            }
            v = 2;
        } else {
            v = v(bArr, 0);
            String I = l0.I(new String(bArr, 0, v, "ISO-8859-1"));
            g = I.indexOf(47) == -1 ? c.a.a.a.a.g("image/", I) : I;
        }
        int i4 = bArr[v + 1] & 255;
        int i5 = v + 2;
        int u = u(bArr, i5, p);
        return new b(g, new String(bArr, i5, u - i5, s), i4, b(bArr, r(p) + u, i3));
    }

    public static d e(c.c.a.a.z1.z zVar, int i, String str) {
        byte[] bArr = new byte[i];
        System.arraycopy(zVar.f3800a, zVar.f3801b, bArr, 0, i);
        zVar.f3801b += i;
        return new d(str, bArr);
    }

    public static f f(c.c.a.a.z1.z zVar, int i, int i2, boolean z, int i3, m mVar) {
        int i4 = zVar.f3801b;
        int v = v(zVar.f3800a, i4);
        String str = new String(zVar.f3800a, i4, v - i4, "ISO-8859-1");
        zVar.A(v + 1);
        int d2 = zVar.d();
        int d3 = zVar.d();
        long q = zVar.q();
        long j = q == 4294967295L ? -1L : q;
        long q2 = zVar.q();
        long j2 = q2 == 4294967295L ? -1L : q2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (zVar.f3801b < i5) {
            p i6 = i(i2, zVar, z, i3, mVar);
            if (i6 != null) {
                arrayList.add(i6);
            }
        }
        p[] pVarArr = new p[arrayList.size()];
        arrayList.toArray(pVarArr);
        return new f(str, d2, d3, j, j2, pVarArr);
    }

    public static h g(c.c.a.a.z1.z zVar, int i, int i2, boolean z, int i3, m mVar) {
        int i4 = zVar.f3801b;
        int v = v(zVar.f3800a, i4);
        String str = new String(zVar.f3800a, i4, v - i4, "ISO-8859-1");
        zVar.A(v + 1);
        int p = zVar.p();
        boolean z2 = (p & 2) != 0;
        boolean z3 = (p & 1) != 0;
        int p2 = zVar.p();
        String[] strArr = new String[p2];
        for (int i5 = 0; i5 < p2; i5++) {
            int i6 = zVar.f3801b;
            int v2 = v(zVar.f3800a, i6);
            strArr[i5] = new String(zVar.f3800a, i6, v2 - i6, "ISO-8859-1");
            zVar.A(v2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (zVar.f3801b < i7) {
            p i8 = i(i2, zVar, z, i3, mVar);
            if (i8 != null) {
                arrayList.add(i8);
            }
        }
        p[] pVarArr = new p[arrayList.size()];
        arrayList.toArray(pVarArr);
        return new h(str, z2, z3, strArr, pVarArr);
    }

    public static j h(c.c.a.a.z1.z zVar, int i) {
        if (i < 4) {
            return null;
        }
        int p = zVar.p();
        String s = s(p);
        byte[] bArr = new byte[3];
        System.arraycopy(zVar.f3800a, zVar.f3801b, bArr, 0, 3);
        zVar.f3801b += 3;
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(zVar.f3800a, zVar.f3801b, bArr2, 0, i2);
        zVar.f3801b += i2;
        int u = u(bArr2, 0, p);
        String str2 = new String(bArr2, 0, u, s);
        int r = r(p) + u;
        return new j(str, str2, m(bArr2, r, u(bArr2, r, p), s));
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0188, code lost:
    
        if (r13 == 67) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c.c.a.a.s1.m.p i(int r19, c.c.a.a.z1.z r20, boolean r21, int r22, c.c.a.a.s1.m.m r23) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.s1.m.o.i(int, c.c.a.a.z1.z, boolean, int, c.c.a.a.s1.m.m):c.c.a.a.s1.m.p");
    }

    public static l j(c.c.a.a.z1.z zVar, int i) {
        int p = zVar.p();
        String s = s(p);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(zVar.f3800a, zVar.f3801b, bArr, 0, i2);
        zVar.f3801b += i2;
        int v = v(bArr, 0);
        String str = new String(bArr, 0, v, "ISO-8859-1");
        int i3 = v + 1;
        int u = u(bArr, i3, p);
        String m = m(bArr, i3, u, s);
        int r = r(p) + u;
        int u2 = u(bArr, r, p);
        return new l(str, m, m(bArr, r, u2, s), b(bArr, r(p) + u2, i2));
    }

    public static t k(c.c.a.a.z1.z zVar, int i) {
        int u = zVar.u();
        int r = zVar.r();
        int r2 = zVar.r();
        int p = zVar.p();
        int p2 = zVar.p();
        c.c.a.a.z1.y yVar = new c.c.a.a.z1.y();
        yVar.i(zVar.f3800a, zVar.f3802c);
        yVar.j(zVar.f3801b * 8);
        int i2 = ((i - 10) * 8) / (p + p2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int f2 = yVar.f(p);
            int f3 = yVar.f(p2);
            iArr[i3] = f2;
            iArr2[i3] = f3;
        }
        return new t(u, r, r2, iArr, iArr2);
    }

    public static v l(c.c.a.a.z1.z zVar, int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(zVar.f3800a, zVar.f3801b, bArr, 0, i);
        zVar.f3801b += i;
        int v = v(bArr, 0);
        return new v(new String(bArr, 0, v, "ISO-8859-1"), b(bArr, v + 1, i));
    }

    public static String m(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    public static x n(c.c.a.a.z1.z zVar, int i, String str) {
        if (i < 1) {
            return null;
        }
        int p = zVar.p();
        String s = s(p);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(zVar.f3800a, zVar.f3801b, bArr, 0, i2);
        zVar.f3801b += i2;
        return new x(str, null, new String(bArr, 0, u(bArr, 0, p), s));
    }

    public static x o(c.c.a.a.z1.z zVar, int i) {
        if (i < 1) {
            return null;
        }
        int p = zVar.p();
        String s = s(p);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(zVar.f3800a, zVar.f3801b, bArr, 0, i2);
        zVar.f3801b += i2;
        int u = u(bArr, 0, p);
        String str = new String(bArr, 0, u, s);
        int r = r(p) + u;
        return new x("TXXX", str, m(bArr, r, u(bArr, r, p), s));
    }

    public static z p(c.c.a.a.z1.z zVar, int i, String str) {
        byte[] bArr = new byte[i];
        System.arraycopy(zVar.f3800a, zVar.f3801b, bArr, 0, i);
        zVar.f3801b += i;
        return new z(str, null, new String(bArr, 0, v(bArr, 0), "ISO-8859-1"));
    }

    public static z q(c.c.a.a.z1.z zVar, int i) {
        if (i < 1) {
            return null;
        }
        int p = zVar.p();
        String s = s(p);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(zVar.f3800a, zVar.f3801b, bArr, 0, i2);
        zVar.f3801b += i2;
        int u = u(bArr, 0, p);
        String str = new String(bArr, 0, u, s);
        int r = r(p) + u;
        return new z("WXXX", str, m(bArr, r, v(bArr, r), "ISO-8859-1"));
    }

    public static int r(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static String s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    public static String t(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int u(byte[] bArr, int i, int i2) {
        int v = v(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return v;
        }
        while (v < bArr.length - 1) {
            if (v % 2 == 0 && bArr[v + 1] == 0) {
                return v;
            }
            v = v(bArr, v + 1);
        }
        return bArr.length;
    }

    public static int v(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int w(c.c.a.a.z1.z zVar, int i) {
        byte[] bArr = zVar.f3800a;
        int i2 = zVar.f3801b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if ((r10 & 1) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0082, code lost:
    
        if ((r10 & 128) != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean x(c.c.a.a.z1.z r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f3801b
        L6:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Lad
            r4 = 1
            r5 = r20
            if (r3 < r5) goto La9
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L20
            int r7 = r18.d()     // Catch: java.lang.Throwable -> Lad
            long r8 = r18.q()     // Catch: java.lang.Throwable -> Lad
            int r10 = r18.u()     // Catch: java.lang.Throwable -> Lad
            goto L2a
        L20:
            int r7 = r18.r()     // Catch: java.lang.Throwable -> Lad
            int r8 = r18.r()     // Catch: java.lang.Throwable -> Lad
            long r8 = (long) r8
            r10 = r6
        L2a:
            r11 = 0
            if (r7 != 0) goto L38
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L38
            if (r10 != 0) goto L38
            r1.A(r2)
            return r4
        L38:
            r7 = 4
            if (r0 != r7) goto L69
            if (r21 != 0) goto L69
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L49
            r1.A(r2)
            return r6
        L49:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L69:
            if (r0 != r7) goto L77
            r3 = r10 & 64
            if (r3 == 0) goto L71
            r3 = r4
            goto L72
        L71:
            r3 = r6
        L72:
            r7 = r10 & 1
            if (r7 == 0) goto L85
            goto L89
        L77:
            if (r0 != r3) goto L87
            r3 = r10 & 32
            if (r3 == 0) goto L7f
            r3 = r4
            goto L80
        L7f:
            r3 = r6
        L80:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L85
            goto L89
        L85:
            r4 = r6
            goto L89
        L87:
            r3 = r6
            r4 = r3
        L89:
            if (r4 == 0) goto L8d
            int r3 = r3 + 4
        L8d:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L96
            r1.A(r2)
            return r6
        L96:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Lad
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La3
            r1.A(r2)
            return r6
        La3:
            int r3 = (int) r8
            r1.B(r3)     // Catch: java.lang.Throwable -> Lad
            goto L6
        La9:
            r1.A(r2)
            return r4
        Lad:
            r0 = move-exception
            r1.A(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.s1.m.o.x(c.c.a.a.z1.z, int, int, boolean):boolean");
    }

    @Override // c.c.a.a.s1.d
    public c.c.a.a.s1.c a(c.c.a.a.s1.g gVar) {
        ByteBuffer byteBuffer = gVar.f2180d;
        return c(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c.c.a.a.s1.c c(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.s1.m.o.c(byte[], int):c.c.a.a.s1.c");
    }
}
