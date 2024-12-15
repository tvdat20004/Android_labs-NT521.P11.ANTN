package c.c.a.a.u1.x0;

import android.net.Uri;
import c.c.a.a.l0;
import c.c.a.a.u1.q0;
import c.c.a.a.y1.x0;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final n f3162a;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.y1.n f3163b;

    /* renamed from: c, reason: collision with root package name */
    public final c.c.a.a.y1.n f3164c;

    /* renamed from: d, reason: collision with root package name */
    public final z f3165d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f3166e;

    /* renamed from: f, reason: collision with root package name */
    public final l0[] f3167f;
    public final c.c.a.a.u1.x0.b0.n g;
    public final q0 h;
    public final List<l0> i;
    public boolean k;
    public byte[] l;
    public IOException m;
    public Uri n;
    public boolean o;
    public c.c.a.a.w1.r p;
    public boolean r;
    public final h j = new h();
    public long q = -9223372036854775807L;

    public l(n nVar, c.c.a.a.u1.x0.b0.n nVar2, Uri[] uriArr, l0[] l0VarArr, e eVar, x0 x0Var, z zVar, List<l0> list) {
        this.f3162a = nVar;
        this.g = nVar2;
        this.f3166e = uriArr;
        this.f3167f = l0VarArr;
        this.f3165d = zVar;
        this.i = list;
        c.c.a.a.y1.n a2 = eVar.a();
        this.f3163b = a2;
        if (x0Var != null) {
            a2.b(x0Var);
        }
        this.f3164c = eVar.a();
        this.h = new q0(l0VarArr);
        int[] iArr = new int[uriArr.length];
        for (int i = 0; i < uriArr.length; i++) {
            iArr[i] = i;
        }
        this.p = new k(this.h, iArr);
    }

    public c.c.a.a.u1.v0.o[] a(p pVar, long j) {
        c.c.a.a.u1.v0.o oVar = c.c.a.a.u1.v0.o.f2971a;
        int i = pVar == null ? -1 : this.h.i(pVar.f2944c);
        int length = ((c.c.a.a.w1.g) this.p).f3409c.length;
        c.c.a.a.u1.v0.o[] oVarArr = new c.c.a.a.u1.v0.o[length];
        boolean z = false;
        int i2 = 0;
        while (i2 < length) {
            int i3 = ((c.c.a.a.w1.g) this.p).f3409c[i2];
            Uri uri = this.f3166e[i3];
            if (((c.c.a.a.u1.x0.b0.c) this.g).d(uri)) {
                c.c.a.a.u1.x0.b0.i c2 = ((c.c.a.a.u1.x0.b0.c) this.g).c(uri, z);
                long j2 = c2.f3140f - ((c.c.a.a.u1.x0.b0.c) this.g).q;
                long b2 = b(pVar, i3 != i ? true : z, c2, j2, j);
                long j3 = c2.i;
                if (b2 < j3) {
                    oVarArr[i2] = oVar;
                } else {
                    oVarArr[i2] = new j(c2, j2, (int) (b2 - j3));
                }
            } else {
                oVarArr[i2] = oVar;
            }
            i2++;
            z = false;
        }
        return oVarArr;
    }

    public final long b(p pVar, boolean z, c.c.a.a.u1.x0.b0.i iVar, long j, long j2) {
        int i;
        long j3;
        long j4;
        if (pVar != null && !z) {
            return pVar.c();
        }
        long j5 = iVar.p + j;
        if (pVar != null && !this.o) {
            j2 = pVar.f2947f;
        }
        if (iVar.l || j2 < j5) {
            List<c.c.a.a.u1.x0.b0.h> list = iVar.o;
            Long valueOf = Long.valueOf(j2 - j);
            boolean z2 = !((c.c.a.a.u1.x0.b0.c) this.g).p || pVar == null;
            int i2 = c.c.a.a.z1.l0.f3761a;
            int binarySearch = Collections.binarySearch(list, valueOf);
            if (binarySearch < 0) {
                i = -(binarySearch + 2);
            } else {
                do {
                    binarySearch--;
                    if (binarySearch < 0) {
                        break;
                    }
                } while (list.get(binarySearch).compareTo(valueOf) == 0);
                i = binarySearch + 1;
            }
            if (z2) {
                i = Math.max(0, i);
            }
            j3 = i;
            j4 = iVar.i;
        } else {
            j3 = iVar.i;
            j4 = iVar.o.size();
        }
        return j3 + j4;
    }

    public final c.c.a.a.u1.v0.d c(Uri uri, int i) {
        if (uri == null) {
            return null;
        }
        if (!this.j.containsKey(uri)) {
            return new g(this.f3164c, new c.c.a.a.y1.q(uri, 0L, -1L, null, 1), this.f3167f[i], this.p.a(), this.p.e(), this.l);
        }
        h hVar = this.j;
        hVar.put(uri, hVar.remove(uri));
        return null;
    }
}
