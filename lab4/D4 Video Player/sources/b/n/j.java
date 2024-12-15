package b.n;

import b.n.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class j extends e {

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference<h> f1540c;

    /* renamed from: a, reason: collision with root package name */
    public b.c.a.b.a<g, i> f1538a = new b.c.a.b.a<>();

    /* renamed from: d, reason: collision with root package name */
    public int f1541d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1542e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1543f = false;
    public ArrayList<e.b> g = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public e.b f1539b = e.b.INITIALIZED;

    public j(h hVar) {
        this.f1540c = new WeakReference<>(hVar);
    }

    public static e.b c(e.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return e.b.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return e.b.DESTROYED;
                        }
                        throw new IllegalArgumentException("Unexpected event value " + aVar);
                    }
                }
            }
            return e.b.STARTED;
        }
        return e.b.CREATED;
    }

    public static e.b e(e.b bVar, e.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    public static e.a i(e.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return e.a.ON_CREATE;
        }
        if (ordinal == 2) {
            return e.a.ON_START;
        }
        if (ordinal == 3) {
            return e.a.ON_RESUME;
        }
        if (ordinal == 4) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Unexpected state value " + bVar);
    }

    @Override // b.n.e
    public void a(g gVar) {
        h hVar;
        e.b bVar = this.f1539b;
        e.b bVar2 = e.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = e.b.INITIALIZED;
        }
        i iVar = new i(gVar, bVar2);
        if (this.f1538a.d(gVar, iVar) == null && (hVar = this.f1540c.get()) != null) {
            boolean z = this.f1541d != 0 || this.f1542e;
            e.b b2 = b(gVar);
            this.f1541d++;
            while (iVar.f1536a.compareTo(b2) < 0 && this.f1538a.f853f.containsKey(gVar)) {
                this.g.add(iVar.f1536a);
                iVar.a(hVar, i(iVar.f1536a));
                g();
                b2 = b(gVar);
            }
            if (!z) {
                h();
            }
            this.f1541d--;
        }
    }

    public final e.b b(g gVar) {
        b.c.a.b.a<g, i> aVar = this.f1538a;
        e.b bVar = null;
        b.c.a.b.d<g, i> dVar = aVar.f853f.containsKey(gVar) ? aVar.f853f.get(gVar).f857e : null;
        e.b bVar2 = dVar != null ? dVar.f855c.f1536a : null;
        if (!this.g.isEmpty()) {
            bVar = this.g.get(r0.size() - 1);
        }
        return e(e(this.f1539b, bVar2), bVar);
    }

    public void d(e.a aVar) {
        f(c(aVar));
    }

    public final void f(e.b bVar) {
        if (this.f1539b == bVar) {
            return;
        }
        this.f1539b = bVar;
        if (this.f1542e || this.f1541d != 0) {
            this.f1543f = true;
            return;
        }
        this.f1542e = true;
        h();
        this.f1542e = false;
    }

    public final void g() {
        this.g.remove(r0.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0132 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.n.j.h():void");
    }
}
