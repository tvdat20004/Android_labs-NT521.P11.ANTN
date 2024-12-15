package b.r.b;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f1610c;

    public e(n nVar, ArrayList arrayList) {
        this.f1610c = nVar;
        this.f1609b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f1609b.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            n nVar = this.f1610c;
            Objects.requireNonNull(nVar);
            RecyclerView.a0 a0Var = lVar.f1646a;
            View view = a0Var == null ? null : a0Var.f305a;
            RecyclerView.a0 a0Var2 = lVar.f1647b;
            View view2 = a0Var2 != null ? a0Var2.f305a : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(nVar.f320f);
                nVar.r.add(lVar.f1646a);
                duration.translationX(lVar.f1650e - lVar.f1648c);
                duration.translationY(lVar.f1651f - lVar.f1649d);
                duration.alpha(0.0f).setListener(new j(nVar, lVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                nVar.r.add(lVar.f1647b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(nVar.f320f).alpha(1.0f).setListener(new k(nVar, lVar, animate, view2)).start();
            }
        }
        this.f1609b.clear();
        this.f1610c.n.remove(this.f1609b);
    }
}
