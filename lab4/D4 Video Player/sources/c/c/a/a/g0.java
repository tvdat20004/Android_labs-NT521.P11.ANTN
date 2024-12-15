package c.c.a.a;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public t0 f2000a;

    /* renamed from: b, reason: collision with root package name */
    public int f2001b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2002c;

    /* renamed from: d, reason: collision with root package name */
    public int f2003d;

    public g0(d0 d0Var) {
    }

    public void a(int i) {
        this.f2001b += i;
    }

    public void b(int i) {
        if (this.f2002c && this.f2003d != 4) {
            c.c.a.a.x1.p.c(i == 4);
        } else {
            this.f2002c = true;
            this.f2003d = i;
        }
    }
}
