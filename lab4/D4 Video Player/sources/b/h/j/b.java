package b.h.j;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f1253c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f1254a;

    /* renamed from: b, reason: collision with root package name */
    public final View.AccessibilityDelegate f1255b;

    public b() {
        this.f1254a = f1253c;
        this.f1255b = new a(this);
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1254a = accessibilityDelegate;
        this.f1255b = new a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1254a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public b.h.j.k0.e b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f1254a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new b.h.j.k0.e(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1254a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, b.h.j.k0.b bVar) {
        this.f1254a.onInitializeAccessibilityNodeInfo(view, bVar.f1286a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f1254a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1254a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(android.view.View r9, int r10, android.os.Bundle r11) {
        /*
            r8 = this;
            r0 = 2131231168(0x7f0801c0, float:1.807841E38)
            java.lang.Object r0 = r9.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Lf
            java.util.List r0 = java.util.Collections.emptyList()
        Lf:
            r1 = 0
            r2 = r1
        L11:
            int r3 = r0.size()
            if (r2 >= r3) goto L6e
            java.lang.Object r3 = r0.get(r2)
            b.h.j.k0.b$a r3 = (b.h.j.k0.b.a) r3
            int r4 = r3.a()
            if (r4 != r10) goto L6b
            b.h.j.k0.g r0 = r3.f1294d
            if (r0 == 0) goto L6e
            java.lang.Class<? extends b.h.j.k0.f> r0 = r3.f1293c
            r2 = 0
            if (r0 != 0) goto L2d
            goto L64
        L2d:
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r4)     // Catch: java.lang.Exception -> L3e
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L3e
            java.lang.Object r0 = r0.newInstance(r4)     // Catch: java.lang.Exception -> L3e
            b.h.j.k0.f r0 = (b.h.j.k0.f) r0     // Catch: java.lang.Exception -> L3e
            throw r2     // Catch: java.lang.Exception -> L3c
        L3c:
            r2 = move-exception
            goto L42
        L3e:
            r0 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L42:
            java.lang.Class<? extends b.h.j.k0.f> r4 = r3.f1293c
            if (r4 != 0) goto L49
            java.lang.String r4 = "null"
            goto L4d
        L49:
            java.lang.String r4 = r4.getName()
        L4d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to execute command with argument class ViewCommandArgument: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r4, r2)
            r2 = r0
        L64:
            b.h.j.k0.g r0 = r3.f1294d
            boolean r0 = r0.a(r9, r2)
            goto L6f
        L6b:
            int r2 = r2 + 1
            goto L11
        L6e:
            r0 = r1
        L6f:
            if (r0 != 0) goto L77
            android.view.View$AccessibilityDelegate r0 = r8.f1254a
            boolean r0 = r0.performAccessibilityAction(r9, r10, r11)
        L77:
            if (r0 != 0) goto Lc8
            r2 = 2131230735(0x7f08000f, float:1.8077531E38)
            if (r10 != r2) goto Lc8
            r10 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r10 = r11.getInt(r0, r10)
            r11 = 2131231169(0x7f0801c1, float:1.8078411E38)
            java.lang.Object r11 = r9.getTag(r11)
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            r0 = 1
            if (r11 == 0) goto Lc7
            java.lang.Object r10 = r11.get(r10)
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            if (r10 == 0) goto Lc7
            java.lang.Object r10 = r10.get()
            android.text.style.ClickableSpan r10 = (android.text.style.ClickableSpan) r10
            if (r10 == 0) goto Lc0
            android.view.accessibility.AccessibilityNodeInfo r11 = r9.createAccessibilityNodeInfo()
            java.lang.CharSequence r11 = r11.getText()
            android.text.style.ClickableSpan[] r11 = b.h.j.k0.b.f(r11)
            r2 = r1
        Lae:
            if (r11 == 0) goto Lc0
            int r3 = r11.length
            if (r2 >= r3) goto Lc0
            r3 = r11[r2]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto Lbd
            r11 = r0
            goto Lc1
        Lbd:
            int r2 = r2 + 1
            goto Lae
        Lc0:
            r11 = r1
        Lc1:
            if (r11 == 0) goto Lc7
            r10.onClick(r9)
            r1 = r0
        Lc7:
            r0 = r1
        Lc8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.j.b.g(android.view.View, int, android.os.Bundle):boolean");
    }

    public void h(View view, int i) {
        this.f1254a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f1254a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
