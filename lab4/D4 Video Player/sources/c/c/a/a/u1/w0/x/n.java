package c.c.a.a.u1.w0.x;

import c.c.a.a.z1.l0;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n extends s {

    /* renamed from: d, reason: collision with root package name */
    public final long f3081d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3082e;

    /* renamed from: f, reason: collision with root package name */
    public final List<q> f3083f;

    public n(i iVar, long j, long j2, long j3, long j4, List<q> list) {
        super(iVar, j, j2);
        this.f3081d = j3;
        this.f3082e = j4;
        this.f3083f = list;
    }

    public abstract int b(long j);

    public final long c(long j) {
        List<q> list = this.f3083f;
        return l0.C(list != null ? list.get((int) (j - this.f3081d)).f3084a - this.f3090c : (j - this.f3081d) * this.f3082e, 1000000L, this.f3089b);
    }

    public abstract i d(m mVar, long j);

    public boolean e() {
        return this.f3083f != null;
    }
}
