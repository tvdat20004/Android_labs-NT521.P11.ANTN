package b.b.c;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class n0 extends b.h.j.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f469a;

    public n0(r0 r0Var) {
        this.f469a = r0Var;
    }

    @Override // b.h.j.z
    public void a(View view) {
        View view2;
        r0 r0Var = this.f469a;
        if (r0Var.p && (view2 = r0Var.g) != null) {
            view2.setTranslationY(0.0f);
            this.f469a.f482d.setTranslationY(0.0f);
        }
        this.f469a.f482d.setVisibility(8);
        this.f469a.f482d.setTransitioning(false);
        r0 r0Var2 = this.f469a;
        r0Var2.t = null;
        b.b.h.a aVar = r0Var2.k;
        if (aVar != null) {
            aVar.d(r0Var2.j);
            r0Var2.j = null;
            r0Var2.k = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f469a.f481c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }
}
