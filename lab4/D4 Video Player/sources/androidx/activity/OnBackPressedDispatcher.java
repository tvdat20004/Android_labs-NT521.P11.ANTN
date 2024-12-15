package androidx.activity;

import b.a.a;
import b.a.d;
import b.l.b.u;
import b.l.b.z;
import b.n.e;
import b.n.f;
import b.n.h;
import b.n.j;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f44a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<u> f45b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements f, a {

        /* renamed from: a, reason: collision with root package name */
        public final e f46a;

        /* renamed from: b, reason: collision with root package name */
        public final u f47b;

        /* renamed from: c, reason: collision with root package name */
        public a f48c;

        public LifecycleOnBackPressedCancellable(e eVar, u uVar) {
            this.f46a = eVar;
            this.f47b = uVar;
            eVar.a(this);
        }

        @Override // b.a.a
        public void cancel() {
            ((j) this.f46a).f1538a.e(this);
            this.f47b.f1490b.remove(this);
            a aVar = this.f48c;
            if (aVar != null) {
                aVar.cancel();
                this.f48c = null;
            }
        }

        @Override // b.n.f
        public void d(h hVar, e.a aVar) {
            if (aVar == e.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                u uVar = this.f47b;
                onBackPressedDispatcher.f45b.add(uVar);
                d dVar = new d(onBackPressedDispatcher, uVar);
                uVar.f1490b.add(dVar);
                this.f48c = dVar;
                return;
            }
            if (aVar != e.a.ON_STOP) {
                if (aVar == e.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                a aVar2 = this.f48c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f44a = runnable;
    }

    public void a() {
        Iterator<u> descendingIterator = this.f45b.descendingIterator();
        while (descendingIterator.hasNext()) {
            u next = descendingIterator.next();
            if (next.f1489a) {
                z zVar = next.f1491c;
                zVar.B(true);
                if (zVar.h.f1489a) {
                    zVar.V();
                    return;
                } else {
                    zVar.g.a();
                    return;
                }
            }
        }
        Runnable runnable = this.f44a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
