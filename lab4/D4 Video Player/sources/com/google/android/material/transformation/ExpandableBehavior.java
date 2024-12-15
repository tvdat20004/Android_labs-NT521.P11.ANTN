package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.h.j.u;
import b.h.j.y;
import java.util.List;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.b<View> {

    /* renamed from: a, reason: collision with root package name */
    public int f4258a;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f4259b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f4260c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c.c.a.b.o.a f4261d;

        public a(View view, int i, c.c.a.b.o.a aVar) {
            this.f4259b = view;
            this.f4260c = i;
            this.f4261d = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f4259b.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f4258a == this.f4260c) {
                c.c.a.b.o.a aVar = this.f4261d;
                expandableBehavior.C((View) aVar, this.f4259b, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f4258a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4258a = 0;
    }

    public final boolean B(boolean z) {
        if (!z) {
            return this.f4258a == 1;
        }
        int i = this.f4258a;
        return i == 0 || i == 2;
    }

    public abstract boolean C(View view, View view2, boolean z, boolean z2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        c.c.a.b.o.a aVar = (c.c.a.b.o.a) view2;
        if (!B(aVar.a())) {
            return false;
        }
        this.f4258a = aVar.a() ? 1 : 2;
        return C((View) aVar, view, aVar.a(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        c.c.a.b.o.a aVar;
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        if (!view.isLaidOut()) {
            List<View> j = coordinatorLayout.j(view);
            int size = j.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = j.get(i2);
                if (d(coordinatorLayout, view, view2)) {
                    aVar = (c.c.a.b.o.a) view2;
                    break;
                }
                i2++;
            }
            if (aVar != null && B(aVar.a())) {
                int i3 = aVar.a() ? 1 : 2;
                this.f4258a = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, i3, aVar));
            }
        }
        return false;
    }
}
