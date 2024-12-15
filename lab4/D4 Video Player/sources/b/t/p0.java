package b.t;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class p0 extends Property<View, Rect> {
    public p0(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public Rect get(View view) {
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        return view.getClipBounds();
    }

    @Override // android.util.Property
    public void set(View view, Rect rect) {
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        view.setClipBounds(rect);
    }
}
