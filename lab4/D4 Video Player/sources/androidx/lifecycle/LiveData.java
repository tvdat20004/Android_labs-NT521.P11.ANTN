package androidx.lifecycle;

import b.c.a.b.e;
import b.n.e;
import b.n.f;
import b.n.h;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    public static final Object h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f231a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public e<Object<? super T>, LiveData<T>.a> f232b = new e<>();

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f233c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f234d;

    /* renamed from: e, reason: collision with root package name */
    public int f235e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236f;
    public boolean g;

    public class LifecycleBoundObserver extends LiveData<T>.a implements f {
        @Override // b.n.f
        public void d(h hVar, e.a aVar) {
            throw null;
        }
    }

    public abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f237a;
    }

    public LiveData() {
        Object obj = h;
        this.f234d = obj;
        this.f233c = obj;
        this.f235e = -1;
    }

    public static void a(String str) {
        if (!b.c.a.a.a.b().f848a.a()) {
            throw new IllegalStateException(c.a.a.a.a.h("Cannot invoke ", str, " on a background thread"));
        }
    }

    public void b(LiveData<T>.a aVar) {
        if (this.f236f) {
            this.g = true;
            return;
        }
        this.f236f = true;
        do {
            this.g = false;
            b.c.a.b.e<Object<? super T>, LiveData<T>.a>.a b2 = this.f232b.b();
            while (b2.hasNext()) {
                if (((a) ((Map.Entry) b2.next()).getValue()).f237a) {
                    throw null;
                }
                if (this.g) {
                    break;
                }
            }
        } while (this.g);
        this.f236f = false;
    }
}
