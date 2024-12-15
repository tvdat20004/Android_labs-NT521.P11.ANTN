package c.c.a.b.u;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class o extends u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f4048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Matrix f4049c;

    public o(v vVar, List list, Matrix matrix) {
        this.f4048b = list;
        this.f4049c = matrix;
    }

    @Override // c.c.a.b.u.u
    public void a(Matrix matrix, c.c.a.b.t.a aVar, int i, Canvas canvas) {
        Iterator it = this.f4048b.iterator();
        while (it.hasNext()) {
            ((u) it.next()).a(this.f4049c, aVar, i, canvas);
        }
    }
}
