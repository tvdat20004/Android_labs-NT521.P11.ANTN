package b.l.b;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class d1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1395b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f1396c;

    public d1(e1 e1Var, ArrayList arrayList, Map map) {
        this.f1395b = arrayList;
        this.f1396c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f1395b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f1395b.get(i);
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            view.setTransitionName((String) this.f1396c.get(view.getTransitionName()));
        }
    }
}
