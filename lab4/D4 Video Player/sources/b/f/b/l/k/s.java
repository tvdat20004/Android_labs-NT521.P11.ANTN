package b.f.b.l.k;

import b.f.b.l.d;

/* loaded from: classes.dex */
public abstract class s implements e {

    /* renamed from: a, reason: collision with root package name */
    public int f1029a;

    /* renamed from: b, reason: collision with root package name */
    public b.f.b.l.d f1030b;

    /* renamed from: c, reason: collision with root package name */
    public n f1031c;

    /* renamed from: d, reason: collision with root package name */
    public d.a f1032d;

    /* renamed from: e, reason: collision with root package name */
    public i f1033e = new i(this);

    /* renamed from: f, reason: collision with root package name */
    public int f1034f = 0;
    public boolean g = false;
    public h h = new h(this);
    public h i = new h(this);
    public r j = r.NONE;

    public s(b.f.b.l.d dVar) {
        this.f1030b = dVar;
    }

    @Override // b.f.b.l.k.e
    public abstract void a(e eVar);

    public final void b(h hVar, h hVar2, int i) {
        hVar.l.add(hVar2);
        hVar.f1013f = i;
        hVar2.k.add(hVar);
    }

    public final void c(h hVar, h hVar2, int i, i iVar) {
        hVar.l.add(hVar2);
        hVar.l.add(this.f1033e);
        hVar.h = i;
        hVar.i = iVar;
        hVar2.k.add(hVar);
        iVar.k.add(hVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            b.f.b.l.d dVar = this.f1030b;
            int i3 = dVar.q;
            max = Math.max(dVar.p, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            b.f.b.l.d dVar2 = this.f1030b;
            int i4 = dVar2.t;
            max = Math.max(dVar2.s, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public final h h(b.f.b.l.c cVar) {
        s sVar;
        s sVar2;
        b.f.b.l.c cVar2 = cVar.f970f;
        if (cVar2 == null) {
            return null;
        }
        b.f.b.l.d dVar = cVar2.f968d;
        int ordinal = cVar2.f969e.ordinal();
        if (ordinal == 1) {
            sVar = dVar.f979d;
        } else {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    sVar2 = dVar.f979d;
                } else {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            return null;
                        }
                        return dVar.f980e.k;
                    }
                    sVar2 = dVar.f980e;
                }
                return sVar2.i;
            }
            sVar = dVar.f980e;
        }
        return sVar.h;
    }

    public final h i(b.f.b.l.c cVar, int i) {
        b.f.b.l.c cVar2 = cVar.f970f;
        if (cVar2 == null) {
            return null;
        }
        b.f.b.l.d dVar = cVar2.f968d;
        s sVar = i == 0 ? dVar.f979d : dVar.f980e;
        int ordinal = cVar2.f969e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return sVar.h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return sVar.i;
        }
        return null;
    }

    public long j() {
        if (this.f1033e.j) {
            return r0.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r14.f1029a == 3) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(b.f.b.l.c r18, b.f.b.l.c r19, int r20) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.b.l.k.s.l(b.f.b.l.c, b.f.b.l.c, int):void");
    }
}
