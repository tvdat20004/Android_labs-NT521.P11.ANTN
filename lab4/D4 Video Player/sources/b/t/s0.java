package b.t;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public abstract class s0 extends r0 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f1775d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f1776e = true;

    @Override // b.t.w0
    @SuppressLint({"NewApi"})
    public void g(View view, Matrix matrix) {
        if (f1775d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f1775d = false;
            }
        }
    }

    @Override // b.t.w0
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f1776e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f1776e = false;
            }
        }
    }
}
