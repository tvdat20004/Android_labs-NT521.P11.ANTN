package b.t;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class x0 extends c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1784b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1785c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f1786d;

    public x0(n nVar, ViewGroup viewGroup, View view, View view2) {
        this.f1786d = nVar;
        this.f1783a = viewGroup;
        this.f1784b = view;
        this.f1785c = view2;
    }

    @Override // b.t.c0, b.t.a0
    public void a(b0 b0Var) {
        this.f1783a.getOverlay().remove(this.f1784b);
    }

    @Override // b.t.c0, b.t.a0
    public void b(b0 b0Var) {
        if (this.f1784b.getParent() == null) {
            this.f1783a.getOverlay().add(this.f1784b);
            return;
        }
        n nVar = this.f1786d;
        int size = nVar.n.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                nVar.n.get(size).cancel();
            }
        }
        ArrayList<a0> arrayList = nVar.r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) nVar.r.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((a0) arrayList2.get(i)).d(nVar);
        }
    }

    @Override // b.t.a0
    public void e(b0 b0Var) {
        this.f1785c.setTag(R.id.save_overlay_view, null);
        this.f1783a.getOverlay().remove(this.f1784b);
        b0Var.v(this);
    }
}
