package c.c.a.b.e;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class d {
    public static void a(c cVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        cVar.setBounds(rect);
        cVar.p = new WeakReference<>(view);
        cVar.q = new WeakReference<>(frameLayout);
        cVar.e();
        cVar.invalidateSelf();
    }
}
