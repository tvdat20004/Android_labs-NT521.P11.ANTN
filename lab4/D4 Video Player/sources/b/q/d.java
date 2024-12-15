package b.q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.ListPreference;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator<ListPreference.a> {
    @Override // android.os.Parcelable.Creator
    public ListPreference.a createFromParcel(Parcel parcel) {
        return new ListPreference.a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public ListPreference.a[] newArray(int i) {
        return new ListPreference.a[i];
    }
}
