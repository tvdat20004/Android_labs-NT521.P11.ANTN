package c.c.a.a.q1.e0;

import b.q.u;
import c.c.a.a.s0;
import c.c.a.a.z1.z;
import java.util.Arrays;

/* loaded from: classes.dex */
public class f implements c.c.a.a.q1.m {

    /* renamed from: a, reason: collision with root package name */
    public c.c.a.a.q1.n f2393a;

    /* renamed from: b, reason: collision with root package name */
    public n f2394b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2395c;

    @Override // c.c.a.a.q1.m
    public void a() {
    }

    public final boolean b(c.c.a.a.q1.j jVar) {
        boolean z;
        boolean equals;
        n jVar2;
        h hVar = new h();
        if (hVar.a(jVar, true) && (hVar.f2402b & 2) == 2) {
            int min = Math.min(hVar.f2406f, 8);
            z zVar = new z(min);
            jVar.d(zVar.f3800a, 0, min, false);
            zVar.A(0);
            if (zVar.a() >= 5 && zVar.p() == 127 && zVar.q() == 1179402563) {
                jVar2 = new e();
            } else {
                zVar.A(0);
                try {
                    z = u.t(1, zVar, true);
                } catch (s0 unused) {
                    z = false;
                }
                if (z) {
                    jVar2 = new q();
                } else {
                    zVar.A(0);
                    int i = j.o;
                    int a2 = zVar.a();
                    byte[] bArr = j.p;
                    if (a2 < bArr.length) {
                        equals = false;
                    } else {
                        byte[] bArr2 = new byte[bArr.length];
                        int length = bArr.length;
                        System.arraycopy(zVar.f3800a, zVar.f3801b, bArr2, 0, length);
                        zVar.f3801b += length;
                        equals = Arrays.equals(bArr2, bArr);
                    }
                    if (equals) {
                        jVar2 = new j();
                    }
                }
            }
            this.f2394b = jVar2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // c.c.a.a.q1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(c.c.a.a.q1.j r21, c.c.a.a.q1.s r22) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.e0.f.d(c.c.a.a.q1.j, c.c.a.a.q1.s):int");
    }

    @Override // c.c.a.a.q1.m
    public void e(c.c.a.a.q1.n nVar) {
        this.f2393a = nVar;
    }

    @Override // c.c.a.a.q1.m
    public void h(long j, long j2) {
        n nVar = this.f2394b;
        if (nVar != null) {
            g gVar = nVar.f2409a;
            gVar.f2396a.b();
            gVar.f2397b.v();
            gVar.f2398c = -1;
            gVar.f2400e = false;
            if (j == 0) {
                nVar.f(!nVar.l);
            } else if (nVar.h != 0) {
                long j3 = (nVar.i * j2) / 1000000;
                nVar.f2413e = j3;
                nVar.f2412d.e(j3);
                nVar.h = 2;
            }
        }
    }

    @Override // c.c.a.a.q1.m
    public boolean i(c.c.a.a.q1.j jVar) {
        try {
            return b(jVar);
        } catch (s0 unused) {
            return false;
        }
    }
}
