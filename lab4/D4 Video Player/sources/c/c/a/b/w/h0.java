package c.c.a.b.w;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes.dex */
public class h0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f4098b;

    public h0(i0 i0Var) {
        this.f4098b = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        EditText editText = this.f4098b.f4122a.getEditText();
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        editText.setTransformationMethod(i0.e(this.f4098b) ? null : PasswordTransformationMethod.getInstance());
        if (selectionEnd >= 0) {
            editText.setSelection(selectionEnd);
        }
    }
}
