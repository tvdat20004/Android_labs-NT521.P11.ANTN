package c.c.a.a.v1.q;

import c.c.a.a.v1.e;
import c.c.a.a.x1.p;
import c.c.a.a.z1.l0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.v1.b[] f3334b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f3335c;

    public b(c.c.a.a.v1.b[] bVarArr, long[] jArr) {
        this.f3334b = bVarArr;
        this.f3335c = jArr;
    }

    @Override // c.c.a.a.v1.e
    public int a(long j) {
        int b2 = l0.b(this.f3335c, j, false, false);
        if (b2 < this.f3335c.length) {
            return b2;
        }
        return -1;
    }

    @Override // c.c.a.a.v1.e
    public List<c.c.a.a.v1.b> b(long j) {
        int c2 = l0.c(this.f3335c, j, true, false);
        if (c2 != -1) {
            c.c.a.a.v1.b[] bVarArr = this.f3334b;
            if (bVarArr[c2] != c.c.a.a.v1.b.p) {
                return Collections.singletonList(bVarArr[c2]);
            }
        }
        return Collections.emptyList();
    }

    @Override // c.c.a.a.v1.e
    public long c(int i) {
        p.c(i >= 0);
        p.c(i < this.f3335c.length);
        return this.f3335c[i];
    }

    @Override // c.c.a.a.v1.e
    public int d() {
        return this.f3335c.length;
    }
}