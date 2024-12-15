package b.l.b;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class p0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f1461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f1462c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.h.f.a f1463d;

    public p0(v vVar, Fragment fragment, b.h.f.a aVar) {
        this.f1461b = vVar;
        this.f1462c = fragment;
        this.f1463d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1461b.a(this.f1462c, this.f1463d);
    }
}
