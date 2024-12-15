package c.c.a.a.v1.u;

import c.c.a.a.x1.p;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements c.c.a.a.v1.e {

    /* renamed from: b, reason: collision with root package name */
    public final List<c.c.a.a.v1.b> f3372b;

    public c(List<c.c.a.a.v1.b> list) {
        this.f3372b = Collections.unmodifiableList(list);
    }

    @Override // c.c.a.a.v1.e
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // c.c.a.a.v1.e
    public List<c.c.a.a.v1.b> b(long j) {
        return j >= 0 ? this.f3372b : Collections.emptyList();
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
