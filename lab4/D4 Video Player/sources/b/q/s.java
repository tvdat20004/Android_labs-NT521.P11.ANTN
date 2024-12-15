package b.q;

import androidx.recyclerview.widget.RecyclerView;
import b.r.b.o0;

@Deprecated
/* loaded from: classes.dex */
public class s extends o0 {

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f1583f;
    public final b.h.j.b g;
    public final b.h.j.b h;

    public s(RecyclerView recyclerView) {
        super(recyclerView);
        this.g = this.f1667e;
        this.h = new r(this);
        this.f1583f = recyclerView;
    }

    @Override // b.r.b.o0
    public b.h.j.b j() {
        return this.h;
    }
}
