package b.r.b;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final b.e.i<RecyclerView.a0, w0> f1711a = new b.e.i<>();

    /* renamed from: b, reason: collision with root package name */
    public final b.e.f<RecyclerView.a0> f1712b = new b.e.f<>();

    public interface a {
    }

    public void a(RecyclerView.a0 a0Var) {
        w0 orDefault = this.f1711a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = w0.a();
            this.f1711a.put(a0Var, orDefault);
        }
        orDefault.f1708a |= 1;
    }

    public void b(RecyclerView.a0 a0Var, RecyclerView.j.b bVar) {
        w0 orDefault = this.f1711a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = w0.a();
            this.f1711a.put(a0Var, orDefault);
        }
        orDefault.f1710c = bVar;
        orDefault.f1708a |= 8;
    }

    public void c(RecyclerView.a0 a0Var, RecyclerView.j.b bVar) {
        w0 orDefault = this.f1711a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = w0.a();
            this.f1711a.put(a0Var, orDefault);
        }
        orDefault.f1709b = bVar;
        orDefault.f1708a |= 4;
    }

    public boolean d(RecyclerView.a0 a0Var) {
        w0 orDefault = this.f1711a.getOrDefault(a0Var, null);
        return (orDefault == null || (orDefault.f1708a & 1) == 0) ? false : true;
    }

    public final RecyclerView.j.b e(RecyclerView.a0 a0Var, int i) {
        w0 k;
        RecyclerView.j.b bVar;
        int e2 = this.f1711a.e(a0Var);
        if (e2 >= 0 && (k = this.f1711a.k(e2)) != null) {
            int i2 = k.f1708a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                k.f1708a = i3;
                if (i == 4) {
                    bVar = k.f1709b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = k.f1710c;
                }
                if ((i3 & 12) == 0) {
                    this.f1711a.i(e2);
                    w0.b(k);
                }
                return bVar;
            }
        }
        return null;
    }

    public void f(RecyclerView.a0 a0Var) {
        w0 orDefault = this.f1711a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f1708a &= -2;
    }

    public void g(RecyclerView.a0 a0Var) {
        int h = this.f1712b.h() - 1;
        while (true) {
            if (h < 0) {
                break;
            }
            if (a0Var == this.f1712b.i(h)) {
                b.e.f<RecyclerView.a0> fVar = this.f1712b;
                Object[] objArr = fVar.f888d;
                Object obj = objArr[h];
                Object obj2 = b.e.f.f885f;
                if (obj != obj2) {
                    objArr[h] = obj2;
                    fVar.f886b = true;
                }
            } else {
                h--;
            }
        }
        w0 remove = this.f1711a.remove(a0Var);
        if (remove != null) {
            w0.b(remove);
        }
    }
}
