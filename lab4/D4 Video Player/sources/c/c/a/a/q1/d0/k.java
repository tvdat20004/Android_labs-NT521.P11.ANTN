package c.c.a.a.q1.d0;

import android.util.Log;
import android.util.SparseArray;
import c.c.a.a.q1.y;
import c.c.a.a.s0;
import c.c.a.a.z1.k0;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.x;
import c.c.a.a.z1.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public class k implements c.c.a.a.q1.m {
    public static final int J = l0.l("seig");
    public static final byte[] K = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final c.c.a.a.l0 L = c.c.a.a.l0.u(null, "application/x-emsg", Long.MAX_VALUE);
    public int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public c.c.a.a.q1.n F;
    public y[] G;
    public y[] H;
    public boolean I;

    /* renamed from: a, reason: collision with root package name */
    public final int f2326a;

    /* renamed from: b, reason: collision with root package name */
    public final s f2327b;

    /* renamed from: c, reason: collision with root package name */
    public final List<c.c.a.a.l0> f2328c;

    /* renamed from: d, reason: collision with root package name */
    public final c.c.a.a.p1.e f2329d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray<j> f2330e;

    /* renamed from: f, reason: collision with root package name */
    public final z f2331f;
    public final z g;
    public final z h;
    public final byte[] i;
    public final z j;
    public final k0 k;
    public final z l;
    public final ArrayDeque<a> m;
    public final ArrayDeque<i> n;
    public final y o;
    public int p;
    public int q;
    public long r;
    public int s;
    public z t;
    public long u;
    public int v;
    public long w;
    public long x;
    public long y;
    public j z;

    public k(int i, k0 k0Var, s sVar, c.c.a.a.p1.e eVar, List<c.c.a.a.l0> list, y yVar) {
        this.f2326a = i | (sVar != null ? 8 : 0);
        this.k = k0Var;
        this.f2327b = sVar;
        this.f2329d = eVar;
        this.f2328c = Collections.unmodifiableList(list);
        this.o = yVar;
        this.l = new z(16);
        this.f2331f = new z(x.f3792a);
        this.g = new z(5);
        this.h = new z();
        byte[] bArr = new byte[16];
        this.i = bArr;
        this.j = new z(bArr);
        this.m = new ArrayDeque<>();
        this.n = new ArrayDeque<>();
        this.f2330e = new SparseArray<>();
        this.x = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.y = -9223372036854775807L;
        b();
    }

    public static c.c.a.a.p1.e f(List<b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            b bVar = list.get(i);
            if (bVar.f2299a == c.i0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.g1.f3800a;
                UUID m = b.q.u.m(bArr);
                if (m == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new c.c.a.a.p1.d(m, null, "video/mp4", bArr, false));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new c.c.a.a.p1.e(null, false, (c.c.a.a.p1.d[]) arrayList.toArray(new c.c.a.a.p1.d[0]));
    }

    public static void j(z zVar, int i, u uVar) {
        zVar.A(i + 8);
        int d2 = zVar.d();
        int i2 = c.f2294b;
        int i3 = d2 & 16777215;
        if ((i3 & 1) != 0) {
            throw new s0("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (i3 & 2) != 0;
        int s = zVar.s();
        if (s != uVar.f2369e) {
            StringBuilder k = c.a.a.a.a.k("Length mismatch: ", s, ", ");
            k.append(uVar.f2369e);
            throw new s0(k.toString());
        }
        Arrays.fill(uVar.m, 0, s, z);
        uVar.a(zVar.a());
        zVar.c(uVar.p.f3800a, 0, uVar.o);
        uVar.p.A(0);
        uVar.q = false;
    }

    @Override // c.c.a.a.q1.m
    public void a() {
    }

    public final void b() {
        this.p = 0;
        this.s = 0;
    }

    public final h c(SparseArray<h> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        h hVar = sparseArray.get(i);
        Objects.requireNonNull(hVar);
        return hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:359:0x0287, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x06ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x06b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x030e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0579  */
    @Override // c.c.a.a.q1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(c.c.a.a.q1.j r27, c.c.a.a.q1.s r28) {
        /*
            Method dump skipped, instructions count: 1727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.d0.k.d(c.c.a.a.q1.j, c.c.a.a.q1.s):int");
    }

    @Override // c.c.a.a.q1.m
    public void e(c.c.a.a.q1.n nVar) {
        this.F = nVar;
        s sVar = this.f2327b;
        if (sVar != null) {
            j jVar = new j(nVar.j(0, sVar.f2355b));
            jVar.b(this.f2327b, new h(0, 0, 0, 0));
            this.f2330e.put(0, jVar);
            g();
            this.F.c();
        }
    }

    public final void g() {
        int i;
        if (this.G == null) {
            y[] yVarArr = new y[2];
            this.G = yVarArr;
            y yVar = this.o;
            if (yVar != null) {
                yVarArr[0] = yVar;
                i = 1;
            } else {
                i = 0;
            }
            if ((this.f2326a & 4) != 0) {
                yVarArr[i] = this.F.j(this.f2330e.size(), 4);
                i++;
            }
            y[] yVarArr2 = (y[]) Arrays.copyOf(this.G, i);
            this.G = yVarArr2;
            for (y yVar2 : yVarArr2) {
                yVar2.b(L);
            }
        }
        if (this.H == null) {
            this.H = new y[this.f2328c.size()];
            for (int i2 = 0; i2 < this.H.length; i2++) {
                y j = this.F.j(this.f2330e.size() + 1 + i2, 3);
                j.b(this.f2328c.get(i2));
                this.H[i2] = j;
            }
        }
    }

    @Override // c.c.a.a.q1.m
    public void h(long j, long j2) {
        int size = this.f2330e.size();
        for (int i = 0; i < size; i++) {
            this.f2330e.valueAt(i).d();
        }
        this.n.clear();
        this.v = 0;
        this.w = j2;
        this.m.clear();
        this.E = false;
        b();
    }

    @Override // c.c.a.a.q1.m
    public boolean i(c.c.a.a.q1.j jVar) {
        return r.a(jVar, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0396  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(long r49) {
        /*
            Method dump skipped, instructions count: 1824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.d0.k.k(long):void");
    }
}
