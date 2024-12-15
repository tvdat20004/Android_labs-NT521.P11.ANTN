package c.c.a.a.q1.b0;

import c.c.a.a.q1.u;
import c.c.a.a.q1.x;
import c.c.a.a.s0;
import c.c.a.a.z1.r;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f2244a;

    public e(h hVar, d dVar) {
        this.f2244a = hVar;
    }

    public void a(int i, int i2, c.c.a.a.q1.j jVar) {
        int i3;
        int i4;
        int[] iArr;
        h hVar = this.f2244a;
        Objects.requireNonNull(hVar);
        int i5 = 163;
        int i6 = 0;
        char c2 = 1;
        if (i != 161 && i != 163) {
            if (i == 16981) {
                f fVar = hVar.t;
                byte[] bArr = new byte[i2];
                fVar.g = bArr;
                jVar.g(bArr, 0, i2, false);
                return;
            }
            if (i == 18402) {
                byte[] bArr2 = new byte[i2];
                jVar.g(bArr2, 0, i2, false);
                hVar.t.h = new x(1, bArr2, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(hVar.i.f3800a, (byte) 0);
                jVar.g(hVar.i.f3800a, 4 - i2, i2, false);
                hVar.i.A(0);
                hVar.v = (int) hVar.i.q();
                return;
            }
            if (i == 25506) {
                f fVar2 = hVar.t;
                byte[] bArr3 = new byte[i2];
                fVar2.i = bArr3;
                jVar.g(bArr3, 0, i2, false);
                return;
            }
            if (i != 30322) {
                throw new s0(c.a.a.a.a.b("Unexpected id: ", i));
            }
            f fVar3 = hVar.t;
            byte[] bArr4 = new byte[i2];
            fVar3.t = bArr4;
            jVar.g(bArr4, 0, i2, false);
            return;
        }
        if (hVar.E == 0) {
            hVar.K = (int) hVar.f2258b.c(jVar, false, true, 8);
            hVar.L = hVar.f2258b.f2268c;
            hVar.G = -9223372036854775807L;
            hVar.E = 1;
            hVar.g.v();
        }
        f fVar4 = hVar.f2259c.get(hVar.K);
        if (fVar4 == null) {
            jVar.h(i2 - hVar.L);
            hVar.E = 0;
            return;
        }
        if (hVar.E == 1) {
            hVar.g(jVar, 3);
            int i7 = (hVar.g.f3800a[2] & 6) >> 1;
            byte b2 = 255;
            if (i7 == 0) {
                hVar.I = 1;
                int[] f2 = h.f(hVar.J, 1);
                hVar.J = f2;
                f2[0] = (i2 - hVar.L) - 3;
            } else {
                if (i != 163) {
                    throw new s0("Lacing only supported in SimpleBlocks.");
                }
                int i8 = 4;
                hVar.g(jVar, 4);
                int i9 = (hVar.g.f3800a[3] & 255) + 1;
                hVar.I = i9;
                int[] f3 = h.f(hVar.J, i9);
                hVar.J = f3;
                if (i7 == 2) {
                    int i10 = (i2 - hVar.L) - 4;
                    int i11 = hVar.I;
                    Arrays.fill(f3, 0, i11, i10 / i11);
                } else {
                    if (i7 != 1) {
                        if (i7 != 3) {
                            throw new s0(c.a.a.a.a.b("Unexpected lacing value: ", i7));
                        }
                        int i12 = 1;
                        int i13 = 8;
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            int i16 = hVar.I;
                            if (i6 >= i16 - 1) {
                                hVar.J[i16 - 1] = ((i2 - hVar.L) - i8) - i14;
                                c2 = 1;
                                break;
                            }
                            hVar.J[i6] = i15;
                            i8++;
                            hVar.g(jVar, i8);
                            int i17 = i8 - 1;
                            if (hVar.g.f3800a[i17] == 0) {
                                throw new s0("No valid varint length mask found");
                            }
                            long j = 0;
                            while (true) {
                                if (i15 >= i13) {
                                    break;
                                }
                                int i18 = i12 << (7 - i15);
                                if ((hVar.g.f3800a[i17] & i18) != 0) {
                                    i8 += i15;
                                    hVar.g(jVar, i8);
                                    int i19 = i17 + 1;
                                    long j2 = (~i18) & hVar.g.f3800a[i17] & b2;
                                    while (true) {
                                        j = j2;
                                        if (i19 >= i8) {
                                            break;
                                        }
                                        j2 = (j << 8) | (hVar.g.f3800a[i19] & b2);
                                        i19++;
                                        b2 = 255;
                                    }
                                    if (i6 > 0) {
                                        j -= (1 << ((i15 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i15++;
                                    i12 = 1;
                                    i13 = 8;
                                    b2 = 255;
                                }
                            }
                            long j3 = j;
                            if (j3 < -2147483648L || j3 > 2147483647L) {
                                break;
                            }
                            int i20 = (int) j3;
                            int[] iArr2 = hVar.J;
                            if (i6 != 0) {
                                i20 += iArr2[i6 - 1];
                            }
                            iArr2[i6] = i20;
                            i14 += iArr2[i6];
                            i6++;
                            i15 = 0;
                            i12 = 1;
                            i13 = 8;
                            b2 = 255;
                        }
                        throw new s0("EBML lacing sample size out of range.");
                    }
                    int i21 = 0;
                    int i22 = 0;
                    while (true) {
                        i3 = hVar.I;
                        if (i21 >= i3 - 1) {
                            break;
                        }
                        hVar.J[i21] = 0;
                        do {
                            i8++;
                            hVar.g(jVar, i8);
                            i4 = hVar.g.f3800a[i8 - 1] & 255;
                            iArr = hVar.J;
                            iArr[i21] = iArr[i21] + i4;
                        } while (i4 == 255);
                        i22 += iArr[i21];
                        i21++;
                    }
                    hVar.J[i3 - 1] = ((i2 - hVar.L) - i8) - i22;
                }
            }
            byte[] bArr5 = hVar.g.f3800a;
            hVar.F = hVar.l((bArr5[c2] & 255) | (bArr5[0] << 8)) + hVar.A;
            byte[] bArr6 = hVar.g.f3800a;
            hVar.M = ((fVar4.f2248d == 2 || (i == 163 && (bArr6[2] & 128) == 128)) ? 1 : 0) | ((bArr6[2] & 8) == 8 ? Integer.MIN_VALUE : 0);
            hVar.E = 2;
            hVar.H = 0;
            i5 = 163;
        }
        if (i != i5) {
            hVar.m(jVar, fVar4, hVar.J[0]);
            return;
        }
        while (true) {
            int i23 = hVar.H;
            if (i23 >= hVar.I) {
                hVar.E = 0;
                return;
            } else {
                hVar.m(jVar, fVar4, hVar.J[i23]);
                hVar.b(fVar4, hVar.F + ((hVar.H * fVar4.f2249e) / 1000));
                hVar.H++;
            }
        }
    }

    public void b(int i, double d2) {
        h hVar = this.f2244a;
        Objects.requireNonNull(hVar);
        if (i == 181) {
            hVar.t.N = (int) d2;
        }
        if (i == 17545) {
            hVar.r = (long) d2;
            return;
        }
        switch (i) {
            case 21969:
                hVar.t.B = (float) d2;
                break;
            case 21970:
                hVar.t.C = (float) d2;
                break;
            case 21971:
                hVar.t.D = (float) d2;
                break;
            case 21972:
                hVar.t.E = (float) d2;
                break;
            case 21973:
                hVar.t.F = (float) d2;
                break;
            case 21974:
                hVar.t.G = (float) d2;
                break;
            case 21975:
                hVar.t.H = (float) d2;
                break;
            case 21976:
                hVar.t.I = (float) d2;
                break;
            case 21977:
                hVar.t.J = (float) d2;
                break;
            case 21978:
                hVar.t.K = (float) d2;
                break;
            default:
                switch (i) {
                    case 30323:
                        hVar.t.q = (float) d2;
                        break;
                    case 30324:
                        hVar.t.r = (float) d2;
                        break;
                    case 30325:
                        hVar.t.s = (float) d2;
                        break;
                }
        }
    }

    public void c(int i, long j) {
        h hVar = this.f2244a;
        Objects.requireNonNull(hVar);
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw new s0("ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw new s0("ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                hVar.t.f2248d = (int) j;
                return;
            case 136:
                hVar.t.S = j == 1;
                return;
            case 155:
                hVar.G = hVar.l(j);
                return;
            case 159:
                hVar.t.L = (int) j;
                return;
            case 176:
                hVar.t.k = (int) j;
                return;
            case 179:
                hVar.B.a(hVar.l(j));
                return;
            case 186:
                hVar.t.l = (int) j;
                return;
            case 215:
                hVar.t.f2247c = (int) j;
                return;
            case 231:
                hVar.A = hVar.l(j);
                return;
            case 241:
                if (hVar.D) {
                    return;
                }
                hVar.C.a(j);
                hVar.D = true;
                return;
            case 251:
                hVar.X = true;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw new s0("ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw new s0("DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw new s0("EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw new s0("ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw new s0("AESSettingsCipherMode " + j + " not supported");
            case 21420:
                hVar.w = j + hVar.p;
                return;
            case 21432:
                int i2 = (int) j;
                if (i2 == 0) {
                    hVar.t.u = 0;
                    return;
                }
                if (i2 == 1) {
                    hVar.t.u = 2;
                    return;
                } else if (i2 == 3) {
                    hVar.t.u = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    hVar.t.u = 3;
                    return;
                }
            case 21680:
                hVar.t.m = (int) j;
                return;
            case 21682:
                hVar.t.o = (int) j;
                return;
            case 21690:
                hVar.t.n = (int) j;
                return;
            case 21930:
                hVar.t.R = j == 1;
                return;
            case 22186:
                hVar.t.O = j;
                return;
            case 22203:
                hVar.t.P = j;
                return;
            case 25188:
                hVar.t.M = (int) j;
                return;
            case 30321:
                int i3 = (int) j;
                if (i3 == 0) {
                    hVar.t.p = 0;
                    return;
                }
                if (i3 == 1) {
                    hVar.t.p = 1;
                    return;
                } else if (i3 == 2) {
                    hVar.t.p = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    hVar.t.p = 3;
                    return;
                }
            case 2352003:
                hVar.t.f2249e = (int) j;
                return;
            case 2807729:
                hVar.q = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i4 = (int) j;
                        if (i4 == 1) {
                            hVar.t.y = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            hVar.t.y = 1;
                            return;
                        }
                    case 21946:
                        int i5 = (int) j;
                        if (i5 != 1) {
                            if (i5 == 16) {
                                hVar.t.x = 6;
                                return;
                            } else if (i5 == 18) {
                                hVar.t.x = 7;
                                return;
                            } else if (i5 != 6 && i5 != 7) {
                                return;
                            }
                        }
                        hVar.t.x = 3;
                        return;
                    case 21947:
                        f fVar = hVar.t;
                        fVar.v = true;
                        int i6 = (int) j;
                        if (i6 == 1) {
                            fVar.w = 1;
                            return;
                        }
                        if (i6 == 9) {
                            fVar.w = 6;
                            return;
                        } else {
                            if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                fVar.w = 2;
                                return;
                            }
                            return;
                        }
                    case 21948:
                        hVar.t.z = (int) j;
                        return;
                    case 21949:
                        hVar.t.A = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public void d(int i, long j, long j2) {
        h hVar = this.f2244a;
        Objects.requireNonNull(hVar);
        if (i == 160) {
            hVar.X = false;
            return;
        }
        if (i == 174) {
            hVar.t = new f(null);
            return;
        }
        if (i == 187) {
            hVar.D = false;
            return;
        }
        if (i == 19899) {
            hVar.v = -1;
            hVar.w = -1L;
            return;
        }
        if (i == 20533) {
            hVar.t.f2250f = true;
            return;
        }
        if (i == 21968) {
            hVar.t.v = true;
            return;
        }
        if (i == 408125543) {
            long j3 = hVar.p;
            if (j3 != -1 && j3 != j) {
                throw new s0("Multiple Segment elements not supported");
            }
            hVar.p = j;
            hVar.o = j2;
            return;
        }
        if (i == 475249515) {
            hVar.B = new r();
            hVar.C = new r();
        } else if (i == 524531317 && !hVar.u) {
            if (hVar.f2260d && hVar.y != -1) {
                hVar.x = true;
            } else {
                hVar.Y.a(new u(hVar.s, 0L));
                hVar.u = true;
            }
        }
    }

    public void e(int i, String str) {
        h hVar = this.f2244a;
        Objects.requireNonNull(hVar);
        if (i == 134) {
            hVar.t.f2246b = str;
            return;
        }
        if (i == 17026) {
            if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw new s0(c.a.a.a.a.h("DocType ", str, " not supported"));
            }
        } else if (i == 21358) {
            hVar.t.f2245a = str;
        } else {
            if (i != 2274716) {
                return;
            }
            hVar.t.T = str;
        }
    }
}
