package b.r.b;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f1615c;

    public f(n nVar, ArrayList arrayList) {
        this.f1615c = nVar;
        this.f1614b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f1614b.iterator();
        while (it.hasNext()) {
            RecyclerView.a0 a0Var = (RecyclerView.a0) it.next();
            n nVar = this.f1615c;
            Objects.requireNonNull(nVar);
            View view = a0Var.f305a;
            ViewPropertyAnimator animate = view.animate();
            nVar.o.add(a0Var);
            animate.alpha(1.0f).setDuration(nVar.f317c).setListener(new h(nVar, a0Var, view, animate)).start();
        }
        this.f1614b.clear();
        this.f1615c.l.remove(this.f1614b);
    }
}
