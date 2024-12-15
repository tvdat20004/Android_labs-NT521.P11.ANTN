package c.c.a.a.t1;

import android.net.Uri;
import c.c.a.a.t1.a;
import c.c.a.a.y1.s0;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class b<T extends a<T>> implements s0.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final s0.a<? extends T> f2811a;

    /* renamed from: b, reason: collision with root package name */
    public final List<d> f2812b;

    public b(s0.a<? extends T> aVar, List<d> list) {
        this.f2811a = aVar;
        this.f2812b = list;
    }

    @Override // c.c.a.a.y1.s0.a
    public Object a(Uri uri, InputStream inputStream) {
        T a2 = this.f2811a.a(uri, inputStream);
        List<d> list = this.f2812b;
        return (list == null || list.isEmpty()) ? a2 : (a) a2.a(this.f2812b);
    }
}
