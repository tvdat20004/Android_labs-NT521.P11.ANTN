package b.t;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import b.l.b.e1;
import java.util.ArrayList;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class s extends e1 {
    public static boolean w(b0 b0Var) {
        return (e1.k(b0Var.f1731f) && e1.k(null) && e1.k(null)) ? false : true;
    }

    @Override // b.l.b.e1
    public void a(Object obj, View view) {
        if (obj != null) {
            ((b0) obj).b(view);
        }
    }

    @Override // b.l.b.e1
    public void b(Object obj, ArrayList<View> arrayList) {
        b0 b0Var = (b0) obj;
        if (b0Var == null) {
            return;
        }
        int i = 0;
        if (b0Var instanceof j0) {
            j0 j0Var = (j0) b0Var;
            int size = j0Var.y.size();
            while (i < size) {
                b(j0Var.I(i), arrayList);
                i++;
            }
            return;
        }
        if (w(b0Var) || !e1.k(b0Var.g)) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            b0Var.b(arrayList.get(i));
            i++;
        }
    }

    @Override // b.l.b.e1
    public void c(ViewGroup viewGroup, Object obj) {
        f0.a(viewGroup, (b0) obj);
    }

    @Override // b.l.b.e1
    public boolean e(Object obj) {
        return obj instanceof b0;
    }

    @Override // b.l.b.e1
    public Object g(Object obj) {
        if (obj != null) {
            return ((b0) obj).clone();
        }
        return null;
    }

    @Override // b.l.b.e1
    public Object l(Object obj, Object obj2, Object obj3) {
        j0 j0Var = new j0();
        if (obj != null) {
            j0Var.H((b0) obj);
        }
        if (obj2 != null) {
            j0Var.H((b0) obj2);
        }
        if (obj3 != null) {
            j0Var.H((b0) obj3);
        }
        return j0Var;
    }

    @Override // b.l.b.e1
    public void m(Object obj, View view) {
        if (obj != null) {
            ((b0) obj).w(view);
        }
    }

    @Override // b.l.b.e1
    public void n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        b0 b0Var = (b0) obj;
        int i = 0;
        if (b0Var instanceof j0) {
            j0 j0Var = (j0) b0Var;
            int size = j0Var.y.size();
            while (i < size) {
                n(j0Var.I(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (w(b0Var)) {
            return;
        }
        ArrayList<View> arrayList3 = b0Var.g;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size2) {
            b0Var.b(arrayList2.get(i));
            i++;
        }
        int size3 = arrayList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                b0Var.w(arrayList.get(size3));
            }
        }
    }

    @Override // b.l.b.e1
    public void o(Object obj, View view, ArrayList<View> arrayList) {
        ((b0) obj).a(new p(this, view, arrayList));
    }

    @Override // b.l.b.e1
    public void p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((b0) obj).a(new q(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // b.l.b.e1
    public void q(Object obj, Rect rect) {
        if (obj != null) {
            ((b0) obj).A(new r(this, rect));
        }
    }

    @Override // b.l.b.e1
    public void r(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            j(view, rect);
            ((b0) obj).A(new o(this, rect));
        }
    }

    @Override // b.l.b.e1
    public void t(Object obj, View view, ArrayList<View> arrayList) {
        j0 j0Var = (j0) obj;
        ArrayList<View> arrayList2 = j0Var.g;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e1.d(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(j0Var, arrayList);
    }

    @Override // b.l.b.e1
    public void u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        j0 j0Var = (j0) obj;
        if (j0Var != null) {
            j0Var.g.clear();
            j0Var.g.addAll(arrayList2);
            n(j0Var, arrayList, arrayList2);
        }
    }

    @Override // b.l.b.e1
    public Object v(Object obj) {
        if (obj == null) {
            return null;
        }
        j0 j0Var = new j0();
        j0Var.H((b0) obj);
        return j0Var;
    }
}
