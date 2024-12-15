package c.c.a.b.w;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public class g0 implements TextInputLayout.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f4096a;

    public g0(i0 i0Var) {
        this.f4096a = i0Var;
    }

    @Override // com.google.android.material.textfield.TextInputLayout.g
    public void a(TextInputLayout textInputLayout, int i) {
        EditText editText = textInputLayout.getEditText();
        if (editText == null || i != 1) {
            return;
        }
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editText.removeTextChangedListener(this.f4096a.f4100d);
    }
}
