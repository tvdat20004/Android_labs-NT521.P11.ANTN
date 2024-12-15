package d.a.a;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertController;
import b.b.c.k;
import c.c.a.a.q;
import mobi.upod.timedurationpicker.TimeDurationPicker;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class g extends k implements DialogInterface.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public final TimeDurationPicker f4293e;

    /* renamed from: f, reason: collision with root package name */
    public final a f4294f;

    public interface a {
    }

    public g(Context context, a aVar, long j, int i) {
        super(context, 0);
        this.f4294f = aVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.time_duration_picker_dialog, (ViewGroup) null);
        AlertController alertController = this.f454d;
        alertController.h = inflate;
        alertController.i = 0;
        alertController.n = false;
        this.f454d.e(-1, context.getString(android.R.string.ok), this, null, null);
        this.f454d.e(-2, context.getString(android.R.string.cancel), this, null, null);
        TimeDurationPicker timeDurationPicker = (TimeDurationPicker) inflate;
        this.f4293e = timeDurationPicker;
        timeDurationPicker.setDuration(j);
        timeDurationPicker.setTimeUnits(i);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        a aVar;
        if (i == -2) {
            cancel();
            return;
        }
        if (i == -1 && (aVar = this.f4294f) != null) {
            long duration = this.f4293e.getDuration();
            f.a.a.a.b.c.a aVar2 = (f.a.a.a.b.c.a) aVar;
            if (aVar2.h0 == null) {
                d.a.a.a.f("JumpToFragment: player is null! cannot seek to target", new Object[0]);
                return;
            }
            d.a.a.a.e("Jump-TO: user input %d", Long.valueOf(duration));
            if (duration < 0) {
                duration = 0;
            }
            if (duration >= aVar2.h0.getDuration()) {
                duration = aVar2.h0.getDuration();
            }
            d.a.a.a.e("Jump-TO: seeking to %d", Long.valueOf(duration));
            q qVar = (q) aVar2.h0;
            qVar.j(qVar.v(), duration);
            aVar2.h0.c(true);
        }
    }

    @Override // android.app.Dialog
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f4293e.setDuration(bundle.getLong("duration"));
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.putLong("duration", this.f4293e.getDuration());
        return onSaveInstanceState;
    }
}
