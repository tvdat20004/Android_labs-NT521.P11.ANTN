package b.t;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class k extends b0 {
    public int[] y = new int[2];
    public static final String[] z = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<Drawable, PointF> A = new b(PointF.class, "boundsOrigin");
    public static final Property<j, PointF> B = new c(PointF.class, "topLeft");
    public static final Property<j, PointF> C = new d(PointF.class, "bottomRight");
    public static final Property<View, PointF> D = new e(PointF.class, "bottomRight");
    public static final Property<View, PointF> E = new f(PointF.class, "topLeft");
    public static final Property<View, PointF> F = new g(PointF.class, "position");
    public static t G = new t();

    public final void H(l0 l0Var) {
        View view = l0Var.f1755b;
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        l0Var.f1754a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        l0Var.f1754a.put("android:changeBounds:parent", l0Var.f1755b.getParent());
    }

    @Override // b.t.b0
    public void d(l0 l0Var) {
        H(l0Var);
    }

    @Override // b.t.b0
    public void g(l0 l0Var) {
        H(l0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0114  */
    @Override // b.t.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator k(android.view.ViewGroup r19, b.t.l0 r20, b.t.l0 r21) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.t.k.k(android.view.ViewGroup, b.t.l0, b.t.l0):android.animation.Animator");
    }

    @Override // b.t.b0
    public String[] p() {
        return z;
    }
}
