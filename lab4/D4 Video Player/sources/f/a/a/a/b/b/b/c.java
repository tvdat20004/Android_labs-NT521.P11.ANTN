package f.a.a.a.b.b.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Objects;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class c extends RecyclerView.e<d> {

    /* renamed from: c, reason: collision with root package name */
    public final Context f4351c;

    /* renamed from: d, reason: collision with root package name */
    public final List<b> f4352d;

    /* renamed from: e, reason: collision with root package name */
    public final a f4353e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f4354f;

    public interface a {
    }

    public c(Context context, List<b> list, a aVar) {
        this.f4351c = context;
        this.f4352d = list;
        this.f4353e = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int a() {
        return this.f4352d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void d(d dVar, int i) {
        d dVar2 = dVar;
        if (i < 0 || i >= this.f4352d.size()) {
            d.a.a.a.f("RecyclerMediaEntryAdapter.onBindViewHolder(): index was out of bounds! index: %d, size: %d", Integer.valueOf(i), Integer.valueOf(this.f4352d.size()));
            return;
        }
        b bVar = this.f4352d.get(i);
        Objects.requireNonNull(dVar2);
        String str = bVar.f4345c;
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public d e(ViewGroup viewGroup, int i) {
        Context context = this.f4351c;
        int i2 = d.t;
        View inflate = LayoutInflater.from(context).inflate(R.layout.mediapicker_recycler_entry_layout, viewGroup, false);
        return new d(inflate);
    }
}
