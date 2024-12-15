package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.b<V> {

    /* renamed from: a, reason: collision with root package name */
    public int f4174a;

    /* renamed from: b, reason: collision with root package name */
    public int f4175b;

    /* renamed from: c, reason: collision with root package name */
    public ViewPropertyAnimator f4176c;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f4176c = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f4174a = 0;
        this.f4175b = 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4174a = 0;
        this.f4175b = 2;
    }

    public final void B(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f4176c = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f4174a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.f4175b == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f4176c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f4175b = 1;
            B(v, this.f4174a + 0, 175L, c.c.a.b.c.a.f3811c);
            return;
        }
        if (i2 >= 0 || this.f4175b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f4176c;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            v.clearAnimation();
        }
        this.f4175b = 2;
        B(v, 0, 225L, c.c.a.b.c.a.f3812d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }
}
