package b.t;

import android.graphics.PointF;
import android.util.Property;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d extends Property<j, PointF> {
    public d(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ PointF get(j jVar) {
        return null;
    }

    @Override // android.util.Property
    public void set(j jVar, PointF pointF) {
        j jVar2 = jVar;
        PointF pointF2 = pointF;
        Objects.requireNonNull(jVar2);
        jVar2.f1746c = Math.round(pointF2.x);
        int round = Math.round(pointF2.y);
        jVar2.f1747d = round;
        int i = jVar2.g + 1;
        jVar2.g = i;
        if (jVar2.f1749f == i) {
            q0.b(jVar2.f1748e, jVar2.f1744a, jVar2.f1745b, jVar2.f1746c, round);
            jVar2.f1749f = 0;
            jVar2.g = 0;
        }
    }
}
