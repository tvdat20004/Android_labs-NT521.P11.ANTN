package c.c.a.a.q1.h0;

import android.util.Log;
import b.q.u;
import c.c.a.a.l0;
import c.c.a.a.m1.u0;
import c.c.a.a.q1.j;
import c.c.a.a.q1.m;
import c.c.a.a.q1.n;
import c.c.a.a.q1.s;
import c.c.a.a.q1.y;
import c.c.a.a.s0;
import c.c.a.a.x1.p;
import c.c.a.a.z1.z;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public n f2628a;

    /* renamed from: b, reason: collision with root package name */
    public y f2629b;

    /* renamed from: c, reason: collision with root package name */
    public b f2630c;

    /* renamed from: d, reason: collision with root package name */
    public int f2631d;

    /* renamed from: e, reason: collision with root package name */
    public int f2632e;

    @Override // c.c.a.a.q1.m
    public void a() {
    }

    @Override // c.c.a.a.q1.m
    public int d(j jVar, s sVar) {
        if (this.f2630c == null) {
            b n = u.n(jVar);
            this.f2630c = n;
            if (n == null) {
                throw new s0("Unsupported or unrecognized wav header.");
            }
            int i = n.f2634b;
            int i2 = n.f2637e * i;
            int i3 = n.f2633a;
            this.f2629b.b(l0.q(null, "audio/raw", null, i2 * i3, 32768, i3, i, n.f2638f, null, null, 0, null));
            this.f2631d = this.f2630c.f2636d;
        }
        b bVar = this.f2630c;
        int i4 = bVar.g;
        if (!(i4 != -1)) {
            Objects.requireNonNull(jVar);
            Objects.requireNonNull(bVar);
            jVar.f2652f = 0;
            z zVar = new z(8);
            while (true) {
                c a2 = c.a(jVar, zVar);
                int i5 = a2.f2639a;
                if (i5 != u0.f2150d) {
                    int i6 = u0.f2147a;
                    if (i5 != i6 && i5 != u0.f2149c) {
                        StringBuilder j = c.a.a.a.a.j("Ignoring unknown WAV chunk: ");
                        j.append(a2.f2639a);
                        Log.w("WavHeaderReader", j.toString());
                    }
                    long j2 = a2.f2640b + 8;
                    if (a2.f2639a == i6) {
                        j2 = 12;
                    }
                    if (j2 > 2147483647L) {
                        StringBuilder j3 = c.a.a.a.a.j("Chunk is too large (~2GB+) to skip; id: ");
                        j3.append(a2.f2639a);
                        throw new s0(j3.toString());
                    }
                    jVar.h((int) j2);
                } else {
                    jVar.h(8);
                    int i7 = (int) jVar.f2650d;
                    long j4 = i7 + a2.f2640b;
                    long j5 = jVar.f2649c;
                    if (j5 != -1 && j4 > j5) {
                        Log.w("WavHeaderReader", "Data exceeds input length: " + j4 + ", " + j5);
                        j4 = j5;
                    }
                    bVar.g = i7;
                    bVar.h = j4;
                    this.f2628a.a(this.f2630c);
                }
            }
        } else if (jVar.f2650d == 0) {
            jVar.h(i4);
        }
        long j6 = this.f2630c.h;
        p.g(j6 != -1);
        long j7 = j6 - jVar.f2650d;
        if (j7 <= 0) {
            return -1;
        }
        int c2 = this.f2629b.c(jVar, (int) Math.min(32768 - this.f2632e, j7), true);
        if (c2 != -1) {
            this.f2632e += c2;
        }
        int i8 = this.f2632e;
        int i9 = i8 / this.f2631d;
        if (i9 > 0) {
            long b2 = this.f2630c.b(jVar.f2650d - i8);
            int i10 = i9 * this.f2631d;
            int i11 = this.f2632e - i10;
            this.f2632e = i11;
            this.f2629b.d(b2, 1, i10, i11, null);
        }
        return c2 == -1 ? -1 : 0;
    }

    @Override // c.c.a.a.q1.m
    public void e(n nVar) {
        this.f2628a = nVar;
        this.f2629b = nVar.j(0, 1);
        this.f2630c = null;
        nVar.c();
    }

    @Override // c.c.a.a.q1.m
    public void h(long j, long j2) {
        this.f2632e = 0;
    }

    @Override // c.c.a.a.q1.m
    public boolean i(j jVar) {
        return u.n(jVar) != null;
    }
}
