package b.f.b.l;

import androidx.constraintlayout.widget.ConstraintLayout;
import b.f.b.l.d;
import b.f.b.l.k.c;
import b.f.b.l.k.s;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e extends j {
    public int r0;
    public int s0;
    public b.f.b.l.k.c m0 = new b.f.b.l.k.c(this);
    public b.f.b.l.k.f n0 = new b.f.b.l.k.f(this);
    public c.a o0 = null;
    public boolean p0 = false;
    public b.f.b.e q0 = new b.f.b.e();
    public int t0 = 0;
    public int u0 = 0;
    public b[] v0 = new b[4];
    public b[] w0 = new b[4];
    public int x0 = 257;
    public boolean y0 = false;
    public boolean z0 = false;
    public WeakReference<c> A0 = null;
    public WeakReference<c> B0 = null;
    public WeakReference<c> C0 = null;
    public WeakReference<c> D0 = null;
    public b.f.b.l.k.b E0 = new b.f.b.l.k.b();

    public static boolean W(d dVar, c.a aVar, b.f.b.l.k.b bVar, boolean z) {
        int i;
        int i2;
        d.a aVar2 = d.a.WRAP_CONTENT;
        d.a aVar3 = d.a.FIXED;
        if (aVar == null) {
            return false;
        }
        bVar.f988a = dVar.l();
        bVar.f989b = dVar.p();
        bVar.f990c = dVar.q();
        bVar.f991d = dVar.k();
        bVar.i = false;
        bVar.j = z;
        d.a aVar4 = bVar.f988a;
        d.a aVar5 = d.a.MATCH_CONSTRAINT;
        boolean z2 = aVar4 == aVar5;
        boolean z3 = bVar.f989b == aVar5;
        boolean z4 = z2 && dVar.S > 0.0f;
        boolean z5 = z3 && dVar.S > 0.0f;
        if (z2 && dVar.t(0) && dVar.m == 0 && !z4) {
            bVar.f988a = aVar2;
            if (z3 && dVar.n == 0) {
                bVar.f988a = aVar3;
            }
            z2 = false;
        }
        if (z3 && dVar.t(1) && dVar.n == 0 && !z5) {
            bVar.f989b = aVar2;
            if (z2 && dVar.m == 0) {
                bVar.f989b = aVar3;
            }
            z3 = false;
        }
        if (dVar.y()) {
            bVar.f988a = aVar3;
            z2 = false;
        }
        if (dVar.z()) {
            bVar.f989b = aVar3;
            z3 = false;
        }
        if (z4) {
            if (dVar.o[0] == 4) {
                bVar.f988a = aVar3;
            } else if (!z3) {
                if (bVar.f989b == aVar3) {
                    i2 = bVar.f991d;
                } else {
                    bVar.f988a = aVar2;
                    ((ConstraintLayout.b) aVar).b(dVar, bVar);
                    i2 = bVar.f993f;
                }
                bVar.f988a = aVar3;
                int i3 = dVar.T;
                bVar.f990c = (int) ((i3 == 0 || i3 == -1) ? dVar.S * i2 : dVar.S / i2);
            }
        }
        if (z5) {
            if (dVar.o[1] == 4) {
                bVar.f989b = aVar3;
            } else if (!z2) {
                if (bVar.f988a == aVar3) {
                    i = bVar.f990c;
                } else {
                    bVar.f989b = aVar2;
                    ((ConstraintLayout.b) aVar).b(dVar, bVar);
                    i = bVar.f992e;
                }
                bVar.f989b = aVar3;
                int i4 = dVar.T;
                bVar.f991d = (int) ((i4 == 0 || i4 == -1) ? i / dVar.S : i * dVar.S);
            }
        }
        ((ConstraintLayout.b) aVar).b(dVar, bVar);
        dVar.L(bVar.f992e);
        dVar.G(bVar.f993f);
        dVar.z = bVar.h;
        dVar.D(bVar.g);
        bVar.j = false;
        return bVar.i;
    }

    @Override // b.f.b.l.j, b.f.b.l.d
    public void A() {
        this.q0.u();
        this.r0 = 0;
        this.s0 = 0;
        super.A();
    }

    @Override // b.f.b.l.d
    public void M(boolean z, boolean z2) {
        super.M(z, z2);
        int size = this.l0.size();
        for (int i = 0; i < size; i++) {
            this.l0.get(i).M(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x064d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x05c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v15 */
    @Override // b.f.b.l.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O() {
        /*
            Method dump skipped, instructions count: 2251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.b.l.e.O():void");
    }

    public void P(d dVar, int i) {
        if (i == 0) {
            int i2 = this.t0 + 1;
            b[] bVarArr = this.w0;
            if (i2 >= bVarArr.length) {
                this.w0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.w0;
            int i3 = this.t0;
            bVarArr2[i3] = new b(dVar, 0, this.p0);
            this.t0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.u0 + 1;
            b[] bVarArr3 = this.v0;
            if (i4 >= bVarArr3.length) {
                this.v0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.v0;
            int i5 = this.u0;
            bVarArr4[i5] = new b(dVar, 1, this.p0);
            this.u0 = i5 + 1;
        }
    }

    public boolean Q(b.f.b.e eVar) {
        d.a aVar = d.a.FIXED;
        d.a aVar2 = d.a.WRAP_CONTENT;
        boolean X = X(64);
        c(eVar, X);
        int size = this.l0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            d dVar = this.l0.get(i);
            boolean[] zArr = dVar.N;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                d dVar2 = this.l0.get(i2);
                if (dVar2 instanceof a) {
                    a aVar3 = (a) dVar2;
                    for (int i3 = 0; i3 < aVar3.m0; i3++) {
                        d dVar3 = aVar3.l0[i3];
                        int i4 = aVar3.n0;
                        if (i4 == 0 || i4 == 1) {
                            dVar3.N[0] = true;
                        } else if (i4 == 2 || i4 == 3) {
                            dVar3.N[1] = true;
                        }
                    }
                }
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            d dVar4 = this.l0.get(i5);
            if (dVar4.b()) {
                dVar4.c(eVar, X);
            }
        }
        if (b.f.b.e.p) {
            HashSet<d> hashSet = new HashSet<>();
            for (int i6 = 0; i6 < size; i6++) {
                d dVar5 = this.l0.get(i6);
                if (!dVar5.b()) {
                    hashSet.add(dVar5);
                }
            }
            a(this, eVar, hashSet, l() == aVar2 ? 0 : 1, false);
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                d next = it.next();
                i.a(this, eVar, next);
                next.c(eVar, X);
            }
        } else {
            for (int i7 = 0; i7 < size; i7++) {
                d dVar6 = this.l0.get(i7);
                if (dVar6 instanceof e) {
                    d.a[] aVarArr = dVar6.O;
                    d.a aVar4 = aVarArr[0];
                    d.a aVar5 = aVarArr[1];
                    if (aVar4 == aVar2) {
                        aVarArr[0] = aVar;
                    }
                    if (aVar5 == aVar2) {
                        aVarArr[1] = aVar;
                    }
                    dVar6.c(eVar, X);
                    if (aVar4 == aVar2) {
                        dVar6.H(aVar4);
                    }
                    if (aVar5 == aVar2) {
                        dVar6.K(aVar5);
                    }
                } else {
                    i.a(this, eVar, dVar6);
                    if (!dVar6.b()) {
                        dVar6.c(eVar, X);
                    }
                }
            }
        }
        if (this.t0 > 0) {
            b.d.a.a(this, eVar, null, 0);
        }
        if (this.u0 > 0) {
            b.d.a.a(this, eVar, null, 1);
        }
        return true;
    }

    public void R(c cVar) {
        WeakReference<c> weakReference = this.D0;
        if (weakReference == null || weakReference.get() == null || cVar.c() > this.D0.get().c()) {
            this.D0 = new WeakReference<>(cVar);
        }
    }

    public void S(c cVar) {
        WeakReference<c> weakReference = this.C0;
        if (weakReference == null || weakReference.get() == null || cVar.c() > this.C0.get().c()) {
            this.C0 = new WeakReference<>(cVar);
        }
    }

    public void T(c cVar) {
        WeakReference<c> weakReference = this.A0;
        if (weakReference == null || weakReference.get() == null || cVar.c() > this.A0.get().c()) {
            this.A0 = new WeakReference<>(cVar);
        }
    }

    public boolean U(boolean z, int i) {
        b.f.b.l.k.i iVar;
        int i2;
        boolean z2;
        b.f.b.l.k.i iVar2;
        int k;
        b.f.b.l.k.f fVar = this.n0;
        d.a aVar = d.a.MATCH_PARENT;
        d.a aVar2 = d.a.WRAP_CONTENT;
        d.a aVar3 = d.a.FIXED;
        boolean z3 = true;
        boolean z4 = z & true;
        d.a j = fVar.f997a.j(0);
        d.a j2 = fVar.f997a.j(1);
        int r = fVar.f997a.r();
        int s = fVar.f997a.s();
        if (z4 && (j == aVar2 || j2 == aVar2)) {
            Iterator<s> it = fVar.f1001e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s next = it.next();
                if (next.f1034f == i && !next.k()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && j == aVar2) {
                    e eVar = fVar.f997a;
                    eVar.O[0] = aVar3;
                    eVar.L(fVar.d(eVar, 0));
                    e eVar2 = fVar.f997a;
                    iVar2 = eVar2.f979d.f1033e;
                    k = eVar2.q();
                    iVar2.c(k);
                }
            } else if (z4 && j2 == aVar2) {
                e eVar3 = fVar.f997a;
                eVar3.O[1] = aVar3;
                eVar3.G(fVar.d(eVar3, 1));
                e eVar4 = fVar.f997a;
                iVar2 = eVar4.f980e.f1033e;
                k = eVar4.k();
                iVar2.c(k);
            }
        }
        e eVar5 = fVar.f997a;
        d.a[] aVarArr = eVar5.O;
        if (i == 0) {
            if (aVarArr[0] == aVar3 || aVarArr[0] == aVar) {
                int q = eVar5.q() + r;
                fVar.f997a.f979d.i.c(q);
                iVar = fVar.f997a.f979d.f1033e;
                i2 = q - r;
                iVar.c(i2);
                z2 = true;
            }
            z2 = false;
        } else {
            if (aVarArr[1] == aVar3 || aVarArr[1] == aVar) {
                int k2 = eVar5.k() + s;
                fVar.f997a.f980e.i.c(k2);
                iVar = fVar.f997a.f980e.f1033e;
                i2 = k2 - s;
                iVar.c(i2);
                z2 = true;
            }
            z2 = false;
        }
        fVar.g();
        Iterator<s> it2 = fVar.f1001e.iterator();
        while (it2.hasNext()) {
            s next2 = it2.next();
            if (next2.f1034f == i && (next2.f1030b != fVar.f997a || next2.g)) {
                next2.e();
            }
        }
        Iterator<s> it3 = fVar.f1001e.iterator();
        while (it3.hasNext()) {
            s next3 = it3.next();
            if (next3.f1034f == i && (z2 || next3.f1030b != fVar.f997a)) {
                if (!next3.h.j || !next3.i.j || (!(next3 instanceof b.f.b.l.k.d) && !next3.f1033e.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        fVar.f997a.H(j);
        fVar.f997a.K(j2);
        return z3;
    }

    public void V() {
        this.n0.f998b = true;
    }

    public boolean X(int i) {
        return (this.x0 & i) == i;
    }

    public void Y(int i) {
        this.x0 = i;
        b.f.b.e.p = X(512);
    }
}
