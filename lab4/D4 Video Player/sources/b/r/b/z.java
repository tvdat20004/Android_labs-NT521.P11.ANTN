package b.r.b;

import android.view.View;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class z extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f1713a;

    /* renamed from: b, reason: collision with root package name */
    public Scroller f1714b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView.q f1715c = new p0(this);

    /* renamed from: d, reason: collision with root package name */
    public e0 f1716d;

    /* renamed from: e, reason: collision with root package name */
    public e0 f1717e;

    public int[] a(RecyclerView.m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.e()) {
            iArr[0] = c(view, g(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.f()) {
            iArr[1] = c(view, h(mVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final void b() {
        RecyclerView recyclerView = this.f1713a;
        RecyclerView.q qVar = this.f1715c;
        List<RecyclerView.q> list = recyclerView.j0;
        if (list != null) {
            list.remove(qVar);
        }
        this.f1713a.setOnFlingListener(null);
    }

    public final int c(View view, e0 e0Var) {
        return ((e0Var.c(view) / 2) + e0Var.e(view)) - ((e0Var.l() / 2) + e0Var.k());
    }

    public final int d(RecyclerView.m mVar, e0 e0Var, int i, int i2) {
        int max;
        this.f1714b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.f1714b.getFinalX(), this.f1714b.getFinalY()};
        int y = mVar.y();
        float f2 = 1.0f;
        if (y != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < y; i5++) {
                View x = mVar.x(i5);
                int Q = mVar.Q(x);
                if (Q != -1) {
                    if (Q < i4) {
                        view = x;
                        i4 = Q;
                    }
                    if (Q > i3) {
                        view2 = x;
                        i3 = Q;
                    }
                }
            }
            if (view != null && view2 != null && (max = Math.max(e0Var.b(view), e0Var.b(view2)) - Math.min(e0Var.e(view), e0Var.e(view2))) != 0) {
                f2 = (max * 1.0f) / ((i3 - i4) + 1);
            }
        }
        if (f2 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f2);
    }

    public final View e(RecyclerView.m mVar, e0 e0Var) {
        int y = mVar.y();
        View view = null;
        if (y == 0) {
            return null;
        }
        int l = (e0Var.l() / 2) + e0Var.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < y; i2++) {
            View x = mVar.x(i2);
            int abs = Math.abs(((e0Var.c(x) / 2) + e0Var.e(x)) - l);
            if (abs < i) {
                view = x;
                i = abs;
            }
        }
        return view;
    }

    public View f(RecyclerView.m mVar) {
        e0 g;
        if (mVar.f()) {
            g = h(mVar);
        } else {
            if (!mVar.e()) {
                return null;
            }
            g = g(mVar);
        }
        return e(mVar, g);
    }

    public final e0 g(RecyclerView.m mVar) {
        e0 e0Var = this.f1717e;
        if (e0Var == null || e0Var.f1611a != mVar) {
            this.f1717e = new c0(mVar);
        }
        return this.f1717e;
    }

    public final e0 h(RecyclerView.m mVar) {
        e0 e0Var = this.f1716d;
        if (e0Var == null || e0Var.f1611a != mVar) {
            this.f1716d = new d0(mVar);
        }
        return this.f1716d;
    }

    public final void i() {
        if (this.f1713a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f1713a.h(this.f1715c);
        this.f1713a.setOnFlingListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(androidx.recyclerview.widget.RecyclerView.m r10, int r11, int r12) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.recyclerview.widget.RecyclerView.w.a
            r1 = 0
            if (r0 != 0) goto L7
            goto L98
        L7:
            r2 = 0
            if (r0 != 0) goto Lc
            r3 = r2
            goto L17
        Lc:
            b.r.b.q0 r3 = new b.r.b.q0
            androidx.recyclerview.widget.RecyclerView r4 = r9.f1713a
            android.content.Context r4 = r4.getContext()
            r3.<init>(r9, r4)
        L17:
            if (r3 != 0) goto L1b
            goto L98
        L1b:
            r4 = -1
            if (r0 != 0) goto L20
            goto L85
        L20:
            androidx.recyclerview.widget.RecyclerView r0 = r10.f325b
            if (r0 == 0) goto L28
            androidx.recyclerview.widget.RecyclerView$e r2 = r0.getAdapter()
        L28:
            if (r2 == 0) goto L2f
            int r0 = r2.a()
            goto L30
        L2f:
            r0 = r1
        L30:
            if (r0 != 0) goto L33
            goto L85
        L33:
            android.view.View r2 = r9.f(r10)
            if (r2 != 0) goto L3a
            goto L85
        L3a:
            int r2 = r10.Q(r2)
            if (r2 != r4) goto L41
            goto L85
        L41:
            r5 = r10
            androidx.recyclerview.widget.RecyclerView$w$a r5 = (androidx.recyclerview.widget.RecyclerView.w.a) r5
            int r6 = r0 + (-1)
            android.graphics.PointF r5 = r5.a(r6)
            if (r5 != 0) goto L4d
            goto L85
        L4d:
            boolean r7 = r10.e()
            r8 = 0
            if (r7 == 0) goto L64
            b.r.b.e0 r7 = r9.g(r10)
            int r11 = r9.d(r10, r7, r11, r1)
            float r7 = r5.x
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L65
            int r11 = -r11
            goto L65
        L64:
            r11 = r1
        L65:
            boolean r7 = r10.f()
            if (r7 == 0) goto L7b
            b.r.b.e0 r7 = r9.h(r10)
            int r12 = r9.d(r10, r7, r1, r12)
            float r5 = r5.y
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 >= 0) goto L7c
            int r12 = -r12
            goto L7c
        L7b:
            r12 = r1
        L7c:
            boolean r5 = r10.f()
            if (r5 == 0) goto L83
            r11 = r12
        L83:
            if (r11 != 0) goto L87
        L85:
            r6 = r4
            goto L8f
        L87:
            int r2 = r2 + r11
            if (r2 >= 0) goto L8b
            r2 = r1
        L8b:
            if (r2 < r0) goto L8e
            goto L8f
        L8e:
            r6 = r2
        L8f:
            if (r6 != r4) goto L92
            goto L98
        L92:
            r3.f348a = r6
            r10.W0(r3)
            r1 = 1
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.r.b.z.j(androidx.recyclerview.widget.RecyclerView$m, int, int):boolean");
    }

    public void k() {
        RecyclerView.m layoutManager;
        View f2;
        RecyclerView recyclerView = this.f1713a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (f2 = f(layoutManager)) == null) {
            return;
        }
        int[] a2 = a(layoutManager, f2);
        if (a2[0] == 0 && a2[1] == 0) {
            return;
        }
        this.f1713a.l0(a2[0], a2[1], null, Integer.MIN_VALUE, false);
    }
}
