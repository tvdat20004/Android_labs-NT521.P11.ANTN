package b.h.j;

import java.util.Objects;

/* loaded from: classes.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f1277a;

    public i0(j0 j0Var) {
        this.f1277a = j0Var;
    }

    public j0 a() {
        return this.f1277a;
    }

    public j0 b() {
        return this.f1277a;
    }

    public j0 c() {
        return this.f1277a;
    }

    public c d() {
        return null;
    }

    public b.h.d.b e() {
        return g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return j() == i0Var.j() && i() == i0Var.i() && Objects.equals(g(), i0Var.g()) && Objects.equals(f(), i0Var.f()) && Objects.equals(d(), i0Var.d());
    }

    public b.h.d.b f() {
        return b.h.d.b.f1158e;
    }

    public b.h.d.b g() {
        return b.h.d.b.f1158e;
    }

    public j0 h(int i, int i2, int i3, int i4) {
        return j0.f1280b;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(j()), Boolean.valueOf(i()), g(), f(), d());
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return false;
    }
}
