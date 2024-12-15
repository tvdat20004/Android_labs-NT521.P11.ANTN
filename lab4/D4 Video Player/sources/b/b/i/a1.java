package b.b.i;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public class a1 extends ToggleButton {

    /* renamed from: b, reason: collision with root package name */
    public final u0 f642b;

    public a1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        h2.a(this, getContext());
        u0 u0Var = new u0(this);
        this.f642b = u0Var;
        u0Var.e(attributeSet, R.attr.buttonStyleToggle);
    }
}
