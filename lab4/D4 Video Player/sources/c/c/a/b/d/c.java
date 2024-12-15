package c.c.a.b.d;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.h.b.h;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public abstract class c extends d<View> {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f3826c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f3827d;

    /* renamed from: e, reason: collision with root package name */
    public int f3828e;

    public c() {
        this.f3826c = new Rect();
        this.f3827d = new Rect();
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3826c = new Rect();
        this.f3827d = new Rect();
    }

    @Override // c.c.a.b.d.d
    public void C(CoordinatorLayout coordinatorLayout, View view, int i) {
        ((AppBarLayout.ScrollingViewBehavior) this).E(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public final int D(View view) {
        int i = this.f3828e;
        if (i == 0) {
            return 0;
        }
        return h.g((int) (i * 0.0f), 0, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        ((AppBarLayout.ScrollingViewBehavior) this).E(coordinatorLayout.j(view));
        return false;
    }
}
