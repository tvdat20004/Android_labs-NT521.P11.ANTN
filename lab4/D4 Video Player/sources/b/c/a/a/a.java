package b.c.a.a;

/* loaded from: classes.dex */
public class a extends d {

    /* renamed from: c, reason: collision with root package name */
    public static volatile a f847c;

    /* renamed from: a, reason: collision with root package name */
    public d f848a;

    /* renamed from: b, reason: collision with root package name */
    public d f849b;

    public a() {
        c cVar = new c();
        this.f849b = cVar;
        this.f848a = cVar;
    }

    public static a b() {
        if (f847c != null) {
            return f847c;
        }
        synchronized (a.class) {
            if (f847c == null) {
                f847c = new a();
            }
        }
        return f847c;
    }

    @Override // b.c.a.a.d
    public boolean a() {
        return this.f848a.a();
    }
}
