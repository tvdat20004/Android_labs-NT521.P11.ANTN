package b.h.j;

import android.view.View;

/* loaded from: classes.dex */
public class p extends r<CharSequence> {
    public p(int i, Class cls, int i2, int i3) {
        super(i, cls, i2, i3);
    }

    @Override // b.h.j.r
    public CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }
}
