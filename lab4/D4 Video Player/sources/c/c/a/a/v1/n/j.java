package c.c.a.a.v1.n;

import java.util.Objects;

/* loaded from: classes.dex */
public final class j extends c.c.a.a.v1.k {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f3278f;

    public j(k kVar, h hVar) {
        this.f3278f = kVar;
    }

    @Override // c.c.a.a.o1.h
    public final void i() {
        k kVar = this.f3278f;
        Objects.requireNonNull(kVar);
        this.f2165b = 0;
        this.f3257d = null;
        kVar.f3280b.add(this);
    }
}
