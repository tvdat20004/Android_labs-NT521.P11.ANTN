package c.c.a.a.m1;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2088a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2089b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2090c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2091d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2092e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2093f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final r[] k;

    public f0(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, boolean z3, r[] rVarArr) {
        int i8;
        int i9;
        this.f2088a = z;
        this.f2089b = i;
        this.f2090c = i2;
        this.f2091d = i3;
        this.f2092e = i4;
        this.f2093f = i5;
        this.g = i6;
        if (i7 != 0) {
            i9 = i7;
        } else if (z) {
            int minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
            c.c.a.a.x1.p.g(minBufferSize != -2);
            long j = i4;
            i9 = c.c.a.a.z1.l0.f(minBufferSize * 4, ((int) ((250000 * j) / 1000000)) * i3, (int) Math.max(minBufferSize, ((j * 750000) / 1000000) * i3));
        } else {
            if (i6 != 5) {
                if (i6 != 6) {
                    if (i6 == 7) {
                        i8 = 192000;
                    } else if (i6 == 8) {
                        i8 = 2250000;
                    } else if (i6 == 14) {
                        i8 = 3062500;
                    } else if (i6 == 17) {
                        i8 = 336000;
                    } else if (i6 != 18) {
                        throw new IllegalArgumentException();
                    }
                }
                i8 = 768000;
            } else {
                i8 = 80000;
            }
            i9 = (int) (((i6 == 5 ? i8 * 2 : i8) * 250000) / 1000000);
        }
        this.h = i9;
        this.i = z2;
        this.j = z3;
        this.k = rVarArr;
    }

    public boolean a(f0 f0Var) {
        return f0Var.g == this.g && f0Var.f2092e == this.f2092e && f0Var.f2093f == this.f2093f;
    }

    public long b(long j) {
        return (j * 1000000) / this.f2092e;
    }
}
