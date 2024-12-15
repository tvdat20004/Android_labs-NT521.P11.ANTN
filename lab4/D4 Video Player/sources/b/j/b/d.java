package b.j.b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import b.e.j;
import b.h.j.u;
import b.h.j.y;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class d extends b.h.j.b {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final a<b.h.j.k0.b> o = new a();
    public static final b<j<b.h.j.k0.b>, b.h.j.k0.b> p = new b();
    public final AccessibilityManager h;
    public final View i;
    public c j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f1351d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f1352e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f1353f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    private int m = Integer.MIN_VALUE;

    public d(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // b.h.j.b
    public b.h.j.k0.e b(View view) {
        if (this.j == null) {
            this.j = new c(this);
        }
        return this.j;
    }

    @Override // b.h.j.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1254a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // b.h.j.b
    public void d(View view, b.h.j.k0.b bVar) {
        this.f1254a.onInitializeAccessibilityNodeInfo(view, bVar.f1286a);
        Chip.b bVar2 = (Chip.b) this;
        bVar.f1286a.setCheckable(Chip.this.e());
        bVar.f1286a.setClickable(Chip.this.isClickable());
        if (Chip.this.e() || Chip.this.isClickable()) {
            bVar.f1286a.setClassName(Chip.this.e() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            bVar.f1286a.setClassName("android.view.View");
        }
        bVar.f1286a.setText(Chip.this.getText());
    }

    public final boolean j(int i) {
        if (this.k != i) {
            return false;
        }
        this.k = Integer.MIN_VALUE;
        this.i.invalidate();
        t(i, 65536);
        return true;
    }

    public final boolean k(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        Chip.b bVar = (Chip.b) this;
        if (i == 1) {
            Chip chip = Chip.this;
            chip.m = false;
            chip.refreshDrawableState();
        }
        t(i, 8);
        return true;
    }

    public final b.h.j.k0.b l(int i) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        b.h.j.k0.b bVar = new b.h.j.k0.b(obtain);
        obtain.setEnabled(true);
        bVar.f1286a.setFocusable(true);
        bVar.f1286a.setClassName("android.view.View");
        Rect rect = n;
        bVar.f1286a.setBoundsInParent(rect);
        bVar.f1286a.setBoundsInScreen(rect);
        bVar.q(this.i);
        r(i, bVar);
        if (bVar.i() == null && bVar.g() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        bVar.f1286a.getBoundsInParent(this.f1352e);
        if (this.f1352e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int d2 = bVar.d();
        if ((d2 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        int i2 = 128;
        if ((d2 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        bVar.f1286a.setPackageName(this.i.getContext().getPackageName());
        View view = this.i;
        bVar.f1288c = i;
        bVar.f1286a.setSource(view, i);
        boolean z = false;
        if (this.k == i) {
            bVar.f1286a.setAccessibilityFocused(true);
            accessibilityNodeInfo = bVar.f1286a;
        } else {
            bVar.f1286a.setAccessibilityFocused(false);
            accessibilityNodeInfo = bVar.f1286a;
            i2 = 64;
        }
        accessibilityNodeInfo.addAction(i2);
        boolean z2 = this.l == i;
        if (z2) {
            bVar.f1286a.addAction(2);
        } else if (bVar.k()) {
            bVar.f1286a.addAction(1);
        }
        bVar.f1286a.setFocused(z2);
        this.i.getLocationOnScreen(this.g);
        bVar.f1286a.getBoundsInScreen(this.f1351d);
        if (this.f1351d.equals(rect)) {
            bVar.f1286a.getBoundsInParent(this.f1351d);
            if (bVar.f1287b != -1) {
                b.h.j.k0.b bVar2 = new b.h.j.k0.b(AccessibilityNodeInfo.obtain());
                for (int i3 = bVar.f1287b; i3 != -1; i3 = bVar2.f1287b) {
                    View view2 = this.i;
                    bVar2.f1287b = -1;
                    bVar2.f1286a.setParent(view2, -1);
                    bVar2.f1286a.setBoundsInParent(n);
                    r(i3, bVar2);
                    bVar2.f1286a.getBoundsInParent(this.f1352e);
                    Rect rect2 = this.f1351d;
                    Rect rect3 = this.f1352e;
                    rect2.offset(rect3.left, rect3.top);
                }
                bVar2.f1286a.recycle();
            }
            this.f1351d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
        }
        if (this.i.getLocalVisibleRect(this.f1353f)) {
            this.f1353f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
            if (this.f1351d.intersect(this.f1353f)) {
                bVar.f1286a.setBoundsInScreen(this.f1351d);
                Rect rect4 = this.f1351d;
                if (rect4 != null && !rect4.isEmpty() && this.i.getWindowVisibility() == 0) {
                    View view3 = this.i;
                    while (true) {
                        Object parent = view3.getParent();
                        if (parent instanceof View) {
                            view3 = (View) parent;
                            if (view3.getAlpha() <= 0.0f || view3.getVisibility() != 0) {
                                break;
                            }
                        } else if (parent != null) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    bVar.f1286a.setVisibleToUser(true);
                }
            }
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(android.view.MotionEvent r10) {
        /*
            r9 = this;
            android.view.accessibility.AccessibilityManager r0 = r9.h
            boolean r0 = r0.isEnabled()
            r1 = 0
            if (r0 == 0) goto L6e
            android.view.accessibility.AccessibilityManager r0 = r9.h
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 != 0) goto L12
            goto L6e
        L12:
            int r0 = r10.getAction()
            r2 = 7
            r3 = 256(0x100, float:3.59E-43)
            r4 = 128(0x80, float:1.8E-43)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 1
            if (r0 == r2) goto L3a
            r2 = 9
            if (r0 == r2) goto L3a
            r10 = 10
            if (r0 == r10) goto L29
            return r1
        L29:
            int r10 = r9.m
            if (r10 == r5) goto L39
            if (r10 != r5) goto L30
            goto L38
        L30:
            r9.m = r5
            r9.t(r5, r4)
            r9.t(r10, r3)
        L38:
            return r6
        L39:
            return r1
        L3a:
            float r0 = r10.getX()
            float r10 = r10.getY()
            r2 = r9
            com.google.android.material.chip.Chip$b r2 = (com.google.android.material.chip.Chip.b) r2
            com.google.android.material.chip.Chip r7 = com.google.android.material.chip.Chip.this
            android.graphics.Rect r8 = com.google.android.material.chip.Chip.u
            boolean r7 = r7.d()
            if (r7 == 0) goto L5d
            com.google.android.material.chip.Chip r2 = com.google.android.material.chip.Chip.this
            android.graphics.RectF r2 = com.google.android.material.chip.Chip.a(r2)
            boolean r10 = r2.contains(r0, r10)
            if (r10 == 0) goto L5d
            r10 = r6
            goto L5e
        L5d:
            r10 = r1
        L5e:
            int r0 = r9.m
            if (r0 != r10) goto L63
            goto L6b
        L63:
            r9.m = r10
            r9.t(r10, r4)
            r9.t(r0, r3)
        L6b:
            if (r10 == r5) goto L6e
            r1 = r6
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.b.d.m(android.view.MotionEvent):boolean");
    }

    public abstract void n(List<Integer> list);

    /* JADX WARN: Code restructure failed: missing block: B:46:0x012c, code lost:
    
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.b.d.o(int, android.graphics.Rect):boolean");
    }

    public b.h.j.k0.b p(int i) {
        if (i != -1) {
            return l(i);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.i);
        b.h.j.k0.b bVar = new b.h.j.k0.b(obtain);
        View view = this.i;
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        n(arrayList);
        if (bVar.f1286a.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            bVar.f1286a.addChild(this.i, ((Integer) arrayList.get(i2)).intValue());
        }
        return bVar;
    }

    public abstract boolean q(int i, int i2, Bundle bundle);

    public abstract void r(int i, b.h.j.k0.b bVar);

    public final boolean s(int i) {
        int i2;
        if ((!this.i.isFocused() && !this.i.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            k(i2);
        }
        this.l = i;
        Chip.b bVar = (Chip.b) this;
        if (i == 1) {
            Chip chip = Chip.this;
            chip.m = true;
            chip.refreshDrawableState();
        }
        t(i, 8);
        return true;
    }

    public final boolean t(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            b.h.j.k0.b p2 = p(i);
            obtain.getText().add(p2.i());
            obtain.setContentDescription(p2.g());
            obtain.setScrollable(p2.f1286a.isScrollable());
            obtain.setPassword(p2.f1286a.isPassword());
            obtain.setEnabled(p2.j());
            obtain.setChecked(p2.f1286a.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(p2.e());
            obtain.setSource(this.i, i);
            obtain.setPackageName(this.i.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i2);
            this.i.onInitializeAccessibilityEvent(obtain);
        }
        return parent.requestSendAccessibilityEvent(this.i, obtain);
    }

    public final void u(int i) {
        int i2 = this.m;
        if (i2 == i) {
            return;
        }
        this.m = i;
        t(i, 128);
        t(i2, 256);
    }
}
