package d.a.a;

import android.view.View;
import mobi.upod.timedurationpicker.TimeDurationPicker;

/* loaded from: classes.dex */
public class d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TimeDurationPicker f4291b;

    public d(TimeDurationPicker timeDurationPicker) {
        this.f4291b = timeDurationPicker;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        TimeDurationPicker timeDurationPicker = this.f4291b;
        TimeDurationPicker.c cVar = timeDurationPicker.f4357c;
        cVar.f4365d.setLength(0);
        cVar.e();
        timeDurationPicker.c();
    }
}
