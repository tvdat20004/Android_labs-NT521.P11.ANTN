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
import b.h.j.k0.b;
import b.q.u;
import b.r.b.e0;
import b.r.b.r0;
import b.r.b.s0;
import b.r.b.u;
import b.r.b.w;
import b.r.b.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.m implements RecyclerView.w.a {
    public BitSet A;
    public boolean F;
    public boolean G;
    public e H;
    public int I;
    public int[] M;
    public int r;
    public f[] s;
    public e0 t;
    public e0 u;
    public int v;
    public int w;
    public final w x;
    public boolean y;
    public boolean z = false;
    public int B = -1;
    public int C = Integer.MIN_VALUE;
    public d D = new d();
    public int E = 2;
    public final Rect J = new Rect();
    public final b K = new b();
    public boolean L = true;
    public final Runnable N = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.Z0();
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f366a;

        /* renamed from: b, reason: collision with root package name */
        public int f367b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f368c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f369d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f370e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f371f;

        public b() {
            b();
        }

        public void a() {
            this.f367b = this.f368c ? StaggeredGridLayoutManager.this.t.g() : StaggeredGridLayoutManager.this.t.k();
        }

        public void b() {
            this.f366a = -1;
            this.f367b = Integer.MIN_VALUE;
            this.f368c = false;
            this.f369d = false;
            this.f370e = false;
            int[] iArr = this.f371f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.n {

        /* renamed from: e, reason: collision with root package name */
        public f f372e;

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int[] f373a;

        /* renamed from: b, reason: collision with root package name */
        public List<a> f374b;

        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new r0();

            /* renamed from: b, reason: collision with root package name */
            public int f375b;

            /* renamed from: c, reason: collision with root package name */
            public int f376c;

            /* renamed from: d, reason: collision with root package name */
            public int[] f377d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f378e;

            public a(Parcel parcel) {
                this.f375b = parcel.readInt();
                this.f376c = parcel.readInt();
                this.f378e = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f377d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder j = c.a.a.a.a.j("FullSpanItem{mPosition=");
                j.append(this.f375b);
                j.append(", mGapDir=");
                j.append(this.f376c);
                j.append(", mHasUnwantedGapAfter=");
                j.append(this.f378e);
                j.append(", mGapPerSpan=");
                j.append(Arrays.toString(this.f377d));
                j.append('}');
                return j.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f375b);
                parcel.writeInt(this.f376c);
                parcel.writeInt(this.f378e ? 1 : 0);
                int[] iArr = this.f377d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f377d);
                }
            }
        }

        public void a() {
            int[] iArr = this.f373a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f374b = null;
        }

        public void b(int i) {
            int[] iArr = this.f373a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f373a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f373a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f373a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public a c(int i) {
            List<a> list = this.f374b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f374b.get(size);
                if (aVar.f375b == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f373a
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r5 < r0) goto La
                return r1
            La:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f374b
                if (r0 != 0) goto L10
            Le:
                r0 = r1
                goto L46
            L10:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.c(r5)
                if (r0 == 0) goto L1b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f374b
                r2.remove(r0)
            L1b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f374b
                int r0 = r0.size()
                r2 = 0
            L22:
                if (r2 >= r0) goto L34
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f374b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r3 = r3.f375b
                if (r3 < r5) goto L31
                goto L35
            L31:
                int r2 = r2 + 1
                goto L22
            L34:
                r2 = r1
            L35:
                if (r2 == r1) goto Le
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f374b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f374b
                r3.remove(r2)
                int r0 = r0.f375b
            L46:
                if (r0 != r1) goto L52
                int[] r0 = r4.f373a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f373a
                int r5 = r5.length
                return r5
            L52:
                int[] r2 = r4.f373a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d.d(int):int");
        }

        public void e(int i, int i2) {
            int[] iArr = this.f373a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            b(i3);
            int[] iArr2 = this.f373a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f373a, i, i3, -1);
            List<a> list = this.f374b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f374b.get(size);
                int i4 = aVar.f375b;
                if (i4 >= i) {
                    aVar.f375b = i4 + i2;
                }
            }
        }

        public void f(int i, int i2) {
            int[] iArr = this.f373a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            b(i3);
            int[] iArr2 = this.f373a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f373a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List<a> list = this.f374b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f374b.get(size);
                int i4 = aVar.f375b;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f374b.remove(size);
                    } else {
                        aVar.f375b = i4 - i2;
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new s0();

        /* renamed from: b, reason: collision with root package name */
        public int f379b;

        /* renamed from: c, reason: collision with root package name */
        public int f380c;

        /* renamed from: d, reason: collision with root package name */
        public int f381d;

        /* renamed from: e, reason: collision with root package name */
        public int[] f382e;

        /* renamed from: f, reason: collision with root package name */
        public int f383f;
        public int[] g;
        public List<d.a> h;
        public boolean i;
        public boolean j;
        public boolean k;

        public e() {
        }

        public e(Parcel parcel) {
            this.f379b = parcel.readInt();
            this.f380c = parcel.readInt();
            int readInt = parcel.readInt();
            this.f381d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f382e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f383f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.g = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.k = parcel.readInt() == 1;
            this.h = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f381d = eVar.f381d;
            this.f379b = eVar.f379b;
            this.f380c = eVar.f380c;
            this.f382e = eVar.f382e;
            this.f383f = eVar.f383f;
            this.g = eVar.g;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.h = eVar.h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f379b);
            parcel.writeInt(this.f380c);
            parcel.writeInt(this.f381d);
            if (this.f381d > 0) {
                parcel.writeIntArray(this.f382e);
            }
            parcel.writeInt(this.f383f);
            if (this.f383f > 0) {
                parcel.writeIntArray(this.g);
            }
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
            parcel.writeList(this.h);
        }
    }

    public class f {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList<View> f384a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        public int f385b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        public int f386c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        public int f387d = 0;

        /* renamed from: e, reason: collision with root package name */
        public final int f388e;

        public f(int i) {
            this.f388e = i;
        }

        public void a(View view) {
            c j = j(view);
            j.f372e = this;
            this.f384a.add(view);
            this.f386c = Integer.MIN_VALUE;
            if (this.f384a.size() == 1) {
                this.f385b = Integer.MIN_VALUE;
            }
            if (j.c() || j.b()) {
                this.f387d = StaggeredGridLayoutManager.this.t.c(view) + this.f387d;
            }
        }

        public void b() {
            View view = this.f384a.get(r0.size() - 1);
            c j = j(view);
            this.f386c = StaggeredGridLayoutManager.this.t.b(view);
            Objects.requireNonNull(j);
        }

        public void c() {
            View view = this.f384a.get(0);
            c j = j(view);
            this.f385b = StaggeredGridLayoutManager.this.t.e(view);
            Objects.requireNonNull(j);
        }

        public void d() {
            this.f384a.clear();
            this.f385b = Integer.MIN_VALUE;
            this.f386c = Integer.MIN_VALUE;
            this.f387d = 0;
        }

        public int e() {
            int i;
            int size;
            if (StaggeredGridLayoutManager.this.y) {
                i = this.f384a.size() - 1;
                size = -1;
            } else {
                i = 0;
                size = this.f384a.size();
            }
            return g(i, size, true);
        }

        public int f() {
            int size;
            int i;
            if (StaggeredGridLayoutManager.this.y) {
                size = 0;
                i = this.f384a.size();
            } else {
                size = this.f384a.size() - 1;
                i = -1;
            }
            return g(size, i, true);
        }

        public int g(int i, int i2, boolean z) {
            int k = StaggeredGridLayoutManager.this.t.k();
            int g = StaggeredGridLayoutManager.this.t.g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f384a.get(i);
                int e2 = StaggeredGridLayoutManager.this.t.e(view);
                int b2 = StaggeredGridLayoutManager.this.t.b(view);
                boolean z2 = false;
                boolean z3 = !z ? e2 >= g : e2 > g;
                if (!z ? b2 > k : b2 >= k) {
                    z2 = true;
                }
                if (z3 && z2 && (e2 < k || b2 > g)) {
                    return StaggeredGridLayoutManager.this.Q(view);
                }
                i += i3;
            }
            return -1;
        }

        public int h(int i) {
            int i2 = this.f386c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f384a.size() == 0) {
                return i;
            }
            b();
            return this.f386c;
        }

        public View i(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f384a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f384a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.y && staggeredGridLayoutManager.Q(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.y && staggeredGridLayoutManager2.Q(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f384a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f384a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.y && staggeredGridLayoutManager3.Q(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.y && staggeredGridLayoutManager4.Q(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public c j(View view) {
            return (c) view.getLayoutParams();
        }

        public int k(int i) {
            int i2 = this.f385b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f384a.size() == 0) {
                return i;
            }
            c();
            return this.f385b;
        }

        public void l() {
            int size = this.f384a.size();
            View remove = this.f384a.remove(size - 1);
            c j = j(remove);
            j.f372e = null;
            if (j.c() || j.b()) {
                this.f387d -= StaggeredGridLayoutManager.this.t.c(remove);
            }
            if (size == 1) {
                this.f385b = Integer.MIN_VALUE;
            }
            this.f386c = Integer.MIN_VALUE;
        }

        public void m() {
            View remove = this.f384a.remove(0);
            c j = j(remove);
            j.f372e = null;
            if (this.f384a.size() == 0) {
                this.f386c = Integer.MIN_VALUE;
            }
            if (j.c() || j.b()) {
                this.f387d -= StaggeredGridLayoutManager.this.t.c(remove);
            }
            this.f385b = Integer.MIN_VALUE;
        }

        public void n(View view) {
            c j = j(view);
            j.f372e = this;
            this.f384a.add(0, view);
            this.f385b = Integer.MIN_VALUE;
            if (this.f384a.size() == 1) {
                this.f386c = Integer.MIN_VALUE;
            }
            if (j.c() || j.b()) {
                this.f387d = StaggeredGridLayoutManager.this.t.c(view) + this.f387d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.r = -1;
        this.y = false;
        RecyclerView.m.b R = RecyclerView.m.R(context, attributeSet, i, i2);
        int i3 = R.f330a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        d(null);
        if (i3 != this.v) {
            this.v = i3;
            e0 e0Var = this.t;
            this.t = this.u;
            this.u = e0Var;
            J0();
        }
        int i4 = R.f331b;
        d(null);
        if (i4 != this.r) {
            this.D.a();
            J0();
            this.r = i4;
            this.A = new BitSet(this.r);
            this.s = new f[this.r];
            for (int i5 = 0; i5 < this.r; i5++) {
                this.s[i5] = new f(i5);
            }
            J0();
        }
        boolean z = R.f332c;
        d(null);
        e eVar = this.H;
        if (eVar != null && eVar.i != z) {
            eVar.i = z;
        }
        this.y = z;
        J0();
        this.x = new w();
        this.t = e0.a(this, this.v);
        this.u = e0.a(this, 1 - this.v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int A(RecyclerView.s sVar, RecyclerView.x xVar) {
        return this.v == 1 ? this.r : super.A(sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void A0(int i) {
        if (i == 0) {
            Z0();
        }
    }

    public final void A1(int i, RecyclerView.x xVar) {
        int i2;
        int i3;
        int i4;
        w wVar = this.x;
        boolean z = false;
        wVar.f1702b = 0;
        wVar.f1703c = i;
        RecyclerView.w wVar2 = this.g;
        if (!(wVar2 != null && wVar2.f352e) || (i4 = xVar.f354a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.z == (i4 < i)) {
                i2 = this.t.l();
                i3 = 0;
            } else {
                i3 = this.t.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.f325b;
        if (recyclerView != null && recyclerView.h) {
            this.x.f1706f = this.t.k() - i3;
            this.x.g = this.t.g() + i2;
        } else {
            this.x.g = this.t.f() + i2;
            this.x.f1706f = -i3;
        }
        w wVar3 = this.x;
        wVar3.h = false;
        wVar3.f1701a = true;
        if (this.t.i() == 0 && this.t.f() == 0) {
            z = true;
        }
        wVar3.i = z;
    }

    public final void B1(f fVar, int i, int i2) {
        int i3 = fVar.f387d;
        if (i == -1) {
            int i4 = fVar.f385b;
            if (i4 == Integer.MIN_VALUE) {
                fVar.c();
                i4 = fVar.f385b;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = fVar.f386c;
            if (i5 == Integer.MIN_VALUE) {
                fVar.b();
                i5 = fVar.f386c;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.A.set(fVar.f388e, false);
    }

    public final int C1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int K0(int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        return x1(i, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void L0(int i) {
        e eVar = this.H;
        if (eVar != null && eVar.f379b != i) {
            eVar.f382e = null;
            eVar.f381d = 0;
            eVar.f379b = -1;
            eVar.f380c = -1;
        }
        this.B = i;
        this.C = Integer.MIN_VALUE;
        J0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int M0(int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        return x1(i, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void P0(Rect rect, int i, int i2) {
        int h;
        int h2;
        int O = O() + N();
        int M = M() + P();
        if (this.v == 1) {
            h2 = RecyclerView.m.h(i2, rect.height() + M, K());
            h = RecyclerView.m.h(i, (this.w * this.r) + O, L());
        } else {
            h = RecyclerView.m.h(i, rect.width() + O, L());
            h2 = RecyclerView.m.h(i2, (this.w * this.r) + M, K());
        }
        this.f325b.setMeasuredDimension(h, h2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int S(RecyclerView.s sVar, RecyclerView.x xVar) {
        return this.v == 0 ? this.r : super.S(sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean V() {
        return this.E != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void V0(RecyclerView recyclerView, RecyclerView.x xVar, int i) {
        y yVar = new y(recyclerView.getContext());
        yVar.f348a = i;
        W0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean X0() {
        return this.H == null;
    }

    public final int Y0(int i) {
        if (y() == 0) {
            return this.z ? 1 : -1;
        }
        return (i < i1()) != this.z ? -1 : 1;
    }

    public boolean Z0() {
        int i1;
        if (y() != 0 && this.E != 0 && this.i) {
            if (this.z) {
                i1 = j1();
                i1();
            } else {
                i1 = i1();
                j1();
            }
            if (i1 == 0 && n1() != null) {
                this.D.a();
                this.h = true;
                J0();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.a
    public PointF a(int i) {
        int Y0 = Y0(i);
        PointF pointF = new PointF();
        if (Y0 == 0) {
            return null;
        }
        if (this.v == 0) {
            pointF.x = Y0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = Y0;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a0(int i) {
        super.a0(i);
        for (int i2 = 0; i2 < this.r; i2++) {
            f fVar = this.s[i2];
            int i3 = fVar.f385b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.f385b = i3 + i;
            }
            int i4 = fVar.f386c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f386c = i4 + i;
            }
        }
    }

    public final int a1(RecyclerView.x xVar) {
        if (y() == 0) {
            return 0;
        }
        return u.c(xVar, this.t, f1(!this.L), e1(!this.L), this, this.L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void b0(int i) {
        super.b0(i);
        for (int i2 = 0; i2 < this.r; i2++) {
            f fVar = this.s[i2];
            int i3 = fVar.f385b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.f385b = i3 + i;
            }
            int i4 = fVar.f386c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f386c = i4 + i;
            }
        }
    }

    public final int b1(RecyclerView.x xVar) {
        if (y() == 0) {
            return 0;
        }
        return u.d(xVar, this.t, f1(!this.L), e1(!this.L), this, this.L, this.z);
    }

    public final int c1(RecyclerView.x xVar) {
        if (y() == 0) {
            return 0;
        }
        return u.e(xVar, this.t, f1(!this.L), e1(!this.L), this, this.L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void d(String str) {
        RecyclerView recyclerView;
        if (this.H != null || (recyclerView = this.f325b) == null) {
            return;
        }
        recyclerView.i(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v30, types: [int] */
    /* JADX WARN: Type inference failed for: r3v34, types: [int] */
    /* JADX WARN: Type inference failed for: r3v37, types: [int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    public final int d1(RecyclerView.s sVar, w wVar, RecyclerView.x xVar) {
        f fVar;
        ?? r2;
        int z;
        boolean z2;
        int z3;
        int k;
        int c2;
        int k2;
        int c3;
        int i;
        int i2;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6 = false;
        this.A.set(0, this.r, true);
        int i6 = this.x.i ? wVar.f1705e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : wVar.f1705e == 1 ? wVar.g + wVar.f1702b : wVar.f1706f - wVar.f1702b;
        z1(wVar.f1705e, i6);
        int g = this.z ? this.t.g() : this.t.k();
        boolean z7 = false;
        while (true) {
            int i7 = wVar.f1703c;
            if (!((i7 < 0 || i7 >= xVar.b()) ? z6 : true) || (!this.x.i && this.A.isEmpty())) {
                break;
            }
            View view = sVar.j(wVar.f1703c, z6, Long.MAX_VALUE).f305a;
            wVar.f1703c += wVar.f1704d;
            c cVar = (c) view.getLayoutParams();
            int a2 = cVar.a();
            int[] iArr = this.D.f373a;
            int i8 = (iArr == null || a2 >= iArr.length) ? -1 : iArr[a2];
            if (i8 == -1 ? true : z6) {
                if (r1(wVar.f1705e)) {
                    i4 = -1;
                    i5 = -1;
                    z5 = this.r - 1;
                } else {
                    i4 = this.r;
                    z5 = z6;
                    i5 = 1;
                }
                f fVar2 = null;
                if (wVar.f1705e == 1) {
                    int k3 = this.t.k();
                    int i9 = Integer.MAX_VALUE;
                    for (?? r3 = z5; r3 != i4; r3 += i5) {
                        f fVar3 = this.s[r3];
                        int h = fVar3.h(k3);
                        if (h < i9) {
                            fVar2 = fVar3;
                            i9 = h;
                        }
                    }
                } else {
                    int g2 = this.t.g();
                    int i10 = Integer.MIN_VALUE;
                    for (?? r32 = z5; r32 != i4; r32 += i5) {
                        f fVar4 = this.s[r32];
                        int k4 = fVar4.k(g2);
                        if (k4 > i10) {
                            fVar2 = fVar4;
                            i10 = k4;
                        }
                    }
                }
                fVar = fVar2;
                d dVar = this.D;
                dVar.b(a2);
                dVar.f373a[a2] = fVar.f388e;
            } else {
                fVar = this.s[i8];
            }
            f fVar5 = fVar;
            cVar.f372e = fVar5;
            if (wVar.f1705e == 1) {
                r2 = 0;
                c(view, -1, false);
            } else {
                r2 = 0;
                c(view, 0, false);
            }
            if (this.v == 1) {
                z = RecyclerView.m.z(this.w, this.n, r2, ((ViewGroup.MarginLayoutParams) cVar).width, r2);
                z3 = RecyclerView.m.z(this.q, this.o, M() + P(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
                z2 = false;
            } else {
                z = RecyclerView.m.z(this.p, this.n, O() + N(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
                z2 = false;
                z3 = RecyclerView.m.z(this.w, this.o, 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            }
            p1(view, z, z3, z2);
            if (wVar.f1705e == 1) {
                c2 = fVar5.h(g);
                k = this.t.c(view) + c2;
            } else {
                k = fVar5.k(g);
                c2 = k - this.t.c(view);
            }
            int i11 = wVar.f1705e;
            f fVar6 = cVar.f372e;
            if (i11 == 1) {
                fVar6.a(view);
            } else {
                fVar6.n(view);
            }
            if (o1() && this.v == 1) {
                c3 = this.u.g() - (((this.r - 1) - fVar5.f388e) * this.w);
                k2 = c3 - this.u.c(view);
            } else {
                k2 = this.u.k() + (fVar5.f388e * this.w);
                c3 = this.u.c(view) + k2;
            }
            if (this.v == 1) {
                i2 = c3;
                i = k;
                i3 = k2;
                k2 = c2;
            } else {
                i = c3;
                i2 = k;
                i3 = c2;
            }
            Z(view, i3, k2, i2, i);
            B1(fVar5, this.x.f1705e, i6);
            t1(sVar, this.x);
            if (this.x.h && view.hasFocusable()) {
                z4 = false;
                this.A.set(fVar5.f388e, false);
            } else {
                z4 = false;
            }
            z6 = z4;
            z7 = true;
        }
        boolean z8 = z6;
        if (!z7) {
            t1(sVar, this.x);
        }
        int k5 = this.x.f1705e == -1 ? this.t.k() - l1(this.t.k()) : k1(this.t.g()) - this.t.g();
        return k5 > 0 ? Math.min(wVar.f1702b, k5) : z8 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean e() {
        return this.v == 0;
    }

    public View e1(boolean z) {
        int k = this.t.k();
        int g = this.t.g();
        View view = null;
        for (int y = y() - 1; y >= 0; y--) {
            View x = x(y);
            int e2 = this.t.e(x);
            int b2 = this.t.b(x);
            if (b2 > k && e2 < g) {
                if (b2 <= g || !z) {
                    return x;
                }
                if (view == null) {
                    view = x;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f() {
        return this.v == 1;
    }

    public View f1(boolean z) {
        int k = this.t.k();
        int g = this.t.g();
        int y = y();
        View view = null;
        for (int i = 0; i < y; i++) {
            View x = x(i);
            int e2 = this.t.e(x);
            if (this.t.b(x) > k && e2 < g) {
                if (e2 >= k || !z) {
                    return x;
                }
                if (view == null) {
                    view = x;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.n nVar) {
        return nVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void g0(RecyclerView recyclerView, RecyclerView.s sVar) {
        f0();
        Runnable runnable = this.N;
        RecyclerView recyclerView2 = this.f325b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.r; i++) {
            this.s[i].d();
        }
        recyclerView.requestLayout();
    }

    public final void g1(RecyclerView.s sVar, RecyclerView.x xVar, boolean z) {
        int g;
        int k1 = k1(Integer.MIN_VALUE);
        if (k1 != Integer.MIN_VALUE && (g = this.t.g() - k1) > 0) {
            int i = g - (-x1(-g, sVar, xVar));
            if (!z || i <= 0) {
                return;
            }
            this.t.p(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0038, code lost:
    
        if (r8.v == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x003d, code lost:
    
        if (r8.v == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x004b, code lost:
    
        if (o1() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0057, code lost:
    
        if (o1() == false) goto L46;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View h0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.s r11, androidx.recyclerview.widget.RecyclerView.x r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.h0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    public final void h1(RecyclerView.s sVar, RecyclerView.x xVar, boolean z) {
        int k;
        int l1 = l1(Integer.MAX_VALUE);
        if (l1 != Integer.MAX_VALUE && (k = l1 - this.t.k()) > 0) {
            int x1 = k - x1(k, sVar, xVar);
            if (!z || x1 <= 0) {
                return;
            }
            this.t.p(-x1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void i(int i, int i2, RecyclerView.x xVar, RecyclerView.m.a aVar) {
        int h;
        int i3;
        if (this.v != 0) {
            i = i2;
        }
        if (y() == 0 || i == 0) {
            return;
        }
        s1(i, xVar);
        int[] iArr = this.M;
        if (iArr == null || iArr.length < this.r) {
            this.M = new int[this.r];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.r; i5++) {
            w wVar = this.x;
            if (wVar.f1704d == -1) {
                h = wVar.f1706f;
                i3 = this.s[i5].k(h);
            } else {
                h = this.s[i5].h(wVar.g);
                i3 = this.x.g;
            }
            int i6 = h - i3;
            if (i6 >= 0) {
                this.M[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.M, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = this.x.f1703c;
            if (!(i8 >= 0 && i8 < xVar.b())) {
                return;
            }
            ((u.a) aVar).a(this.x.f1703c, this.M[i7]);
            w wVar2 = this.x;
            wVar2.f1703c += wVar2.f1704d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void i0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.s sVar = this.f325b.f300c;
        j0(accessibilityEvent);
        if (y() > 0) {
            View f1 = f1(false);
            View e1 = e1(false);
            if (f1 == null || e1 == null) {
                return;
            }
            int Q = Q(f1);
            int Q2 = Q(e1);
            if (Q < Q2) {
                accessibilityEvent.setFromIndex(Q);
                accessibilityEvent.setToIndex(Q2);
            } else {
                accessibilityEvent.setFromIndex(Q2);
                accessibilityEvent.setToIndex(Q);
            }
        }
    }

    public int i1() {
        if (y() == 0) {
            return 0;
        }
        return Q(x(0));
    }

    public int j1() {
        int y = y();
        if (y == 0) {
            return 0;
        }
        return Q(x(y - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int k(RecyclerView.x xVar) {
        return a1(xVar);
    }

    public final int k1(int i) {
        int h = this.s[0].h(i);
        for (int i2 = 1; i2 < this.r; i2++) {
            int h2 = this.s[i2].h(i);
            if (h2 > h) {
                h = h2;
            }
        }
        return h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int l(RecyclerView.x xVar) {
        return b1(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void l0(RecyclerView.s sVar, RecyclerView.x xVar, View view, b.h.j.k0.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            k0(view, bVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.v == 0) {
            f fVar = cVar.f372e;
            i3 = fVar == null ? -1 : fVar.f388e;
            i4 = 1;
            i = -1;
            i2 = -1;
        } else {
            f fVar2 = cVar.f372e;
            i = fVar2 == null ? -1 : fVar2.f388e;
            i2 = 1;
            i3 = -1;
            i4 = -1;
        }
        bVar.o(b.c.a(i3, i4, i, i2, false, false));
    }

    public final int l1(int i) {
        int k = this.s[0].k(i);
        for (int i2 = 1; i2 < this.r; i2++) {
            int k2 = this.s[i2].k(i);
            if (k2 < k) {
                k = k2;
            }
        }
        return k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int m(RecyclerView.x xVar) {
        return c1(xVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.z
            if (r0 == 0) goto L9
            int r0 = r6.j1()
            goto Ld
        L9:
            int r0 = r6.i1()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.D
            r4.d(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.f(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.D
            r7.e(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.f(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.e(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.z
            if (r7 == 0) goto L4d
            int r7 = r6.i1()
            goto L51
        L4d:
            int r7 = r6.j1()
        L51:
            if (r3 > r7) goto L56
            r6.J0()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int n(RecyclerView.x xVar) {
        return a1(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void n0(RecyclerView recyclerView, int i, int i2) {
        m1(i, i2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        if (r10 == r11) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c7, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c5, code lost:
    
        if (r10 == r11) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View n1() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.n1():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int o(RecyclerView.x xVar) {
        return b1(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void o0(RecyclerView recyclerView) {
        this.D.a();
        J0();
    }

    public boolean o1() {
        return J() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int p(RecyclerView.x xVar) {
        return c1(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void p0(RecyclerView recyclerView, int i, int i2, int i3) {
        m1(i, i2, 8);
    }

    public final void p1(View view, int i, int i2, boolean z) {
        Rect rect = this.J;
        RecyclerView recyclerView = this.f325b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.L(view));
        }
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect2 = this.J;
        int C1 = C1(i, i3 + rect2.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect2.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect3 = this.J;
        int C12 = C1(i2, i4 + rect3.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect3.bottom);
        if (z ? U0(view, C1, C12, cVar) : S0(view, C1, C12, cVar)) {
            view.measure(C1, C12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void q0(RecyclerView recyclerView, int i, int i2) {
        m1(i, i2, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x03f4, code lost:
    
        if (Z0() != false) goto L251;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q1(androidx.recyclerview.widget.RecyclerView.s r12, androidx.recyclerview.widget.RecyclerView.x r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.q1(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x, boolean):void");
    }

    public final boolean r1(int i) {
        if (this.v == 0) {
            return (i == -1) != this.z;
        }
        return ((i == -1) == this.z) == o1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void s0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m1(i, i2, 4);
    }

    public void s1(int i, RecyclerView.x xVar) {
        int i2;
        int i1;
        if (i > 0) {
            i1 = j1();
            i2 = 1;
        } else {
            i2 = -1;
            i1 = i1();
        }
        this.x.f1701a = true;
        A1(i1, xVar);
        y1(i2);
        w wVar = this.x;
        wVar.f1703c = i1 + wVar.f1704d;
        wVar.f1702b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void t0(RecyclerView.s sVar, RecyclerView.x xVar) {
        q1(sVar, xVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r6.f1705e == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t1(androidx.recyclerview.widget.RecyclerView.s r5, b.r.b.w r6) {
        /*
            r4 = this;
            boolean r0 = r6.f1701a
            if (r0 == 0) goto L7c
            boolean r0 = r6.i
            if (r0 == 0) goto La
            goto L7c
        La:
            int r0 = r6.f1702b
            r1 = -1
            if (r0 != 0) goto L1f
            int r0 = r6.f1705e
            if (r0 != r1) goto L19
        L13:
            int r6 = r6.g
        L15:
            r4.u1(r5, r6)
            goto L7c
        L19:
            int r6 = r6.f1706f
        L1b:
            r4.v1(r5, r6)
            goto L7c
        L1f:
            int r0 = r6.f1705e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L50
            int r0 = r6.f1706f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.s
            r1 = r1[r2]
            int r1 = r1.k(r0)
        L2f:
            int r2 = r4.r
            if (r3 >= r2) goto L41
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.s
            r2 = r2[r3]
            int r2 = r2.k(r0)
            if (r2 <= r1) goto L3e
            r1 = r2
        L3e:
            int r3 = r3 + 1
            goto L2f
        L41:
            int r0 = r0 - r1
            if (r0 >= 0) goto L45
            goto L13
        L45:
            int r1 = r6.g
            int r6 = r6.f1702b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L15
        L50:
            int r0 = r6.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.s
            r1 = r1[r2]
            int r1 = r1.h(r0)
        L5a:
            int r2 = r4.r
            if (r3 >= r2) goto L6c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.s
            r2 = r2[r3]
            int r2 = r2.h(r0)
            if (r2 >= r1) goto L69
            r1 = r2
        L69:
            int r3 = r3 + 1
            goto L5a
        L6c:
            int r0 = r6.g
            int r1 = r1 - r0
            if (r1 >= 0) goto L72
            goto L19
        L72:
            int r0 = r6.f1706f
            int r6 = r6.f1702b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L1b
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.t1(androidx.recyclerview.widget.RecyclerView$s, b.r.b.w):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n u() {
        return this.v == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void u0(RecyclerView.x xVar) {
        this.B = -1;
        this.C = Integer.MIN_VALUE;
        this.H = null;
        this.K.b();
    }

    public final void u1(RecyclerView.s sVar, int i) {
        for (int y = y() - 1; y >= 0; y--) {
            View x = x(y);
            if (this.t.e(x) < i || this.t.o(x) < i) {
                return;
            }
            c cVar = (c) x.getLayoutParams();
            Objects.requireNonNull(cVar);
            if (cVar.f372e.f384a.size() == 1) {
                return;
            }
            cVar.f372e.l();
            F0(x, sVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n v(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public final void v1(RecyclerView.s sVar, int i) {
        while (y() > 0) {
            View x = x(0);
            if (this.t.b(x) > i || this.t.n(x) > i) {
                return;
            }
            c cVar = (c) x.getLayoutParams();
            Objects.requireNonNull(cVar);
            if (cVar.f372e.f384a.size() == 1) {
                return;
            }
            cVar.f372e.m();
            F0(x, sVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final void w1() {
        this.z = (this.v == 1 || !o1()) ? this.y : !this.y;
    }

    public int x1(int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (y() == 0 || i == 0) {
            return 0;
        }
        s1(i, xVar);
        int d1 = d1(sVar, this.x, xVar);
        if (this.x.f1702b >= d1) {
            i = i < 0 ? -d1 : d1;
        }
        this.t.p(-i);
        this.F = this.z;
        w wVar = this.x;
        wVar.f1702b = 0;
        t1(sVar, wVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void y0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.H = (e) parcelable;
            J0();
        }
    }

    public final void y1(int i) {
        w wVar = this.x;
        wVar.f1705e = i;
        wVar.f1704d = this.z != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public Parcelable z0() {
        int k;
        int k2;
        int[] iArr;
        e eVar = this.H;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.i = this.y;
        eVar2.j = this.F;
        eVar2.k = this.G;
        d dVar = this.D;
        if (dVar == null || (iArr = dVar.f373a) == null) {
            eVar2.f383f = 0;
        } else {
            eVar2.g = iArr;
            eVar2.f383f = iArr.length;
            eVar2.h = dVar.f374b;
        }
        if (y() > 0) {
            eVar2.f379b = this.F ? j1() : i1();
            View e1 = this.z ? e1(true) : f1(true);
            eVar2.f380c = e1 != null ? Q(e1) : -1;
            int i = this.r;
            eVar2.f381d = i;
            eVar2.f382e = new int[i];
            for (int i2 = 0; i2 < this.r; i2++) {
                if (this.F) {
                    k = this.s[i2].h(Integer.MIN_VALUE);
                    if (k != Integer.MIN_VALUE) {
                        k2 = this.t.g();
                        k -= k2;
                        eVar2.f382e[i2] = k;
                    } else {
                        eVar2.f382e[i2] = k;
                    }
                } else {
                    k = this.s[i2].k(Integer.MIN_VALUE);
                    if (k != Integer.MIN_VALUE) {
                        k2 = this.t.k();
                        k -= k2;
                        eVar2.f382e[i2] = k;
                    } else {
                        eVar2.f382e[i2] = k;
                    }
                }
            }
        } else {
            eVar2.f379b = -1;
            eVar2.f380c = -1;
            eVar2.f381d = 0;
        }
        return eVar2;
    }

    public final void z1(int i, int i2) {
        for (int i3 = 0; i3 < this.r; i3++) {
            if (!this.s[i3].f384a.isEmpty()) {
                B1(this.s[i3], i, i2);
            }
        }
    }
}
