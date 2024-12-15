package b.r.b;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class q0 extends y {
    public final /* synthetic */ z q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(z zVar, Context context) {
        super(context);
        this.q = zVar;
    }

    @Override // b.r.b.y, androidx.recyclerview.widget.RecyclerView.w
    public void c(View view, RecyclerView.x xVar, m0 m0Var) {
        z zVar = this.q;
        RecyclerView recyclerView = zVar.f1713a;
        if (recyclerView == null) {
            return;
        }
        int[] a2 = zVar.a(recyclerView.getLayoutManager(), view);
        int i = a2[0];
        int i2 = a2[1];
        int ceil = (int) Math.ceil(g(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
        if (ceil > 0) {
            m0Var.b(i, i2, ceil, this.j);
        }
    }

    @Override // b.r.b.y
    public float f(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
