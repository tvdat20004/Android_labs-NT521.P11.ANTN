package b.h.g;

/* loaded from: classes.dex */
public class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f1210c;

    public k(l lVar, Object obj) {
        this.f1210c = lVar;
        this.f1209b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1210c.f1213d.a(this.f1209b);
    }
}
