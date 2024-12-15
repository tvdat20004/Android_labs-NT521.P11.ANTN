package b.r.b;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.m f1611a;

    /* renamed from: b, reason: collision with root package name */
    public int f1612b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f1613c = new Rect();

    public e0(RecyclerView.m mVar, c0 c0Var) {
        this.f1611a = mVar;
    }

    public static e0 a(RecyclerView.m mVar, int i) {
        if (i == 0) {
            return new c0(mVar);
        }
        if (i == 1) {
            return new d0(mVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.f1612b) {
            return 0;
        }
        return l() - this.f1612b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);
}
