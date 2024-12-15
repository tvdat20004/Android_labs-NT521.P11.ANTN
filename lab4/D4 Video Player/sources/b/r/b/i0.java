package b.r.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class i0 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.m f1632a;

    public i0(RecyclerView.m mVar) {
        this.f1632a = mVar;
    }

    @Override // b.r.b.u0
    public View a(int i) {
        return this.f1632a.x(i);
    }

    @Override // b.r.b.u0
    public int b() {
        RecyclerView.m mVar = this.f1632a;
        return mVar.p - mVar.O();
    }

    @Override // b.r.b.u0
    public int c() {
        return this.f1632a.N();
    }

    @Override // b.r.b.u0
    public int d(View view) {
        return this.f1632a.G(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).rightMargin;
    }

    @Override // b.r.b.u0
    public int e(View view) {
        return this.f1632a.D(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).leftMargin;
    }
}
