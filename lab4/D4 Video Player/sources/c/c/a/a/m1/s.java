package c.c.a.a.m1;

import android.os.Handler;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f2140a;

    /* renamed from: b, reason: collision with root package name */
    public final t f2141b;

    public s(Handler handler, t tVar) {
        if (tVar != null) {
            Objects.requireNonNull(handler);
        } else {
            handler = null;
        }
        this.f2140a = handler;
        this.f2141b = tVar;
    }

    public void a(final c.c.a.a.o1.f fVar) {
        synchronized (fVar) {
        }
        if (this.f2141b != null) {
            this.f2140a.post(new Runnable() { // from class: c.c.a.a.m1.f
                @Override // java.lang.Runnable
                public final void run() {
                    s sVar = s.this;
                    c.c.a.a.o1.f fVar2 = fVar;
                    Objects.requireNonNull(sVar);
                    synchronized (fVar2) {
                    }
                    sVar.f2141b.f(fVar2);
                }
            });
        }
    }
}
