package b.r.b;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class n0 extends b.h.j.b {

    /* renamed from: d, reason: collision with root package name */
    public final o0 f1663d;

    /* renamed from: e, reason: collision with root package name */
    public Map<View, b.h.j.b> f1664e = new WeakHashMap();

    public n0(o0 o0Var) {
        this.f1663d = o0Var;
    }

    @Override // b.h.j.b
    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        b.h.j.b bVar = this.f1664e.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.f1254a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // b.h.j.b
    public b.h.j.k0.e b(View view) {
        b.h.j.b bVar = this.f1664e.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override // b.h.j.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        b.h.j.b bVar = this.f1664e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            this.f1254a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // b.h.j.b
    public void d(View view, b.h.j.k0.b bVar) {
        if (!this.f1663d.k() && this.f1663d.f1666d.getLayoutManager() != null) {
            this.f1663d.f1666d.getLayoutManager().k0(view, bVar);
            b.h.j.b bVar2 = this.f1664e.get(view);
            if (bVar2 != null) {
                bVar2.d(view, bVar);
                return;
            }
        }
        this.f1254a.onInitializeAccessibilityNodeInfo(view, bVar.f1286a);
    }

    @Override // b.h.j.b
    public void e(View view, AccessibilityEvent accessibilityEvent) {
        b.h.j.b bVar = this.f1664e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            this.f1254a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // b.h.j.b
    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        b.h.j.b bVar = this.f1664e.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.f1254a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // b.h.j.b
    public boolean g(View view, int i, Bundle bundle) {
        if (this.f1663d.k() || this.f1663d.f1666d.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        b.h.j.b bVar = this.f1664e.get(view);
        if (bVar != null) {
            if (bVar.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView.m layoutManager = this.f1663d.f1666d.getLayoutManager();
        RecyclerView.s sVar = layoutManager.f325b.f300c;
        return layoutManager.C0();
    }

    @Override // b.h.j.b
    public void h(View view, int i) {
        b.h.j.b bVar = this.f1664e.get(view);
        if (bVar != null) {
            bVar.h(view, i);
        } else {
            this.f1254a.sendAccessibilityEvent(view, i);
        }
    }

    @Override // b.h.j.b
    public void i(View view, AccessibilityEvent accessibilityEvent) {
        b.h.j.b bVar = this.f1664e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            this.f1254a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
