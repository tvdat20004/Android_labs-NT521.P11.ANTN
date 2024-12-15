package b.q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.TwoStatePreference;

/* loaded from: classes.dex */
public final class x implements Parcelable.Creator<TwoStatePreference.a> {
    @Override // android.os.Parcelable.Creator
    public TwoStatePreference.a createFromParcel(Parcel parcel) {
        return new TwoStatePreference.a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public TwoStatePreference.a[] newArray(int i) {
        return new TwoStatePreference.a[i];
    }
}
