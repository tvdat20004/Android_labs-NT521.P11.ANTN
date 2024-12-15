package b.l.b;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1465b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1 f1466c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f1467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fragment f1468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1469f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ Object i;

    public q0(Object obj, e1 e1Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f1465b = obj;
        this.f1466c = e1Var;
        this.f1467d = view;
        this.f1468e = fragment;
        this.f1469f = arrayList;
        this.g = arrayList2;
        this.h = arrayList3;
        this.i = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj = this.f1465b;
        if (obj != null) {
            this.f1466c.m(obj, this.f1467d);
            this.g.addAll(u0.h(this.f1466c, this.f1465b, this.f1468e, this.f1469f, this.f1467d));
        }
        if (this.h != null) {
            if (this.i != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f1467d);
                this.f1466c.n(this.i, this.h, arrayList);
            }
            this.h.clear();
            this.h.add(this.f1467d);
        }
    }
}
