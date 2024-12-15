package c.c.a.a.u1.x0.b0;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: d, reason: collision with root package name */
    public final int f3138d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3139e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3140f;
    public final boolean g;
    public final int h;
    public final long i;
    public final int j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public final c.c.a.a.p1.e n;
    public final List<h> o;
    public final long p;

    public i(int i, String str, List<String> list, long j, long j2, boolean z, int i2, long j3, int i3, long j4, boolean z2, boolean z3, boolean z4, c.c.a.a.p1.e eVar, List<h> list2) {
        super(str, list, z2);
        this.f3138d = i;
        this.f3140f = j2;
        this.g = z;
        this.h = i2;
        this.i = j3;
        this.j = i3;
        this.k = j4;
        this.l = z3;
        this.m = z4;
        this.n = eVar;
        this.o = Collections.unmodifiableList(list2);
        if (list2.isEmpty()) {
            this.p = 0L;
        } else {
            h hVar = list2.get(list2.size() - 1);
            this.p = hVar.f3137f + hVar.f3135d;
        }
        this.f3139e = j == -9223372036854775807L ? -9223372036854775807L : j >= 0 ? j : this.p + j;
    }

    @Override // c.c.a.a.t1.a
    public j a(List list) {
        return this;
    }
}
