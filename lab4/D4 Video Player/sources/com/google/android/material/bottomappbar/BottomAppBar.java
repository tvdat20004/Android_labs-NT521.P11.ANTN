package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class BottomAppBar extends Toolbar {
    public static final /* synthetic */ int O = 0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: d, reason: collision with root package name */
        public final Rect f4190d;

        /* renamed from: e, reason: collision with root package name */
        public WeakReference<BottomAppBar> f4191e;

        /* renamed from: f, reason: collision with root package name */
        public final View.OnLayoutChangeListener f4192f;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Behavior.this.f4191e.get();
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f4192f = new a();
            this.f4190d = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4192f = new a();
            this.f4190d = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
            this.f4191e = new WeakReference<>((BottomAppBar) view);
            int i2 = BottomAppBar.O;
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            throw null;
        }
    }
}
