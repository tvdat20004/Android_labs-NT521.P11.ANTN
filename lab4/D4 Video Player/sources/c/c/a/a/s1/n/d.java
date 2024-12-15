package c.c.a.a.s1.n;

import c.c.a.a.z1.k0;
import c.c.a.a.z1.y;
import c.c.a.a.z1.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements c.c.a.a.s1.d {

    /* renamed from: a, reason: collision with root package name */
    public final z f2783a = new z();

    /* renamed from: b, reason: collision with root package name */
    public final y f2784b = new y();

    /* renamed from: c, reason: collision with root package name */
    public k0 f2785c;

    @Override // c.c.a.a.s1.d
    public c.c.a.a.s1.c a(c.c.a.a.s1.g gVar) {
        int i;
        long j;
        char c2;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int i2;
        int i3;
        int i4;
        boolean z4;
        long j4;
        List list;
        long j5;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        long j6;
        int i5;
        int i6;
        int i7;
        boolean z9;
        long j7;
        k0 k0Var = this.f2785c;
        if (k0Var == null || gVar.g != k0Var.c()) {
            k0 k0Var2 = new k0(gVar.f2181e);
            this.f2785c = k0Var2;
            k0Var2.a(gVar.f2181e - gVar.g);
        }
        ByteBuffer byteBuffer = gVar.f2180d;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f2783a.y(array, limit);
        this.f2784b.i(array, limit);
        this.f2784b.l(39);
        char c3 = ' ';
        long f2 = (this.f2784b.f(1) << 32) | this.f2784b.f(32);
        this.f2784b.l(20);
        int f3 = this.f2784b.f(12);
        int f4 = this.f2784b.f(8);
        this.f2783a.B(14);
        c.c.a.a.s1.b bVar = null;
        if (f4 == 0) {
            bVar = new i();
        } else if (f4 != 255) {
            long j8 = 128;
            if (f4 == 4) {
                z zVar = this.f2783a;
                int p = zVar.p();
                ArrayList arrayList2 = new ArrayList(p);
                int i8 = 0;
                while (i8 < p) {
                    long q = zVar.q();
                    boolean z10 = (zVar.p() & 128) != 0;
                    ArrayList arrayList3 = new ArrayList();
                    if (z10) {
                        i = p;
                        j = j8;
                        c2 = c3;
                        arrayList = arrayList3;
                        z = false;
                        z2 = false;
                        j2 = -9223372036854775807L;
                        z3 = false;
                        j3 = -9223372036854775807L;
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                    } else {
                        int p2 = zVar.p();
                        boolean z11 = (p2 & 128) != 0;
                        boolean z12 = (p2 & 64) != 0;
                        boolean z13 = (p2 & 32) != 0;
                        long q2 = z12 ? zVar.q() : -9223372036854775807L;
                        if (z12) {
                            i = p;
                        } else {
                            int p3 = zVar.p();
                            ArrayList arrayList4 = new ArrayList(p3);
                            int i9 = 0;
                            while (i9 < p3) {
                                arrayList4.add(new k(zVar.p(), zVar.q(), null));
                                i9++;
                                p3 = p3;
                                p = p;
                            }
                            i = p;
                            arrayList3 = arrayList4;
                        }
                        if (z13) {
                            long p4 = zVar.p();
                            j = 128;
                            z4 = (p4 & 128) != 0;
                            c2 = ' ';
                            j4 = ((((p4 & 1) << 32) | zVar.q()) * 1000) / 90;
                        } else {
                            c2 = ' ';
                            j = 128;
                            z4 = false;
                            j4 = -9223372036854775807L;
                        }
                        z3 = z4;
                        j3 = j4;
                        arrayList = arrayList3;
                        i2 = zVar.u();
                        z = z11;
                        z2 = z12;
                        j2 = q2;
                        i3 = zVar.p();
                        i4 = zVar.p();
                    }
                    arrayList2.add(new l(q, z10, z, z2, arrayList, j2, z3, j3, i2, i3, i4));
                    i8++;
                    c3 = c2;
                    j8 = j;
                    p = i;
                }
                bVar = new m(arrayList2);
            } else if (f4 == 5) {
                z zVar2 = this.f2783a;
                k0 k0Var3 = this.f2785c;
                long q3 = zVar2.q();
                boolean z14 = (zVar2.p() & 128) != 0;
                List emptyList = Collections.emptyList();
                if (z14) {
                    list = emptyList;
                    j5 = -9223372036854775807L;
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    z8 = false;
                    j6 = -9223372036854775807L;
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                } else {
                    int p5 = zVar2.p();
                    boolean z15 = (p5 & 128) != 0;
                    boolean z16 = (p5 & 64) != 0;
                    boolean z17 = (p5 & 32) != 0;
                    boolean z18 = (p5 & 16) != 0;
                    long i10 = (!z16 || z18) ? -9223372036854775807L : o.i(zVar2, f2);
                    if (!z16) {
                        int p6 = zVar2.p();
                        ArrayList arrayList5 = new ArrayList(p6);
                        for (int i11 = 0; i11 < p6; i11++) {
                            int p7 = zVar2.p();
                            long i12 = !z18 ? o.i(zVar2, f2) : -9223372036854775807L;
                            arrayList5.add(new f(p7, i12, k0Var3.b(i12), null));
                        }
                        emptyList = arrayList5;
                    }
                    if (z17) {
                        long p8 = zVar2.p();
                        z9 = (p8 & 128) != 0;
                        j7 = ((((p8 & 1) << 32) | zVar2.q()) * 1000) / 90;
                    } else {
                        z9 = false;
                        j7 = -9223372036854775807L;
                    }
                    int u = zVar2.u();
                    int p9 = zVar2.p();
                    i5 = u;
                    z8 = z9;
                    i7 = zVar2.p();
                    list = emptyList;
                    j6 = j7;
                    i6 = p9;
                    z7 = z18;
                    z5 = z15;
                    z6 = z16;
                    j5 = i10;
                }
                bVar = new g(q3, z14, z5, z6, z7, j5, k0Var3.b(j5), list, z8, j6, i5, i6, i7);
            } else if (f4 == 6) {
                z zVar3 = this.f2783a;
                k0 k0Var4 = this.f2785c;
                long i13 = o.i(zVar3, f2);
                bVar = new o(i13, k0Var4.b(i13));
            }
        } else {
            z zVar4 = this.f2783a;
            long q4 = zVar4.q();
            int i14 = f3 - 4;
            byte[] bArr = new byte[i14];
            System.arraycopy(zVar4.f3800a, zVar4.f3801b, bArr, 0, i14);
            zVar4.f3801b += i14;
            bVar = new b(q4, bArr, f2);
        }
        return bVar == null ? new c.c.a.a.s1.c(new c.c.a.a.s1.b[0]) : new c.c.a.a.s1.c(bVar);
    }
}
