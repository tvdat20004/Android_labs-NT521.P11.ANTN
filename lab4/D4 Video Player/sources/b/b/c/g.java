package b.b.c;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class g implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertController f433c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f434d;

    public g(h hVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f434d = hVar;
        this.f432b = recycleListView;
        this.f433c = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean[] zArr = this.f434d.p;
        if (zArr != null) {
            zArr[i] = this.f432b.isItemChecked(i);
        }
        this.f434d.t.onClick(this.f433c.f51b, i, this.f432b.isItemChecked(i));
    }
}
