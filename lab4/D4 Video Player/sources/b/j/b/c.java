package b.j.b;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import b.h.j.u;
import b.h.j.y;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class c extends b.h.j.k0.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f1350b;

    public c(d dVar) {
        this.f1350b = dVar;
    }

    @Override // b.h.j.k0.e
    public b.h.j.k0.b a(int i) {
        return new b.h.j.k0.b(AccessibilityNodeInfo.obtain(this.f1350b.p(i).f1286a));
    }

    @Override // b.h.j.k0.e
    public b.h.j.k0.b b(int i) {
        int i2 = i == 2 ? this.f1350b.k : this.f1350b.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return new b.h.j.k0.b(AccessibilityNodeInfo.obtain(this.f1350b.p(i2).f1286a));
    }

    @Override // b.h.j.k0.e
    public boolean c(int i, int i2, Bundle bundle) {
        int i3;
        d dVar = this.f1350b;
        if (i == -1) {
            View view = dVar.i;
            WeakHashMap<View, y> weakHashMap = u.f1311a;
            return view.performAccessibilityAction(i2, bundle);
        }
        boolean z = true;
        if (i2 == 1) {
            return dVar.s(i);
        }
        if (i2 == 2) {
            return dVar.k(i);
        }
        if (i2 != 64) {
            return i2 != 128 ? dVar.q(i, i2, bundle) : dVar.j(i);
        }
        if (dVar.h.isEnabled() && dVar.h.isTouchExplorationEnabled() && (i3 = dVar.k) != i) {
            if (i3 != Integer.MIN_VALUE) {
                dVar.j(i3);
            }
            dVar.k = i;
            dVar.i.invalidate();
            dVar.t(i, 32768);
        } else {
            z = false;
        }
        return z;
    }
}
