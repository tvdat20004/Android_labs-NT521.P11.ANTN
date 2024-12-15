package c.c.a.a.u1;

import android.net.Uri;
import c.c.a.a.u1.b0;
import c.c.a.a.y1.x0;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t implements c.c.a.a.y1.n {

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.y1.n f2925a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2926b;

    /* renamed from: c, reason: collision with root package name */
    public final s f2927c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2928d;

    /* renamed from: e, reason: collision with root package name */
    public int f2929e;

    public t(c.c.a.a.y1.n nVar, int i, s sVar) {
        c.c.a.a.x1.p.c(i > 0);
        this.f2925a = nVar;
        this.f2926b = i;
        this.f2927c = sVar;
        this.f2928d = new byte[1];
        this.f2929e = i;
    }

    @Override // c.c.a.a.y1.n
    public long a(c.c.a.a.y1.q qVar) {
        throw new UnsupportedOperationException();
    }

    @Override // c.c.a.a.y1.n
    public void b(x0 x0Var) {
        this.f2925a.b(x0Var);
    }

    @Override // c.c.a.a.y1.n
    public Uri c() {
        return this.f2925a.c();
    }

    @Override // c.c.a.a.y1.n
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // c.c.a.a.y1.n
    public Map<String, List<String>> d() {
        return this.f2925a.d();
    }

    @Override // c.c.a.a.y1.n
    public int e(byte[] bArr, int i, int i2) {
        if (this.f2929e == 0) {
            boolean z = false;
            if (this.f2925a.e(this.f2928d, 0, 1) != -1) {
                int i3 = (this.f2928d[0] & 255) << 4;
                if (i3 != 0) {
                    byte[] bArr2 = new byte[i3];
                    int i4 = i3;
                    int i5 = 0;
                    while (i4 > 0) {
                        int e2 = this.f2925a.e(bArr2, i5, i4);
                        if (e2 == -1) {
                            break;
                        }
                        i5 += e2;
                        i4 -= e2;
                    }
                    while (i3 > 0) {
                        int i6 = i3 - 1;
                        if (bArr2[i6] != 0) {
                            break;
                        }
                        i3 = i6;
                    }
                    if (i3 > 0) {
                        s sVar = this.f2927c;
                        c.c.a.a.z1.z zVar = new c.c.a.a.z1.z(bArr2, i3);
                        b0.a aVar = (b0.a) sVar;
                        long max = !aVar.m ? aVar.i : Math.max(b0.this.v(), aVar.i);
                        int a2 = zVar.a();
                        c.c.a.a.q1.y yVar = aVar.l;
                        Objects.requireNonNull(yVar);
                        yVar.a(zVar, a2);
                        yVar.d(max, 1, a2, 0, null);
                        aVar.m = true;
                    }
                }
                z = true;
            }
            if (!z) {
                return -1;
            }
            this.f2929e = this.f2926b;
        }
        int e3 = this.f2925a.e(bArr, i, Math.min(this.f2929e, i2));
        if (e3 != -1) {
            this.f2929e -= e3;
        }
        return e3;
    }
}
