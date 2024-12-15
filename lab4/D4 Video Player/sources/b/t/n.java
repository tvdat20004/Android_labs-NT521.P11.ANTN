package b.t;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/* loaded from: classes.dex */
public class n extends b0 {
    public static final String[] z = {"android:visibility:visibility", "android:visibility:parent"};
    public int y;

    public n(int i) {
        this.y = 3;
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.y = i;
    }

    public final void H(l0 l0Var) {
        l0Var.f1754a.put("android:visibility:visibility", Integer.valueOf(l0Var.f1755b.getVisibility()));
        l0Var.f1754a.put("android:visibility:parent", l0Var.f1755b.getParent());
        int[] iArr = new int[2];
        l0Var.f1755b.getLocationOnScreen(iArr);
        l0Var.f1754a.put("android:visibility:screenLocation", iArr);
    }

    public final Animator I(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        q0.f1772a.e(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, q0.f1773b, f3);
        ofFloat.addListener(new m(view));
        a(new l(this, view));
        return ofFloat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r9 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (r0.f1802e == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        if (r0.f1800c == 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b.t.z0 J(b.t.l0 r8, b.t.l0 r9) {
        /*
            r7 = this;
            b.t.z0 r0 = new b.t.z0
            r0.<init>()
            r1 = 0
            r0.f1798a = r1
            r0.f1799b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1754a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1754a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f1800c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1754a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f1802e = r6
            goto L37
        L33:
            r0.f1800c = r4
            r0.f1802e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f1754a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f1754a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f1801d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f1754a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f1803f = r2
            goto L5e
        L5a:
            r0.f1801d = r4
            r0.f1803f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f1800c
            int r9 = r0.f1801d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f1802e
            android.view.ViewGroup r4 = r0.f1803f
            if (r3 != r4) goto L70
            goto L95
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L91
        L75:
            if (r9 != 0) goto L95
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f1803f
            if (r8 != 0) goto L7d
            goto L91
        L7d:
            android.view.ViewGroup r8 = r0.f1802e
            if (r8 != 0) goto L95
            goto L88
        L82:
            if (r8 != 0) goto L8b
            int r8 = r0.f1801d
            if (r8 != 0) goto L8b
        L88:
            r0.f1799b = r2
            goto L93
        L8b:
            if (r9 != 0) goto L95
            int r8 = r0.f1800c
            if (r8 != 0) goto L95
        L91:
            r0.f1799b = r1
        L93:
            r0.f1798a = r2
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.t.n.J(b.t.l0, b.t.l0):b.t.z0");
    }

    public Animator K(View view, l0 l0Var) {
        Float f2;
        q0.f1772a.c(view);
        return I(view, (l0Var == null || (f2 = (Float) l0Var.f1754a.get("android:fade:transitionAlpha")) == null) ? 1.0f : f2.floatValue(), 0.0f);
    }

    @Override // b.t.b0
    public void d(l0 l0Var) {
        H(l0Var);
    }

    @Override // b.t.b0
    public void g(l0 l0Var) {
        H(l0Var);
        l0Var.f1754a.put("android:fade:transitionAlpha", Float.valueOf(q0.a(l0Var.f1755b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (J(n(r1, false), q(r1, false)).f1798a != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e3  */
    @Override // b.t.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator k(android.view.ViewGroup r21, b.t.l0 r22, b.t.l0 r23) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.t.n.k(android.view.ViewGroup, b.t.l0, b.t.l0):android.animation.Animator");
    }

    @Override // b.t.b0
    public String[] p() {
        return z;
    }

    @Override // b.t.b0
    public boolean r(l0 l0Var, l0 l0Var2) {
        if (l0Var == null && l0Var2 == null) {
            return false;
        }
        if (l0Var != null && l0Var2 != null && l0Var2.f1754a.containsKey("android:visibility:visibility") != l0Var.f1754a.containsKey("android:visibility:visibility")) {
            return false;
        }
        z0 J = J(l0Var, l0Var2);
        if (J.f1798a) {
            return J.f1800c == 0 || J.f1801d == 0;
        }
        return false;
    }
}
