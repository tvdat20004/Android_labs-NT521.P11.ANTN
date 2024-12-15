package c.c.a.a.q1.a0;

import c.c.a.a.a2.h;
import c.c.a.a.l0;
import c.c.a.a.q1.y;
import c.c.a.a.z1.x;
import c.c.a.a.z1.z;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: b, reason: collision with root package name */
    public final z f2231b;

    /* renamed from: c, reason: collision with root package name */
    public final z f2232c;

    /* renamed from: d, reason: collision with root package name */
    public int f2233d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2234e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2235f;
    public int g;

    public f(y yVar) {
        super(yVar);
        this.f2231b = new z(x.f3792a);
        this.f2232c = new z(4);
    }

    @Override // c.c.a.a.q1.a0.e
    public boolean b(z zVar) {
        int p = zVar.p();
        int i = (p >> 4) & 15;
        int i2 = p & 15;
        if (i2 != 7) {
            throw new d(c.a.a.a.a.b("Video format not supported: ", i2));
        }
        this.g = i;
        return i != 5;
    }

    @Override // c.c.a.a.q1.a0.e
    public boolean c(z zVar, long j) {
        int p = zVar.p();
        byte[] bArr = zVar.f3800a;
        int i = zVar.f3801b;
        int i2 = i + 1;
        zVar.f3801b = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i2 + 1;
        zVar.f3801b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        zVar.f3801b = i4 + 1;
        long j2 = (((bArr[i4] & 255) | i5) * 1000) + j;
        if (p == 0 && !this.f2234e) {
            z zVar2 = new z(new byte[zVar.a()]);
            zVar.c(zVar2.f3800a, 0, zVar.a());
            h b2 = h.b(zVar2);
            this.f2233d = b2.f1933b;
            this.f2230a.b(l0.B(null, "video/avc", null, -1, -1, b2.f1934c, b2.f1935d, -1.0f, b2.f1932a, -1, b2.f1936e, null));
            this.f2234e = true;
            return false;
        }
        if (p != 1 || !this.f2234e) {
            return false;
        }
        int i6 = this.g == 1 ? 1 : 0;
        if (!this.f2235f && i6 == 0) {
            return false;
        }
        byte[] bArr2 = this.f2232c.f3800a;
        bArr2[0] = 0;
        bArr2[1] = 0;
        bArr2[2] = 0;
        int i7 = 4 - this.f2233d;
        int i8 = 0;
        while (zVar.a() > 0) {
            zVar.c(this.f2232c.f3800a, i7, this.f2233d);
            this.f2232c.A(0);
            int s = this.f2232c.s();
            this.f2231b.A(0);
            this.f2230a.a(this.f2231b, 4);
            this.f2230a.a(zVar, s);
            i8 = i8 + 4 + s;
        }
        this.f2230a.d(j2, i6, i8, 0, null);
        this.f2235f = true;
        return true;
    }
}
