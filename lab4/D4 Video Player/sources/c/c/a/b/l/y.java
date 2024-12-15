package c.c.a.b.l;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import c.c.a.b.l.j;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

/* loaded from: classes.dex */
public class y implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f3946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f3947c;

    public y(a0 a0Var, MaterialCalendarGridView materialCalendarGridView) {
        this.f3947c = a0Var;
        this.f3946b = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        x adapter = this.f3946b.getAdapter();
        if (i >= adapter.a() && i <= adapter.c()) {
            j.f fVar = this.f3947c.f3879e;
            long longValue = this.f3946b.getAdapter().getItem(i).longValue();
            j.d dVar = (j.d) fVar;
            j jVar = j.this;
            if (longValue >= ((h) jVar.W.f3884e).f3905b) {
                jVar.V.f(longValue);
                Iterator it = j.this.T.iterator();
                while (it.hasNext()) {
                    ((b0) it.next()).a(j.this.V.a());
                }
                j.this.b0.getAdapter().f313a.b();
                RecyclerView recyclerView = j.this.a0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f313a.b();
                }
            }
        }
    }
}
