package c.c.a.a.q1.e0;

import c.c.a.a.z1.z;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final h f2396a = new h();

    /* renamed from: b, reason: collision with root package name */
    public final z f2397b = new z(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f2398c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f2399d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2400e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.f2399d = 0;
        do {
            int i4 = this.f2399d;
            int i5 = i + i4;
            h hVar = this.f2396a;
            if (i5 >= hVar.f2404d) {
                break;
            }
            int[] iArr = hVar.g;
            this.f2399d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public boolean b(c.c.a.a.q1.j jVar) {
        int i;
        c.c.a.a.x1.p.g(jVar != null);
        if (this.f2400e) {
            this.f2400e = false;
            this.f2397b.v();
        }
        while (!this.f2400e) {
            if (this.f2398c < 0) {
                if (!this.f2396a.a(jVar, true)) {
                    return false;
                }
                h hVar = this.f2396a;
                int i2 = hVar.f2405e;
                if ((hVar.f2402b & 1) == 1 && this.f2397b.f3802c == 0) {
                    i2 += a(0);
                    i = this.f2399d + 0;
                } else {
                    i = 0;
                }
                jVar.h(i2);
                this.f2398c = i;
            }
            int a2 = a(this.f2398c);
            int i3 = this.f2398c + this.f2399d;
            if (a2 > 0) {
                z zVar = this.f2397b;
                byte[] bArr = zVar.f3800a;
                int length = bArr.length;
                int i4 = zVar.f3802c;
                if (length < i4 + a2) {
                    zVar.f3800a = Arrays.copyOf(bArr, i4 + a2);
                }
                z zVar2 = this.f2397b;
                jVar.g(zVar2.f3800a, zVar2.f3802c, a2, false);
                z zVar3 = this.f2397b;
                zVar3.z(zVar3.f3802c + a2);
                this.f2400e = this.f2396a.g[i3 + (-1)] != 255;
            }
            if (i3 == this.f2396a.f2404d) {
                i3 = -1;
            }
            this.f2398c = i3;
        }
        return true;
    }
}
