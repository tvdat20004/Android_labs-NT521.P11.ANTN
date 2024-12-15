package c.c.a.b.w;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public class s implements TextInputLayout.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f4113a;

    public s(x xVar) {
        this.f4113a = xVar;
    }

    @Override // com.google.android.material.textfield.TextInputLayout.g
    public void a(TextInputLayout textInputLayout, int i) {
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
        if (autoCompleteTextView == null || i != 3) {
            return;
        }
        autoCompleteTextView.removeTextChangedListener(this.f4113a.f4119d);
        if (autoCompleteTextView.getOnFocusChangeListener() == this.f4113a.f4120e) {
            autoCompleteTextView.setOnFocusChangeListener(null);
        }
        autoCompleteTextView.setOnTouchListener(null);
        autoCompleteTextView.setOnDismissListener(null);
    }
}
