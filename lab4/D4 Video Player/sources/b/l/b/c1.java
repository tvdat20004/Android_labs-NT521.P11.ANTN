package b.l.b;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class c1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f1391c;

    public c1(e1 e1Var, ArrayList arrayList, Map map) {
        this.f1390b = arrayList;
        this.f1391c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        int size = this.f1390b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f1390b.get(i);
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                Iterator it = this.f1391c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (transitionName.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                view.setTransitionName(str);
            }
        }
    }
}
