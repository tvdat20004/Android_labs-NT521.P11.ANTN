package b.b.i;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public class m1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f739b;

    public m1(s1 s1Var) {
        this.f739b = s1Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        g1 g1Var;
        if (i == -1 || (g1Var = this.f739b.f790d) == null) {
            return;
        }
        g1Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
