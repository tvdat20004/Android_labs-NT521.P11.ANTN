package b.f.b.l;

import b.f.b.l.c;
import b.f.b.l.k.m;
import b.f.b.l.k.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {
    public boolean A;
    public c D;
    public c E;
    public c F;
    public c G;
    public c H;
    public c I;
    public c J;
    public c K;
    public c[] L;
    public ArrayList<c> M;
    public boolean[] N;
    public a[] O;
    public d P;
    public int Q;
    public int R;
    public float S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public float Z;
    public float a0;

    /* renamed from: b, reason: collision with root package name */
    public b.f.b.l.k.d f977b;
    public Object b0;

    /* renamed from: c, reason: collision with root package name */
    public b.f.b.l.k.d f978c;
    public int c0;
    public String d0;
    public int e0;
    public int f0;
    public float[] g0;
    public d[] h0;
    public d[] i0;
    public int j0;
    public int k0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f976a = false;

    /* renamed from: d, reason: collision with root package name */
    public m f979d = null;

    /* renamed from: e, reason: collision with root package name */
    public o f980e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean[] f981f = {true, true};
    public int[] g = {0, 0, 0, 0};
    public boolean h = true;
    public boolean i = false;
    public boolean j = false;
    public int k = -1;
    public int l = -1;
    public int m = 0;
    public int n = 0;
    public int[] o = new int[2];
    public int p = 0;
    public int q = 0;
    public float r = 1.0f;
    public int s = 0;
    public int t = 0;
    public float u = 1.0f;
    public int v = -1;
    public float w = 1.0f;
    public int[] x = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float y = 0.0f;
    public boolean z = false;
    public int B = 0;
    public int C = 0;

    public enum a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public d() {
        c cVar = new c(this, c.a.LEFT);
        this.D = cVar;
        c cVar2 = new c(this, c.a.TOP);
        this.E = cVar2;
        c cVar3 = new c(this, c.a.RIGHT);
        this.F = cVar3;
        c cVar4 = new c(this, c.a.BOTTOM);
        this.G = cVar4;
        c cVar5 = new c(this, c.a.BASELINE);
        this.H = cVar5;
        this.I = new c(this, c.a.CENTER_X);
        this.J = new c(this, c.a.CENTER_Y);
        c cVar6 = new c(this, c.a.CENTER);
        this.K = cVar6;
        this.L = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar6};
        ArrayList<c> arrayList = new ArrayList<>();
        this.M = arrayList;
        this.N = new boolean[2];
        a aVar = a.FIXED;
        this.O = new a[]{aVar, aVar};
        this.P = null;
        this.Q = 0;
        this.R = 0;
        this.S = 0.0f;
        this.T = -1;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.Z = 0.5f;
        this.a0 = 0.5f;
        this.c0 = 0;
        this.d0 = null;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = new float[]{-1.0f, -1.0f};
        this.h0 = new d[]{null, null};
        this.i0 = new d[]{null, null};
        this.j0 = -1;
        this.k0 = -1;
        arrayList.add(this.D);
        this.M.add(this.E);
        this.M.add(this.F);
        this.M.add(this.G);
        this.M.add(this.I);
        this.M.add(this.J);
        this.M.add(this.K);
        this.M.add(this.H);
    }

    public void A() {
        this.D.h();
        this.E.h();
        this.F.h();
        this.G.h();
        this.H.h();
        this.I.h();
        this.J.h();
        this.K.h();
        this.P = null;
        this.y = 0.0f;
        this.Q = 0;
        this.R = 0;
        this.S = 0.0f;
        this.T = -1;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.5f;
        this.a0 = 0.5f;
        a[] aVarArr = this.O;
        a aVar = a.FIXED;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.b0 = null;
        this.c0 = 0;
        this.e0 = 0;
        this.f0 = 0;
        float[] fArr = this.g0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.k = -1;
        this.l = -1;
        int[] iArr = this.x;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.m = 0;
        this.n = 0;
        this.r = 1.0f;
        this.u = 1.0f;
        this.q = Integer.MAX_VALUE;
        this.t = Integer.MAX_VALUE;
        this.p = 0;
        this.s = 0;
        this.v = -1;
        this.w = 1.0f;
        boolean[] zArr = this.f981f;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.N;
        zArr2[0] = false;
        zArr2[1] = false;
        this.h = true;
    }

    public void B() {
        this.i = false;
        this.j = false;
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            c cVar = this.M.get(i);
            cVar.f967c = false;
            cVar.f966b = 0;
        }
    }

    public void C(b.f.b.d dVar) {
        this.D.i();
        this.E.i();
        this.F.i();
        this.G.i();
        this.H.i();
        this.K.i();
        this.I.i();
        this.J.i();
    }

    public void D(int i) {
        this.W = i;
        this.z = i > 0;
    }

    public void E(int i, int i2) {
        c cVar = this.D;
        cVar.f966b = i;
        cVar.f967c = true;
        c cVar2 = this.F;
        cVar2.f966b = i2;
        cVar2.f967c = true;
        this.U = i;
        this.Q = i2 - i;
        this.i = true;
    }

    public void F(int i, int i2) {
        c cVar = this.E;
        cVar.f966b = i;
        cVar.f967c = true;
        c cVar2 = this.G;
        cVar2.f966b = i2;
        cVar2.f967c = true;
        this.V = i;
        this.R = i2 - i;
        if (this.z) {
            this.H.j(i + this.W);
        }
        this.j = true;
    }

    public void G(int i) {
        this.R = i;
        int i2 = this.Y;
        if (i < i2) {
            this.R = i2;
        }
    }

    public void H(a aVar) {
        this.O[0] = aVar;
    }

    public void I(int i) {
        if (i < 0) {
            i = 0;
        }
        this.Y = i;
    }

    public void J(int i) {
        if (i < 0) {
            i = 0;
        }
        this.X = i;
    }

    public void K(a aVar) {
        this.O[1] = aVar;
    }

    public void L(int i) {
        this.Q = i;
        int i2 = this.X;
        if (i < i2) {
            this.Q = i2;
        }
    }

    public void M(boolean z, boolean z2) {
        int i;
        int i2;
        a aVar = a.FIXED;
        m mVar = this.f979d;
        boolean z3 = z & mVar.g;
        o oVar = this.f980e;
        boolean z4 = z2 & oVar.g;
        int i3 = mVar.h.g;
        int i4 = oVar.h.g;
        int i5 = mVar.i.g;
        int i6 = oVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.U = i3;
        }
        if (z4) {
            this.V = i4;
        }
        if (this.c0 == 8) {
            this.Q = 0;
            this.R = 0;
            return;
        }
        if (z3) {
            if (this.O[0] == aVar && i8 < (i2 = this.Q)) {
                i8 = i2;
            }
            this.Q = i8;
            int i10 = this.X;
            if (i8 < i10) {
                this.Q = i10;
            }
        }
        if (z4) {
            if (this.O[1] == aVar && i9 < (i = this.R)) {
                i9 = i;
            }
            this.R = i9;
            int i11 = this.Y;
            if (i9 < i11) {
                this.R = i11;
            }
        }
    }

    public void N(b.f.b.e eVar, boolean z) {
        int i;
        int i2;
        o oVar;
        m mVar;
        int o = eVar.o(this.D);
        int o2 = eVar.o(this.E);
        int o3 = eVar.o(this.F);
        int o4 = eVar.o(this.G);
        if (z && (mVar = this.f979d) != null) {
            b.f.b.l.k.h hVar = mVar.h;
            if (hVar.j) {
                b.f.b.l.k.h hVar2 = mVar.i;
                if (hVar2.j) {
                    o = hVar.g;
                    o3 = hVar2.g;
                }
            }
        }
        if (z && (oVar = this.f980e) != null) {
            b.f.b.l.k.h hVar3 = oVar.h;
            if (hVar3.j) {
                b.f.b.l.k.h hVar4 = oVar.i;
                if (hVar4.j) {
                    o2 = hVar3.g;
                    o4 = hVar4.g;
                }
            }
        }
        int i3 = o4 - o2;
        if (o3 - o < 0 || i3 < 0 || o == Integer.MIN_VALUE || o == Integer.MAX_VALUE || o2 == Integer.MIN_VALUE || o2 == Integer.MAX_VALUE || o3 == Integer.MIN_VALUE || o3 == Integer.MAX_VALUE || o4 == Integer.MIN_VALUE || o4 == Integer.MAX_VALUE) {
            o4 = 0;
            o = 0;
            o2 = 0;
            o3 = 0;
        }
        int i4 = o3 - o;
        int i5 = o4 - o2;
        this.U = o;
        this.V = o2;
        if (this.c0 == 8) {
            this.Q = 0;
            this.R = 0;
            return;
        }
        a[] aVarArr = this.O;
        a aVar = aVarArr[0];
        a aVar2 = a.FIXED;
        if (aVar == aVar2 && i4 < (i2 = this.Q)) {
            i4 = i2;
        }
        if (aVarArr[1] == aVar2 && i5 < (i = this.R)) {
            i5 = i;
        }
        this.Q = i4;
        this.R = i5;
        int i6 = this.Y;
        if (i5 < i6) {
            this.R = i6;
        }
        int i7 = this.X;
        if (i4 < i7) {
            this.Q = i7;
        }
    }

    public void a(e eVar, b.f.b.e eVar2, HashSet<d> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            i.a(eVar, eVar2, this);
            hashSet.remove(this);
            c(eVar2, eVar.X(64));
        }
        if (i == 0) {
            HashSet<c> hashSet2 = this.D.f965a;
            if (hashSet2 != null) {
                Iterator<c> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f968d.a(eVar, eVar2, hashSet, i, true);
                }
            }
            HashSet<c> hashSet3 = this.F.f965a;
            if (hashSet3 != null) {
                Iterator<c> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f968d.a(eVar, eVar2, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<c> hashSet4 = this.E.f965a;
        if (hashSet4 != null) {
            Iterator<c> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f968d.a(eVar, eVar2, hashSet, i, true);
            }
        }
        HashSet<c> hashSet5 = this.G.f965a;
        if (hashSet5 != null) {
            Iterator<c> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f968d.a(eVar, eVar2, hashSet, i, true);
            }
        }
        HashSet<c> hashSet6 = this.H.f965a;
        if (hashSet6 != null) {
            Iterator<c> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f968d.a(eVar, eVar2, hashSet, i, true);
            }
        }
    }

    public boolean b() {
        return this instanceof f;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0384  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(b.f.b.e r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.b.l.d.c(b.f.b.e, boolean):void");
    }

    public boolean d() {
        return this.c0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x047d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0455 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(b.f.b.e r30, boolean r31, boolean r32, boolean r33, boolean r34, b.f.b.k r35, b.f.b.k r36, b.f.b.l.d.a r37, boolean r38, b.f.b.l.c r39, b.f.b.l.c r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.b.l.d.e(b.f.b.e, boolean, boolean, boolean, boolean, b.f.b.k, b.f.b.k, b.f.b.l.d$a, boolean, b.f.b.l.c, b.f.b.l.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void f(b.f.b.e eVar) {
        eVar.l(this.D);
        eVar.l(this.E);
        eVar.l(this.F);
        eVar.l(this.G);
        if (this.W > 0) {
            eVar.l(this.H);
        }
    }

    public void g() {
        if (this.f979d == null) {
            this.f979d = new m(this);
        }
        if (this.f980e == null) {
            this.f980e = new o(this);
        }
    }

    public c h(c.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.D;
            case 2:
                return this.E;
            case 3:
                return this.F;
            case 4:
                return this.G;
            case 5:
                return this.H;
            case 6:
                return this.K;
            case 7:
                return this.I;
            case 8:
                return this.J;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public int i() {
        return s() + this.R;
    }

    public a j(int i) {
        if (i == 0) {
            return l();
        }
        if (i == 1) {
            return p();
        }
        return null;
    }

    public int k() {
        if (this.c0 == 8) {
            return 0;
        }
        return this.R;
    }

    public a l() {
        return this.O[0];
    }

    public d m(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.G).f970f) != null && cVar2.f970f == cVar) {
                return cVar2.f968d;
            }
            return null;
        }
        c cVar3 = this.F;
        c cVar4 = cVar3.f970f;
        if (cVar4 == null || cVar4.f970f != cVar3) {
            return null;
        }
        return cVar4.f968d;
    }

    public d n(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.E).f970f) != null && cVar2.f970f == cVar) {
                return cVar2.f968d;
            }
            return null;
        }
        c cVar3 = this.D;
        c cVar4 = cVar3.f970f;
        if (cVar4 == null || cVar4.f970f != cVar3) {
            return null;
        }
        return cVar4.f968d;
    }

    public int o() {
        return r() + this.Q;
    }

    public a p() {
        return this.O[1];
    }

    public int q() {
        if (this.c0 == 8) {
            return 0;
        }
        return this.Q;
    }

    public int r() {
        d dVar = this.P;
        return (dVar == null || !(dVar instanceof e)) ? this.U : ((e) dVar).r0 + this.U;
    }

    public int s() {
        d dVar = this.P;
        return (dVar == null || !(dVar instanceof e)) ? this.V : ((e) dVar).s0 + this.V;
    }

    public boolean t(int i) {
        if (i == 0) {
            return (this.D.f970f != null ? 1 : 0) + (this.F.f970f != null ? 1 : 0) < 2;
        }
        return ((this.E.f970f != null ? 1 : 0) + (this.G.f970f != null ? 1 : 0)) + (this.H.f970f != null ? 1 : 0) < 2;
    }

    public String toString() {
        String str = "";
        StringBuilder j = c.a.a.a.a.j("");
        if (this.d0 != null) {
            StringBuilder j2 = c.a.a.a.a.j("id: ");
            j2.append(this.d0);
            j2.append(" ");
            str = j2.toString();
        }
        j.append(str);
        j.append("(");
        j.append(this.U);
        j.append(", ");
        j.append(this.V);
        j.append(") - (");
        j.append(this.Q);
        j.append(" x ");
        j.append(this.R);
        j.append(")");
        return j.toString();
    }

    public final boolean u(int i) {
        int i2 = i * 2;
        c[] cVarArr = this.L;
        if (cVarArr[i2].f970f != null && cVarArr[i2].f970f.f970f != cVarArr[i2]) {
            int i3 = i2 + 1;
            if (cVarArr[i3].f970f != null && cVarArr[i3].f970f.f970f == cVarArr[i3]) {
                return true;
            }
        }
        return false;
    }

    public boolean v() {
        c cVar = this.D;
        c cVar2 = cVar.f970f;
        if (cVar2 != null && cVar2.f970f == cVar) {
            return true;
        }
        c cVar3 = this.F;
        c cVar4 = cVar3.f970f;
        return cVar4 != null && cVar4.f970f == cVar3;
    }

    public boolean w() {
        c cVar = this.E;
        c cVar2 = cVar.f970f;
        if (cVar2 != null && cVar2.f970f == cVar) {
            return true;
        }
        c cVar3 = this.G;
        c cVar4 = cVar3.f970f;
        return cVar4 != null && cVar4.f970f == cVar3;
    }

    public boolean x() {
        return this.h && this.c0 != 8;
    }

    public boolean y() {
        return this.i || (this.D.f967c && this.F.f967c);
    }

    public boolean z() {
        return this.j || (this.E.f967c && this.G.f967c);
    }
}
