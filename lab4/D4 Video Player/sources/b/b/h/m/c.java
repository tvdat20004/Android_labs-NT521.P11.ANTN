package b.b.h.m;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f572b;

    public c(h hVar) {
        this.f572b = hVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (!this.f572b.b() || this.f572b.j.size() <= 0 || this.f572b.j.get(0).f585a.z) {
            return;
        }
        View view = this.f572b.q;
        if (view == null || !view.isShown()) {
            this.f572b.dismiss();
            return;
        }
        Iterator<g> it = this.f572b.j.iterator();
        while (it.hasNext()) {
            it.next().f585a.f();
        }
    }
}
