package e.a.a;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4314a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4315b;

    public l() {
        this.f4314a = false;
        this.f4315b = -1;
    }

    public l(View view, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, n.f4317a, i, i2);
        this.f4314a = obtainStyledAttributes.getBoolean(0, false);
        this.f4315b = obtainStyledAttributes.getInt(1, -1);
        obtainStyledAttributes.recycle();
    }
}
