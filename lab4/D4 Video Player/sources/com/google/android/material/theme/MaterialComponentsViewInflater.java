package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import b.b.c.j0;
import b.b.i.n;
import b.b.i.p;
import b.b.i.q;
import b.b.i.v0;
import c.c.a.b.j.a;
import c.c.a.b.w.c0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends j0 {
    @Override // b.b.c.j0
    public n a(Context context, AttributeSet attributeSet) {
        return new c0(context, attributeSet);
    }

    @Override // b.b.c.j0
    public p b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // b.b.c.j0
    public q c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // b.b.c.j0
    public b.b.i.c0 d(Context context, AttributeSet attributeSet) {
        return new c.c.a.b.q.a(context, attributeSet);
    }

    @Override // b.b.c.j0
    public v0 e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
