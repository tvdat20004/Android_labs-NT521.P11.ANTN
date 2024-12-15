package b.t;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class b0 implements Cloneable {
    public static final int[] v = {2, 1, 3, 4};
    public static final v w = new v();
    public static ThreadLocal<b.e.b<Animator, y>> x = new ThreadLocal<>();
    public ArrayList<l0> l;
    public ArrayList<l0> m;
    public z t;

    /* renamed from: b, reason: collision with root package name */
    public String f1727b = getClass().getName();

    /* renamed from: c, reason: collision with root package name */
    public long f1728c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f1729d = -1;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1730e = null;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList<Integer> f1731f = new ArrayList<>();
    public ArrayList<View> g = new ArrayList<>();
    public m0 h = new m0();
    public m0 i = new m0();
    public j0 j = null;
    public int[] k = v;
    public ArrayList<Animator> n = new ArrayList<>();
    public int o = 0;
    public boolean p = false;
    public boolean q = false;
    public ArrayList<a0> r = null;
    public ArrayList<Animator> s = new ArrayList<>();
    public v u = w;

    public static void c(m0 m0Var, View view, l0 l0Var) {
        m0Var.f1759a.put(view, l0Var);
        int id = view.getId();
        if (id >= 0) {
            if (m0Var.f1760b.indexOfKey(id) >= 0) {
                m0Var.f1760b.put(id, null);
            } else {
                m0Var.f1760b.put(id, view);
            }
        }
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (m0Var.f1762d.e(transitionName) >= 0) {
                m0Var.f1762d.put(transitionName, null);
            } else {
                m0Var.f1762d.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                b.e.f<View> fVar = m0Var.f1761c;
                if (fVar.f886b) {
                    fVar.d();
                }
                if (b.e.e.b(fVar.f887c, fVar.f889e, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    m0Var.f1761c.g(itemIdAtPosition, view);
                    return;
                }
                View e2 = m0Var.f1761c.e(itemIdAtPosition);
                if (e2 != null) {
                    e2.setHasTransientState(false);
                    m0Var.f1761c.g(itemIdAtPosition, null);
                }
            }
        }
    }

    public static b.e.b<Animator, y> o() {
        b.e.b<Animator, y> bVar = x.get();
        if (bVar != null) {
            return bVar;
        }
        b.e.b<Animator, y> bVar2 = new b.e.b<>();
        x.set(bVar2);
        return bVar2;
    }

    public static boolean t(l0 l0Var, l0 l0Var2, String str) {
        Object obj = l0Var.f1754a.get(str);
        Object obj2 = l0Var2.f1754a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public void A(z zVar) {
        this.t = zVar;
    }

    public b0 B(TimeInterpolator timeInterpolator) {
        this.f1730e = timeInterpolator;
        return this;
    }

    public void C(v vVar) {
        if (vVar == null) {
            vVar = w;
        }
        this.u = vVar;
    }

    public void D(g0 g0Var) {
    }

    public b0 E(long j) {
        this.f1728c = j;
        return this;
    }

    public void F() {
        if (this.o == 0) {
            ArrayList<a0> arrayList = this.r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.r.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((a0) arrayList2.get(i)).c(this);
                }
            }
            this.q = false;
        }
        this.o++;
    }

    public String G(String str) {
        StringBuilder j = c.a.a.a.a.j(str);
        j.append(getClass().getSimpleName());
        j.append("@");
        j.append(Integer.toHexString(hashCode()));
        j.append(": ");
        String sb = j.toString();
        if (this.f1729d != -1) {
            sb = sb + "dur(" + this.f1729d + ") ";
        }
        if (this.f1728c != -1) {
            sb = sb + "dly(" + this.f1728c + ") ";
        }
        if (this.f1730e != null) {
            sb = sb + "interp(" + this.f1730e + ") ";
        }
        if (this.f1731f.size() <= 0 && this.g.size() <= 0) {
            return sb;
        }
        String g = c.a.a.a.a.g(sb, "tgts(");
        if (this.f1731f.size() > 0) {
            for (int i = 0; i < this.f1731f.size(); i++) {
                if (i > 0) {
                    g = c.a.a.a.a.g(g, ", ");
                }
                StringBuilder j2 = c.a.a.a.a.j(g);
                j2.append(this.f1731f.get(i));
                g = j2.toString();
            }
        }
        if (this.g.size() > 0) {
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                if (i2 > 0) {
                    g = c.a.a.a.a.g(g, ", ");
                }
                StringBuilder j3 = c.a.a.a.a.j(g);
                j3.append(this.g.get(i2));
                g = j3.toString();
            }
        }
        return c.a.a.a.a.g(g, ")");
    }

    public b0 a(a0 a0Var) {
        if (this.r == null) {
            this.r = new ArrayList<>();
        }
        this.r.add(a0Var);
        return this;
    }

    public b0 b(View view) {
        this.g.add(view);
        return this;
    }

    public abstract void d(l0 l0Var);

    public final void e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            l0 l0Var = new l0(view);
            if (z) {
                g(l0Var);
            } else {
                d(l0Var);
            }
            l0Var.f1756c.add(this);
            f(l0Var);
            c(z ? this.h : this.i, view, l0Var);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z);
            }
        }
    }

    public void f(l0 l0Var) {
    }

    public abstract void g(l0 l0Var);

    public void h(ViewGroup viewGroup, boolean z) {
        i(z);
        if (this.f1731f.size() <= 0 && this.g.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        for (int i = 0; i < this.f1731f.size(); i++) {
            View findViewById = viewGroup.findViewById(this.f1731f.get(i).intValue());
            if (findViewById != null) {
                l0 l0Var = new l0(findViewById);
                if (z) {
                    g(l0Var);
                } else {
                    d(l0Var);
                }
                l0Var.f1756c.add(this);
                f(l0Var);
                c(z ? this.h : this.i, findViewById, l0Var);
            }
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            View view = this.g.get(i2);
            l0 l0Var2 = new l0(view);
            if (z) {
                g(l0Var2);
            } else {
                d(l0Var2);
            }
            l0Var2.f1756c.add(this);
            f(l0Var2);
            c(z ? this.h : this.i, view, l0Var2);
        }
    }

    public void i(boolean z) {
        m0 m0Var;
        if (z) {
            this.h.f1759a.clear();
            this.h.f1760b.clear();
            m0Var = this.h;
        } else {
            this.i.f1759a.clear();
            this.i.f1760b.clear();
            m0Var = this.i;
        }
        m0Var.f1761c.b();
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public b0 clone() {
        try {
            b0 b0Var = (b0) super.clone();
            b0Var.s = new ArrayList<>();
            b0Var.h = new m0();
            b0Var.i = new m0();
            b0Var.l = null;
            b0Var.m = null;
            return b0Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, l0 l0Var, l0 l0Var2) {
        return null;
    }

    public void l(ViewGroup viewGroup, m0 m0Var, m0 m0Var2, ArrayList<l0> arrayList, ArrayList<l0> arrayList2) {
        Animator k;
        int i;
        View view;
        Animator animator;
        l0 l0Var;
        Animator animator2;
        l0 l0Var2;
        b.e.b<Animator, y> o = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            l0 l0Var3 = arrayList.get(i2);
            l0 l0Var4 = arrayList2.get(i2);
            if (l0Var3 != null && !l0Var3.f1756c.contains(this)) {
                l0Var3 = null;
            }
            if (l0Var4 != null && !l0Var4.f1756c.contains(this)) {
                l0Var4 = null;
            }
            if (l0Var3 != null || l0Var4 != null) {
                if ((l0Var3 == null || l0Var4 == null || r(l0Var3, l0Var4)) && (k = k(viewGroup, l0Var3, l0Var4)) != null) {
                    if (l0Var4 != null) {
                        View view2 = l0Var4.f1755b;
                        String[] p = p();
                        if (p != null && p.length > 0) {
                            l0Var2 = new l0(view2);
                            l0 l0Var5 = m0Var2.f1759a.get(view2);
                            if (l0Var5 != null) {
                                int i3 = 0;
                                while (i3 < p.length) {
                                    l0Var2.f1754a.put(p[i3], l0Var5.f1754a.get(p[i3]));
                                    i3++;
                                    k = k;
                                    size = size;
                                    l0Var5 = l0Var5;
                                }
                            }
                            Animator animator3 = k;
                            i = size;
                            int i4 = o.f915d;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator2 = animator3;
                                    break;
                                }
                                y yVar = o.get(o.h(i5));
                                if (yVar.f1789c != null && yVar.f1787a == view2 && yVar.f1788b.equals(this.f1727b) && yVar.f1789c.equals(l0Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator2 = k;
                            l0Var2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        l0Var = l0Var2;
                    } else {
                        i = size;
                        view = l0Var3.f1755b;
                        animator = k;
                        l0Var = null;
                    }
                    if (animator != null) {
                        String str = this.f1727b;
                        w0 w0Var = q0.f1772a;
                        o.put(animator, new y(view, str, this, new a1(viewGroup), l0Var));
                        this.s.add(animator);
                    }
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.s.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay(animator4.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public void m() {
        int i = this.o - 1;
        this.o = i;
        if (i == 0) {
            ArrayList<a0> arrayList = this.r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.r.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((a0) arrayList2.get(i2)).e(this);
                }
            }
            for (int i3 = 0; i3 < this.h.f1761c.h(); i3++) {
                View i4 = this.h.f1761c.i(i3);
                if (i4 != null) {
                    WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
                    i4.setHasTransientState(false);
                }
            }
            for (int i5 = 0; i5 < this.i.f1761c.h(); i5++) {
                View i6 = this.i.f1761c.i(i5);
                if (i6 != null) {
                    WeakHashMap<View, b.h.j.y> weakHashMap2 = b.h.j.u.f1311a;
                    i6.setHasTransientState(false);
                }
            }
            this.q = true;
        }
    }

    public l0 n(View view, boolean z) {
        j0 j0Var = this.j;
        if (j0Var != null) {
            return j0Var.n(view, z);
        }
        ArrayList<l0> arrayList = z ? this.l : this.m;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            l0 l0Var = arrayList.get(i2);
            if (l0Var == null) {
                return null;
            }
            if (l0Var.f1755b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            return (z ? this.m : this.l).get(i);
        }
        return null;
    }

    public String[] p() {
        return null;
    }

    public l0 q(View view, boolean z) {
        j0 j0Var = this.j;
        if (j0Var != null) {
            return j0Var.q(view, z);
        }
        return (z ? this.h : this.i).f1759a.getOrDefault(view, null);
    }

    public boolean r(l0 l0Var, l0 l0Var2) {
        if (l0Var == null || l0Var2 == null) {
            return false;
        }
        String[] p = p();
        if (p == null) {
            Iterator<String> it = l0Var.f1754a.keySet().iterator();
            while (it.hasNext()) {
                if (t(l0Var, l0Var2, it.next())) {
                }
            }
            return false;
        }
        for (String str : p) {
            if (!t(l0Var, l0Var2, str)) {
            }
        }
        return false;
        return true;
    }

    public boolean s(View view) {
        return (this.f1731f.size() == 0 && this.g.size() == 0) || this.f1731f.contains(Integer.valueOf(view.getId())) || this.g.contains(view);
    }

    public String toString() {
        return G("");
    }

    public void u(View view) {
        if (this.q) {
            return;
        }
        b.e.b<Animator, y> o = o();
        int i = o.f915d;
        w0 w0Var = q0.f1772a;
        a1 a1Var = new a1(view);
        for (int i2 = i - 1; i2 >= 0; i2--) {
            y k = o.k(i2);
            if (k.f1787a != null && a1Var.equals(k.f1790d)) {
                o.h(i2).pause();
            }
        }
        ArrayList<a0> arrayList = this.r;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.r.clone();
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((a0) arrayList2.get(i3)).a(this);
            }
        }
        this.p = true;
    }

    public b0 v(a0 a0Var) {
        ArrayList<a0> arrayList = this.r;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(a0Var);
        if (this.r.size() == 0) {
            this.r = null;
        }
        return this;
    }

    public b0 w(View view) {
        this.g.remove(view);
        return this;
    }

    public void x(View view) {
        if (this.p) {
            if (!this.q) {
                b.e.b<Animator, y> o = o();
                int i = o.f915d;
                w0 w0Var = q0.f1772a;
                a1 a1Var = new a1(view);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    y k = o.k(i2);
                    if (k.f1787a != null && a1Var.equals(k.f1790d)) {
                        o.h(i2).resume();
                    }
                }
                ArrayList<a0> arrayList = this.r;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.r.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((a0) arrayList2.get(i3)).b(this);
                    }
                }
            }
            this.p = false;
        }
    }

    public void y() {
        F();
        b.e.b<Animator, y> o = o();
        Iterator<Animator> it = this.s.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (o.containsKey(next)) {
                F();
                if (next != null) {
                    next.addListener(new w(this, o));
                    long j = this.f1729d;
                    if (j >= 0) {
                        next.setDuration(j);
                    }
                    long j2 = this.f1728c;
                    if (j2 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f1730e;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new x(this));
                    next.start();
                }
            }
        }
        this.s.clear();
        m();
    }

    public b0 z(long j) {
        this.f1729d = j;
        return this;
    }
}
