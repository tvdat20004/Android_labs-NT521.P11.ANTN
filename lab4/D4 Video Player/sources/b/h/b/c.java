package b.h.b;

/* loaded from: classes.dex */
public class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f1118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1119c;

    public c(f fVar, Object obj) {
        this.f1118b = fVar;
        this.f1119c = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1118b.f1124a = this.f1119c;
    }
}
