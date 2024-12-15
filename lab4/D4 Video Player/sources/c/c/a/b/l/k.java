package c.c.a.b.l;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes.dex */
public class k extends RecyclerView.l {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f3919a = g0.e();

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f3920b = g0.e();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3921c;

    public k(j jVar) {
        this.f3921c = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void b(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        if ((recyclerView.getAdapter() instanceof j0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            Iterator<b.h.i.b<Long, Long>> it = this.f3921c.V.d().iterator();
            if (it.hasNext()) {
                it.next();
                throw null;
            }
        }
    }
}
