package b.b.h.m;

import android.os.SystemClock;
import android.view.MenuItem;
import b.b.i.t1;

/* loaded from: classes.dex */
public class f implements t1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f584b;

    public f(h hVar) {
        this.f584b = hVar;
    }

    @Override // b.b.i.t1
    public void e(l lVar, MenuItem menuItem) {
        this.f584b.h.removeCallbacksAndMessages(null);
        int size = this.f584b.j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (lVar == this.f584b.j.get(i).f586b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        this.f584b.h.postAtTime(new e(this, i2 < this.f584b.j.size() ? this.f584b.j.get(i2) : null, menuItem, lVar), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // b.b.i.t1
    public void h(l lVar, MenuItem menuItem) {
        this.f584b.h.removeCallbacksAndMessages(lVar);
    }
}
