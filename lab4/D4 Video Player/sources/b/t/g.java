package b.t;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* loaded from: classes.dex */
public final class g extends Property<View, PointF> {
    public g(Class cls, String str) {
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
        int round = Math.round(pointF2.x);
        int round2 = Math.round(pointF2.y);
        q0.b(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
    }
}
