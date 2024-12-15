package b.t;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public class v0 extends u0 {
    @Override // b.t.r0, b.t.w0
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // b.t.t0, b.t.w0
    public void d(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // b.t.r0, b.t.w0
    public void e(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // b.t.u0, b.t.w0
    public void f(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // b.t.s0, b.t.w0
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // b.t.s0, b.t.w0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
