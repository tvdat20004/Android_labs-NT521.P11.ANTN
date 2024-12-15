package b.t;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: classes.dex */
public final class b extends Property<Drawable, PointF> {

    /* renamed from: a, reason: collision with root package name */
    public Rect f1726a;

    public b(Class cls, String str) {
        super(cls, str);
        this.f1726a = new Rect();
    }

    @Override // android.util.Property
    public PointF get(Drawable drawable) {
        drawable.copyBounds(this.f1726a);
        Rect rect = this.f1726a;
        return new PointF(rect.left, rect.top);
    }

    @Override // android.util.Property
    public void set(Drawable drawable, PointF pointF) {
        Drawable drawable2 = drawable;
        PointF pointF2 = pointF;
        drawable2.copyBounds(this.f1726a);
        this.f1726a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
        drawable2.setBounds(this.f1726a);
    }
}
