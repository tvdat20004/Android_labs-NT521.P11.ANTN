package b.h.j.k0;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public class d extends c {
    public d(e eVar) {
        super(eVar);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i) {
        b b2 = this.f1297a.b(i);
        if (b2 == null) {
            return null;
        }
        return b2.f1286a;
    }
}
