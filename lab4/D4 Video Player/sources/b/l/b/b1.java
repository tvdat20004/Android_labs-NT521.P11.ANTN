package b.l.b;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1378c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1381f;

    public b1(e1 e1Var, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1377b = i;
        this.f1378c = arrayList;
        this.f1379d = arrayList2;
        this.f1380e = arrayList3;
        this.f1381f = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i = 0; i < this.f1377b; i++) {
            View view = (View) this.f1378c.get(i);
            String str = (String) this.f1379d.get(i);
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            view.setTransitionName(str);
            ((View) this.f1380e.get(i)).setTransitionName((String) this.f1381f.get(i));
        }
    }
}
