package b.h.c.a;

/* loaded from: classes.dex */
public class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1153b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f1154c;

    public h(i iVar, int i) {
        this.f1154c = iVar;
        this.f1153b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1154c.c(this.f1153b);
    }
}
