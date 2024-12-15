package b.b.i;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public class p1 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f759a;

    public p1(s1 s1Var) {
        this.f759a = s1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            if ((this.f759a.A.getInputMethodMode() == 2) || this.f759a.A.getContentView() == null) {
                return;
            }
            s1 s1Var = this.f759a;
            s1Var.w.removeCallbacks(s1Var.s);
            this.f759a.s.run();
        }
    }
}
