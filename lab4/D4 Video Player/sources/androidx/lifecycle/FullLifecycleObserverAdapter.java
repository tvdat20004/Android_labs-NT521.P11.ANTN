package androidx.lifecycle;

import b.n.c;
import b.n.e;
import b.n.f;
import b.n.h;

/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements f {

    /* renamed from: a, reason: collision with root package name */
    public final c f229a;

    /* renamed from: b, reason: collision with root package name */
    public final f f230b;

    @Override // b.n.f
    public void d(h hVar, e.a aVar) {
        switch (aVar) {
            case ON_CREATE:
                this.f229a.c(hVar);
                break;
            case ON_START:
                this.f229a.g(hVar);
                break;
            case ON_RESUME:
                this.f229a.a(hVar);
                break;
            case ON_PAUSE:
                this.f229a.e(hVar);
                break;
            case ON_STOP:
                this.f229a.f(hVar);
                break;
            case ON_DESTROY:
                this.f229a.b(hVar);
                break;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        f fVar = this.f230b;
        if (fVar != null) {
            fVar.d(hVar, aVar);
        }
    }
}
