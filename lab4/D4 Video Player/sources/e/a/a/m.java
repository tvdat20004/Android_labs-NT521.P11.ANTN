package e.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public class m extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<d> f4316a;

    public m(d dVar) {
        super(Looper.getMainLooper());
        this.f4316a = new WeakReference<>(dVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        d dVar = this.f4316a.get();
        if (dVar == null) {
            return;
        }
        if (message.what == -1) {
            dVar.invalidateSelf();
            return;
        }
        Iterator<a> it = dVar.i.iterator();
        while (it.hasNext()) {
            it.next().a(message.what);
        }
    }
}
