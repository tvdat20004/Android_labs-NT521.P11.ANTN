package b.l.b;

import android.view.View;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f1420a;

    public i(Fragment fragment) {
        this.f1420a = fragment;
    }

    public void a() {
        if (this.f1420a.f() != null) {
            View f2 = this.f1420a.f();
            this.f1420a.h0(null);
            f2.clearAnimation();
        }
        this.f1420a.i0(null);
    }
}
