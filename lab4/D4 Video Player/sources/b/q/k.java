package b.q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.PreferenceGroup;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<PreferenceGroup.a> {
    @Override // android.os.Parcelable.Creator
    public PreferenceGroup.a createFromParcel(Parcel parcel) {
        return new PreferenceGroup.a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public PreferenceGroup.a[] newArray(int i) {
        return new PreferenceGroup.a[i];
    }
}
