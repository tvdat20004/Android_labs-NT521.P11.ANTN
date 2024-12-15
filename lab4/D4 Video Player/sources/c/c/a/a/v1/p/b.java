package c.c.a.a.v1.p;

import android.graphics.Bitmap;
import c.c.a.a.v1.e;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class b extends c.c.a.a.v1.c {
    public final z n;
    public final z o;
    public final a p;
    public Inflater q;

    public b() {
        super("PgsDecoder");
        this.n = new z();
        this.o = new z();
        this.p = new a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // c.c.a.a.v1.c
    public e k(byte[] bArr, int i, boolean z) {
        z zVar;
        char c2;
        int i2;
        c.c.a.a.v1.b bVar;
        z zVar2;
        int i3;
        int i4;
        int r;
        z zVar3 = this.n;
        zVar3.f3800a = bArr;
        zVar3.f3802c = i;
        int i5 = 0;
        zVar3.f3801b = 0;
        char c3 = 255;
        if (zVar3.a() > 0 && (zVar3.f3800a[zVar3.f3801b] & 255) == 120) {
            if (this.q == null) {
                this.q = new Inflater();
            }
            if (l0.t(zVar3, this.o, this.q)) {
                z zVar4 = this.o;
                zVar3.y(zVar4.f3800a, zVar4.f3802c);
            }
        }
        this.p.a();
        ArrayList arrayList = new ArrayList();
        while (this.n.a() >= 3) {
            z zVar5 = this.n;
            a aVar = this.p;
            int i6 = zVar5.f3802c;
            int p = zVar5.p();
            int u = zVar5.u();
            int i7 = zVar5.f3801b + u;
            if (i7 > i6) {
                zVar5.A(i6);
                i2 = i5;
                c2 = c3;
                bVar = null;
            } else {
                if (p != 128) {
                    switch (p) {
                        case 20:
                            Objects.requireNonNull(aVar);
                            if (u % 5 == 2) {
                                zVar5.B(2);
                                Arrays.fill(aVar.f3328b, i5);
                                int i8 = u / 5;
                                for (int i9 = i5; i9 < i8; i9++) {
                                    int p2 = zVar5.p();
                                    int p3 = zVar5.p();
                                    int p4 = zVar5.p();
                                    double d2 = p3;
                                    double d3 = p4 - 128;
                                    int i10 = (int) ((1.402d * d3) + d2);
                                    double p5 = zVar5.p() - 128;
                                    aVar.f3328b[p2] = (l0.f((int) ((d2 - (0.34414d * p5)) - (d3 * 0.71414d)), 0, 255) << 8) | (l0.f(i10, 0, 255) << 16) | (zVar5.p() << 24) | l0.f((int) ((p5 * 1.772d) + d2), 0, 255);
                                    c3 = 255;
                                    zVar5 = zVar5;
                                }
                                zVar = zVar5;
                                c2 = c3;
                                aVar.f3329c = true;
                                break;
                            }
                            zVar = zVar5;
                            c2 = c3;
                            break;
                        case 21:
                            Objects.requireNonNull(aVar);
                            if (u >= 4) {
                                zVar5.B(3);
                                int i11 = u - 4;
                                if (((zVar5.p() & 128) != 0 ? 1 : i5) != 0) {
                                    if (i11 >= 7 && (r = zVar5.r()) >= 4) {
                                        aVar.h = zVar5.u();
                                        aVar.i = zVar5.u();
                                        aVar.f3327a.w(r - 4);
                                        i11 -= 7;
                                    }
                                }
                                z zVar6 = aVar.f3327a;
                                int i12 = zVar6.f3801b;
                                int i13 = zVar6.f3802c;
                                if (i12 < i13 && i11 > 0) {
                                    int min = Math.min(i11, i13 - i12);
                                    zVar5.c(aVar.f3327a.f3800a, i12, min);
                                    aVar.f3327a.A(i12 + min);
                                }
                            }
                            zVar = zVar5;
                            c2 = c3;
                            break;
                        case 22:
                            Objects.requireNonNull(aVar);
                            if (u >= 19) {
                                aVar.f3330d = zVar5.u();
                                aVar.f3331e = zVar5.u();
                                zVar5.B(11);
                                aVar.f3332f = zVar5.u();
                                aVar.g = zVar5.u();
                            }
                            zVar = zVar5;
                            c2 = c3;
                            break;
                        default:
                            zVar = zVar5;
                            c2 = c3;
                            break;
                    }
                    bVar = null;
                    i2 = 0;
                } else {
                    zVar = zVar5;
                    c2 = c3;
                    if (aVar.f3330d == 0 || aVar.f3331e == 0 || aVar.h == 0 || aVar.i == 0 || (i3 = (zVar2 = aVar.f3327a).f3802c) == 0 || zVar2.f3801b != i3 || !aVar.f3329c) {
                        i2 = 0;
                        bVar = null;
                    } else {
                        i2 = 0;
                        zVar2.A(0);
                        int i14 = aVar.h * aVar.i;
                        int[] iArr = new int[i14];
                        int i15 = 0;
                        while (i15 < i14) {
                            int p6 = aVar.f3327a.p();
                            if (p6 != 0) {
                                i4 = i15 + 1;
                                iArr[i15] = aVar.f3328b[p6];
                            } else {
                                int p7 = aVar.f3327a.p();
                                if (p7 != 0) {
                                    i4 = ((p7 & 64) == 0 ? p7 & 63 : ((p7 & 63) << 8) | aVar.f3327a.p()) + i15;
                                    Arrays.fill(iArr, i15, i4, (p7 & 128) == 0 ? 0 : aVar.f3328b[aVar.f3327a.p()]);
                                }
                            }
                            i15 = i4;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr, aVar.h, aVar.i, Bitmap.Config.ARGB_8888);
                        float f2 = aVar.f3332f;
                        float f3 = aVar.f3330d;
                        float f4 = f2 / f3;
                        float f5 = aVar.g;
                        float f6 = aVar.f3331e;
                        bVar = new c.c.a.a.v1.b(createBitmap, f4, 0, f5 / f6, 0, aVar.h / f3, aVar.i / f6);
                    }
                    aVar.a();
                }
                zVar.A(i7);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            c3 = c2;
            i5 = i2;
        }
        return new c(Collections.unmodifiableList(arrayList));
    }
}
