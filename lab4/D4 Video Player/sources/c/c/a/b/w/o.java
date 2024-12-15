package c.c.a.b.w;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class o implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f4109b;

    public o(x xVar) {
        this.f4109b = xVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        x xVar = this.f4109b;
        AutoCompleteTextView e2 = x.e(xVar, xVar.f4122a.getEditText());
        e2.post(new m(this, e2));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
