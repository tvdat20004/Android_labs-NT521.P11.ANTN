package b.b.i;

import android.content.Context;
import android.view.View;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class i extends b.b.h.m.x {
    public final /* synthetic */ m m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, Context context, b.b.h.m.l lVar, View view, boolean z) {
        super(context, lVar, view, z, R.attr.actionOverflowMenuStyle, 0);
        this.m = mVar;
        this.g = 8388613;
        d(mVar.z);
    }

    @Override // b.b.h.m.x
    public void c() {
        b.b.h.m.l lVar = this.m.f734d;
        if (lVar != null) {
            lVar.c(true);
        }
        this.m.v = null;
        super.c();
    }
}
