package d.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import mobi.upod.timedurationpicker.TimeDurationPicker;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<TimeDurationPicker.b> {
    @Override // android.os.Parcelable.Creator
    public TimeDurationPicker.b createFromParcel(Parcel parcel) {
        return new TimeDurationPicker.b(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public TimeDurationPicker.b[] newArray(int i) {
        return new TimeDurationPicker.b[i];
    }
}
