package b.r.b;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f1608c;

    public d(n nVar, ArrayList arrayList) {
        this.f1608c = nVar;
        this.f1607b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f1607b.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            n nVar = this.f1608c;
            RecyclerView.a0 a0Var = mVar.f1652a;
            int i = mVar.f1653b;
            int i2 = mVar.f1654c;
            int i3 = mVar.f1655d;
            int i4 = mVar.f1656e;
            Objects.requireNonNull(nVar);
            View view = a0Var.f305a;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            nVar.p.add(a0Var);
            animate.setDuration(nVar.f319e).setListener(new i(nVar, a0Var, i5, view, i6, animate)).start();
        }
        this.f1607b.clear();
        this.f1608c.m.remove(this.f1607b);
    }
}
