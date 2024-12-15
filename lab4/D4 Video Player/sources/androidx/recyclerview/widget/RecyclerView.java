package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import b.h.j.k0.b;
import b.r.b.a;
import b.r.b.c;
import b.r.b.f0;
import b.r.b.h0;
import b.r.b.i0;
import b.r.b.j0;
import b.r.b.k0;
import b.r.b.l0;
import b.r.b.m0;
import b.r.b.n0;
import b.r.b.o0;
import b.r.b.u;
import b.r.b.u0;
import b.r.b.v0;
import b.r.b.w0;
import b.r.b.x0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements b.h.j.f {
    public static final Interpolator A0;
    public static final int[] y0 = {R.attr.nestedScrollingEnabled};
    public static final Class<?>[] z0;
    public int A;
    public boolean B;
    public final AccessibilityManager C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public i H;
    public EdgeEffect I;
    public EdgeEffect J;
    public EdgeEffect K;
    public EdgeEffect L;
    public j M;
    public int N;
    public int O;
    public VelocityTracker P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public o V;
    public final int W;
    public final int a0;

    /* renamed from: b, reason: collision with root package name */
    public final u f299b;
    public float b0;

    /* renamed from: c, reason: collision with root package name */
    public final s f300c;
    public float c0;

    /* renamed from: d, reason: collision with root package name */
    public v f301d;
    public boolean d0;

    /* renamed from: e, reason: collision with root package name */
    public b.r.b.a f302e;
    public final z e0;

    /* renamed from: f, reason: collision with root package name */
    public b.r.b.c f303f;
    public b.r.b.u f0;
    public final x0 g;
    public u.a g0;
    public boolean h;
    public final x h0;
    public final Runnable i;
    public q i0;
    public final Rect j;
    public List<q> j0;
    public final Rect k;
    public boolean k0;
    public final RectF l;
    public boolean l0;
    public e m;
    public j.a m0;
    public m n;
    public boolean n0;
    public t o;
    public o0 o0;
    public final ArrayList<l> p;
    public h p0;
    public final ArrayList<p> q;
    public final int[] q0;
    public p r;
    public b.h.j.g r0;
    public boolean s;
    public final int[] s0;
    public boolean t;
    public final int[] t0;
    public boolean u;
    public final int[] u0;
    public boolean v;
    public final List<a0> v0;
    public int w;
    public Runnable w0;
    public boolean x;
    public final x0.a x0;
    public boolean y;
    public boolean z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.v || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.s) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.y) {
                recyclerView2.x = true;
            } else {
                recyclerView2.n();
            }
        }
    }

    public static abstract class a0 {
        public static final List<Object> s = Collections.emptyList();

        /* renamed from: a, reason: collision with root package name */
        public final View f305a;

        /* renamed from: b, reason: collision with root package name */
        public WeakReference<RecyclerView> f306b;
        public int j;
        public RecyclerView r;

        /* renamed from: c, reason: collision with root package name */
        public int f307c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f308d = -1;

        /* renamed from: e, reason: collision with root package name */
        public long f309e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f310f = -1;
        public int g = -1;
        public a0 h = null;
        public a0 i = null;
        public List<Object> k = null;
        public List<Object> l = null;
        public int m = 0;
        public s n = null;
        public boolean o = false;
        public int p = 0;
        public int q = -1;

        public a0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f305a = view;
        }

        public void a(Object obj) {
            if (obj == null) {
                b(1024);
                return;
            }
            if ((1024 & this.j) == 0) {
                if (this.k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.k = arrayList;
                    this.l = Collections.unmodifiableList(arrayList);
                }
                this.k.add(obj);
            }
        }

        public void b(int i) {
            this.j = i | this.j;
        }

        public void c() {
            this.f308d = -1;
            this.g = -1;
        }

        public void d() {
            this.j &= -33;
        }

        public final int e() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.H(this);
        }

        public final int f() {
            int i = this.g;
            return i == -1 ? this.f307c : i;
        }

        public List<Object> g() {
            if ((this.j & 1024) != 0) {
                return s;
            }
            List<Object> list = this.k;
            return (list == null || list.size() == 0) ? s : this.l;
        }

        public boolean h(int i) {
            return (i & this.j) != 0;
        }

        public boolean i() {
            return (this.f305a.getParent() == null || this.f305a.getParent() == this.r) ? false : true;
        }

        public boolean j() {
            return (this.j & 1) != 0;
        }

        public boolean k() {
            return (this.j & 4) != 0;
        }

        public final boolean l() {
            if ((this.j & 16) == 0) {
                View view = this.f305a;
                WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
                if (!view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        public boolean m() {
            return (this.j & 8) != 0;
        }

        public boolean n() {
            return this.n != null;
        }

        public boolean o() {
            return (this.j & 256) != 0;
        }

        public boolean p() {
            return (this.j & 2) != 0;
        }

        public void q(int i, boolean z) {
            if (this.f308d == -1) {
                this.f308d = this.f307c;
            }
            if (this.g == -1) {
                this.g = this.f307c;
            }
            if (z) {
                this.g += i;
            }
            this.f307c += i;
            if (this.f305a.getLayoutParams() != null) {
                ((n) this.f305a.getLayoutParams()).f336c = true;
            }
        }

        public void r() {
            this.j = 0;
            this.f307c = -1;
            this.f308d = -1;
            this.f309e = -1L;
            this.g = -1;
            this.m = 0;
            this.h = null;
            this.i = null;
            List<Object> list = this.k;
            if (list != null) {
                list.clear();
            }
            this.j &= -1025;
            this.p = 0;
            this.q = -1;
            RecyclerView.k(this);
        }

        public void s(int i, int i2) {
            this.j = (i & i2) | (this.j & (~i2));
        }

        public final void t(boolean z) {
            int i;
            int i2 = this.m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.m = i3;
            if (i3 < 0) {
                this.m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.j | 16;
            } else if (!z || i3 != 0) {
                return;
            } else {
                i = this.j & (-17);
            }
            this.j = i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f307c + " id=" + this.f309e + ", oldPos=" + this.f308d + ", pLpos:" + this.g);
            if (n()) {
                sb.append(" scrap ");
                sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (k()) {
                sb.append(" invalid");
            }
            if (!j()) {
                sb.append(" unbound");
            }
            boolean z = true;
            if ((this.j & 2) != 0) {
                sb.append(" update");
            }
            if (m()) {
                sb.append(" removed");
            }
            if (u()) {
                sb.append(" ignored");
            }
            if (o()) {
                sb.append(" tmpDetached");
            }
            if (!l()) {
                StringBuilder j = c.a.a.a.a.j(" not recyclable(");
                j.append(this.m);
                j.append(")");
                sb.append(j.toString());
            }
            if ((this.j & 512) == 0 && !k()) {
                z = false;
            }
            if (z) {
                sb.append(" undefined adapter position");
            }
            if (this.f305a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public boolean u() {
            return (this.j & 128) != 0;
        }

        public boolean v() {
            return (this.j & 32) != 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = RecyclerView.this.M;
            if (jVar != null) {
                b.r.b.n nVar = (b.r.b.n) jVar;
                boolean z = !nVar.h.isEmpty();
                boolean z2 = !nVar.j.isEmpty();
                boolean z3 = !nVar.k.isEmpty();
                boolean z4 = !nVar.i.isEmpty();
                if (z || z2 || z4 || z3) {
                    Iterator<a0> it = nVar.h.iterator();
                    while (it.hasNext()) {
                        a0 next = it.next();
                        View view = next.f305a;
                        ViewPropertyAnimator animate = view.animate();
                        nVar.q.add(next);
                        animate.setDuration(nVar.f318d).alpha(0.0f).setListener(new b.r.b.g(nVar, next, animate, view)).start();
                    }
                    nVar.h.clear();
                    if (z2) {
                        ArrayList<b.r.b.m> arrayList = new ArrayList<>();
                        arrayList.addAll(nVar.j);
                        nVar.m.add(arrayList);
                        nVar.j.clear();
                        b.r.b.d dVar = new b.r.b.d(nVar, arrayList);
                        if (z) {
                            View view2 = arrayList.get(0).f1652a.f305a;
                            long j = nVar.f318d;
                            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
                            view2.postOnAnimationDelayed(dVar, j);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z3) {
                        ArrayList<b.r.b.l> arrayList2 = new ArrayList<>();
                        arrayList2.addAll(nVar.k);
                        nVar.n.add(arrayList2);
                        nVar.k.clear();
                        b.r.b.e eVar = new b.r.b.e(nVar, arrayList2);
                        if (z) {
                            View view3 = arrayList2.get(0).f1646a.f305a;
                            long j2 = nVar.f318d;
                            WeakHashMap<View, b.h.j.y> weakHashMap2 = b.h.j.u.f1311a;
                            view3.postOnAnimationDelayed(eVar, j2);
                        } else {
                            eVar.run();
                        }
                    }
                    if (z4) {
                        ArrayList<a0> arrayList3 = new ArrayList<>();
                        arrayList3.addAll(nVar.i);
                        nVar.l.add(arrayList3);
                        nVar.i.clear();
                        b.r.b.f fVar = new b.r.b.f(nVar, arrayList3);
                        if (z || z2 || z3) {
                            long max = Math.max(z2 ? nVar.f319e : 0L, z3 ? nVar.f320f : 0L) + (z ? nVar.f318d : 0L);
                            View view4 = arrayList3.get(0).f305a;
                            WeakHashMap<View, b.h.j.y> weakHashMap3 = b.h.j.u.f1311a;
                            view4.postOnAnimationDelayed(fVar, max);
                        } else {
                            fVar.run();
                        }
                    }
                }
            }
            RecyclerView.this.n0 = false;
        }
    }

    public static class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    public class d implements x0.a {
        public d() {
        }

        public void a(a0 a0Var, j.b bVar, j.b bVar2) {
            boolean z;
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            Objects.requireNonNull(recyclerView);
            a0Var.t(false);
            b.r.b.n nVar = (b.r.b.n) recyclerView.M;
            Objects.requireNonNull(nVar);
            if (bVar == null || ((i = bVar.f321a) == (i2 = bVar2.f321a) && bVar.f322b == bVar2.f322b)) {
                nVar.n(a0Var);
                a0Var.f305a.setAlpha(0.0f);
                nVar.i.add(a0Var);
                z = true;
            } else {
                z = nVar.i(a0Var, i, bVar.f322b, i2, bVar2.f322b);
            }
            if (z) {
                recyclerView.a0();
            }
        }

        public void b(a0 a0Var, j.b bVar, j.b bVar2) {
            boolean z;
            RecyclerView.this.f300c.k(a0Var);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f(a0Var);
            a0Var.t(false);
            b.r.b.n nVar = (b.r.b.n) recyclerView.M;
            Objects.requireNonNull(nVar);
            int i = bVar.f321a;
            int i2 = bVar.f322b;
            View view = a0Var.f305a;
            int left = bVar2 == null ? view.getLeft() : bVar2.f321a;
            int top = bVar2 == null ? view.getTop() : bVar2.f322b;
            if (a0Var.m() || (i == left && i2 == top)) {
                nVar.n(a0Var);
                nVar.h.add(a0Var);
                z = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                z = nVar.i(a0Var, i, i2, left, top);
            }
            if (z) {
                recyclerView.a0();
            }
        }
    }

    public static abstract class e<VH extends a0> {

        /* renamed from: a, reason: collision with root package name */
        public final f f313a = new f();

        /* renamed from: b, reason: collision with root package name */
        public boolean f314b = false;

        public abstract int a();

        public long b(int i) {
            return -1L;
        }

        public int c(int i) {
            return 0;
        }

        public abstract void d(VH vh, int i);

        public abstract VH e(ViewGroup viewGroup, int i);

        public void f(boolean z) {
            if (this.f313a.a()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f314b = z;
        }
    }

    public static class f extends Observable<g> {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                u uVar = (u) ((g) ((Observable) this).mObservers.get(size));
                RecyclerView.this.i(null);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.h0.f359f = true;
                recyclerView.c0(true);
                if (!RecyclerView.this.f302e.g()) {
                    RecyclerView.this.requestLayout();
                }
            }
        }

        public void c(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                u uVar = (u) ((g) ((Observable) this).mObservers.get(size));
                RecyclerView.this.i(null);
                b.r.b.a aVar = RecyclerView.this.f302e;
                Objects.requireNonNull(aVar);
                boolean z = false;
                if (i2 >= 1) {
                    aVar.f1592b.add(aVar.h(4, i, i2, obj));
                    aVar.f1596f |= 4;
                    if (aVar.f1592b.size() == 1) {
                        z = true;
                    }
                }
                if (z) {
                    uVar.a();
                }
            }
        }
    }

    public static abstract class g {
    }

    public interface h {
        int a(int i, int i2);
    }

    public static class i {
        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class j {

        /* renamed from: a, reason: collision with root package name */
        public a f315a = null;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<h0> f316b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        public long f317c = 120;

        /* renamed from: d, reason: collision with root package name */
        public long f318d = 120;

        /* renamed from: e, reason: collision with root package name */
        public long f319e = 250;

        /* renamed from: f, reason: collision with root package name */
        public long f320f = 250;

        public interface a {
        }

        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public int f321a;

            /* renamed from: b, reason: collision with root package name */
            public int f322b;
        }

        public static int b(a0 a0Var) {
            int i = a0Var.j & 14;
            if (a0Var.k()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int i2 = a0Var.f308d;
            int e2 = a0Var.e();
            return (i2 == -1 || e2 == -1 || i2 == e2) ? i : i | 2048;
        }

        public abstract boolean a(a0 a0Var, a0 a0Var2, b bVar, b bVar2);

        public final void c(a0 a0Var) {
            a aVar = this.f315a;
            if (aVar != null) {
                k kVar = (k) aVar;
                Objects.requireNonNull(kVar);
                boolean z = true;
                a0Var.t(true);
                if (a0Var.h != null && a0Var.i == null) {
                    a0Var.h = null;
                }
                a0Var.i = null;
                if ((a0Var.j & 16) != 0) {
                    return;
                }
                RecyclerView recyclerView = RecyclerView.this;
                View view = a0Var.f305a;
                recyclerView.m0();
                b.r.b.c cVar = recyclerView.f303f;
                int indexOfChild = ((f0) cVar.f1604a).f1616a.indexOfChild(view);
                if (indexOfChild == -1) {
                    cVar.l(view);
                } else if (cVar.f1605b.d(indexOfChild)) {
                    cVar.f1605b.f(indexOfChild);
                    cVar.l(view);
                    ((f0) cVar.f1604a).c(indexOfChild);
                } else {
                    z = false;
                }
                if (z) {
                    a0 K = RecyclerView.K(view);
                    recyclerView.f300c.k(K);
                    recyclerView.f300c.h(K);
                }
                recyclerView.o0(!z);
                if (z || !a0Var.o()) {
                    return;
                }
                RecyclerView.this.removeDetachedView(a0Var.f305a, false);
            }
        }

        public final void d() {
            int size = this.f316b.size();
            for (int i = 0; i < size; i++) {
                this.f316b.get(i).a();
            }
            this.f316b.clear();
        }

        public abstract void e(a0 a0Var);

        public abstract void f();

        public abstract boolean g();

        public b h(a0 a0Var) {
            b bVar = new b();
            View view = a0Var.f305a;
            bVar.f321a = view.getLeft();
            bVar.f322b = view.getTop();
            view.getRight();
            view.getBottom();
            return bVar;
        }
    }

    public class k implements j.a {
        public k() {
        }
    }

    public static abstract class l {
        public void a(Rect rect, View view, RecyclerView recyclerView, x xVar) {
            ((n) view.getLayoutParams()).a();
            rect.set(0, 0, 0, 0);
        }

        public void b(Canvas canvas, RecyclerView recyclerView, x xVar) {
        }

        public void c(Canvas canvas, RecyclerView recyclerView, x xVar) {
        }
    }

    public static abstract class m {

        /* renamed from: a, reason: collision with root package name */
        public b.r.b.c f324a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView f325b;

        /* renamed from: c, reason: collision with root package name */
        public final u0 f326c;

        /* renamed from: d, reason: collision with root package name */
        public final u0 f327d;

        /* renamed from: e, reason: collision with root package name */
        public v0 f328e;

        /* renamed from: f, reason: collision with root package name */
        public v0 f329f;
        public w g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public int l;
        public boolean m;
        public int n;
        public int o;
        public int p;
        public int q;

        public interface a {
        }

        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public int f330a;

            /* renamed from: b, reason: collision with root package name */
            public int f331b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f332c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f333d;
        }

        public m() {
            i0 i0Var = new i0(this);
            this.f326c = i0Var;
            j0 j0Var = new j0(this);
            this.f327d = j0Var;
            this.f328e = new v0(i0Var);
            this.f329f = new v0(j0Var);
            this.h = false;
            this.i = false;
            this.j = true;
            this.k = true;
        }

        public static b R(Context context, AttributeSet attributeSet, int i, int i2) {
            b bVar = new b();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.r.a.f1590a, i, i2);
            bVar.f330a = obtainStyledAttributes.getInt(0, 1);
            bVar.f331b = obtainStyledAttributes.getInt(10, 1);
            bVar.f332c = obtainStyledAttributes.getBoolean(9, false);
            bVar.f333d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return bVar;
        }

        public static boolean X(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public static int h(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int z(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.z(int, int, int, int, boolean):int");
        }

        public int A(s sVar, x xVar) {
            RecyclerView recyclerView = this.f325b;
            if (recyclerView == null || recyclerView.m == null || !e()) {
                return 1;
            }
            return this.f325b.m.a();
        }

        public void A0(int i) {
        }

        public int B(View view) {
            return view.getBottom() + ((n) view.getLayoutParams()).f335b.bottom;
        }

        public boolean B0(int i) {
            int P;
            int N;
            int i2;
            int i3;
            RecyclerView recyclerView = this.f325b;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                P = recyclerView.canScrollVertically(1) ? (this.q - P()) - M() : 0;
                if (this.f325b.canScrollHorizontally(1)) {
                    N = (this.p - N()) - O();
                    i3 = N;
                    i2 = P;
                }
                i2 = P;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                P = recyclerView.canScrollVertically(-1) ? -((this.q - P()) - M()) : 0;
                if (this.f325b.canScrollHorizontally(-1)) {
                    N = -((this.p - N()) - O());
                    i3 = N;
                    i2 = P;
                }
                i2 = P;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.f325b.l0(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void C(View view, Rect rect) {
            int[] iArr = RecyclerView.y0;
            n nVar = (n) view.getLayoutParams();
            Rect rect2 = nVar.f335b;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) nVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public boolean C0() {
            return false;
        }

        public int D(View view) {
            return view.getLeft() - ((n) view.getLayoutParams()).f335b.left;
        }

        public void D0(s sVar) {
            for (int y = y() - 1; y >= 0; y--) {
                if (!RecyclerView.K(x(y)).u()) {
                    G0(y, sVar);
                }
            }
        }

        public int E(View view) {
            Rect rect = ((n) view.getLayoutParams()).f335b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void E0(s sVar) {
            int size = sVar.f340a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = sVar.f340a.get(i).f305a;
                a0 K = RecyclerView.K(view);
                if (!K.u()) {
                    K.t(false);
                    if (K.o()) {
                        this.f325b.removeDetachedView(view, false);
                    }
                    j jVar = this.f325b.M;
                    if (jVar != null) {
                        jVar.e(K);
                    }
                    K.t(true);
                    a0 K2 = RecyclerView.K(view);
                    K2.n = null;
                    K2.o = false;
                    K2.d();
                    sVar.h(K2);
                }
            }
            sVar.f340a.clear();
            ArrayList<a0> arrayList = sVar.f341b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f325b.invalidate();
            }
        }

        public int F(View view) {
            Rect rect = ((n) view.getLayoutParams()).f335b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void F0(View view, s sVar) {
            b.r.b.c cVar = this.f324a;
            int indexOfChild = ((f0) cVar.f1604a).f1616a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (cVar.f1605b.f(indexOfChild)) {
                    cVar.l(view);
                }
                ((f0) cVar.f1604a).c(indexOfChild);
            }
            sVar.g(view);
        }

        public int G(View view) {
            return view.getRight() + ((n) view.getLayoutParams()).f335b.right;
        }

        public void G0(int i, s sVar) {
            View x = x(i);
            H0(i);
            sVar.g(x);
        }

        public int H(View view) {
            return view.getTop() - ((n) view.getLayoutParams()).f335b.top;
        }

        public void H0(int i) {
            b.r.b.c cVar;
            int f2;
            View a2;
            if (x(i) == null || (a2 = ((f0) cVar.f1604a).a((f2 = (cVar = this.f324a).f(i)))) == null) {
                return;
            }
            if (cVar.f1605b.f(f2)) {
                cVar.l(a2);
            }
            ((f0) cVar.f1604a).c(f2);
        }

        public View I() {
            View focusedChild;
            RecyclerView recyclerView = this.f325b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f324a.f1606c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b8, code lost:
        
            if (r1 == false) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean I0(androidx.recyclerview.widget.RecyclerView r19, android.view.View r20, android.graphics.Rect r21, boolean r22, boolean r23) {
            /*
                r18 = this;
                r0 = r18
                r1 = r21
                r2 = 2
                int[] r2 = new int[r2]
                int r3 = r18.N()
                int r4 = r18.P()
                int r5 = r0.p
                int r6 = r18.O()
                int r5 = r5 - r6
                int r6 = r0.q
                int r7 = r18.M()
                int r6 = r6 - r7
                int r7 = r20.getLeft()
                int r8 = r1.left
                int r7 = r7 + r8
                int r8 = r20.getScrollX()
                int r7 = r7 - r8
                int r8 = r20.getTop()
                int r9 = r1.top
                int r8 = r8 + r9
                int r9 = r20.getScrollY()
                int r8 = r8 - r9
                int r9 = r21.width()
                int r9 = r9 + r7
                int r1 = r21.height()
                int r1 = r1 + r8
                int r7 = r7 - r3
                r3 = 0
                int r10 = java.lang.Math.min(r3, r7)
                int r8 = r8 - r4
                int r4 = java.lang.Math.min(r3, r8)
                int r9 = r9 - r5
                int r5 = java.lang.Math.max(r3, r9)
                int r1 = r1 - r6
                int r1 = java.lang.Math.max(r3, r1)
                int r6 = r18.J()
                r11 = 1
                if (r6 != r11) goto L63
                if (r5 == 0) goto L5e
                goto L6b
            L5e:
                int r5 = java.lang.Math.max(r10, r9)
                goto L6b
            L63:
                if (r10 == 0) goto L66
                goto L6a
            L66:
                int r10 = java.lang.Math.min(r7, r5)
            L6a:
                r5 = r10
            L6b:
                if (r4 == 0) goto L6e
                goto L72
            L6e:
                int r4 = java.lang.Math.min(r8, r1)
            L72:
                r2[r3] = r5
                r2[r11] = r4
                r13 = r2[r3]
                r14 = r2[r11]
                if (r23 == 0) goto Lba
                android.view.View r1 = r19.getFocusedChild()
                if (r1 != 0) goto L83
                goto Lb7
            L83:
                int r2 = r18.N()
                int r4 = r18.P()
                int r5 = r0.p
                int r6 = r18.O()
                int r5 = r5 - r6
                int r6 = r0.q
                int r7 = r18.M()
                int r6 = r6 - r7
                androidx.recyclerview.widget.RecyclerView r7 = r0.f325b
                android.graphics.Rect r7 = r7.j
                r0.C(r1, r7)
                int r1 = r7.left
                int r1 = r1 - r13
                if (r1 >= r5) goto Lb7
                int r1 = r7.right
                int r1 = r1 - r13
                if (r1 <= r2) goto Lb7
                int r1 = r7.top
                int r1 = r1 - r14
                if (r1 >= r6) goto Lb7
                int r1 = r7.bottom
                int r1 = r1 - r14
                if (r1 > r4) goto Lb5
                goto Lb7
            Lb5:
                r1 = r11
                goto Lb8
            Lb7:
                r1 = r3
            Lb8:
                if (r1 == 0) goto Lbf
            Lba:
                if (r13 != 0) goto Lc0
                if (r14 == 0) goto Lbf
                goto Lc0
            Lbf:
                return r3
            Lc0:
                if (r22 == 0) goto Lc8
                r1 = r19
                r1.scrollBy(r13, r14)
                goto Ld4
            Lc8:
                r1 = r19
                r17 = 0
                r16 = -2147483648(0xffffffff80000000, float:-0.0)
                r15 = 0
                r12 = r19
                r12.l0(r13, r14, r15, r16, r17)
            Ld4:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.I0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public int J() {
            RecyclerView recyclerView = this.f325b;
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            return recyclerView.getLayoutDirection();
        }

        public void J0() {
            RecyclerView recyclerView = this.f325b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int K() {
            RecyclerView recyclerView = this.f325b;
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            return recyclerView.getMinimumHeight();
        }

        public abstract int K0(int i, s sVar, x xVar);

        public int L() {
            RecyclerView recyclerView = this.f325b;
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            return recyclerView.getMinimumWidth();
        }

        public abstract void L0(int i);

        public int M() {
            RecyclerView recyclerView = this.f325b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public abstract int M0(int i, s sVar, x xVar);

        public int N() {
            RecyclerView recyclerView = this.f325b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void N0(RecyclerView recyclerView) {
            O0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int O() {
            RecyclerView recyclerView = this.f325b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void O0(int i, int i2) {
            this.p = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.n = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.y0;
            }
            this.q = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.o = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.y0;
            }
        }

        public int P() {
            RecyclerView recyclerView = this.f325b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public void P0(Rect rect, int i, int i2) {
            int O = O() + N() + rect.width();
            int M = M() + P() + rect.height();
            this.f325b.setMeasuredDimension(h(i, O, L()), h(i2, M, K()));
        }

        public int Q(View view) {
            return ((n) view.getLayoutParams()).a();
        }

        public void Q0(int i, int i2) {
            int y = y();
            if (y == 0) {
                this.f325b.o(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < y; i7++) {
                View x = x(i7);
                Rect rect = this.f325b.j;
                C(x, rect);
                int i8 = rect.left;
                if (i8 < i4) {
                    i4 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i5) {
                    i5 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.f325b.j.set(i4, i5, i3, i6);
            P0(this.f325b.j, i, i2);
        }

        public void R0(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f325b = null;
                this.f324a = null;
                height = 0;
                this.p = 0;
            } else {
                this.f325b = recyclerView;
                this.f324a = recyclerView.f303f;
                this.p = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.q = height;
            this.n = 1073741824;
            this.o = 1073741824;
        }

        public int S(s sVar, x xVar) {
            RecyclerView recyclerView = this.f325b;
            if (recyclerView == null || recyclerView.m == null || !f()) {
                return 1;
            }
            return this.f325b.m.a();
        }

        public boolean S0(View view, int i, int i2, n nVar) {
            return (!view.isLayoutRequested() && this.j && X(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) nVar).width) && X(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) nVar).height)) ? false : true;
        }

        public int T() {
            return 0;
        }

        public boolean T0() {
            return false;
        }

        public void U(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((n) view.getLayoutParams()).f335b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f325b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f325b.l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean U0(View view, int i, int i2, n nVar) {
            return (this.j && X(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) nVar).width) && X(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) nVar).height)) ? false : true;
        }

        public abstract boolean V();

        public abstract void V0(RecyclerView recyclerView, x xVar, int i);

        public boolean W() {
            return false;
        }

        public void W0(w wVar) {
            w wVar2 = this.g;
            if (wVar2 != null && wVar != wVar2 && wVar2.f352e) {
                wVar2.d();
            }
            this.g = wVar;
            RecyclerView recyclerView = this.f325b;
            Objects.requireNonNull(wVar);
            recyclerView.e0.c();
            if (wVar.h) {
                StringBuilder j = c.a.a.a.a.j("An instance of ");
                j.append(wVar.getClass().getSimpleName());
                j.append(" was started more than once. Each instance of");
                j.append(wVar.getClass().getSimpleName());
                j.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", j.toString());
            }
            wVar.f349b = recyclerView;
            wVar.f350c = this;
            int i = wVar.f348a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.h0.f354a = i;
            wVar.f352e = true;
            wVar.f351d = true;
            wVar.f353f = recyclerView.n.t(i);
            wVar.f349b.e0.a();
            wVar.h = true;
        }

        public abstract boolean X0();

        public boolean Y(View view, boolean z) {
            boolean z2 = this.f328e.b(view, 24579) && this.f329f.b(view, 24579);
            return z ? z2 : !z2;
        }

        public void Z(View view, int i, int i2, int i3, int i4) {
            n nVar = (n) view.getLayoutParams();
            Rect rect = nVar.f335b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) nVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) nVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) nVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public void a0(int i) {
            RecyclerView recyclerView = this.f325b;
            if (recyclerView != null) {
                int e2 = recyclerView.f303f.e();
                for (int i2 = 0; i2 < e2; i2++) {
                    recyclerView.f303f.d(i2).offsetLeftAndRight(i);
                }
            }
        }

        public void b(View view) {
            c(view, -1, false);
        }

        public void b0(int i) {
            RecyclerView recyclerView = this.f325b;
            if (recyclerView != null) {
                int e2 = recyclerView.f303f.e();
                for (int i2 = 0; i2 < e2; i2++) {
                    recyclerView.f303f.d(i2).offsetTopAndBottom(i);
                }
            }
        }

        public final void c(View view, int i, boolean z) {
            a0 K = RecyclerView.K(view);
            if (z || K.m()) {
                this.f325b.g.a(K);
            } else {
                this.f325b.g.f(K);
            }
            n nVar = (n) view.getLayoutParams();
            if (K.v() || K.n()) {
                if (K.n()) {
                    K.n.k(K);
                } else {
                    K.d();
                }
                this.f324a.b(view, i, view.getLayoutParams(), false);
            } else {
                if (view.getParent() == this.f325b) {
                    int j = this.f324a.j(view);
                    if (i == -1) {
                        i = this.f324a.e();
                    }
                    if (j == -1) {
                        StringBuilder j2 = c.a.a.a.a.j("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        j2.append(this.f325b.indexOfChild(view));
                        throw new IllegalStateException(c.a.a.a.a.a(this.f325b, j2));
                    }
                    if (j != i) {
                        m mVar = this.f325b.n;
                        View x = mVar.x(j);
                        if (x == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j + mVar.f325b.toString());
                        }
                        mVar.x(j);
                        mVar.r(j);
                        n nVar2 = (n) x.getLayoutParams();
                        a0 K2 = RecyclerView.K(x);
                        if (K2.m()) {
                            mVar.f325b.g.a(K2);
                        } else {
                            mVar.f325b.g.f(K2);
                        }
                        mVar.f324a.b(x, i, nVar2, K2.m());
                    }
                } else {
                    this.f324a.a(view, i, false);
                    nVar.f336c = true;
                    w wVar = this.g;
                    if (wVar != null && wVar.f352e) {
                        Objects.requireNonNull(wVar.f349b);
                        a0 K3 = RecyclerView.K(view);
                        if ((K3 != null ? K3.f() : -1) == wVar.f348a) {
                            wVar.f353f = view;
                        }
                    }
                }
            }
            if (nVar.f337d) {
                K.f305a.invalidate();
                nVar.f337d = false;
            }
        }

        public void c0() {
        }

        public abstract void d(String str);

        public boolean d0() {
            return false;
        }

        public abstract boolean e();

        public void e0() {
        }

        public abstract boolean f();

        @Deprecated
        public void f0() {
        }

        public boolean g(n nVar) {
            return nVar != null;
        }

        public abstract void g0(RecyclerView recyclerView, s sVar);

        public abstract View h0(View view, int i, s sVar, x xVar);

        public abstract void i(int i, int i2, x xVar, a aVar);

        public abstract void i0(AccessibilityEvent accessibilityEvent);

        public void j(int i, a aVar) {
        }

        public void j0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f325b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f325b.canScrollVertically(-1) && !this.f325b.canScrollHorizontally(-1) && !this.f325b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            e eVar = this.f325b.m;
            if (eVar != null) {
                accessibilityEvent.setItemCount(eVar.a());
            }
        }

        public abstract int k(x xVar);

        public void k0(View view, b.h.j.k0.b bVar) {
            a0 K = RecyclerView.K(view);
            if (K == null || K.m() || this.f324a.k(K.f305a)) {
                return;
            }
            RecyclerView recyclerView = this.f325b;
            l0(recyclerView.f300c, recyclerView.h0, view, bVar);
        }

        public abstract int l(x xVar);

        public void l0(s sVar, x xVar, View view, b.h.j.k0.b bVar) {
            bVar.o(b.c.a(f() ? Q(view) : 0, 1, e() ? Q(view) : 0, 1, false, false));
        }

        public abstract int m(x xVar);

        public View m0() {
            return null;
        }

        public abstract int n(x xVar);

        public void n0(RecyclerView recyclerView, int i, int i2) {
        }

        public abstract int o(x xVar);

        public void o0(RecyclerView recyclerView) {
        }

        public abstract int p(x xVar);

        public void p0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void q(s sVar) {
            int y = y();
            while (true) {
                y--;
                if (y < 0) {
                    return;
                }
                View x = x(y);
                a0 K = RecyclerView.K(x);
                if (!K.u()) {
                    if (!K.k() || K.m() || this.f325b.m.f314b) {
                        x(y);
                        r(y);
                        sVar.i(x);
                        this.f325b.g.f(K);
                    } else {
                        H0(y);
                        sVar.h(K);
                    }
                }
            }
        }

        public void q0(RecyclerView recyclerView, int i, int i2) {
        }

        public final void r(int i) {
            this.f324a.c(i);
        }

        public void r0() {
        }

        public View s(View view) {
            View C;
            RecyclerView recyclerView = this.f325b;
            if (recyclerView == null || (C = recyclerView.C(view)) == null || this.f324a.f1606c.contains(C)) {
                return null;
            }
            return C;
        }

        public void s0(RecyclerView recyclerView, int i, int i2, Object obj) {
            r0();
        }

        public View t(int i) {
            int y = y();
            for (int i2 = 0; i2 < y; i2++) {
                View x = x(i2);
                a0 K = RecyclerView.K(x);
                if (K != null && K.f() == i && !K.u() && (this.f325b.h0.g || !K.m())) {
                    return x;
                }
            }
            return null;
        }

        public abstract void t0(s sVar, x xVar);

        public abstract n u();

        public abstract void u0(x xVar);

        public n v(Context context, AttributeSet attributeSet) {
            return new n(context, attributeSet);
        }

        public void v0(int i, int i2) {
            this.f325b.o(i, i2);
        }

        public n w(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof n ? new n((n) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new n((ViewGroup.MarginLayoutParams) layoutParams) : new n(layoutParams);
        }

        @Deprecated
        public boolean w0(RecyclerView recyclerView) {
            w wVar = this.g;
            return (wVar != null && wVar.f352e) || recyclerView.P();
        }

        public View x(int i) {
            b.r.b.c cVar = this.f324a;
            if (cVar == null) {
                return null;
            }
            return ((f0) cVar.f1604a).a(cVar.f(i));
        }

        public boolean x0(RecyclerView recyclerView, View view, View view2) {
            return w0(recyclerView);
        }

        public int y() {
            b.r.b.c cVar = this.f324a;
            if (cVar != null) {
                return cVar.e();
            }
            return 0;
        }

        public abstract void y0(Parcelable parcelable);

        public abstract Parcelable z0();
    }

    public static class n extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public a0 f334a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f335b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f336c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f337d;

        public n(int i, int i2) {
            super(i, i2);
            this.f335b = new Rect();
            this.f336c = true;
            this.f337d = false;
        }

        public n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f335b = new Rect();
            this.f336c = true;
            this.f337d = false;
        }

        public n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f335b = new Rect();
            this.f336c = true;
            this.f337d = false;
        }

        public n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f335b = new Rect();
            this.f336c = true;
            this.f337d = false;
        }

        public n(n nVar) {
            super((ViewGroup.LayoutParams) nVar);
            this.f335b = new Rect();
            this.f336c = true;
            this.f337d = false;
        }

        public int a() {
            return this.f334a.f();
        }

        public boolean b() {
            return this.f334a.p();
        }

        public boolean c() {
            return this.f334a.m();
        }
    }

    public static abstract class o {
    }

    public interface p {
    }

    public static abstract class q {
        public void a(RecyclerView recyclerView, int i) {
        }

        public abstract void b(RecyclerView recyclerView, int i, int i2);
    }

    public static class r {

        /* renamed from: a, reason: collision with root package name */
        public SparseArray<k0> f338a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        public int f339b = 0;

        public final k0 a(int i) {
            k0 k0Var = this.f338a.get(i);
            if (k0Var != null) {
                return k0Var;
            }
            k0 k0Var2 = new k0();
            this.f338a.put(i, k0Var2);
            return k0Var2;
        }

        public long b(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return (j2 / 4) + ((j / 4) * 3);
        }
    }

    public final class s {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<a0> f340a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a0> f341b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<a0> f342c;

        /* renamed from: d, reason: collision with root package name */
        public final List<a0> f343d;

        /* renamed from: e, reason: collision with root package name */
        public int f344e;

        /* renamed from: f, reason: collision with root package name */
        public int f345f;
        public r g;

        public s() {
            ArrayList<a0> arrayList = new ArrayList<>();
            this.f340a = arrayList;
            this.f341b = null;
            this.f342c = new ArrayList<>();
            this.f343d = Collections.unmodifiableList(arrayList);
            this.f344e = 2;
            this.f345f = 2;
        }

        public void a(a0 a0Var, boolean z) {
            RecyclerView.k(a0Var);
            View view = a0Var.f305a;
            o0 o0Var = RecyclerView.this.o0;
            if (o0Var != null) {
                b.h.j.b j = o0Var.j();
                b.h.j.u.i(view, j instanceof n0 ? ((n0) j).f1664e.remove(view) : null);
            }
            if (z) {
                t tVar = RecyclerView.this.o;
                if (tVar != null) {
                    tVar.a(a0Var);
                }
                RecyclerView recyclerView = RecyclerView.this;
                e eVar = recyclerView.m;
                if (recyclerView.h0 != null) {
                    recyclerView.g.g(a0Var);
                }
            }
            a0Var.r = null;
            r d2 = d();
            Objects.requireNonNull(d2);
            int i = a0Var.f310f;
            ArrayList<a0> arrayList = d2.a(i).f1642a;
            if (d2.f338a.get(i).f1643b <= arrayList.size()) {
                return;
            }
            a0Var.r();
            arrayList.add(a0Var);
        }

        public void b() {
            this.f340a.clear();
            e();
        }

        public int c(int i) {
            if (i >= 0 && i < RecyclerView.this.h0.b()) {
                RecyclerView recyclerView = RecyclerView.this;
                return !recyclerView.h0.g ? i : recyclerView.f302e.f(i, 0);
            }
            StringBuilder k = c.a.a.a.a.k("invalid position ", i, ". State item count is ");
            k.append(RecyclerView.this.h0.b());
            throw new IndexOutOfBoundsException(c.a.a.a.a.a(RecyclerView.this, k));
        }

        public r d() {
            if (this.g == null) {
                this.g = new r();
            }
            return this.g;
        }

        public void e() {
            for (int size = this.f342c.size() - 1; size >= 0; size--) {
                f(size);
            }
            this.f342c.clear();
            int[] iArr = RecyclerView.y0;
            u.a aVar = RecyclerView.this.g0;
            int[] iArr2 = aVar.f1692c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            aVar.f1693d = 0;
        }

        public void f(int i) {
            a(this.f342c.get(i), true);
            this.f342c.remove(i);
        }

        public void g(View view) {
            a0 K = RecyclerView.K(view);
            if (K.o()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (K.n()) {
                K.n.k(K);
            } else if (K.v()) {
                K.d();
            }
            h(K);
            if (RecyclerView.this.M == null || K.l()) {
                return;
            }
            RecyclerView.this.M.e(K);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void h(androidx.recyclerview.widget.RecyclerView.a0 r7) {
            /*
                Method dump skipped, instructions count: 256
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.h(androidx.recyclerview.widget.RecyclerView$a0):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void i(android.view.View r5) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$a0 r5 = androidx.recyclerview.widget.RecyclerView.K(r5)
                r0 = 12
                boolean r0 = r5.h(r0)
                r1 = 0
                if (r0 != 0) goto L55
                boolean r0 = r5.p()
                if (r0 == 0) goto L55
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$j r0 = r0.M
                r2 = 1
                if (r0 == 0) goto L3f
                java.util.List r3 = r5.g()
                b.r.b.n r0 = (b.r.b.n) r0
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L39
                boolean r0 = r0.g
                if (r0 == 0) goto L33
                boolean r0 = r5.k()
                if (r0 == 0) goto L31
                goto L33
            L31:
                r0 = r1
                goto L34
            L33:
                r0 = r2
            L34:
                if (r0 == 0) goto L37
                goto L39
            L37:
                r0 = r1
                goto L3a
            L39:
                r0 = r2
            L3a:
                if (r0 == 0) goto L3d
                goto L3f
            L3d:
                r0 = r1
                goto L40
            L3f:
                r0 = r2
            L40:
                if (r0 == 0) goto L43
                goto L55
            L43:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r4.f341b
                if (r0 != 0) goto L4e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.f341b = r0
            L4e:
                r5.n = r4
                r5.o = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r4.f341b
                goto L82
            L55:
                boolean r0 = r5.k()
                if (r0 == 0) goto L7c
                boolean r0 = r5.m()
                if (r0 != 0) goto L7c
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.m
                boolean r0 = r0.f314b
                if (r0 == 0) goto L6a
                goto L7c
            L6a:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                java.lang.StringBuilder r0 = c.a.a.a.a.j(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = c.a.a.a.a.a(r1, r0)
                r5.<init>(r0)
                throw r5
            L7c:
                r5.n = r4
                r5.o = r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r4.f340a
            L82:
                r0.add(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.i(android.view.View):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:168:0x02ff, code lost:
        
            r7 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:256:0x044c, code lost:
        
            if (r7.k() == false) goto L243;
         */
        /* JADX WARN: Code restructure failed: missing block: B:265:0x0480, code lost:
        
            if ((r10 == 0 || r10 + r8 < r19) == false) goto L243;
         */
        /* JADX WARN: Removed duplicated region for block: B:126:0x024b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:228:0x0414  */
        /* JADX WARN: Removed duplicated region for block: B:237:0x053c  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:241:0x055f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:245:0x0543  */
        /* JADX WARN: Removed duplicated region for block: B:251:0x043e  */
        /* JADX WARN: Removed duplicated region for block: B:260:0x0469  */
        /* JADX WARN: Removed duplicated region for block: B:269:0x0493  */
        /* JADX WARN: Removed duplicated region for block: B:272:0x04b0  */
        /* JADX WARN: Removed duplicated region for block: B:275:0x04c3  */
        /* JADX WARN: Removed duplicated region for block: B:282:0x04f3  */
        /* JADX WARN: Removed duplicated region for block: B:297:0x0531  */
        /* JADX WARN: Removed duplicated region for block: B:299:0x0528  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01bc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.a0 j(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 1430
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.j(int, boolean, long):androidx.recyclerview.widget.RecyclerView$a0");
        }

        public void k(a0 a0Var) {
            (a0Var.o ? this.f341b : this.f340a).remove(a0Var);
            a0Var.n = null;
            a0Var.o = false;
            a0Var.d();
        }

        public void l() {
            m mVar = RecyclerView.this.n;
            this.f345f = this.f344e + (mVar != null ? mVar.l : 0);
            for (int size = this.f342c.size() - 1; size >= 0 && this.f342c.size() > this.f345f; size--) {
                f(size);
            }
        }
    }

    public interface t {
        void a(a0 a0Var);
    }

    public class u extends g {
        public u() {
        }

        public void a() {
            int[] iArr = RecyclerView.y0;
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.t || !recyclerView.s) {
                recyclerView.B = true;
                recyclerView.requestLayout();
            } else {
                Runnable runnable = recyclerView.i;
                WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
                recyclerView.postOnAnimation(runnable);
            }
        }
    }

    public static class v extends b.j.a.c {
        public static final Parcelable.Creator<v> CREATOR = new l0();

        /* renamed from: d, reason: collision with root package name */
        public Parcelable f347d;

        public v(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f347d = parcel.readParcelable(classLoader == null ? m.class.getClassLoader() : classLoader);
        }

        public v(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // b.j.a.c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1349b, i);
            parcel.writeParcelable(this.f347d, 0);
        }
    }

    public static abstract class w {

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView f349b;

        /* renamed from: c, reason: collision with root package name */
        public m f350c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f351d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f352e;

        /* renamed from: f, reason: collision with root package name */
        public View f353f;
        public boolean h;

        /* renamed from: a, reason: collision with root package name */
        public int f348a = -1;
        public final m0 g = new m0(0, 0);

        public interface a {
            PointF a(int i);
        }

        public PointF a(int i) {
            Object obj = this.f350c;
            if (obj instanceof a) {
                return ((a) obj).a(i);
            }
            StringBuilder j = c.a.a.a.a.j("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            j.append(a.class.getCanonicalName());
            Log.w("RecyclerView", j.toString());
            return null;
        }

        public void b(int i, int i2) {
            PointF a2;
            RecyclerView recyclerView = this.f349b;
            if (this.f348a == -1 || recyclerView == null) {
                d();
            }
            if (this.f351d && this.f353f == null && this.f350c != null && (a2 = a(this.f348a)) != null) {
                float f2 = a2.x;
                if (f2 != 0.0f || a2.y != 0.0f) {
                    recyclerView.i0((int) Math.signum(f2), (int) Math.signum(a2.y), null);
                }
            }
            this.f351d = false;
            View view = this.f353f;
            if (view != null) {
                Objects.requireNonNull(this.f349b);
                a0 K = RecyclerView.K(view);
                if ((K != null ? K.f() : -1) == this.f348a) {
                    c(this.f353f, recyclerView.h0, this.g);
                    this.g.a(recyclerView);
                    d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f353f = null;
                }
            }
            if (this.f352e) {
                x xVar = recyclerView.h0;
                m0 m0Var = this.g;
                b.r.b.y yVar = (b.r.b.y) this;
                if (yVar.f349b.n.y() == 0) {
                    yVar.d();
                } else {
                    int i3 = yVar.o;
                    int i4 = i3 - i;
                    if (i3 * i4 <= 0) {
                        i4 = 0;
                    }
                    yVar.o = i4;
                    int i5 = yVar.p;
                    int i6 = i5 - i2;
                    if (i5 * i6 <= 0) {
                        i6 = 0;
                    }
                    yVar.p = i6;
                    if (i4 == 0 && i6 == 0) {
                        PointF a3 = yVar.a(yVar.f348a);
                        if (a3 != null) {
                            if (a3.x != 0.0f || a3.y != 0.0f) {
                                float f3 = a3.y;
                                float sqrt = (float) Math.sqrt((f3 * f3) + (r9 * r9));
                                float f4 = a3.x / sqrt;
                                a3.x = f4;
                                float f5 = a3.y / sqrt;
                                a3.y = f5;
                                yVar.k = a3;
                                yVar.o = (int) (f4 * 10000.0f);
                                yVar.p = (int) (f5 * 10000.0f);
                                m0Var.b((int) (yVar.o * 1.2f), (int) (yVar.p * 1.2f), (int) (yVar.g(10000) * 1.2f), yVar.i);
                            }
                        }
                        m0Var.f1660d = yVar.f348a;
                        yVar.d();
                    }
                }
                m0 m0Var2 = this.g;
                boolean z = m0Var2.f1660d >= 0;
                m0Var2.a(recyclerView);
                if (z && this.f352e) {
                    this.f351d = true;
                    recyclerView.e0.a();
                }
            }
        }

        public abstract void c(View view, x xVar, m0 m0Var);

        public final void d() {
            if (this.f352e) {
                this.f352e = false;
                b.r.b.y yVar = (b.r.b.y) this;
                yVar.p = 0;
                yVar.o = 0;
                yVar.k = null;
                this.f349b.h0.f354a = -1;
                this.f353f = null;
                this.f348a = -1;
                this.f351d = false;
                m mVar = this.f350c;
                if (mVar.g == this) {
                    mVar.g = null;
                }
                this.f350c = null;
                this.f349b = null;
            }
        }
    }

    public static class x {

        /* renamed from: a, reason: collision with root package name */
        public int f354a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f355b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f356c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f357d = 1;

        /* renamed from: e, reason: collision with root package name */
        public int f358e = 0;

        /* renamed from: f, reason: collision with root package name */
        public boolean f359f = false;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public int l;
        public long m;
        public int n;

        public void a(int i) {
            if ((this.f357d & i) != 0) {
                return;
            }
            StringBuilder j = c.a.a.a.a.j("Layout state should be one of ");
            j.append(Integer.toBinaryString(i));
            j.append(" but it is ");
            j.append(Integer.toBinaryString(this.f357d));
            throw new IllegalStateException(j.toString());
        }

        public int b() {
            return this.g ? this.f355b - this.f356c : this.f358e;
        }

        public String toString() {
            StringBuilder j = c.a.a.a.a.j("State{mTargetPosition=");
            j.append(this.f354a);
            j.append(", mData=");
            j.append((Object) null);
            j.append(", mItemCount=");
            j.append(this.f358e);
            j.append(", mIsMeasuring=");
            j.append(this.i);
            j.append(", mPreviousLayoutItemCount=");
            j.append(this.f355b);
            j.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            j.append(this.f356c);
            j.append(", mStructureChanged=");
            j.append(this.f359f);
            j.append(", mInPreLayout=");
            j.append(this.g);
            j.append(", mRunSimpleAnimations=");
            j.append(this.j);
            j.append(", mRunPredictiveAnimations=");
            j.append(this.k);
            j.append('}');
            return j.toString();
        }
    }

    public static abstract class y {
    }

    public class z implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public int f360b;

        /* renamed from: c, reason: collision with root package name */
        public int f361c;

        /* renamed from: d, reason: collision with root package name */
        public OverScroller f362d;

        /* renamed from: e, reason: collision with root package name */
        public Interpolator f363e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f364f;
        public boolean g;

        public z() {
            Interpolator interpolator = RecyclerView.A0;
            this.f363e = interpolator;
            this.f364f = false;
            this.g = false;
            this.f362d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public void a() {
            if (this.f364f) {
                this.g = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            recyclerView.postOnAnimation(this);
        }

        public void b(int i, int i2, int i3, Interpolator interpolator) {
            int i4;
            if (i3 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i2);
                boolean z = abs > abs2;
                int sqrt = (int) Math.sqrt(0);
                int sqrt2 = (int) Math.sqrt((i2 * i2) + (i * i));
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                int i5 = width / 2;
                float f2 = width;
                float f3 = i5;
                float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
                if (sqrt > 0) {
                    i4 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
                } else {
                    if (!z) {
                        abs = abs2;
                    }
                    i4 = (int) (((abs / f2) + 1.0f) * 300.0f);
                }
                i3 = Math.min(i4, 2000);
            }
            int i6 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.A0;
            }
            if (this.f363e != interpolator) {
                this.f363e = interpolator;
                this.f362d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f361c = 0;
            this.f360b = 0;
            RecyclerView.this.setScrollState(2);
            this.f362d.startScroll(0, 0, i, i2, i6);
            a();
        }

        public void c() {
            RecyclerView.this.removeCallbacks(this);
            this.f362d.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.n == null) {
                c();
                return;
            }
            this.g = false;
            this.f364f = true;
            recyclerView.n();
            OverScroller overScroller = this.f362d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f360b;
                int i4 = currY - this.f361c;
                this.f360b = currX;
                this.f361c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.u0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.t(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.u0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.m != null) {
                    int[] iArr3 = recyclerView3.u0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.i0(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.u0;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i3 -= i2;
                    i4 -= i;
                    w wVar = recyclerView4.n.g;
                    if (wVar != null && !wVar.f351d && wVar.f352e) {
                        int b2 = recyclerView4.h0.b();
                        if (b2 == 0) {
                            wVar.d();
                        } else {
                            if (wVar.f348a >= b2) {
                                wVar.f348a = b2 - 1;
                            }
                            wVar.b(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.p.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.u0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.u(i2, i, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.u0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.v(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                w wVar2 = recyclerView7.n.g;
                if ((wVar2 != null && wVar2.f351d) || !z) {
                    a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    b.r.b.u uVar = recyclerView8.f0;
                    if (uVar != null) {
                        uVar.a(recyclerView8, i2, i);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = RecyclerView.this;
                        Objects.requireNonNull(recyclerView9);
                        if (i7 < 0) {
                            recyclerView9.x();
                            if (recyclerView9.I.isFinished()) {
                                recyclerView9.I.onAbsorb(-i7);
                            }
                        } else if (i7 > 0) {
                            recyclerView9.y();
                            if (recyclerView9.K.isFinished()) {
                                recyclerView9.K.onAbsorb(i7);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.z();
                            if (recyclerView9.J.isFinished()) {
                                recyclerView9.J.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.w();
                            if (recyclerView9.L.isFinished()) {
                                recyclerView9.L.onAbsorb(currVelocity);
                            }
                        }
                        if (i7 != 0 || currVelocity != 0) {
                            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
                            recyclerView9.postInvalidateOnAnimation();
                        }
                    }
                    int[] iArr7 = RecyclerView.y0;
                    u.a aVar = RecyclerView.this.g0;
                    int[] iArr8 = aVar.f1692c;
                    if (iArr8 != null) {
                        Arrays.fill(iArr8, -1);
                    }
                    aVar.f1693d = 0;
                }
            }
            w wVar3 = RecyclerView.this.n.g;
            if (wVar3 != null && wVar3.f351d) {
                wVar3.b(0, 0);
            }
            this.f364f = false;
            if (!this.g) {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.p0(1);
            } else {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView10 = RecyclerView.this;
                WeakHashMap<View, b.h.j.y> weakHashMap2 = b.h.j.u.f1311a;
                recyclerView10.postOnAnimation(this);
            }
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        z0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        A0 = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, razi.apa.ctf.videoPlayer.R.attr.recyclerViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't wrap try/catch for region: R(10:(1:40)(12:79|(1:81)|42|43|44|(1:46)(1:63)|47|48|49|50|51|52)|43|44|(0)(0)|47|48|49|50|51|52) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x027d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0280, code lost:
    
        r0 = r4.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0294, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0295, code lost:
    
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02b5, code lost:
    
        throw new java.lang.IllegalStateException(r22.getPositionDescription() + ": Error creating LayoutManager " + r2, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0248 A[Catch: ClassCastException -> 0x02b6, IllegalAccessException -> 0x02d5, InstantiationException -> 0x02f4, InvocationTargetException -> 0x0311, ClassNotFoundException -> 0x032e, TryCatch #4 {ClassCastException -> 0x02b6, ClassNotFoundException -> 0x032e, IllegalAccessException -> 0x02d5, InstantiationException -> 0x02f4, InvocationTargetException -> 0x0311, blocks: (B:44:0x0242, B:46:0x0248, B:47:0x0255, B:50:0x0261, B:52:0x0286, B:57:0x0280, B:60:0x0295, B:61:0x02b5, B:63:0x0251), top: B:43:0x0242 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251 A[Catch: ClassCastException -> 0x02b6, IllegalAccessException -> 0x02d5, InstantiationException -> 0x02f4, InvocationTargetException -> 0x0311, ClassNotFoundException -> 0x032e, TryCatch #4 {ClassCastException -> 0x02b6, ClassNotFoundException -> 0x032e, IllegalAccessException -> 0x02d5, InstantiationException -> 0x02f4, InvocationTargetException -> 0x0311, blocks: (B:44:0x0242, B:46:0x0248, B:47:0x0255, B:50:0x0261, B:52:0x0286, B:57:0x0280, B:60:0x0295, B:61:0x02b5, B:63:0x0251), top: B:43:0x0242 }] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecyclerView(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static RecyclerView F(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView F = F(viewGroup.getChildAt(i2));
            if (F != null) {
                return F;
            }
        }
        return null;
    }

    public static a0 K(View view) {
        if (view == null) {
            return null;
        }
        return ((n) view.getLayoutParams()).f334a;
    }

    private b.h.j.g getScrollingChildHelper() {
        if (this.r0 == null) {
            this.r0 = new b.h.j.g(this);
        }
        return this.r0;
    }

    public static void k(a0 a0Var) {
        WeakReference<RecyclerView> weakReference = a0Var.f306b;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                for (View view = (View) obj; view != null; view = null) {
                    if (view == a0Var.f305a) {
                        return;
                    }
                    obj = view.getParent();
                    if (obj instanceof View) {
                        break;
                    }
                }
                a0Var.f306b = null;
                return;
            }
        }
    }

    public String A() {
        StringBuilder j2 = c.a.a.a.a.j(" ");
        j2.append(super.toString());
        j2.append(", adapter:");
        j2.append(this.m);
        j2.append(", layout:");
        j2.append(this.n);
        j2.append(", context:");
        j2.append(getContext());
        return j2.toString();
    }

    public final void B(x xVar) {
        if (getScrollState() != 2) {
            Objects.requireNonNull(xVar);
            return;
        }
        OverScroller overScroller = this.e0.f362d;
        overScroller.getFinalX();
        overScroller.getCurrX();
        Objects.requireNonNull(xVar);
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View C(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C(android.view.View):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r6 == 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$p> r1 = r11.q
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L6e
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$p> r4 = r11.q
            java.lang.Object r4 = r4.get(r3)
            androidx.recyclerview.widget.RecyclerView$p r4 = (androidx.recyclerview.widget.RecyclerView.p) r4
            r5 = r4
            b.r.b.s r5 = (b.r.b.s) r5
            int r6 = r5.v
            r7 = 2
            r8 = 1
            if (r6 != r8) goto L5e
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.f(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.e(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L62
            if (r6 != 0) goto L41
            if (r9 == 0) goto L62
        L41:
            if (r9 == 0) goto L4e
            r5.w = r8
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.p = r6
            goto L5a
        L4e:
            if (r6 == 0) goto L5a
            r5.w = r7
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.m = r6
        L5a:
            r5.h(r7)
            goto L60
        L5e:
            if (r6 != r7) goto L62
        L60:
            r5 = r8
            goto L63
        L62:
            r5 = r2
        L63:
            if (r5 == 0) goto L6b
            r5 = 3
            if (r0 == r5) goto L6b
            r11.r = r4
            return r8
        L6b:
            int r3 = r3 + 1
            goto Lc
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.D(android.view.MotionEvent):boolean");
    }

    public final void E(int[] iArr) {
        int e2 = this.f303f.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < e2; i4++) {
            a0 K = K(this.f303f.d(i4));
            if (!K.u()) {
                int f2 = K.f();
                if (f2 < i2) {
                    i2 = f2;
                }
                if (f2 > i3) {
                    i3 = f2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public a0 G(int i2) {
        a0 a0Var = null;
        if (this.D) {
            return null;
        }
        int h2 = this.f303f.h();
        for (int i3 = 0; i3 < h2; i3++) {
            a0 K = K(this.f303f.g(i3));
            if (K != null && !K.m() && H(K) == i2) {
                if (!this.f303f.k(K.f305a)) {
                    return K;
                }
                a0Var = K;
            }
        }
        return a0Var;
    }

    public int H(a0 a0Var) {
        if (!a0Var.h(524) && a0Var.j()) {
            b.r.b.a aVar = this.f302e;
            int i2 = a0Var.f307c;
            int size = aVar.f1592b.size();
            for (int i3 = 0; i3 < size; i3++) {
                a.b bVar = aVar.f1592b.get(i3);
                int i4 = bVar.f1597a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = bVar.f1598b;
                        if (i5 <= i2) {
                            int i6 = bVar.f1600d;
                            if (i5 + i6 <= i2) {
                                i2 -= i6;
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 == 8) {
                        int i7 = bVar.f1598b;
                        if (i7 == i2) {
                            i2 = bVar.f1600d;
                        } else {
                            if (i7 < i2) {
                                i2--;
                            }
                            if (bVar.f1600d <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (bVar.f1598b <= i2) {
                    i2 += bVar.f1600d;
                }
            }
            return i2;
        }
        return -1;
    }

    public long I(a0 a0Var) {
        return this.m.f314b ? a0Var.f309e : a0Var.f307c;
    }

    public a0 J(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return K(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public Rect L(View view) {
        n nVar = (n) view.getLayoutParams();
        if (!nVar.f336c) {
            return nVar.f335b;
        }
        if (this.h0.g && (nVar.b() || nVar.f334a.k())) {
            return nVar.f335b;
        }
        Rect rect = nVar.f335b;
        rect.set(0, 0, 0, 0);
        int size = this.p.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.j.set(0, 0, 0, 0);
            this.p.get(i2).a(this.j, view, this, this.h0);
            int i3 = rect.left;
            Rect rect2 = this.j;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        nVar.f336c = false;
        return rect;
    }

    public boolean M() {
        return !this.v || this.D || this.f302e.g();
    }

    public void N() {
        this.L = null;
        this.J = null;
        this.K = null;
        this.I = null;
    }

    public void O() {
        if (this.p.size() == 0) {
            return;
        }
        m mVar = this.n;
        if (mVar != null) {
            mVar.d("Cannot invalidate item decorations during a scroll or layout");
        }
        R();
        requestLayout();
    }

    public boolean P() {
        return this.F > 0;
    }

    public void Q(int i2) {
        if (this.n == null) {
            return;
        }
        setScrollState(2);
        this.n.L0(i2);
        awakenScrollBars();
    }

    public void R() {
        int h2 = this.f303f.h();
        for (int i2 = 0; i2 < h2; i2++) {
            ((n) this.f303f.g(i2).getLayoutParams()).f336c = true;
        }
        s sVar = this.f300c;
        int size = sVar.f342c.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = (n) sVar.f342c.get(i3).f305a.getLayoutParams();
            if (nVar != null) {
                nVar.f336c = true;
            }
        }
    }

    public void S(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int h2 = this.f303f.h();
        for (int i5 = 0; i5 < h2; i5++) {
            a0 K = K(this.f303f.g(i5));
            if (K != null && !K.u()) {
                int i6 = K.f307c;
                if (i6 >= i4) {
                    K.q(-i3, z2);
                } else if (i6 >= i2) {
                    K.b(8);
                    K.q(-i3, z2);
                    K.f307c = i2 - 1;
                }
                this.h0.f359f = true;
            }
        }
        s sVar = this.f300c;
        int size = sVar.f342c.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            a0 a0Var = sVar.f342c.get(size);
            if (a0Var != null) {
                int i7 = a0Var.f307c;
                if (i7 >= i4) {
                    a0Var.q(-i3, z2);
                } else if (i7 >= i2) {
                    a0Var.b(8);
                    sVar.f(size);
                }
            }
        }
    }

    public void T() {
    }

    public void U() {
    }

    public void V() {
        this.F++;
    }

    public void W(boolean z2) {
        int i2;
        int i3 = this.F - 1;
        this.F = i3;
        if (i3 < 1) {
            this.F = 0;
            if (z2) {
                int i4 = this.A;
                this.A = 0;
                if (i4 != 0) {
                    AccessibilityManager accessibilityManager = this.C;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        obtain.setContentChangeTypes(i4);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.v0.size() - 1; size >= 0; size--) {
                    a0 a0Var = this.v0.get(size);
                    if (a0Var.f305a.getParent() == this && !a0Var.u() && (i2 = a0Var.q) != -1) {
                        View view = a0Var.f305a;
                        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
                        view.setImportantForAccessibility(i2);
                        a0Var.q = -1;
                    }
                }
                this.v0.clear();
            }
        }
    }

    public final void X(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.O) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.O = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.S = x2;
            this.Q = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.T = y2;
            this.R = y2;
        }
    }

    public void Y() {
    }

    public void Z() {
    }

    public void a0() {
        if (this.n0 || !this.s) {
            return;
        }
        Runnable runnable = this.w0;
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        postOnAnimation(runnable);
        this.n0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        m mVar = this.n;
        if (mVar == null || !mVar.d0()) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public final void b0() {
        boolean z2;
        boolean z3 = false;
        if (this.D) {
            b.r.b.a aVar = this.f302e;
            aVar.l(aVar.f1592b);
            aVar.l(aVar.f1593c);
            aVar.f1596f = 0;
            if (this.E) {
                this.n.o0(this);
            }
        }
        if (this.M != null && this.n.X0()) {
            this.f302e.j();
        } else {
            this.f302e.c();
        }
        boolean z4 = this.k0 || this.l0;
        x xVar = this.h0;
        boolean z5 = this.v && this.M != null && ((z2 = this.D) || z4 || this.n.h) && (!z2 || this.m.f314b);
        xVar.j = z5;
        if (z5 && z4 && !this.D) {
            if (this.M != null && this.n.X0()) {
                z3 = true;
            }
        }
        xVar.k = z3;
    }

    public void c0(boolean z2) {
        this.E = z2 | this.E;
        this.D = true;
        int h2 = this.f303f.h();
        for (int i2 = 0; i2 < h2; i2++) {
            a0 K = K(this.f303f.g(i2));
            if (K != null && !K.u()) {
                K.b(6);
            }
        }
        R();
        s sVar = this.f300c;
        int size = sVar.f342c.size();
        for (int i3 = 0; i3 < size; i3++) {
            a0 a0Var = sVar.f342c.get(i3);
            if (a0Var != null) {
                a0Var.b(6);
                a0Var.a(null);
            }
        }
        e eVar = RecyclerView.this.m;
        if (eVar == null || !eVar.f314b) {
            sVar.e();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof n) && this.n.g((n) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        m mVar = this.n;
        if (mVar != null && mVar.e()) {
            return this.n.k(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        m mVar = this.n;
        if (mVar != null && mVar.e()) {
            return this.n.l(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        m mVar = this.n;
        if (mVar != null && mVar.e()) {
            return this.n.m(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        m mVar = this.n;
        if (mVar != null && mVar.f()) {
            return this.n.n(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        m mVar = this.n;
        if (mVar != null && mVar.f()) {
            return this.n.o(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        m mVar = this.n;
        if (mVar != null && mVar.f()) {
            return this.n.p(this.h0);
        }
        return 0;
    }

    public void d0(a0 a0Var, j.b bVar) {
        a0Var.s(0, 8192);
        if (this.h0.h && a0Var.p() && !a0Var.m() && !a0Var.u()) {
            this.g.f1712b.g(I(a0Var), a0Var);
        }
        this.g.c(a0Var, bVar);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().e(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        float f2;
        float f3;
        super.draw(canvas);
        int size = this.p.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.p.get(i2).c(canvas, this, this.h0);
        }
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.I;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.J;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.K;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                f2 = getPaddingRight() + (-getWidth());
                f3 = getPaddingBottom() + (-getHeight());
            } else {
                f2 = -getWidth();
                f3 = -getHeight();
            }
            canvas.translate(f2, f3);
            EdgeEffect edgeEffect8 = this.L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.M == null || this.p.size() <= 0 || !this.M.g()) ? z2 : true) {
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public void e0() {
        j jVar = this.M;
        if (jVar != null) {
            jVar.f();
        }
        m mVar = this.n;
        if (mVar != null) {
            mVar.D0(this.f300c);
            this.n.E0(this.f300c);
        }
        this.f300c.b();
    }

    public final void f(a0 a0Var) {
        View view = a0Var.f305a;
        boolean z2 = view.getParent() == this;
        this.f300c.k(J(view));
        if (a0Var.o()) {
            this.f303f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        b.r.b.c cVar = this.f303f;
        if (!z2) {
            cVar.a(view, -1, true);
            return;
        }
        int indexOfChild = ((f0) cVar.f1604a).f1616a.indexOfChild(view);
        if (indexOfChild >= 0) {
            cVar.f1605b.h(indexOfChild);
            cVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void f0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof n) {
            n nVar = (n) layoutParams;
            if (!nVar.f336c) {
                Rect rect = nVar.f335b;
                Rect rect2 = this.j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.j);
            offsetRectIntoDescendantCoords(view, this.j);
        }
        this.n.I0(this, view, this.j, !this.v, view2 == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0182, code lost:
    
        if (r6 > 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0185, code lost:
    
        if (r3 < 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0188, code lost:
    
        if (r6 < 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0190, code lost:
    
        if ((r6 * r2) < 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0198, code lost:
    
        if ((r6 * r2) > 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0168, code lost:
    
        if (r3 > 0) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public void g(l lVar) {
        m mVar = this.n;
        if (mVar != null) {
            mVar.d("Cannot add item decoration during a scroll  or layout");
        }
        if (this.p.isEmpty()) {
            setWillNotDraw(false);
        }
        this.p.add(lVar);
        R();
        requestLayout();
    }

    public final void g0() {
        VelocityTracker velocityTracker = this.P;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        p0(0);
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.L.isFinished();
        }
        if (z2) {
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m mVar = this.n;
        if (mVar != null) {
            return mVar.u();
        }
        throw new IllegalStateException(c.a.a.a.a.a(this, c.a.a.a.a.j("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m mVar = this.n;
        if (mVar != null) {
            return mVar.v(getContext(), attributeSet);
        }
        throw new IllegalStateException(c.a.a.a.a.a(this, c.a.a.a.a.j("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m mVar = this.n;
        if (mVar != null) {
            return mVar.w(layoutParams);
        }
        throw new IllegalStateException(c.a.a.a.a.a(this, c.a.a.a.a.j("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public e getAdapter() {
        return this.m;
    }

    @Override // android.view.View
    public int getBaseline() {
        m mVar = this.n;
        if (mVar == null) {
            return super.getBaseline();
        }
        Objects.requireNonNull(mVar);
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        h hVar = this.p0;
        return hVar == null ? super.getChildDrawingOrder(i2, i3) : hVar.a(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.h;
    }

    public o0 getCompatAccessibilityDelegate() {
        return this.o0;
    }

    public i getEdgeEffectFactory() {
        return this.H;
    }

    public j getItemAnimator() {
        return this.M;
    }

    public int getItemDecorationCount() {
        return this.p.size();
    }

    public m getLayoutManager() {
        return this.n;
    }

    public int getMaxFlingVelocity() {
        return this.a0;
    }

    public int getMinFlingVelocity() {
        return this.W;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public o getOnFlingListener() {
        return this.V;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.d0;
    }

    public r getRecycledViewPool() {
        return this.f300c.d();
    }

    public int getScrollState() {
        return this.N;
    }

    public void h(q qVar) {
        if (this.j0 == null) {
            this.j0 = new ArrayList();
        }
        this.j0.add(qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h0(int r18, int r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.h0(int, int, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().h(0);
    }

    public void i(String str) {
        if (P()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(c.a.a.a.a.a(this, c.a.a.a.a.j("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.G > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(c.a.a.a.a.a(this, c.a.a.a.a.j(""))));
        }
    }

    public void i0(int i2, int i3, int[] iArr) {
        a0 a0Var;
        m0();
        V();
        int i4 = b.h.f.b.f1181a;
        Trace.beginSection("RV Scroll");
        B(this.h0);
        int K0 = i2 != 0 ? this.n.K0(i2, this.f300c, this.h0) : 0;
        int M0 = i3 != 0 ? this.n.M0(i3, this.f300c, this.h0) : 0;
        Trace.endSection();
        int e2 = this.f303f.e();
        for (int i5 = 0; i5 < e2; i5++) {
            View d2 = this.f303f.d(i5);
            a0 J = J(d2);
            if (J != null && (a0Var = J.i) != null) {
                View view = a0Var.f305a;
                int left = d2.getLeft();
                int top = d2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        W(true);
        o0(false);
        if (iArr != null) {
            iArr[0] = K0;
            iArr[1] = M0;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.y;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f1274d;
    }

    public final void j() {
        g0();
        setScrollState(0);
    }

    public void j0(int i2) {
        if (this.y) {
            return;
        }
        q0();
        m mVar = this.n;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            mVar.L0(i2);
            awakenScrollBars();
        }
    }

    public boolean k0(a0 a0Var, int i2) {
        if (P()) {
            a0Var.q = i2;
            this.v0.add(a0Var);
            return false;
        }
        View view = a0Var.f305a;
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        view.setImportantForAccessibility(i2);
        return true;
    }

    public void l() {
        int h2 = this.f303f.h();
        for (int i2 = 0; i2 < h2; i2++) {
            a0 K = K(this.f303f.g(i2));
            if (!K.u()) {
                K.c();
            }
        }
        s sVar = this.f300c;
        int size = sVar.f342c.size();
        for (int i3 = 0; i3 < size; i3++) {
            sVar.f342c.get(i3).c();
        }
        int size2 = sVar.f340a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            sVar.f340a.get(i4).c();
        }
        ArrayList<a0> arrayList = sVar.f341b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                sVar.f341b.get(i5).c();
            }
        }
    }

    public void l0(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        m mVar = this.n;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.y) {
            return;
        }
        if (!mVar.e()) {
            i2 = 0;
        }
        if (!this.n.f()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (!(i4 == Integer.MIN_VALUE || i4 > 0)) {
            scrollBy(i2, i3);
            return;
        }
        if (z2) {
            int i5 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i5 |= 2;
            }
            n0(i5, 1);
        }
        this.e0.b(i2, i3, i4, interpolator);
    }

    public void m(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.I.onRelease();
            z2 = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.K.onRelease();
            z2 |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.J.onRelease();
            z2 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.L.onRelease();
            z2 |= this.L.isFinished();
        }
        if (z2) {
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            postInvalidateOnAnimation();
        }
    }

    public void m0() {
        int i2 = this.w + 1;
        this.w = i2;
        if (i2 != 1 || this.y) {
            return;
        }
        this.x = false;
    }

    public void n() {
        if (!this.v || this.D) {
            int i2 = b.h.f.b.f1181a;
            Trace.beginSection("RV FullInvalidate");
            q();
            Trace.endSection();
            return;
        }
        if (this.f302e.g()) {
            b.r.b.a aVar = this.f302e;
            int i3 = aVar.f1596f;
            boolean z2 = false;
            if ((i3 & 4) != 0) {
                if (!((i3 & 11) != 0)) {
                    int i4 = b.h.f.b.f1181a;
                    Trace.beginSection("RV PartialInvalidate");
                    m0();
                    V();
                    this.f302e.j();
                    if (!this.x) {
                        int e2 = this.f303f.e();
                        int i5 = 0;
                        while (true) {
                            if (i5 < e2) {
                                a0 K = K(this.f303f.d(i5));
                                if (K != null && !K.u() && K.p()) {
                                    z2 = true;
                                    break;
                                }
                                i5++;
                            } else {
                                break;
                            }
                        }
                        if (z2) {
                            q();
                        } else {
                            this.f302e.b();
                        }
                    }
                    o0(true);
                    W(true);
                    Trace.endSection();
                }
            }
            if (aVar.g()) {
                int i6 = b.h.f.b.f1181a;
                Trace.beginSection("RV FullInvalidate");
                q();
                Trace.endSection();
            }
        }
    }

    public boolean n0(int i2, int i3) {
        return getScrollingChildHelper().i(i2, i3);
    }

    public void o(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        setMeasuredDimension(m.h(i2, paddingRight, getMinimumWidth()), m.h(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void o0(boolean z2) {
        if (this.w < 1) {
            this.w = 1;
        }
        if (!z2 && !this.y) {
            this.x = false;
        }
        if (this.w == 1) {
            if (z2 && this.x && !this.y && this.n != null && this.m != null) {
                q();
            }
            if (!this.y) {
                this.x = false;
            }
        }
        this.w--;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = 0;
        this.s = true;
        this.v = this.v && !isLayoutRequested();
        m mVar = this.n;
        if (mVar != null) {
            mVar.i = true;
            mVar.e0();
        }
        this.n0 = false;
        ThreadLocal<b.r.b.u> threadLocal = b.r.b.u.f1685f;
        b.r.b.u uVar = threadLocal.get();
        this.f0 = uVar;
        if (uVar == null) {
            this.f0 = new b.r.b.u();
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            Display display = getDisplay();
            float f2 = 60.0f;
            if (!isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f2 = refreshRate;
                }
            }
            b.r.b.u uVar2 = this.f0;
            uVar2.f1688d = (long) (1.0E9f / f2);
            threadLocal.set(uVar2);
        }
        this.f0.f1686b.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.M;
        if (jVar != null) {
            jVar.f();
        }
        q0();
        this.s = false;
        m mVar = this.n;
        if (mVar != null) {
            s sVar = this.f300c;
            mVar.i = false;
            mVar.g0(this, sVar);
        }
        this.v0.clear();
        removeCallbacks(this.w0);
        Objects.requireNonNull(this.g);
        while (w0.f1707d.a() != null) {
        }
        b.r.b.u uVar = this.f0;
        if (uVar != null) {
            uVar.f1686b.remove(this);
            this.f0 = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.p.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.p.get(i2).b(canvas, this, this.h0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = r5.n
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.y
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$m r0 = r5.n
            boolean r0 = r0.f()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$m r3 = r5.n
            boolean r3 = r3.e()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$m r3 = r5.n
            boolean r3 = r3.f()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$m r3 = r5.n
            boolean r3 = r3.e()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.b0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.c0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.h0(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.y) {
            return false;
        }
        this.r = null;
        if (D(motionEvent)) {
            j();
            return true;
        }
        m mVar = this.n;
        if (mVar == null) {
            return false;
        }
        boolean e2 = mVar.e();
        boolean f2 = this.n.f();
        if (this.P == null) {
            this.P = VelocityTracker.obtain();
        }
        this.P.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.z) {
                this.z = false;
            }
            this.O = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.S = x2;
            this.Q = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.T = y2;
            this.R = y2;
            if (this.N == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                p0(1);
            }
            int[] iArr = this.t0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = e2;
            if (f2) {
                i2 = (e2 ? 1 : 0) | 2;
            }
            n0(i2, 0);
        } else if (actionMasked == 1) {
            this.P.clear();
            p0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.O);
            if (findPointerIndex < 0) {
                StringBuilder j2 = c.a.a.a.a.j("Error processing scroll; pointer index for id ");
                j2.append(this.O);
                j2.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", j2.toString());
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.N != 1) {
                int i3 = x3 - this.Q;
                int i4 = y3 - this.R;
                if (e2 == 0 || Math.abs(i3) <= this.U) {
                    z2 = false;
                } else {
                    this.S = x3;
                    z2 = true;
                }
                if (f2 && Math.abs(i4) > this.U) {
                    this.T = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            j();
        } else if (actionMasked == 5) {
            this.O = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.S = x4;
            this.Q = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.T = y4;
            this.R = y4;
        } else if (actionMasked == 6) {
            X(motionEvent);
        }
        return this.N == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = b.h.f.b.f1181a;
        Trace.beginSection("RV OnLayout");
        q();
        Trace.endSection();
        this.v = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        m mVar = this.n;
        if (mVar == null) {
            o(i2, i3);
            return;
        }
        boolean z2 = false;
        if (mVar.V()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.n.v0(i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (z2 || this.m == null) {
                return;
            }
            if (this.h0.f357d == 1) {
                r();
            }
            this.n.O0(i2, i3);
            this.h0.i = true;
            s();
            this.n.Q0(i2, i3);
            if (this.n.T0()) {
                this.n.O0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.h0.i = true;
                s();
                this.n.Q0(i2, i3);
                return;
            }
            return;
        }
        if (this.t) {
            this.n.v0(i2, i3);
            return;
        }
        if (this.B) {
            m0();
            V();
            b0();
            W(true);
            x xVar = this.h0;
            if (xVar.k) {
                xVar.g = true;
            } else {
                this.f302e.c();
                this.h0.g = false;
            }
            this.B = false;
            o0(false);
        } else if (this.h0.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        e eVar = this.m;
        if (eVar != null) {
            this.h0.f358e = eVar.a();
        } else {
            this.h0.f358e = 0;
        }
        m0();
        this.n.v0(i2, i3);
        o0(false);
        this.h0.g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof v)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v vVar = (v) parcelable;
        this.f301d = vVar;
        super.onRestoreInstanceState(vVar.f1349b);
        m mVar = this.n;
        if (mVar == null || (parcelable2 = this.f301d.f347d) == null) {
            return;
        }
        mVar.y0(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        v vVar = new v(super.onSaveInstanceState());
        v vVar2 = this.f301d;
        if (vVar2 != null) {
            vVar.f347d = vVar2.f347d;
        } else {
            m mVar = this.n;
            vVar.f347d = mVar != null ? mVar.z0() : null;
        }
        return vVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        N();
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0394, code lost:
    
        if (r1 != false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x033b, code lost:
    
        if (((r9 == null || r8.f1713a.getAdapter() == null || ((java.lang.Math.abs(r2) <= (r12 = r8.f1713a.getMinFlingVelocity()) && java.lang.Math.abs(r1) <= r12) || !r8.j(r9, r1, r2))) ? false : true) != false) goto L195;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0212  */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(View view) {
        a0 K = K(view);
        U();
        e eVar = this.m;
        if (eVar == null || K == null) {
            return;
        }
        Objects.requireNonNull(eVar);
    }

    public void p0(int i2) {
        getScrollingChildHelper().j(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x02f6, code lost:
    
        if (r15.f303f.k(getFocusedChild()) == false) goto L205;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q() {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q():void");
    }

    public void q0() {
        w wVar;
        setScrollState(0);
        this.e0.c();
        m mVar = this.n;
        if (mVar == null || (wVar = mVar.g) == null) {
            return;
        }
        wVar.d();
    }

    public final void r() {
        int id;
        View C;
        this.h0.a(1);
        B(this.h0);
        this.h0.i = false;
        m0();
        x0 x0Var = this.g;
        x0Var.f1711a.clear();
        x0Var.f1712b.b();
        V();
        b0();
        View focusedChild = (this.d0 && hasFocus() && this.m != null) ? getFocusedChild() : null;
        a0 J = (focusedChild == null || (C = C(focusedChild)) == null) ? null : J(C);
        if (J == null) {
            x xVar = this.h0;
            xVar.m = -1L;
            xVar.l = -1;
            xVar.n = -1;
        } else {
            x xVar2 = this.h0;
            xVar2.m = this.m.f314b ? J.f309e : -1L;
            xVar2.l = this.D ? -1 : J.m() ? J.f308d : J.e();
            x xVar3 = this.h0;
            View view = J.f305a;
            loop3: while (true) {
                id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() != -1) {
                        break;
                    }
                }
            }
            xVar3.n = id;
        }
        x xVar4 = this.h0;
        xVar4.h = xVar4.j && this.l0;
        this.l0 = false;
        this.k0 = false;
        xVar4.g = xVar4.k;
        xVar4.f358e = this.m.a();
        E(this.q0);
        if (this.h0.j) {
            int e2 = this.f303f.e();
            for (int i2 = 0; i2 < e2; i2++) {
                a0 K = K(this.f303f.d(i2));
                if (!K.u() && (!K.k() || this.m.f314b)) {
                    j jVar = this.M;
                    j.b(K);
                    K.g();
                    this.g.c(K, jVar.h(K));
                    if (this.h0.h && K.p() && !K.m() && !K.u() && !K.k()) {
                        this.g.f1712b.g(I(K), K);
                    }
                }
            }
        }
        if (this.h0.k) {
            int h2 = this.f303f.h();
            for (int i3 = 0; i3 < h2; i3++) {
                a0 K2 = K(this.f303f.g(i3));
                if (!K2.u() && K2.f308d == -1) {
                    K2.f308d = K2.f307c;
                }
            }
            x xVar5 = this.h0;
            boolean z2 = xVar5.f359f;
            xVar5.f359f = false;
            this.n.t0(this.f300c, xVar5);
            this.h0.f359f = z2;
            for (int i4 = 0; i4 < this.f303f.e(); i4++) {
                a0 K3 = K(this.f303f.d(i4));
                if (!K3.u()) {
                    w0 orDefault = this.g.f1711a.getOrDefault(K3, null);
                    if (!((orDefault == null || (orDefault.f1708a & 4) == 0) ? false : true)) {
                        j.b(K3);
                        boolean h3 = K3.h(8192);
                        j jVar2 = this.M;
                        K3.g();
                        j.b h4 = jVar2.h(K3);
                        if (h3) {
                            d0(K3, h4);
                        } else {
                            x0 x0Var2 = this.g;
                            w0 orDefault2 = x0Var2.f1711a.getOrDefault(K3, null);
                            if (orDefault2 == null) {
                                orDefault2 = w0.a();
                                x0Var2.f1711a.put(K3, orDefault2);
                            }
                            orDefault2.f1708a |= 2;
                            orDefault2.f1709b = h4;
                        }
                    }
                }
            }
        }
        l();
        W(true);
        o0(false);
        this.h0.f357d = 2;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        a0 K = K(view);
        if (K != null) {
            if (K.o()) {
                K.j &= -257;
            } else if (!K.u()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(K);
                throw new IllegalArgumentException(c.a.a.a.a.a(this, sb));
            }
        }
        view.clearAnimation();
        p(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.n.x0(this, view, view2) && view2 != null) {
            f0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.n.I0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.q.size();
        for (int i2 = 0; i2 < size; i2++) {
            Objects.requireNonNull((b.r.b.s) this.q.get(i2));
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.w != 0 || this.y) {
            this.x = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        m0();
        V();
        this.h0.a(6);
        this.f302e.c();
        this.h0.f358e = this.m.a();
        x xVar = this.h0;
        xVar.f356c = 0;
        xVar.g = false;
        this.n.t0(this.f300c, xVar);
        x xVar2 = this.h0;
        xVar2.f359f = false;
        this.f301d = null;
        xVar2.j = xVar2.j && this.M != null;
        xVar2.f357d = 4;
        W(true);
        o0(false);
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        m mVar = this.n;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.y) {
            return;
        }
        boolean e2 = mVar.e();
        boolean f2 = this.n.f();
        if (e2 || f2) {
            if (!e2) {
                i2 = 0;
            }
            if (!f2) {
                i3 = 0;
            }
            h0(i2, i3, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (P()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.A |= contentChangeTypes != 0 ? contentChangeTypes : 0;
            r1 = 1;
        }
        if (r1 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(o0 o0Var) {
        this.o0 = o0Var;
        b.h.j.u.i(this, o0Var);
    }

    public void setAdapter(e eVar) {
        setLayoutFrozen(false);
        e eVar2 = this.m;
        if (eVar2 != null) {
            eVar2.f313a.unregisterObserver(this.f299b);
            Objects.requireNonNull(this.m);
        }
        e0();
        b.r.b.a aVar = this.f302e;
        aVar.l(aVar.f1592b);
        aVar.l(aVar.f1593c);
        aVar.f1596f = 0;
        e eVar3 = this.m;
        this.m = eVar;
        if (eVar != null) {
            eVar.f313a.registerObserver(this.f299b);
        }
        m mVar = this.n;
        if (mVar != null) {
            mVar.c0();
        }
        s sVar = this.f300c;
        e eVar4 = this.m;
        sVar.b();
        r d2 = sVar.d();
        Objects.requireNonNull(d2);
        if (eVar3 != null) {
            d2.f339b--;
        }
        if (d2.f339b == 0) {
            for (int i2 = 0; i2 < d2.f338a.size(); i2++) {
                d2.f338a.valueAt(i2).f1642a.clear();
            }
        }
        if (eVar4 != null) {
            d2.f339b++;
        }
        this.h0.f359f = true;
        c0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(h hVar) {
        if (hVar == this.p0) {
            return;
        }
        this.p0 = hVar;
        setChildrenDrawingOrderEnabled(hVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.h) {
            N();
        }
        this.h = z2;
        super.setClipToPadding(z2);
        if (this.v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(i iVar) {
        Objects.requireNonNull(iVar);
        this.H = iVar;
        N();
    }

    public void setHasFixedSize(boolean z2) {
        this.t = z2;
    }

    public void setItemAnimator(j jVar) {
        j jVar2 = this.M;
        if (jVar2 != null) {
            jVar2.f();
            this.M.f315a = null;
        }
        this.M = jVar;
        if (jVar != null) {
            jVar.f315a = this.m0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        s sVar = this.f300c;
        sVar.f344e = i2;
        sVar.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(m mVar) {
        if (mVar == this.n) {
            return;
        }
        q0();
        if (this.n != null) {
            j jVar = this.M;
            if (jVar != null) {
                jVar.f();
            }
            this.n.D0(this.f300c);
            this.n.E0(this.f300c);
            this.f300c.b();
            if (this.s) {
                m mVar2 = this.n;
                s sVar = this.f300c;
                mVar2.i = false;
                mVar2.g0(this, sVar);
            }
            this.n.R0(null);
            this.n = null;
        } else {
            this.f300c.b();
        }
        b.r.b.c cVar = this.f303f;
        b.r.b.b bVar = cVar.f1605b;
        bVar.f1601a = 0L;
        b.r.b.b bVar2 = bVar.f1602b;
        if (bVar2 != null) {
            bVar2.g();
        }
        int size = cVar.f1606c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            c.a aVar = cVar.f1604a;
            View view = cVar.f1606c.get(size);
            f0 f0Var = (f0) aVar;
            Objects.requireNonNull(f0Var);
            a0 K = K(view);
            if (K != null) {
                f0Var.f1616a.k0(K, K.p);
                K.p = 0;
            }
            cVar.f1606c.remove(size);
        }
        f0 f0Var2 = (f0) cVar.f1604a;
        int b2 = f0Var2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            View a2 = f0Var2.a(i2);
            f0Var2.f1616a.p(a2);
            a2.clearAnimation();
        }
        f0Var2.f1616a.removeAllViews();
        this.n = mVar;
        if (mVar != null) {
            if (mVar.f325b != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(mVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(c.a.a.a.a.a(mVar.f325b, sb));
            }
            mVar.R0(this);
            if (this.s) {
                m mVar3 = this.n;
                mVar3.i = true;
                mVar3.e0();
            }
        }
        this.f300c.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        b.h.j.g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f1274d) {
            View view = scrollingChildHelper.f1273c;
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            view.stopNestedScroll();
        }
        scrollingChildHelper.f1274d = z2;
    }

    public void setOnFlingListener(o oVar) {
        this.V = oVar;
    }

    @Deprecated
    public void setOnScrollListener(q qVar) {
        this.i0 = qVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.d0 = z2;
    }

    public void setRecycledViewPool(r rVar) {
        s sVar = this.f300c;
        if (sVar.g != null) {
            r1.f339b--;
        }
        sVar.g = rVar;
        if (rVar == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        sVar.g.f339b++;
    }

    public void setRecyclerListener(t tVar) {
        this.o = tVar;
    }

    public void setScrollState(int i2) {
        w wVar;
        if (i2 == this.N) {
            return;
        }
        this.N = i2;
        if (i2 != 2) {
            this.e0.c();
            m mVar = this.n;
            if (mVar != null && (wVar = mVar.g) != null) {
                wVar.d();
            }
        }
        m mVar2 = this.n;
        if (mVar2 != null) {
            mVar2.A0(i2);
        }
        Y();
        q qVar = this.i0;
        if (qVar != null) {
            qVar.a(this, i2);
        }
        List<q> list = this.j0;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                this.j0.get(size).a(this, i2);
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.U = scaledTouchSlop;
            } else {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            }
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.U = scaledTouchSlop;
    }

    public void setViewCacheExtension(y yVar) {
        Objects.requireNonNull(this.f300c);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().i(i2, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().j(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.y) {
            i("Do not suppressLayout in layout or scroll");
            if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.y = true;
                this.z = true;
                q0();
                return;
            }
            this.y = false;
            if (this.x && this.n != null && this.m != null) {
                requestLayout();
            }
            this.x = false;
        }
    }

    public boolean t(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, null, i4);
    }

    public final void u(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().f(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void v(int i2, int i3) {
        this.G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        Z();
        q qVar = this.i0;
        if (qVar != null) {
            qVar.b(this, i2, i3);
        }
        List<q> list = this.j0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.j0.get(size).b(this, i2, i3);
            }
        }
        this.G--;
    }

    public void w() {
        int measuredWidth;
        int measuredHeight;
        if (this.L != null) {
            return;
        }
        EdgeEffect a2 = this.H.a(this);
        this.L = a2;
        if (this.h) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        a2.setSize(measuredWidth, measuredHeight);
    }

    public void x() {
        int measuredHeight;
        int measuredWidth;
        if (this.I != null) {
            return;
        }
        EdgeEffect a2 = this.H.a(this);
        this.I = a2;
        if (this.h) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        a2.setSize(measuredHeight, measuredWidth);
    }

    public void y() {
        int measuredHeight;
        int measuredWidth;
        if (this.K != null) {
            return;
        }
        EdgeEffect a2 = this.H.a(this);
        this.K = a2;
        if (this.h) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        a2.setSize(measuredHeight, measuredWidth);
    }

    public void z() {
        int measuredWidth;
        int measuredHeight;
        if (this.J != null) {
            return;
        }
        EdgeEffect a2 = this.H.a(this);
        this.J = a2;
        if (this.h) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        a2.setSize(measuredWidth, measuredHeight);
    }
}
