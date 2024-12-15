package b.l.b;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f1476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.e.b f1477c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t0 f1479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1480f;
    public final /* synthetic */ View g;
    public final /* synthetic */ Fragment h;
    public final /* synthetic */ Fragment i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ ArrayList k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Rect m;

    public s0(e1 e1Var, b.e.b bVar, Object obj, t0 t0Var, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f1476b = e1Var;
        this.f1477c = bVar;
        this.f1478d = obj;
        this.f1479e = t0Var;
        this.f1480f = arrayList;
        this.g = view;
        this.h = fragment;
        this.i = fragment2;
        this.j = z;
        this.k = arrayList2;
        this.l = obj2;
        this.m = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        b.e.b<String, View> e2 = u0.e(this.f1476b, this.f1477c, this.f1478d, this.f1479e);
        if (e2 != null) {
            this.f1480f.addAll(e2.values());
            this.f1480f.add(this.g);
        }
        u0.c(this.h, this.i, this.j, e2, false);
        Object obj = this.f1478d;
        if (obj != null) {
            this.f1476b.u(obj, this.k, this.f1480f);
            View k = u0.k(e2, this.f1479e, this.l, this.j);
            if (k != null) {
                this.f1476b.j(k, this.m);
            }
        }
    }
}
