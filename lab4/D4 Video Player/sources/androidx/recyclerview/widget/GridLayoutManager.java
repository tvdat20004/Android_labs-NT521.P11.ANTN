package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.h.j.k0.b;
import b.r.b.u;
import java.util.Objects;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean G;
    public int H;
    public int[] I;
    public View[] J;
    public final SparseIntArray K;
    public final SparseIntArray L;
    public c M;
    public final Rect N;

    public static final class a extends c {
    }

    public static class b extends RecyclerView.n {

        /* renamed from: e, reason: collision with root package name */
        public int f277e;

        /* renamed from: f, reason: collision with root package name */
        public int f278f;

        public b(int i, int i2) {
            super(i, i2);
            this.f277e = -1;
            this.f278f = 0;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f277e = -1;
            this.f278f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f277e = -1;
            this.f278f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f277e = -1;
            this.f278f = 0;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final SparseIntArray f279a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        public final SparseIntArray f280b = new SparseIntArray();

        public int a(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i3++;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = 1;
                }
            }
            return i3 + 1 > i2 ? i4 + 1 : i4;
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(i2, z);
        this.G = false;
        this.H = -1;
        this.K = new SparseIntArray();
        this.L = new SparseIntArray();
        this.M = new a();
        this.N = new Rect();
        O1(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.G = false;
        this.H = -1;
        this.K = new SparseIntArray();
        this.L = new SparseIntArray();
        this.M = new a();
        this.N = new Rect();
        O1(RecyclerView.m.R(context, attributeSet, i, i2).f331b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int A(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.r == 1) {
            return this.H;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return J1(sVar, xVar, xVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void C1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        d(null);
        if (this.x) {
            this.x = false;
            J0();
        }
    }

    public final void G1(int i) {
        int i2;
        int[] iArr = this.I;
        int i3 = this.H;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.I = iArr;
    }

    public final void H1() {
        View[] viewArr = this.J;
        if (viewArr == null || viewArr.length != this.H) {
            this.J = new View[this.H];
        }
    }

    public int I1(int i, int i2) {
        if (this.r != 1 || !t1()) {
            int[] iArr = this.I;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.I;
        int i3 = this.H;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int J1(RecyclerView.s sVar, RecyclerView.x xVar, int i) {
        if (!xVar.g) {
            return this.M.a(i, this.H);
        }
        int c2 = sVar.c(i);
        if (c2 != -1) {
            return this.M.a(c2, this.H);
        }
        c.a.a.a.a.m("Cannot find span size for pre layout position. ", i, "GridLayoutManager");
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int K0(int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        P1();
        H1();
        if (this.r == 1) {
            return 0;
        }
        return A1(i, sVar, xVar);
    }

    public final int K1(RecyclerView.s sVar, RecyclerView.x xVar, int i) {
        if (!xVar.g) {
            c cVar = this.M;
            int i2 = this.H;
            Objects.requireNonNull(cVar);
            return i % i2;
        }
        int i3 = this.L.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int c2 = sVar.c(i);
        if (c2 == -1) {
            c.a.a.a.a.m("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i, "GridLayoutManager");
            return 0;
        }
        c cVar2 = this.M;
        int i4 = this.H;
        Objects.requireNonNull(cVar2);
        return c2 % i4;
    }

    public final int L1(RecyclerView.s sVar, RecyclerView.x xVar, int i) {
        if (!xVar.g) {
            Objects.requireNonNull(this.M);
            return 1;
        }
        int i2 = this.K.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (sVar.c(i) == -1) {
            c.a.a.a.a.m("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i, "GridLayoutManager");
            return 1;
        }
        Objects.requireNonNull(this.M);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int M0(int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        P1();
        H1();
        if (this.r == 0) {
            return 0;
        }
        return A1(i, sVar, xVar);
    }

    public final void M1(View view, int i, boolean z) {
        int i2;
        int i3;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f335b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int I1 = I1(bVar.f277e, bVar.f278f);
        if (this.r == 1) {
            i3 = RecyclerView.m.z(I1, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i2 = RecyclerView.m.z(this.t.l(), this.o, i4, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int z2 = RecyclerView.m.z(I1, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int z3 = RecyclerView.m.z(this.t.l(), this.n, i5, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i2 = z2;
            i3 = z3;
        }
        N1(view, i3, i2, z);
    }

    public final void N1(View view, int i, int i2, boolean z) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (z ? U0(view, i, i2, nVar) : S0(view, i, i2, nVar)) {
            view.measure(i, i2);
        }
    }

    public void O1(int i) {
        if (i == this.H) {
            return;
        }
        this.G = true;
        if (i < 1) {
            throw new IllegalArgumentException(c.a.a.a.a.b("Span count should be at least 1. Provided ", i));
        }
        this.H = i;
        this.M.f279a.clear();
        J0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void P0(Rect rect, int i, int i2) {
        int h;
        int h2;
        if (this.I == null) {
            super.P0(rect, i, i2);
        }
        int O = O() + N();
        int M = M() + P();
        if (this.r == 1) {
            h2 = RecyclerView.m.h(i2, rect.height() + M, K());
            int[] iArr = this.I;
            h = RecyclerView.m.h(i, iArr[iArr.length - 1] + O, L());
        } else {
            h = RecyclerView.m.h(i, rect.width() + O, L());
            int[] iArr2 = this.I;
            h2 = RecyclerView.m.h(i2, iArr2[iArr2.length - 1] + M, K());
        }
        this.f325b.setMeasuredDimension(h, h2);
    }

    public final void P1() {
        int M;
        int P;
        if (this.r == 1) {
            M = this.p - O();
            P = N();
        } else {
            M = this.q - M();
            P = P();
        }
        G1(M - P);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int S(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.r == 0) {
            return this.H;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return J1(sVar, xVar, xVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public boolean X0() {
        return this.B == null && !this.G;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void Z0(RecyclerView.x xVar, LinearLayoutManager.c cVar, RecyclerView.m.a aVar) {
        int i = this.H;
        for (int i2 = 0; i2 < this.H && cVar.b(xVar) && i > 0; i2++) {
            ((u.a) aVar).a(cVar.f293d, Math.max(0, cVar.g));
            Objects.requireNonNull(this.M);
            i--;
            cVar.f293d += cVar.f294e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.n nVar) {
        return nVar instanceof b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ca, code lost:
    
        if (r13 == (r2 > r15)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e6, code lost:
    
        if (r13 == (r2 > r8)) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View h0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.s r25, androidx.recyclerview.widget.RecyclerView.x r26) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.h0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int l(RecyclerView.x xVar) {
        return b1(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void l0(RecyclerView.s sVar, RecyclerView.x xVar, View view, b.h.j.k0.b bVar) {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            k0(view, bVar);
            return;
        }
        b bVar2 = (b) layoutParams;
        int J1 = J1(sVar, xVar, bVar2.a());
        if (this.r == 0) {
            i4 = bVar2.f277e;
            i = bVar2.f278f;
            i3 = 1;
            z = false;
            z2 = false;
            i2 = J1;
        } else {
            i = 1;
            i2 = bVar2.f277e;
            i3 = bVar2.f278f;
            z = false;
            z2 = false;
            i4 = J1;
        }
        bVar.o(b.c.a(i4, i, i2, i3, z, z2));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int m(RecyclerView.x xVar) {
        return c1(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void n0(RecyclerView recyclerView, int i, int i2) {
        this.M.f279a.clear();
        this.M.f280b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int o(RecyclerView.x xVar) {
        return b1(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void o0(RecyclerView recyclerView) {
        this.M.f279a.clear();
        this.M.f280b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View o1(RecyclerView.s sVar, RecyclerView.x xVar, int i, int i2, int i3) {
        e1();
        int k = this.t.k();
        int g = this.t.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View x = x(i);
            int Q = Q(x);
            if (Q >= 0 && Q < i3 && K1(sVar, xVar, Q) == 0) {
                if (((RecyclerView.n) x.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = x;
                    }
                } else {
                    if (this.t.e(x) < g && this.t.b(x) >= k) {
                        return x;
                    }
                    if (view == null) {
                        view = x;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int p(RecyclerView.x xVar) {
        return c1(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void p0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.M.f279a.clear();
        this.M.f280b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void q0(RecyclerView recyclerView, int i, int i2) {
        this.M.f279a.clear();
        this.M.f280b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void s0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.M.f279a.clear();
        this.M.f280b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void t0(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (xVar.g) {
            int y = y();
            for (int i = 0; i < y; i++) {
                b bVar = (b) x(i).getLayoutParams();
                int a2 = bVar.a();
                this.K.put(a2, bVar.f278f);
                this.L.put(a2, bVar.f277e);
            }
        }
        super.t0(sVar, xVar);
        this.K.clear();
        this.L.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n u() {
        return this.r == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void u0(RecyclerView.x xVar) {
        this.B = null;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.C.d();
        this.G = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        r22.f287b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u1(androidx.recyclerview.widget.RecyclerView.s r19, androidx.recyclerview.widget.RecyclerView.x r20, androidx.recyclerview.widget.LinearLayoutManager.c r21, androidx.recyclerview.widget.LinearLayoutManager.b r22) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.u1(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n v(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void v1(RecyclerView.s sVar, RecyclerView.x xVar, LinearLayoutManager.a aVar, int i) {
        P1();
        if (xVar.b() > 0 && !xVar.g) {
            boolean z = i == 1;
            int K1 = K1(sVar, xVar, aVar.f282b);
            if (z) {
                while (K1 > 0) {
                    int i2 = aVar.f282b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.f282b = i3;
                    K1 = K1(sVar, xVar, i3);
                }
            } else {
                int b2 = xVar.b() - 1;
                int i4 = aVar.f282b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int K12 = K1(sVar, xVar, i5);
                    if (K12 <= K1) {
                        break;
                    }
                    i4 = i5;
                    K1 = K12;
                }
                aVar.f282b = i4;
            }
        }
        H1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }
}
