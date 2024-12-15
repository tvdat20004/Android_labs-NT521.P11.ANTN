package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import b.b.c.l;
import b.l.b.c0;
import b.l.b.d0;
import b.l.b.f;
import b.l.b.f1;
import b.l.b.h0;
import b.l.b.z;
import b.n.e;
import b.n.h;
import b.n.j;
import b.n.m;
import b.n.r;
import b.n.s;
import b.s.a;
import b.s.b;
import b.s.c;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, h, s, c {
    public static final Object S = new Object();
    public boolean A;
    public boolean C;
    public ViewGroup D;
    public View E;
    public boolean F;
    public f H;
    public boolean I;
    public boolean J;
    public float K;
    public LayoutInflater L;
    public boolean M;
    public j O;
    public f1 P;
    public b R;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f223c;

    /* renamed from: d, reason: collision with root package name */
    public SparseArray<Parcelable> f224d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f226f;
    public Fragment g;
    public int i;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public z r;
    public b.l.b.h<?> s;
    public Fragment u;
    public int v;
    public int w;
    public String x;
    public boolean y;
    public boolean z;

    /* renamed from: b, reason: collision with root package name */
    public int f222b = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f225e = UUID.randomUUID().toString();
    public String h = null;
    public Boolean j = null;
    public z t = new d0();
    public boolean B = true;
    public boolean G = true;
    public e.b N = e.b.RESUMED;
    public m<h> Q = new m<>();

    public Fragment() {
        y();
    }

    public final boolean A() {
        return this.q > 0;
    }

    public final boolean B() {
        Fragment fragment = this.u;
        return fragment != null && (fragment.l || fragment.B());
    }

    public void C(Bundle bundle) {
        this.C = true;
    }

    public void D() {
    }

    @Deprecated
    public void E() {
        this.C = true;
    }

    public void F(Context context) {
        this.C = true;
        b.l.b.h<?> hVar = this.s;
        if ((hVar == null ? null : hVar.f1410b) != null) {
            this.C = false;
            E();
        }
    }

    public void G() {
    }

    public boolean H() {
        return false;
    }

    public void I(Bundle bundle) {
        Parcelable parcelable;
        this.C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.t.a0(parcelable);
            this.t.l();
        }
        z zVar = this.t;
        if (zVar.n >= 1) {
            return;
        }
        zVar.l();
    }

    public Animation J() {
        return null;
    }

    public Animator K() {
        return null;
    }

    public View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void M() {
        this.C = true;
    }

    public void N() {
        this.C = true;
    }

    public LayoutInflater O(Bundle bundle) {
        return n();
    }

    public void P() {
    }

    @Deprecated
    public void Q() {
        this.C = true;
    }

    public void R(AttributeSet attributeSet, Bundle bundle) {
        this.C = true;
        b.l.b.h<?> hVar = this.s;
        if ((hVar == null ? null : hVar.f1410b) != null) {
            this.C = false;
            Q();
        }
    }

    public void S() {
    }

    public void T() {
    }

    public void U() {
    }

    public void V(int i, String[] strArr, int[] iArr) {
    }

    public void W(Bundle bundle) {
    }

    public void X() {
        this.C = true;
    }

    public void Y() {
        this.C = true;
    }

    public void Z(View view, Bundle bundle) {
    }

    public void a0() {
        this.C = true;
    }

    @Override // b.s.c
    public final a b() {
        return this.R.f1724b;
    }

    public void b0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.t.U();
        this.p = true;
        this.P = new f1();
        View L = L(layoutInflater, viewGroup, bundle);
        this.E = L;
        if (L == null) {
            if (this.P.f1409b != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.P = null;
        } else {
            f1 f1Var = this.P;
            if (f1Var.f1409b == null) {
                f1Var.f1409b = new j(f1Var);
            }
            this.Q.c(this.P);
        }
    }

    public final f c() {
        if (this.H == null) {
            this.H = new f();
        }
        return this.H;
    }

    public LayoutInflater c0(Bundle bundle) {
        LayoutInflater O = O(bundle);
        this.L = O;
        return O;
    }

    public final l d() {
        b.l.b.h<?> hVar = this.s;
        if (hVar == null) {
            return null;
        }
        return (l) hVar.f1410b;
    }

    public final l d0() {
        l d2 = d();
        if (d2 != null) {
            return d2;
        }
        throw new IllegalStateException(c.a.a.a.a.f("Fragment ", this, " not attached to an activity."));
    }

    @Override // b.n.s
    public r e() {
        z zVar = this.r;
        if (zVar == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        h0 h0Var = zVar.C;
        r rVar = h0Var.f1417d.get(this.f225e);
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r();
        h0Var.f1417d.put(this.f225e, rVar2);
        return rVar2;
    }

    public final Context e0() {
        Context i = i();
        if (i != null) {
            return i;
        }
        throw new IllegalStateException(c.a.a.a.a.f("Fragment ", this, " not attached to a context."));
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public View f() {
        f fVar = this.H;
        if (fVar == null) {
            return null;
        }
        return fVar.f1398a;
    }

    public final View f0() {
        View view = this.E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(c.a.a.a.a.f("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    @Override // b.n.h
    public e g() {
        return this.O;
    }

    public void g0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.t.a0(parcelable);
        this.t.l();
    }

    public final z h() {
        if (this.s != null) {
            return this.t;
        }
        throw new IllegalStateException(c.a.a.a.a.f("Fragment ", this, " has not been attached yet."));
    }

    public void h0(View view) {
        c().f1398a = view;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public Context i() {
        b.l.b.h<?> hVar = this.s;
        if (hVar == null) {
            return null;
        }
        return hVar.f1411c;
    }

    public void i0(Animator animator) {
        c().f1399b = animator;
    }

    public Object j() {
        f fVar = this.H;
        if (fVar == null) {
            return null;
        }
        Objects.requireNonNull(fVar);
        return null;
    }

    public void j0(Bundle bundle) {
        z zVar = this.r;
        if (zVar != null) {
            if (zVar == null ? false : zVar.P()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f226f = bundle;
    }

    public void k() {
        f fVar = this.H;
        if (fVar == null) {
            return;
        }
        Objects.requireNonNull(fVar);
    }

    public void k0(boolean z) {
        c().j = z;
    }

    public Object l() {
        f fVar = this.H;
        if (fVar == null) {
            return null;
        }
        Objects.requireNonNull(fVar);
        return null;
    }

    public void l0(int i) {
        if (this.H == null && i == 0) {
            return;
        }
        c().f1401d = i;
    }

    public void m() {
        f fVar = this.H;
        if (fVar == null) {
            return;
        }
        Objects.requireNonNull(fVar);
    }

    public void m0(c0 c0Var) {
        c();
        c0 c0Var2 = this.H.i;
        if (c0Var == c0Var2) {
            return;
        }
        if (c0Var == null || c0Var2 == null) {
            if (c0Var != null) {
                c0Var.f1389c++;
            }
        } else {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    @Deprecated
    public LayoutInflater n() {
        b.l.b.h<?> hVar = this.s;
        if (hVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater cloneInContext = hVar.f1414f.getLayoutInflater().cloneInContext(hVar.f1414f);
        cloneInContext.setFactory2(this.t.f1517f);
        return cloneInContext;
    }

    public void n0(int i) {
        c().f1400c = i;
    }

    public int o() {
        f fVar = this.H;
        if (fVar == null) {
            return 0;
        }
        return fVar.f1401d;
    }

    public void o0(Fragment fragment, int i) {
        z zVar = this.r;
        z zVar2 = fragment != null ? fragment.r : null;
        if (zVar != null && zVar2 != null && zVar != zVar2) {
            throw new IllegalArgumentException(c.a.a.a.a.f("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.x()) {
            if (fragment2 == this) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.h = null;
        } else {
            if (this.r == null || fragment.r == null) {
                this.h = null;
                this.g = fragment;
                this.i = i;
            }
            this.h = fragment.f225e;
        }
        this.g = null;
        this.i = i;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        d0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.C = true;
    }

    public final z p() {
        z zVar = this.r;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException(c.a.a.a.a.f("Fragment ", this, " not associated with a fragment manager."));
    }

    public void p0(@SuppressLint({"UnknownNullness"}) Intent intent) {
        b.l.b.h<?> hVar = this.s;
        if (hVar == null) {
            throw new IllegalStateException(c.a.a.a.a.f("Fragment ", this, " not attached to Activity"));
        }
        l lVar = hVar.f1414f;
        lVar.m = true;
        try {
            Object obj = b.h.b.b.f1117a;
            lVar.startActivityForResult(intent, -1, null);
        } finally {
            lVar.m = false;
        }
    }

    public Object q() {
        f fVar = this.H;
        if (fVar == null) {
            return null;
        }
        Object obj = fVar.g;
        if (obj != S) {
            return obj;
        }
        l();
        return null;
    }

    public final Resources r() {
        return e0().getResources();
    }

    public Object s() {
        f fVar = this.H;
        if (fVar == null) {
            return null;
        }
        Object obj = fVar.f1403f;
        if (obj != S) {
            return obj;
        }
        j();
        return null;
    }

    public Object t() {
        f fVar = this.H;
        if (fVar == null) {
            return null;
        }
        Objects.requireNonNull(fVar);
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f225e);
        sb.append(")");
        if (this.v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.v));
        }
        if (this.x != null) {
            sb.append(" ");
            sb.append(this.x);
        }
        sb.append('}');
        return sb.toString();
    }

    public Object u() {
        f fVar = this.H;
        if (fVar == null) {
            return null;
        }
        Object obj = fVar.h;
        if (obj != S) {
            return obj;
        }
        t();
        return null;
    }

    public int v() {
        f fVar = this.H;
        if (fVar == null) {
            return 0;
        }
        return fVar.f1400c;
    }

    public final String w(int i) {
        return r().getString(i);
    }

    public final Fragment x() {
        String str;
        Fragment fragment = this.g;
        if (fragment != null) {
            return fragment;
        }
        z zVar = this.r;
        if (zVar == null || (str = this.h) == null) {
            return null;
        }
        return zVar.F(str);
    }

    public final void y() {
        this.O = new j(this);
        this.R = new b(this);
        this.O.a(new b.n.f() { // from class: androidx.fragment.app.Fragment.2
            @Override // b.n.f
            public void d(h hVar, e.a aVar) {
                View view;
                if (aVar != e.a.ON_STOP || (view = Fragment.this.E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
    }

    public boolean z() {
        f fVar = this.H;
        if (fVar == null) {
            return false;
        }
        return fVar.j;
    }
}
