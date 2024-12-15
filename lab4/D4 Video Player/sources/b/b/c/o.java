package b.b.c;

/* loaded from: classes.dex */
public class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f470b;

    public o(f0 f0Var) {
        this.f470b = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        f0 f0Var = this.f470b;
        if ((f0Var.T & 1) != 0) {
            f0Var.w(0);
        }
        f0 f0Var2 = this.f470b;
        if ((f0Var2.T & 4096) != 0) {
            f0Var2.w(108);
        }
        f0 f0Var3 = this.f470b;
        f0Var3.S = false;
        f0Var3.T = 0;
    }
}
