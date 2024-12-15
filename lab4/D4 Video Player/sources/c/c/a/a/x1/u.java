package c.c.a.a.x1;

import android.content.Context;
import c.c.a.a.u1.s0;
import c.c.a.a.w1.m;
import c.c.a.a.w1.o;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3495a;

    /* renamed from: b, reason: collision with root package name */
    public final o.a f3496b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3497c;

    /* renamed from: d, reason: collision with root package name */
    public final e f3498d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3499e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3500f;
    public boolean g;
    public boolean h;
    public List<m.a> i;

    public u(Context context, CharSequence charSequence, c.c.a.a.w1.m mVar, int i) {
        this.f3495a = context;
        o.a aVar = mVar.f3429c;
        Objects.requireNonNull(aVar);
        this.f3496b = aVar;
        this.f3497c = i;
        s0 s0Var = aVar.f3432c[i];
        c.c.a.a.w1.k kVar = mVar.f3423e.get();
        this.h = kVar.A.get(i);
        m.a j = kVar.j(i, s0Var);
        this.i = j == null ? Collections.emptyList() : Collections.singletonList(j);
        this.f3498d = new e(mVar, kVar, i, s0Var);
    }
}
