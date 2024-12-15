package b.r.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class j0 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.m f1637a;

    public j0(RecyclerView.m mVar) {
        this.f1637a = mVar;
    }

    @Override // b.r.b.u0
    public View a(int i) {
        return this.f1637a.x(i);
    }

    @Override // b.r.b.u0
    public int b() {
        RecyclerView.m mVar = this.f1637a;
        return mVar.q - mVar.M();
    }

    @Override // b.r.b.u0
    public int c() {
        return this.f1637a.P();
    }

    @Override // b.r.b.u0
    public int d(View view) {
        return this.f1637a.B(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).bottomMargin;
    }

    @Override // b.r.b.u0
    public int e(View view) {
        return this.f1637a.H(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).topMargin;
    }
}
