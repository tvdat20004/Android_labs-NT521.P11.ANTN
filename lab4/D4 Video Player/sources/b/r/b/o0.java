package b.r.b;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import b.h.j.k0.b;

/* loaded from: classes.dex */
public class o0 extends b.h.j.b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f1666d;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f1667e;

    public o0(RecyclerView recyclerView) {
        this.f1666d = recyclerView;
        b.h.j.b j = j();
        this.f1667e = (j == null || !(j instanceof n0)) ? new n0(this) : (n0) j;
    }

    @Override // b.h.j.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1254a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || k()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().i0(accessibilityEvent);
        }
    }

    @Override // b.h.j.b
    public void d(View view, b.h.j.k0.b bVar) {
        this.f1254a.onInitializeAccessibilityNodeInfo(view, bVar.f1286a);
        if (k() || this.f1666d.getLayoutManager() == null) {
            return;
        }
        RecyclerView.m layoutManager = this.f1666d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f325b;
        RecyclerView.s sVar = recyclerView.f300c;
        RecyclerView.x xVar = recyclerView.h0;
        if (recyclerView.canScrollVertically(-1) || layoutManager.f325b.canScrollHorizontally(-1)) {
            bVar.f1286a.addAction(8192);
            bVar.f1286a.setScrollable(true);
        }
        if (layoutManager.f325b.canScrollVertically(1) || layoutManager.f325b.canScrollHorizontally(1)) {
            bVar.f1286a.addAction(4096);
            bVar.f1286a.setScrollable(true);
        }
        bVar.n(b.C0001b.a(layoutManager.S(sVar, xVar), layoutManager.A(sVar, xVar), layoutManager.W(), layoutManager.T()));
    }

    @Override // b.h.j.b
    public boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        if (k() || this.f1666d.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.m layoutManager = this.f1666d.getLayoutManager();
        RecyclerView.s sVar = layoutManager.f325b.f300c;
        return layoutManager.B0(i);
    }

    public b.h.j.b j() {
        return this.f1667e;
    }

    public boolean k() {
        return this.f1666d.M();
    }
}
