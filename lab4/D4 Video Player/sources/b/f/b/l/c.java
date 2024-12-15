package b.f.b.l;

import b.f.b.k;
import b.f.b.l.k.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public int f966b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f967c;

    /* renamed from: d, reason: collision with root package name */
    public final d f968d;

    /* renamed from: e, reason: collision with root package name */
    public final a f969e;

    /* renamed from: f, reason: collision with root package name */
    public c f970f;
    public k i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet<c> f965a = null;
    public int g = 0;
    public int h = -1;

    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public c(d dVar, a aVar) {
        this.f968d = dVar;
        this.f969e = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (r6.f968d.z == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (r4 != r10) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0056, code lost:
    
        if (r4 != r10) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006f, code lost:
    
        if (r4 != r2) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(b.f.b.l.c r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != 0) goto L7
            r6.h()
            return r0
        L7:
            r1 = 0
            if (r10 != 0) goto L75
            b.f.b.l.c$a r10 = b.f.b.l.c.a.CENTER_Y
            b.f.b.l.c$a r2 = b.f.b.l.c.a.CENTER_X
            b.f.b.l.c$a r3 = b.f.b.l.c.a.BASELINE
            b.f.b.l.c$a r4 = r7.f969e
            b.f.b.l.c$a r5 = r6.f969e
            if (r4 != r5) goto L25
            if (r5 != r3) goto L3e
            b.f.b.l.d r10 = r7.f968d
            boolean r10 = r10.z
            if (r10 == 0) goto L40
            b.f.b.l.d r10 = r6.f968d
            boolean r10 = r10.z
            if (r10 != 0) goto L3e
            goto L40
        L25:
            int r5 = r5.ordinal()
            switch(r5) {
                case 0: goto L40;
                case 1: goto L5b;
                case 2: goto L42;
                case 3: goto L5b;
                case 4: goto L42;
                case 5: goto L40;
                case 6: goto L38;
                case 7: goto L40;
                case 8: goto L40;
                default: goto L2c;
            }
        L2c:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            b.f.b.l.c$a r8 = r6.f969e
            java.lang.String r8 = r8.name()
            r7.<init>(r8)
            throw r7
        L38:
            if (r4 == r3) goto L40
            if (r4 == r2) goto L40
            if (r4 == r10) goto L40
        L3e:
            r10 = r0
            goto L72
        L40:
            r10 = r1
            goto L72
        L42:
            b.f.b.l.c$a r2 = b.f.b.l.c.a.TOP
            if (r4 == r2) goto L4d
            b.f.b.l.c$a r2 = b.f.b.l.c.a.BOTTOM
            if (r4 != r2) goto L4b
            goto L4d
        L4b:
            r2 = r1
            goto L4e
        L4d:
            r2 = r0
        L4e:
            b.f.b.l.d r3 = r7.f968d
            boolean r3 = r3 instanceof b.f.b.l.f
            if (r3 == 0) goto L59
            if (r2 != 0) goto L3e
            if (r4 != r10) goto L40
            goto L3e
        L59:
            r10 = r2
            goto L72
        L5b:
            b.f.b.l.c$a r10 = b.f.b.l.c.a.LEFT
            if (r4 == r10) goto L66
            b.f.b.l.c$a r10 = b.f.b.l.c.a.RIGHT
            if (r4 != r10) goto L64
            goto L66
        L64:
            r10 = r1
            goto L67
        L66:
            r10 = r0
        L67:
            b.f.b.l.d r3 = r7.f968d
            boolean r3 = r3 instanceof b.f.b.l.f
            if (r3 == 0) goto L72
            if (r10 != 0) goto L3e
            if (r4 != r2) goto L40
            goto L3e
        L72:
            if (r10 != 0) goto L75
            return r1
        L75:
            r6.f970f = r7
            java.util.HashSet<b.f.b.l.c> r10 = r7.f965a
            if (r10 != 0) goto L82
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            r7.f965a = r10
        L82:
            b.f.b.l.c r7 = r6.f970f
            java.util.HashSet<b.f.b.l.c> r7 = r7.f965a
            if (r7 == 0) goto L8b
            r7.add(r6)
        L8b:
            if (r8 <= 0) goto L90
            r6.g = r8
            goto L92
        L90:
            r6.g = r1
        L92:
            r6.h = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.b.l.c.a(b.f.b.l.c, int, int, boolean):boolean");
    }

    public void b(int i, ArrayList<q> arrayList, q qVar) {
        HashSet<c> hashSet = this.f965a;
        if (hashSet != null) {
            Iterator<c> it = hashSet.iterator();
            while (it.hasNext()) {
                b.d.a.b(it.next().f968d, i, arrayList, qVar);
            }
        }
    }

    public int c() {
        if (this.f967c) {
            return this.f966b;
        }
        return 0;
    }

    public int d() {
        c cVar;
        if (this.f968d.c0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i <= -1 || (cVar = this.f970f) == null || cVar.f968d.c0 != 8) ? this.g : i;
    }

    public boolean e() {
        c cVar;
        HashSet<c> hashSet = this.f965a;
        if (hashSet == null) {
            return false;
        }
        Iterator<c> it = hashSet.iterator();
        while (it.hasNext()) {
            c next = it.next();
            switch (next.f969e) {
                case NONE:
                case BASELINE:
                case CENTER:
                case CENTER_X:
                case CENTER_Y:
                    cVar = null;
                    break;
                case LEFT:
                    cVar = next.f968d.F;
                    break;
                case TOP:
                    cVar = next.f968d.G;
                    break;
                case RIGHT:
                    cVar = next.f968d.D;
                    break;
                case BOTTOM:
                    cVar = next.f968d.E;
                    break;
                default:
                    throw new AssertionError(next.f969e.name());
            }
            if (cVar.g()) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        HashSet<c> hashSet = this.f965a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean g() {
        return this.f970f != null;
    }

    public void h() {
        HashSet<c> hashSet;
        c cVar = this.f970f;
        if (cVar != null && (hashSet = cVar.f965a) != null) {
            hashSet.remove(this);
            if (this.f970f.f965a.size() == 0) {
                this.f970f.f965a = null;
            }
        }
        this.f965a = null;
        this.f970f = null;
        this.g = 0;
        this.h = -1;
        this.f967c = false;
        this.f966b = 0;
    }

    public void i() {
        k kVar = this.i;
        if (kVar == null) {
            this.i = new k(b.f.b.j.UNRESTRICTED);
        } else {
            kVar.c();
        }
    }

    public void j(int i) {
        this.f966b = i;
        this.f967c = true;
    }

    public String toString() {
        return this.f968d.d0 + ":" + this.f969e.toString();
    }
}
