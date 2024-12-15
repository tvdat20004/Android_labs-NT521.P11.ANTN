package c.c.a.b.w;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public class f0 implements TextInputLayout.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f4094a;

    public f0(i0 i0Var) {
        this.f4094a = i0Var;
    }

    @Override // com.google.android.material.textfield.TextInputLayout.f
    public void a(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.getEditText();
        textInputLayout.setEndIconVisible(true);
        textInputLayout.setEndIconCheckable(true);
        this.f4094a.f4124c.setChecked(!i0.e(r4));
        editText.removeTextChangedListener(this.f4094a.f4100d);
        editText.addTextChangedListener(this.f4094a.f4100d);
    }
}
