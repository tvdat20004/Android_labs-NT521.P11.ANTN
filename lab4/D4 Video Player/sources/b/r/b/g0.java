package b.r.b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b.r.b.a;

/* loaded from: classes.dex */
public class g0 implements a.InterfaceC0004a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1621a;

    public g0(RecyclerView recyclerView) {
        this.f1621a = recyclerView;
    }

    public void a(a.b bVar) {
        int i = bVar.f1597a;
        if (i == 1) {
            RecyclerView recyclerView = this.f1621a;
            recyclerView.n.n0(recyclerView, bVar.f1598b, bVar.f1600d);
            return;
        }
        if (i == 2) {
            RecyclerView recyclerView2 = this.f1621a;
            recyclerView2.n.q0(recyclerView2, bVar.f1598b, bVar.f1600d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.f1621a;
            recyclerView3.n.s0(recyclerView3, bVar.f1598b, bVar.f1600d, bVar.f1599c);
        } else {
            if (i != 8) {
                return;
            }
            RecyclerView recyclerView4 = this.f1621a;
            recyclerView4.n.p0(recyclerView4, bVar.f1598b, bVar.f1600d, 1);
        }
    }

    public RecyclerView.a0 b(int i) {
        RecyclerView recyclerView = this.f1621a;
        int h = recyclerView.f303f.h();
        int i2 = 0;
        RecyclerView.a0 a0Var = null;
        while (true) {
            if (i2 >= h) {
                break;
            }
            RecyclerView.a0 K = RecyclerView.K(recyclerView.f303f.g(i2));
            if (K != null && !K.m() && K.f307c == i) {
                if (!recyclerView.f303f.k(K.f305a)) {
                    a0Var = K;
                    break;
                }
                a0Var = K;
            }
            i2++;
        }
        if (a0Var == null || this.f1621a.f303f.k(a0Var.f305a)) {
            return null;
        }
        return a0Var;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f1621a;
        int h = recyclerView.f303f.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            View g = recyclerView.f303f.g(i6);
            RecyclerView.a0 K = RecyclerView.K(g);
            if (K != null && !K.u() && (i4 = K.f307c) >= i && i4 < i5) {
                K.b(2);
                K.a(obj);
                ((RecyclerView.n) g.getLayoutParams()).f336c = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f300c;
        int size = sVar.f342c.size();
        while (true) {
            size--;
            if (size < 0) {
                this.f1621a.l0 = true;
                return;
            }
            RecyclerView.a0 a0Var = sVar.f342c.get(size);
            if (a0Var != null && (i3 = a0Var.f307c) >= i && i3 < i5) {
                a0Var.b(2);
                sVar.f(size);
            }
        }
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f1621a;
        int h = recyclerView.f303f.h();
        for (int i3 = 0; i3 < h; i3++) {
            RecyclerView.a0 K = RecyclerView.K(recyclerView.f303f.g(i3));
            if (K != null && !K.u() && K.f307c >= i) {
                K.q(i2, false);
                recyclerView.h0.f359f = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f300c;
        int size = sVar.f342c.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.a0 a0Var = sVar.f342c.get(i4);
            if (a0Var != null && a0Var.f307c >= i) {
                a0Var.q(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.f1621a.k0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f1621a;
        int h = recyclerView.f303f.h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < h; i11++) {
            RecyclerView.a0 K = RecyclerView.K(recyclerView.f303f.g(i11));
            if (K != null && (i9 = K.f307c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    K.q(i2 - i, false);
                } else {
                    K.q(i5, false);
                }
                recyclerView.h0.f359f = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f300c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = sVar.f342c.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.a0 a0Var = sVar.f342c.get(i12);
            if (a0Var != null && (i8 = a0Var.f307c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    a0Var.q(i2 - i, false);
                } else {
                    a0Var.q(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f1621a.k0 = true;
    }
}
