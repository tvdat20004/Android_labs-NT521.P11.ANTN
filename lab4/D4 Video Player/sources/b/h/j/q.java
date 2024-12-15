package b.h.j;

import android.view.View;

/* loaded from: classes.dex */
public class q extends r<Boolean> {
    public q(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    @Override // b.h.j.r
    public Boolean b(View view) {
        return Boolean.valueOf(view.isAccessibilityHeading());
    }

    public void d(View view, Object obj) {
        view.setAccessibilityHeading(((Boolean) obj).booleanValue());
    }

    public boolean e(Object obj, Object obj2) {
        return !a((Boolean) obj, (Boolean) obj2);
    }
}
