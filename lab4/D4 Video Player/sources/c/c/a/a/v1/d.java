package c.c.a.a.v1;

/* loaded from: classes.dex */
public final class d extends k {

    /* renamed from: f, reason: collision with root package name */
    public final c f3255f;

    public d(c cVar) {
        this.f3255f = cVar;
    }

    @Override // c.c.a.a.o1.h
    public final void i() {
        c cVar = this.f3255f;
        synchronized (cVar.f2186b) {
            this.f2165b = 0;
            this.f3257d = null;
            O[] oArr = cVar.f2190f;
            int i = cVar.h;
            cVar.h = i + 1;
            oArr[i] = this;
            cVar.h();
        }
    }
}
