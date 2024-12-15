package b.f.b.l.k;

import androidx.constraintlayout.widget.ConstraintLayout;
import b.f.b.l.d;
import b.f.b.l.k.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public b.f.b.l.e f997a;

    /* renamed from: d, reason: collision with root package name */
    public b.f.b.l.e f1000d;

    /* renamed from: f, reason: collision with root package name */
    public c.a f1002f;
    public b g;
    public ArrayList<n> h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f998b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f999c = true;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<s> f1001e = new ArrayList<>();

    public f(b.f.b.l.e eVar) {
        new ArrayList();
        this.f1002f = null;
        this.g = new b();
        this.h = new ArrayList<>();
        this.f997a = eVar;
        this.f1000d = eVar;
    }

    public final void a(h hVar, int i, int i2, h hVar2, ArrayList<n> arrayList, n nVar) {
        s sVar = hVar.f1011d;
        if (sVar.f1031c == null) {
            b.f.b.l.e eVar = this.f997a;
            if (sVar == eVar.f979d || sVar == eVar.f980e) {
                return;
            }
            if (nVar == null) {
                nVar = new n(sVar, i2);
                arrayList.add(nVar);
            }
            sVar.f1031c = nVar;
            nVar.f1017b.add(sVar);
            for (e eVar2 : sVar.h.k) {
                if (eVar2 instanceof h) {
                    a((h) eVar2, i, 0, hVar2, arrayList, nVar);
                }
            }
            for (e eVar3 : sVar.i.k) {
                if (eVar3 instanceof h) {
                    a((h) eVar3, i, 1, hVar2, arrayList, nVar);
                }
            }
            if (i == 1 && (sVar instanceof o)) {
                for (e eVar4 : ((o) sVar).k.k) {
                    if (eVar4 instanceof h) {
                        a((h) eVar4, i, 2, hVar2, arrayList, nVar);
                    }
                }
            }
            Iterator<h> it = sVar.h.l.iterator();
            while (it.hasNext()) {
                a(it.next(), i, 0, hVar2, arrayList, nVar);
            }
            Iterator<h> it2 = sVar.i.l.iterator();
            while (it2.hasNext()) {
                a(it2.next(), i, 1, hVar2, arrayList, nVar);
            }
            if (i == 1 && (sVar instanceof o)) {
                Iterator<h> it3 = ((o) sVar).k.l.iterator();
                while (it3.hasNext()) {
                    a(it3.next(), i, 2, hVar2, arrayList, nVar);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        if (r15.n == 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(b.f.b.l.e r20) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.b.l.k.f.b(b.f.b.l.e):boolean");
    }

    public void c() {
        s kVar;
        ArrayList<s> arrayList = this.f1001e;
        arrayList.clear();
        this.f1000d.f979d.f();
        this.f1000d.f980e.f();
        arrayList.add(this.f1000d.f979d);
        arrayList.add(this.f1000d.f980e);
        Iterator<b.f.b.l.d> it = this.f1000d.l0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            b.f.b.l.d next = it.next();
            if (next instanceof b.f.b.l.f) {
                kVar = new k(next);
            } else {
                if (next.v()) {
                    if (next.f977b == null) {
                        next.f977b = new d(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f977b);
                } else {
                    arrayList.add(next.f979d);
                }
                if (next.w()) {
                    if (next.f978c == null) {
                        next.f978c = new d(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f978c);
                } else {
                    arrayList.add(next.f980e);
                }
                if (next instanceof b.f.b.l.h) {
                    kVar = new l(next);
                }
            }
            arrayList.add(kVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<s> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<s> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            s next2 = it3.next();
            if (next2.f1030b != this.f1000d) {
                next2.d();
            }
        }
        this.h.clear();
        n.f1015c = 0;
        e(this.f997a.f979d, 0, this.h);
        e(this.f997a.f980e, 1, this.h);
        this.f998b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(b.f.b.l.e r17, int r18) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.b.l.k.f.d(b.f.b.l.e, int):int");
    }

    public final void e(s sVar, int i, ArrayList<n> arrayList) {
        for (e eVar : sVar.h.k) {
            if (eVar instanceof h) {
                a((h) eVar, i, 0, sVar.i, arrayList, null);
            } else if (eVar instanceof s) {
                a(((s) eVar).h, i, 0, sVar.i, arrayList, null);
            }
        }
        for (e eVar2 : sVar.i.k) {
            if (eVar2 instanceof h) {
                a((h) eVar2, i, 1, sVar.h, arrayList, null);
            } else if (eVar2 instanceof s) {
                a(((s) eVar2).i, i, 1, sVar.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (e eVar3 : ((o) sVar).k.k) {
                if (eVar3 instanceof h) {
                    a((h) eVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    public final void f(b.f.b.l.d dVar, d.a aVar, int i, d.a aVar2, int i2) {
        b bVar = this.g;
        bVar.f988a = aVar;
        bVar.f989b = aVar2;
        bVar.f990c = i;
        bVar.f991d = i2;
        ((ConstraintLayout.b) this.f1002f).b(dVar, bVar);
        dVar.L(this.g.f992e);
        dVar.G(this.g.f993f);
        b bVar2 = this.g;
        dVar.z = bVar2.h;
        dVar.D(bVar2.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        if (r12 == r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        r0.m = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        r0.c(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        if (r10 == r7) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            r14 = this;
            b.f.b.l.d$a r6 = b.f.b.l.d.a.FIXED
            b.f.b.l.d$a r7 = b.f.b.l.d.a.MATCH_CONSTRAINT
            b.f.b.l.e r0 = r14.f997a
            java.util.ArrayList<b.f.b.l.d> r0 = r0.l0
            java.util.Iterator r8 = r0.iterator()
        Lc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r0 = r8.next()
            r9 = r0
            b.f.b.l.d r9 = (b.f.b.l.d) r9
            boolean r0 = r9.f976a
            if (r0 == 0) goto L1e
            goto Lc
        L1e:
            b.f.b.l.d$a[] r0 = r9.O
            r1 = 0
            r10 = r0[r1]
            r11 = 1
            r12 = r0[r11]
            int r0 = r9.m
            int r2 = r9.n
            b.f.b.l.d$a r4 = b.f.b.l.d.a.WRAP_CONTENT
            if (r10 == r4) goto L35
            if (r10 != r7) goto L33
            if (r0 != r11) goto L33
            goto L35
        L33:
            r0 = r1
            goto L36
        L35:
            r0 = r11
        L36:
            if (r12 == r4) goto L3c
            if (r12 != r7) goto L3d
            if (r2 != r11) goto L3d
        L3c:
            r1 = r11
        L3d:
            b.f.b.l.k.m r2 = r9.f979d
            b.f.b.l.k.i r2 = r2.f1033e
            boolean r3 = r2.j
            b.f.b.l.k.o r5 = r9.f980e
            b.f.b.l.k.i r5 = r5.f1033e
            boolean r13 = r5.j
            if (r3 == 0) goto L5b
            if (r13 == 0) goto L5b
            int r3 = r2.g
            int r5 = r5.g
            r0 = r14
            r1 = r9
            r2 = r6
            r4 = r6
            r0.f(r1, r2, r3, r4, r5)
        L58:
            r9.f976a = r11
            goto L94
        L5b:
            if (r3 == 0) goto L7a
            if (r1 == 0) goto L7a
            int r3 = r2.g
            int r5 = r5.g
            r0 = r14
            r1 = r9
            r2 = r6
            r0.f(r1, r2, r3, r4, r5)
            b.f.b.l.k.o r0 = r9.f980e
            b.f.b.l.k.i r0 = r0.f1033e
            int r1 = r9.k()
            if (r12 != r7) goto L76
        L73:
            r0.m = r1
            goto L94
        L76:
            r0.c(r1)
            goto L58
        L7a:
            if (r13 == 0) goto L94
            if (r0 == 0) goto L94
            int r3 = r2.g
            int r5 = r5.g
            r0 = r14
            r1 = r9
            r2 = r4
            r4 = r6
            r0.f(r1, r2, r3, r4, r5)
            b.f.b.l.k.m r0 = r9.f979d
            b.f.b.l.k.i r0 = r0.f1033e
            int r1 = r9.q()
            if (r10 != r7) goto L76
            goto L73
        L94:
            boolean r0 = r9.f976a
            if (r0 == 0) goto Lc
            b.f.b.l.k.o r0 = r9.f980e
            b.f.b.l.k.i r0 = r0.l
            if (r0 == 0) goto Lc
            int r1 = r9.W
            r0.c(r1)
            goto Lc
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.b.l.k.f.g():void");
    }
}
