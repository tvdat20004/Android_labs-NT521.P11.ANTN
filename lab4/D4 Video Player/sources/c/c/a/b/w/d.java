package c.c.a.b.w;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public class d implements TextInputLayout.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f4090a;

    public d(j jVar) {
        this.f4090a = jVar;
    }

    @Override // com.google.android.material.textfield.TextInputLayout.g
    public void a(TextInputLayout textInputLayout, int i) {
        EditText editText = textInputLayout.getEditText();
        if (editText == null || i != 2) {
            return;
        }
        editText.removeTextChangedListener(this.f4090a.f4103d);
        if (editText.getOnFocusChangeListener() == this.f4090a.f4104e) {
            editText.setOnFocusChangeListener(null);
        }
    }
}
