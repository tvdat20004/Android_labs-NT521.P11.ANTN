package c.c.a.b.w;

import android.view.View;
import android.widget.AdapterView;
import b.b.i.s1;

/* loaded from: classes.dex */
public class b0 implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f4086b;

    public b0(c0 c0Var) {
        this.f4086b = c0Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object item;
        c0 c0Var = this.f4086b;
        if (i < 0) {
            s1 s1Var = c0Var.f4088e;
            item = !s1Var.b() ? null : s1Var.f790d.getSelectedItem();
        } else {
            item = c0Var.getAdapter().getItem(i);
        }
        c0.a(this.f4086b, item);
        AdapterView.OnItemClickListener onItemClickListener = this.f4086b.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                s1 s1Var2 = this.f4086b.f4088e;
                view = !s1Var2.b() ? null : s1Var2.f790d.getSelectedView();
                s1 s1Var3 = this.f4086b.f4088e;
                i = !s1Var3.b() ? -1 : s1Var3.f790d.getSelectedItemPosition();
                s1 s1Var4 = this.f4086b.f4088e;
                j = !s1Var4.b() ? Long.MIN_VALUE : s1Var4.f790d.getSelectedItemId();
            }
            onItemClickListener.onItemClick(this.f4086b.f4088e.f790d, view, i, j);
        }
        this.f4086b.f4088e.dismiss();
    }
}
