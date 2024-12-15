package b.l.b;

import android.animation.Animator;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable;
import androidx.fragment.app.Fragment;
import b.n.e;
import b.o.a.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import razi.apa.ctf.videoPlayer.R;
import razi.apa.ctf.videoPlayer.ui.AppSettingsActivity;

/* loaded from: classes.dex */
public abstract class z {
    public ArrayList<Fragment> A;
    public ArrayList<c0> B;
    public h0 C;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1513b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<b.l.b.a> f1515d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<Fragment> f1516e;
    public OnBackPressedDispatcher g;
    public ArrayList<a> j;
    public h<?> o;
    public o p;
    public Fragment q;
    public Fragment r;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public ArrayList<b.l.b.a> y;
    public ArrayList<Boolean> z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<a0> f1512a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final l0 f1514c = new l0();

    /* renamed from: f, reason: collision with root package name */
    public final r f1517f = new r(this);
    public final u h = new u(this, false);
    public final AtomicInteger i = new AtomicInteger();
    public ConcurrentHashMap<Fragment, HashSet<b.h.f.a>> k = new ConcurrentHashMap<>();
    public final v l = new v(this);
    public final t m = new t(this);
    public int n = -1;
    public w s = new w(this);
    public Runnable D = new x(this);

    public interface a {
    }

