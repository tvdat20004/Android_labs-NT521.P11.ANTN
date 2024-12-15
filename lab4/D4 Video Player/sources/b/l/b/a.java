package b.l.b;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<m0> f1368a;

    /* renamed from: b, reason: collision with root package name */
    public int f1369b;

    /* renamed from: c, reason: collision with root package name */
    public int f1370c;

    /* renamed from: d, reason: collision with root package name */
    public int f1371d;

    /* renamed from: e, reason: collision with root package name */
    public int f1372e;

    /* renamed from: f, reason: collision with root package name */
    public int f1373f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList<String> n;
    public ArrayList<String> o;
    public boolean p;
    public final z q;
    public boolean r;
    public int s;

    public a(z zVar) {
        zVar.K();
        h<?> hVar = zVar.o;
        if (hVar != null) {
            hVar.f1411c.getClassLoader();
        }
        this.f1368a = new ArrayList<>();
        this.h = true;
        this.p = false;
        this.s = -1;
        this.q = zVar;
    }

    public static boolean l(m0 m0Var) {
        Fragment fragment = m0Var.f1444b;
        if (fragment == null || !fragment.k || fragment.E == null || fragment.z || fragment.y) {
            return false;
        }
        f fVar = fragment.H;
        return false;
    }

    @Override // b.l.b.a0
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (z.M(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        z zVar = this.q;
        if (zVar.f1515d == null) {
            zVar.f1515d = new ArrayList<>();
        }
        zVar.f1515d.add(this);
        return true;
    }

    public void b(m0 m0Var) {
        this.f1368a.add(m0Var);
        m0Var.f1445c = this.f1369b;
        m0Var.f1446d = this.f1370c;
        m0Var.f1447e = this.f1371d;
        m0Var.f1448f = this.f1372e;
    }

    public void c(int i) {
        if (this.g) {
            if (z.M(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f1368a.size();
            for (int i2 = 0; i2 < size; i2++) {
                m0 m0Var = this.f1368a.get(i2);
                Fragment fragment = m0Var.f1444b;
                if (fragment != null) {
                    fragment.q += i;
                    if (z.M(2)) {
                        StringBuilder j = c.a.a.a.a.j("Bump nesting of ");
                        j.append(m0Var.f1444b);
                        j.append(" to ");
                        j.append(m0Var.f1444b.q);
                        Log.v("FragmentManager", j.toString());
                    }
                }
            }
        }
    }

    public int d() {
        return e(false);
    }

    public int e(boolean z) {
        if (this.r) {
            throw new IllegalStateException("commit already called");
        }
        if (z.M(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new b.h.i.a("FragmentManager"));
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        this.s = this.g ? this.q.i.getAndIncrement() : -1;
        this.q.z(this, z);
        return this.s;
    }

    public void f(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder j = c.a.a.a.a.j("Fragment ");
            j.append(cls.getCanonicalName());
            j.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(j.toString());
        }
        if (str != null) {
            String str2 = fragment.x;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.x + " now " + str);
            }
            fragment.x = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.v;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.v + " now " + i);
            }
            fragment.v = i;
            fragment.w = i;
        }
        b(new m0(i2, fragment));
        fragment.r = this.q;
    }

    public void g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f1373f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1373f));
            }
            if (this.f1369b != 0 || this.f1370c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1369b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1370c));
            }
            if (this.f1371d != 0 || this.f1372e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1371d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1372e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        if (this.f1368a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f1368a.size();
        for (int i = 0; i < size; i++) {
            m0 m0Var = this.f1368a.get(i);
            switch (m0Var.f1443a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder j = c.a.a.a.a.j("cmd=");
                    j.append(m0Var.f1443a);
                    str2 = j.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(m0Var.f1444b);
            if (z) {
                if (m0Var.f1445c != 0 || m0Var.f1446d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(m0Var.f1445c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(m0Var.f1446d));
                }
                if (m0Var.f1447e != 0 || m0Var.f1448f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(m0Var.f1447e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(m0Var.f1448f));
                }
            }
        }
    }

    public void h() {
        int size = this.f1368a.size();
        for (int i = 0; i < size; i++) {
            m0 m0Var = this.f1368a.get(i);
            Fragment fragment = m0Var.f1444b;
            if (fragment != null) {
                int i2 = this.f1373f;
                if (fragment.H != null || i2 != 0) {
                    fragment.c();
                    fragment.H.f1402e = i2;
                }
            }
            switch (m0Var.f1443a) {
                case 1:
                    fragment.l0(m0Var.f1445c);
                    this.q.d0(fragment, false);
                    this.q.b(fragment);
                    break;
                case 2:
                default:
                    StringBuilder j = c.a.a.a.a.j("Unknown cmd: ");
                    j.append(m0Var.f1443a);
                    throw new IllegalArgumentException(j.toString());
                case 3:
                    fragment.l0(m0Var.f1446d);
                    this.q.X(fragment);
                    break;
                case 4:
                    fragment.l0(m0Var.f1446d);
                    this.q.L(fragment);
                    break;
                case 5:
                    fragment.l0(m0Var.f1445c);
                    this.q.d0(fragment, false);
                    this.q.h0(fragment);
                    break;
                case 6:
                    fragment.l0(m0Var.f1446d);
                    this.q.i(fragment);
                    break;
                case 7:
                    fragment.l0(m0Var.f1445c);
                    this.q.d0(fragment, false);
                    this.q.d(fragment);
                    break;
                case 8:
                    this.q.f0(fragment);
                    break;
                case 9:
                    this.q.f0(null);
                    break;
                case 10:
                    this.q.e0(fragment, m0Var.h);
                    break;
            }
            if (!this.p && m0Var.f1443a != 1 && fragment != null) {
                this.q.R(fragment);
            }
        }
        if (this.p) {
            return;
        }
        z zVar = this.q;
        zVar.S(zVar.n, true);
    }

    public void i(boolean z) {
        for (int size = this.f1368a.size() - 1; size >= 0; size--) {
            m0 m0Var = this.f1368a.get(size);
            Fragment fragment = m0Var.f1444b;
            if (fragment != null) {
                int i = this.f1373f;
                int i2 = i != 4097 ? i != 4099 ? i != 8194 ? 0 : 4097 : 4099 : 8194;
                if (fragment.H != null || i2 != 0) {
                    fragment.c();
                    fragment.H.f1402e = i2;
                }
            }
            switch (m0Var.f1443a) {
                case 1:
                    fragment.l0(m0Var.f1448f);
                    this.q.d0(fragment, true);
                    this.q.X(fragment);
                    break;
                case 2:
                default:
                    StringBuilder j = c.a.a.a.a.j("Unknown cmd: ");
                    j.append(m0Var.f1443a);
                    throw new IllegalArgumentException(j.toString());
                case 3:
                    fragment.l0(m0Var.f1447e);
                    this.q.b(fragment);
                    break;
                case 4:
                    fragment.l0(m0Var.f1447e);
                    this.q.h0(fragment);
                    break;
                case 5:
                    fragment.l0(m0Var.f1448f);
                    this.q.d0(fragment, true);
                    this.q.L(fragment);
                    break;
                case 6:
                    fragment.l0(m0Var.f1447e);
                    this.q.d(fragment);
                    break;
                case 7:
                    fragment.l0(m0Var.f1448f);
                    this.q.d0(fragment, true);
                    this.q.i(fragment);
                    break;
                case 8:
                    this.q.f0(null);
                    break;
                case 9:
                    this.q.f0(fragment);
                    break;
                case 10:
                    this.q.e0(fragment, m0Var.g);
                    break;
            }
            if (!this.p && m0Var.f1443a != 3 && fragment != null) {
                this.q.R(fragment);
            }
        }
        if (this.p || !z) {
            return;
        }
        z zVar = this.q;
        zVar.S(zVar.n, true);
    }

    public boolean j(int i) {
        int size = this.f1368a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f1368a.get(i2).f1444b;
            int i3 = fragment != null ? fragment.w : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public boolean k(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f1368a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f1368a.get(i4).f1444b;
            int i5 = fragment != null ? fragment.w : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.f1368a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f1368a.get(i7).f1444b;
                        if ((fragment2 != null ? fragment2.w : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public a m(int i, Fragment fragment) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        f(i, fragment, null, 2);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}
