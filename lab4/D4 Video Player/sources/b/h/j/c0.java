package b.h.j;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class c0 extends d0 {

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsets.Builder f1262b;

    public c0() {
        this.f1262b = new WindowInsets.Builder();
    }

    public c0(j0 j0Var) {
        WindowInsets g = j0Var.g();
        this.f1262b = g != null ? new WindowInsets.Builder(g) : new WindowInsets.Builder();
    }

    @Override // b.h.j.d0
    public j0 a() {
        return j0.h(this.f1262b.build());
    }

    @Override // b.h.j.d0
    public void b(b.h.d.b bVar) {
        this.f1262b.setStableInsets(Insets.of(bVar.f1159a, bVar.f1160b, bVar.f1161c, bVar.f1162d));
    }

    @Override // b.h.j.d0
    public void c(b.h.d.b bVar) {
        this.f1262b.setSystemWindowInsets(Insets.of(bVar.f1159a, bVar.f1160b, bVar.f1161c, bVar.f1162d));
    }
}
