package b.l.b;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class r0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f1471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f1472c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f1473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b.e.b f1474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f1475f;
    public final /* synthetic */ e1 g;
    public final /* synthetic */ Rect h;

    public r0(Fragment fragment, Fragment fragment2, boolean z, b.e.b bVar, View view, e1 e1Var, Rect rect) {
        this.f1471b = fragment;
        this.f1472c = fragment2;
        this.f1473d = z;
        this.f1474e = bVar;
        this.f1475f = view;
        this.g = e1Var;
        this.h = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        u0.c(this.f1471b, this.f1472c, this.f1473d, this.f1474e, false);
        View view = this.f1475f;
        if (view != null) {
            this.g.j(view, this.h);
        }
    }
}
