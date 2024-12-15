package b.b.i;

import android.content.Context;
import android.view.View;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class d extends b.b.h.m.x {
    public final /* synthetic */ m m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m mVar, Context context, b.b.h.m.f0 f0Var, View view) {
        super(context, f0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = mVar;
        if (!f0Var.A.g()) {
            View view2 = mVar.k;
            this.f638f = view2 == null ? (View) mVar.i : view2;
        }
        d(mVar.z);
    }

    @Override // b.b.h.m.x
    public void c() {
        m mVar = this.m;
        mVar.w = null;
        mVar.A = 0;
        super.c();
    }
}
