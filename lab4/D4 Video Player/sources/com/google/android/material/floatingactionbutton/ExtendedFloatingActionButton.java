package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.c.a.b.b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ExtendedFloatingActionButton extends MaterialButton {

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.b<T> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4231a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f4232b;

        public ExtendedFloatingActionButtonBehavior() {
            this.f4231a = false;
            this.f4232b = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f3807e);
            this.f4231a = obtainStyledAttributes.getBoolean(0, false);
            this.f4232b = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public void f(CoordinatorLayout.e eVar) {
            if (eVar.h == 0) {
                eVar.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e ? ((CoordinatorLayout.e) layoutParams).f173a instanceof BottomSheetBehavior : false) {
                throw null;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
            List<View> j = coordinatorLayout.j((ExtendedFloatingActionButton) view);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                ViewGroup.LayoutParams layoutParams = j.get(i2).getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.e ? ((CoordinatorLayout.e) layoutParams).f173a instanceof BottomSheetBehavior : false) {
                    throw null;
                }
            }
            throw null;
        }
    }
}
