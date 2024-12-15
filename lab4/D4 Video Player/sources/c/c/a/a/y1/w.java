package c.c.a.a.y1;

import android.content.Context;
import c.c.a.a.y1.n;

/* loaded from: classes.dex */
public final class w implements n.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3693a;

    /* renamed from: b, reason: collision with root package name */
    public final n.a f3694b;

    public w(Context context, n.a aVar) {
        this.f3693a = context.getApplicationContext();
        this.f3694b = aVar;
    }

    @Override // c.c.a.a.y1.n.a
    public n a() {
        return new v(this.f3693a, this.f3694b.a());
    }
}
