package b.b.i;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public class k0 implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f714b;

    public k0(n0 n0Var, r0 r0Var) {
        this.f714b = n0Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f714b.I.setSelection(i);
        if (this.f714b.I.getOnItemClickListener() != null) {
            n0 n0Var = this.f714b;
            n0Var.I.performItemClick(view, i, n0Var.F.getItemId(i));
        }
        this.f714b.dismiss();
    }
}
