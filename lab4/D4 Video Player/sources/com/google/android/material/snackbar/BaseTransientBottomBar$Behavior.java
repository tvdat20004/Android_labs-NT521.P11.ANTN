package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.c.a.b.v.a;
import c.c.a.b.v.e;
import c.c.a.b.v.h;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final a h = new a(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public boolean B(View view) {
        Objects.requireNonNull(this.h);
        return view instanceof e;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        Objects.requireNonNull(this.h);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (h.f4075c == null) {
                    h.f4075c = new h();
                }
                synchronized (h.f4075c.f4076a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (h.f4075c == null) {
                h.f4075c = new h();
            }
            synchronized (h.f4075c.f4076a) {
            }
        }
        return super.j(coordinatorLayout, view, motionEvent);
    }
}
