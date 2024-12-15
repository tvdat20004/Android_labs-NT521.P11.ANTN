package b.b.i;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes.dex */
public class g0 extends k1 {
    public final /* synthetic */ n0 k;
    public final /* synthetic */ r0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(r0 r0Var, View view, n0 n0Var) {
        super(view);
        this.l = r0Var;
        this.k = n0Var;
    }

    @Override // b.b.i.k1
    public b.b.h.m.b0 b() {
        return this.k;
    }

    @Override // b.b.i.k1
    @SuppressLint({"SyntheticAccessor"})
    public boolean c() {
        if (this.l.getInternalPopup().b()) {
            return true;
        }
        this.l.b();
        return true;
    }
}
