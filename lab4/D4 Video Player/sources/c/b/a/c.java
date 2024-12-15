package c.b.a;

/* loaded from: classes.dex */
public class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.b.a.j.a f1867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f1868c;

    public c(d dVar, c.b.a.j.a aVar) {
        this.f1868c = dVar;
        this.f1867b = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        c.b.a.j.a aVar = this.f1868c.o;
        if (aVar != null) {
            aVar.d();
            d dVar = this.f1868c;
            c.b.a.j.a aVar2 = dVar.o;
            dVar.o = null;
        }
        d dVar2 = this.f1868c;
        dVar2.o = this.f1867b;
        dVar2.p = true;
        dVar2.q.requestRender();
    }
}
