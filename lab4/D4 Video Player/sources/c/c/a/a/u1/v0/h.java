package c.c.a.a.u1.v0;

import android.util.Log;
import c.c.a.a.u1.a0;
import c.c.a.a.u1.h0;
import c.c.a.a.u1.k0;
import c.c.a.a.u1.l0;
import c.c.a.a.u1.n0;
import c.c.a.a.u1.v0.j;
import c.c.a.a.u1.w;
import c.c.a.a.u1.w0.v;
import c.c.a.a.u1.x;
import c.c.a.a.u1.y;
import c.c.a.a.y1.i0;
import c.c.a.a.y1.j0;
import c.c.a.a.y1.m0;
import c.c.a.a.y1.p0;
import c.c.a.a.y1.q;
import c.c.a.a.y1.r;
import c.c.a.a.y1.v0;
import c.c.a.a.y1.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class h<T extends j> implements l0, n0, i0<d>, m0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f2961b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f2962c;

    /* renamed from: d, reason: collision with root package name */
    public final c.c.a.a.l0[] f2963d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f2964e;

    /* renamed from: f, reason: collision with root package name */
    public final T f2965f;
    public final c.c.a.a.u1.m0<h<T>> g;
    public final y h;
    public final z i;
    public final p0 j = new p0("Loader:ChunkSampleStream");
    public final g k = new g();
    public final ArrayList<c.c.a.a.u1.v0.a> l;
    public final List<c.c.a.a.u1.v0.a> m;
    public final k0 n;
    public final k0[] o;
    public final c p;
    public c.c.a.a.l0 q;
    public i<T> r;
    public long s;
    public long t;
    public int u;
    public long v;
    public boolean w;

    public final class a implements l0 {

        /* renamed from: b, reason: collision with root package name */
        public final h<T> f2966b;

        /* renamed from: c, reason: collision with root package name */
        public final k0 f2967c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2968d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2969e;

        public a(h<T> hVar, k0 k0Var, int i) {
            this.f2966b = hVar;
            this.f2967c = k0Var;
            this.f2968d = i;
        }

        @Override // c.c.a.a.u1.l0
        public void a() {
        }

        public final void b() {
            if (this.f2969e) {
                return;
            }
            h hVar = h.this;
            y yVar = hVar.h;
            int[] iArr = hVar.f2962c;
            int i = this.f2968d;
            yVar.b(iArr[i], hVar.f2963d[i], 0, null, hVar.t);
            this.f2969e = true;
        }

        @Override // c.c.a.a.u1.l0
        public boolean c() {
            h hVar = h.this;
            return hVar.w || (!hVar.x() && this.f2967c.o());
        }

        public void d() {
            c.c.a.a.x1.p.g(h.this.f2964e[this.f2968d]);
            h.this.f2964e[this.f2968d] = false;
        }

        @Override // c.c.a.a.u1.l0
        public int j(c.c.a.a.m0 m0Var, c.c.a.a.o1.g gVar, boolean z) {
            if (h.this.x()) {
                return -3;
            }
            b();
            k0 k0Var = this.f2967c;
            h hVar = h.this;
            return k0Var.s(m0Var, gVar, z, hVar.w, hVar.v);
        }

        @Override // c.c.a.a.u1.l0
        public int r(long j) {
            if (h.this.x()) {
                return 0;
            }
            b();
            if (h.this.w && j > this.f2967c.l()) {
                return this.f2967c.f();
            }
            int e2 = this.f2967c.e(j, true, true);
            if (e2 == -1) {
                return 0;
            }
            return e2;
        }
    }

    public h(int i, int[] iArr, c.c.a.a.l0[] l0VarArr, T t, c.c.a.a.u1.m0<h<T>> m0Var, r rVar, long j, z zVar, y yVar) {
        this.f2961b = i;
        this.f2962c = iArr;
        this.f2963d = l0VarArr;
        this.f2965f = t;
        this.g = m0Var;
        this.h = yVar;
        this.i = zVar;
        ArrayList<c.c.a.a.u1.v0.a> arrayList = new ArrayList<>();
        this.l = arrayList;
        this.m = Collections.unmodifiableList(arrayList);
        int i2 = 0;
        int length = iArr == null ? 0 : iArr.length;
        this.o = new k0[length];
        this.f2964e = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        k0[] k0VarArr = new k0[i3];
        k0 k0Var = new k0(rVar);
        this.n = k0Var;
        iArr2[0] = i;
        k0VarArr[0] = k0Var;
        while (i2 < length) {
            k0 k0Var2 = new k0(rVar);
            this.o[i2] = k0Var2;
            int i4 = i2 + 1;
            k0VarArr[i4] = k0Var2;
            iArr2[i4] = iArr[i2];
            i2 = i4;
        }
        this.p = new c(iArr2, k0VarArr);
        this.s = j;
        this.t = j;
    }

    public void A(i<T> iVar) {
        this.r = iVar;
        this.n.j();
        for (k0 k0Var : this.o) {
            k0Var.j();
        }
        this.j.f(this);
    }

    public void B(long j) {
        boolean z;
        long j2;
        this.t = j;
        if (x()) {
            this.s = j;
            return;
        }
        c.c.a.a.u1.v0.a aVar = null;
        int i = 0;
        while (true) {
            if (i >= this.l.size()) {
                break;
            }
            c.c.a.a.u1.v0.a aVar2 = this.l.get(i);
            long j3 = aVar2.f2947f;
            if (j3 == j && aVar2.j == -9223372036854775807L) {
                aVar = aVar2;
                break;
            } else if (j3 > j) {
                break;
            } else {
                i++;
            }
        }
        this.n.v();
        if (aVar != null) {
            k0 k0Var = this.n;
            int i2 = aVar.m[0];
            h0 h0Var = k0Var.f2895c;
            synchronized (h0Var) {
                int i3 = h0Var.j;
                if (i3 > i2 || i2 > h0Var.i + i3) {
                    z = false;
                } else {
                    h0Var.l = i2 - i3;
                    z = true;
                }
            }
            j2 = 0;
        } else {
            z = this.n.e(j, true, (j > e() ? 1 : (j == e() ? 0 : -1)) < 0) != -1;
            j2 = this.t;
        }
        this.v = j2;
        if (z) {
            this.u = z(this.n.m(), 0);
            for (k0 k0Var2 : this.o) {
                k0Var2.v();
                k0Var2.e(j, true, false);
            }
            return;
        }
        this.s = j;
        this.w = false;
        this.l.clear();
        this.u = 0;
        if (this.j.d()) {
            this.j.b();
            return;
        }
        this.n.u(false);
        for (k0 k0Var3 : this.o) {
            k0Var3.u(false);
        }
    }

    @Override // c.c.a.a.u1.l0
    public void a() {
        this.j.e(Integer.MIN_VALUE);
        if (this.j.d()) {
            return;
        }
        this.f2965f.a();
    }

    @Override // c.c.a.a.u1.l0
    public boolean c() {
        return this.w || (!x() && this.n.o());
    }

    @Override // c.c.a.a.u1.n0
    public long d() {
        if (this.w) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.s;
        }
        long j = this.t;
        c.c.a.a.u1.v0.a v = v();
        if (!v.d()) {
            if (this.l.size() > 1) {
                v = this.l.get(r2.size() - 2);
            } else {
                v = null;
            }
        }
        if (v != null) {
            j = Math.max(j, v.g);
        }
        return Math.max(j, this.n.l());
    }

    @Override // c.c.a.a.u1.n0
    public long e() {
        if (x()) {
            return this.s;
        }
        if (this.w) {
            return Long.MIN_VALUE;
        }
        return v().g;
    }

    @Override // c.c.a.a.u1.n0
    public boolean f(long j) {
        List<c.c.a.a.u1.v0.a> list;
        long j2;
        int i = 0;
        if (this.w || this.j.d()) {
            return false;
        }
        boolean x = x();
        if (x) {
            list = Collections.emptyList();
            j2 = this.s;
        } else {
            list = this.m;
            j2 = v().g;
        }
        this.f2965f.d(j, j2, list, this.k);
        g gVar = this.k;
        boolean z = gVar.f2960b;
        d dVar = gVar.f2959a;
        gVar.f2959a = null;
        gVar.f2960b = false;
        if (z) {
            this.s = -9223372036854775807L;
            this.w = true;
            return true;
        }
        if (dVar == null) {
            return false;
        }
        if (dVar instanceof c.c.a.a.u1.v0.a) {
            c.c.a.a.u1.v0.a aVar = (c.c.a.a.u1.v0.a) dVar;
            if (x) {
                long j3 = aVar.f2947f;
                long j4 = this.s;
                if (j3 == j4) {
                    j4 = 0;
                }
                this.v = j4;
                this.s = -9223372036854775807L;
            }
            c cVar = this.p;
            aVar.l = cVar;
            int[] iArr = new int[cVar.f2941b.length];
            while (true) {
                k0[] k0VarArr = cVar.f2941b;
                if (i >= k0VarArr.length) {
                    break;
                }
                if (k0VarArr[i] != null) {
                    h0 h0Var = k0VarArr[i].f2895c;
                    iArr[i] = h0Var.j + h0Var.i;
                }
                i++;
            }
            aVar.m = iArr;
            this.l.add(aVar);
        }
        this.h.i(dVar.f2942a, dVar.f2943b, this.f2961b, dVar.f2944c, dVar.f2945d, dVar.f2946e, dVar.f2947f, dVar.g, this.j.g(dVar, this, this.i.b(dVar.f2943b)));
        return true;
    }

    @Override // c.c.a.a.u1.n0
    public void g(long j) {
        int size;
        int f2;
        if (this.j.d() || x() || (size = this.l.size()) <= (f2 = this.f2965f.f(j, this.m))) {
            return;
        }
        while (true) {
            if (f2 >= size) {
                f2 = size;
                break;
            } else if (!w(f2)) {
                break;
            } else {
                f2++;
            }
        }
        if (f2 == size) {
            return;
        }
        long j2 = v().g;
        c.c.a.a.u1.v0.a u = u(f2);
        if (this.l.isEmpty()) {
            this.s = this.t;
        }
        this.w = false;
        final y yVar = this.h;
        final a0 a0Var = new a0(1, this.f2961b, null, 3, null, yVar.a(u.f2947f), yVar.a(j2));
        final w wVar = yVar.f3195b;
        Objects.requireNonNull(wVar);
        Iterator<x> it = yVar.f3196c.iterator();
        while (it.hasNext()) {
            x next = it.next();
            final c.c.a.a.l1.d dVar = next.f3099b;
            yVar.m(next.f3098a, new Runnable() { // from class: c.c.a.a.u1.b
                @Override // java.lang.Runnable
                public final void run() {
                    y yVar2 = y.this;
                    c.c.a.a.l1.d dVar2 = dVar;
                    w wVar2 = wVar;
                    a0 a0Var2 = a0Var;
                    c.c.a.a.l1.e E = dVar2.E(yVar2.f3194a, wVar2);
                    Iterator<c.c.a.a.l1.f> it2 = dVar2.f2051b.iterator();
                    while (it2.hasNext()) {
                        it2.next().F(E, a0Var2);
                    }
                }
            });
        }
    }

    @Override // c.c.a.a.y1.i0
    public j0 i(d dVar, long j, long j2, IOException iOException, int i) {
        d dVar2 = dVar;
        long j3 = dVar2.h.f3690b;
        boolean z = dVar2 instanceof c.c.a.a.u1.v0.a;
        int size = this.l.size() - 1;
        boolean z2 = (j3 != 0 && z && w(size)) ? false : true;
        j0 j0Var = null;
        if (this.f2965f.e(dVar2, z2, iOException, z2 ? this.i.a(iOException) : -9223372036854775807L)) {
            if (z2) {
                j0Var = p0.f3646d;
                if (z) {
                    c.c.a.a.x1.p.g(u(size) == dVar2);
                    if (this.l.isEmpty()) {
                        this.s = this.t;
                    }
                }
            } else {
                Log.w("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            }
        }
        if (j0Var == null) {
            long c2 = this.i.c(iOException, i);
            j0Var = c2 != -9223372036854775807L ? p0.c(false, c2) : p0.f3647e;
        }
        j0 j0Var2 = j0Var;
        boolean z3 = !j0Var2.a();
        y yVar = this.h;
        q qVar = dVar2.f2942a;
        v0 v0Var = dVar2.h;
        yVar.g(qVar, v0Var.f3691c, v0Var.f3692d, dVar2.f2943b, this.f2961b, dVar2.f2944c, dVar2.f2945d, dVar2.f2946e, dVar2.f2947f, dVar2.g, j, j2, j3, iOException, z3);
        if (z3) {
            this.g.c(this);
        }
        return j0Var2;
    }

    @Override // c.c.a.a.u1.l0
    public int j(c.c.a.a.m0 m0Var, c.c.a.a.o1.g gVar, boolean z) {
        if (x()) {
            return -3;
        }
        y();
        return this.n.s(m0Var, gVar, z, this.w, this.v);
    }

    @Override // c.c.a.a.y1.m0
    public void k() {
        this.n.u(false);
        for (k0 k0Var : this.o) {
            k0Var.u(false);
        }
        i<T> iVar = this.r;
        if (iVar != null) {
            c.c.a.a.u1.w0.f fVar = (c.c.a.a.u1.w0.f) iVar;
            synchronized (fVar) {
                v remove = fVar.m.remove(this);
                if (remove != null) {
                    remove.f3024a.u(false);
                }
            }
        }
    }

    @Override // c.c.a.a.y1.i0
    public void l(d dVar, long j, long j2) {
        d dVar2 = dVar;
        this.f2965f.c(dVar2);
        y yVar = this.h;
        q qVar = dVar2.f2942a;
        v0 v0Var = dVar2.h;
        yVar.e(qVar, v0Var.f3691c, v0Var.f3692d, dVar2.f2943b, this.f2961b, dVar2.f2944c, dVar2.f2945d, dVar2.f2946e, dVar2.f2947f, dVar2.g, j, j2, v0Var.f3690b);
        this.g.c(this);
    }

    public void n(long j, boolean z) {
        long j2;
        if (x()) {
            return;
        }
        k0 k0Var = this.n;
        int i = k0Var.f2895c.j;
        k0Var.i(j, z, true);
        h0 h0Var = this.n.f2895c;
        int i2 = h0Var.j;
        if (i2 > i) {
            synchronized (h0Var) {
                j2 = h0Var.i == 0 ? Long.MIN_VALUE : h0Var.f2882f[h0Var.k];
            }
            int i3 = 0;
            while (true) {
                k0[] k0VarArr = this.o;
                if (i3 >= k0VarArr.length) {
                    break;
                }
                k0VarArr[i3].i(j2, z, this.f2964e[i3]);
                i3++;
            }
        }
        int min = Math.min(z(i2, 0), this.u);
        if (min > 0) {
            c.c.a.a.z1.l0.A(this.l, 0, min);
            this.u -= min;
        }
    }

    @Override // c.c.a.a.y1.i0
    public void p(d dVar, long j, long j2, boolean z) {
        d dVar2 = dVar;
        y yVar = this.h;
        q qVar = dVar2.f2942a;
        v0 v0Var = dVar2.h;
        yVar.c(qVar, v0Var.f3691c, v0Var.f3692d, dVar2.f2943b, this.f2961b, dVar2.f2944c, dVar2.f2945d, dVar2.f2946e, dVar2.f2947f, dVar2.g, j, j2, v0Var.f3690b);
        if (z) {
            return;
        }
        this.n.u(false);
        for (k0 k0Var : this.o) {
            k0Var.u(false);
        }
        this.g.c(this);
    }

    @Override // c.c.a.a.u1.l0
    public int r(long j) {
        int i = 0;
        if (x()) {
            return 0;
        }
        if (!this.w || j <= this.n.l()) {
            int e2 = this.n.e(j, true, true);
            if (e2 != -1) {
                i = e2;
            }
        } else {
            i = this.n.f();
        }
        y();
        return i;
    }

    public final c.c.a.a.u1.v0.a u(int i) {
        c.c.a.a.u1.v0.a aVar = this.l.get(i);
        ArrayList<c.c.a.a.u1.v0.a> arrayList = this.l;
        c.c.a.a.z1.l0.A(arrayList, i, arrayList.size());
        this.u = Math.max(this.u, this.l.size());
        k0 k0Var = this.n;
        int i2 = 0;
        int i3 = aVar.m[0];
        while (true) {
            k0Var.k(i3);
            k0[] k0VarArr = this.o;
            if (i2 >= k0VarArr.length) {
                return aVar;
            }
            k0Var = k0VarArr[i2];
            i2++;
            i3 = aVar.m[i2];
        }
    }

    public final c.c.a.a.u1.v0.a v() {
        return this.l.get(r0.size() - 1);
    }

    public final boolean w(int i) {
        int m;
        c.c.a.a.u1.v0.a aVar = this.l.get(i);
        if (this.n.m() > aVar.m[0]) {
            return true;
        }
        int i2 = 0;
        do {
            k0[] k0VarArr = this.o;
            if (i2 >= k0VarArr.length) {
                return false;
            }
            m = k0VarArr[i2].m();
            i2++;
        } while (m <= aVar.m[i2]);
        return true;
    }

    public boolean x() {
        return this.s != -9223372036854775807L;
    }

    public final void y() {
        int z = z(this.n.m(), this.u - 1);
        while (true) {
            int i = this.u;
            if (i > z) {
                return;
            }
            this.u = i + 1;
            c.c.a.a.u1.v0.a aVar = this.l.get(i);
            c.c.a.a.l0 l0Var = aVar.f2944c;
            if (!l0Var.equals(this.q)) {
                this.h.b(this.f2961b, l0Var, aVar.f2945d, aVar.f2946e, aVar.f2947f);
            }
            this.q = l0Var;
        }
    }

    public final int z(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.l.size()) {
                return this.l.size() - 1;
            }
        } while (this.l.get(i2).m[0] <= i);
        return i2 - 1;
    }
}
