package c.c.a.b.w;

import android.text.Editable;
import android.view.View;

/* loaded from: classes.dex */
public class e implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f4091b;

    public e(j jVar) {
        this.f4091b = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Editable text = this.f4091b.f4122a.getEditText().getText();
        if (text != null) {
            text.clear();
        }
    }
}
