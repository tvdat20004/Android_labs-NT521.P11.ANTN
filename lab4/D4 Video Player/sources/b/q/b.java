package b.q;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.preference.EditTextPreference;
import java.util.Objects;

/* loaded from: classes.dex */
public class b extends i {
    public EditText p0;
    public CharSequence q0;

    @Override // b.q.i, b.l.b.d, androidx.fragment.app.Fragment
    public void I(Bundle bundle) {
        super.I(bundle);
        this.q0 = bundle == null ? z0().T : bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
    }

    @Override // b.q.i, b.l.b.d, androidx.fragment.app.Fragment
    public void W(Bundle bundle) {
        super.W(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.q0);
    }

    @Override // b.q.i
    public boolean u0() {
        return true;
    }

    @Override // b.q.i
    public void v0(View view) {
        super.v0(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.p0 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.p0.setText(this.q0);
        EditText editText2 = this.p0;
        editText2.setSelection(editText2.getText().length());
        Objects.requireNonNull(z0());
    }

    @Override // b.q.i
    public void x0(boolean z) {
        if (z) {
            String obj = this.p0.getText().toString();
            EditTextPreference z0 = z0();
            Objects.requireNonNull(z0);
            z0.H(obj);
        }
    }

    public final EditTextPreference z0() {
        return (EditTextPreference) t0();
    }
}
