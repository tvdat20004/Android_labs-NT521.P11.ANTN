package d.a.a;

import android.view.View;
import android.widget.Button;
import mobi.upod.timedurationpicker.TimeDurationPicker;

/* loaded from: classes.dex */
public class e implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TimeDurationPicker f4292b;

    public e(TimeDurationPicker timeDurationPicker) {
        this.f4292b = timeDurationPicker;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        TimeDurationPicker timeDurationPicker = this.f4292b;
        timeDurationPicker.f4357c.f(((Button) view).getText());
        timeDurationPicker.c();
    }
}
