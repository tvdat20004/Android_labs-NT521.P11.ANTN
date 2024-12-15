package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import b.r.b.e0;
import b.r.b.u;
import b.r.b.x;
import b.r.b.y;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.m implements RecyclerView.w.a {
    public int A;
    public d B;
    public final a C;
    public final b D;
    public int E;
    public int[] F;
    public int r;
    public c s;
    public e0 t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public e0 f281a;

        /* renamed from: b, reason: collision with root package name */
        public int f282b;

        /* renamed from: c, reason: collision with root package name */
        public int f283c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f284d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f285e;

        public a() {
            d();
        }

        public void a() {
            this.f283c = this.f284d ? this.f281a.g() : this.f281a.k();
        }

        public void b(View view, int i) {
            if (this.f284d) {
                this.f283c = this.f281a.m() + this.f281a.b(view);
            } else {
                this.f283c = this.f281a.e(view);
            }
            this.f282b = i;
        }

        public void c(View view, int i) {
            int min;
            int m = this.f281a.m();
            if (m >= 0) {
                b(view, i);
                return;
            }
            this.f282b = i;
            if (this.f284d) {
                int g = (this.f281a.g() - m) - this.f281a.b(view);
                this.f283c = this.f281a.g() - g;
                if (g <= 0) {
                    return;
                }
                int c2 = this.f283c - this.f281a.c(view);
                int k = this.f281a.k();
                int min2 = c2 - (Math.min(this.f281a.e(view) - k, 0) + k);
                if (min2 >= 0) {
                    return;
                }
                min = Math.min(g, -min2) + this.f283c;
            } else {
                int e2 = this.f281a.e(view);
                int k2 = e2 - this.f281a.k();
                this.f283c = e2;
                if (k2 <= 0) {
                    return;
                }
                int g2 = (this.f281a.g() - Math.min(0, (this.f281a.g() - m) - this.f281a.b(view))) - (this.f281a.c(view) + e2);
                if (g2 >= 0) {
                    return;
                } else {
                    min = this.f283c - Math.min(k2, -g2);
                }
            }
            this.f283c = min;
        }

        public void d() {
            this.f282b = -1;
            this.f283c = Integer.MIN_VALUE;
            this.f284d = false;
            this.f285e = false;
        }

        public String toString() {
            StringBuilder j = c.a.a.a.a.j("AnchorInfo{mPosition=");
            j.append(this.f282b);
            j.append(", mCoordinate=");
            j.append(this.f283c);
            j.append(", mLayoutFromEnd=");
            j.append(this.f284d);
            j.append(", mValid=");
            j.append(this.f285e);
            j.append('}');
            return j.toString();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f286a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f287b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f288c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f289d;
    }

    public static class c {

        /* renamed from: b, reason: collision with root package name */
        public int f291b;

        /* renamed from: c, reason: collision with root package name */
        public int f292c;

        /* renamed from: d, reason: collision with root package name */
        public int f293d;

        /* renamed from: e, reason: collision with root package name */
        public int f294e;

        /* renamed from: f, reason: collision with root package name */
        public int f295f;
        public int g;
        public int j;
        public boolean l;

        /* renamed from: a, reason: collision with root package name */
        public boolean f290a = true;
        public int h = 0;
        public int i = 0;
        public List<RecyclerView.a0> k = null;

        public void a(View view) {
            int a2;
            int size = this.k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.k.get(i2).f305a;
                RecyclerView.n nVar = (RecyclerView.n) view3.getLayoutParams();
                if (view3 != view && !nVar.c() && (a2 = (nVar.a() - this.f293d) * this.f294e) >= 0 && a2 < i) {
                    view2 = view3;
                    if (a2 == 0) {
                        break;
                    } else {
                        i = a2;
                    }
                }
            }
            this.f293d = view2 == null ? -1 : ((RecyclerView.n) view2.getLayoutParams()).a();
        }

        public boolean b(RecyclerView.x xVar) {
            int i = this.f293d;
            return i >= 0 && i < xVar.b();
        }

        public View c(RecyclerView.s sVar) {
            List<RecyclerView.a0> list = this.k;
            if (list == null) {
                View view = sVar.j(this.f293d, false, Long.MAX_VALUE).f305a;
                this.f293d += this.f294e;
                return view;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view2 = this.k.get(i).f305a;
                RecyclerView.n nVar = (RecyclerView.n) view2.getLayoutParams();
                if (!nVar.c() && this.f293d == nVar.a()) {
                    a(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new x();

        /* renamed from: b, reason: collision with root package name */
        public int f296b;

        /* renamed from: c, reason: collision with root package name */
        public int f297c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f298d;

        public d() {
        }

        public d(Parcel parcel) {
            this.f296b = parcel.readInt();
            this.f297c = parcel.readInt();
            this.f298d = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f296b = dVar.f296b;
            this.f297c = dVar.f297c;
            this.f298d = dVar.f298d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean i() {
            return this.f296b >= 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f296b);
            parcel.writeInt(this.f297c);
            parcel.writeInt(this.f298d ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i, boolean z) {
        this.r = 1;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = true;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        this.C = new a();
        this.D = new b();
        this.E = 2;
        this.F = new int[2];
        B1(i);
        d(null);
        if (z == this.v) {
            return;
        }
        this.v = z;
        J0();
    }

    public int A1(int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (y() == 0 || i == 0) {
            return 0;
        }
        e1();
        this.s.f290a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        D1(i2, abs, true, xVar);
        c cVar = this.s;
        int f1 = f1(sVar, cVar, xVar, false) + cVar.g;
        if (f1 < 0) {
            return 0;
        }
        if (abs > f1) {
            i = i2 * f1;
        }
        this.t.p(-i);
        this.s.j = i;
        return i;
    }

    public void B1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(c.a.a.a.a.b("invalid orientation:", i));
        }
        d(null);
        if (i != this.r || this.t == null) {
            e0 a2 = e0.a(this, i);
            this.t = a2;
            this.C.f281a = a2;
            this.r = i;
            J0();
        }
    }

    public void C1(boolean z) {
        d(null);
        if (this.x == z) {
            return;
        }
        this.x = z;
        J0();
    }

    public final void D1(int i, int i2, boolean z, RecyclerView.x xVar) {
        int k;
        this.s.l = y1();
        this.s.f295f = i;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        Y0(xVar, iArr);
        int max = Math.max(0, this.F[0]);
        int max2 = Math.max(0, this.F[1]);
        boolean z2 = i == 1;
        c cVar = this.s;
        int i3 = z2 ? max2 : max;
        cVar.h = i3;
        if (!z2) {
            max = max2;
        }
        cVar.i = max;
        if (z2) {
            cVar.h = this.t.h() + i3;
            View r1 = r1();
            c cVar2 = this.s;
            cVar2.f294e = this.w ? -1 : 1;
            int Q = Q(r1);
            c cVar3 = this.s;
            cVar2.f293d = Q + cVar3.f294e;
            cVar3.f291b = this.t.b(r1);
            k = this.t.b(r1) - this.t.g();
        } else {
            View s1 = s1();
            c cVar4 = this.s;
            cVar4.h = this.t.k() + cVar4.h;
            c cVar5 = this.s;
            cVar5.f294e = this.w ? 1 : -1;
            int Q2 = Q(s1);
            c cVar6 = this.s;
            cVar5.f293d = Q2 + cVar6.f294e;
            cVar6.f291b = this.t.e(s1);
            k = (-this.t.e(s1)) + this.t.k();
        }
        c cVar7 = this.s;
        cVar7.f292c = i2;
        if (z) {
            cVar7.f292c = i2 - k;
        }
        cVar7.g = k;
    }

    public final void E1(int i, int i2) {
        this.s.f292c = this.t.g() - i2;
        c cVar = this.s;
        cVar.f294e = this.w ? -1 : 1;
        cVar.f293d = i;
        cVar.f295f = 1;
        cVar.f291b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    public final void F1(int i, int i2) {
        this.s.f292c = i2 - this.t.k();
        c cVar = this.s;
        cVar.f293d = i;
        cVar.f294e = this.w ? 1 : -1;
        cVar.f295f = -1;
        cVar.f291b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int K0(int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.r == 1) {
            return 0;
        }
        return A1(i, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void L0(int i) {
        this.z = i;
        this.A = Integer.MIN_VALUE;
        d dVar = this.B;
        if (dVar != null) {
            dVar.f296b = -1;
        }
        J0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int M0(int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.r == 0) {
            return 0;
        }
        return A1(i, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean T0() {
        boolean z;
        if (this.o == 1073741824 || this.n == 1073741824) {
            return false;
        }
        int y = y();
        int i = 0;
        while (true) {
            if (i >= y) {
                z = false;
                break;
            }
            ViewGroup.LayoutParams layoutParams = x(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                z = true;
                break;
            }
            i++;
        }
        return z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean V() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void V0(RecyclerView recyclerView, RecyclerView.x xVar, int i) {
        y yVar = new y(recyclerView.getContext());
        yVar.f348a = i;
        W0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean X0() {
        return this.B == null && this.u == this.x;
    }

    public void Y0(RecyclerView.x xVar, int[] iArr) {
        int i;
        int l = xVar.f354a != -1 ? this.t.l() : 0;
        if (this.s.f295f == -1) {
            i = 0;
        } else {
            i = l;
            l = 0;
        }
        iArr[0] = l;
        iArr[1] = i;
    }

    public void Z0(RecyclerView.x xVar, c cVar, RecyclerView.m.a aVar) {
        int i = cVar.f293d;
        if (i < 0 || i >= xVar.b()) {
            return;
        }
        ((u.a) aVar).a(i, Math.max(0, cVar.g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.a
    public PointF a(int i) {
        if (y() == 0) {
            return null;
        }
        int i2 = (i < Q(x(0))) != this.w ? -1 : 1;
        return this.r == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final int a1(RecyclerView.x xVar) {
        if (y() == 0) {
            return 0;
        }
        e1();
        return b.q.u.c(xVar, this.t, i1(!this.y, true), h1(!this.y, true), this, this.y);
    }

    public final int b1(RecyclerView.x xVar) {
        if (y() == 0) {
            return 0;
        }
        e1();
        return b.q.u.d(xVar, this.t, i1(!this.y, true), h1(!this.y, true), this, this.y, this.w);
    }

    public final int c1(RecyclerView.x xVar) {
        if (y() == 0) {
            return 0;
        }
        e1();
        return b.q.u.e(xVar, this.t, i1(!this.y, true), h1(!this.y, true), this, this.y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void d(String str) {
        RecyclerView recyclerView;
        if (this.B != null || (recyclerView = this.f325b) == null) {
            return;
        }
        recyclerView.i(str);
    }

    public int d1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.r == 1) ? 1 : Integer.MIN_VALUE : this.r == 0 ? 1 : Integer.MIN_VALUE : this.r == 1 ? -1 : Integer.MIN_VALUE : this.r == 0 ? -1 : Integer.MIN_VALUE : (this.r != 1 && t1()) ? -1 : 1 : (this.r != 1 && t1()) ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean e() {
        return this.r == 0;
    }

    public void e1() {
        if (this.s == null) {
            this.s = new c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f() {
        return this.r == 1;
    }

    public int f1(RecyclerView.s sVar, c cVar, RecyclerView.x xVar, boolean z) {
        int i = cVar.f292c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            w1(sVar, cVar);
        }
        int i3 = cVar.f292c + cVar.h;
        b bVar = this.D;
        while (true) {
            if ((!cVar.l && i3 <= 0) || !cVar.b(xVar)) {
                break;
            }
            bVar.f286a = 0;
            bVar.f287b = false;
            bVar.f288c = false;
            bVar.f289d = false;
            u1(sVar, xVar, cVar, bVar);
            if (!bVar.f287b) {
                int i4 = cVar.f291b;
                int i5 = bVar.f286a;
                cVar.f291b = (cVar.f295f * i5) + i4;
                if (!bVar.f288c || cVar.k != null || !xVar.g) {
                    cVar.f292c -= i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    cVar.g = i7;
                    int i8 = cVar.f292c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    w1(sVar, cVar);
                }
                if (z && bVar.f289d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f292c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void g0(RecyclerView recyclerView, RecyclerView.s sVar) {
        f0();
    }

    public final View g1(RecyclerView.s sVar, RecyclerView.x xVar) {
        return o1(sVar, xVar, 0, y(), xVar.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public View h0(View view, int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        int d1;
        z1();
        if (y() == 0 || (d1 = d1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        e1();
        D1(d1, (int) (this.t.l() * 0.33333334f), false, xVar);
        c cVar = this.s;
        cVar.g = Integer.MIN_VALUE;
        cVar.f290a = false;
        f1(sVar, cVar, xVar, true);
        View m1 = d1 == -1 ? this.w ? m1(y() - 1, -1) : m1(0, y()) : this.w ? m1(0, y()) : m1(y() - 1, -1);
        View s1 = d1 == -1 ? s1() : r1();
        if (!s1.hasFocusable()) {
            return m1;
        }
        if (m1 == null) {
            return null;
        }
        return s1;
    }

    public View h1(boolean z, boolean z2) {
        int y;
        int i;
        if (this.w) {
            y = 0;
            i = y();
        } else {
            y = y() - 1;
            i = -1;
        }
        return n1(y, i, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void i(int i, int i2, RecyclerView.x xVar, RecyclerView.m.a aVar) {
        if (this.r != 0) {
            i = i2;
        }
        if (y() == 0 || i == 0) {
            return;
        }
        e1();
        D1(i > 0 ? 1 : -1, Math.abs(i), true, xVar);
        Z0(xVar, this.s, aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void i0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.s sVar = this.f325b.f300c;
        j0(accessibilityEvent);
        if (y() > 0) {
            accessibilityEvent.setFromIndex(j1());
            accessibilityEvent.setToIndex(l1());
        }
    }

    public View i1(boolean z, boolean z2) {
        int i;
        int y;
        if (this.w) {
            i = y() - 1;
            y = -1;
        } else {
            i = 0;
            y = y();
        }
        return n1(i, y, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(int i, RecyclerView.m.a aVar) {
        boolean z;
        int i2;
        d dVar = this.B;
        if (dVar == null || !dVar.i()) {
            z1();
            z = this.w;
            i2 = this.z;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            d dVar2 = this.B;
            z = dVar2.f298d;
            i2 = dVar2.f296b;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.E && i2 >= 0 && i2 < i; i4++) {
            ((u.a) aVar).a(i2, 0);
            i2 += i3;
        }
    }

    public int j1() {
        View n1 = n1(0, y(), false, true);
        if (n1 == null) {
            return -1;
        }
        return Q(n1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int k(RecyclerView.x xVar) {
        return a1(xVar);
    }

    public final View k1(RecyclerView.s sVar, RecyclerView.x xVar) {
        return o1(sVar, xVar, y() - 1, -1, xVar.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int l(RecyclerView.x xVar) {
        return b1(xVar);
    }

    public int l1() {
        View n1 = n1(y() - 1, -1, false, true);
        if (n1 == null) {
            return -1;
        }
        return Q(n1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int m(RecyclerView.x xVar) {
        return c1(xVar);
    }

    public View m1(int i, int i2) {
        int i3;
        int i4;
        e1();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return x(i);
        }
        if (this.t.e(x(i)) < this.t.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.r == 0 ? this.f328e : this.f329f).a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int n(RecyclerView.x xVar) {
        return a1(xVar);
    }

    public View n1(int i, int i2, boolean z, boolean z2) {
        e1();
        return (this.r == 0 ? this.f328e : this.f329f).a(i, i2, z ? 24579 : 320, z2 ? 320 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int o(RecyclerView.x xVar) {
        return b1(xVar);
    }

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
            if (Q >= 0 && Q < i3) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int p(RecyclerView.x xVar) {
        return c1(xVar);
    }

    public final int p1(int i, RecyclerView.s sVar, RecyclerView.x xVar, boolean z) {
        int g;
        int g2 = this.t.g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -A1(-g2, sVar, xVar);
        int i3 = i + i2;
        if (!z || (g = this.t.g() - i3) <= 0) {
            return i2;
        }
        this.t.p(g);
        return g + i2;
    }

    public final int q1(int i, RecyclerView.s sVar, RecyclerView.x xVar, boolean z) {
        int k;
        int k2 = i - this.t.k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -A1(k2, sVar, xVar);
        int i3 = i + i2;
        if (!z || (k = i3 - this.t.k()) <= 0) {
            return i2;
        }
        this.t.p(-k);
        return i2 - k;
    }

    public final View r1() {
        return x(this.w ? 0 : y() - 1);
    }

    public final View s1() {
        return x(this.w ? y() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public View t(int i) {
        int y = y();
        if (y == 0) {
            return null;
        }
        int Q = i - Q(x(0));
        if (Q >= 0 && Q < y) {
            View x = x(Q);
            if (Q(x) == i) {
                return x;
            }
        }
        return super.t(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0222  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t0(androidx.recyclerview.widget.RecyclerView.s r17, androidx.recyclerview.widget.RecyclerView.x r18) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.t0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    public boolean t1() {
        return J() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n u() {
        return new RecyclerView.n(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void u0(RecyclerView.x xVar) {
        this.B = null;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.C.d();
    }

    public void u1(RecyclerView.s sVar, RecyclerView.x xVar, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int d2;
        View c2 = cVar.c(sVar);
        if (c2 == null) {
            bVar.f287b = true;
            return;
        }
        RecyclerView.n nVar = (RecyclerView.n) c2.getLayoutParams();
        if (cVar.k == null) {
            if (this.w == (cVar.f295f == -1)) {
                c(c2, -1, false);
            } else {
                c(c2, 0, false);
            }
        } else {
            if (this.w == (cVar.f295f == -1)) {
                c(c2, -1, true);
            } else {
                c(c2, 0, true);
            }
        }
        RecyclerView.n nVar2 = (RecyclerView.n) c2.getLayoutParams();
        Rect L = this.f325b.L(c2);
        int i5 = L.left + L.right + 0;
        int i6 = L.top + L.bottom + 0;
        int z = RecyclerView.m.z(this.p, this.n, O() + N() + ((ViewGroup.MarginLayoutParams) nVar2).leftMargin + ((ViewGroup.MarginLayoutParams) nVar2).rightMargin + i5, ((ViewGroup.MarginLayoutParams) nVar2).width, e());
        int z2 = RecyclerView.m.z(this.q, this.o, M() + P() + ((ViewGroup.MarginLayoutParams) nVar2).topMargin + ((ViewGroup.MarginLayoutParams) nVar2).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) nVar2).height, f());
        if (S0(c2, z, z2, nVar2)) {
            c2.measure(z, z2);
        }
        bVar.f286a = this.t.c(c2);
        if (this.r == 1) {
            if (t1()) {
                d2 = this.p - O();
                i4 = d2 - this.t.d(c2);
            } else {
                i4 = N();
                d2 = this.t.d(c2) + i4;
            }
            int i7 = cVar.f295f;
            int i8 = cVar.f291b;
            if (i7 == -1) {
                i3 = i8;
                i2 = d2;
                i = i8 - bVar.f286a;
            } else {
                i = i8;
                i2 = d2;
                i3 = bVar.f286a + i8;
            }
        } else {
            int P = P();
            int d3 = this.t.d(c2) + P;
            int i9 = cVar.f295f;
            int i10 = cVar.f291b;
            if (i9 == -1) {
                i2 = i10;
                i = P;
                i3 = d3;
                i4 = i10 - bVar.f286a;
            } else {
                i = P;
                i2 = bVar.f286a + i10;
                i3 = d3;
                i4 = i10;
            }
        }
        Z(c2, i4, i, i2, i3);
        if (nVar.c() || nVar.b()) {
            bVar.f288c = true;
        }
        bVar.f289d = c2.hasFocusable();
    }

    public void v1(RecyclerView.s sVar, RecyclerView.x xVar, a aVar, int i) {
    }

    public final void w1(RecyclerView.s sVar, c cVar) {
        if (!cVar.f290a || cVar.l) {
            return;
        }
        int i = cVar.g;
        int i2 = cVar.i;
        if (cVar.f295f == -1) {
            int y = y();
            if (i < 0) {
                return;
            }
            int f2 = (this.t.f() - i) + i2;
            if (this.w) {
                for (int i3 = 0; i3 < y; i3++) {
                    View x = x(i3);
                    if (this.t.e(x) < f2 || this.t.o(x) < f2) {
                        x1(sVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = y - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View x2 = x(i5);
                if (this.t.e(x2) < f2 || this.t.o(x2) < f2) {
                    x1(sVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int y2 = y();
        if (!this.w) {
            for (int i7 = 0; i7 < y2; i7++) {
                View x3 = x(i7);
                if (this.t.b(x3) > i6 || this.t.n(x3) > i6) {
                    x1(sVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = y2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View x4 = x(i9);
            if (this.t.b(x4) > i6 || this.t.n(x4) > i6) {
                x1(sVar, i8, i9);
                return;
            }
        }
    }

    public final void x1(RecyclerView.s sVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                G0(i, sVar);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                G0(i3, sVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void y0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.B = (d) parcelable;
            J0();
        }
    }

    public boolean y1() {
        return this.t.i() == 0 && this.t.f() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public Parcelable z0() {
        d dVar = this.B;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (y() > 0) {
            e1();
            boolean z = this.u ^ this.w;
            dVar2.f298d = z;
            if (z) {
                View r1 = r1();
                dVar2.f297c = this.t.g() - this.t.b(r1);
                dVar2.f296b = Q(r1);
            } else {
                View s1 = s1();
                dVar2.f296b = Q(s1);
                dVar2.f297c = this.t.e(s1) - this.t.k();
            }
        } else {
            dVar2.f296b = -1;
        }
        return dVar2;
    }

    public final void z1() {
        this.w = (this.r == 1 || !t1()) ? this.v : !this.v;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.r = 1;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = true;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        this.C = new a();
        this.D = new b();
        this.E = 2;
        this.F = new int[2];
        RecyclerView.m.b R = RecyclerView.m.R(context, attributeSet, i, i2);
        B1(R.f330a);
        boolean z = R.f332c;
        d(null);
        if (z != this.v) {
            this.v = z;
            J0();
        }
        C1(R.f333d);
    }
}
