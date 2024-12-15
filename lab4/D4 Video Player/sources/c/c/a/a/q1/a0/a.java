package c.c.a.a.q1.a0;

import android.util.Pair;
import c.c.a.a.l0;
import c.c.a.a.q1.y;
import c.c.a.a.z1.h;
import c.c.a.a.z1.z;
import java.util.Collections;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2219e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    public boolean f2220b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2221c;

    /* renamed from: d, reason: collision with root package name */
    public int f2222d;

    public a(y yVar) {
        super(yVar);
    }

    @Override // c.c.a.a.q1.a0.e
    public boolean b(z zVar) {
        l0 q;
        if (this.f2220b) {
            zVar.B(1);
        } else {
            int p = zVar.p();
            int i = (p >> 4) & 15;
            this.f2222d = i;
            if (i == 2) {
                q = l0.r(null, "audio/mpeg", null, -1, -1, 1, f2219e[(p >> 2) & 3], null, null, 0, null);
            } else if (i == 7 || i == 8) {
                q = l0.q(null, i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", null, -1, -1, 1, 8000, (p & 1) == 1 ? 2 : 3, null, null, 0, null);
            } else {
                if (i != 10) {
                    StringBuilder j = c.a.a.a.a.j("Audio format not supported: ");
                    j.append(this.f2222d);
                    throw new d(j.toString());
                }
                this.f2220b = true;
            }
            this.f2230a.b(q);
            this.f2221c = true;
            this.f2220b = true;
        }
        return true;
    }

    @Override // c.c.a.a.q1.a0.e
    public boolean c(z zVar, long j) {
        if (this.f2222d == 2) {
            int a2 = zVar.a();
            this.f2230a.a(zVar, a2);
            this.f2230a.d(j, 1, a2, 0, null);
            return true;
        }
        int p = zVar.p();
        if (p != 0 || this.f2221c) {
            if (this.f2222d == 10 && p != 1) {
                return false;
            }
            int a3 = zVar.a();
            this.f2230a.a(zVar, a3);
            this.f2230a.d(j, 1, a3, 0, null);
            return true;
        }
        int a4 = zVar.a();
        byte[] bArr = new byte[a4];
        System.arraycopy(zVar.f3800a, zVar.f3801b, bArr, 0, a4);
        zVar.f3801b += a4;
        Pair<Integer, Integer> d2 = h.d(new c.c.a.a.z1.y(bArr), false);
        this.f2230a.b(l0.r(null, "audio/mp4a-latm", null, -1, -1, ((Integer) d2.second).intValue(), ((Integer) d2.first).intValue(), Collections.singletonList(bArr), null, 0, null));
        this.f2221c = true;
        return false;
    }
}
