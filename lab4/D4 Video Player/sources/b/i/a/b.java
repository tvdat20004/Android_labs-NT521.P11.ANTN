package b.i.a;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public class b extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f1341a;

    public b(c cVar) {
        this.f1341a = cVar;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        c cVar = this.f1341a;
        cVar.f1342b = true;
        cVar.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        c cVar = this.f1341a;
        cVar.f1342b = false;
        cVar.notifyDataSetInvalidated();
    }
}
