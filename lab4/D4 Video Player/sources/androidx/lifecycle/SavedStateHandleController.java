package androidx.lifecycle;

import b.n.e;
import b.n.f;
import b.n.h;
import b.n.j;
import b.s.a;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f240a;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$1, reason: invalid class name */
    public final class AnonymousClass1 implements f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f241a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.s.a f242b;

        @Override // b.n.f
        public void d(h hVar, e.a aVar) {
            if (aVar == e.a.ON_START) {
                ((j) this.f241a).f1538a.e(this);
                this.f242b.a(a.class);
            }
        }
    }

    public static final class a implements a.InterfaceC0005a {
    }

    @Override // b.n.f
    public void d(h hVar, e.a aVar) {
        if (aVar == e.a.ON_DESTROY) {
            this.f240a = false;
            ((j) hVar.g()).f1538a.e(this);
        }
    }
}
