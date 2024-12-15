package c.c.a.b.w;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public class q extends TextInputLayout.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f4111e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x xVar, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f4111e = xVar;
    }

    @Override // com.google.android.material.textfield.TextInputLayout.e, b.h.j.b
    public void d(View view, b.h.j.k0.b bVar) {
        boolean z;
        super.d(view, bVar);
        if (this.f4111e.f4122a.getEditText().getKeyListener() == null) {
            bVar.f1286a.setClassName(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            z = bVar.f1286a.isShowingHintText();
        } else {
            Bundle h = bVar.h();
            z = h != null && (h.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
        }
        if (z) {
            bVar.p(null);
        }
    }

    @Override // b.h.j.b
    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f1254a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        x xVar = this.f4111e;
        AutoCompleteTextView e2 = x.e(xVar, xVar.f4122a.getEditText());
        if (accessibilityEvent.getEventType() == 1 && this.f4111e.n.isTouchExplorationEnabled()) {
            x.g(this.f4111e, e2);
        }
    }
}
