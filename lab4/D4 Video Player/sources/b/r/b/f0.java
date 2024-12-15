package b.r.b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b.r.b.c;

/* loaded from: classes.dex */
public class f0 implements c.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1616a;

    public f0(RecyclerView recyclerView) {
        this.f1616a = recyclerView;
    }

    public View a(int i) {
        return this.f1616a.getChildAt(i);
    }

    public int b() {
        return this.f1616a.getChildCount();
    }

    public void c(int i) {
        View childAt = this.f1616a.getChildAt(i);
        if (childAt != null) {
            this.f1616a.p(childAt);
            childAt.clearAnimation();
        }
        this.f1616a.removeViewAt(i);
    }
}
