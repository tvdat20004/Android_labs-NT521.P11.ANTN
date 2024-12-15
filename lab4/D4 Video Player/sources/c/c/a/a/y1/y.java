package c.c.a.a.y1;

import android.text.TextUtils;
import c.c.a.a.y1.n;

/* loaded from: classes.dex */
public final class y implements n.a {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f3701a = new g0();

    /* renamed from: b, reason: collision with root package name */
    public final String f3702b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f3703c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3704d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3705e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3706f;

    public y(String str, x0 x0Var, int i, int i2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f3702b = str;
        this.f3703c = null;
        this.f3704d = i;
        this.f3705e = i2;
        this.f3706f = z;
    }

    @Override // c.c.a.a.y1.n.a
    public n a() {
        x xVar = new x(this.f3702b, null, this.f3704d, this.f3705e, this.f3706f, this.f3701a);
        x0 x0Var = this.f3703c;
        if (x0Var != null) {
            xVar.b(x0Var);
        }
        return xVar;
    }
}
