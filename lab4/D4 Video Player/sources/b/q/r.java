package b.q;

import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public class r extends b.h.j.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f1582d;

    public r(s sVar) {
        this.f1582d = sVar;
    }

    @Override // b.h.j.b
    public void d(View view, b.h.j.k0.b bVar) {
        Preference i;
        this.f1582d.g.d(view, bVar);
        Objects.requireNonNull(this.f1582d.f1583f);
        RecyclerView.a0 K = RecyclerView.K(view);
        int e2 = K != null ? K.e() : -1;
        RecyclerView.e adapter = this.f1582d.f1583f.getAdapter();
        if ((adapter instanceof o) && (i = ((o) adapter).i(e2)) != null) {
            i.v(bVar);
        }
    }

    @Override // b.h.j.b
    public boolean g(View view, int i, Bundle bundle) {
        return this.f1582d.g.g(view, i, bundle);
    }
}
