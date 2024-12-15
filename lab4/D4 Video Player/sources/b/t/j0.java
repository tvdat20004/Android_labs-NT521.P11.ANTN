package b.t;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class j0 extends b0 {
    public int A;
    public ArrayList<b0> y = new ArrayList<>();
    public boolean z = true;
    public boolean B = false;
    public int C = 0;

    @Override // b.t.b0
    public void A(z zVar) {
        this.t = zVar;
        this.C |= 8;
        int size = this.y.size();
        for (int i = 0; i < size; i++) {
            this.y.get(i).A(zVar);
        }
    }

    @Override // b.t.b0
    public /* bridge */ /* synthetic */ b0 B(TimeInterpolator timeInterpolator) {
        K(timeInterpolator);
        return this;
    }

    @Override // b.t.b0
    public void C(v vVar) {
        this.u = vVar == null ? b0.w : vVar;
        this.C |= 4;
        if (this.y != null) {
            for (int i = 0; i < this.y.size(); i++) {
                this.y.get(i).C(vVar);
            }
        }
    }

    @Override // b.t.b0
    public void D(g0 g0Var) {
        this.C |= 2;
        int size = this.y.size();
        for (int i = 0; i < size; i++) {
            this.y.get(i).D(g0Var);
        }
    }

    @Override // b.t.b0
    public b0 E(long j) {
        this.f1728c = j;
        return this;
    }

    @Override // b.t.b0
    public String G(String str) {
        String G = super.G(str);
        for (int i = 0; i < this.y.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(G);
            sb.append("\n");
            sb.append(this.y.get(i).G(str + "  "));
            G = sb.toString();
        }
        return G;
    }

    public j0 H(b0 b0Var) {
        this.y.add(b0Var);
        b0Var.j = this;
        long j = this.f1729d;
        if (j >= 0) {
            b0Var.z(j);
        }
        if ((this.C & 1) != 0) {
            b0Var.B(this.f1730e);
        }
        if ((this.C & 2) != 0) {
            b0Var.D(null);
        }
        if ((this.C & 4) != 0) {
            b0Var.C(this.u);
        }
        if ((this.C & 8) != 0) {
            b0Var.A(this.t);
        }
        return this;
    }

    public b0 I(int i) {
        if (i < 0 || i >= this.y.size()) {
            return null;
        }
        return this.y.get(i);
    }

    public j0 J(long j) {
        ArrayList<b0> arrayList;
        this.f1729d = j;
        if (j >= 0 && (arrayList = this.y) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.y.get(i).z(j);
            }
        }
        return this;
    }

    public j0 K(TimeInterpolator timeInterpolator) {
        this.C |= 1;
        ArrayList<b0> arrayList = this.y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.y.get(i).B(timeInterpolator);
            }
        }
        this.f1730e = timeInterpolator;
        return this;
    }

    public j0 L(int i) {
        if (i == 0) {
            this.z = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(c.a.a.a.a.b("Invalid parameter for TransitionSet ordering: ", i));
            }
            this.z = false;
        }
        return this;
    }

    @Override // b.t.b0
    public b0 a(a0 a0Var) {
        super.a(a0Var);
        return this;
    }

    @Override // b.t.b0
    public b0 b(View view) {
        for (int i = 0; i < this.y.size(); i++) {
            this.y.get(i).b(view);
        }
        this.g.add(view);
        return this;
    }

    @Override // b.t.b0
    public void d(l0 l0Var) {
        if (s(l0Var.f1755b)) {
            Iterator<b0> it = this.y.iterator();
            while (it.hasNext()) {
                b0 next = it.next();
                if (next.s(l0Var.f1755b)) {
                    next.d(l0Var);
                    l0Var.f1756c.add(next);
                }
            }
        }
    }

    @Override // b.t.b0
    public void f(l0 l0Var) {
        int size = this.y.size();
        for (int i = 0; i < size; i++) {
            this.y.get(i).f(l0Var);
        }
    }

    @Override // b.t.b0
    public void g(l0 l0Var) {
        if (s(l0Var.f1755b)) {
            Iterator<b0> it = this.y.iterator();
            while (it.hasNext()) {
                b0 next = it.next();
                if (next.s(l0Var.f1755b)) {
                    next.g(l0Var);
                    l0Var.f1756c.add(next);
                }
            }
        }
    }

    @Override // b.t.b0
    /* renamed from: j */
    public b0 clone() {
        j0 j0Var = (j0) super.clone();
        j0Var.y = new ArrayList<>();
        int size = this.y.size();
        for (int i = 0; i < size; i++) {
            b0 clone = this.y.get(i).clone();
            j0Var.y.add(clone);
            clone.j = j0Var;
        }
        return j0Var;
    }

    @Override // b.t.b0
    public void l(ViewGroup viewGroup, m0 m0Var, m0 m0Var2, ArrayList<l0> arrayList, ArrayList<l0> arrayList2) {
        long j = this.f1728c;
        int size = this.y.size();
        for (int i = 0; i < size; i++) {
            b0 b0Var = this.y.get(i);
            if (j > 0 && (this.z || i == 0)) {
                long j2 = b0Var.f1728c;
                if (j2 > 0) {
                    b0Var.E(j2 + j);
                } else {
                    b0Var.E(j);
                }
            }
            b0Var.l(viewGroup, m0Var, m0Var2, arrayList, arrayList2);
        }
    }

    @Override // b.t.b0
    public void u(View view) {
        super.u(view);
        int size = this.y.size();
        for (int i = 0; i < size; i++) {
            this.y.get(i).u(view);
        }
    }

    @Override // b.t.b0
    public b0 v(a0 a0Var) {
        super.v(a0Var);
        return this;
    }

    @Override // b.t.b0
    public b0 w(View view) {
        for (int i = 0; i < this.y.size(); i++) {
            this.y.get(i).w(view);
        }
        this.g.remove(view);
        return this;
    }

    @Override // b.t.b0
    public void x(View view) {
        super.x(view);
        int size = this.y.size();
        for (int i = 0; i < size; i++) {
            this.y.get(i).x(view);
        }
    }

    @Override // b.t.b0
    public void y() {
        if (this.y.isEmpty()) {
            F();
            m();
            return;
        }
        i0 i0Var = new i0(this);
        Iterator<b0> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().a(i0Var);
        }
        this.A = this.y.size();
        if (this.z) {
            Iterator<b0> it2 = this.y.iterator();
            while (it2.hasNext()) {
                it2.next().y();
            }
            return;
        }
        for (int i = 1; i < this.y.size(); i++) {
            this.y.get(i - 1).a(new h0(this, this.y.get(i)));
        }
        b0 b0Var = this.y.get(0);
        if (b0Var != null) {
            b0Var.y();
        }
    }

    @Override // b.t.b0
    public /* bridge */ /* synthetic */ b0 z(long j) {
        J(j);
        return this;
    }
}
