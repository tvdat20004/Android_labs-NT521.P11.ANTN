package androidx.lifecycle;

import b.n.a;
import b.n.e;
import b.n.f;
import b.n.h;

/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f238a;

    /* renamed from: b, reason: collision with root package name */
    public final a.C0002a f239b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f238a = obj;
        this.f239b = a.f1524c.b(obj.getClass());
    }

    @Override // b.n.f
    public void d(h hVar, e.a aVar) {
        a.C0002a c0002a = this.f239b;
        Object obj = this.f238a;
        a.C0002a.a(c0002a.f1527a.get(aVar), hVar, aVar, obj);
        a.C0002a.a(c0002a.f1527a.get(e.a.ON_ANY), hVar, aVar, obj);
    }
}
