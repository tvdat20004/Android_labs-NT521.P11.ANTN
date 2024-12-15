package c.c.a.a.v1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class k extends c.c.a.a.o1.h implements e {

    /* renamed from: d, reason: collision with root package name */
    public e f3257d;

    /* renamed from: e, reason: collision with root package name */
    public long f3258e;

    @Override // c.c.a.a.v1.e
    public int a(long j) {
        e eVar = this.f3257d;
        Objects.requireNonNull(eVar);
        return eVar.a(j - this.f3258e);
    }

    @Override // c.c.a.a.v1.e
    public List<b> b(long j) {
        e eVar = this.f3257d;
        Objects.requireNonNull(eVar);
        return eVar.b(j - this.f3258e);
    }

    @Override // c.c.a.a.v1.e
    public long c(int i) {
        e eVar = this.f3257d;
        Objects.requireNonNull(eVar);
        return eVar.c(i) + this.f3258e;
    }

    @Override // c.c.a.a.v1.e
    public int d() {
        e eVar = this.f3257d;
        Objects.requireNonNull(eVar);
        return eVar.d();
    }
}
