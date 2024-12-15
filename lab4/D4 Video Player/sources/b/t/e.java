package b.t;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* loaded from: classes.dex */
public final class e extends Property<View, PointF> {
    public e(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ PointF get(View view) {
        return null;
    }

    @Override // android.util.Property
    public void set(View view, PointF pointF) {
        View view2 = view;
        PointF pointF2 = pointF;
        q0.b(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
    }
}
