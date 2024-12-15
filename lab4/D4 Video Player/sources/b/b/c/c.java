package b.b.c;

import android.os.Message;
import android.view.View;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController f415b;

    public c(AlertController alertController) {
        this.f415b = alertController;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Message message;
        Message message2;
        AlertController alertController = this.f415b;
        Message obtain = ((view != alertController.o || (message2 = alertController.q) == null) && (view != alertController.s || (message2 = alertController.u) == null)) ? (view != alertController.w || (message = alertController.y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
        if (obtain != null) {
            obtain.sendToTarget();
        }
        AlertController alertController2 = this.f415b;
        alertController2.Q.obtainMessage(1, alertController2.f51b).sendToTarget();
    }
}
