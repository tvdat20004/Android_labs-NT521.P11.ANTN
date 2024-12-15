package c.c.a.a.q1.e0;

import android.util.Log;
import b.q.u;
import c.c.a.a.l0;
import c.c.a.a.s0;
import c.c.a.a.z1.z;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q extends n {
    public p n;
    public int o;
    public boolean p;
    public t q;
    public r r;

    @Override // c.c.a.a.q1.e0.n
    public void c(long j) {
        this.g = j;
        this.p = j != 0;
        t tVar = this.q;
        this.o = tVar != null ? tVar.f2427d : 0;
    }

    @Override // c.c.a.a.q1.e0.n
    public long d(z zVar) {
        byte[] bArr = zVar.f3800a;
        if ((bArr[0] & 1) == 1) {
            return -1L;
        }
        byte b2 = bArr[0];
        p pVar = this.n;
        int i = !pVar.f2421c[(b2 >> 1) & (255 >>> (8 - pVar.f2422d))].f2423a ? pVar.f2419a.f2427d : pVar.f2419a.f2428e;
        long j = this.p ? (this.o + i) / 4 : 0;
        zVar.z(zVar.f3802c + 4);
        byte[] bArr2 = zVar.f3800a;
        int i2 = zVar.f3802c;
        bArr2[i2 - 4] = (byte) (j & 255);
        bArr2[i2 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i2 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i2 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // c.c.a.a.q1.e0.n
    public boolean e(z zVar, long j, l lVar) {
        p pVar;
        int i;
        int i2;
        int i3;
        if (this.n != null) {
            return false;
        }
        int i4 = 4;
        if (this.q == null) {
            u.t(1, zVar, false);
            long g = zVar.g();
            int p = zVar.p();
            long g2 = zVar.g();
            int f2 = zVar.f();
            int f3 = zVar.f();
            int f4 = zVar.f();
            int p2 = zVar.p();
            this.q = new t(g, p, g2, f2, f3, f4, (int) Math.pow(2.0d, p2 & 15), (int) Math.pow(2.0d, (p2 & 240) >> 4), (zVar.p() & 1) > 0, Arrays.copyOf(zVar.f3800a, zVar.f3802c));
        } else if (this.r == null) {
            u.t(3, zVar, false);
            String m = zVar.m((int) zVar.g());
            int length = m.length() + 11;
            long g3 = zVar.g();
            String[] strArr = new String[(int) g3];
            int i5 = length + 4;
            for (int i6 = 0; i6 < g3; i6++) {
                strArr[i6] = zVar.m((int) zVar.g());
                i5 = i5 + 4 + strArr[i6].length();
            }
            if ((zVar.p() & 1) == 0) {
                throw new s0("framing bit expected to be set");
            }
            this.r = new r(m, strArr, i5 + 1);
        } else {
            int i7 = zVar.f3802c;
            byte[] bArr = new byte[i7];
            int i8 = 0;
            System.arraycopy(zVar.f3800a, 0, bArr, 0, i7);
            int i9 = this.q.f2424a;
            int i10 = 5;
            u.t(5, zVar, false);
            int p3 = zVar.p() + 1;
            o oVar = new o(zVar.f3800a);
            oVar.c(zVar.f3801b * 8);
            int i11 = 0;
            while (true) {
                int i12 = 16;
                if (i8 >= p3) {
                    int i13 = 6;
                    int b2 = oVar.b(6) + 1;
                    for (int i14 = 0; i14 < b2; i14++) {
                        if (oVar.b(16) != 0) {
                            throw new s0("placeholder of time domain transforms not zeroed out");
                        }
                    }
                    int i15 = 1;
                    int b3 = oVar.b(6) + 1;
                    int i16 = 0;
                    while (i16 < b3) {
                        int b4 = oVar.b(i12);
                        if (b4 == 0) {
                            int i17 = 8;
                            oVar.c(8);
                            oVar.c(16);
                            oVar.c(16);
                            oVar.c(6);
                            oVar.c(8);
                            int b5 = oVar.b(4) + 1;
                            int i18 = 0;
                            while (i18 < b5) {
                                oVar.c(i17);
                                i18++;
                                i17 = 8;
                            }
                        } else {
                            if (b4 != i15) {
                                throw new s0(c.a.a.a.a.b("floor type greater than 1 not decodable: ", b4));
                            }
                            int b6 = oVar.b(i10);
                            int[] iArr = new int[b6];
                            int i19 = -1;
                            for (int i20 = 0; i20 < b6; i20++) {
                                iArr[i20] = oVar.b(4);
                                if (iArr[i20] > i19) {
                                    i19 = iArr[i20];
                                }
                            }
                            int i21 = i19 + 1;
                            int[] iArr2 = new int[i21];
                            for (int i22 = 0; i22 < i21; i22++) {
                                int i23 = 1;
                                iArr2[i22] = oVar.b(3) + 1;
                                int b7 = oVar.b(2);
                                int i24 = 8;
                                if (b7 > 0) {
                                    oVar.c(8);
                                }
                                int i25 = 0;
                                while (i25 < (i23 << b7)) {
                                    oVar.c(i24);
                                    i25++;
                                    i23 = 1;
                                    i24 = 8;
                                }
                            }
                            oVar.c(2);
                            int b8 = oVar.b(4);
                            int i26 = 0;
                            int i27 = 0;
                            for (int i28 = 0; i28 < b6; i28++) {
                                i26 += iArr2[iArr[i28]];
                                while (i27 < i26) {
                                    oVar.c(b8);
                                    i27++;
                                }
                            }
                        }
                        i16++;
                        i13 = 6;
                        i10 = 5;
                        i15 = 1;
                        i12 = 16;
                    }
                    int i29 = 1;
                    int b9 = oVar.b(i13) + 1;
                    int i30 = 0;
                    while (i30 < b9) {
                        if (oVar.b(16) > 2) {
                            throw new s0("residueType greater than 2 is not decodable");
                        }
                        oVar.c(24);
                        oVar.c(24);
                        oVar.c(24);
                        int b10 = oVar.b(i13) + i29;
                        int i31 = 8;
                        oVar.c(8);
                        int[] iArr3 = new int[b10];
                        for (int i32 = 0; i32 < b10; i32++) {
                            iArr3[i32] = ((oVar.a() ? oVar.b(5) : 0) * 8) + oVar.b(3);
                        }
                        int i33 = 0;
                        while (i33 < b10) {
                            int i34 = 0;
                            while (i34 < i31) {
                                if ((iArr3[i33] & (1 << i34)) != 0) {
                                    oVar.c(i31);
                                }
                                i34++;
                                i31 = 8;
                            }
                            i33++;
                            i31 = 8;
                        }
                        i30++;
                        i13 = 6;
                        i29 = 1;
                    }
                    int b11 = oVar.b(i13) + 1;
                    for (int i35 = 0; i35 < b11; i35++) {
                        int b12 = oVar.b(16);
                        if (b12 != 0) {
                            Log.e("VorbisUtil", "mapping type other than 0 not supported: " + b12);
                        } else {
                            int b13 = oVar.a() ? oVar.b(4) + 1 : 1;
                            if (oVar.a()) {
                                int b14 = oVar.b(8) + 1;
                                for (int i36 = 0; i36 < b14; i36++) {
                                    int i37 = i9 - 1;
                                    oVar.c(u.i(i37));
                                    oVar.c(u.i(i37));
                                }
                            }
                            if (oVar.b(2) != 0) {
                                throw new s0("to reserved bits must be zero after mapping coupling steps");
                            }
                            if (b13 > 1) {
                                for (int i38 = 0; i38 < i9; i38++) {
                                    oVar.c(4);
                                }
                            }
                            for (int i39 = 0; i39 < b13; i39++) {
                                oVar.c(8);
                                oVar.c(8);
                                oVar.c(8);
                            }
                        }
                    }
                    int b15 = oVar.b(6) + 1;
                    s[] sVarArr = new s[b15];
                    for (int i40 = 0; i40 < b15; i40++) {
                        sVarArr[i40] = new s(oVar.a(), oVar.b(16), oVar.b(16), oVar.b(8));
                    }
                    if (!oVar.a()) {
                        throw new s0("framing bit after modes not set as expected");
                    }
                    pVar = new p(this.q, this.r, bArr, sVarArr, u.i(b15 - 1));
                } else {
                    if (oVar.b(24) != 5653314) {
                        StringBuilder j2 = c.a.a.a.a.j("expected code book to start with [0x56, 0x43, 0x42] at ");
                        j2.append((oVar.f2417c * 8) + oVar.f2418d);
                        throw new s0(j2.toString());
                    }
                    int b16 = oVar.b(16);
                    int b17 = oVar.b(24);
                    long[] jArr = new long[b17];
                    if (oVar.a()) {
                        i = i8;
                        int b18 = oVar.b(5) + 1;
                        int i41 = 0;
                        while (i41 < b17) {
                            int b19 = oVar.b(u.i(b17 - i41));
                            for (int i42 = 0; i42 < b19 && i41 < b17; i42++) {
                                jArr[i41] = b18;
                                i41++;
                            }
                            b18++;
                        }
                        i2 = 4;
                    } else {
                        boolean a2 = oVar.a();
                        while (i11 < b17) {
                            if (!a2) {
                                i3 = i8;
                                jArr[i11] = oVar.b(5) + 1;
                            } else if (oVar.a()) {
                                i3 = i8;
                                jArr[i11] = oVar.b(5) + 1;
                            } else {
                                i3 = i8;
                                jArr[i11] = 0;
                            }
                            i11++;
                            i8 = i3;
                            i4 = 4;
                        }
                        i = i8;
                        i2 = i4;
                    }
                    int b20 = oVar.b(i2);
                    if (b20 > 2) {
                        throw new s0(c.a.a.a.a.b("lookup type greater than 2 not decodable: ", b20));
                    }
                    if (b20 == 1 || b20 == 2) {
                        oVar.c(32);
                        oVar.c(32);
                        int b21 = oVar.b(4) + 1;
                        oVar.c(1);
                        oVar.c((int) (b21 * (b20 == 1 ? b16 != 0 ? (long) Math.floor(Math.pow(b17, 1.0d / b16)) : 0L : b17 * b16)));
                    }
                    i8 = i + 1;
                    i11 = 0;
                    i4 = 4;
                }
            }
        }
        pVar = null;
        this.n = pVar;
        if (pVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.n.f2419a.f2429f);
        arrayList.add(this.n.f2420b);
        t tVar = this.n.f2419a;
        lVar.f2407a = l0.r(null, "audio/vorbis", null, tVar.f2426c, -1, tVar.f2424a, (int) tVar.f2425b, arrayList, null, 0, null);
        return true;
    }

    @Override // c.c.a.a.q1.e0.n
    public void f(boolean z) {
        super.f(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
