package c.c.a.a.u1.w0.x;

import c.c.a.a.l0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f3076a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3077b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3078c;

    /* renamed from: d, reason: collision with root package name */
    public final List<e> f3079d;

    /* renamed from: e, reason: collision with root package name */
    public final i f3080e;

    public m(long j, l0 l0Var, String str, s sVar, List list, j jVar) {
        this.f3076a = l0Var;
        this.f3077b = str;
        this.f3079d = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f3080e = sVar.a(this);
        this.f3078c = c.c.a.a.z1.l0.C(sVar.f3090c, 1000000L, sVar.f3089b);
    }

    public abstract String h();

    public abstract c.c.a.a.u1.w0.o i();

    public abstract i j();
}
