package b.r.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class d0 extends e0 {
    public d0(RecyclerView.m mVar) {
        super(mVar, null);
    }

    @Override // b.r.b.e0
    public int b(View view) {
        return this.f1611a.B(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).bottomMargin;
    }

    @Override // b.r.b.e0
    public int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.f1611a.E(view) + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // b.r.b.e0
    public int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.f1611a.F(view) + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // b.r.b.e0
    public int e(View view) {
        return this.f1611a.H(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).topMargin;
    }

    @Override // b.r.b.e0
    public int f() {
        return this.f1611a.q;
    }

    @Override // b.r.b.e0
    public int g() {
        RecyclerView.m mVar = this.f1611a;
        return mVar.q - mVar.M();
    }

    @Override // b.r.b.e0
    public int h() {
        return this.f1611a.M();
    }

    @Override // b.r.b.e0
    public int i() {
        return this.f1611a.o;
    }

    @Override // b.r.b.e0
    public int j() {
        return this.f1611a.n;
    }

    @Override // b.r.b.e0
    public int k() {
        return this.f1611a.P();
    }

    @Override // b.r.b.e0
    public int l() {
        RecyclerView.m mVar = this.f1611a;
        return (mVar.q - mVar.P()) - this.f1611a.M();
    }

    @Override // b.r.b.e0
    public int n(View view) {
        this.f1611a.U(view, true, this.f1613c);
        return this.f1613c.bottom;
    }

    @Override // b.r.b.e0
    public int o(View view) {
        this.f1611a.U(view, true, this.f1613c);
        return this.f1613c.top;
    }

    @Override // b.r.b.e0
    public void p(int i) {
        this.f1611a.b0(i);
    }
}
