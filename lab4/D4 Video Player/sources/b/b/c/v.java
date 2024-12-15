package b.b.c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class v extends b.h.j.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f488a;

    public v(w wVar) {
        this.f488a = wVar;
    }

    @Override // b.h.j.z
    public void a(View view) {
        this.f488a.f490b.p.setVisibility(8);
        f0 f0Var = this.f488a.f490b;
        PopupWindow popupWindow = f0Var.q;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (f0Var.p.getParent() instanceof View) {
            View view2 = (View) this.f488a.f490b.p.getParent();
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            view2.requestApplyInsets();
        }
        this.f488a.f490b.p.removeAllViews();
        this.f488a.f490b.s.d(null);
        f0 f0Var2 = this.f488a.f490b;
        f0Var2.s = null;
        ViewGroup viewGroup = f0Var2.u;
        WeakHashMap<View, b.h.j.y> weakHashMap2 = b.h.j.u.f1311a;
        viewGroup.requestApplyInsets();
    }
}
