package b.t;

import android.util.Property;
import android.view.View;

/* loaded from: classes.dex */
public final class o0 extends Property<View, Float> {
    public o0(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public Float get(View view) {
        return Float.valueOf(q0.a(view));
    }

    @Override // android.util.Property
    public void set(View view, Float f2) {
        float floatValue = f2.floatValue();
        q0.f1772a.e(view, floatValue);
    }
}
