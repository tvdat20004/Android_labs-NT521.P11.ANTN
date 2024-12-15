package b.t;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes.dex */
public abstract class t0 extends s0 {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1777f = true;

    @Override // b.t.w0
    @SuppressLint({"NewApi"})
    public void d(View view, int i, int i2, int i3, int i4) {
        if (f1777f) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f1777f = false;
            }
        }
    }
}
