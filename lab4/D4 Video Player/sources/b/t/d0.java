package b.t;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class d0 extends c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.e.b f1732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f1733b;

    public d0(e0 e0Var, b.e.b bVar) {
        this.f1733b = e0Var;
        this.f1732a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.t.a0
    public void e(b0 b0Var) {
        ((ArrayList) this.f1732a.get(this.f1733b.f1735c)).remove(b0Var);
        b0Var.v(this);
    }
}
