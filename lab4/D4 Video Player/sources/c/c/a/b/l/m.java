package c.c.a.b.l;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public class m extends RecyclerView.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f3923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f3924b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3925c;

    public m(j jVar, a0 a0Var, MaterialButton materialButton) {
        this.f3925c = jVar;
        this.f3923a = a0Var;
        this.f3924b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f3924b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager q0 = this.f3925c.q0();
        int j1 = i < 0 ? q0.j1() : q0.l1();
        this.f3925c.X = this.f3923a.g(j1);
        this.f3924b.setText(this.f3923a.f3877c.f3881b.n(j1).f3937c);
    }
}
