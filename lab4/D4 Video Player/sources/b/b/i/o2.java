package b.b.i;

import android.view.View;

/* loaded from: classes.dex */
public class o2 extends b.h.j.a0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f753a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p2 f755c;

    public o2(p2 p2Var, int i) {
        this.f755c = p2Var;
        this.f754b = i;
    }

    @Override // b.h.j.z
    public void a(View view) {
        if (this.f753a) {
            return;
        }
        this.f755c.f760a.setVisibility(this.f754b);
    }

    @Override // b.h.j.a0, b.h.j.z
    public void b(View view) {
        this.f755c.f760a.setVisibility(0);
    }

    @Override // b.h.j.a0, b.h.j.z
    public void c(View view) {
        this.f753a = true;
    }
}
