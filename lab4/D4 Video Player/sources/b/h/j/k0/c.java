package b.h.j.k0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class c extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final e f1297a;

    public c(e eVar) {
        this.f1297a = eVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        b a2 = this.f1297a.a(i);
        if (a2 == null) {
            return null;
        }
        return a2.f1286a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        Objects.requireNonNull(this.f1297a);
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.f1297a.c(i, i2, bundle);
    }
}
