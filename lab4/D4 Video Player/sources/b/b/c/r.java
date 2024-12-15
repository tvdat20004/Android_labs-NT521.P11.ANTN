package b.b.c;

import android.view.View;

/* loaded from: classes.dex */
public class r extends b.h.j.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f478a;

    public r(s sVar) {
        this.f478a = sVar;
    }

    @Override // b.h.j.z
    public void a(View view) {
        this.f478a.f485b.p.setAlpha(1.0f);
        this.f478a.f485b.s.d(null);
        this.f478a.f485b.s = null;
    }

    @Override // b.h.j.a0, b.h.j.z
    public void b(View view) {
        this.f478a.f485b.p.setVisibility(0);
    }
}
