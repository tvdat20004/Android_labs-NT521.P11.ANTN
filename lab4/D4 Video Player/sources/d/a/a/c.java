package d.a.a;

import android.view.View;
import mobi.upod.timedurationpicker.TimeDurationPicker;

/* loaded from: classes.dex */
public class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TimeDurationPicker f4290b;

    public c(TimeDurationPicker timeDurationPicker) {
        this.f4290b = timeDurationPicker;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        TimeDurationPicker timeDurationPicker = this.f4290b;
        TimeDurationPicker.c cVar = timeDurationPicker.f4357c;
        if (cVar.f4365d.length() > 0) {
            cVar.f4365d.deleteCharAt(r1.length() - 1);
        }
        cVar.e();
        timeDurationPicker.c();
    }
}
