package b.i.a;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* loaded from: classes.dex */
public class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f1340a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(new Handler());
        this.f1340a = cVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        Cursor cursor;
        c cVar = this.f1340a;
        if (!cVar.f1343c || (cursor = cVar.f1344d) == null || cursor.isClosed()) {
            return;
        }
        cVar.f1342b = cVar.f1344d.requery();
    }
}
