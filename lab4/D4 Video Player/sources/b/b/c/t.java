package b.b.c;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class t extends b.h.j.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f486a;

    public t(f0 f0Var) {
        this.f486a = f0Var;
    }

    @Override // b.h.j.z
    public void a(View view) {
        this.f486a.p.setAlpha(1.0f);
        this.f486a.s.d(null);
        this.f486a.s = null;
    }

    @Override // b.h.j.a0, b.h.j.z
    public void b(View view) {
        this.f486a.p.setVisibility(0);
        this.f486a.p.sendAccessibilityEvent(32);
        if (this.f486a.p.getParent() instanceof View) {
            View view2 = (View) this.f486a.p.getParent();
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            view2.requestApplyInsets();
        }
    }
}
