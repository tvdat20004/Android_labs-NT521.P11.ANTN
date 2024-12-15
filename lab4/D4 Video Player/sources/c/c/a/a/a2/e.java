package c.c.a.a.a2;

import android.view.Surface;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f1923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Surface f1924c;

    public /* synthetic */ e(y yVar, Surface surface) {
        this.f1923b = yVar;
        this.f1924c = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.f1923b;
        yVar.f1973b.g(this.f1924c);
    }
}