    public static boolean M(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public final void A(boolean z) {
        if (this.f1513b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.o == null) {
            if (!this.w) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.o.f1412d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && P()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.y == null) {
            this.y = new ArrayList<>();
            this.z = new ArrayList<>();
        }
        this.f1513b = true;
        try {
            E(null, null);
        } finally {
            this.f1513b = false;
        }
    }

    public boolean B(boolean z) {
        boolean z2;
        A(z);
        boolean z3 = false;
        while (true) {
            ArrayList<b.l.b.a> arrayList = this.y;
            ArrayList<Boolean> arrayList2 = this.z;
            synchronized (this.f1512a) {
                if (this.f1512a.isEmpty()) {
                    z2 = false;
                } else {
                    int size = this.f1512a.size();
                    z2 = false;
                    for (int i = 0; i < size; i++) {
                        z2 |= this.f1512a.get(i).a(arrayList, arrayList2);
                    }
                    this.f1512a.clear();
                    this.o.f1412d.removeCallbacks(this.D);
                }
            }
            if (!z2) {
                j0();
                w();
                this.f1514c.b();
                return z3;
            }
            this.f1513b = true;
            try {
                Y(this.y, this.z);
                f();
                z3 = true;
            } catch (Throwable th) {
                f();
                throw th;
            }
        }
    }

    public void C(a0 a0Var, boolean z) {
        if (z && (this.o == null || this.w)) {
            return;
        }
        A(z);
        ((b.l.b.a) a0Var).a(this.y, this.z);
        this.f1513b = true;
        try {
            Y(this.y, this.z);
            f();
            j0();
            w();
            this.f1514c.b();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public final void D(ArrayList<b.l.b.a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        ArrayList<Boolean> arrayList3 = arrayList2;
        boolean z2 = arrayList.get(i).p;
        ArrayList<Fragment> arrayList4 = this.A;
        if (arrayList4 == null) {
            this.A = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.A.addAll(this.f1514c.g());
        Fragment fragment = this.r;
        int i9 = i;
        int i10 = 0;
        while (true) {
            int i11 = 1;
            if (i9 >= i2) {
                this.A.clear();
                if (!z2) {
                    u0.o(this, arrayList, arrayList2, i, i2, false, this.l);
                }
                int i12 = i;
                while (i12 < i2) {
                    b.l.b.a aVar = arrayList.get(i12);
                    if (arrayList2.get(i12).booleanValue()) {
                        aVar.c(-1);
                        aVar.i(i12 == i2 + (-1));
                    } else {
                        aVar.c(1);
                        aVar.h();
                    }
                    i12++;
                }
                if (z2) {
                    b.e.d<Fragment> dVar = new b.e.d<>();
                    a(dVar);
                    i3 = i;
                    int i13 = i2;
                    for (int i14 = i2 - 1; i14 >= i3; i14--) {
                        b.l.b.a aVar2 = arrayList.get(i14);
                        boolean booleanValue = arrayList2.get(i14).booleanValue();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= aVar2.f1368a.size()) {
                                z = false;
                            } else if (b.l.b.a.l(aVar2.f1368a.get(i15))) {
                                z = true;
                            } else {
                                i15++;
                            }
                        }
                        if (z && !aVar2.k(arrayList, i14 + 1, i2)) {
                            if (this.B == null) {
                                this.B = new ArrayList<>();
                            }
                            c0 c0Var = new c0(aVar2, booleanValue);
                            this.B.add(c0Var);
                            for (int i16 = 0; i16 < aVar2.f1368a.size(); i16++) {
                                m0 m0Var = aVar2.f1368a.get(i16);
                                if (b.l.b.a.l(m0Var)) {
                                    m0Var.f1444b.m0(c0Var);
                                }
                            }
                            if (booleanValue) {
                                aVar2.h();
                            } else {
                                aVar2.i(false);
                            }
                            i13--;
                            if (i14 != i13) {
                                arrayList.remove(i14);
                                arrayList.add(i13, aVar2);
                            }
                            a(dVar);
                        }
                    }
                    i4 = 0;
                    int i17 = dVar.f880d;
                    for (int i18 = 0; i18 < i17; i18++) {
                        Fragment fragment2 = (Fragment) dVar.f879c[i18];
                        if (!fragment2.k) {
                            View f0 = fragment2.f0();
                            fragment2.K = f0.getAlpha();
                            f0.setAlpha(0.0f);
                        }
                    }
                    i5 = i13;
                } else {
                    i3 = i;
                    i4 = 0;
                    i5 = i2;
                }
                if (i5 != i3 && z2) {
                    u0.o(this, arrayList, arrayList2, i, i5, true, this.l);
                    S(this.n, true);
                }
                while (i3 < i2) {
                    b.l.b.a aVar3 = arrayList.get(i3);
                    if (arrayList2.get(i3).booleanValue() && aVar3.s >= 0) {
                        aVar3.s = -1;
                    }
                    Objects.requireNonNull(aVar3);
                    i3++;
                }
                if (i10 == 0 || this.j == null) {
                    return;
                }
                for (int i19 = i4; i19 < this.j.size(); i19++) {
                    AppSettingsActivity.a aVar4 = (AppSettingsActivity.a) this.j.get(i19);
                    ArrayList<b.l.b.a> arrayList5 = AppSettingsActivity.this.n().f1515d;
                    if ((arrayList5 != null ? arrayList5.size() : i4) == 0) {
                        AppSettingsActivity.this.setTitle(R.string.settings_root_title);
                    }
                }
                return;
            }
            b.l.b.a aVar5 = arrayList.get(i9);
            int i20 = 3;
            if (arrayList3.get(i9).booleanValue()) {
                i6 = 1;
                ArrayList<Fragment> arrayList6 = this.A;
                for (int size = aVar5.f1368a.size() - 1; size >= 0; size--) {
                    m0 m0Var2 = aVar5.f1368a.get(size);
                    int i21 = m0Var2.f1443a;
                    if (i21 != 1) {
                        if (i21 != 3) {
                            switch (i21) {
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = m0Var2.f1444b;
                                    break;
                                case 10:
                                    m0Var2.h = m0Var2.g;
                                    break;
                            }
                        }
                        arrayList6.add(m0Var2.f1444b);
                    }
                    arrayList6.remove(m0Var2.f1444b);
                }
            } else {
                ArrayList<Fragment> arrayList7 = this.A;
                int i22 = 0;
                while (i22 < aVar5.f1368a.size()) {
                    m0 m0Var3 = aVar5.f1368a.get(i22);
                    int i23 = m0Var3.f1443a;
                    if (i23 != i11) {
                        if (i23 == 2) {
                            Fragment fragment3 = m0Var3.f1444b;
                            int i24 = fragment3.w;
                            int size2 = arrayList7.size() - 1;
                            boolean z3 = false;
                            while (size2 >= 0) {
                                Fragment fragment4 = arrayList7.get(size2);
                                if (fragment4.w != i24) {
                                    i8 = i24;
                                } else if (fragment4 == fragment3) {
                                    i8 = i24;
                                    z3 = true;
                                } else {
                                    if (fragment4 == fragment) {
                                        i8 = i24;
                                        aVar5.f1368a.add(i22, new m0(9, fragment4));
                                        i22++;
                                        fragment = null;
                                    } else {
                                        i8 = i24;
                                    }
                                    m0 m0Var4 = new m0(3, fragment4);
                                    m0Var4.f1445c = m0Var3.f1445c;
                                    m0Var4.f1447e = m0Var3.f1447e;
                                    m0Var4.f1446d = m0Var3.f1446d;
                                    m0Var4.f1448f = m0Var3.f1448f;
                                    aVar5.f1368a.add(i22, m0Var4);
                                    arrayList7.remove(fragment4);
                                    i22++;
                                }
                                size2--;
                                i24 = i8;
                            }
                            if (z3) {
                                aVar5.f1368a.remove(i22);
                                i22--;
                            } else {
                                i7 = 1;
                                m0Var3.f1443a = 1;
                                arrayList7.add(fragment3);
                                i22 += i7;
                                i11 = i7;
                                i20 = 3;
                            }
                        } else if (i23 == i20 || i23 == 6) {
                            arrayList7.remove(m0Var3.f1444b);
                            Fragment fragment5 = m0Var3.f1444b;
                            if (fragment5 == fragment) {
                                aVar5.f1368a.add(i22, new m0(9, fragment5));
                                i22++;
                                fragment = null;
                            }
                        } else if (i23 == 7) {
                            i7 = 1;
                        } else if (i23 == 8) {
                            aVar5.f1368a.add(i22, new m0(9, fragment));
                            i22++;
                            fragment = m0Var3.f1444b;
                        }
                        i7 = 1;
                        i22 += i7;
                        i11 = i7;
                        i20 = 3;
                    } else {
                        i7 = i11;
                    }
                    arrayList7.add(m0Var3.f1444b);
                    i22 += i7;
                    i11 = i7;
                    i20 = 3;
                }
                i6 = i11;
            }
            i10 = (i10 != 0 || aVar5.g) ? i6 : 0;
            i9++;
            arrayList3 = arrayList2;
        }
    }

    public final void E(ArrayList<b.l.b.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<c0> arrayList3 = this.B;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            c0 c0Var = this.B.get(i);
            if (arrayList == null || c0Var.f1387a || (indexOf2 = arrayList.indexOf(c0Var.f1388b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if ((c0Var.f1389c == 0) || (arrayList != null && c0Var.f1388b.k(arrayList, 0, arrayList.size()))) {
                    this.B.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || c0Var.f1387a || (indexOf = arrayList.indexOf(c0Var.f1388b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        c0Var.a();
                    }
                }
                i++;
            } else {
                this.B.remove(i);
                i--;
                size--;
            }
            b.l.b.a aVar = c0Var.f1388b;
            aVar.q.g(aVar, c0Var.f1387a, false, false);
            i++;
        }
    }

    public Fragment F(String str) {
        return this.f1514c.e(str);
    }

    public Fragment G(int i) {
        l0 l0Var = this.f1514c;
        int size = l0Var.f1439a.size();
        while (true) {
            size--;
            if (size < 0) {
                for (k0 k0Var : l0Var.f1440b.values()) {
                    if (k0Var != null) {
                        Fragment fragment = k0Var.f1432b;
                        if (fragment.v == i) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = l0Var.f1439a.get(size);
            if (fragment2 != null && fragment2.v == i) {
                return fragment2;
            }
        }
    }

    public Fragment H(String str) {
        l0 l0Var = this.f1514c;
        Objects.requireNonNull(l0Var);
        int size = l0Var.f1439a.size();
        while (true) {
            size--;
            if (size < 0) {
                for (k0 k0Var : l0Var.f1440b.values()) {
                    if (k0Var != null) {
                        Fragment fragment = k0Var.f1432b;
                        if (str.equals(fragment.x)) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = l0Var.f1439a.get(size);
            if (fragment2 != null && str.equals(fragment2.x)) {
                return fragment2;
            }
        }
    }

    public Fragment I(String str) {
        for (k0 k0Var : this.f1514c.f1440b.values()) {
            if (k0Var != null) {
                Fragment fragment = k0Var.f1432b;
                if (!str.equals(fragment.f225e)) {
                    fragment = fragment.t.I(str);
                }
                if (fragment != null) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public final ViewGroup J(Fragment fragment) {
        if (fragment.w > 0 && this.p.d()) {
            View c2 = this.p.c(fragment.w);
            if (c2 instanceof ViewGroup) {
                return (ViewGroup) c2;
            }
        }
        return null;
    }

    public w K() {
        Fragment fragment = this.q;
        return fragment != null ? fragment.r.K() : this.s;
    }

    public void L(Fragment fragment) {
        if (M(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.y) {
            return;
        }
        fragment.y = true;
        fragment.J = true ^ fragment.J;
        g0(fragment);
    }

    public final boolean N(Fragment fragment) {
        z zVar = fragment.t;
        Iterator it = ((ArrayList) zVar.f1514c.f()).iterator();
        boolean z = false;
        while (it.hasNext()) {
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z = zVar.N(fragment2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean O(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        z zVar = fragment.r;
        return fragment.equals(zVar.r) && O(zVar.q);
    }

    public boolean P() {
        return this.u || this.v;
    }

    public void Q(Fragment fragment) {
        if (this.f1514c.c(fragment.f225e)) {
            return;
        }
        k0 k0Var = new k0(this.m, fragment);
        k0Var.a(this.o.f1411c.getClassLoader());
        this.f1514c.f1440b.put(k0Var.f1432b.f225e, k0Var);
        k0Var.f1433c = this.n;
        if (M(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public void R(Fragment fragment) {
        Animator animator;
        if (!this.f1514c.c(fragment.f225e)) {
            if (M(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.n + "since it is not added to " + this);
                return;
            }
            return;
        }
        T(fragment, this.n);
        if (fragment.E != null) {
            l0 l0Var = this.f1514c;
            Objects.requireNonNull(l0Var);
            ViewGroup viewGroup = fragment.D;
            View view = fragment.E;
            Fragment fragment2 = null;
            if (viewGroup != null && view != null) {
                int indexOf = l0Var.f1439a.indexOf(fragment);
                while (true) {
                    indexOf--;
                    if (indexOf < 0) {
                        break;
                    }
                    Fragment fragment3 = l0Var.f1439a.get(indexOf);
                    if (fragment3.D == viewGroup && fragment3.E != null) {
                        fragment2 = fragment3;
                        break;
                    }
                }
            }
            if (fragment2 != null) {
                View view2 = fragment2.E;
                ViewGroup viewGroup2 = fragment.D;
                int indexOfChild = viewGroup2.indexOfChild(view2);
                int indexOfChild2 = viewGroup2.indexOfChild(fragment.E);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup2.removeViewAt(indexOfChild2);
                    viewGroup2.addView(fragment.E, indexOfChild);
                }
            }
            if (fragment.I && fragment.D != null) {
                float f2 = fragment.K;
                if (f2 > 0.0f) {
                    fragment.E.setAlpha(f2);
                }
                fragment.K = 0.0f;
                fragment.I = false;
                m v = b.h.b.h.v(this.o.f1411c, this.p, fragment, true);
                if (v != null) {
                    Animation animation = v.f1441a;
                    if (animation != null) {
                        fragment.E.startAnimation(animation);
                    } else {
                        v.f1442b.setTarget(fragment.E);
                        v.f1442b.start();
                    }
                }
            }
        }
        if (fragment.J) {
            if (fragment.E != null) {
                m v2 = b.h.b.h.v(this.o.f1411c, this.p, fragment, !fragment.y);
                if (v2 == null || (animator = v2.f1442b) == null) {
                    if (v2 != null) {
                        fragment.E.startAnimation(v2.f1441a);
                        v2.f1441a.start();
                    }
                    fragment.E.setVisibility((!fragment.y || fragment.z()) ? 0 : 8);
                    if (fragment.z()) {
                        fragment.k0(false);
                    }
                } else {
                    animator.setTarget(fragment.E);
                    if (!fragment.y) {
                        fragment.E.setVisibility(0);
                    } else if (fragment.z()) {
                        fragment.k0(false);
                    } else {
                        ViewGroup viewGroup3 = fragment.D;
                        View view3 = fragment.E;
                        viewGroup3.startViewTransition(view3);
                        v2.f1442b.addListener(new y(this, viewGroup3, view3, fragment));
                    }
                    v2.f1442b.start();
                }
            }
            if (fragment.k && N(fragment)) {
                this.t = true;
            }
            fragment.J = false;
            fragment.P();
        }
    }

    public void S(int i, boolean z) {
        h<?> hVar;
        if (this.o == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.n) {
            this.n = i;
            Iterator<Fragment> it = this.f1514c.g().iterator();
            while (it.hasNext()) {
                R(it.next());
            }
            Iterator it2 = ((ArrayList) this.f1514c.f()).iterator();
            while (it2.hasNext()) {
                Fragment fragment = (Fragment) it2.next();
                if (fragment != null && !fragment.I) {
                    R(fragment);
                }
            }
            i0();
            if (this.t && (hVar = this.o) != null && this.n == 4) {
                hVar.f1414f.l().e();
                this.t = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        if (r2 != 3) goto L375;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void T(androidx.fragment.app.Fragment r14, int r15) {
        /*
            Method dump skipped, instructions count: 2197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.b.z.T(androidx.fragment.app.Fragment, int):void");
    }

    public void U() {
        if (this.o == null) {
            return;
        }
        this.u = false;
        this.v = false;
        for (Fragment fragment : this.f1514c.g()) {
            if (fragment != null) {
                fragment.t.U();
            }
        }
    }

    public boolean V() {
        B(false);
        A(true);
        Fragment fragment = this.r;
        if (fragment != null && fragment.h().V()) {
            return true;
        }
        boolean W = W(this.y, this.z, null, -1, 0);
        if (W) {
            this.f1513b = true;
            try {
                Y(this.y, this.z);
            } finally {
                f();
            }
        }
        j0();
        w();
        this.f1514c.b();
        return W;
    }

    public boolean W(ArrayList<b.l.b.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        Boolean bool = Boolean.TRUE;
        ArrayList<b.l.b.a> arrayList3 = this.f1515d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1515d.remove(size));
            arrayList2.add(bool);
        } else {
            int i3 = -1;
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    b.l.b.a aVar = this.f1515d.get(size2);
                    if ((str != null && str.equals(aVar.i)) || (i >= 0 && i == aVar.s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        b.l.b.a aVar2 = this.f1515d.get(size2);
                        if (str == null || !str.equals(aVar2.i)) {
                            if (i < 0 || i != aVar2.s) {
                                break;
                            }
                        }
                    }
                }
                i3 = size2;
            }
            if (i3 == this.f1515d.size() - 1) {
                return false;
            }
            for (int size3 = this.f1515d.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f1515d.remove(size3));
                arrayList2.add(bool);
            }
        }
        return true;
    }

    public void X(Fragment fragment) {
        if (M(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.q);
        }
        boolean z = !fragment.A();
        if (!fragment.z || z) {
            this.f1514c.h(fragment);
            if (N(fragment)) {
                this.t = true;
            }
            fragment.l = true;
            g0(fragment);
        }
    }

    public final void Y(ArrayList<b.l.b.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        E(arrayList, arrayList2);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).p) {
                if (i2 != i) {
                    D(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).p) {
                        i2++;
                    }
                }
                D(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            D(arrayList, arrayList2, i2, size);
        }
    }

    public void Z(Fragment fragment) {
        if (P()) {
            if (M(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.C.f1415b.remove(fragment.f225e) != null) && M(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final void a(b.e.d<Fragment> dVar) {
        int i = this.n;
        if (i < 1) {
            return;
        }
        int min = Math.min(i, 3);
        for (Fragment fragment : this.f1514c.g()) {
            if (fragment.f222b < min) {
                T(fragment, min);
                if (fragment.E != null && !fragment.y && fragment.I) {
                    dVar.add(fragment);
                }
            }
        }
    }

    public void a0(Parcelable parcelable) {
        k0 k0Var;
        if (parcelable == null) {
            return;
        }
        f0 f0Var = (f0) parcelable;
        if (f0Var.f1404b == null) {
            return;
        }
        this.f1514c.f1440b.clear();
        Iterator<j0> it = f0Var.f1404b.iterator();
        while (it.hasNext()) {
            j0 next = it.next();
            if (next != null) {
                Fragment fragment = this.C.f1415b.get(next.f1423c);
                if (fragment != null) {
                    if (M(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    k0Var = new k0(this.m, fragment, next);
                } else {
                    k0Var = new k0(this.m, this.o.f1411c.getClassLoader(), K(), next);
                }
                Fragment fragment2 = k0Var.f1432b;
                fragment2.r = this;
                if (M(2)) {
                    StringBuilder j = c.a.a.a.a.j("restoreSaveState: active (");
                    j.append(fragment2.f225e);
                    j.append("): ");
                    j.append(fragment2);
                    Log.v("FragmentManager", j.toString());
                }
                k0Var.a(this.o.f1411c.getClassLoader());
                this.f1514c.f1440b.put(k0Var.f1432b.f225e, k0Var);
                k0Var.f1433c = this.n;
            }
        }
        for (Fragment fragment3 : this.C.f1415b.values()) {
            if (!this.f1514c.c(fragment3.f225e)) {
                if (M(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + f0Var.f1404b);
                }
                T(fragment3, 1);
                fragment3.l = true;
                T(fragment3, -1);
            }
        }
        l0 l0Var = this.f1514c;
        ArrayList<String> arrayList = f0Var.f1405c;
        l0Var.f1439a.clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                Fragment e2 = l0Var.e(str);
                if (e2 == null) {
                    throw new IllegalStateException(c.a.a.a.a.h("No instantiated fragment for (", str, ")"));
                }
                if (M(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + e2);
                }
                l0Var.a(e2);
            }
        }
        if (f0Var.f1406d != null) {
            this.f1515d = new ArrayList<>(f0Var.f1406d.length);
            int i = 0;
            while (true) {
                c[] cVarArr = f0Var.f1406d;
                if (i >= cVarArr.length) {
                    break;
                }
                c cVar = cVarArr[i];
                Objects.requireNonNull(cVar);
                b.l.b.a aVar = new b.l.b.a(this);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int[] iArr = cVar.f1382b;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    m0 m0Var = new m0();
                    int i4 = i2 + 1;
                    m0Var.f1443a = iArr[i2];
                    if (M(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + cVar.f1382b[i4]);
                    }
                    String str2 = cVar.f1383c.get(i3);
                    m0Var.f1444b = str2 != null ? this.f1514c.e(str2) : null;
                    m0Var.g = e.b.values()[cVar.f1384d[i3]];
                    m0Var.h = e.b.values()[cVar.f1385e[i3]];
                    int[] iArr2 = cVar.f1382b;
                    int i5 = i4 + 1;
                    int i6 = iArr2[i4];
                    m0Var.f1445c = i6;
                    int i7 = i5 + 1;
                    int i8 = iArr2[i5];
                    m0Var.f1446d = i8;
                    int i9 = i7 + 1;
                    int i10 = iArr2[i7];
                    m0Var.f1447e = i10;
                    int i11 = iArr2[i9];
                    m0Var.f1448f = i11;
                    aVar.f1369b = i6;
                    aVar.f1370c = i8;
                    aVar.f1371d = i10;
                    aVar.f1372e = i11;
                    aVar.b(m0Var);
                    i3++;
                    i2 = i9 + 1;
                }
                aVar.f1373f = cVar.f1386f;
                aVar.i = cVar.g;
                aVar.s = cVar.h;
                aVar.g = true;
                aVar.j = cVar.i;
                aVar.k = cVar.j;
                aVar.l = cVar.k;
                aVar.m = cVar.l;
                aVar.n = cVar.m;
                aVar.o = cVar.n;
                aVar.p = cVar.o;
                aVar.c(1);
                if (M(2)) {
                    StringBuilder k = c.a.a.a.a.k("restoreAllState: back stack #", i, " (index ");
                    k.append(aVar.s);
                    k.append("): ");
                    k.append(aVar);
                    Log.v("FragmentManager", k.toString());
                    PrintWriter printWriter = new PrintWriter(new b.h.i.a("FragmentManager"));
                    aVar.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1515d.add(aVar);
                i++;
            }
        } else {
            this.f1515d = null;
        }
        this.i.set(f0Var.f1407e);
        String str3 = f0Var.f1408f;
        if (str3 != null) {
            Fragment e3 = this.f1514c.e(str3);
            this.r = e3;
            s(e3);
        }
    }

    public void b(Fragment fragment) {
        if (M(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        Q(fragment);
        if (fragment.z) {
            return;
        }
        this.f1514c.a(fragment);
        fragment.l = false;
        if (fragment.E == null) {
            fragment.J = false;
        }
        if (N(fragment)) {
            this.t = true;
        }
    }

    public Parcelable b0() {
        c[] cVarArr;
        ArrayList<String> arrayList;
        int size;
        if (this.B != null) {
            while (!this.B.isEmpty()) {
                this.B.remove(0).a();
            }
        }
        y();
        B(true);
        this.u = true;
        l0 l0Var = this.f1514c;
        Objects.requireNonNull(l0Var);
        ArrayList<j0> arrayList2 = new ArrayList<>(l0Var.f1440b.size());
        Iterator<k0> it = l0Var.f1440b.values().iterator();
        while (true) {
            cVarArr = null;
            cVarArr = null;
            if (!it.hasNext()) {
                break;
            }
            k0 next = it.next();
            if (next != null) {
                Fragment fragment = next.f1432b;
                j0 j0Var = new j0(fragment);
                Fragment fragment2 = next.f1432b;
                if (fragment2.f222b <= -1 || j0Var.n != null) {
                    j0Var.n = fragment2.f223c;
                } else {
                    Bundle bundle = new Bundle();
                    Fragment fragment3 = next.f1432b;
                    fragment3.W(bundle);
                    fragment3.R.b(bundle);
                    Parcelable b0 = fragment3.t.b0();
                    if (b0 != null) {
                        bundle.putParcelable("android:support:fragments", b0);
                    }
                    next.f1431a.j(next.f1432b, bundle, false);
                    Bundle bundle2 = bundle.isEmpty() ? null : bundle;
                    if (next.f1432b.E != null) {
                        next.b();
                    }
                    if (next.f1432b.f224d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", next.f1432b.f224d);
                    }
                    if (!next.f1432b.G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", next.f1432b.G);
                    }
                    j0Var.n = bundle2;
                    if (next.f1432b.h != null) {
                        if (bundle2 == null) {
                            j0Var.n = new Bundle();
                        }
                        j0Var.n.putString("android:target_state", next.f1432b.h);
                        int i = next.f1432b.i;
                        if (i != 0) {
                            j0Var.n.putInt("android:target_req_state", i);
                        }
                    }
                }
                arrayList2.add(j0Var);
                if (M(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + j0Var.n);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            if (M(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        l0 l0Var2 = this.f1514c;
        synchronized (l0Var2.f1439a) {
            if (l0Var2.f1439a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(l0Var2.f1439a.size());
                Iterator<Fragment> it2 = l0Var2.f1439a.iterator();
                while (it2.hasNext()) {
                    Fragment next2 = it2.next();
                    arrayList.add(next2.f225e);
                    if (M(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + next2.f225e + "): " + next2);
                    }
                }
            }
        }
        ArrayList<b.l.b.a> arrayList3 = this.f1515d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            cVarArr = new c[size];
            for (int i2 = 0; i2 < size; i2++) {
                cVarArr[i2] = new c(this.f1515d.get(i2));
                if (M(2)) {
                    StringBuilder k = c.a.a.a.a.k("saveAllState: adding back stack #", i2, ": ");
                    k.append(this.f1515d.get(i2));
                    Log.v("FragmentManager", k.toString());
                }
            }
        }
        f0 f0Var = new f0();
        f0Var.f1404b = arrayList2;
        f0Var.f1405c = arrayList;
        f0Var.f1406d = cVarArr;
        f0Var.f1407e = this.i.get();
        Fragment fragment4 = this.r;
        if (fragment4 != null) {
            f0Var.f1408f = fragment4.f225e;
        }
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(h<?> hVar, o oVar, Fragment fragment) {
        b.n.p put;
        if (this.o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.o = hVar;
        this.p = oVar;
        this.q = fragment;
        if (fragment != 0) {
            j0();
        }
        if (hVar instanceof b.a.e) {
            OnBackPressedDispatcher a2 = hVar.a();
            this.g = a2;
            h<?> hVar2 = fragment != 0 ? fragment : hVar;
            u uVar = this.h;
            Objects.requireNonNull(a2);
            b.n.e g = hVar2.g();
            if (((b.n.j) g).f1539b != e.b.DESTROYED) {
                uVar.f1490b.add(a2.new LifecycleOnBackPressedCancellable(g, uVar));
            }
        }
        if (fragment != 0) {
            h0 h0Var = fragment.r.C;
            h0 h0Var2 = h0Var.f1416c.get(fragment.f225e);
            if (h0Var2 == null) {
                h0Var2 = new h0(h0Var.f1418e);
                h0Var.f1416c.put(fragment.f225e, h0Var2);
            }
            this.C = h0Var2;
            return;
        }
        if (!(hVar instanceof b.n.s)) {
            this.C = new h0(false);
            return;
        }
        b.n.r e2 = hVar.e();
        String canonicalName = h0.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String g2 = c.a.a.a.a.g("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
        b.n.p pVar = e2.f1547a.get(g2);
        if (!h0.class.isInstance(pVar) && (put = e2.f1547a.put(g2, (pVar = new h0(true)))) != null) {
            put.a();
        }
        this.C = (h0) pVar;
    }

    public void c0() {
        synchronized (this.f1512a) {
            ArrayList<c0> arrayList = this.B;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.f1512a.size() == 1;
            if (z || z2) {
                this.o.f1412d.removeCallbacks(this.D);
                this.o.f1412d.post(this.D);
                j0();
            }
        }
    }

    public void d(Fragment fragment) {
        if (M(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.z) {
            fragment.z = false;
            if (fragment.k) {
                return;
            }
            this.f1514c.a(fragment);
            if (M(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (N(fragment)) {
                this.t = true;
            }
        }
    }

    public void d0(Fragment fragment, boolean z) {
        ViewGroup J = J(fragment);
        if (J == null || !(J instanceof p)) {
            return;
        }
        ((p) J).setDrawDisappearingViewsLast(!z);
    }

    public final void e(Fragment fragment) {
        HashSet<b.h.f.a> hashSet = this.k.get(fragment);
        if (hashSet != null) {
            Iterator<b.h.f.a> it = hashSet.iterator();
            while (it.hasNext()) {
                b.h.f.a next = it.next();
                synchronized (next) {
                    if (!next.f1178a) {
                        next.f1178a = true;
                        next.f1180c = true;
                        i iVar = next.f1179b;
                        if (iVar != null) {
                            try {
                                iVar.a();
                            } catch (Throwable th) {
                                synchronized (next) {
                                    next.f1180c = false;
                                    next.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (next) {
                            next.f1180c = false;
                            next.notifyAll();
                        }
                    }
                }
            }
            hashSet.clear();
            h(fragment);
            this.k.remove(fragment);
        }
    }

    public void e0(Fragment fragment, e.b bVar) {
        if (fragment.equals(F(fragment.f225e)) && (fragment.s == null || fragment.r == this)) {
            fragment.N = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void f() {
        this.f1513b = false;
        this.z.clear();
        this.y.clear();
    }

    public void f0(Fragment fragment) {
        if (fragment == null || (fragment.equals(F(fragment.f225e)) && (fragment.s == null || fragment.r == this))) {
            Fragment fragment2 = this.r;
            this.r = fragment;
            s(fragment2);
            s(this.r);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void g(b.l.b.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.i(z3);
        } else {
            aVar.h();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            u0.o(this, arrayList, arrayList2, 0, 1, true, this.l);
        }
        if (z3) {
            S(this.n, true);
        }
        Iterator it = ((ArrayList) this.f1514c.f()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.E != null && fragment.I && aVar.j(fragment.w)) {
                float f2 = fragment.K;
                if (f2 > 0.0f) {
                    fragment.E.setAlpha(f2);
                }
                if (z3) {
                    fragment.K = 0.0f;
                } else {
                    fragment.K = -1.0f;
                    fragment.I = false;
                }
            }
        }
    }

    public final void g0(Fragment fragment) {
        ViewGroup J = J(fragment);
        if (J != null) {
            if (J.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                J.setTag(R.id.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) J.getTag(R.id.visible_removing_fragment_view_tag)).l0(fragment.o());
        }
    }

    public final void h(Fragment fragment) {
        fragment.t.v(1);
        if (fragment.E != null) {
            f1 f1Var = fragment.P;
            f1Var.f1409b.d(e.a.ON_DESTROY);
        }
        fragment.f222b = 1;
        fragment.C = false;
        fragment.M();
        if (!fragment.C) {
            throw new g1(c.a.a.a.a.f("Fragment ", fragment, " did not call through to super.onDestroyView()"));
        }
        b.C0003b c0003b = ((b.o.a.b) b.o.a.a.b(fragment)).f1549b;
        if (c0003b.f1551b.i() > 0) {
            c0003b.f1551b.j(0);
            throw null;
        }
        fragment.p = false;
        this.m.n(fragment, false);
        fragment.D = null;
        fragment.E = null;
        fragment.P = null;
        fragment.Q.c(null);
        fragment.n = false;
    }

    public void h0(Fragment fragment) {
        if (M(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.y) {
            fragment.y = false;
            fragment.J = !fragment.J;
        }
    }

    public void i(Fragment fragment) {
        if (M(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.z) {
            return;
        }
        fragment.z = true;
        if (fragment.k) {
            if (M(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f1514c.h(fragment);
            if (N(fragment)) {
                this.t = true;
            }
            g0(fragment);
        }
    }

    public final void i0() {
        Iterator it = ((ArrayList) this.f1514c.f()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.F) {
                if (this.f1513b) {
                    this.x = true;
                } else {
                    fragment.F = false;
                    T(fragment, this.n);
                }
            }
        }
    }

    public void j(Configuration configuration) {
        for (Fragment fragment : this.f1514c.g()) {
            if (fragment != null) {
                fragment.onConfigurationChanged(configuration);
                fragment.t.j(configuration);
            }
        }
    }

    public final void j0() {
        synchronized (this.f1512a) {
            if (!this.f1512a.isEmpty()) {
                this.h.f1489a = true;
                return;
            }
            u uVar = this.h;
            ArrayList<b.l.b.a> arrayList = this.f1515d;
            uVar.f1489a = (arrayList != null ? arrayList.size() : 0) > 0 && O(this.q);
        }
    }

    public boolean k(MenuItem menuItem) {
        if (this.n < 1) {
            return false;
        }
        for (Fragment fragment : this.f1514c.g()) {
            if (fragment != null) {
                if (!fragment.y && (fragment.H() || fragment.t.k(menuItem))) {
                    return true;
                }
            }
        }
        return false;
    }

    public void l() {
        this.u = false;
        this.v = false;
        v(1);
    }

    public boolean m(Menu menu, MenuInflater menuInflater) {
        if (this.n < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f1514c.g()) {
            if (fragment != null) {
                if (!fragment.y ? fragment.t.m(menu, menuInflater) | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    z = true;
                }
            }
        }
        if (this.f1516e != null) {
            for (int i = 0; i < this.f1516e.size(); i++) {
                Fragment fragment2 = this.f1516e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    Objects.requireNonNull(fragment2);
                }
            }
        }
        this.f1516e = arrayList;
        return z;
    }

    public void n() {
        this.w = true;
        B(true);
        y();
        v(-1);
        this.o = null;
        this.p = null;
        this.q = null;
        if (this.g != null) {
            Iterator<b.a.a> it = this.h.f1490b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.g = null;
        }
    }

    public void o() {
        for (Fragment fragment : this.f1514c.g()) {
            if (fragment != null) {
                fragment.onLowMemory();
                fragment.t.o();
            }
        }
    }

    public void p(boolean z) {
        for (Fragment fragment : this.f1514c.g()) {
            if (fragment != null) {
                fragment.S();
                fragment.t.p(z);
            }
        }
    }

    public boolean q(MenuItem menuItem) {
        if (this.n < 1) {
            return false;
        }
        for (Fragment fragment : this.f1514c.g()) {
            if (fragment != null) {
                if (!fragment.y && fragment.t.q(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void r(Menu menu) {
        if (this.n < 1) {
            return;
        }
        for (Fragment fragment : this.f1514c.g()) {
            if (fragment != null && !fragment.y) {
                fragment.t.r(menu);
            }
        }
    }

    public final void s(Fragment fragment) {
        if (fragment == null || !fragment.equals(F(fragment.f225e))) {
            return;
        }
        boolean O = fragment.r.O(fragment);
        Boolean bool = fragment.j;
        if (bool == null || bool.booleanValue() != O) {
            fragment.j = Boolean.valueOf(O);
            fragment.U();
            z zVar = fragment.t;
            zVar.j0();
            zVar.s(zVar.r);
        }
    }

    public void t(boolean z) {
        for (Fragment fragment : this.f1514c.g()) {
            if (fragment != null) {
                fragment.T();
                fragment.t.t(z);
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.q;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.q;
        } else {
            h<?> hVar = this.o;
            if (hVar == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(hVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.o;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public boolean u(Menu menu) {
        if (this.n < 1) {
            return false;
        }
        boolean z = false;
        for (Fragment fragment : this.f1514c.g()) {
            if (fragment != null) {
                if (!fragment.y ? fragment.t.u(menu) | false : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void v(int i) {
        try {
            this.f1513b = true;
            this.f1514c.d(i);
            S(i, false);
            this.f1513b = false;
            B(true);
        } catch (Throwable th) {
            this.f1513b = false;
            throw th;
        }
    }

    public final void w() {
        if (this.x) {
            this.x = false;
            i0();
        }
    }

    public void x(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String g = c.a.a.a.a.g(str, "    ");
        l0 l0Var = this.f1514c;
        Objects.requireNonNull(l0Var);
        String str2 = str + "    ";
        if (!l0Var.f1440b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (k0 k0Var : l0Var.f1440b.values()) {
                printWriter.print(str);
                if (k0Var != null) {
                    Fragment fragment = k0Var.f1432b;
                    printWriter.println(fragment);
                    Objects.requireNonNull(fragment);
                    printWriter.print(str2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(fragment.v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(fragment.w));
                    printWriter.print(" mTag=");
                    printWriter.println(fragment.x);
                    printWriter.print(str2);
                    printWriter.print("mState=");
                    printWriter.print(fragment.f222b);
                    printWriter.print(" mWho=");
                    printWriter.print(fragment.f225e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(fragment.q);
                    printWriter.print(str2);
                    printWriter.print("mAdded=");
                    printWriter.print(fragment.k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(fragment.l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(fragment.m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(fragment.n);
                    printWriter.print(str2);
                    printWriter.print("mHidden=");
                    printWriter.print(fragment.y);
                    printWriter.print(" mDetached=");
                    printWriter.print(fragment.z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(fragment.B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(fragment.A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(fragment.G);
                    if (fragment.r != null) {
                        printWriter.print(str2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(fragment.r);
                    }
                    if (fragment.s != null) {
                        printWriter.print(str2);
                        printWriter.print("mHost=");
                        printWriter.println(fragment.s);
                    }
                    if (fragment.u != null) {
                        printWriter.print(str2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(fragment.u);
                    }
                    if (fragment.f226f != null) {
                        printWriter.print(str2);
                        printWriter.print("mArguments=");
                        printWriter.println(fragment.f226f);
                    }
                    if (fragment.f223c != null) {
                        printWriter.print(str2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(fragment.f223c);
                    }
                    if (fragment.f224d != null) {
                        printWriter.print(str2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(fragment.f224d);
                    }
                    Object x = fragment.x();
                    if (x != null) {
                        printWriter.print(str2);
                        printWriter.print("mTarget=");
                        printWriter.print(x);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(fragment.i);
                    }
                    if (fragment.o() != 0) {
                        printWriter.print(str2);
                        printWriter.print("mNextAnim=");
                        printWriter.println(fragment.o());
                    }
                    if (fragment.D != null) {
                        printWriter.print(str2);
                        printWriter.print("mContainer=");
                        printWriter.println(fragment.D);
                    }
                    if (fragment.E != null) {
                        printWriter.print(str2);
                        printWriter.print("mView=");
                        printWriter.println(fragment.E);
                    }
                    if (fragment.f() != null) {
                        printWriter.print(str2);
                        printWriter.print("mAnimatingAway=");
                        printWriter.println(fragment.f());
                        printWriter.print(str2);
                        printWriter.print("mStateAfterAnimating=");
                        printWriter.println(fragment.v());
                    }
                    if (fragment.i() != null) {
                        b.o.a.a.b(fragment).a(str2, fileDescriptor, printWriter, strArr);
                    }
                    printWriter.print(str2);
                    printWriter.println("Child " + fragment.t + ":");
                    fragment.t.x(c.a.a.a.a.g(str2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = l0Var.f1439a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                Fragment fragment2 = l0Var.f1439a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f1516e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment3 = this.f1516e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<b.l.b.a> arrayList2 = this.f1515d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                b.l.b.a aVar = this.f1515d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.g(g, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f1512a) {
            int size4 = this.f1512a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (a0) this.f1512a.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.p);
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.u);
        printWriter.print(" mStopped=");
        printWriter.print(this.v);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.w);
        if (this.t) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.t);
        }
    }

    public final void y() {
        if (this.k.isEmpty()) {
            return;
        }
        for (Fragment fragment : this.k.keySet()) {
            e(fragment);
            T(fragment, fragment.v());
        }
    }

    public void z(a0 a0Var, boolean z) {
        if (!z) {
            if (this.o == null) {
                if (!this.w) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1512a) {
            if (this.o == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f1512a.add(a0Var);
                c0();
            }
        }
    }
}
