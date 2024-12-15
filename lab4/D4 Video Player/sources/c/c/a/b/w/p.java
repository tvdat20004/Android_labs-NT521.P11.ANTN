package c.c.a.b.w;

import android.view.View;

/* loaded from: classes.dex */
public class p implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f4110a;

    public p(x xVar) {
        this.f4110a = xVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        this.f4110a.f4122a.setEndIconActivated(z);
        if (z) {
            return;
        }
        x.f(this.f4110a, false);
        this.f4110a.i = false;
    }
}
