package b.b.c;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class f implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController f427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f428c;

    public f(h hVar, AlertController alertController) {
        this.f428c = hVar;
        this.f427b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f428c.n.onClick(this.f427b.f51b, i);
        if (this.f428c.r) {
            return;
        }
        this.f427b.f51b.dismiss();
    }
}
