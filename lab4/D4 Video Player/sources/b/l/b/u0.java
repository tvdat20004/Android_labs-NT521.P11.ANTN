package b.l.b;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1492a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    public static final e1 f1493b = new a1();

    /* renamed from: c, reason: collision with root package name */
    public static final e1 f1494c;

    static {
        e1 e1Var;
        try {
            e1Var = (e1) Class.forName("b.t.s").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            e1Var = null;
        }
        f1494c = e1Var;
    }

    public static void a(ArrayList<View> arrayList, b.e.b<String, View> bVar, Collection<String> collection) {
        for (int i = bVar.f915d - 1; i >= 0; i--) {
            View k = bVar.k(i);
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            if (collection.contains(k.getTransitionName())) {
                arrayList.add(k);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0087, code lost:
    
        if (r0.y == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0039, code lost:
    
        if (r0.k != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0089, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0075, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(b.l.b.a r8, b.l.b.m0 r9, android.util.SparseArray<b.l.b.t0> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.b.u0.b(b.l.b.a, b.l.b.m0, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(Fragment fragment, Fragment fragment2, boolean z, b.e.b<String, View> bVar, boolean z2) {
        if (z) {
            fragment2.k();
        } else {
            fragment.k();
        }
    }

    public static boolean d(e1 e1Var, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!e1Var.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static b.e.b<String, View> e(e1 e1Var, b.e.b<String, String> bVar, Object obj, t0 t0Var) {
        ArrayList<String> arrayList;
        Fragment fragment = t0Var.f1483a;
        View view = fragment.E;
        if (bVar.isEmpty() || obj == null || view == null) {
            bVar.clear();
            return null;
        }
        b.e.b<String, View> bVar2 = new b.e.b<>();
        e1Var.i(bVar2, view);
        a aVar = t0Var.f1485c;
        if (t0Var.f1484b) {
            fragment.m();
            arrayList = aVar.n;
        } else {
            fragment.k();
            arrayList = aVar.o;
        }
        if (arrayList != null) {
            b.e.h.k(bVar2, arrayList);
            b.e.h.k(bVar2, bVar.values());
        }
        int i = bVar.f915d;
        while (true) {
            i--;
            if (i < 0) {
                return bVar2;
            }
            if (!bVar2.containsKey(bVar.k(i))) {
                bVar.i(i);
            }
        }
    }

    public static b.e.b<String, View> f(e1 e1Var, b.e.b<String, String> bVar, Object obj, t0 t0Var) {
        ArrayList<String> arrayList;
        if (bVar.isEmpty() || obj == null) {
            bVar.clear();
            return null;
        }
        Fragment fragment = t0Var.f1486d;
        b.e.b<String, View> bVar2 = new b.e.b<>();
        e1Var.i(bVar2, fragment.f0());
        a aVar = t0Var.f1488f;
        if (t0Var.f1487e) {
            fragment.k();
            arrayList = aVar.o;
        } else {
            fragment.m();
            arrayList = aVar.n;
        }
        if (arrayList != null) {
            b.e.h.k(bVar2, arrayList);
        }
        b.e.h.k(bVar, bVar2.keySet());
        return bVar2;
    }

    public static e1 g(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            fragment.l();
            Object s = fragment.s();
            if (s != null) {
                arrayList.add(s);
            }
            Object u = fragment.u();
            if (u != null) {
                arrayList.add(u);
            }
        }
        if (fragment2 != null) {
            fragment2.j();
            Object q = fragment2.q();
            if (q != null) {
                arrayList.add(q);
            }
            fragment2.t();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        e1 e1Var = f1493b;
        if (d(e1Var, arrayList)) {
            return e1Var;
        }
        e1 e1Var2 = f1494c;
        if (e1Var2 == null || !d(e1Var2, arrayList)) {
            throw new IllegalArgumentException("Invalid Transition types");
        }
        return e1Var2;
    }

    public static ArrayList<View> h(e1 e1Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.E;
        if (view2 != null) {
            e1Var.f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        e1Var.b(obj, arrayList2);
        return arrayList2;
    }

    public static Object i(e1 e1Var, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.q();
        } else {
            fragment.j();
        }
        return e1Var.g(obj);
    }

    public static Object j(e1 e1Var, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.s();
        } else {
            fragment.l();
        }
        return e1Var.g(obj);
    }

    public static View k(b.e.b<String, View> bVar, t0 t0Var, Object obj, boolean z) {
        ArrayList<String> arrayList;
        a aVar = t0Var.f1485c;
        if (obj == null || bVar == null || (arrayList = aVar.n) == null || arrayList.isEmpty()) {
            return null;
        }
        return bVar.get((z ? aVar.n : aVar.o).get(0));
    }

    public static Object l(e1 e1Var, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (z) {
            obj = fragment2.u();
        } else {
            fragment.t();
            obj = null;
        }
        return e1Var.v(e1Var.g(obj));
    }

    public static void m(e1 e1Var, Object obj, Object obj2, b.e.b<String, View> bVar, boolean z, a aVar) {
        ArrayList<String> arrayList = aVar.n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = bVar.get((z ? aVar.o : aVar.n).get(0));
        e1Var.r(obj, view);
        if (obj2 != null) {
            e1Var.r(obj2, view);
        }
    }

    public static void n(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x047d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0239  */
    /* JADX WARN: Type inference failed for: r9v13, types: [b.e.i] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o(b.l.b.z r38, java.util.ArrayList<b.l.b.a> r39, java.util.ArrayList<java.lang.Boolean> r40, int r41, int r42, boolean r43, b.l.b.v r44) {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.b.u0.o(b.l.b.z, java.util.ArrayList, java.util.ArrayList, int, int, boolean, b.l.b.v):void");
    }
}
