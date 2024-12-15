package b.b.e.a;

/* loaded from: classes.dex */
public class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f506b;

    public i(l lVar) {
        this.f506b = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f506b.a(true);
        this.f506b.invalidateSelf();
    }
}
