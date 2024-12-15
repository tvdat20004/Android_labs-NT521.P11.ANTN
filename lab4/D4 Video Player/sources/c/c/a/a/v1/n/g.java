package c.c.a.a.v1.n;

import android.util.Log;
import c.c.a.a.x1.p;
import c.c.a.a.z1.y;
import c.c.a.a.z1.z;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends k {
    public final z g = new z();
    public final y h = new y();
    public final int i;
    public final e[] j;
    public e k;
    public List<c.c.a.a.v1.b> l;
    public List<c.c.a.a.v1.b> m;
    public f n;
    public int o;

    public g(int i) {
        this.i = i == -1 ? 1 : i;
        this.j = new e[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.j[i2] = new e();
        }
        this.k = this.j[0];
        l();
    }

    @Override // c.c.a.a.v1.n.k
    public c.c.a.a.v1.e f() {
        List<c.c.a.a.v1.b> list = this.l;
        this.m = list;
        return new l(list);
    }

    @Override // c.c.a.a.v1.n.k, c.c.a.a.o1.e
    public void flush() {
        super.flush();
        this.l = null;
        this.m = null;
        this.o = 0;
        this.k = this.j[0];
        l();
        this.n = null;
    }

    @Override // c.c.a.a.v1.n.k
    public void g(c.c.a.a.v1.j jVar) {
        this.g.y(jVar.f2180d.array(), jVar.f2180d.limit());
        while (this.g.a() >= 3) {
            int p = this.g.p() & 7;
            int i = p & 3;
            boolean z = (p & 4) == 4;
            byte p2 = (byte) this.g.p();
            byte p3 = (byte) this.g.p();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        j();
                        int i2 = (p2 & 192) >> 6;
                        int i3 = p2 & 63;
                        if (i3 == 0) {
                            i3 = 64;
                        }
                        f fVar = new f(i2, i3);
                        this.n = fVar;
                        byte[] bArr = fVar.f3276c;
                        int i4 = fVar.f3277d;
                        fVar.f3277d = i4 + 1;
                        bArr[i4] = p3;
                    } else {
                        p.c(i == 2);
                        f fVar2 = this.n;
                        if (fVar2 == null) {
                            Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = fVar2.f3276c;
                            int i5 = fVar2.f3277d;
                            int i6 = i5 + 1;
                            fVar2.f3277d = i6;
                            bArr2[i5] = p2;
                            fVar2.f3277d = i6 + 1;
                            bArr2[i6] = p3;
                        }
                    }
                    f fVar3 = this.n;
                    if (fVar3.f3277d == (fVar3.f3275b * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // c.c.a.a.v1.n.k
    public boolean h() {
        return this.l != this.m;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        y yVar;
        int i;
        e eVar;
        y yVar2;
        y yVar3;
        e eVar2;
        y yVar4;
        e eVar3;
        char c2;
        String str;
        f fVar = this.n;
        if (fVar == null) {
            return;
        }
        int i2 = fVar.f3277d;
        int i3 = 1;
        if (i2 == (fVar.f3275b * 2) - 1) {
            this.h.i(fVar.f3276c, i2);
            int i4 = 3;
            int f2 = this.h.f(3);
            int f3 = this.h.f(5);
            int i5 = 7;
            int i6 = 6;
            if (f2 == 7) {
                this.h.l(2);
                f2 = this.h.f(6);
                if (f2 < 7) {
                    c.a.a.a.a.m("Invalid extended service number: ", f2, "Cea708Decoder");
                }
            }
            if (f3 == 0) {
                if (f2 != 0) {
                    str = "serviceNumber is non-zero (" + f2 + ") when blockSize is 0";
                }
            } else if (f2 == this.i) {
                int i7 = 0;
                while (this.h.b() > 0) {
                    int i8 = 8;
                    int f4 = this.h.f(8);
                    int i9 = 24;
                    if (f4 == 16) {
                        int f5 = this.h.f(8);
                        if (f5 <= 31) {
                            i5 = 7;
                            if (f5 > 7) {
                                if (f5 <= 15) {
                                    yVar3 = this.h;
                                } else if (f5 <= 23) {
                                    yVar3 = this.h;
                                    i8 = 16;
                                } else if (f5 <= 31) {
                                    yVar3 = this.h;
                                    i8 = 24;
                                }
                                yVar3.l(i8);
                            }
                        } else {
                            i5 = 7;
                            char c3 = 160;
                            if (f5 <= 127) {
                                if (f5 == 32) {
                                    c3 = ' ';
                                    eVar2 = this.k;
                                } else if (f5 == 33) {
                                    eVar2 = this.k;
                                } else if (f5 == 37) {
                                    eVar2 = this.k;
                                    c3 = 8230;
                                } else if (f5 == 42) {
                                    eVar2 = this.k;
                                    c3 = 352;
                                } else if (f5 == 44) {
                                    eVar2 = this.k;
                                    c3 = 338;
                                } else if (f5 == 63) {
                                    eVar2 = this.k;
                                    c3 = 376;
                                } else if (f5 == 57) {
                                    eVar2 = this.k;
                                    c3 = 8482;
                                } else if (f5 == 58) {
                                    eVar2 = this.k;
                                    c3 = 353;
                                } else if (f5 == 60) {
                                    eVar2 = this.k;
                                    c3 = 339;
                                } else if (f5 != 61) {
                                    switch (f5) {
                                        case 48:
                                            eVar2 = this.k;
                                            c3 = 9608;
                                            break;
                                        case 49:
                                            eVar2 = this.k;
                                            c3 = 8216;
                                            break;
                                        case 50:
                                            eVar2 = this.k;
                                            c3 = 8217;
                                            break;
                                        case 51:
                                            eVar2 = this.k;
                                            c3 = 8220;
                                            break;
                                        case 52:
                                            eVar2 = this.k;
                                            c3 = 8221;
                                            break;
                                        case 53:
                                            eVar2 = this.k;
                                            c3 = 8226;
                                            break;
                                        default:
                                            switch (f5) {
                                                case 118:
                                                    eVar2 = this.k;
                                                    c3 = 8539;
                                                    break;
                                                case 119:
                                                    eVar2 = this.k;
                                                    c3 = 8540;
                                                    break;
                                                case 120:
                                                    eVar2 = this.k;
                                                    c3 = 8541;
                                                    break;
                                                case 121:
                                                    eVar2 = this.k;
                                                    c3 = 8542;
                                                    break;
                                                case 122:
                                                    eVar2 = this.k;
                                                    c3 = 9474;
                                                    break;
                                                case 123:
                                                    eVar2 = this.k;
                                                    c3 = 9488;
                                                    break;
                                                case 124:
                                                    eVar2 = this.k;
                                                    c3 = 9492;
                                                    break;
                                                case 125:
                                                    eVar2 = this.k;
                                                    c3 = 9472;
                                                    break;
                                                case 126:
                                                    eVar2 = this.k;
                                                    c3 = 9496;
                                                    break;
                                                case 127:
                                                    eVar2 = this.k;
                                                    c3 = 9484;
                                                    break;
                                                default:
                                                    c.a.a.a.a.m("Invalid G2 character: ", f5, "Cea708Decoder");
                                                    break;
                                            }
                                    }
                                    i7 = i3;
                                } else {
                                    eVar2 = this.k;
                                    c3 = 8480;
                                }
                                eVar2.a(c3);
                                i7 = i3;
                            } else {
                                int i10 = 32;
                                if (f5 <= 159) {
                                    if (f5 <= 135) {
                                        yVar4 = this.h;
                                    } else if (f5 <= 143) {
                                        yVar4 = this.h;
                                        i10 = 40;
                                    } else if (f5 <= 159) {
                                        this.h.l(2);
                                        i6 = 6;
                                        this.h.l(this.h.f(6) * 8);
                                    }
                                    yVar4.l(i10);
                                } else {
                                    if (f5 <= 255) {
                                        if (f5 == 160) {
                                            eVar3 = this.k;
                                            c2 = 13252;
                                        } else {
                                            c.a.a.a.a.m("Invalid G3 character: ", f5, "Cea708Decoder");
                                            eVar3 = this.k;
                                            c2 = '_';
                                        }
                                        eVar3.a(c2);
                                        i7 = i3;
                                    } else {
                                        c.a.a.a.a.m("Invalid extended command: ", f5, "Cea708Decoder");
                                    }
                                    i6 = 6;
                                }
                            }
                        }
                        i = i5;
                        i6 = 6;
                        i5 = i;
                    } else if (f4 <= 31) {
                        if (f4 != 0) {
                            if (f4 == i4) {
                                this.l = k();
                            } else if (f4 != 8) {
                                switch (f4) {
                                    case 12:
                                        l();
                                        break;
                                    case 13:
                                        this.k.a('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (f4 >= 17 && f4 <= 23) {
                                            c.a.a.a.a.m("Currently unsupported COMMAND_EXT1 Command: ", f4, "Cea708Decoder");
                                            yVar = this.h;
                                        } else if (f4 < 24 || f4 > 31) {
                                            c.a.a.a.a.m("Invalid C0 command: ", f4, "Cea708Decoder");
                                            break;
                                        } else {
                                            c.a.a.a.a.m("Currently unsupported COMMAND_P16 Command: ", f4, "Cea708Decoder");
                                            yVar = this.h;
                                            i8 = 16;
                                        }
                                        yVar.l(i8);
                                        break;
                                }
                            } else {
                                e eVar4 = this.k;
                                int length = eVar4.f3269b.length();
                                if (length > 0) {
                                    eVar4.f3269b.delete(length - 1, length);
                                }
                            }
                        }
                    } else if (f4 <= 127) {
                        this.k.a(f4 == 127 ? (char) 9835 : (char) (f4 & 255));
                        i7 = i3;
                    } else {
                        if (f4 <= 159) {
                            switch (f4) {
                                case 128:
                                case 129:
                                case 130:
                                case 131:
                                case 132:
                                case 133:
                                case 134:
                                case 135:
                                    int i11 = f4 - 128;
                                    if (this.o != i11) {
                                        this.o = i11;
                                        eVar = this.j[i11];
                                        this.k = eVar;
                                        break;
                                    }
                                    break;
                                case 136:
                                    for (int i12 = i3; i12 <= 8; i12++) {
                                        if (this.h.e()) {
                                            this.j[8 - i12].c();
                                        }
                                    }
                                    break;
                                case 137:
                                    for (int i13 = 1; i13 <= 8; i13++) {
                                        if (this.h.e()) {
                                            this.j[8 - i13].f3271d = true;
                                        }
                                    }
                                    i7 = 1;
                                    break;
                                case 138:
                                    for (int i14 = 1; i14 <= 8; i14++) {
                                        if (this.h.e()) {
                                            this.j[8 - i14].f3271d = false;
                                        }
                                    }
                                    i7 = 1;
                                    break;
                                case 139:
                                    for (int i15 = 1; i15 <= 8; i15++) {
                                        if (this.h.e()) {
                                            this.j[8 - i15].f3271d = !r2.f3271d;
                                        }
                                    }
                                    i7 = 1;
                                    break;
                                case 140:
                                    for (int i16 = 1; i16 <= 8; i16++) {
                                        if (this.h.e()) {
                                            this.j[8 - i16].f();
                                        }
                                    }
                                    i7 = 1;
                                    break;
                                case 141:
                                    this.h.l(8);
                                    i7 = 1;
                                    break;
                                case 142:
                                    i7 = 1;
                                    break;
                                case 143:
                                    l();
                                    i7 = 1;
                                    break;
                                case 144:
                                    if (this.k.f3270c) {
                                        this.h.f(4);
                                        this.h.f(2);
                                        this.h.f(2);
                                        boolean e2 = this.h.e();
                                        boolean e3 = this.h.e();
                                        this.h.f(3);
                                        this.h.f(3);
                                        this.k.g(e2, e3);
                                        i4 = 3;
                                        i7 = 1;
                                        break;
                                    }
                                    yVar2 = this.h;
                                    i9 = 16;
                                    yVar2.l(i9);
                                    i4 = 3;
                                    i7 = 1;
                                case 145:
                                    if (!this.k.f3270c) {
                                        yVar2 = this.h;
                                        yVar2.l(i9);
                                        i4 = 3;
                                        i7 = 1;
                                        break;
                                    } else {
                                        int d2 = e.d(this.h.f(2), this.h.f(2), this.h.f(2), this.h.f(2));
                                        int d3 = e.d(this.h.f(2), this.h.f(2), this.h.f(2), this.h.f(2));
                                        this.h.l(2);
                                        e.d(this.h.f(2), this.h.f(2), this.h.f(2), 0);
                                        this.k.h(d2, d3);
                                        i4 = 3;
                                        i7 = 1;
                                    }
                                case 146:
                                    if (this.k.f3270c) {
                                        this.h.l(4);
                                        int f6 = this.h.f(4);
                                        this.h.l(2);
                                        this.h.f(6);
                                        e eVar5 = this.k;
                                        if (eVar5.v != f6) {
                                            eVar5.a('\n');
                                        }
                                        eVar5.v = f6;
                                        i4 = 3;
                                        i7 = 1;
                                        break;
                                    }
                                    yVar2 = this.h;
                                    i9 = 16;
                                    yVar2.l(i9);
                                    i4 = 3;
                                    i7 = 1;
                                case 147:
                                case 148:
                                case 149:
                                case 150:
                                default:
                                    Log.w("Cea708Decoder", c.a.a.a.a.b("Invalid C1 command: ", f4));
                                    break;
                                case 151:
                                    if (!this.k.f3270c) {
                                        yVar2 = this.h;
                                        i9 = 32;
                                        yVar2.l(i9);
                                        i4 = 3;
                                        i7 = 1;
                                        break;
                                    } else {
                                        int d4 = e.d(this.h.f(2), this.h.f(2), this.h.f(2), this.h.f(2));
                                        this.h.f(2);
                                        e.d(this.h.f(2), this.h.f(2), this.h.f(2), 0);
                                        this.h.e();
                                        this.h.e();
                                        this.h.f(2);
                                        this.h.f(2);
                                        int f7 = this.h.f(2);
                                        this.h.l(8);
                                        e eVar6 = this.k;
                                        eVar6.o = d4;
                                        eVar6.l = f7;
                                        i4 = 3;
                                        i7 = 1;
                                    }
                                case 152:
                                case 153:
                                case 154:
                                case 155:
                                case 156:
                                case 157:
                                case 158:
                                case 159:
                                    int i17 = f4 - 152;
                                    e eVar7 = this.j[i17];
                                    this.h.l(2);
                                    boolean e4 = this.h.e();
                                    boolean e5 = this.h.e();
                                    this.h.e();
                                    int f8 = this.h.f(i4);
                                    boolean e6 = this.h.e();
                                    int f9 = this.h.f(i5);
                                    int f10 = this.h.f(8);
                                    int f11 = this.h.f(4);
                                    int f12 = this.h.f(4);
                                    this.h.l(2);
                                    this.h.f(i6);
                                    this.h.l(2);
                                    int f13 = this.h.f(i4);
                                    int f14 = this.h.f(i4);
                                    eVar7.f3270c = true;
                                    eVar7.f3271d = e4;
                                    eVar7.k = e5;
                                    eVar7.f3272e = f8;
                                    eVar7.f3273f = e6;
                                    eVar7.g = f9;
                                    eVar7.h = f10;
                                    eVar7.i = f11;
                                    int i18 = f12 + 1;
                                    if (eVar7.j != i18) {
                                        eVar7.j = i18;
                                        while (true) {
                                            if ((e5 && eVar7.f3268a.size() >= eVar7.j) || eVar7.f3268a.size() >= 15) {
                                                eVar7.f3268a.remove(0);
                                            }
                                        }
                                    }
                                    if (f13 != 0 && eVar7.m != f13) {
                                        eVar7.m = f13;
                                        int i19 = f13 - 1;
                                        int i20 = e.D[i19];
                                        boolean z = e.C[i19];
                                        int i21 = e.A[i19];
                                        int i22 = e.B[i19];
                                        int i23 = e.z[i19];
                                        eVar7.o = i20;
                                        eVar7.l = i23;
                                    }
                                    if (f14 != 0 && eVar7.n != f14) {
                                        eVar7.n = f14;
                                        int i24 = f14 - 1;
                                        int i25 = e.F[i24];
                                        int i26 = e.E[i24];
                                        eVar7.g(false, false);
                                        eVar7.h(e.w, e.G[i24]);
                                    }
                                    if (this.o != i17) {
                                        this.o = i17;
                                        eVar = this.j[i17];
                                        i4 = 3;
                                        i3 = 1;
                                        this.k = eVar;
                                        break;
                                    }
                                    i4 = 3;
                                    i7 = 1;
                                    break;
                            }
                            i3 = i7;
                            i = 7;
                            i6 = 6;
                            i5 = i;
                        } else if (f4 <= 255) {
                            this.k.a((char) (f4 & 255));
                        } else {
                            c.a.a.a.a.m("Invalid base command: ", f4, "Cea708Decoder");
                            i = 7;
                            i6 = 6;
                            i5 = i;
                        }
                        i7 = i3;
                        i3 = i7;
                        i = 7;
                        i6 = 6;
                        i5 = i;
                    }
                }
                if (i7 != 0) {
                    this.l = k();
                }
            }
            this.n = null;
        }
        StringBuilder j = c.a.a.a.a.j("DtvCcPacket ended prematurely; size is ");
        j.append((this.n.f3275b * 2) - 1);
        j.append(", but current index is ");
        j.append(this.n.f3277d);
        j.append(" (sequence number ");
        j.append(this.n.f3274a);
        j.append("); ignoring packet");
        str = j.toString();
        Log.w("Cea708Decoder", str);
        this.n = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<c.c.a.a.v1.b> k() {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.v1.n.g.k():java.util.List");
    }

    public final void l() {
        for (int i = 0; i < 8; i++) {
            this.j[i].f();
        }
    }
}
