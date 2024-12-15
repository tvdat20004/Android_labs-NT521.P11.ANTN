package b.r.b;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class p extends RecyclerView.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f1668a;

    public p(s sVar) {
        this.f1668a = sVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b(RecyclerView recyclerView, int i, int i2) {
        s sVar = this.f1668a;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = sVar.s.computeVerticalScrollRange();
        int i3 = sVar.r;
        sVar.t = computeVerticalScrollRange - i3 > 0 && i3 >= sVar.f1674a;
        int computeHorizontalScrollRange = sVar.s.computeHorizontalScrollRange();
        int i4 = sVar.q;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= sVar.f1674a;
        sVar.u = z;
        boolean z2 = sVar.t;
        if (!z2 && !z) {
            if (sVar.v != 0) {
                sVar.h(0);
                return;
            }
            return;
        }
        if (z2) {
            float f2 = i3;
            sVar.l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            sVar.k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (sVar.u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i4;
            sVar.o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            sVar.n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = sVar.v;
        if (i5 == 0 || i5 == 1) {
            sVar.h(1);
        }
    }
}
