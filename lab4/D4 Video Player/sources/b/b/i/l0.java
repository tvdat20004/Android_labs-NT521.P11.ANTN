package b.b.i;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class l0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f721b;

    public l0(n0 n0Var) {
        this.f721b = n0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        n0 n0Var = this.f721b;
        r0 r0Var = n0Var.I;
        Objects.requireNonNull(n0Var);
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        if (!(r0Var.isAttachedToWindow() && r0Var.getGlobalVisibleRect(n0Var.G))) {
            this.f721b.dismiss();
        } else {
            this.f721b.t();
            this.f721b.f();
        }
    }
}
