package c.c.a.a.q1.e0;

import c.c.a.a.s0;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.z;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class h {
    public static final int i = l0.l("OggS");

    /* renamed from: a, reason: collision with root package name */
    public int f2401a;

    /* renamed from: b, reason: collision with root package name */
    public int f2402b;

    /* renamed from: c, reason: collision with root package name */
    public long f2403c;

    /* renamed from: d, reason: collision with root package name */
    public int f2404d;

    /* renamed from: e, reason: collision with root package name */
    public int f2405e;

    /* renamed from: f, reason: collision with root package name */
    public int f2406f;
    public final int[] g = new int[255];
    public final z h = new z(255);

    public boolean a(c.c.a.a.q1.j jVar, boolean z) {
        this.h.v();
        b();
        long j = jVar.f2649c;
        if (!(j == -1 || j - jVar.c() >= 27) || !jVar.d(this.h.f3800a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        }
        if (this.h.q() != i) {
            if (z) {
                return false;
            }
            throw new s0("expected OggS capture pattern at begin of page");
        }
        int p = this.h.p();
        this.f2401a = p;
        if (p != 0) {
            if (z) {
                return false;
            }
            throw new s0("unsupported bit stream revision");
        }
        this.f2402b = this.h.p();
        z zVar = this.h;
        byte[] bArr = zVar.f3800a;
        int i2 = zVar.f3801b + 1;
        zVar.f3801b = i2;
        long j2 = bArr[r2] & 255;
        int i3 = i2 + 1;
        zVar.f3801b = i3;
        int i4 = i3 + 1;
        zVar.f3801b = i4;
        long j3 = j2 | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
        int i5 = i4 + 1;
        zVar.f3801b = i5;
        long j4 = j3 | ((bArr[i4] & 255) << 24);
        int i6 = i5 + 1;
        zVar.f3801b = i6;
        long j5 = j4 | ((bArr[i5] & 255) << 32);
        int i7 = i6 + 1;
        zVar.f3801b = i7;
        long j6 = j5 | ((bArr[i6] & 255) << 40);
        int i8 = i7 + 1;
        zVar.f3801b = i8;
        zVar.f3801b = i8 + 1;
        this.f2403c = j6 | ((bArr[i7] & 255) << 48) | ((bArr[i8] & 255) << 56);
        zVar.g();
        this.h.g();
        this.h.g();
        int p2 = this.h.p();
        this.f2404d = p2;
        this.f2405e = p2 + 27;
        this.h.v();
        jVar.d(this.h.f3800a, 0, this.f2404d, false);
        for (int i9 = 0; i9 < this.f2404d; i9++) {
            this.g[i9] = this.h.p();
            this.f2406f += this.g[i9];
        }
        return true;
    }

    public void b() {
        this.f2401a = 0;
        this.f2402b = 0;
        this.f2403c = 0L;
        this.f2404d = 0;
        this.f2405e = 0;
        this.f2406f = 0;
    }
}
