package c.c.a.b.w;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes.dex */
public class e0 implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f4092b;

    public e0(i0 i0Var) {
        this.f4092b = i0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f4092b.f4124c.setChecked(!i0.e(r1));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
