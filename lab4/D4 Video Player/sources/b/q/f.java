package b.q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.MultiSelectListPreference;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<MultiSelectListPreference.a> {
    @Override // android.os.Parcelable.Creator
    public MultiSelectListPreference.a createFromParcel(Parcel parcel) {
        return new MultiSelectListPreference.a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public MultiSelectListPreference.a[] newArray(int i) {
        return new MultiSelectListPreference.a[i];
    }
}
