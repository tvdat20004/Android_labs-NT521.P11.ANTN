package b.b.i;

import android.view.View;

/* loaded from: classes.dex */
public class g extends k1 {
    public final /* synthetic */ h k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, View view, m mVar) {
        super(view);
        this.k = hVar;
    }

    @Override // b.b.i.k1
    public b.b.h.m.b0 b() {
        i iVar = this.k.f692d.v;
        if (iVar == null) {
            return null;
        }
        return iVar.a();
    }

    @Override // b.b.i.k1
    public boolean c() {
        this.k.f692d.q();
        return true;
    }

    @Override // b.b.i.k1
    public boolean d() {
        m mVar = this.k.f692d;
        if (mVar.x != null) {
            return false;
        }
        mVar.k();
        return true;
    }
}
