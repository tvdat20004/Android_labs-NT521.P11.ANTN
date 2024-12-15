package c.c.a.b.d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class d<V extends View> extends CoordinatorLayout.b<V> {

    /* renamed from: a, reason: collision with root package name */
    public e f3829a;

    /* renamed from: b, reason: collision with root package name */
    public int f3830b;

    public d() {
        this.f3830b = 0;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3830b = 0;
    }

    public int B() {
        e eVar = this.f3829a;
        if (eVar != null) {
            return eVar.f3834d;
        }
        return 0;
    }

    public void C(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.q(v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i) {
        C(coordinatorLayout, v, i);
        if (this.f3829a == null) {
            this.f3829a = new e(v);
        }
        e eVar = this.f3829a;
        eVar.f3832b = eVar.f3831a.getTop();
        eVar.f3833c = eVar.f3831a.getLeft();
        this.f3829a.a();
        int i2 = this.f3830b;
        if (i2 == 0) {
            return true;
        }
        e eVar2 = this.f3829a;
        if (eVar2.f3834d != i2) {
            eVar2.f3834d = i2;
            eVar2.a();
        }
        this.f3830b = 0;
        return true;
    }
}
