package b.b.i;

/* loaded from: classes.dex */
public class n1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f743b;

    public n1(s1 s1Var) {
        this.f743b = s1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        g1 g1Var = this.f743b.f790d;
        if (g1Var != null) {
            g1Var.setListSelectionHidden(true);
            g1Var.requestLayout();
        }
    }
}
