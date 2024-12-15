package b.r.b;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class p0 extends RecyclerView.q {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1669a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f1670b;

    public p0(z zVar) {
        this.f1670b = zVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f1669a) {
            this.f1669a = false;
            this.f1670b.k();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f1669a = true;
    }
}
