package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.h.j.k0.b;
import b.h.j.u;
import b.h.j.y;
import b.j.b.h;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.b<V> {

    /* renamed from: a, reason: collision with root package name */
    public h f4178a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4179b;

    /* renamed from: c, reason: collision with root package name */
    public int f4180c = 2;

    /* renamed from: d, reason: collision with root package name */
    public float f4181d = 0.5f;

    /* renamed from: e, reason: collision with root package name */
    public float f4182e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f4183f = 0.5f;
    public final h.a g = new a();

    public class a extends h.a {

        /* renamed from: a, reason: collision with root package name */
        public int f4184a;

        /* renamed from: b, reason: collision with root package name */
        public int f4185b = -1;

        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        
            r5 = r2.f4184a;
            r3 = r3.getWidth() + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        
            if (r5 != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        
            if (r5 != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        
            r5 = r2.f4184a - r3.getWidth();
            r3 = r2.f4184a;
         */
        @Override // b.j.b.h.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                java.util.WeakHashMap<android.view.View, b.h.j.y> r5 = b.h.j.u.f1311a
                int r5 = r3.getLayoutDirection()
                r0 = 1
                if (r5 != r0) goto Lb
                r5 = r0
                goto Lc
            Lb:
                r5 = 0
            Lc:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f4180c
                if (r1 != 0) goto L26
                if (r5 == 0) goto L1e
            L14:
                int r5 = r2.f4184a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f4184a
                goto L39
            L1e:
                int r5 = r2.f4184a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L39
            L26:
                if (r1 != r0) goto L2b
                if (r5 == 0) goto L14
                goto L1e
            L2b:
                int r5 = r2.f4184a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f4184a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L39:
                int r4 = java.lang.Math.max(r5, r4)
                int r3 = java.lang.Math.min(r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        @Override // b.j.b.h.a
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // b.j.b.h.a
        public int c(View view) {
            return view.getWidth();
        }

        @Override // b.j.b.h.a
        public void h(View view, int i) {
            this.f4185b = i;
            this.f4184a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // b.j.b.h.a
        public void i(int i) {
            Objects.requireNonNull(SwipeDismissBehavior.this);
        }

        @Override // b.j.b.h.a
        public void j(View view, int i, int i2, int i3, int i4) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.f4182e) + this.f4184a;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.f4183f) + this.f4184a;
            float f2 = i;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.C(0.0f, 1.0f - ((f2 - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0055, code lost:
        
            if (java.lang.Math.abs(r8.getLeft() - r7.f4184a) >= java.lang.Math.round(r8.getWidth() * r7.f4186c.f4181d)) goto L17;
         */
        @Override // b.j.b.h.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void k(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f4185b = r10
                int r10 = r8.getWidth()
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L3c
                java.util.WeakHashMap<android.view.View, b.h.j.y> r4 = b.h.j.u.f1311a
                int r4 = r8.getLayoutDirection()
                if (r4 != r2) goto L18
                r4 = r2
                goto L19
            L18:
                r4 = r3
            L19:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f4180c
                r6 = 2
                if (r5 != r6) goto L21
                goto L2c
            L21:
                if (r5 != 0) goto L30
                if (r4 == 0) goto L2a
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L2e
                goto L2c
            L2a:
                if (r1 <= 0) goto L2e
            L2c:
                r9 = r2
                goto L58
            L2e:
                r9 = r3
                goto L58
            L30:
                if (r5 != r2) goto L2e
                if (r4 == 0) goto L37
                if (r1 <= 0) goto L2e
                goto L3b
            L37:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L2e
            L3b:
                goto L2c
            L3c:
                int r9 = r8.getLeft()
                int r0 = r7.f4184a
                int r9 = r9 - r0
                int r0 = r8.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r1 = r1.f4181d
                float r0 = r0 * r1
                int r0 = java.lang.Math.round(r0)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r0) goto L2e
                goto L2c
            L58:
                if (r9 == 0) goto L66
                int r9 = r8.getLeft()
                int r0 = r7.f4184a
                if (r9 >= r0) goto L64
                int r0 = r0 - r10
                goto L69
            L64:
                int r0 = r0 + r10
                goto L69
            L66:
                int r0 = r7.f4184a
                r2 = r3
            L69:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                b.j.b.h r9 = r9.f4178a
                int r10 = r8.getTop()
                boolean r9 = r9.v(r0, r10)
                if (r9 == 0) goto L84
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r2)
                java.util.WeakHashMap<android.view.View, b.h.j.y> r10 = b.h.j.u.f1311a
                r8.postOnAnimation(r9)
                goto L8b
            L84:
                if (r2 == 0) goto L8b
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                java.util.Objects.requireNonNull(r8)
            L8b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.k(android.view.View, float, float):void");
        }

        @Override // b.j.b.h.a
        public boolean l(View view, int i) {
            int i2 = this.f4185b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.B(view);
        }
    }

    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final View f4187b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f4188c;

        public b(View view, boolean z) {
            this.f4187b = view;
            this.f4188c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = SwipeDismissBehavior.this.f4178a;
            if (hVar == null || !hVar.i(true)) {
                if (this.f4188c) {
                    Objects.requireNonNull(SwipeDismissBehavior.this);
                }
            } else {
                View view = this.f4187b;
                WeakHashMap<View, y> weakHashMap = u.f1311a;
                view.postOnAnimation(this);
            }
        }
    }

    public static float C(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        h hVar = this.f4178a;
        if (hVar == null) {
            return false;
        }
        hVar.p(motionEvent);
        return true;
    }

    public boolean B(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f4179b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.o(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f4179b = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f4179b = false;
        }
        if (!z) {
            return false;
        }
        if (this.f4178a == null) {
            this.f4178a = new h(coordinatorLayout.getContext(), coordinatorLayout, this.g);
        }
        return this.f4178a.w(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i) {
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        if (v.getImportantForAccessibility() == 0) {
            v.setImportantForAccessibility(1);
            u.f(1048576, v);
            u.e(v, 0);
            if (B(v)) {
                u.g(v, b.a.l, null, new c.c.a.b.f.a(this));
            }
        }
        return false;
    }
}
