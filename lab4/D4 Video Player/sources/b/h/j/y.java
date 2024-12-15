package b.h.j;

import android.view.View;
import b.b.c.p0;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<View> f1319a;

    /* renamed from: b, reason: collision with root package name */
    public int f1320b = -1;

    public y(View view) {
        this.f1319a = new WeakReference<>(view);
    }

    public y a(float f2) {
        View view = this.f1319a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = this.f1319a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public y c(long j) {
        View view = this.f1319a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public y d(z zVar) {
        View view = this.f1319a.get();
        if (view != null) {
            e(view, zVar);
        }
        return this;
    }

    public final void e(View view, z zVar) {
        if (zVar != null) {
            view.animate().setListener(new w(this, zVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public y f(p0 p0Var) {
        View view = this.f1319a.get();
        if (view != null) {
            view.animate().setUpdateListener(p0Var != null ? new x(this, p0Var, view) : null);
        }
        return this;
    }

    public y g(float f2) {
        View view = this.f1319a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
