package b.l.b;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class n0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f1454b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f1455c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.h.f.a f1456d;

    public n0(v vVar, Fragment fragment, b.h.f.a aVar) {
        this.f1454b = vVar;
        this.f1455c = fragment;
        this.f1456d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1454b.a(this.f1455c, this.f1456d);
    }
}
