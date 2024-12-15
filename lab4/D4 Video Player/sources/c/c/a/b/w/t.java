package c.c.a.b.w;

import android.view.View;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class t implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f4114b;

    public t(x xVar) {
        this.f4114b = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        x.g(this.f4114b, (AutoCompleteTextView) this.f4114b.f4122a.getEditText());
    }
}
