package c.c.a.a.q1.g0;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c.c.a.a.s0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m0 implements c.c.a.a.q1.m {
    public static final long s = c.c.a.a.z1.l0.l("AC-3");
    public static final long t = c.c.a.a.z1.l0.l("EAC3");
    public static final long u = c.c.a.a.z1.l0.l("AC-4");
    public static final long v = c.c.a.a.z1.l0.l("HEVC");

    /* renamed from: a, reason: collision with root package name */
    public final int f2542a;

    /* renamed from: b, reason: collision with root package name */
    public final List<c.c.a.a.z1.k0> f2543b;

    /* renamed from: c, reason: collision with root package name */
    public final c.c.a.a.z1.z f2544c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f2545d;

    /* renamed from: e, reason: collision with root package name */
    public final g f2546e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray<q0> f2547f;
    public final SparseBooleanArray g;
    public final SparseBooleanArray h;
    public final j0 i;
    public i0 j;
    public c.c.a.a.q1.n k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public q0 p;
    public int q;
    public int r;

    /* JADX WARN: Multi-variable type inference failed */
    public m0(int i, c.c.a.a.z1.k0 k0Var, g gVar) {
        this.f2546e = gVar;
        this.f2542a = i;
        if (i == 1 || i == 2) {
            this.f2543b = Collections.singletonList(k0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f2543b = arrayList;
            arrayList.add(k0Var);
        }
        this.f2544c = new c.c.a.a.z1.z(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray<q0> sparseArray = new SparseArray<>();
        this.f2547f = sparseArray;
        this.f2545d = new SparseIntArray();
        this.i = new j0();
        this.r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2547f.put(sparseArray2.keyAt(i2), sparseArray2.valueAt(i2));
        }
        this.f2547f.put(0, new e0(new k0(this)));
        this.p = null;
    }

    @Override // c.c.a.a.q1.m
    public void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    @Override // c.c.a.a.q1.m
    public int d(c.c.a.a.q1.j jVar, c.c.a.a.q1.s sVar) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        c.c.a.a.q1.n nVar;
        c.c.a.a.q1.v uVar;
        long j;
        long j2;
        long j3 = jVar.f2649c;
        if (this.m) {
            if ((j3 == -1 || this.f2542a == 2) ? false : true) {
                j0 j0Var = this.i;
                if (!j0Var.f2520c) {
                    int i3 = this.r;
                    if (i3 > 0) {
                        if (!j0Var.f2522e) {
                            int min = (int) Math.min(112800L, j3);
                            long j4 = j3 - min;
                            if (jVar.f2650d == j4) {
                                j0Var.f2519b.w(min);
                                jVar.f2652f = 0;
                                jVar.d(j0Var.f2519b.f3800a, 0, min, false);
                                c.c.a.a.z1.z zVar = j0Var.f2519b;
                                int i4 = zVar.f3801b;
                                int i5 = zVar.f3802c;
                                while (true) {
                                    i5--;
                                    if (i5 < i4) {
                                        j2 = -9223372036854775807L;
                                        break;
                                    }
                                    if (zVar.f3800a[i5] == 71) {
                                        j2 = b.q.u.o(zVar, i5, i3);
                                        if (j2 != -9223372036854775807L) {
                                            break;
                                        }
                                    }
                                }
                                j0Var.g = j2;
                                j0Var.f2522e = true;
                                return 0;
                            }
                            sVar.f2664a = j4;
                        } else if (j0Var.g != -9223372036854775807L) {
                            if (j0Var.f2521d) {
                                long j5 = j0Var.f2523f;
                                if (j5 != -9223372036854775807L) {
                                    j0Var.h = j0Var.f2518a.b(j0Var.g) - j0Var.f2518a.b(j5);
                                }
                            } else {
                                int min2 = (int) Math.min(112800L, j3);
                                long j6 = 0;
                                if (jVar.f2650d == j6) {
                                    j0Var.f2519b.w(min2);
                                    jVar.f2652f = 0;
                                    jVar.d(j0Var.f2519b.f3800a, 0, min2, false);
                                    c.c.a.a.z1.z zVar2 = j0Var.f2519b;
                                    int i6 = zVar2.f3801b;
                                    int i7 = zVar2.f3802c;
                                    while (true) {
                                        if (i6 >= i7) {
                                            j = -9223372036854775807L;
                                            break;
                                        }
                                        if (zVar2.f3800a[i6] == 71) {
                                            j = b.q.u.o(zVar2, i6, i3);
                                            if (j != -9223372036854775807L) {
                                                break;
                                            }
                                        }
                                        i6++;
                                    }
                                    j0Var.f2523f = j;
                                    j0Var.f2521d = true;
                                    return 0;
                                }
                                sVar.f2664a = j6;
                            }
                        }
                        return 1;
                    }
                    j0Var.a(jVar);
                    return 0;
                }
            }
            if (this.n) {
                z = 0;
            } else {
                this.n = true;
                j0 j0Var2 = this.i;
                long j7 = j0Var2.h;
                if (j7 != -9223372036854775807L) {
                    z3 = false;
                    i0 i0Var = new i0(j0Var2.f2518a, j7, j3, this.r);
                    this.j = i0Var;
                    nVar = this.k;
                    uVar = i0Var.f2436a;
                } else {
                    z3 = false;
                    nVar = this.k;
                    uVar = new c.c.a.a.q1.u(j7, 0L);
                }
                nVar.a(uVar);
                z = z3;
            }
            if (this.o) {
                this.o = z;
                h(0L, 0L);
                if (jVar.f2650d != 0) {
                    sVar.f2664a = 0L;
                    return 1;
                }
            }
            i0 i0Var2 = this.j;
            if (i0Var2 != null) {
                if (i0Var2.f2438c != null ? true : z == true ? 1 : 0) {
                    return i0Var2.a(jVar, sVar, null);
                }
            }
        } else {
            z = 0;
        }
        c.c.a.a.z1.z zVar3 = this.f2544c;
        byte[] bArr = zVar3.f3800a;
        if (9400 - zVar3.f3801b < 188) {
            int a2 = zVar3.a();
            if (a2 > 0) {
                System.arraycopy(bArr, this.f2544c.f3801b, bArr, z, a2);
            }
            this.f2544c.y(bArr, a2);
        }
        while (true) {
            if (this.f2544c.a() >= 188) {
                i = -1;
                z2 = true;
                break;
            }
            int i8 = this.f2544c.f3802c;
            int e2 = jVar.e(bArr, i8, 9400 - i8);
            i = -1;
            if (e2 == -1) {
                z2 = z;
                break;
            }
            this.f2544c.z(i8 + e2);
        }
        if (!z2) {
            return i;
        }
        c.c.a.a.z1.z zVar4 = this.f2544c;
        int i9 = zVar4.f3801b;
        int i10 = zVar4.f3802c;
        byte[] bArr2 = zVar4.f3800a;
        int i11 = i9;
        while (i11 < i10 && bArr2[i11] != 71) {
            i11++;
        }
        this.f2544c.A(i11);
        int i12 = i11 + 188;
        if (i12 > i10) {
            int i13 = (i11 - i9) + this.q;
            this.q = i13;
            i2 = 2;
            if (this.f2542a == 2 && i13 > 376) {
                throw new s0("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            i2 = 2;
            this.q = z;
        }
        c.c.a.a.z1.z zVar5 = this.f2544c;
        int i14 = zVar5.f3802c;
        if (i12 > i14) {
            return z;
        }
        int d2 = zVar5.d();
        if ((8388608 & d2) == 0) {
            int i15 = ((4194304 & d2) != 0 ? 1 : z) | 0;
            int i16 = (2096896 & d2) >> 8;
            boolean z4 = (d2 & 32) != 0 ? true : z;
            q0 q0Var = (d2 & 16) != 0 ? true : z ? this.f2547f.get(i16) : null;
            if (q0Var != null) {
                if (this.f2542a != i2) {
                    int i17 = d2 & 15;
                    int i18 = this.f2545d.get(i16, i17 - 1);
                    this.f2545d.put(i16, i17);
                    if (i18 != i17) {
                        if (i17 != ((i18 + 1) & 15)) {
                            q0Var.a();
                        }
                    }
                }
                if (z4) {
                    int p = this.f2544c.p();
                    i15 |= (this.f2544c.p() & 64) != 0 ? i2 : z;
                    this.f2544c.B(p - 1);
                }
                boolean z5 = this.m;
                if ((this.f2542a == i2 || z5 || !this.h.get(i16, z)) ? true : z) {
                    this.f2544c.z(i12);
                    q0Var.c(this.f2544c, i15);
                    this.f2544c.z(i14);
                }
                if (this.f2542a != i2 && !z5 && this.m && j3 != -1) {
                    this.o = true;
                }
            }
        }
        this.f2544c.A(i12);
        return z;
    }

    @Override // c.c.a.a.q1.m
    public void e(c.c.a.a.q1.n nVar) {
        this.k = nVar;
    }

    @Override // c.c.a.a.q1.m
    public void h(long j, long j2) {
        i0 i0Var;
        c.c.a.a.x1.p.g(this.f2542a != 2);
        int size = this.f2543b.size();
        for (int i = 0; i < size; i++) {
            c.c.a.a.z1.k0 k0Var = this.f2543b.get(i);
            if ((k0Var.c() == -9223372036854775807L) || (k0Var.c() != 0 && k0Var.f3758a != j2)) {
                k0Var.f3760c = -9223372036854775807L;
                k0Var.d(j2);
            }
        }
        if (j2 != 0 && (i0Var = this.j) != null) {
            i0Var.d(j2);
        }
        this.f2544c.v();
        this.f2545d.clear();
        for (int i2 = 0; i2 < this.f2547f.size(); i2++) {
            this.f2547f.valueAt(i2).a();
        }
        this.q = 0;
    }

    @Override // c.c.a.a.q1.m
    public boolean i(c.c.a.a.q1.j jVar) {
        boolean z;
        byte[] bArr = this.f2544c.f3800a;
        jVar.d(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = true;
                    break;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                jVar.h(i);
                return true;
            }
        }
        return false;
    }
}
