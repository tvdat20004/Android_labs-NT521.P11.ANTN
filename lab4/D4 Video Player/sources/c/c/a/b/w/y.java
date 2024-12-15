package c.c.a.b.w;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public TextInputLayout f4122a;

    /* renamed from: b, reason: collision with root package name */
    public Context f4123b;

    /* renamed from: c, reason: collision with root package name */
    public CheckableImageButton f4124c;

    public y(TextInputLayout textInputLayout) {
        this.f4122a = textInputLayout;
        this.f4123b = textInputLayout.getContext();
        this.f4124c = textInputLayout.getEndIconView();
    }

    public abstract void a();

    public boolean b(int i) {
        return true;
    }

    public void c(boolean z) {
    }

    public boolean d() {
        return false;
    }
}
