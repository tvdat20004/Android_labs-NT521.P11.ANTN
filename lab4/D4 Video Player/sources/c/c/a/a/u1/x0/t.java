package c.c.a.a.u1.x0;

import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import c.c.a.a.l0;
import c.c.a.a.u1.j0;
import c.c.a.a.u1.k0;
import c.c.a.a.u1.n0;
import c.c.a.a.u1.q0;
import c.c.a.a.u1.s0;
import c.c.a.a.y1.i0;
import c.c.a.a.y1.m0;
import c.c.a.a.y1.p0;
import c.c.a.a.y1.v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t implements i0<c.c.a.a.u1.v0.d>, m0, n0, c.c.a.a.q1.n, j0 {
    public boolean A;
    public int B;
    public l0 C;
    public l0 D;
    public boolean E;
    public s0 F;
    public s0 G;
    public int[] H;
    public int I;
    public boolean J;
    public long M;
    public long N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public long S;
    public int T;

    /* renamed from: b, reason: collision with root package name */
    public final int f3180b;

    /* renamed from: c, reason: collision with root package name */
    public final q f3181c;

    /* renamed from: d, reason: collision with root package name */
    public final l f3182d;

    /* renamed from: e, reason: collision with root package name */
    public final c.c.a.a.y1.r f3183e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f3184f;
    public final c.c.a.a.y1.z g;
    public final c.c.a.a.u1.y i;
    public final ArrayList<p> k;
    public final List<p> l;
    public final Runnable m;
    public final Runnable n;
    public final Handler o;
    public final ArrayList<r> p;
    public final Map<String, c.c.a.a.p1.e> q;
    public boolean t;
    public boolean v;
    public int x;
    public int y;
    public boolean z;
    public final p0 h = new p0("Loader:HlsSampleStreamWrapper");
    public final i j = new i();
    public int[] s = new int[0];
    public int u = -1;
    public int w = -1;
    public k0[] r = new k0[0];
    public boolean[] L = new boolean[0];
    public boolean[] K = new boolean[0];

    public t(int i, q qVar, l lVar, Map<String, c.c.a.a.p1.e> map, c.c.a.a.y1.r rVar, long j, l0 l0Var, c.c.a.a.y1.z zVar, c.c.a.a.u1.y yVar) {
        this.f3180b = i;
        this.f3181c = qVar;
        this.f3182d = lVar;
        this.q = map;
        this.f3183e = rVar;
        this.f3184f = l0Var;
        this.g = zVar;
        this.i = yVar;
        ArrayList<p> arrayList = new ArrayList<>();
        this.k = arrayList;
        this.l = Collections.unmodifiableList(arrayList);
        this.p = new ArrayList<>();
        this.m = new Runnable() { // from class: c.c.a.a.u1.x0.b
            @Override // java.lang.Runnable
            public final void run() {
                t.this.A();
            }
        };
        this.n = new Runnable() { // from class: c.c.a.a.u1.x0.a
            @Override // java.lang.Runnable
            public final void run() {
                t tVar = t.this;
                tVar.z = true;
                tVar.A();
            }
        };
        this.o = new Handler();
        this.M = j;
        this.N = j;
    }

    public static c.c.a.a.q1.l u(int i, int i2) {
        Log.w("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new c.c.a.a.q1.l();
    }

    public static l0 v(l0 l0Var, l0 l0Var2, boolean z) {
        if (l0Var == null) {
            return l0Var2;
        }
        int i = z ? l0Var.f2041f : -1;
        int i2 = l0Var.w;
        int i3 = i2 != -1 ? i2 : l0Var2.w;
        String k = c.c.a.a.z1.l0.k(l0Var.g, c.c.a.a.z1.u.f(l0Var2.j));
        String c2 = c.c.a.a.z1.u.c(k);
        if (c2 == null) {
            c2 = l0Var2.j;
        }
        String str = c2;
        String str2 = l0Var.f2037b;
        String str3 = l0Var.f2038c;
        c.c.a.a.s1.c cVar = l0Var.h;
        int i4 = l0Var.o;
        int i5 = l0Var.p;
        int i6 = l0Var.f2039d;
        String str4 = l0Var.B;
        c.c.a.a.s1.c cVar2 = l0Var2.h;
        if (cVar2 != null) {
            cVar = cVar == null ? cVar2 : cVar2.i(cVar.f2719b);
        }
        return new l0(str2, str3, i6, l0Var2.f2040e, i, k, cVar, l0Var2.i, str, l0Var2.k, l0Var2.l, l0Var2.m, l0Var2.n, i4, i5, l0Var2.q, l0Var2.r, l0Var2.s, l0Var2.u, l0Var2.t, l0Var2.v, i3, l0Var2.x, l0Var2.y, l0Var2.z, l0Var2.A, str4, l0Var2.C);
    }

    public static int x(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public final void A() {
        if (!this.E && this.H == null && this.z) {
            for (k0 k0Var : this.r) {
                if (k0Var.n() == null) {
                    return;
                }
            }
            s0 s0Var = this.F;
            if (s0Var != null) {
                int i = s0Var.f2922b;
                int[] iArr = new int[i];
                this.H = iArr;
                Arrays.fill(iArr, -1);
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = 0;
                    while (true) {
                        k0[] k0VarArr = this.r;
                        if (i3 < k0VarArr.length) {
                            l0 n = k0VarArr[i3].n();
                            l0 l0Var = this.F.f2923c[i2].f2919c[0];
                            String str = n.j;
                            String str2 = l0Var.j;
                            int f2 = c.c.a.a.z1.u.f(str);
                            if (f2 == 3 ? c.c.a.a.z1.l0.a(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || n.C == l0Var.C) : f2 == c.c.a.a.z1.u.f(str2)) {
                                this.H[i2] = i3;
                                break;
                            }
                            i3++;
                        }
                    }
                }
                Iterator<r> it = this.p.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
                return;
            }
            int length = this.r.length;
            int i4 = 0;
            int i5 = -1;
            int i6 = 6;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                String str3 = this.r[i4].n().j;
                int i7 = c.c.a.a.z1.u.j(str3) ? 2 : c.c.a.a.z1.u.h(str3) ? 1 : c.c.a.a.z1.u.i(str3) ? 3 : 6;
                if (x(i7) > x(i6)) {
                    i5 = i4;
                    i6 = i7;
                } else if (i7 == i6 && i5 != -1) {
                    i5 = -1;
                }
                i4++;
            }
            q0 q0Var = this.f3182d.h;
            int i8 = q0Var.f2918b;
            this.I = -1;
            this.H = new int[length];
            for (int i9 = 0; i9 < length; i9++) {
                this.H[i9] = i9;
            }
            q0[] q0VarArr = new q0[length];
            for (int i10 = 0; i10 < length; i10++) {
                l0 n2 = this.r[i10].n();
                if (i10 == i5) {
                    l0[] l0VarArr = new l0[i8];
                    if (i8 == 1) {
                        l0VarArr[0] = n2.l(q0Var.f2919c[0]);
                    } else {
                        for (int i11 = 0; i11 < i8; i11++) {
                            l0VarArr[i11] = v(q0Var.f2919c[i11], n2, true);
                        }
                    }
                    q0VarArr[i10] = new q0(l0VarArr);
                    this.I = i10;
                } else {
                    q0VarArr[i10] = new q0(v((i6 == 2 && c.c.a.a.z1.u.h(n2.j)) ? this.f3184f : null, n2, false));
                }
            }
            this.F = new s0(q0VarArr);
            c.c.a.a.x1.p.g(this.G == null);
            this.G = s0.f2921e;
            this.A = true;
            this.f3181c.k();
        }
    }

    public void B() {
        this.h.e(Integer.MIN_VALUE);
        l lVar = this.f3182d;
        IOException iOException = lVar.m;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = lVar.n;
        if (uri == null || !lVar.r) {
            return;
        }
        ((c.c.a.a.u1.x0.b0.c) lVar.g).e(uri);
    }

    public void C(s0 s0Var, int i, s0 s0Var2) {
        this.A = true;
        this.F = s0Var;
        this.G = s0Var2;
        this.I = i;
        Handler handler = this.o;
        final q qVar = this.f3181c;
        qVar.getClass();
        handler.post(new Runnable() { // from class: c.c.a.a.u1.x0.c
            @Override // java.lang.Runnable
            public final void run() {
                q.this.k();
            }
        });
    }

    public final void D() {
        for (k0 k0Var : this.r) {
            k0Var.u(this.O);
        }
        this.O = false;
    }

    public boolean E(long j, boolean z) {
        boolean z2;
        this.M = j;
        if (z()) {
            this.N = j;
            return true;
        }
        if (this.z && !z) {
            int length = this.r.length;
            for (int i = 0; i < length; i++) {
                k0 k0Var = this.r[i];
                k0Var.v();
                if (!(k0Var.e(j, true, false) != -1) && (this.L[i] || !this.J)) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
            if (z2) {
                return false;
            }
        }
        this.N = j;
        this.Q = false;
        this.k.clear();
        if (this.h.d()) {
            this.h.b();
        } else {
            D();
        }
        return true;
    }

    @Override // c.c.a.a.q1.n
    public void a(c.c.a.a.q1.v vVar) {
    }

    @Override // c.c.a.a.q1.n
    public void c() {
        this.R = true;
        this.o.post(this.n);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    @Override // c.c.a.a.u1.n0
    public long d() {
        /*
            r7 = this;
            boolean r0 = r7.Q
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.z()
            if (r0 == 0) goto L10
            long r0 = r7.N
            return r0
        L10:
            long r0 = r7.M
            c.c.a.a.u1.x0.p r2 = r7.w()
            boolean r3 = r2.G
            if (r3 == 0) goto L1b
            goto L34
        L1b:
            java.util.ArrayList<c.c.a.a.u1.x0.p> r2 = r7.k
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L33
            java.util.ArrayList<c.c.a.a.u1.x0.p> r2 = r7.k
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            c.c.a.a.u1.x0.p r2 = (c.c.a.a.u1.x0.p) r2
            goto L34
        L33:
            r2 = 0
        L34:
            if (r2 == 0) goto L3c
            long r2 = r2.g
            long r0 = java.lang.Math.max(r0, r2)
        L3c:
            boolean r2 = r7.z
            if (r2 == 0) goto L53
            c.c.a.a.u1.k0[] r2 = r7.r
            int r3 = r2.length
            r4 = 0
        L44:
            if (r4 >= r3) goto L53
            r5 = r2[r4]
            long r5 = r5.l()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L44
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.x0.t.d():long");
    }

    @Override // c.c.a.a.u1.n0
    public long e() {
        if (z()) {
            return this.N;
        }
        if (this.Q) {
            return Long.MIN_VALUE;
        }
        return w().g;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015e  */
    @Override // c.c.a.a.u1.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(long r49) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.x0.t.f(long):boolean");
    }

    @Override // c.c.a.a.u1.n0
    public void g(long j) {
    }

    @Override // c.c.a.a.y1.i0
    public c.c.a.a.y1.j0 i(c.c.a.a.u1.v0.d dVar, long j, long j2, IOException iOException, int i) {
        boolean z;
        c.c.a.a.y1.j0 c2;
        c.c.a.a.u1.v0.d dVar2 = dVar;
        long j3 = dVar2.h.f3690b;
        boolean z2 = dVar2 instanceof p;
        long a2 = this.g.a(iOException);
        if (a2 != -9223372036854775807L) {
            l lVar = this.f3182d;
            c.c.a.a.w1.g gVar = (c.c.a.a.w1.g) lVar.p;
            z = gVar.h(gVar.j(lVar.h.i(dVar2.f2944c)), a2);
        } else {
            z = false;
        }
        if (z) {
            if (z2 && j3 == 0) {
                ArrayList<p> arrayList = this.k;
                c.c.a.a.x1.p.g(arrayList.remove(arrayList.size() - 1) == dVar2);
                if (this.k.isEmpty()) {
                    this.N = this.M;
                }
            }
            c2 = p0.f3646d;
        } else {
            long c3 = this.g.c(iOException, i);
            c2 = c3 != -9223372036854775807L ? p0.c(false, c3) : p0.f3647e;
        }
        c.c.a.a.y1.j0 j0Var = c2;
        c.c.a.a.u1.y yVar = this.i;
        c.c.a.a.y1.q qVar = dVar2.f2942a;
        v0 v0Var = dVar2.h;
        yVar.g(qVar, v0Var.f3691c, v0Var.f3692d, dVar2.f2943b, this.f3180b, dVar2.f2944c, dVar2.f2945d, dVar2.f2946e, dVar2.f2947f, dVar2.g, j, j2, j3, iOException, !j0Var.a());
        if (z) {
            if (this.A) {
                this.f3181c.c(this);
            } else {
                f(this.M);
            }
        }
        return j0Var;
    }

    @Override // c.c.a.a.q1.n
    public c.c.a.a.q1.y j(int i, int i2) {
        k0[] k0VarArr = this.r;
        int length = k0VarArr.length;
        if (i2 == 1) {
            int i3 = this.u;
            if (i3 != -1) {
                if (this.t) {
                    return this.s[i3] == i ? k0VarArr[i3] : u(i, i2);
                }
                this.t = true;
                this.s[i3] = i;
                return k0VarArr[i3];
            }
            if (this.R) {
                return u(i, i2);
            }
        } else if (i2 == 2) {
            int i4 = this.w;
            if (i4 != -1) {
                if (this.v) {
                    return this.s[i4] == i ? k0VarArr[i4] : u(i, i2);
                }
                this.v = true;
                this.s[i4] = i;
                return k0VarArr[i4];
            }
            if (this.R) {
                return u(i, i2);
            }
        } else {
            for (int i5 = 0; i5 < length; i5++) {
                if (this.s[i5] == i) {
                    return this.r[i5];
                }
            }
            if (this.R) {
                return u(i, i2);
            }
        }
        s sVar = new s(this.f3183e);
        sVar.w(this.S);
        sVar.f2895c.s = this.T;
        sVar.o = this;
        int i6 = length + 1;
        int[] copyOf = Arrays.copyOf(this.s, i6);
        this.s = copyOf;
        copyOf[length] = i;
        k0[] k0VarArr2 = (k0[]) Arrays.copyOf(this.r, i6);
        this.r = k0VarArr2;
        k0VarArr2[length] = sVar;
        boolean[] copyOf2 = Arrays.copyOf(this.L, i6);
        this.L = copyOf2;
        copyOf2[length] = i2 == 1 || i2 == 2;
        this.J = copyOf2[length] | this.J;
        if (i2 == 1) {
            this.t = true;
            this.u = length;
        } else if (i2 == 2) {
            this.v = true;
            this.w = length;
        }
        if (x(i2) > x(this.x)) {
            this.y = length;
            this.x = i2;
        }
        this.K = Arrays.copyOf(this.K, i6);
        return sVar;
    }

    @Override // c.c.a.a.y1.m0
    public void k() {
        D();
    }

    @Override // c.c.a.a.y1.i0
    public void l(c.c.a.a.u1.v0.d dVar, long j, long j2) {
        c.c.a.a.u1.v0.d dVar2 = dVar;
        l lVar = this.f3182d;
        Objects.requireNonNull(lVar);
        if (dVar2 instanceof g) {
            g gVar = (g) dVar2;
            lVar.l = gVar.i;
            lVar.j.put(gVar.f2942a.f3651a, gVar.k);
        }
        c.c.a.a.u1.y yVar = this.i;
        c.c.a.a.y1.q qVar = dVar2.f2942a;
        v0 v0Var = dVar2.h;
        yVar.e(qVar, v0Var.f3691c, v0Var.f3692d, dVar2.f2943b, this.f3180b, dVar2.f2944c, dVar2.f2945d, dVar2.f2946e, dVar2.f2947f, dVar2.g, j, j2, v0Var.f3690b);
        if (this.A) {
            this.f3181c.c(this);
        } else {
            f(this.M);
        }
    }

    @Override // c.c.a.a.y1.i0
    public void p(c.c.a.a.u1.v0.d dVar, long j, long j2, boolean z) {
        c.c.a.a.u1.v0.d dVar2 = dVar;
        c.c.a.a.u1.y yVar = this.i;
        c.c.a.a.y1.q qVar = dVar2.f2942a;
        v0 v0Var = dVar2.h;
        yVar.c(qVar, v0Var.f3691c, v0Var.f3692d, dVar2.f2943b, this.f3180b, dVar2.f2944c, dVar2.f2945d, dVar2.f2946e, dVar2.f2947f, dVar2.g, j, j2, v0Var.f3690b);
        if (z) {
            return;
        }
        D();
        if (this.B > 0) {
            this.f3181c.c(this);
        }
    }

    @Override // c.c.a.a.u1.j0
    public void r(l0 l0Var) {
        this.o.post(this.m);
    }

    public final p w() {
        return this.k.get(r0.size() - 1);
    }

    public void y(int i, boolean z, boolean z2) {
        if (!z2) {
            this.t = false;
            this.v = false;
        }
        this.T = i;
        for (k0 k0Var : this.r) {
            k0Var.f2895c.s = i;
        }
        if (z) {
            for (k0 k0Var2 : this.r) {
                k0Var2.n = true;
            }
        }
    }

    public final boolean z() {
        return this.N != -9223372036854775807L;
    }
}
