package c.c.a.b.l;

import android.view.View;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class l extends b.h.j.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f3922d;

    public l(j jVar) {
        this.f3922d = jVar;
    }

    @Override // b.h.j.b
    public void d(View view, b.h.j.k0.b bVar) {
        j jVar;
        int i;
        this.f1254a.onInitializeAccessibilityNodeInfo(view, bVar.f1286a);
        if (this.f3922d.d0.getVisibility() == 0) {
            jVar = this.f3922d;
            i = R.string.mtrl_picker_toggle_to_year_selection;
        } else {
            jVar = this.f3922d;
            i = R.string.mtrl_picker_toggle_to_day_selection;
        }
        bVar.p(jVar.w(i));
    }
}
