package c.c.a.b.w;

import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class v implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f4117a;

    public v(x xVar) {
        this.f4117a = xVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public void onDismiss() {
        x xVar = this.f4117a;
        xVar.i = true;
        xVar.k = System.currentTimeMillis();
        x.f(this.f4117a, false);
    }
}
