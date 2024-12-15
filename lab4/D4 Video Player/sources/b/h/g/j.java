package b.h.g;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

/* loaded from: classes.dex */
public class j implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f1208b;

    public j(o oVar) {
        this.f1208b = oVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            o oVar = this.f1208b;
            synchronized (oVar.f1219a) {
                if (!oVar.f1221c.hasMessages(1)) {
                    oVar.f1220b.quit();
                    oVar.f1220b = null;
                    oVar.f1221c = null;
                }
            }
            return true;
        }
        if (i != 1) {
            return true;
        }
        o oVar2 = this.f1208b;
        Runnable runnable = (Runnable) message.obj;
        Objects.requireNonNull(oVar2);
        runnable.run();
        synchronized (oVar2.f1219a) {
            oVar2.f1221c.removeMessages(0);
            Handler handler = oVar2.f1221c;
            handler.sendMessageDelayed(handler.obtainMessage(0), 10000);
        }
        return true;
    }
}
