package c.c.a.b.w;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes.dex */
public class a implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f4078b;

    public a(j jVar) {
        this.f4078b = jVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.f4078b.f4122a.getSuffixText() != null) {
            return;
        }
        this.f4078b.e(editable.length() > 0);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
