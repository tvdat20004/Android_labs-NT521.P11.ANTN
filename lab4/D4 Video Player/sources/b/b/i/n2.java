package b.b.i;

import android.R;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class n2 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final b.b.h.m.a f744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p2 f745c;

    public n2(p2 p2Var) {
        this.f745c = p2Var;
        this.f744b = new b.b.h.m.a(p2Var.f760a.getContext(), 0, R.id.home, 0, p2Var.i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        p2 p2Var = this.f745c;
        Window.Callback callback = p2Var.l;
        if (callback == null || !p2Var.m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f744b);
    }
}
