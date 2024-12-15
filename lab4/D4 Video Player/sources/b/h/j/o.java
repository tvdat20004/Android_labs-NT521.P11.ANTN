package b.h.j;

import android.view.View;

/* loaded from: classes.dex */
public class o extends r<Boolean> {
    public o(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    @Override // b.h.j.r
    public Boolean b(View view) {
        return Boolean.valueOf(view.isScreenReaderFocusable());
    }
}
