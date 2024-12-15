package c.c.a.a.v1.t;

import c.c.a.a.v1.e;
import c.c.a.a.x1.p;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final b f3367c = new b();

    /* renamed from: b, reason: collision with root package name */
    public final List<c.c.a.a.v1.b> f3368b;

    public b() {
        this.f3368b = Collections.emptyList();
    }

    public b(c.c.a.a.v1.b bVar) {
        this.f3368b = Collections.singletonList(bVar);
    }

    @Override // c.c.a.a.v1.e
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // c.c.a.a.v1.e
    public List<c.c.a.a.v1.b> b(long j) {
        return j >= 0 ? this.f3368b : Collections.emptyList();
    }

    @Override // c.c.a.a.v1.e
    public long c(int i) {
        p.c(i == 0);
        return 0L;
    }

    @Override // c.c.a.a.v1.e
    public int d() {
        return 1;
    }
}
