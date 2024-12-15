package c.c.a.a.u1.w0;

import android.util.Pair;
import android.util.SparseIntArray;
import c.c.a.a.d1;
import c.c.a.a.l0;
import c.c.a.a.u1.k0;
import c.c.a.a.u1.m0;
import c.c.a.a.u1.n0;
import c.c.a.a.u1.q0;
import c.c.a.a.u1.s0;
import c.c.a.a.u1.v0.h;
import c.c.a.a.u1.w0.c;
import c.c.a.a.u1.w0.q;
import c.c.a.a.u1.y;
import c.c.a.a.y1.r0;
import c.c.a.a.y1.x0;
import c.c.a.a.y1.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class f implements c.c.a.a.u1.v, m0<c.c.a.a.u1.v0.h<c>>, c.c.a.a.u1.v0.i<c> {
    public static final Pattern w = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: b, reason: collision with root package name */
    public final int f2985b;

    /* renamed from: c, reason: collision with root package name */
    public final c.a f2986c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f2987d;

    /* renamed from: e, reason: collision with root package name */
    public final z f2988e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2989f;
    public final r0 g;
    public final c.c.a.a.y1.r h;
    public final s0 i;
    public final e[] j;
    public final c.c.a.a.u1.q k;
    public final w l;
    public final y n;
    public c.c.a.a.u1.u o;
    public n0 r;
    public c.c.a.a.u1.w0.x.b s;
    public int t;
    public List<c.c.a.a.u1.w0.x.f> u;
    public boolean v;
    public c.c.a.a.u1.v0.h<c>[] p = new c.c.a.a.u1.v0.h[0];
    public t[] q = new t[0];
    public final IdentityHashMap<c.c.a.a.u1.v0.h<c>, v> m = new IdentityHashMap<>();

    public f(int i, c.c.a.a.u1.w0.x.b bVar, int i2, c.a aVar, x0 x0Var, z zVar, y yVar, long j, r0 r0Var, c.c.a.a.y1.r rVar, c.c.a.a.u1.q qVar, h hVar) {
        int i3;
        List<c.c.a.a.u1.w0.x.a> list;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        l0[] l0VarArr;
        l0[] l0VarArr2;
        c.c.a.a.u1.w0.x.e eVar;
        int i8;
        this.f2985b = i;
        this.s = bVar;
        this.t = i2;
        this.f2986c = aVar;
        this.f2987d = x0Var;
        this.f2988e = zVar;
        this.n = yVar;
        this.f2989f = j;
        this.g = r0Var;
        this.h = rVar;
        this.k = qVar;
        this.l = new w(bVar, hVar, rVar);
        int i9 = 0;
        c.c.a.a.u1.v0.h<c>[] hVarArr = this.p;
        Objects.requireNonNull(qVar);
        this.r = new c.c.a.a.u1.p(hVarArr);
        c.c.a.a.u1.w0.x.g gVar = bVar.l.get(i2);
        List<c.c.a.a.u1.w0.x.f> list2 = gVar.f3064d;
        this.u = list2;
        List<c.c.a.a.u1.w0.x.a> list3 = gVar.f3063c;
        int size = list3.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            sparseIntArray.put(list3.get(i10).f3033a, i10);
        }
        int[][] iArr = new int[size][];
        boolean[] zArr = new boolean[size];
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            if (!zArr[i11]) {
                zArr[i11] = true;
                List<c.c.a.a.u1.w0.x.e> list4 = list3.get(i11).f3037e;
                int i13 = i9;
                while (true) {
                    if (i13 >= list4.size()) {
                        eVar = null;
                        break;
                    }
                    eVar = list4.get(i13);
                    if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(eVar.f3054a)) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (eVar == null) {
                    i8 = i12 + 1;
                    iArr[i12] = new int[]{i11};
                } else {
                    String[] E = c.c.a.a.z1.l0.E(eVar.f3055b, ",");
                    int length = E.length + 1;
                    int[] iArr2 = new int[length];
                    iArr2[0] = i11;
                    int i14 = 1;
                    int i15 = 0;
                    while (i15 < E.length) {
                        String[] strArr = E;
                        int i16 = sparseIntArray.get(Integer.parseInt(E[i15]), -1);
                        if (i16 != -1) {
                            zArr[i16] = true;
                            iArr2[i14] = i16;
                            i14++;
                        }
                        i15++;
                        E = strArr;
                    }
                    i8 = i12 + 1;
                    iArr[i12] = i14 < length ? Arrays.copyOf(iArr2, i14) : iArr2;
                }
                i12 = i8;
            }
            i11++;
            i9 = 0;
        }
        iArr = i12 < size ? (int[][]) Arrays.copyOf(iArr, i12) : iArr;
        int length2 = iArr.length;
        boolean[] zArr2 = new boolean[length2];
        l0[][] l0VarArr3 = new l0[length2][];
        int i17 = 0;
        for (int i18 = 0; i18 < length2; i18++) {
            int[] iArr3 = iArr[i18];
            int length3 = iArr3.length;
            int i19 = 0;
            while (true) {
                if (i19 >= length3) {
                    z = false;
                    break;
                }
                List<c.c.a.a.u1.w0.x.m> list5 = list3.get(iArr3[i19]).f3035c;
                for (int i20 = 0; i20 < list5.size(); i20++) {
                    if (!list5.get(i20).f3079d.isEmpty()) {
                        z = true;
                        break;
                    }
                }
                i19++;
            }
            if (z) {
                zArr2[i18] = true;
                i17++;
            }
            int[] iArr4 = iArr[i18];
            int length4 = iArr4.length;
            int i21 = 0;
            while (true) {
                if (i21 >= length4) {
                    l0VarArr = new l0[0];
                    break;
                }
                int i22 = iArr4[i21];
                c.c.a.a.u1.w0.x.a aVar2 = list3.get(i22);
                List<c.c.a.a.u1.w0.x.e> list6 = list3.get(i22).f3036d;
                int i23 = 0;
                while (i23 < list6.size()) {
                    c.c.a.a.u1.w0.x.e eVar2 = list6.get(i23);
                    int[] iArr5 = iArr4;
                    int i24 = length4;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(eVar2.f3054a)) {
                        String str = eVar2.f3055b;
                        if (str == null) {
                            l0VarArr2 = new l0[]{i(aVar2.f3033a, null, -1)};
                        } else {
                            int i25 = c.c.a.a.z1.l0.f3761a;
                            String[] split = str.split(";", -1);
                            l0VarArr = new l0[split.length];
                            int i26 = 0;
                            while (i26 < split.length) {
                                Matcher matcher = w.matcher(split[i26]);
                                if (!matcher.matches()) {
                                    l0VarArr2 = new l0[]{i(aVar2.f3033a, null, -1)};
                                    break;
                                } else {
                                    l0VarArr[i26] = i(aVar2.f3033a, matcher.group(2), Integer.parseInt(matcher.group(1)));
                                    i26++;
                                    split = split;
                                }
                            }
                        }
                    } else {
                        i23++;
                        iArr4 = iArr5;
                        length4 = i24;
                    }
                }
                i21++;
            }
            l0VarArr2 = l0VarArr;
            l0VarArr3[i18] = l0VarArr2;
            if (l0VarArr3[i18].length != 0) {
                i17++;
            }
        }
        int size2 = list2.size() + i17 + length2;
        q0[] q0VarArr = new q0[size2];
        e[] eVarArr = new e[size2];
        int i27 = 0;
        int i28 = 0;
        while (i28 < length2) {
            int[] iArr6 = iArr[i28];
            ArrayList arrayList = new ArrayList();
            int length5 = iArr6.length;
            int i29 = 0;
            while (true) {
                i3 = length2;
                if (i29 >= length5) {
                    break;
                }
                arrayList.addAll(list3.get(iArr6[i29]).f3035c);
                i29++;
                length2 = i3;
            }
            int size3 = arrayList.size();
            l0[] l0VarArr4 = new l0[size3];
            int i30 = 0;
            while (i30 < size3) {
                l0VarArr4[i30] = ((c.c.a.a.u1.w0.x.m) arrayList.get(i30)).f3076a;
                i30++;
                size3 = size3;
            }
            c.c.a.a.u1.w0.x.a aVar3 = list3.get(iArr6[0]);
            int i31 = i27 + 1;
            if (zArr2[i28]) {
                list = list3;
                i4 = i31;
                i31++;
            } else {
                list = list3;
                i4 = -1;
            }
            if (l0VarArr3[i28].length != 0) {
                i5 = i31 + 1;
                i6 = i31;
            } else {
                i5 = i31;
                i6 = -1;
            }
            q0VarArr[i27] = new q0(l0VarArr4);
            int i32 = i4;
            eVarArr[i27] = new e(aVar3.f3034b, 0, iArr6, i27, i32, i6, -1);
            if (i32 != -1) {
                q0VarArr[i32] = new q0(l0.v(aVar3.f3033a + ":emsg", "application/x-emsg", null, -1, null));
                eVarArr[i32] = new e(4, 1, iArr6, i27, -1, -1, -1);
                i7 = -1;
            } else {
                i7 = -1;
            }
            if (i6 != i7) {
                q0VarArr[i6] = new q0(l0VarArr3[i28]);
                eVarArr[i6] = new e(3, 1, iArr6, i27, -1, -1, -1);
            }
            i28++;
            length2 = i3;
            list3 = list;
            i27 = i5;
        }
        int i33 = 0;
        while (i33 < list2.size()) {
            q0VarArr[i27] = new q0(l0.v(list2.get(i33).a(), "application/x-emsg", null, -1, null));
            eVarArr[i27] = new e(4, 2, new int[0], -1, -1, -1, i33);
            i33++;
            i27++;
        }
        Pair create = Pair.create(new s0(q0VarArr), eVarArr);
        this.i = (s0) create.first;
        this.j = (e[]) create.second;
        yVar.k();
    }

    public static l0 i(int i, String str, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(":cea608");
        sb.append(i2 != -1 ? c.a.a.a.a.b(":", i2) : "");
        return l0.z(sb.toString(), "application/cea-608", null, -1, 0, str, i2, null, Long.MAX_VALUE, null);
    }

    @Override // c.c.a.a.u1.v
    public long b(long j, d1 d1Var) {
        for (c.c.a.a.u1.v0.h<c> hVar : this.p) {
            if (hVar.f2961b == 2) {
                return hVar.f2965f.b(j, d1Var);
            }
        }
        return j;
    }

    @Override // c.c.a.a.u1.m0
    public void c(c.c.a.a.u1.v0.h<c> hVar) {
        this.o.c(this);
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public long d() {
        return this.r.d();
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public long e() {
        return this.r.e();
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public boolean f(long j) {
        return this.r.f(j);
    }

    @Override // c.c.a.a.u1.v, c.c.a.a.u1.n0
    public void g(long j) {
        this.r.g(j);
    }

    @Override // c.c.a.a.u1.v
    public s0 h() {
        return this.i;
    }

    public final int j(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.j[i2].f2983e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.j[i5].f2981c == 0) {
                return i4;
            }
        }
        return -1;
    }

    @Override // c.c.a.a.u1.v
    public void m() {
        this.g.a();
    }

    @Override // c.c.a.a.u1.v
    public void n(long j, boolean z) {
        for (c.c.a.a.u1.v0.h<c> hVar : this.p) {
            hVar.n(j, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v33, types: [int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [int] */
    /* JADX WARN: Type inference failed for: r4v19 */
    @Override // c.c.a.a.u1.v
    public long o(c.c.a.a.w1.r[] rVarArr, boolean[] zArr, c.c.a.a.u1.l0[] l0VarArr, boolean[] zArr2, long j) {
        int i;
        boolean z;
        int[] iArr;
        int i2;
        int[] iArr2;
        ?? r4;
        q0 q0Var;
        q0 q0Var2;
        int i3;
        boolean z2;
        v vVar;
        c.c.a.a.w1.r[] rVarArr2 = rVarArr;
        int[] iArr3 = new int[rVarArr2.length];
        int i4 = 0;
        while (true) {
            i = -1;
            if (i4 >= rVarArr2.length) {
                break;
            }
            if (rVarArr2[i4] != null) {
                iArr3[i4] = this.i.i(((c.c.a.a.w1.g) rVarArr2[i4]).f3407a);
            } else {
                iArr3[i4] = -1;
            }
            i4++;
        }
        for (int i5 = 0; i5 < rVarArr2.length; i5++) {
            if (rVarArr2[i5] == null || !zArr[i5]) {
                if (l0VarArr[i5] instanceof c.c.a.a.u1.v0.h) {
                    ((c.c.a.a.u1.v0.h) l0VarArr[i5]).A(this);
                } else if (l0VarArr[i5] instanceof h.a) {
                    ((h.a) l0VarArr[i5]).d();
                }
                l0VarArr[i5] = null;
            }
        }
        int i6 = 0;
        while (true) {
            z = true;
            if (i6 >= rVarArr2.length) {
                break;
            }
            if ((l0VarArr[i6] instanceof c.c.a.a.u1.r) || (l0VarArr[i6] instanceof h.a)) {
                int j2 = j(i6, iArr3);
                if (j2 == -1) {
                    z = l0VarArr[i6] instanceof c.c.a.a.u1.r;
                } else if (!(l0VarArr[i6] instanceof h.a) || ((h.a) l0VarArr[i6]).f2966b != l0VarArr[j2]) {
                    z = false;
                }
                if (!z) {
                    if (l0VarArr[i6] instanceof h.a) {
                        ((h.a) l0VarArr[i6]).d();
                    }
                    l0VarArr[i6] = null;
                }
            }
            i6++;
        }
        int i7 = 0;
        while (i7 < rVarArr2.length) {
            c.c.a.a.w1.r rVar = rVarArr2[i7];
            if (rVar == null) {
                i2 = i7;
                iArr2 = iArr3;
            } else if (l0VarArr[i7] == null) {
                zArr2[i7] = z;
                e eVar = this.j[iArr3[i7]];
                int i8 = eVar.f2981c;
                if (i8 == 0) {
                    int i9 = eVar.f2984f;
                    boolean z3 = i9 != i ? z : false;
                    if (z3) {
                        q0Var = this.i.f2923c[i9];
                        r4 = z;
                    } else {
                        r4 = 0;
                        q0Var = null;
                    }
                    int i10 = eVar.g;
                    boolean z4 = i10 != i ? z : false;
                    if (z4) {
                        q0Var2 = this.i.f2923c[i10];
                        i3 = r4 + q0Var2.f2918b;
                    } else {
                        q0Var2 = null;
                        i3 = r4;
                    }
                    l0[] l0VarArr2 = new l0[i3];
                    int[] iArr4 = new int[i3];
                    if (z3) {
                        l0VarArr2[0] = q0Var.f2919c[0];
                        iArr4[0] = 4;
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (z4) {
                        int i11 = 0;
                        ?? r3 = z2;
                        while (i11 < q0Var2.f2918b) {
                            l0VarArr2[r3] = q0Var2.f2919c[i11];
                            iArr4[r3] = 3;
                            arrayList.add(l0VarArr2[r3]);
                            i11++;
                            r3++;
                        }
                    }
                    if (this.s.f3041d && z3) {
                        w wVar = this.l;
                        vVar = new v(wVar, new k0(wVar.f3028b));
                    } else {
                        vVar = null;
                    }
                    c.a aVar = this.f2986c;
                    r0 r0Var = this.g;
                    c.c.a.a.u1.w0.x.b bVar = this.s;
                    int i12 = i7;
                    int i13 = this.t;
                    int[] iArr5 = iArr3;
                    int[] iArr6 = eVar.f2979a;
                    int i14 = eVar.f2980b;
                    v vVar2 = vVar;
                    long j3 = this.f2989f;
                    x0 x0Var = this.f2987d;
                    c.c.a.a.y1.n a2 = ((q.a) aVar).f3011a.a();
                    if (x0Var != null) {
                        a2.b(x0Var);
                    }
                    i2 = i12;
                    iArr2 = iArr5;
                    c.c.a.a.u1.v0.h<c> hVar = new c.c.a.a.u1.v0.h<>(eVar.f2980b, iArr4, l0VarArr2, new q(r0Var, bVar, i13, iArr6, rVar, i14, a2, j3, 1, z3, arrayList, vVar2), this, this.h, j, this.f2988e, this.n);
                    synchronized (this) {
                        this.m.put(hVar, vVar2);
                    }
                    l0VarArr[i2] = hVar;
                } else {
                    i2 = i7;
                    iArr2 = iArr3;
                    if (i8 == 2) {
                        l0VarArr[i2] = new t(this.u.get(eVar.f2982d), ((c.c.a.a.w1.g) rVar).f3407a.f2919c[0], this.s.f3041d);
                    }
                }
            } else {
                i2 = i7;
                iArr2 = iArr3;
                if (l0VarArr[i2] instanceof c.c.a.a.u1.v0.h) {
                    ((q) ((c) ((c.c.a.a.u1.v0.h) l0VarArr[i2]).f2965f)).h = rVar;
                }
            }
            i7 = i2 + 1;
            rVarArr2 = rVarArr;
            iArr3 = iArr2;
            z = true;
            i = -1;
        }
        int[] iArr7 = iArr3;
        int i15 = 0;
        while (i15 < rVarArr.length) {
            if (l0VarArr[i15] != null || rVarArr[i15] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                e eVar2 = this.j[iArr[i15]];
                if (eVar2.f2981c == 1) {
                    int j4 = j(i15, iArr);
                    if (j4 != -1) {
                        c.c.a.a.u1.v0.h hVar2 = (c.c.a.a.u1.v0.h) l0VarArr[j4];
                        int i16 = eVar2.f2980b;
                        for (int i17 = 0; i17 < hVar2.o.length; i17++) {
                            if (hVar2.f2962c[i17] == i16) {
                                c.c.a.a.x1.p.g(!hVar2.f2964e[i17]);
                                hVar2.f2964e[i17] = true;
                                hVar2.o[i17].v();
                                hVar2.o[i17].e(j, true, true);
                                l0VarArr[i15] = new h.a(hVar2, hVar2.o[i17], i17);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    l0VarArr[i15] = new c.c.a.a.u1.r();
                    i15++;
                    iArr7 = iArr;
                }
            }
            i15++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (c.c.a.a.u1.l0 l0Var : l0VarArr) {
            if (l0Var instanceof c.c.a.a.u1.v0.h) {
                arrayList2.add((c.c.a.a.u1.v0.h) l0Var);
            } else if (l0Var instanceof t) {
                arrayList3.add((t) l0Var);
            }
        }
        c.c.a.a.u1.v0.h<c>[] hVarArr = new c.c.a.a.u1.v0.h[arrayList2.size()];
        this.p = hVarArr;
        arrayList2.toArray(hVarArr);
        t[] tVarArr = new t[arrayList3.size()];
        this.q = tVarArr;
        arrayList3.toArray(tVarArr);
        c.c.a.a.u1.q qVar = this.k;
        c.c.a.a.u1.v0.h<c>[] hVarArr2 = this.p;
        Objects.requireNonNull(qVar);
        this.r = new c.c.a.a.u1.p(hVarArr2);
        return j;
    }

    @Override // c.c.a.a.u1.v
    public long q(long j) {
        for (c.c.a.a.u1.v0.h<c> hVar : this.p) {
            hVar.B(j);
        }
        for (t tVar : this.q) {
            tVar.b(j);
        }
        return j;
    }

    @Override // c.c.a.a.u1.v
    public long s() {
        if (this.v) {
            return -9223372036854775807L;
        }
        this.n.n();
        this.v = true;
        return -9223372036854775807L;
    }

    @Override // c.c.a.a.u1.v
    public void t(c.c.a.a.u1.u uVar, long j) {
        this.o = uVar;
        uVar.a(this);
    }
}
