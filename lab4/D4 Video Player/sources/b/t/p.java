package b.t;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class p implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f1764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1765b;

    public p(s sVar, View view, ArrayList arrayList) {
        this.f1764a = view;
        this.f1765b = arrayList;
    }

    @Override // b.t.a0
    public void a(b0 b0Var) {
    }

    @Override // b.t.a0
    public void b(b0 b0Var) {
    }

    @Override // b.t.a0
    public void c(b0 b0Var) {
    }

    @Override // b.t.a0
    public void d(b0 b0Var) {
    }

    @Override // b.t.a0
    public void e(b0 b0Var) {
        b0Var.v(this);
        this.f1764a.setVisibility(8);
        int size = this.f1765b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f1765b.get(i)).setVisibility(0);
        }
    }
}
