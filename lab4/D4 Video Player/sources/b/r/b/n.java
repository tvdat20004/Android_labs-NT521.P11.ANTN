package b.r.b;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class n extends RecyclerView.j {
    public static TimeInterpolator s;
    public boolean g = true;
    public ArrayList<RecyclerView.a0> h = new ArrayList<>();
    public ArrayList<RecyclerView.a0> i = new ArrayList<>();
    public ArrayList<m> j = new ArrayList<>();
    public ArrayList<l> k = new ArrayList<>();
    public ArrayList<ArrayList<RecyclerView.a0>> l = new ArrayList<>();
    public ArrayList<ArrayList<m>> m = new ArrayList<>();
    public ArrayList<ArrayList<l>> n = new ArrayList<>();
    public ArrayList<RecyclerView.a0> o = new ArrayList<>();
    public ArrayList<RecyclerView.a0> p = new ArrayList<>();
    public ArrayList<RecyclerView.a0> q = new ArrayList<>();
    public ArrayList<RecyclerView.a0> r = new ArrayList<>();

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public boolean a(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, RecyclerView.j.b bVar, RecyclerView.j.b bVar2) {
        int i;
        int i2;
        int i3 = bVar.f321a;
        int i4 = bVar.f322b;
        if (a0Var2.u()) {
            int i5 = bVar.f321a;
            i2 = bVar.f322b;
            i = i5;
        } else {
            i = bVar2.f321a;
            i2 = bVar2.f322b;
        }
        if (a0Var == a0Var2) {
            return i(a0Var, i3, i4, i, i2);
        }
        float translationX = a0Var.f305a.getTranslationX();
        float translationY = a0Var.f305a.getTranslationY();
        float alpha = a0Var.f305a.getAlpha();
        n(a0Var);
        a0Var.f305a.setTranslationX(translationX);
        a0Var.f305a.setTranslationY(translationY);
        a0Var.f305a.setAlpha(alpha);
        n(a0Var2);
        a0Var2.f305a.setTranslationX(-((int) ((i - i3) - translationX)));
        a0Var2.f305a.setTranslationY(-((int) ((i2 - i4) - translationY)));
        a0Var2.f305a.setAlpha(0.0f);
        this.k.add(new l(a0Var, a0Var2, i3, i4, i, i2));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void e(RecyclerView.a0 a0Var) {
        View view = a0Var.f305a;
        view.animate().cancel();
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.j.get(size).f1652a == a0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(a0Var);
                this.j.remove(size);
            }
        }
        l(this.k, a0Var);
        if (this.h.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        if (this.i.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        int size2 = this.n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<l> arrayList = this.n.get(size2);
            l(arrayList, a0Var);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        int size3 = this.m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<m> arrayList2 = this.m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f1652a == a0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(a0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.l.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.q.remove(a0Var);
                this.o.remove(a0Var);
                this.r.remove(a0Var);
                this.p.remove(a0Var);
                k();
                return;
            }
            ArrayList<RecyclerView.a0> arrayList3 = this.l.get(size5);
            if (arrayList3.remove(a0Var)) {
                view.setAlpha(1.0f);
                c(a0Var);
                if (arrayList3.isEmpty()) {
                    this.l.remove(size5);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void f() {
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            m mVar = this.j.get(size);
            View view = mVar.f1652a.f305a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(mVar.f1652a);
            this.j.remove(size);
        }
        int size2 = this.h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c(this.h.get(size2));
            this.h.remove(size2);
        }
        int size3 = this.i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.a0 a0Var = this.i.get(size3);
            a0Var.f305a.setAlpha(1.0f);
            c(a0Var);
            this.i.remove(size3);
        }
        int size4 = this.k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            l lVar = this.k.get(size4);
            RecyclerView.a0 a0Var2 = lVar.f1646a;
            if (a0Var2 != null) {
                m(lVar, a0Var2);
            }
            RecyclerView.a0 a0Var3 = lVar.f1647b;
            if (a0Var3 != null) {
                m(lVar, a0Var3);
            }
        }
        this.k.clear();
        if (!g()) {
            return;
        }
        int size5 = this.m.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<m> arrayList = this.m.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    m mVar2 = arrayList.get(size6);
                    View view2 = mVar2.f1652a.f305a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(mVar2.f1652a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.m.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.l.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.a0> arrayList2 = this.l.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.a0 a0Var4 = arrayList2.get(size8);
                    a0Var4.f305a.setAlpha(1.0f);
                    c(a0Var4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.l.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.n.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                j(this.q);
                j(this.p);
                j(this.o);
                j(this.r);
                d();
                return;
            }
            ArrayList<l> arrayList3 = this.n.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    l lVar2 = arrayList3.get(size10);
                    RecyclerView.a0 a0Var5 = lVar2.f1646a;
                    if (a0Var5 != null) {
                        m(lVar2, a0Var5);
                    }
                    RecyclerView.a0 a0Var6 = lVar2.f1647b;
                    if (a0Var6 != null) {
                        m(lVar2, a0Var6);
                    }
                    if (arrayList3.isEmpty()) {
                        this.n.remove(arrayList3);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public boolean g() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public boolean i(RecyclerView.a0 a0Var, int i, int i2, int i3, int i4) {
        View view = a0Var.f305a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) a0Var.f305a.getTranslationY());
        n(a0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(a0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.j.add(new m(a0Var, translationX, translationY, i3, i4));
        return true;
    }

    public void j(List<RecyclerView.a0> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                list.get(size).f305a.animate().cancel();
            }
        }
    }

    public void k() {
        if (g()) {
            return;
        }
        d();
    }

    public final void l(List<l> list, RecyclerView.a0 a0Var) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            l lVar = list.get(size);
            if (m(lVar, a0Var) && lVar.f1646a == null && lVar.f1647b == null) {
                list.remove(lVar);
            }
        }
    }

    public final boolean m(l lVar, RecyclerView.a0 a0Var) {
        if (lVar.f1647b == a0Var) {
            lVar.f1647b = null;
        } else {
            if (lVar.f1646a != a0Var) {
                return false;
            }
            lVar.f1646a = null;
        }
        a0Var.f305a.setAlpha(1.0f);
        a0Var.f305a.setTranslationX(0.0f);
        a0Var.f305a.setTranslationY(0.0f);
        c(a0Var);
        return true;
    }

    public final void n(RecyclerView.a0 a0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        a0Var.f305a.animate().setInterpolator(s);
        e(a0Var);
    }
}
