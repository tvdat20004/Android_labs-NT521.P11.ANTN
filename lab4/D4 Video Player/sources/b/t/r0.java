package b.t;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes.dex */
public abstract class r0 extends w0 {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f1774c = true;

    @Override // b.t.w0
    public void a(View view) {
    }

    @Override // b.t.w0
    @SuppressLint({"NewApi"})
    public float b(View view) {
        if (f1774c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f1774c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // b.t.w0
    public void c(View view) {
    }

    @Override // b.t.w0
    @SuppressLint({"NewApi"})
    public void e(View view, float f2) {
        if (f1774c) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f1774c = false;
            }
        }
        view.setAlpha(f2);
    }
}
