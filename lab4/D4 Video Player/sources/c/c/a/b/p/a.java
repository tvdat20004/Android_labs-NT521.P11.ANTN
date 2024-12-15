package c.c.a.b.p;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public class a extends b.h.j.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f3956d;

    public a(CheckableImageButton checkableImageButton) {
        this.f3956d = checkableImageButton;
    }

    @Override // b.h.j.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1254a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f3956d.isChecked());
    }

    @Override // b.h.j.b
    public void d(View view, b.h.j.k0.b bVar) {
        this.f1254a.onInitializeAccessibilityNodeInfo(view, bVar.f1286a);
        bVar.f1286a.setCheckable(this.f3956d.f4236e);
        bVar.f1286a.setChecked(this.f3956d.isChecked());
    }
}
