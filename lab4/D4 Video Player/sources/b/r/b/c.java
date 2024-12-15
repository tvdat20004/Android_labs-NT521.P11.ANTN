package b.r.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final a f1604a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1605b = new b();

    /* renamed from: c, reason: collision with root package name */
    public final List<View> f1606c = new ArrayList();

    public interface a {
    }

    public c(a aVar) {
        this.f1604a = aVar;
    }

    public void a(View view, int i, boolean z) {
        int b2 = i < 0 ? ((f0) this.f1604a).b() : f(i);
        this.f1605b.e(b2, z);
        if (z) {
            i(view);
        }
        f0 f0Var = (f0) this.f1604a;
        f0Var.f1616a.addView(view, b2);
        RecyclerView recyclerView = f0Var.f1616a;
        Objects.requireNonNull(recyclerView);
        RecyclerView.K(view);
        recyclerView.T();
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int b2 = i < 0 ? ((f0) this.f1604a).b() : f(i);
        this.f1605b.e(b2, z);
        if (z) {
            i(view);
        }
        f0 f0Var = (f0) this.f1604a;
        Objects.requireNonNull(f0Var);
        RecyclerView.a0 K = RecyclerView.K(view);
        if (K != null) {
            if (!K.o() && !K.u()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(K);
                throw new IllegalArgumentException(c.a.a.a.a.a(f0Var.f1616a, sb));
            }
            K.j &= -257;
        }
        f0Var.f1616a.attachViewToParent(view, b2, layoutParams);
    }

    public void c(int i) {
        RecyclerView.a0 K;
        int f2 = f(i);
        this.f1605b.f(f2);
        f0 f0Var = (f0) this.f1604a;
        View childAt = f0Var.f1616a.getChildAt(f2);
        if (childAt != null && (K = RecyclerView.K(childAt)) != null) {
            if (K.o() && !K.u()) {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(K);
                throw new IllegalArgumentException(c.a.a.a.a.a(f0Var.f1616a, sb));
            }
            K.b(256);
        }
        f0Var.f1616a.detachViewFromParent(f2);
    }

    public View d(int i) {
        return ((f0) this.f1604a).a(f(i));
    }

    public int e() {
        return ((f0) this.f1604a).b() - this.f1606c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int b2 = ((f0) this.f1604a).b();
        int i2 = i;
        while (i2 < b2) {
            int b3 = i - (i2 - this.f1605b.b(i2));
            if (b3 == 0) {
                while (this.f1605b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b3;
        }
        return -1;
    }

    public View g(int i) {
        return ((f0) this.f1604a).f1616a.getChildAt(i);
    }

    public int h() {
        return ((f0) this.f1604a).b();
    }

    public final void i(View view) {
        this.f1606c.add(view);
        f0 f0Var = (f0) this.f1604a;
        Objects.requireNonNull(f0Var);
        RecyclerView.a0 K = RecyclerView.K(view);
        if (K != null) {
            RecyclerView recyclerView = f0Var.f1616a;
            int i = K.q;
            if (i == -1) {
                View view2 = K.f305a;
                WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
                i = view2.getImportantForAccessibility();
            }
            K.p = i;
            recyclerView.k0(K, 4);
        }
    }

    public int j(View view) {
        int indexOfChild = ((f0) this.f1604a).f1616a.indexOfChild(view);
        if (indexOfChild == -1 || this.f1605b.d(indexOfChild)) {
            return -1;
        }
        return indexOfChild - this.f1605b.b(indexOfChild);
    }

    public boolean k(View view) {
        return this.f1606c.contains(view);
    }

    public final boolean l(View view) {
        if (!this.f1606c.remove(view)) {
            return false;
        }
        f0 f0Var = (f0) this.f1604a;
        Objects.requireNonNull(f0Var);
        RecyclerView.a0 K = RecyclerView.K(view);
        if (K == null) {
            return true;
        }
        f0Var.f1616a.k0(K, K.p);
        K.p = 0;
        return true;
    }

    public String toString() {
        return this.f1605b.toString() + ", hidden list:" + this.f1606c.size();
    }
}
