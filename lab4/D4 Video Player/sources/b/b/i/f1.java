package b.b.i;

/* loaded from: classes.dex */
public class f1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f681b;

    public f1(g1 g1Var) {
        this.f681b = g1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        g1 g1Var = this.f681b;
        g1Var.n = null;
        g1Var.drawableStateChanged();
    }
}
