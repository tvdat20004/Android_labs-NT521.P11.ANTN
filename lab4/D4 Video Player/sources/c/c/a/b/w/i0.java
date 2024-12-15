package c.c.a.b.w;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class i0 extends y {

    /* renamed from: d, reason: collision with root package name */
    public final TextWatcher f4100d;

    /* renamed from: e, reason: collision with root package name */
    public final TextInputLayout.f f4101e;

    /* renamed from: f, reason: collision with root package name */
    public final TextInputLayout.g f4102f;

    public i0(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f4100d = new e0(this);
        this.f4101e = new f0(this);
        this.f4102f = new g0(this);
    }

    public static boolean e(i0 i0Var) {
        EditText editText = i0Var.f4122a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // c.c.a.b.w.y
    public void a() {
        this.f4122a.setEndIconDrawable(b.b.d.a.a.a(this.f4123b, R.drawable.design_password_eye));
        TextInputLayout textInputLayout = this.f4122a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        this.f4122a.setEndIconOnClickListener(new h0(this));
        this.f4122a.a(this.f4101e);
        this.f4122a.g0.add(this.f4102f);
        EditText editText = this.f4122a.getEditText();
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
