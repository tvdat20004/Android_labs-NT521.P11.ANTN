package b.h.j.k0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    public final int f1282b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1283c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1284d;

    public a(int i, b bVar, int i2) {
        this.f1282b = i;
        this.f1283c = bVar;
        this.f1284d = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1282b);
        b bVar = this.f1283c;
        bVar.f1286a.performAction(this.f1284d, bundle);
    }
}
