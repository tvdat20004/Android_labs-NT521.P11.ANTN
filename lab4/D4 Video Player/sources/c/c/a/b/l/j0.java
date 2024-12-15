package c.c.a.b.l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class j0 extends RecyclerView.e<i0> {

    /* renamed from: c, reason: collision with root package name */
    public final j<?> f3918c;

    public j0(j<?> jVar) {
        this.f3918c = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int a() {
        return this.f3918c.W.f3885f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void d(i0 i0Var, int i) {
        i0 i0Var2 = i0Var;
        int i2 = this.f3918c.W.f3881b.f3939e + i;
        String string = i0Var2.t.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        i0Var2.t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        i0Var2.t.setContentDescription(String.format(string, Integer.valueOf(i2)));
        e eVar = this.f3918c.Z;
        Calendar d2 = g0.d();
        d dVar = d2.get(1) == i2 ? eVar.f3903f : eVar.f3901d;
        Iterator<Long> it = this.f3918c.V.h().iterator();
        while (it.hasNext()) {
            d2.setTimeInMillis(it.next().longValue());
            if (d2.get(1) == i2) {
                dVar = eVar.f3902e;
            }
        }
        dVar.b(i0Var2.t);
        i0Var2.t.setOnClickListener(new h0(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public i0 e(ViewGroup viewGroup, int i) {
        return new i0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    public int g(int i) {
        return i - this.f3918c.W.f3881b.f3939e;
    }
}
