package c.c.a.b.l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import c.c.a.b.l.j;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class a0 extends RecyclerView.e<z> {

    /* renamed from: c, reason: collision with root package name */
    public final b f3877c;

    /* renamed from: d, reason: collision with root package name */
    public final f<?> f3878d;

    /* renamed from: e, reason: collision with root package name */
    public final j.f f3879e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3880f;

    public a0(Context context, f<?> fVar, b bVar, j.f fVar2) {
        w wVar = bVar.f3881b;
        w wVar2 = bVar.f3882c;
        w wVar3 = bVar.f3883d;
        if (wVar.compareTo(wVar3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (wVar3.compareTo(wVar2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i = x.f3941f;
        int i2 = j.e0;
        this.f3880f = (i * context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height)) + (r.u0(context) ? context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f3877c = bVar;
        this.f3878d = fVar;
        this.f3879e = fVar2;
        f(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int a() {
        return this.f3877c.g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long b(int i) {
        return this.f3877c.f3881b.n(i).f3936b.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void d(z zVar, int i) {
        z zVar2 = zVar;
        w n = this.f3877c.f3881b.n(i);
        zVar2.t.setText(n.f3937c);
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) zVar2.u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !n.equals(materialCalendarGridView.getAdapter().f3942b)) {
            x xVar = new x(n, this.f3878d, this.f3877c);
            materialCalendarGridView.setNumColumns(n.f3940f);
            materialCalendarGridView.setAdapter((ListAdapter) xVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new y(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public z e(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!r.u0(viewGroup.getContext())) {
            return new z(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.n(-1, this.f3880f));
        return new z(linearLayout, true);
    }

    public w g(int i) {
        return this.f3877c.f3881b.n(i);
    }

    public int h(w wVar) {
        return this.f3877c.f3881b.o(wVar);
    }
}
