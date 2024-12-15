package c.c.a.b.v;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public class f implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f4074b;

    public f(h hVar) {
        this.f4074b = hVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        h hVar = this.f4074b;
        g gVar = (g) message.obj;
        synchronized (hVar.f4076a) {
            if (gVar == null) {
                throw null;
            }
        }
        return true;
    }
}
